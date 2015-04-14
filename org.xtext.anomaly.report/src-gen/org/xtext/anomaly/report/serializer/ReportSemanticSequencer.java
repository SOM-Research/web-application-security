package org.xtext.anomaly.report.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.anomaly.report.report.Anomaly;
import org.xtext.anomaly.report.report.Model;
import org.xtext.anomaly.report.report.ReportPackage;
import org.xtext.anomaly.report.services.ReportGrammarAccess;

@SuppressWarnings("all")
public class ReportSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReportGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ReportPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ReportPackage.ANOMALY:
				if(context == grammarAccess.getAnomalyRule()) {
					sequence_Anomaly(context, (Anomaly) semanticObject); 
					return; 
				}
				else break;
			case ReportPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING descr=STRING)
	 */
	protected void sequence_Anomaly(EObject context, Anomaly semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.ANOMALY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.ANOMALY__NAME));
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.ANOMALY__DESCR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.ANOMALY__DESCR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnomalyAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAnomalyAccess().getDescrSTRINGTerminalRuleCall_3_0(), semanticObject.getDescr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     anomalies+=Anomaly*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
