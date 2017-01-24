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
import org.xtext.anomaly.report.report.Completeness;
import org.xtext.anomaly.report.report.Reachability;
import org.xtext.anomaly.report.report.Redundancy;
import org.xtext.anomaly.report.report.Report;
import org.xtext.anomaly.report.report.ReportPackage;
import org.xtext.anomaly.report.report.Shadowing;
import org.xtext.anomaly.report.report.Syntactical;
import org.xtext.anomaly.report.services.ReportGrammarAccess;

@SuppressWarnings("all")
public class ReportSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ReportGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ReportPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ReportPackage.COMPLETENESS:
				if(context == grammarAccess.getAnomalyRule() ||
				   context == grammarAccess.getCompletenessRule()) {
					sequence_Completeness(context, (Completeness) semanticObject); 
					return; 
				}
				else break;
			case ReportPackage.REACHABILITY:
				if(context == grammarAccess.getAnomalyRule() ||
				   context == grammarAccess.getReachabilityRule()) {
					sequence_Reachability(context, (Reachability) semanticObject); 
					return; 
				}
				else break;
			case ReportPackage.REDUNDANCY:
				if(context == grammarAccess.getAnomalyRule() ||
				   context == grammarAccess.getRedundancyRule()) {
					sequence_Redundancy(context, (Redundancy) semanticObject); 
					return; 
				}
				else break;
			case ReportPackage.REPORT:
				if(context == grammarAccess.getReportRule()) {
					sequence_Report(context, (Report) semanticObject); 
					return; 
				}
				else break;
			case ReportPackage.SHADOWING:
				if(context == grammarAccess.getAnomalyRule() ||
				   context == grammarAccess.getShadowingRule()) {
					sequence_Shadowing(context, (Shadowing) semanticObject); 
					return; 
				}
				else break;
			case ReportPackage.SYNTACTICAL:
				if(context == grammarAccess.getAnomalyRule() ||
				   context == grammarAccess.getSyntacticalRule()) {
					sequence_Syntactical(context, (Syntactical) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (description=STRING missedMethod+=[EObject|EString]+ securityConstraint=[EObject|EString])
	 */
	protected void sequence_Completeness(EObject context, Completeness semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=STRING unreachableResources+=[EObject|EString]+)
	 */
	protected void sequence_Reachability(EObject context, Reachability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=STRING containing=[EObject|EString] contained=[EObject|EString])
	 */
	protected void sequence_Redundancy(EObject context, Redundancy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.ANOMALY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.ANOMALY__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.REDUNDANCY__CONTAINING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.REDUNDANCY__CONTAINING));
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.REDUNDANCY__CONTAINED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.REDUNDANCY__CONTAINED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRedundancyAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getRedundancyAccess().getContainingEObjectEStringParserRuleCall_2_0_1(), semanticObject.getContaining());
		feeder.accept(grammarAccess.getRedundancyAccess().getContainedEObjectEStringParserRuleCall_3_0_1(), semanticObject.getContained());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     anomalies+=Anomaly*
	 */
	protected void sequence_Report(EObject context, Report semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (description=STRING shadowing=[EObject|EString] shadowed=[EObject|EString])
	 */
	protected void sequence_Shadowing(EObject context, Shadowing semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.ANOMALY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.ANOMALY__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.SHADOWING__SHADOWING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.SHADOWING__SHADOWING));
			if(transientValues.isValueTransient(semanticObject, ReportPackage.Literals.SHADOWING__SHADOWED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ReportPackage.Literals.SHADOWING__SHADOWED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShadowingAccess().getDescriptionSTRINGTerminalRuleCall_1_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getShadowingAccess().getShadowingEObjectEStringParserRuleCall_2_0_1(), semanticObject.getShadowing());
		feeder.accept(grammarAccess.getShadowingAccess().getShadowedEObjectEStringParserRuleCall_3_0_1(), semanticObject.getShadowed());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (description=STRING missedRoles+=[EObject|EString]+)
	 */
	protected void sequence_Syntactical(EObject context, Syntactical semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
