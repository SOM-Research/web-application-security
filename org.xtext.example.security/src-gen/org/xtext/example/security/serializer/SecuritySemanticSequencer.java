package org.xtext.example.security.serializer;

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
import org.xtext.example.security.security.AuthConstraint;
import org.xtext.example.security.security.DisplayName;
import org.xtext.example.security.security.HttpMethod;
import org.xtext.example.security.security.Identifier;
import org.xtext.example.security.security.RoleName;
import org.xtext.example.security.security.Security;
import org.xtext.example.security.security.SecurityConstraint;
import org.xtext.example.security.security.SecurityPackage;
import org.xtext.example.security.security.SecurityRole;
import org.xtext.example.security.security.TransportGuarantee;
import org.xtext.example.security.security.UrlPattern;
import org.xtext.example.security.security.UserDataConstraint;
import org.xtext.example.security.security.WebResourceCollection;
import org.xtext.example.security.services.SecurityGrammarAccess;

@SuppressWarnings("all")
public class SecuritySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SecurityGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SecurityPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SecurityPackage.AUTH_CONSTRAINT:
				if(context == grammarAccess.getAuthConstraintRule()) {
					sequence_AuthConstraint(context, (AuthConstraint) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.DISPLAY_NAME:
				if(context == grammarAccess.getDisplayNameRule()) {
					sequence_DisplayName(context, (DisplayName) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.HTTP_METHOD:
				if(context == grammarAccess.getHttpMethodRule()) {
					sequence_HttpMethod(context, (HttpMethod) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.IDENTIFIER:
				if(context == grammarAccess.getIdentifierRule()) {
					sequence_Identifier(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.ROLE_NAME:
				if(context == grammarAccess.getRoleNameRule()) {
					sequence_RoleName(context, (RoleName) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY:
				if(context == grammarAccess.getSecurityRule()) {
					sequence_Security(context, (Security) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_CONSTRAINT:
				if(context == grammarAccess.getSecurityConstraintRule()) {
					sequence_SecurityConstraint(context, (SecurityConstraint) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.SECURITY_ROLE:
				if(context == grammarAccess.getSecurityRoleRule()) {
					sequence_SecurityRole(context, (SecurityRole) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.TRANSPORT_GUARANTEE:
				if(context == grammarAccess.getTransportGuaranteeRule()) {
					sequence_TransportGuarantee(context, (TransportGuarantee) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.URL_PATTERN:
				if(context == grammarAccess.getUrlPatternRule()) {
					sequence_UrlPattern(context, (UrlPattern) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.USER_DATA_CONSTRAINT:
				if(context == grammarAccess.getUserDataConstraintRule()) {
					sequence_UserDataConstraint(context, (UserDataConstraint) semanticObject); 
					return; 
				}
				else break;
			case SecurityPackage.WEB_RESOURCE_COLLECTION:
				if(context == grammarAccess.getWebResourceCollectionRule()) {
					sequence_WebResourceCollection(context, (WebResourceCollection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (roleName+=RoleName* id=Identifier?)
	 */
	protected void sequence_AuthConstraint(EObject context, AuthConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_DisplayName(EObject context, DisplayName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.DISPLAY_NAME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.DISPLAY_NAME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDisplayNameAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (omission?='omission' name=STRING)
	 */
	protected void sequence_HttpMethod(EObject context, HttpMethod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.HTTP_METHOD__OMISSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.HTTP_METHOD__OMISSION));
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.HTTP_METHOD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.HTTP_METHOD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHttpMethodAccess().getOmissionOmissionKeyword_1_0(), semanticObject.isOmission());
		feeder.accept(grammarAccess.getHttpMethodAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Identifier(EObject context, Identifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.IDENTIFIER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.IDENTIFIER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=[SecurityRole|ID]
	 */
	protected void sequence_RoleName(EObject context, RoleName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.ROLE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.ROLE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoleNameAccess().getNameSecurityRoleIDTerminalRuleCall_1_0_1(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         displayName+=DisplayName* 
	 *         webResourceCollection+=WebResourceCollection+ 
	 *         authConstraint=AuthConstraint? 
	 *         userDataConstraint=UserDataConstraint? 
	 *         id=Identifier?
	 *     )
	 */
	protected void sequence_SecurityConstraint(EObject context, SecurityConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_SecurityRole(EObject context, SecurityRole semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.SECURITY_ROLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.SECURITY_ROLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSecurityRoleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (role+=SecurityRole* constraint+=SecurityConstraint*)
	 */
	protected void sequence_Security(EObject context, Security semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     restriction=RestrictionType
	 */
	protected void sequence_TransportGuarantee(EObject context, TransportGuarantee semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.TRANSPORT_GUARANTEE__RESTRICTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.TRANSPORT_GUARANTEE__RESTRICTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransportGuaranteeAccess().getRestrictionRestrictionTypeEnumRuleCall_1_0(), semanticObject.getRestriction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_UrlPattern(EObject context, UrlPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SecurityPackage.Literals.URL_PATTERN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecurityPackage.Literals.URL_PATTERN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUrlPatternAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (transportGuarantee=TransportGuarantee id=Identifier?)
	 */
	protected void sequence_UserDataConstraint(EObject context, UserDataConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (webResourceName=STRING urlPattern+=UrlPattern* httpMethod+=HttpMethod* id=Identifier?)
	 */
	protected void sequence_WebResourceCollection(EObject context, WebResourceCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
