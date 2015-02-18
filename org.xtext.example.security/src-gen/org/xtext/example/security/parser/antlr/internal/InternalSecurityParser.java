package org.xtext.example.security.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.security.services.SecurityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'security-role'", "'security-constraint\\r\\n    {'", "'}'", "'display-name'", "'web-resource-collection'", "'{'", "'web-resource-name'", "'url-pattern'", "'http-method'", "'omission'", "'auth-constraint'", "'role-name'", "'user-data-constraint'", "'transport-guarantee'", "'NONE'", "'INTEGRAL'", "'CONFIDENTIAL'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSecurityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecurityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecurityParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g"; }



     	private SecurityGrammarAccess grammarAccess;
     	
        public InternalSecurityParser(TokenStream input, SecurityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Security";	
       	}
       	
       	@Override
       	protected SecurityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSecurity"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:68:1: entryRuleSecurity returns [EObject current=null] : iv_ruleSecurity= ruleSecurity EOF ;
    public final EObject entryRuleSecurity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurity = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:69:2: (iv_ruleSecurity= ruleSecurity EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:70:2: iv_ruleSecurity= ruleSecurity EOF
            {
             newCompositeNode(grammarAccess.getSecurityRule()); 
            pushFollow(FOLLOW_ruleSecurity_in_entryRuleSecurity75);
            iv_ruleSecurity=ruleSecurity();

            state._fsp--;

             current =iv_ruleSecurity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurity85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecurity"


    // $ANTLR start "ruleSecurity"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:77:1: ruleSecurity returns [EObject current=null] : ( ( (lv_role_0_0= ruleSecurityRole ) )* ( (lv_constraint_1_0= ruleSecurityConstraint ) )* ) ;
    public final EObject ruleSecurity() throws RecognitionException {
        EObject current = null;

        EObject lv_role_0_0 = null;

        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:80:28: ( ( ( (lv_role_0_0= ruleSecurityRole ) )* ( (lv_constraint_1_0= ruleSecurityConstraint ) )* ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:81:1: ( ( (lv_role_0_0= ruleSecurityRole ) )* ( (lv_constraint_1_0= ruleSecurityConstraint ) )* )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:81:1: ( ( (lv_role_0_0= ruleSecurityRole ) )* ( (lv_constraint_1_0= ruleSecurityConstraint ) )* )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:81:2: ( (lv_role_0_0= ruleSecurityRole ) )* ( (lv_constraint_1_0= ruleSecurityConstraint ) )*
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:81:2: ( (lv_role_0_0= ruleSecurityRole ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:82:1: (lv_role_0_0= ruleSecurityRole )
            	    {
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:82:1: (lv_role_0_0= ruleSecurityRole )
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:83:3: lv_role_0_0= ruleSecurityRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityAccess().getRoleSecurityRoleParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSecurityRole_in_ruleSecurity131);
            	    lv_role_0_0=ruleSecurityRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"role",
            	            		lv_role_0_0, 
            	            		"SecurityRole");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:99:3: ( (lv_constraint_1_0= ruleSecurityConstraint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:100:1: (lv_constraint_1_0= ruleSecurityConstraint )
            	    {
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:100:1: (lv_constraint_1_0= ruleSecurityConstraint )
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:101:3: lv_constraint_1_0= ruleSecurityConstraint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityAccess().getConstraintSecurityConstraintParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSecurityConstraint_in_ruleSecurity153);
            	    lv_constraint_1_0=ruleSecurityConstraint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constraint",
            	            		lv_constraint_1_0, 
            	            		"SecurityConstraint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecurity"


    // $ANTLR start "entryRuleSecurityRole"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:125:1: entryRuleSecurityRole returns [EObject current=null] : iv_ruleSecurityRole= ruleSecurityRole EOF ;
    public final EObject entryRuleSecurityRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityRole = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:126:2: (iv_ruleSecurityRole= ruleSecurityRole EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:127:2: iv_ruleSecurityRole= ruleSecurityRole EOF
            {
             newCompositeNode(grammarAccess.getSecurityRoleRule()); 
            pushFollow(FOLLOW_ruleSecurityRole_in_entryRuleSecurityRole190);
            iv_ruleSecurityRole=ruleSecurityRole();

            state._fsp--;

             current =iv_ruleSecurityRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityRole200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecurityRole"


    // $ANTLR start "ruleSecurityRole"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:134:1: ruleSecurityRole returns [EObject current=null] : (otherlv_0= 'security-role' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSecurityRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:137:28: ( (otherlv_0= 'security-role' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:138:1: (otherlv_0= 'security-role' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:138:1: (otherlv_0= 'security-role' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:138:3: otherlv_0= 'security-role' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSecurityRole237); 

                	newLeafNode(otherlv_0, grammarAccess.getSecurityRoleAccess().getSecurityRoleKeyword_0());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:143:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSecurityRole254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSecurityRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSecurityRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecurityRole"


    // $ANTLR start "entryRuleSecurityConstraint"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:168:1: entryRuleSecurityConstraint returns [EObject current=null] : iv_ruleSecurityConstraint= ruleSecurityConstraint EOF ;
    public final EObject entryRuleSecurityConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityConstraint = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:169:2: (iv_ruleSecurityConstraint= ruleSecurityConstraint EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:170:2: iv_ruleSecurityConstraint= ruleSecurityConstraint EOF
            {
             newCompositeNode(grammarAccess.getSecurityConstraintRule()); 
            pushFollow(FOLLOW_ruleSecurityConstraint_in_entryRuleSecurityConstraint295);
            iv_ruleSecurityConstraint=ruleSecurityConstraint();

            state._fsp--;

             current =iv_ruleSecurityConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityConstraint305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecurityConstraint"


    // $ANTLR start "ruleSecurityConstraint"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:177:1: ruleSecurityConstraint returns [EObject current=null] : (otherlv_0= 'security-constraint\\r\\n {' ( (lv_displayName_1_0= ruleDisplayName ) )* ( (lv_webResourceCollection_2_0= ruleWebResourceCollection ) )+ ( (lv_authConstraint_3_0= ruleAuthConstraint ) )? ( (lv_userDataConstraint_4_0= ruleUserDataConstraint ) )? ( (lv_id_5_0= ruleIdentifier ) )? otherlv_6= '}' ) ;
    public final EObject ruleSecurityConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        EObject lv_displayName_1_0 = null;

        EObject lv_webResourceCollection_2_0 = null;

        EObject lv_authConstraint_3_0 = null;

        EObject lv_userDataConstraint_4_0 = null;

        EObject lv_id_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:180:28: ( (otherlv_0= 'security-constraint\\r\\n {' ( (lv_displayName_1_0= ruleDisplayName ) )* ( (lv_webResourceCollection_2_0= ruleWebResourceCollection ) )+ ( (lv_authConstraint_3_0= ruleAuthConstraint ) )? ( (lv_userDataConstraint_4_0= ruleUserDataConstraint ) )? ( (lv_id_5_0= ruleIdentifier ) )? otherlv_6= '}' ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:181:1: (otherlv_0= 'security-constraint\\r\\n {' ( (lv_displayName_1_0= ruleDisplayName ) )* ( (lv_webResourceCollection_2_0= ruleWebResourceCollection ) )+ ( (lv_authConstraint_3_0= ruleAuthConstraint ) )? ( (lv_userDataConstraint_4_0= ruleUserDataConstraint ) )? ( (lv_id_5_0= ruleIdentifier ) )? otherlv_6= '}' )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:181:1: (otherlv_0= 'security-constraint\\r\\n {' ( (lv_displayName_1_0= ruleDisplayName ) )* ( (lv_webResourceCollection_2_0= ruleWebResourceCollection ) )+ ( (lv_authConstraint_3_0= ruleAuthConstraint ) )? ( (lv_userDataConstraint_4_0= ruleUserDataConstraint ) )? ( (lv_id_5_0= ruleIdentifier ) )? otherlv_6= '}' )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:181:3: otherlv_0= 'security-constraint\\r\\n {' ( (lv_displayName_1_0= ruleDisplayName ) )* ( (lv_webResourceCollection_2_0= ruleWebResourceCollection ) )+ ( (lv_authConstraint_3_0= ruleAuthConstraint ) )? ( (lv_userDataConstraint_4_0= ruleUserDataConstraint ) )? ( (lv_id_5_0= ruleIdentifier ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSecurityConstraint342); 

                	newLeafNode(otherlv_0, grammarAccess.getSecurityConstraintAccess().getSecurityConstraintKeyword_0());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:185:1: ( (lv_displayName_1_0= ruleDisplayName ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:186:1: (lv_displayName_1_0= ruleDisplayName )
            	    {
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:186:1: (lv_displayName_1_0= ruleDisplayName )
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:187:3: lv_displayName_1_0= ruleDisplayName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityConstraintAccess().getDisplayNameDisplayNameParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDisplayName_in_ruleSecurityConstraint363);
            	    lv_displayName_1_0=ruleDisplayName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"displayName",
            	            		lv_displayName_1_0, 
            	            		"DisplayName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:203:3: ( (lv_webResourceCollection_2_0= ruleWebResourceCollection ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:204:1: (lv_webResourceCollection_2_0= ruleWebResourceCollection )
            	    {
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:204:1: (lv_webResourceCollection_2_0= ruleWebResourceCollection )
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:205:3: lv_webResourceCollection_2_0= ruleWebResourceCollection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSecurityConstraintAccess().getWebResourceCollectionWebResourceCollectionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWebResourceCollection_in_ruleSecurityConstraint385);
            	    lv_webResourceCollection_2_0=ruleWebResourceCollection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSecurityConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"webResourceCollection",
            	            		lv_webResourceCollection_2_0, 
            	            		"WebResourceCollection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:221:3: ( (lv_authConstraint_3_0= ruleAuthConstraint ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:222:1: (lv_authConstraint_3_0= ruleAuthConstraint )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:222:1: (lv_authConstraint_3_0= ruleAuthConstraint )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:223:3: lv_authConstraint_3_0= ruleAuthConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getSecurityConstraintAccess().getAuthConstraintAuthConstraintParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAuthConstraint_in_ruleSecurityConstraint407);
                    lv_authConstraint_3_0=ruleAuthConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSecurityConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"authConstraint",
                            		lv_authConstraint_3_0, 
                            		"AuthConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:239:3: ( (lv_userDataConstraint_4_0= ruleUserDataConstraint ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:240:1: (lv_userDataConstraint_4_0= ruleUserDataConstraint )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:240:1: (lv_userDataConstraint_4_0= ruleUserDataConstraint )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:241:3: lv_userDataConstraint_4_0= ruleUserDataConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getSecurityConstraintAccess().getUserDataConstraintUserDataConstraintParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUserDataConstraint_in_ruleSecurityConstraint429);
                    lv_userDataConstraint_4_0=ruleUserDataConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSecurityConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"userDataConstraint",
                            		lv_userDataConstraint_4_0, 
                            		"UserDataConstraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:257:3: ( (lv_id_5_0= ruleIdentifier ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:258:1: (lv_id_5_0= ruleIdentifier )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:258:1: (lv_id_5_0= ruleIdentifier )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:259:3: lv_id_5_0= ruleIdentifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getSecurityConstraintAccess().getIdIdentifierParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleSecurityConstraint451);
                    lv_id_5_0=ruleIdentifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSecurityConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_5_0, 
                            		"Identifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleSecurityConstraint464); 

                	newLeafNode(otherlv_6, grammarAccess.getSecurityConstraintAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecurityConstraint"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:287:1: entryRuleIdentifier returns [EObject current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final EObject entryRuleIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifier = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:288:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:289:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
             newCompositeNode(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier500);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;

             current =iv_ruleIdentifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:296:1: ruleIdentifier returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:299:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:300:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:300:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:301:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:301:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:302:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier551); 

            			newLeafNode(lv_name_0_0, grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIdentifierRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleDisplayName"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:326:1: entryRuleDisplayName returns [EObject current=null] : iv_ruleDisplayName= ruleDisplayName EOF ;
    public final EObject entryRuleDisplayName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayName = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:327:2: (iv_ruleDisplayName= ruleDisplayName EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:328:2: iv_ruleDisplayName= ruleDisplayName EOF
            {
             newCompositeNode(grammarAccess.getDisplayNameRule()); 
            pushFollow(FOLLOW_ruleDisplayName_in_entryRuleDisplayName591);
            iv_ruleDisplayName=ruleDisplayName();

            state._fsp--;

             current =iv_ruleDisplayName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayName601); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisplayName"


    // $ANTLR start "ruleDisplayName"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:335:1: ruleDisplayName returns [EObject current=null] : (otherlv_0= 'display-name' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDisplayName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:338:28: ( (otherlv_0= 'display-name' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:339:1: (otherlv_0= 'display-name' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:339:1: (otherlv_0= 'display-name' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:339:3: otherlv_0= 'display-name' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDisplayName638); 

                	newLeafNode(otherlv_0, grammarAccess.getDisplayNameAccess().getDisplayNameKeyword_0());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:343:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:344:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:344:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:345:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDisplayName655); 

            			newLeafNode(lv_value_1_0, grammarAccess.getDisplayNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDisplayNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisplayName"


    // $ANTLR start "entryRuleWebResourceCollection"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:369:1: entryRuleWebResourceCollection returns [EObject current=null] : iv_ruleWebResourceCollection= ruleWebResourceCollection EOF ;
    public final EObject entryRuleWebResourceCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebResourceCollection = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:370:2: (iv_ruleWebResourceCollection= ruleWebResourceCollection EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:371:2: iv_ruleWebResourceCollection= ruleWebResourceCollection EOF
            {
             newCompositeNode(grammarAccess.getWebResourceCollectionRule()); 
            pushFollow(FOLLOW_ruleWebResourceCollection_in_entryRuleWebResourceCollection696);
            iv_ruleWebResourceCollection=ruleWebResourceCollection();

            state._fsp--;

             current =iv_ruleWebResourceCollection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebResourceCollection706); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebResourceCollection"


    // $ANTLR start "ruleWebResourceCollection"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:378:1: ruleWebResourceCollection returns [EObject current=null] : (otherlv_0= 'web-resource-collection' otherlv_1= '{' otherlv_2= 'web-resource-name' ( (lv_webResourceName_3_0= RULE_STRING ) ) ( (lv_urlPattern_4_0= ruleUrlPattern ) )* ( (lv_httpMethod_5_0= ruleHttpMethod ) )* ( (lv_id_6_0= ruleIdentifier ) )? otherlv_7= '}' ) ;
    public final EObject ruleWebResourceCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_webResourceName_3_0=null;
        Token otherlv_7=null;
        EObject lv_urlPattern_4_0 = null;

        EObject lv_httpMethod_5_0 = null;

        EObject lv_id_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:381:28: ( (otherlv_0= 'web-resource-collection' otherlv_1= '{' otherlv_2= 'web-resource-name' ( (lv_webResourceName_3_0= RULE_STRING ) ) ( (lv_urlPattern_4_0= ruleUrlPattern ) )* ( (lv_httpMethod_5_0= ruleHttpMethod ) )* ( (lv_id_6_0= ruleIdentifier ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:382:1: (otherlv_0= 'web-resource-collection' otherlv_1= '{' otherlv_2= 'web-resource-name' ( (lv_webResourceName_3_0= RULE_STRING ) ) ( (lv_urlPattern_4_0= ruleUrlPattern ) )* ( (lv_httpMethod_5_0= ruleHttpMethod ) )* ( (lv_id_6_0= ruleIdentifier ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:382:1: (otherlv_0= 'web-resource-collection' otherlv_1= '{' otherlv_2= 'web-resource-name' ( (lv_webResourceName_3_0= RULE_STRING ) ) ( (lv_urlPattern_4_0= ruleUrlPattern ) )* ( (lv_httpMethod_5_0= ruleHttpMethod ) )* ( (lv_id_6_0= ruleIdentifier ) )? otherlv_7= '}' )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:382:3: otherlv_0= 'web-resource-collection' otherlv_1= '{' otherlv_2= 'web-resource-name' ( (lv_webResourceName_3_0= RULE_STRING ) ) ( (lv_urlPattern_4_0= ruleUrlPattern ) )* ( (lv_httpMethod_5_0= ruleHttpMethod ) )* ( (lv_id_6_0= ruleIdentifier ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleWebResourceCollection743); 

                	newLeafNode(otherlv_0, grammarAccess.getWebResourceCollectionAccess().getWebResourceCollectionKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleWebResourceCollection755); 

                	newLeafNode(otherlv_1, grammarAccess.getWebResourceCollectionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleWebResourceCollection767); 

                	newLeafNode(otherlv_2, grammarAccess.getWebResourceCollectionAccess().getWebResourceNameKeyword_2());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:394:1: ( (lv_webResourceName_3_0= RULE_STRING ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:395:1: (lv_webResourceName_3_0= RULE_STRING )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:395:1: (lv_webResourceName_3_0= RULE_STRING )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:396:3: lv_webResourceName_3_0= RULE_STRING
            {
            lv_webResourceName_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWebResourceCollection784); 

            			newLeafNode(lv_webResourceName_3_0, grammarAccess.getWebResourceCollectionAccess().getWebResourceNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWebResourceCollectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"webResourceName",
                    		lv_webResourceName_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:412:2: ( (lv_urlPattern_4_0= ruleUrlPattern ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:413:1: (lv_urlPattern_4_0= ruleUrlPattern )
            	    {
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:413:1: (lv_urlPattern_4_0= ruleUrlPattern )
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:414:3: lv_urlPattern_4_0= ruleUrlPattern
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWebResourceCollectionAccess().getUrlPatternUrlPatternParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUrlPattern_in_ruleWebResourceCollection810);
            	    lv_urlPattern_4_0=ruleUrlPattern();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWebResourceCollectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"urlPattern",
            	            		lv_urlPattern_4_0, 
            	            		"UrlPattern");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:430:3: ( (lv_httpMethod_5_0= ruleHttpMethod ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:431:1: (lv_httpMethod_5_0= ruleHttpMethod )
            	    {
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:431:1: (lv_httpMethod_5_0= ruleHttpMethod )
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:432:3: lv_httpMethod_5_0= ruleHttpMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWebResourceCollectionAccess().getHttpMethodHttpMethodParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHttpMethod_in_ruleWebResourceCollection832);
            	    lv_httpMethod_5_0=ruleHttpMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWebResourceCollectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"httpMethod",
            	            		lv_httpMethod_5_0, 
            	            		"HttpMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:448:3: ( (lv_id_6_0= ruleIdentifier ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:449:1: (lv_id_6_0= ruleIdentifier )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:449:1: (lv_id_6_0= ruleIdentifier )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:450:3: lv_id_6_0= ruleIdentifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getWebResourceCollectionAccess().getIdIdentifierParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleWebResourceCollection854);
                    lv_id_6_0=ruleIdentifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWebResourceCollectionRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_6_0, 
                            		"Identifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleWebResourceCollection867); 

                	newLeafNode(otherlv_7, grammarAccess.getWebResourceCollectionAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebResourceCollection"


    // $ANTLR start "entryRuleUrlPattern"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:478:1: entryRuleUrlPattern returns [EObject current=null] : iv_ruleUrlPattern= ruleUrlPattern EOF ;
    public final EObject entryRuleUrlPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlPattern = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:479:2: (iv_ruleUrlPattern= ruleUrlPattern EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:480:2: iv_ruleUrlPattern= ruleUrlPattern EOF
            {
             newCompositeNode(grammarAccess.getUrlPatternRule()); 
            pushFollow(FOLLOW_ruleUrlPattern_in_entryRuleUrlPattern903);
            iv_ruleUrlPattern=ruleUrlPattern();

            state._fsp--;

             current =iv_ruleUrlPattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlPattern913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUrlPattern"


    // $ANTLR start "ruleUrlPattern"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:487:1: ruleUrlPattern returns [EObject current=null] : (otherlv_0= 'url-pattern' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleUrlPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:490:28: ( (otherlv_0= 'url-pattern' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:491:1: (otherlv_0= 'url-pattern' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:491:1: (otherlv_0= 'url-pattern' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:491:3: otherlv_0= 'url-pattern' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleUrlPattern950); 

                	newLeafNode(otherlv_0, grammarAccess.getUrlPatternAccess().getUrlPatternKeyword_0());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:495:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:496:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:496:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:497:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUrlPattern967); 

            			newLeafNode(lv_value_1_0, grammarAccess.getUrlPatternAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUrlPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUrlPattern"


    // $ANTLR start "entryRuleHttpMethod"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:521:1: entryRuleHttpMethod returns [EObject current=null] : iv_ruleHttpMethod= ruleHttpMethod EOF ;
    public final EObject entryRuleHttpMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHttpMethod = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:522:2: (iv_ruleHttpMethod= ruleHttpMethod EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:523:2: iv_ruleHttpMethod= ruleHttpMethod EOF
            {
             newCompositeNode(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod1008);
            iv_ruleHttpMethod=ruleHttpMethod();

            state._fsp--;

             current =iv_ruleHttpMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod1018); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHttpMethod"


    // $ANTLR start "ruleHttpMethod"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:530:1: ruleHttpMethod returns [EObject current=null] : (otherlv_0= 'http-method' ( (lv_omission_1_0= 'omission' ) ) ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleHttpMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_omission_1_0=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:533:28: ( (otherlv_0= 'http-method' ( (lv_omission_1_0= 'omission' ) ) ( (lv_name_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:534:1: (otherlv_0= 'http-method' ( (lv_omission_1_0= 'omission' ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:534:1: (otherlv_0= 'http-method' ( (lv_omission_1_0= 'omission' ) ) ( (lv_name_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:534:3: otherlv_0= 'http-method' ( (lv_omission_1_0= 'omission' ) ) ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleHttpMethod1055); 

                	newLeafNode(otherlv_0, grammarAccess.getHttpMethodAccess().getHttpMethodKeyword_0());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:538:1: ( (lv_omission_1_0= 'omission' ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:539:1: (lv_omission_1_0= 'omission' )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:539:1: (lv_omission_1_0= 'omission' )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:540:3: lv_omission_1_0= 'omission'
            {
            lv_omission_1_0=(Token)match(input,20,FOLLOW_20_in_ruleHttpMethod1073); 

                    newLeafNode(lv_omission_1_0, grammarAccess.getHttpMethodAccess().getOmissionOmissionKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpMethodRule());
            	        }
                   		setWithLastConsumed(current, "omission", true, "omission");
            	    

            }


            }

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:553:2: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:554:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:554:1: (lv_name_2_0= RULE_STRING )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:555:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHttpMethod1103); 

            			newLeafNode(lv_name_2_0, grammarAccess.getHttpMethodAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHttpMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHttpMethod"


    // $ANTLR start "entryRuleAuthConstraint"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:579:1: entryRuleAuthConstraint returns [EObject current=null] : iv_ruleAuthConstraint= ruleAuthConstraint EOF ;
    public final EObject entryRuleAuthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthConstraint = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:580:2: (iv_ruleAuthConstraint= ruleAuthConstraint EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:581:2: iv_ruleAuthConstraint= ruleAuthConstraint EOF
            {
             newCompositeNode(grammarAccess.getAuthConstraintRule()); 
            pushFollow(FOLLOW_ruleAuthConstraint_in_entryRuleAuthConstraint1144);
            iv_ruleAuthConstraint=ruleAuthConstraint();

            state._fsp--;

             current =iv_ruleAuthConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthConstraint1154); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthConstraint"


    // $ANTLR start "ruleAuthConstraint"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:588:1: ruleAuthConstraint returns [EObject current=null] : (otherlv_0= 'auth-constraint' otherlv_1= '{' ( (lv_roleName_2_0= ruleRoleName ) )* ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' ) ;
    public final EObject ruleAuthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_roleName_2_0 = null;

        EObject lv_id_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:591:28: ( (otherlv_0= 'auth-constraint' otherlv_1= '{' ( (lv_roleName_2_0= ruleRoleName ) )* ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:592:1: (otherlv_0= 'auth-constraint' otherlv_1= '{' ( (lv_roleName_2_0= ruleRoleName ) )* ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:592:1: (otherlv_0= 'auth-constraint' otherlv_1= '{' ( (lv_roleName_2_0= ruleRoleName ) )* ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:592:3: otherlv_0= 'auth-constraint' otherlv_1= '{' ( (lv_roleName_2_0= ruleRoleName ) )* ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAuthConstraint1191); 

                	newLeafNode(otherlv_0, grammarAccess.getAuthConstraintAccess().getAuthConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAuthConstraint1203); 

                	newLeafNode(otherlv_1, grammarAccess.getAuthConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:600:1: ( (lv_roleName_2_0= ruleRoleName ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:601:1: (lv_roleName_2_0= ruleRoleName )
            	    {
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:601:1: (lv_roleName_2_0= ruleRoleName )
            	    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:602:3: lv_roleName_2_0= ruleRoleName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAuthConstraintAccess().getRoleNameRoleNameParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRoleName_in_ruleAuthConstraint1224);
            	    lv_roleName_2_0=ruleRoleName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAuthConstraintRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roleName",
            	            		lv_roleName_2_0, 
            	            		"RoleName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:618:3: ( (lv_id_3_0= ruleIdentifier ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:619:1: (lv_id_3_0= ruleIdentifier )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:619:1: (lv_id_3_0= ruleIdentifier )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:620:3: lv_id_3_0= ruleIdentifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getAuthConstraintAccess().getIdIdentifierParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleAuthConstraint1246);
                    lv_id_3_0=ruleIdentifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAuthConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"Identifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAuthConstraint1259); 

                	newLeafNode(otherlv_4, grammarAccess.getAuthConstraintAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthConstraint"


    // $ANTLR start "entryRuleRoleName"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:648:1: entryRuleRoleName returns [EObject current=null] : iv_ruleRoleName= ruleRoleName EOF ;
    public final EObject entryRuleRoleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleName = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:649:2: (iv_ruleRoleName= ruleRoleName EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:650:2: iv_ruleRoleName= ruleRoleName EOF
            {
             newCompositeNode(grammarAccess.getRoleNameRule()); 
            pushFollow(FOLLOW_ruleRoleName_in_entryRuleRoleName1295);
            iv_ruleRoleName=ruleRoleName();

            state._fsp--;

             current =iv_ruleRoleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleName1305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleName"


    // $ANTLR start "ruleRoleName"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:657:1: ruleRoleName returns [EObject current=null] : (otherlv_0= 'role-name' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRoleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:660:28: ( (otherlv_0= 'role-name' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:661:1: (otherlv_0= 'role-name' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:661:1: (otherlv_0= 'role-name' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:661:3: otherlv_0= 'role-name' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRoleName1342); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleNameAccess().getRoleNameKeyword_0());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:665:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:666:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:666:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:667:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleNameRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRoleName1362); 

            		newLeafNode(otherlv_1, grammarAccess.getRoleNameAccess().getNameSecurityRoleCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleName"


    // $ANTLR start "entryRuleUserDataConstraint"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:686:1: entryRuleUserDataConstraint returns [EObject current=null] : iv_ruleUserDataConstraint= ruleUserDataConstraint EOF ;
    public final EObject entryRuleUserDataConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserDataConstraint = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:687:2: (iv_ruleUserDataConstraint= ruleUserDataConstraint EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:688:2: iv_ruleUserDataConstraint= ruleUserDataConstraint EOF
            {
             newCompositeNode(grammarAccess.getUserDataConstraintRule()); 
            pushFollow(FOLLOW_ruleUserDataConstraint_in_entryRuleUserDataConstraint1398);
            iv_ruleUserDataConstraint=ruleUserDataConstraint();

            state._fsp--;

             current =iv_ruleUserDataConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDataConstraint1408); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserDataConstraint"


    // $ANTLR start "ruleUserDataConstraint"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:695:1: ruleUserDataConstraint returns [EObject current=null] : (otherlv_0= 'user-data-constraint' otherlv_1= '{' ( (lv_transportGuarantee_2_0= ruleTransportGuarantee ) ) ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' ) ;
    public final EObject ruleUserDataConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_transportGuarantee_2_0 = null;

        EObject lv_id_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:698:28: ( (otherlv_0= 'user-data-constraint' otherlv_1= '{' ( (lv_transportGuarantee_2_0= ruleTransportGuarantee ) ) ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:699:1: (otherlv_0= 'user-data-constraint' otherlv_1= '{' ( (lv_transportGuarantee_2_0= ruleTransportGuarantee ) ) ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:699:1: (otherlv_0= 'user-data-constraint' otherlv_1= '{' ( (lv_transportGuarantee_2_0= ruleTransportGuarantee ) ) ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}' )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:699:3: otherlv_0= 'user-data-constraint' otherlv_1= '{' ( (lv_transportGuarantee_2_0= ruleTransportGuarantee ) ) ( (lv_id_3_0= ruleIdentifier ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleUserDataConstraint1445); 

                	newLeafNode(otherlv_0, grammarAccess.getUserDataConstraintAccess().getUserDataConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleUserDataConstraint1457); 

                	newLeafNode(otherlv_1, grammarAccess.getUserDataConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:707:1: ( (lv_transportGuarantee_2_0= ruleTransportGuarantee ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:708:1: (lv_transportGuarantee_2_0= ruleTransportGuarantee )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:708:1: (lv_transportGuarantee_2_0= ruleTransportGuarantee )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:709:3: lv_transportGuarantee_2_0= ruleTransportGuarantee
            {
             
            	        newCompositeNode(grammarAccess.getUserDataConstraintAccess().getTransportGuaranteeTransportGuaranteeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTransportGuarantee_in_ruleUserDataConstraint1478);
            lv_transportGuarantee_2_0=ruleTransportGuarantee();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUserDataConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"transportGuarantee",
                    		lv_transportGuarantee_2_0, 
                    		"TransportGuarantee");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:725:2: ( (lv_id_3_0= ruleIdentifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:726:1: (lv_id_3_0= ruleIdentifier )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:726:1: (lv_id_3_0= ruleIdentifier )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:727:3: lv_id_3_0= ruleIdentifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getUserDataConstraintAccess().getIdIdentifierParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleUserDataConstraint1499);
                    lv_id_3_0=ruleIdentifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUserDataConstraintRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"Identifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleUserDataConstraint1512); 

                	newLeafNode(otherlv_4, grammarAccess.getUserDataConstraintAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserDataConstraint"


    // $ANTLR start "entryRuleTransportGuarantee"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:755:1: entryRuleTransportGuarantee returns [EObject current=null] : iv_ruleTransportGuarantee= ruleTransportGuarantee EOF ;
    public final EObject entryRuleTransportGuarantee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransportGuarantee = null;


        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:756:2: (iv_ruleTransportGuarantee= ruleTransportGuarantee EOF )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:757:2: iv_ruleTransportGuarantee= ruleTransportGuarantee EOF
            {
             newCompositeNode(grammarAccess.getTransportGuaranteeRule()); 
            pushFollow(FOLLOW_ruleTransportGuarantee_in_entryRuleTransportGuarantee1548);
            iv_ruleTransportGuarantee=ruleTransportGuarantee();

            state._fsp--;

             current =iv_ruleTransportGuarantee; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransportGuarantee1558); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransportGuarantee"


    // $ANTLR start "ruleTransportGuarantee"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:764:1: ruleTransportGuarantee returns [EObject current=null] : (otherlv_0= 'transport-guarantee' ( (lv_restriction_1_0= ruleRestrictionType ) ) ) ;
    public final EObject ruleTransportGuarantee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_restriction_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:767:28: ( (otherlv_0= 'transport-guarantee' ( (lv_restriction_1_0= ruleRestrictionType ) ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:768:1: (otherlv_0= 'transport-guarantee' ( (lv_restriction_1_0= ruleRestrictionType ) ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:768:1: (otherlv_0= 'transport-guarantee' ( (lv_restriction_1_0= ruleRestrictionType ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:768:3: otherlv_0= 'transport-guarantee' ( (lv_restriction_1_0= ruleRestrictionType ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTransportGuarantee1595); 

                	newLeafNode(otherlv_0, grammarAccess.getTransportGuaranteeAccess().getTransportGuaranteeKeyword_0());
                
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:772:1: ( (lv_restriction_1_0= ruleRestrictionType ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:773:1: (lv_restriction_1_0= ruleRestrictionType )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:773:1: (lv_restriction_1_0= ruleRestrictionType )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:774:3: lv_restriction_1_0= ruleRestrictionType
            {
             
            	        newCompositeNode(grammarAccess.getTransportGuaranteeAccess().getRestrictionRestrictionTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRestrictionType_in_ruleTransportGuarantee1616);
            lv_restriction_1_0=ruleRestrictionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransportGuaranteeRule());
            	        }
                   		set(
                   			current, 
                   			"restriction",
                    		lv_restriction_1_0, 
                    		"RestrictionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransportGuarantee"


    // $ANTLR start "ruleRestrictionType"
    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:798:1: ruleRestrictionType returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'INTEGRAL' ) | (enumLiteral_2= 'CONFIDENTIAL' ) ) ;
    public final Enumerator ruleRestrictionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:800:28: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'INTEGRAL' ) | (enumLiteral_2= 'CONFIDENTIAL' ) ) )
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:801:1: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'INTEGRAL' ) | (enumLiteral_2= 'CONFIDENTIAL' ) )
            {
            // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:801:1: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'INTEGRAL' ) | (enumLiteral_2= 'CONFIDENTIAL' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:801:2: (enumLiteral_0= 'NONE' )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:801:2: (enumLiteral_0= 'NONE' )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:801:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleRestrictionType1666); 

                            current = grammarAccess.getRestrictionTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRestrictionTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:807:6: (enumLiteral_1= 'INTEGRAL' )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:807:6: (enumLiteral_1= 'INTEGRAL' )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:807:8: enumLiteral_1= 'INTEGRAL'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleRestrictionType1683); 

                            current = grammarAccess.getRestrictionTypeAccess().getINTEGRALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRestrictionTypeAccess().getINTEGRALEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:813:6: (enumLiteral_2= 'CONFIDENTIAL' )
                    {
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:813:6: (enumLiteral_2= 'CONFIDENTIAL' )
                    // ../org.xtext.example.security/src-gen/org/xtext/example/security/parser/antlr/internal/InternalSecurity.g:813:8: enumLiteral_2= 'CONFIDENTIAL'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleRestrictionType1700); 

                            current = grammarAccess.getRestrictionTypeAccess().getCONFIDENTIALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRestrictionTypeAccess().getCONFIDENTIALEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestrictionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSecurity_in_entryRuleSecurity75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurity85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRole_in_ruleSecurity131 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleSecurityConstraint_in_ruleSecurity153 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleSecurityRole_in_entryRuleSecurityRole190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityRole200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSecurityRole237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSecurityRole254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityConstraint_in_entryRuleSecurityConstraint295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityConstraint305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSecurityConstraint342 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleDisplayName_in_ruleSecurityConstraint363 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleWebResourceCollection_in_ruleSecurityConstraint385 = new BitSet(new long[]{0x0000000000A0E010L});
    public static final BitSet FOLLOW_ruleAuthConstraint_in_ruleSecurityConstraint407 = new BitSet(new long[]{0x0000000000802010L});
    public static final BitSet FOLLOW_ruleUserDataConstraint_in_ruleSecurityConstraint429 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleSecurityConstraint451 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSecurityConstraint464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayName_in_entryRuleDisplayName591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayName601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDisplayName638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDisplayName655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebResourceCollection_in_entryRuleWebResourceCollection696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebResourceCollection706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleWebResourceCollection743 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleWebResourceCollection755 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWebResourceCollection767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWebResourceCollection784 = new BitSet(new long[]{0x00000000000C2010L});
    public static final BitSet FOLLOW_ruleUrlPattern_in_ruleWebResourceCollection810 = new BitSet(new long[]{0x00000000000C2010L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_ruleWebResourceCollection832 = new BitSet(new long[]{0x0000000000082010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleWebResourceCollection854 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleWebResourceCollection867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPattern_in_entryRuleUrlPattern903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlPattern913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleUrlPattern950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUrlPattern967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleHttpMethod1055 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHttpMethod1073 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHttpMethod1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthConstraint_in_entryRuleAuthConstraint1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthConstraint1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAuthConstraint1191 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAuthConstraint1203 = new BitSet(new long[]{0x0000000000402010L});
    public static final BitSet FOLLOW_ruleRoleName_in_ruleAuthConstraint1224 = new BitSet(new long[]{0x0000000000402010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleAuthConstraint1246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAuthConstraint1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleName_in_entryRuleRoleName1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleName1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRoleName1342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRoleName1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDataConstraint_in_entryRuleUserDataConstraint1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDataConstraint1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleUserDataConstraint1445 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUserDataConstraint1457 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleTransportGuarantee_in_ruleUserDataConstraint1478 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleUserDataConstraint1499 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUserDataConstraint1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransportGuarantee_in_entryRuleTransportGuarantee1548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransportGuarantee1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTransportGuarantee1595 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleRestrictionType_in_ruleTransportGuarantee1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRestrictionType1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRestrictionType1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRestrictionType1700 = new BitSet(new long[]{0x0000000000000002L});

}