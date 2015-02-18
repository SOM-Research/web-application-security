package org.xtext.example.security.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.security.services.SecurityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSecurityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'INTEGRAL'", "'CONFIDENTIAL'", "'security-role'", "'security-constraint\\r\\n    {'", "'}'", "'display-name'", "'web-resource-collection'", "'{'", "'web-resource-name'", "'url-pattern'", "'http-method'", "'auth-constraint'", "'role-name'", "'user-data-constraint'", "'transport-guarantee'", "'omission'"
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
    public String getGrammarFileName() { return "../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g"; }


     
     	private SecurityGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SecurityGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSecurity"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:60:1: entryRuleSecurity : ruleSecurity EOF ;
    public final void entryRuleSecurity() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:61:1: ( ruleSecurity EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:62:1: ruleSecurity EOF
            {
             before(grammarAccess.getSecurityRule()); 
            pushFollow(FOLLOW_ruleSecurity_in_entryRuleSecurity61);
            ruleSecurity();

            state._fsp--;

             after(grammarAccess.getSecurityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurity68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurity"


    // $ANTLR start "ruleSecurity"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:69:1: ruleSecurity : ( ( rule__Security__Group__0 ) ) ;
    public final void ruleSecurity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:73:2: ( ( ( rule__Security__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:74:1: ( ( rule__Security__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:74:1: ( ( rule__Security__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:75:1: ( rule__Security__Group__0 )
            {
             before(grammarAccess.getSecurityAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:76:1: ( rule__Security__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:76:2: rule__Security__Group__0
            {
            pushFollow(FOLLOW_rule__Security__Group__0_in_ruleSecurity94);
            rule__Security__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurity"


    // $ANTLR start "entryRuleSecurityRole"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:88:1: entryRuleSecurityRole : ruleSecurityRole EOF ;
    public final void entryRuleSecurityRole() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:89:1: ( ruleSecurityRole EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:90:1: ruleSecurityRole EOF
            {
             before(grammarAccess.getSecurityRoleRule()); 
            pushFollow(FOLLOW_ruleSecurityRole_in_entryRuleSecurityRole121);
            ruleSecurityRole();

            state._fsp--;

             after(grammarAccess.getSecurityRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityRole128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityRole"


    // $ANTLR start "ruleSecurityRole"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:97:1: ruleSecurityRole : ( ( rule__SecurityRole__Group__0 ) ) ;
    public final void ruleSecurityRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:101:2: ( ( ( rule__SecurityRole__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:102:1: ( ( rule__SecurityRole__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:102:1: ( ( rule__SecurityRole__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:103:1: ( rule__SecurityRole__Group__0 )
            {
             before(grammarAccess.getSecurityRoleAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:104:1: ( rule__SecurityRole__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:104:2: rule__SecurityRole__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityRole__Group__0_in_ruleSecurityRole154);
            rule__SecurityRole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityRole"


    // $ANTLR start "entryRuleSecurityConstraint"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:116:1: entryRuleSecurityConstraint : ruleSecurityConstraint EOF ;
    public final void entryRuleSecurityConstraint() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:117:1: ( ruleSecurityConstraint EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:118:1: ruleSecurityConstraint EOF
            {
             before(grammarAccess.getSecurityConstraintRule()); 
            pushFollow(FOLLOW_ruleSecurityConstraint_in_entryRuleSecurityConstraint181);
            ruleSecurityConstraint();

            state._fsp--;

             after(grammarAccess.getSecurityConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityConstraint188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityConstraint"


    // $ANTLR start "ruleSecurityConstraint"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:125:1: ruleSecurityConstraint : ( ( rule__SecurityConstraint__Group__0 ) ) ;
    public final void ruleSecurityConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:129:2: ( ( ( rule__SecurityConstraint__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:130:1: ( ( rule__SecurityConstraint__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:130:1: ( ( rule__SecurityConstraint__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:131:1: ( rule__SecurityConstraint__Group__0 )
            {
             before(grammarAccess.getSecurityConstraintAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:132:1: ( rule__SecurityConstraint__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:132:2: rule__SecurityConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__0_in_ruleSecurityConstraint214);
            rule__SecurityConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityConstraint"


    // $ANTLR start "entryRuleIdentifier"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:144:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:145:1: ( ruleIdentifier EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:146:1: ruleIdentifier EOF
            {
             before(grammarAccess.getIdentifierRule()); 
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier241);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:153:1: ruleIdentifier : ( ( rule__Identifier__NameAssignment ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:157:2: ( ( ( rule__Identifier__NameAssignment ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:158:1: ( ( rule__Identifier__NameAssignment ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:158:1: ( ( rule__Identifier__NameAssignment ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:159:1: ( rule__Identifier__NameAssignment )
            {
             before(grammarAccess.getIdentifierAccess().getNameAssignment()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:160:1: ( rule__Identifier__NameAssignment )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:160:2: rule__Identifier__NameAssignment
            {
            pushFollow(FOLLOW_rule__Identifier__NameAssignment_in_ruleIdentifier274);
            rule__Identifier__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentifierAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleDisplayName"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:172:1: entryRuleDisplayName : ruleDisplayName EOF ;
    public final void entryRuleDisplayName() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:173:1: ( ruleDisplayName EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:174:1: ruleDisplayName EOF
            {
             before(grammarAccess.getDisplayNameRule()); 
            pushFollow(FOLLOW_ruleDisplayName_in_entryRuleDisplayName301);
            ruleDisplayName();

            state._fsp--;

             after(grammarAccess.getDisplayNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisplayName308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisplayName"


    // $ANTLR start "ruleDisplayName"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:181:1: ruleDisplayName : ( ( rule__DisplayName__Group__0 ) ) ;
    public final void ruleDisplayName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:185:2: ( ( ( rule__DisplayName__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:186:1: ( ( rule__DisplayName__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:186:1: ( ( rule__DisplayName__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:187:1: ( rule__DisplayName__Group__0 )
            {
             before(grammarAccess.getDisplayNameAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:188:1: ( rule__DisplayName__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:188:2: rule__DisplayName__Group__0
            {
            pushFollow(FOLLOW_rule__DisplayName__Group__0_in_ruleDisplayName334);
            rule__DisplayName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisplayNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisplayName"


    // $ANTLR start "entryRuleWebResourceCollection"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:200:1: entryRuleWebResourceCollection : ruleWebResourceCollection EOF ;
    public final void entryRuleWebResourceCollection() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:201:1: ( ruleWebResourceCollection EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:202:1: ruleWebResourceCollection EOF
            {
             before(grammarAccess.getWebResourceCollectionRule()); 
            pushFollow(FOLLOW_ruleWebResourceCollection_in_entryRuleWebResourceCollection361);
            ruleWebResourceCollection();

            state._fsp--;

             after(grammarAccess.getWebResourceCollectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWebResourceCollection368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWebResourceCollection"


    // $ANTLR start "ruleWebResourceCollection"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:209:1: ruleWebResourceCollection : ( ( rule__WebResourceCollection__Group__0 ) ) ;
    public final void ruleWebResourceCollection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:213:2: ( ( ( rule__WebResourceCollection__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:214:1: ( ( rule__WebResourceCollection__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:214:1: ( ( rule__WebResourceCollection__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:215:1: ( rule__WebResourceCollection__Group__0 )
            {
             before(grammarAccess.getWebResourceCollectionAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:216:1: ( rule__WebResourceCollection__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:216:2: rule__WebResourceCollection__Group__0
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__0_in_ruleWebResourceCollection394);
            rule__WebResourceCollection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWebResourceCollectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWebResourceCollection"


    // $ANTLR start "entryRuleUrlPattern"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:228:1: entryRuleUrlPattern : ruleUrlPattern EOF ;
    public final void entryRuleUrlPattern() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:229:1: ( ruleUrlPattern EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:230:1: ruleUrlPattern EOF
            {
             before(grammarAccess.getUrlPatternRule()); 
            pushFollow(FOLLOW_ruleUrlPattern_in_entryRuleUrlPattern421);
            ruleUrlPattern();

            state._fsp--;

             after(grammarAccess.getUrlPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUrlPattern428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrlPattern"


    // $ANTLR start "ruleUrlPattern"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:237:1: ruleUrlPattern : ( ( rule__UrlPattern__Group__0 ) ) ;
    public final void ruleUrlPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:241:2: ( ( ( rule__UrlPattern__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:242:1: ( ( rule__UrlPattern__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:242:1: ( ( rule__UrlPattern__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:243:1: ( rule__UrlPattern__Group__0 )
            {
             before(grammarAccess.getUrlPatternAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:244:1: ( rule__UrlPattern__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:244:2: rule__UrlPattern__Group__0
            {
            pushFollow(FOLLOW_rule__UrlPattern__Group__0_in_ruleUrlPattern454);
            rule__UrlPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUrlPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrlPattern"


    // $ANTLR start "entryRuleHttpMethod"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:256:1: entryRuleHttpMethod : ruleHttpMethod EOF ;
    public final void entryRuleHttpMethod() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:257:1: ( ruleHttpMethod EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:258:1: ruleHttpMethod EOF
            {
             before(grammarAccess.getHttpMethodRule()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod481);
            ruleHttpMethod();

            state._fsp--;

             after(grammarAccess.getHttpMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHttpMethod488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHttpMethod"


    // $ANTLR start "ruleHttpMethod"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:265:1: ruleHttpMethod : ( ( rule__HttpMethod__Group__0 ) ) ;
    public final void ruleHttpMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:269:2: ( ( ( rule__HttpMethod__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:270:1: ( ( rule__HttpMethod__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:270:1: ( ( rule__HttpMethod__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:271:1: ( rule__HttpMethod__Group__0 )
            {
             before(grammarAccess.getHttpMethodAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:272:1: ( rule__HttpMethod__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:272:2: rule__HttpMethod__Group__0
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod514);
            rule__HttpMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHttpMethod"


    // $ANTLR start "entryRuleAuthConstraint"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:284:1: entryRuleAuthConstraint : ruleAuthConstraint EOF ;
    public final void entryRuleAuthConstraint() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:285:1: ( ruleAuthConstraint EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:286:1: ruleAuthConstraint EOF
            {
             before(grammarAccess.getAuthConstraintRule()); 
            pushFollow(FOLLOW_ruleAuthConstraint_in_entryRuleAuthConstraint541);
            ruleAuthConstraint();

            state._fsp--;

             after(grammarAccess.getAuthConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthConstraint548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthConstraint"


    // $ANTLR start "ruleAuthConstraint"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:293:1: ruleAuthConstraint : ( ( rule__AuthConstraint__Group__0 ) ) ;
    public final void ruleAuthConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:297:2: ( ( ( rule__AuthConstraint__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:298:1: ( ( rule__AuthConstraint__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:298:1: ( ( rule__AuthConstraint__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:299:1: ( rule__AuthConstraint__Group__0 )
            {
             before(grammarAccess.getAuthConstraintAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:300:1: ( rule__AuthConstraint__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:300:2: rule__AuthConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__AuthConstraint__Group__0_in_ruleAuthConstraint574);
            rule__AuthConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthConstraint"


    // $ANTLR start "entryRuleRoleName"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:312:1: entryRuleRoleName : ruleRoleName EOF ;
    public final void entryRuleRoleName() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:313:1: ( ruleRoleName EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:314:1: ruleRoleName EOF
            {
             before(grammarAccess.getRoleNameRule()); 
            pushFollow(FOLLOW_ruleRoleName_in_entryRuleRoleName601);
            ruleRoleName();

            state._fsp--;

             after(grammarAccess.getRoleNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoleName608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoleName"


    // $ANTLR start "ruleRoleName"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:321:1: ruleRoleName : ( ( rule__RoleName__Group__0 ) ) ;
    public final void ruleRoleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:325:2: ( ( ( rule__RoleName__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:326:1: ( ( rule__RoleName__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:326:1: ( ( rule__RoleName__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:327:1: ( rule__RoleName__Group__0 )
            {
             before(grammarAccess.getRoleNameAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:328:1: ( rule__RoleName__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:328:2: rule__RoleName__Group__0
            {
            pushFollow(FOLLOW_rule__RoleName__Group__0_in_ruleRoleName634);
            rule__RoleName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoleName"


    // $ANTLR start "entryRuleUserDataConstraint"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:340:1: entryRuleUserDataConstraint : ruleUserDataConstraint EOF ;
    public final void entryRuleUserDataConstraint() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:341:1: ( ruleUserDataConstraint EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:342:1: ruleUserDataConstraint EOF
            {
             before(grammarAccess.getUserDataConstraintRule()); 
            pushFollow(FOLLOW_ruleUserDataConstraint_in_entryRuleUserDataConstraint661);
            ruleUserDataConstraint();

            state._fsp--;

             after(grammarAccess.getUserDataConstraintRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserDataConstraint668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserDataConstraint"


    // $ANTLR start "ruleUserDataConstraint"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:349:1: ruleUserDataConstraint : ( ( rule__UserDataConstraint__Group__0 ) ) ;
    public final void ruleUserDataConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:353:2: ( ( ( rule__UserDataConstraint__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:354:1: ( ( rule__UserDataConstraint__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:354:1: ( ( rule__UserDataConstraint__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:355:1: ( rule__UserDataConstraint__Group__0 )
            {
             before(grammarAccess.getUserDataConstraintAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:356:1: ( rule__UserDataConstraint__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:356:2: rule__UserDataConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__UserDataConstraint__Group__0_in_ruleUserDataConstraint694);
            rule__UserDataConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserDataConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserDataConstraint"


    // $ANTLR start "entryRuleTransportGuarantee"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:368:1: entryRuleTransportGuarantee : ruleTransportGuarantee EOF ;
    public final void entryRuleTransportGuarantee() throws RecognitionException {
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:369:1: ( ruleTransportGuarantee EOF )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:370:1: ruleTransportGuarantee EOF
            {
             before(grammarAccess.getTransportGuaranteeRule()); 
            pushFollow(FOLLOW_ruleTransportGuarantee_in_entryRuleTransportGuarantee721);
            ruleTransportGuarantee();

            state._fsp--;

             after(grammarAccess.getTransportGuaranteeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransportGuarantee728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransportGuarantee"


    // $ANTLR start "ruleTransportGuarantee"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:377:1: ruleTransportGuarantee : ( ( rule__TransportGuarantee__Group__0 ) ) ;
    public final void ruleTransportGuarantee() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:381:2: ( ( ( rule__TransportGuarantee__Group__0 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:382:1: ( ( rule__TransportGuarantee__Group__0 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:382:1: ( ( rule__TransportGuarantee__Group__0 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:383:1: ( rule__TransportGuarantee__Group__0 )
            {
             before(grammarAccess.getTransportGuaranteeAccess().getGroup()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:384:1: ( rule__TransportGuarantee__Group__0 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:384:2: rule__TransportGuarantee__Group__0
            {
            pushFollow(FOLLOW_rule__TransportGuarantee__Group__0_in_ruleTransportGuarantee754);
            rule__TransportGuarantee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransportGuaranteeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransportGuarantee"


    // $ANTLR start "ruleRestrictionType"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:397:1: ruleRestrictionType : ( ( rule__RestrictionType__Alternatives ) ) ;
    public final void ruleRestrictionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:401:1: ( ( ( rule__RestrictionType__Alternatives ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:402:1: ( ( rule__RestrictionType__Alternatives ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:402:1: ( ( rule__RestrictionType__Alternatives ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:403:1: ( rule__RestrictionType__Alternatives )
            {
             before(grammarAccess.getRestrictionTypeAccess().getAlternatives()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:404:1: ( rule__RestrictionType__Alternatives )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:404:2: rule__RestrictionType__Alternatives
            {
            pushFollow(FOLLOW_rule__RestrictionType__Alternatives_in_ruleRestrictionType791);
            rule__RestrictionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestrictionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestrictionType"


    // $ANTLR start "rule__RestrictionType__Alternatives"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:415:1: rule__RestrictionType__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'INTEGRAL' ) ) | ( ( 'CONFIDENTIAL' ) ) );
    public final void rule__RestrictionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:419:1: ( ( ( 'NONE' ) ) | ( ( 'INTEGRAL' ) ) | ( ( 'CONFIDENTIAL' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:420:1: ( ( 'NONE' ) )
                    {
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:420:1: ( ( 'NONE' ) )
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:421:1: ( 'NONE' )
                    {
                     before(grammarAccess.getRestrictionTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:422:1: ( 'NONE' )
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:422:3: 'NONE'
                    {
                    match(input,11,FOLLOW_11_in_rule__RestrictionType__Alternatives827); 

                    }

                     after(grammarAccess.getRestrictionTypeAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:427:6: ( ( 'INTEGRAL' ) )
                    {
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:427:6: ( ( 'INTEGRAL' ) )
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:428:1: ( 'INTEGRAL' )
                    {
                     before(grammarAccess.getRestrictionTypeAccess().getINTEGRALEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:429:1: ( 'INTEGRAL' )
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:429:3: 'INTEGRAL'
                    {
                    match(input,12,FOLLOW_12_in_rule__RestrictionType__Alternatives848); 

                    }

                     after(grammarAccess.getRestrictionTypeAccess().getINTEGRALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:434:6: ( ( 'CONFIDENTIAL' ) )
                    {
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:434:6: ( ( 'CONFIDENTIAL' ) )
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:435:1: ( 'CONFIDENTIAL' )
                    {
                     before(grammarAccess.getRestrictionTypeAccess().getCONFIDENTIALEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:436:1: ( 'CONFIDENTIAL' )
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:436:3: 'CONFIDENTIAL'
                    {
                    match(input,13,FOLLOW_13_in_rule__RestrictionType__Alternatives869); 

                    }

                     after(grammarAccess.getRestrictionTypeAccess().getCONFIDENTIALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestrictionType__Alternatives"


    // $ANTLR start "rule__Security__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:448:1: rule__Security__Group__0 : rule__Security__Group__0__Impl rule__Security__Group__1 ;
    public final void rule__Security__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:452:1: ( rule__Security__Group__0__Impl rule__Security__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:453:2: rule__Security__Group__0__Impl rule__Security__Group__1
            {
            pushFollow(FOLLOW_rule__Security__Group__0__Impl_in_rule__Security__Group__0902);
            rule__Security__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Security__Group__1_in_rule__Security__Group__0905);
            rule__Security__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Security__Group__0"


    // $ANTLR start "rule__Security__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:460:1: rule__Security__Group__0__Impl : ( ( rule__Security__RoleAssignment_0 )* ) ;
    public final void rule__Security__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:464:1: ( ( ( rule__Security__RoleAssignment_0 )* ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:465:1: ( ( rule__Security__RoleAssignment_0 )* )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:465:1: ( ( rule__Security__RoleAssignment_0 )* )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:466:1: ( rule__Security__RoleAssignment_0 )*
            {
             before(grammarAccess.getSecurityAccess().getRoleAssignment_0()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:467:1: ( rule__Security__RoleAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:467:2: rule__Security__RoleAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Security__RoleAssignment_0_in_rule__Security__Group__0__Impl932);
            	    rule__Security__RoleAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSecurityAccess().getRoleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Security__Group__0__Impl"


    // $ANTLR start "rule__Security__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:477:1: rule__Security__Group__1 : rule__Security__Group__1__Impl ;
    public final void rule__Security__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:481:1: ( rule__Security__Group__1__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:482:2: rule__Security__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Security__Group__1__Impl_in_rule__Security__Group__1963);
            rule__Security__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Security__Group__1"


    // $ANTLR start "rule__Security__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:488:1: rule__Security__Group__1__Impl : ( ( rule__Security__ConstraintAssignment_1 )* ) ;
    public final void rule__Security__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:492:1: ( ( ( rule__Security__ConstraintAssignment_1 )* ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:493:1: ( ( rule__Security__ConstraintAssignment_1 )* )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:493:1: ( ( rule__Security__ConstraintAssignment_1 )* )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:494:1: ( rule__Security__ConstraintAssignment_1 )*
            {
             before(grammarAccess.getSecurityAccess().getConstraintAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:495:1: ( rule__Security__ConstraintAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:495:2: rule__Security__ConstraintAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Security__ConstraintAssignment_1_in_rule__Security__Group__1__Impl990);
            	    rule__Security__ConstraintAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSecurityAccess().getConstraintAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Security__Group__1__Impl"


    // $ANTLR start "rule__SecurityRole__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:509:1: rule__SecurityRole__Group__0 : rule__SecurityRole__Group__0__Impl rule__SecurityRole__Group__1 ;
    public final void rule__SecurityRole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:513:1: ( rule__SecurityRole__Group__0__Impl rule__SecurityRole__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:514:2: rule__SecurityRole__Group__0__Impl rule__SecurityRole__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityRole__Group__0__Impl_in_rule__SecurityRole__Group__01025);
            rule__SecurityRole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityRole__Group__1_in_rule__SecurityRole__Group__01028);
            rule__SecurityRole__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityRole__Group__0"


    // $ANTLR start "rule__SecurityRole__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:521:1: rule__SecurityRole__Group__0__Impl : ( 'security-role' ) ;
    public final void rule__SecurityRole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:525:1: ( ( 'security-role' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:526:1: ( 'security-role' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:526:1: ( 'security-role' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:527:1: 'security-role'
            {
             before(grammarAccess.getSecurityRoleAccess().getSecurityRoleKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__SecurityRole__Group__0__Impl1056); 
             after(grammarAccess.getSecurityRoleAccess().getSecurityRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityRole__Group__0__Impl"


    // $ANTLR start "rule__SecurityRole__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:540:1: rule__SecurityRole__Group__1 : rule__SecurityRole__Group__1__Impl ;
    public final void rule__SecurityRole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:544:1: ( rule__SecurityRole__Group__1__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:545:2: rule__SecurityRole__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityRole__Group__1__Impl_in_rule__SecurityRole__Group__11087);
            rule__SecurityRole__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityRole__Group__1"


    // $ANTLR start "rule__SecurityRole__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:551:1: rule__SecurityRole__Group__1__Impl : ( ( rule__SecurityRole__NameAssignment_1 ) ) ;
    public final void rule__SecurityRole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:555:1: ( ( ( rule__SecurityRole__NameAssignment_1 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:556:1: ( ( rule__SecurityRole__NameAssignment_1 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:556:1: ( ( rule__SecurityRole__NameAssignment_1 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:557:1: ( rule__SecurityRole__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityRoleAccess().getNameAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:558:1: ( rule__SecurityRole__NameAssignment_1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:558:2: rule__SecurityRole__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityRole__NameAssignment_1_in_rule__SecurityRole__Group__1__Impl1114);
            rule__SecurityRole__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityRole__Group__1__Impl"


    // $ANTLR start "rule__SecurityConstraint__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:572:1: rule__SecurityConstraint__Group__0 : rule__SecurityConstraint__Group__0__Impl rule__SecurityConstraint__Group__1 ;
    public final void rule__SecurityConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:576:1: ( rule__SecurityConstraint__Group__0__Impl rule__SecurityConstraint__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:577:2: rule__SecurityConstraint__Group__0__Impl rule__SecurityConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__0__Impl_in_rule__SecurityConstraint__Group__01148);
            rule__SecurityConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityConstraint__Group__1_in_rule__SecurityConstraint__Group__01151);
            rule__SecurityConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__0"


    // $ANTLR start "rule__SecurityConstraint__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:584:1: rule__SecurityConstraint__Group__0__Impl : ( 'security-constraint\\r\\n {' ) ;
    public final void rule__SecurityConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:588:1: ( ( 'security-constraint\\r\\n {' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:589:1: ( 'security-constraint\\r\\n {' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:589:1: ( 'security-constraint\\r\\n {' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:590:1: 'security-constraint\\r\\n {'
            {
             before(grammarAccess.getSecurityConstraintAccess().getSecurityConstraintKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SecurityConstraint__Group__0__Impl1179); 
             after(grammarAccess.getSecurityConstraintAccess().getSecurityConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__0__Impl"


    // $ANTLR start "rule__SecurityConstraint__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:603:1: rule__SecurityConstraint__Group__1 : rule__SecurityConstraint__Group__1__Impl rule__SecurityConstraint__Group__2 ;
    public final void rule__SecurityConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:607:1: ( rule__SecurityConstraint__Group__1__Impl rule__SecurityConstraint__Group__2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:608:2: rule__SecurityConstraint__Group__1__Impl rule__SecurityConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__1__Impl_in_rule__SecurityConstraint__Group__11210);
            rule__SecurityConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityConstraint__Group__2_in_rule__SecurityConstraint__Group__11213);
            rule__SecurityConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__1"


    // $ANTLR start "rule__SecurityConstraint__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:615:1: rule__SecurityConstraint__Group__1__Impl : ( ( rule__SecurityConstraint__DisplayNameAssignment_1 )* ) ;
    public final void rule__SecurityConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:619:1: ( ( ( rule__SecurityConstraint__DisplayNameAssignment_1 )* ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:620:1: ( ( rule__SecurityConstraint__DisplayNameAssignment_1 )* )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:620:1: ( ( rule__SecurityConstraint__DisplayNameAssignment_1 )* )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:621:1: ( rule__SecurityConstraint__DisplayNameAssignment_1 )*
            {
             before(grammarAccess.getSecurityConstraintAccess().getDisplayNameAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:622:1: ( rule__SecurityConstraint__DisplayNameAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:622:2: rule__SecurityConstraint__DisplayNameAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SecurityConstraint__DisplayNameAssignment_1_in_rule__SecurityConstraint__Group__1__Impl1240);
            	    rule__SecurityConstraint__DisplayNameAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSecurityConstraintAccess().getDisplayNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__1__Impl"


    // $ANTLR start "rule__SecurityConstraint__Group__2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:632:1: rule__SecurityConstraint__Group__2 : rule__SecurityConstraint__Group__2__Impl rule__SecurityConstraint__Group__3 ;
    public final void rule__SecurityConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:636:1: ( rule__SecurityConstraint__Group__2__Impl rule__SecurityConstraint__Group__3 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:637:2: rule__SecurityConstraint__Group__2__Impl rule__SecurityConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__2__Impl_in_rule__SecurityConstraint__Group__21271);
            rule__SecurityConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityConstraint__Group__3_in_rule__SecurityConstraint__Group__21274);
            rule__SecurityConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__2"


    // $ANTLR start "rule__SecurityConstraint__Group__2__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:644:1: rule__SecurityConstraint__Group__2__Impl : ( ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 ) ) ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )* ) ) ;
    public final void rule__SecurityConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:648:1: ( ( ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 ) ) ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )* ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:649:1: ( ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 ) ) ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )* ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:649:1: ( ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 ) ) ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )* ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:650:1: ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 ) ) ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )* )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:650:1: ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:651:1: ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )
            {
             before(grammarAccess.getSecurityConstraintAccess().getWebResourceCollectionAssignment_2()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:652:1: ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:652:2: rule__SecurityConstraint__WebResourceCollectionAssignment_2
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__WebResourceCollectionAssignment_2_in_rule__SecurityConstraint__Group__2__Impl1303);
            rule__SecurityConstraint__WebResourceCollectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSecurityConstraintAccess().getWebResourceCollectionAssignment_2()); 

            }

            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:655:1: ( ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )* )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:656:1: ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )*
            {
             before(grammarAccess.getSecurityConstraintAccess().getWebResourceCollectionAssignment_2()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:657:1: ( rule__SecurityConstraint__WebResourceCollectionAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:657:2: rule__SecurityConstraint__WebResourceCollectionAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SecurityConstraint__WebResourceCollectionAssignment_2_in_rule__SecurityConstraint__Group__2__Impl1315);
            	    rule__SecurityConstraint__WebResourceCollectionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSecurityConstraintAccess().getWebResourceCollectionAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__2__Impl"


    // $ANTLR start "rule__SecurityConstraint__Group__3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:668:1: rule__SecurityConstraint__Group__3 : rule__SecurityConstraint__Group__3__Impl rule__SecurityConstraint__Group__4 ;
    public final void rule__SecurityConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:672:1: ( rule__SecurityConstraint__Group__3__Impl rule__SecurityConstraint__Group__4 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:673:2: rule__SecurityConstraint__Group__3__Impl rule__SecurityConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__3__Impl_in_rule__SecurityConstraint__Group__31348);
            rule__SecurityConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityConstraint__Group__4_in_rule__SecurityConstraint__Group__31351);
            rule__SecurityConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__3"


    // $ANTLR start "rule__SecurityConstraint__Group__3__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:680:1: rule__SecurityConstraint__Group__3__Impl : ( ( rule__SecurityConstraint__AuthConstraintAssignment_3 )? ) ;
    public final void rule__SecurityConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:684:1: ( ( ( rule__SecurityConstraint__AuthConstraintAssignment_3 )? ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:685:1: ( ( rule__SecurityConstraint__AuthConstraintAssignment_3 )? )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:685:1: ( ( rule__SecurityConstraint__AuthConstraintAssignment_3 )? )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:686:1: ( rule__SecurityConstraint__AuthConstraintAssignment_3 )?
            {
             before(grammarAccess.getSecurityConstraintAccess().getAuthConstraintAssignment_3()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:687:1: ( rule__SecurityConstraint__AuthConstraintAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:687:2: rule__SecurityConstraint__AuthConstraintAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SecurityConstraint__AuthConstraintAssignment_3_in_rule__SecurityConstraint__Group__3__Impl1378);
                    rule__SecurityConstraint__AuthConstraintAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityConstraintAccess().getAuthConstraintAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__3__Impl"


    // $ANTLR start "rule__SecurityConstraint__Group__4"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:697:1: rule__SecurityConstraint__Group__4 : rule__SecurityConstraint__Group__4__Impl rule__SecurityConstraint__Group__5 ;
    public final void rule__SecurityConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:701:1: ( rule__SecurityConstraint__Group__4__Impl rule__SecurityConstraint__Group__5 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:702:2: rule__SecurityConstraint__Group__4__Impl rule__SecurityConstraint__Group__5
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__4__Impl_in_rule__SecurityConstraint__Group__41409);
            rule__SecurityConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityConstraint__Group__5_in_rule__SecurityConstraint__Group__41412);
            rule__SecurityConstraint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__4"


    // $ANTLR start "rule__SecurityConstraint__Group__4__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:709:1: rule__SecurityConstraint__Group__4__Impl : ( ( rule__SecurityConstraint__UserDataConstraintAssignment_4 )? ) ;
    public final void rule__SecurityConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:713:1: ( ( ( rule__SecurityConstraint__UserDataConstraintAssignment_4 )? ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:714:1: ( ( rule__SecurityConstraint__UserDataConstraintAssignment_4 )? )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:714:1: ( ( rule__SecurityConstraint__UserDataConstraintAssignment_4 )? )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:715:1: ( rule__SecurityConstraint__UserDataConstraintAssignment_4 )?
            {
             before(grammarAccess.getSecurityConstraintAccess().getUserDataConstraintAssignment_4()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:716:1: ( rule__SecurityConstraint__UserDataConstraintAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:716:2: rule__SecurityConstraint__UserDataConstraintAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SecurityConstraint__UserDataConstraintAssignment_4_in_rule__SecurityConstraint__Group__4__Impl1439);
                    rule__SecurityConstraint__UserDataConstraintAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityConstraintAccess().getUserDataConstraintAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__4__Impl"


    // $ANTLR start "rule__SecurityConstraint__Group__5"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:726:1: rule__SecurityConstraint__Group__5 : rule__SecurityConstraint__Group__5__Impl rule__SecurityConstraint__Group__6 ;
    public final void rule__SecurityConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:730:1: ( rule__SecurityConstraint__Group__5__Impl rule__SecurityConstraint__Group__6 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:731:2: rule__SecurityConstraint__Group__5__Impl rule__SecurityConstraint__Group__6
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__5__Impl_in_rule__SecurityConstraint__Group__51470);
            rule__SecurityConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SecurityConstraint__Group__6_in_rule__SecurityConstraint__Group__51473);
            rule__SecurityConstraint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__5"


    // $ANTLR start "rule__SecurityConstraint__Group__5__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:738:1: rule__SecurityConstraint__Group__5__Impl : ( ( rule__SecurityConstraint__IdAssignment_5 )? ) ;
    public final void rule__SecurityConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:742:1: ( ( ( rule__SecurityConstraint__IdAssignment_5 )? ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:743:1: ( ( rule__SecurityConstraint__IdAssignment_5 )? )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:743:1: ( ( rule__SecurityConstraint__IdAssignment_5 )? )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:744:1: ( rule__SecurityConstraint__IdAssignment_5 )?
            {
             before(grammarAccess.getSecurityConstraintAccess().getIdAssignment_5()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:745:1: ( rule__SecurityConstraint__IdAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:745:2: rule__SecurityConstraint__IdAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SecurityConstraint__IdAssignment_5_in_rule__SecurityConstraint__Group__5__Impl1500);
                    rule__SecurityConstraint__IdAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityConstraintAccess().getIdAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__5__Impl"


    // $ANTLR start "rule__SecurityConstraint__Group__6"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:755:1: rule__SecurityConstraint__Group__6 : rule__SecurityConstraint__Group__6__Impl ;
    public final void rule__SecurityConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:759:1: ( rule__SecurityConstraint__Group__6__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:760:2: rule__SecurityConstraint__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SecurityConstraint__Group__6__Impl_in_rule__SecurityConstraint__Group__61531);
            rule__SecurityConstraint__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__6"


    // $ANTLR start "rule__SecurityConstraint__Group__6__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:766:1: rule__SecurityConstraint__Group__6__Impl : ( '}' ) ;
    public final void rule__SecurityConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:770:1: ( ( '}' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:771:1: ( '}' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:771:1: ( '}' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:772:1: '}'
            {
             before(grammarAccess.getSecurityConstraintAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_16_in_rule__SecurityConstraint__Group__6__Impl1559); 
             after(grammarAccess.getSecurityConstraintAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__Group__6__Impl"


    // $ANTLR start "rule__DisplayName__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:799:1: rule__DisplayName__Group__0 : rule__DisplayName__Group__0__Impl rule__DisplayName__Group__1 ;
    public final void rule__DisplayName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:803:1: ( rule__DisplayName__Group__0__Impl rule__DisplayName__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:804:2: rule__DisplayName__Group__0__Impl rule__DisplayName__Group__1
            {
            pushFollow(FOLLOW_rule__DisplayName__Group__0__Impl_in_rule__DisplayName__Group__01604);
            rule__DisplayName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DisplayName__Group__1_in_rule__DisplayName__Group__01607);
            rule__DisplayName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__0"


    // $ANTLR start "rule__DisplayName__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:811:1: rule__DisplayName__Group__0__Impl : ( 'display-name' ) ;
    public final void rule__DisplayName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:815:1: ( ( 'display-name' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:816:1: ( 'display-name' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:816:1: ( 'display-name' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:817:1: 'display-name'
            {
             before(grammarAccess.getDisplayNameAccess().getDisplayNameKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__DisplayName__Group__0__Impl1635); 
             after(grammarAccess.getDisplayNameAccess().getDisplayNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__0__Impl"


    // $ANTLR start "rule__DisplayName__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:830:1: rule__DisplayName__Group__1 : rule__DisplayName__Group__1__Impl ;
    public final void rule__DisplayName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:834:1: ( rule__DisplayName__Group__1__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:835:2: rule__DisplayName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DisplayName__Group__1__Impl_in_rule__DisplayName__Group__11666);
            rule__DisplayName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__1"


    // $ANTLR start "rule__DisplayName__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:841:1: rule__DisplayName__Group__1__Impl : ( ( rule__DisplayName__ValueAssignment_1 ) ) ;
    public final void rule__DisplayName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:845:1: ( ( ( rule__DisplayName__ValueAssignment_1 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:846:1: ( ( rule__DisplayName__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:846:1: ( ( rule__DisplayName__ValueAssignment_1 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:847:1: ( rule__DisplayName__ValueAssignment_1 )
            {
             before(grammarAccess.getDisplayNameAccess().getValueAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:848:1: ( rule__DisplayName__ValueAssignment_1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:848:2: rule__DisplayName__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__DisplayName__ValueAssignment_1_in_rule__DisplayName__Group__1__Impl1693);
            rule__DisplayName__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDisplayNameAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__Group__1__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:862:1: rule__WebResourceCollection__Group__0 : rule__WebResourceCollection__Group__0__Impl rule__WebResourceCollection__Group__1 ;
    public final void rule__WebResourceCollection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:866:1: ( rule__WebResourceCollection__Group__0__Impl rule__WebResourceCollection__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:867:2: rule__WebResourceCollection__Group__0__Impl rule__WebResourceCollection__Group__1
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__0__Impl_in_rule__WebResourceCollection__Group__01727);
            rule__WebResourceCollection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebResourceCollection__Group__1_in_rule__WebResourceCollection__Group__01730);
            rule__WebResourceCollection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__0"


    // $ANTLR start "rule__WebResourceCollection__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:874:1: rule__WebResourceCollection__Group__0__Impl : ( 'web-resource-collection' ) ;
    public final void rule__WebResourceCollection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:878:1: ( ( 'web-resource-collection' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:879:1: ( 'web-resource-collection' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:879:1: ( 'web-resource-collection' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:880:1: 'web-resource-collection'
            {
             before(grammarAccess.getWebResourceCollectionAccess().getWebResourceCollectionKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__WebResourceCollection__Group__0__Impl1758); 
             after(grammarAccess.getWebResourceCollectionAccess().getWebResourceCollectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__0__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:893:1: rule__WebResourceCollection__Group__1 : rule__WebResourceCollection__Group__1__Impl rule__WebResourceCollection__Group__2 ;
    public final void rule__WebResourceCollection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:897:1: ( rule__WebResourceCollection__Group__1__Impl rule__WebResourceCollection__Group__2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:898:2: rule__WebResourceCollection__Group__1__Impl rule__WebResourceCollection__Group__2
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__1__Impl_in_rule__WebResourceCollection__Group__11789);
            rule__WebResourceCollection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebResourceCollection__Group__2_in_rule__WebResourceCollection__Group__11792);
            rule__WebResourceCollection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__1"


    // $ANTLR start "rule__WebResourceCollection__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:905:1: rule__WebResourceCollection__Group__1__Impl : ( '{' ) ;
    public final void rule__WebResourceCollection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:909:1: ( ( '{' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:910:1: ( '{' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:910:1: ( '{' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:911:1: '{'
            {
             before(grammarAccess.getWebResourceCollectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__WebResourceCollection__Group__1__Impl1820); 
             after(grammarAccess.getWebResourceCollectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__1__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:924:1: rule__WebResourceCollection__Group__2 : rule__WebResourceCollection__Group__2__Impl rule__WebResourceCollection__Group__3 ;
    public final void rule__WebResourceCollection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:928:1: ( rule__WebResourceCollection__Group__2__Impl rule__WebResourceCollection__Group__3 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:929:2: rule__WebResourceCollection__Group__2__Impl rule__WebResourceCollection__Group__3
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__2__Impl_in_rule__WebResourceCollection__Group__21851);
            rule__WebResourceCollection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebResourceCollection__Group__3_in_rule__WebResourceCollection__Group__21854);
            rule__WebResourceCollection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__2"


    // $ANTLR start "rule__WebResourceCollection__Group__2__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:936:1: rule__WebResourceCollection__Group__2__Impl : ( 'web-resource-name' ) ;
    public final void rule__WebResourceCollection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:940:1: ( ( 'web-resource-name' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:941:1: ( 'web-resource-name' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:941:1: ( 'web-resource-name' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:942:1: 'web-resource-name'
            {
             before(grammarAccess.getWebResourceCollectionAccess().getWebResourceNameKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__WebResourceCollection__Group__2__Impl1882); 
             after(grammarAccess.getWebResourceCollectionAccess().getWebResourceNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__2__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:955:1: rule__WebResourceCollection__Group__3 : rule__WebResourceCollection__Group__3__Impl rule__WebResourceCollection__Group__4 ;
    public final void rule__WebResourceCollection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:959:1: ( rule__WebResourceCollection__Group__3__Impl rule__WebResourceCollection__Group__4 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:960:2: rule__WebResourceCollection__Group__3__Impl rule__WebResourceCollection__Group__4
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__3__Impl_in_rule__WebResourceCollection__Group__31913);
            rule__WebResourceCollection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebResourceCollection__Group__4_in_rule__WebResourceCollection__Group__31916);
            rule__WebResourceCollection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__3"


    // $ANTLR start "rule__WebResourceCollection__Group__3__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:967:1: rule__WebResourceCollection__Group__3__Impl : ( ( rule__WebResourceCollection__WebResourceNameAssignment_3 ) ) ;
    public final void rule__WebResourceCollection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:971:1: ( ( ( rule__WebResourceCollection__WebResourceNameAssignment_3 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:972:1: ( ( rule__WebResourceCollection__WebResourceNameAssignment_3 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:972:1: ( ( rule__WebResourceCollection__WebResourceNameAssignment_3 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:973:1: ( rule__WebResourceCollection__WebResourceNameAssignment_3 )
            {
             before(grammarAccess.getWebResourceCollectionAccess().getWebResourceNameAssignment_3()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:974:1: ( rule__WebResourceCollection__WebResourceNameAssignment_3 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:974:2: rule__WebResourceCollection__WebResourceNameAssignment_3
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__WebResourceNameAssignment_3_in_rule__WebResourceCollection__Group__3__Impl1943);
            rule__WebResourceCollection__WebResourceNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWebResourceCollectionAccess().getWebResourceNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__3__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__4"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:984:1: rule__WebResourceCollection__Group__4 : rule__WebResourceCollection__Group__4__Impl rule__WebResourceCollection__Group__5 ;
    public final void rule__WebResourceCollection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:988:1: ( rule__WebResourceCollection__Group__4__Impl rule__WebResourceCollection__Group__5 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:989:2: rule__WebResourceCollection__Group__4__Impl rule__WebResourceCollection__Group__5
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__4__Impl_in_rule__WebResourceCollection__Group__41973);
            rule__WebResourceCollection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebResourceCollection__Group__5_in_rule__WebResourceCollection__Group__41976);
            rule__WebResourceCollection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__4"


    // $ANTLR start "rule__WebResourceCollection__Group__4__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:996:1: rule__WebResourceCollection__Group__4__Impl : ( ( rule__WebResourceCollection__UrlPatternAssignment_4 )* ) ;
    public final void rule__WebResourceCollection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1000:1: ( ( ( rule__WebResourceCollection__UrlPatternAssignment_4 )* ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1001:1: ( ( rule__WebResourceCollection__UrlPatternAssignment_4 )* )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1001:1: ( ( rule__WebResourceCollection__UrlPatternAssignment_4 )* )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1002:1: ( rule__WebResourceCollection__UrlPatternAssignment_4 )*
            {
             before(grammarAccess.getWebResourceCollectionAccess().getUrlPatternAssignment_4()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1003:1: ( rule__WebResourceCollection__UrlPatternAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1003:2: rule__WebResourceCollection__UrlPatternAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__WebResourceCollection__UrlPatternAssignment_4_in_rule__WebResourceCollection__Group__4__Impl2003);
            	    rule__WebResourceCollection__UrlPatternAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getWebResourceCollectionAccess().getUrlPatternAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__4__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__5"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1013:1: rule__WebResourceCollection__Group__5 : rule__WebResourceCollection__Group__5__Impl rule__WebResourceCollection__Group__6 ;
    public final void rule__WebResourceCollection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1017:1: ( rule__WebResourceCollection__Group__5__Impl rule__WebResourceCollection__Group__6 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1018:2: rule__WebResourceCollection__Group__5__Impl rule__WebResourceCollection__Group__6
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__5__Impl_in_rule__WebResourceCollection__Group__52034);
            rule__WebResourceCollection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebResourceCollection__Group__6_in_rule__WebResourceCollection__Group__52037);
            rule__WebResourceCollection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__5"


    // $ANTLR start "rule__WebResourceCollection__Group__5__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1025:1: rule__WebResourceCollection__Group__5__Impl : ( ( rule__WebResourceCollection__HttpMethodAssignment_5 )* ) ;
    public final void rule__WebResourceCollection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1029:1: ( ( ( rule__WebResourceCollection__HttpMethodAssignment_5 )* ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1030:1: ( ( rule__WebResourceCollection__HttpMethodAssignment_5 )* )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1030:1: ( ( rule__WebResourceCollection__HttpMethodAssignment_5 )* )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1031:1: ( rule__WebResourceCollection__HttpMethodAssignment_5 )*
            {
             before(grammarAccess.getWebResourceCollectionAccess().getHttpMethodAssignment_5()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1032:1: ( rule__WebResourceCollection__HttpMethodAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1032:2: rule__WebResourceCollection__HttpMethodAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__WebResourceCollection__HttpMethodAssignment_5_in_rule__WebResourceCollection__Group__5__Impl2064);
            	    rule__WebResourceCollection__HttpMethodAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getWebResourceCollectionAccess().getHttpMethodAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__5__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__6"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1042:1: rule__WebResourceCollection__Group__6 : rule__WebResourceCollection__Group__6__Impl rule__WebResourceCollection__Group__7 ;
    public final void rule__WebResourceCollection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1046:1: ( rule__WebResourceCollection__Group__6__Impl rule__WebResourceCollection__Group__7 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1047:2: rule__WebResourceCollection__Group__6__Impl rule__WebResourceCollection__Group__7
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__6__Impl_in_rule__WebResourceCollection__Group__62095);
            rule__WebResourceCollection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WebResourceCollection__Group__7_in_rule__WebResourceCollection__Group__62098);
            rule__WebResourceCollection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__6"


    // $ANTLR start "rule__WebResourceCollection__Group__6__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1054:1: rule__WebResourceCollection__Group__6__Impl : ( ( rule__WebResourceCollection__IdAssignment_6 )? ) ;
    public final void rule__WebResourceCollection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1058:1: ( ( ( rule__WebResourceCollection__IdAssignment_6 )? ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1059:1: ( ( rule__WebResourceCollection__IdAssignment_6 )? )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1059:1: ( ( rule__WebResourceCollection__IdAssignment_6 )? )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1060:1: ( rule__WebResourceCollection__IdAssignment_6 )?
            {
             before(grammarAccess.getWebResourceCollectionAccess().getIdAssignment_6()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1061:1: ( rule__WebResourceCollection__IdAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1061:2: rule__WebResourceCollection__IdAssignment_6
                    {
                    pushFollow(FOLLOW_rule__WebResourceCollection__IdAssignment_6_in_rule__WebResourceCollection__Group__6__Impl2125);
                    rule__WebResourceCollection__IdAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWebResourceCollectionAccess().getIdAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__6__Impl"


    // $ANTLR start "rule__WebResourceCollection__Group__7"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1071:1: rule__WebResourceCollection__Group__7 : rule__WebResourceCollection__Group__7__Impl ;
    public final void rule__WebResourceCollection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1075:1: ( rule__WebResourceCollection__Group__7__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1076:2: rule__WebResourceCollection__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__WebResourceCollection__Group__7__Impl_in_rule__WebResourceCollection__Group__72156);
            rule__WebResourceCollection__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__7"


    // $ANTLR start "rule__WebResourceCollection__Group__7__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1082:1: rule__WebResourceCollection__Group__7__Impl : ( '}' ) ;
    public final void rule__WebResourceCollection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1086:1: ( ( '}' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1087:1: ( '}' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1087:1: ( '}' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1088:1: '}'
            {
             before(grammarAccess.getWebResourceCollectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_16_in_rule__WebResourceCollection__Group__7__Impl2184); 
             after(grammarAccess.getWebResourceCollectionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__Group__7__Impl"


    // $ANTLR start "rule__UrlPattern__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1117:1: rule__UrlPattern__Group__0 : rule__UrlPattern__Group__0__Impl rule__UrlPattern__Group__1 ;
    public final void rule__UrlPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1121:1: ( rule__UrlPattern__Group__0__Impl rule__UrlPattern__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1122:2: rule__UrlPattern__Group__0__Impl rule__UrlPattern__Group__1
            {
            pushFollow(FOLLOW_rule__UrlPattern__Group__0__Impl_in_rule__UrlPattern__Group__02231);
            rule__UrlPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UrlPattern__Group__1_in_rule__UrlPattern__Group__02234);
            rule__UrlPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPattern__Group__0"


    // $ANTLR start "rule__UrlPattern__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1129:1: rule__UrlPattern__Group__0__Impl : ( 'url-pattern' ) ;
    public final void rule__UrlPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1133:1: ( ( 'url-pattern' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1134:1: ( 'url-pattern' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1134:1: ( 'url-pattern' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1135:1: 'url-pattern'
            {
             before(grammarAccess.getUrlPatternAccess().getUrlPatternKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__UrlPattern__Group__0__Impl2262); 
             after(grammarAccess.getUrlPatternAccess().getUrlPatternKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPattern__Group__0__Impl"


    // $ANTLR start "rule__UrlPattern__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1148:1: rule__UrlPattern__Group__1 : rule__UrlPattern__Group__1__Impl ;
    public final void rule__UrlPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1152:1: ( rule__UrlPattern__Group__1__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1153:2: rule__UrlPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UrlPattern__Group__1__Impl_in_rule__UrlPattern__Group__12293);
            rule__UrlPattern__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPattern__Group__1"


    // $ANTLR start "rule__UrlPattern__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1159:1: rule__UrlPattern__Group__1__Impl : ( ( rule__UrlPattern__ValueAssignment_1 ) ) ;
    public final void rule__UrlPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1163:1: ( ( ( rule__UrlPattern__ValueAssignment_1 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1164:1: ( ( rule__UrlPattern__ValueAssignment_1 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1164:1: ( ( rule__UrlPattern__ValueAssignment_1 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1165:1: ( rule__UrlPattern__ValueAssignment_1 )
            {
             before(grammarAccess.getUrlPatternAccess().getValueAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1166:1: ( rule__UrlPattern__ValueAssignment_1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1166:2: rule__UrlPattern__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__UrlPattern__ValueAssignment_1_in_rule__UrlPattern__Group__1__Impl2320);
            rule__UrlPattern__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUrlPatternAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPattern__Group__1__Impl"


    // $ANTLR start "rule__HttpMethod__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1180:1: rule__HttpMethod__Group__0 : rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 ;
    public final void rule__HttpMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1184:1: ( rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1185:2: rule__HttpMethod__Group__0__Impl rule__HttpMethod__Group__1
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__02354);
            rule__HttpMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__02357);
            rule__HttpMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__0"


    // $ANTLR start "rule__HttpMethod__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1192:1: rule__HttpMethod__Group__0__Impl : ( 'http-method' ) ;
    public final void rule__HttpMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1196:1: ( ( 'http-method' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1197:1: ( 'http-method' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1197:1: ( 'http-method' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1198:1: 'http-method'
            {
             before(grammarAccess.getHttpMethodAccess().getHttpMethodKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__HttpMethod__Group__0__Impl2385); 
             after(grammarAccess.getHttpMethodAccess().getHttpMethodKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__0__Impl"


    // $ANTLR start "rule__HttpMethod__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1211:1: rule__HttpMethod__Group__1 : rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 ;
    public final void rule__HttpMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1215:1: ( rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1216:2: rule__HttpMethod__Group__1__Impl rule__HttpMethod__Group__2
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__12416);
            rule__HttpMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__12419);
            rule__HttpMethod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__1"


    // $ANTLR start "rule__HttpMethod__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1223:1: rule__HttpMethod__Group__1__Impl : ( ( rule__HttpMethod__OmissionAssignment_1 ) ) ;
    public final void rule__HttpMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1227:1: ( ( ( rule__HttpMethod__OmissionAssignment_1 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1228:1: ( ( rule__HttpMethod__OmissionAssignment_1 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1228:1: ( ( rule__HttpMethod__OmissionAssignment_1 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1229:1: ( rule__HttpMethod__OmissionAssignment_1 )
            {
             before(grammarAccess.getHttpMethodAccess().getOmissionAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1230:1: ( rule__HttpMethod__OmissionAssignment_1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1230:2: rule__HttpMethod__OmissionAssignment_1
            {
            pushFollow(FOLLOW_rule__HttpMethod__OmissionAssignment_1_in_rule__HttpMethod__Group__1__Impl2446);
            rule__HttpMethod__OmissionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getOmissionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__1__Impl"


    // $ANTLR start "rule__HttpMethod__Group__2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1240:1: rule__HttpMethod__Group__2 : rule__HttpMethod__Group__2__Impl ;
    public final void rule__HttpMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1244:1: ( rule__HttpMethod__Group__2__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1245:2: rule__HttpMethod__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__22476);
            rule__HttpMethod__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__2"


    // $ANTLR start "rule__HttpMethod__Group__2__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1251:1: rule__HttpMethod__Group__2__Impl : ( ( rule__HttpMethod__NameAssignment_2 ) ) ;
    public final void rule__HttpMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1255:1: ( ( ( rule__HttpMethod__NameAssignment_2 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1256:1: ( ( rule__HttpMethod__NameAssignment_2 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1256:1: ( ( rule__HttpMethod__NameAssignment_2 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1257:1: ( rule__HttpMethod__NameAssignment_2 )
            {
             before(grammarAccess.getHttpMethodAccess().getNameAssignment_2()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1258:1: ( rule__HttpMethod__NameAssignment_2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1258:2: rule__HttpMethod__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HttpMethod__NameAssignment_2_in_rule__HttpMethod__Group__2__Impl2503);
            rule__HttpMethod__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHttpMethodAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__Group__2__Impl"


    // $ANTLR start "rule__AuthConstraint__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1274:1: rule__AuthConstraint__Group__0 : rule__AuthConstraint__Group__0__Impl rule__AuthConstraint__Group__1 ;
    public final void rule__AuthConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1278:1: ( rule__AuthConstraint__Group__0__Impl rule__AuthConstraint__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1279:2: rule__AuthConstraint__Group__0__Impl rule__AuthConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__AuthConstraint__Group__0__Impl_in_rule__AuthConstraint__Group__02539);
            rule__AuthConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthConstraint__Group__1_in_rule__AuthConstraint__Group__02542);
            rule__AuthConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__0"


    // $ANTLR start "rule__AuthConstraint__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1286:1: rule__AuthConstraint__Group__0__Impl : ( 'auth-constraint' ) ;
    public final void rule__AuthConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1290:1: ( ( 'auth-constraint' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1291:1: ( 'auth-constraint' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1291:1: ( 'auth-constraint' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1292:1: 'auth-constraint'
            {
             before(grammarAccess.getAuthConstraintAccess().getAuthConstraintKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__AuthConstraint__Group__0__Impl2570); 
             after(grammarAccess.getAuthConstraintAccess().getAuthConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__0__Impl"


    // $ANTLR start "rule__AuthConstraint__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1305:1: rule__AuthConstraint__Group__1 : rule__AuthConstraint__Group__1__Impl rule__AuthConstraint__Group__2 ;
    public final void rule__AuthConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1309:1: ( rule__AuthConstraint__Group__1__Impl rule__AuthConstraint__Group__2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1310:2: rule__AuthConstraint__Group__1__Impl rule__AuthConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__AuthConstraint__Group__1__Impl_in_rule__AuthConstraint__Group__12601);
            rule__AuthConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthConstraint__Group__2_in_rule__AuthConstraint__Group__12604);
            rule__AuthConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__1"


    // $ANTLR start "rule__AuthConstraint__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1317:1: rule__AuthConstraint__Group__1__Impl : ( '{' ) ;
    public final void rule__AuthConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1321:1: ( ( '{' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1322:1: ( '{' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1322:1: ( '{' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1323:1: '{'
            {
             before(grammarAccess.getAuthConstraintAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__AuthConstraint__Group__1__Impl2632); 
             after(grammarAccess.getAuthConstraintAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__1__Impl"


    // $ANTLR start "rule__AuthConstraint__Group__2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1336:1: rule__AuthConstraint__Group__2 : rule__AuthConstraint__Group__2__Impl rule__AuthConstraint__Group__3 ;
    public final void rule__AuthConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1340:1: ( rule__AuthConstraint__Group__2__Impl rule__AuthConstraint__Group__3 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1341:2: rule__AuthConstraint__Group__2__Impl rule__AuthConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__AuthConstraint__Group__2__Impl_in_rule__AuthConstraint__Group__22663);
            rule__AuthConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthConstraint__Group__3_in_rule__AuthConstraint__Group__22666);
            rule__AuthConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__2"


    // $ANTLR start "rule__AuthConstraint__Group__2__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1348:1: rule__AuthConstraint__Group__2__Impl : ( ( rule__AuthConstraint__RoleNameAssignment_2 )* ) ;
    public final void rule__AuthConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1352:1: ( ( ( rule__AuthConstraint__RoleNameAssignment_2 )* ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1353:1: ( ( rule__AuthConstraint__RoleNameAssignment_2 )* )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1353:1: ( ( rule__AuthConstraint__RoleNameAssignment_2 )* )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1354:1: ( rule__AuthConstraint__RoleNameAssignment_2 )*
            {
             before(grammarAccess.getAuthConstraintAccess().getRoleNameAssignment_2()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1355:1: ( rule__AuthConstraint__RoleNameAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1355:2: rule__AuthConstraint__RoleNameAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__AuthConstraint__RoleNameAssignment_2_in_rule__AuthConstraint__Group__2__Impl2693);
            	    rule__AuthConstraint__RoleNameAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAuthConstraintAccess().getRoleNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__2__Impl"


    // $ANTLR start "rule__AuthConstraint__Group__3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1365:1: rule__AuthConstraint__Group__3 : rule__AuthConstraint__Group__3__Impl rule__AuthConstraint__Group__4 ;
    public final void rule__AuthConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1369:1: ( rule__AuthConstraint__Group__3__Impl rule__AuthConstraint__Group__4 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1370:2: rule__AuthConstraint__Group__3__Impl rule__AuthConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__AuthConstraint__Group__3__Impl_in_rule__AuthConstraint__Group__32724);
            rule__AuthConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthConstraint__Group__4_in_rule__AuthConstraint__Group__32727);
            rule__AuthConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__3"


    // $ANTLR start "rule__AuthConstraint__Group__3__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1377:1: rule__AuthConstraint__Group__3__Impl : ( ( rule__AuthConstraint__IdAssignment_3 )? ) ;
    public final void rule__AuthConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1381:1: ( ( ( rule__AuthConstraint__IdAssignment_3 )? ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1382:1: ( ( rule__AuthConstraint__IdAssignment_3 )? )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1382:1: ( ( rule__AuthConstraint__IdAssignment_3 )? )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1383:1: ( rule__AuthConstraint__IdAssignment_3 )?
            {
             before(grammarAccess.getAuthConstraintAccess().getIdAssignment_3()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1384:1: ( rule__AuthConstraint__IdAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1384:2: rule__AuthConstraint__IdAssignment_3
                    {
                    pushFollow(FOLLOW_rule__AuthConstraint__IdAssignment_3_in_rule__AuthConstraint__Group__3__Impl2754);
                    rule__AuthConstraint__IdAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthConstraintAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__3__Impl"


    // $ANTLR start "rule__AuthConstraint__Group__4"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1394:1: rule__AuthConstraint__Group__4 : rule__AuthConstraint__Group__4__Impl ;
    public final void rule__AuthConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1398:1: ( rule__AuthConstraint__Group__4__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1399:2: rule__AuthConstraint__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AuthConstraint__Group__4__Impl_in_rule__AuthConstraint__Group__42785);
            rule__AuthConstraint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__4"


    // $ANTLR start "rule__AuthConstraint__Group__4__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1405:1: rule__AuthConstraint__Group__4__Impl : ( '}' ) ;
    public final void rule__AuthConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1409:1: ( ( '}' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1410:1: ( '}' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1410:1: ( '}' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1411:1: '}'
            {
             before(grammarAccess.getAuthConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__AuthConstraint__Group__4__Impl2813); 
             after(grammarAccess.getAuthConstraintAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__Group__4__Impl"


    // $ANTLR start "rule__RoleName__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1434:1: rule__RoleName__Group__0 : rule__RoleName__Group__0__Impl rule__RoleName__Group__1 ;
    public final void rule__RoleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1438:1: ( rule__RoleName__Group__0__Impl rule__RoleName__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1439:2: rule__RoleName__Group__0__Impl rule__RoleName__Group__1
            {
            pushFollow(FOLLOW_rule__RoleName__Group__0__Impl_in_rule__RoleName__Group__02854);
            rule__RoleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RoleName__Group__1_in_rule__RoleName__Group__02857);
            rule__RoleName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleName__Group__0"


    // $ANTLR start "rule__RoleName__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1446:1: rule__RoleName__Group__0__Impl : ( 'role-name' ) ;
    public final void rule__RoleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1450:1: ( ( 'role-name' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1451:1: ( 'role-name' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1451:1: ( 'role-name' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1452:1: 'role-name'
            {
             before(grammarAccess.getRoleNameAccess().getRoleNameKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__RoleName__Group__0__Impl2885); 
             after(grammarAccess.getRoleNameAccess().getRoleNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleName__Group__0__Impl"


    // $ANTLR start "rule__RoleName__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1465:1: rule__RoleName__Group__1 : rule__RoleName__Group__1__Impl ;
    public final void rule__RoleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1469:1: ( rule__RoleName__Group__1__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1470:2: rule__RoleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RoleName__Group__1__Impl_in_rule__RoleName__Group__12916);
            rule__RoleName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleName__Group__1"


    // $ANTLR start "rule__RoleName__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1476:1: rule__RoleName__Group__1__Impl : ( ( rule__RoleName__NameAssignment_1 ) ) ;
    public final void rule__RoleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1480:1: ( ( ( rule__RoleName__NameAssignment_1 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1481:1: ( ( rule__RoleName__NameAssignment_1 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1481:1: ( ( rule__RoleName__NameAssignment_1 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1482:1: ( rule__RoleName__NameAssignment_1 )
            {
             before(grammarAccess.getRoleNameAccess().getNameAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1483:1: ( rule__RoleName__NameAssignment_1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1483:2: rule__RoleName__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RoleName__NameAssignment_1_in_rule__RoleName__Group__1__Impl2943);
            rule__RoleName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleName__Group__1__Impl"


    // $ANTLR start "rule__UserDataConstraint__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1497:1: rule__UserDataConstraint__Group__0 : rule__UserDataConstraint__Group__0__Impl rule__UserDataConstraint__Group__1 ;
    public final void rule__UserDataConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1501:1: ( rule__UserDataConstraint__Group__0__Impl rule__UserDataConstraint__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1502:2: rule__UserDataConstraint__Group__0__Impl rule__UserDataConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__UserDataConstraint__Group__0__Impl_in_rule__UserDataConstraint__Group__02977);
            rule__UserDataConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDataConstraint__Group__1_in_rule__UserDataConstraint__Group__02980);
            rule__UserDataConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__0"


    // $ANTLR start "rule__UserDataConstraint__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1509:1: rule__UserDataConstraint__Group__0__Impl : ( 'user-data-constraint' ) ;
    public final void rule__UserDataConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1513:1: ( ( 'user-data-constraint' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1514:1: ( 'user-data-constraint' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1514:1: ( 'user-data-constraint' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1515:1: 'user-data-constraint'
            {
             before(grammarAccess.getUserDataConstraintAccess().getUserDataConstraintKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__UserDataConstraint__Group__0__Impl3008); 
             after(grammarAccess.getUserDataConstraintAccess().getUserDataConstraintKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__0__Impl"


    // $ANTLR start "rule__UserDataConstraint__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1528:1: rule__UserDataConstraint__Group__1 : rule__UserDataConstraint__Group__1__Impl rule__UserDataConstraint__Group__2 ;
    public final void rule__UserDataConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1532:1: ( rule__UserDataConstraint__Group__1__Impl rule__UserDataConstraint__Group__2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1533:2: rule__UserDataConstraint__Group__1__Impl rule__UserDataConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__UserDataConstraint__Group__1__Impl_in_rule__UserDataConstraint__Group__13039);
            rule__UserDataConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDataConstraint__Group__2_in_rule__UserDataConstraint__Group__13042);
            rule__UserDataConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__1"


    // $ANTLR start "rule__UserDataConstraint__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1540:1: rule__UserDataConstraint__Group__1__Impl : ( '{' ) ;
    public final void rule__UserDataConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1544:1: ( ( '{' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1545:1: ( '{' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1545:1: ( '{' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1546:1: '{'
            {
             before(grammarAccess.getUserDataConstraintAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__UserDataConstraint__Group__1__Impl3070); 
             after(grammarAccess.getUserDataConstraintAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__1__Impl"


    // $ANTLR start "rule__UserDataConstraint__Group__2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1559:1: rule__UserDataConstraint__Group__2 : rule__UserDataConstraint__Group__2__Impl rule__UserDataConstraint__Group__3 ;
    public final void rule__UserDataConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1563:1: ( rule__UserDataConstraint__Group__2__Impl rule__UserDataConstraint__Group__3 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1564:2: rule__UserDataConstraint__Group__2__Impl rule__UserDataConstraint__Group__3
            {
            pushFollow(FOLLOW_rule__UserDataConstraint__Group__2__Impl_in_rule__UserDataConstraint__Group__23101);
            rule__UserDataConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDataConstraint__Group__3_in_rule__UserDataConstraint__Group__23104);
            rule__UserDataConstraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__2"


    // $ANTLR start "rule__UserDataConstraint__Group__2__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1571:1: rule__UserDataConstraint__Group__2__Impl : ( ( rule__UserDataConstraint__TransportGuaranteeAssignment_2 ) ) ;
    public final void rule__UserDataConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1575:1: ( ( ( rule__UserDataConstraint__TransportGuaranteeAssignment_2 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1576:1: ( ( rule__UserDataConstraint__TransportGuaranteeAssignment_2 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1576:1: ( ( rule__UserDataConstraint__TransportGuaranteeAssignment_2 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1577:1: ( rule__UserDataConstraint__TransportGuaranteeAssignment_2 )
            {
             before(grammarAccess.getUserDataConstraintAccess().getTransportGuaranteeAssignment_2()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1578:1: ( rule__UserDataConstraint__TransportGuaranteeAssignment_2 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1578:2: rule__UserDataConstraint__TransportGuaranteeAssignment_2
            {
            pushFollow(FOLLOW_rule__UserDataConstraint__TransportGuaranteeAssignment_2_in_rule__UserDataConstraint__Group__2__Impl3131);
            rule__UserDataConstraint__TransportGuaranteeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUserDataConstraintAccess().getTransportGuaranteeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__2__Impl"


    // $ANTLR start "rule__UserDataConstraint__Group__3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1588:1: rule__UserDataConstraint__Group__3 : rule__UserDataConstraint__Group__3__Impl rule__UserDataConstraint__Group__4 ;
    public final void rule__UserDataConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1592:1: ( rule__UserDataConstraint__Group__3__Impl rule__UserDataConstraint__Group__4 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1593:2: rule__UserDataConstraint__Group__3__Impl rule__UserDataConstraint__Group__4
            {
            pushFollow(FOLLOW_rule__UserDataConstraint__Group__3__Impl_in_rule__UserDataConstraint__Group__33161);
            rule__UserDataConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserDataConstraint__Group__4_in_rule__UserDataConstraint__Group__33164);
            rule__UserDataConstraint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__3"


    // $ANTLR start "rule__UserDataConstraint__Group__3__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1600:1: rule__UserDataConstraint__Group__3__Impl : ( ( rule__UserDataConstraint__IdAssignment_3 )? ) ;
    public final void rule__UserDataConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1604:1: ( ( ( rule__UserDataConstraint__IdAssignment_3 )? ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1605:1: ( ( rule__UserDataConstraint__IdAssignment_3 )? )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1605:1: ( ( rule__UserDataConstraint__IdAssignment_3 )? )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1606:1: ( rule__UserDataConstraint__IdAssignment_3 )?
            {
             before(grammarAccess.getUserDataConstraintAccess().getIdAssignment_3()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1607:1: ( rule__UserDataConstraint__IdAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1607:2: rule__UserDataConstraint__IdAssignment_3
                    {
                    pushFollow(FOLLOW_rule__UserDataConstraint__IdAssignment_3_in_rule__UserDataConstraint__Group__3__Impl3191);
                    rule__UserDataConstraint__IdAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUserDataConstraintAccess().getIdAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__3__Impl"


    // $ANTLR start "rule__UserDataConstraint__Group__4"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1617:1: rule__UserDataConstraint__Group__4 : rule__UserDataConstraint__Group__4__Impl ;
    public final void rule__UserDataConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1621:1: ( rule__UserDataConstraint__Group__4__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1622:2: rule__UserDataConstraint__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UserDataConstraint__Group__4__Impl_in_rule__UserDataConstraint__Group__43222);
            rule__UserDataConstraint__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__4"


    // $ANTLR start "rule__UserDataConstraint__Group__4__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1628:1: rule__UserDataConstraint__Group__4__Impl : ( '}' ) ;
    public final void rule__UserDataConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1632:1: ( ( '}' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1633:1: ( '}' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1633:1: ( '}' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1634:1: '}'
            {
             before(grammarAccess.getUserDataConstraintAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__UserDataConstraint__Group__4__Impl3250); 
             after(grammarAccess.getUserDataConstraintAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__Group__4__Impl"


    // $ANTLR start "rule__TransportGuarantee__Group__0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1657:1: rule__TransportGuarantee__Group__0 : rule__TransportGuarantee__Group__0__Impl rule__TransportGuarantee__Group__1 ;
    public final void rule__TransportGuarantee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1661:1: ( rule__TransportGuarantee__Group__0__Impl rule__TransportGuarantee__Group__1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1662:2: rule__TransportGuarantee__Group__0__Impl rule__TransportGuarantee__Group__1
            {
            pushFollow(FOLLOW_rule__TransportGuarantee__Group__0__Impl_in_rule__TransportGuarantee__Group__03291);
            rule__TransportGuarantee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TransportGuarantee__Group__1_in_rule__TransportGuarantee__Group__03294);
            rule__TransportGuarantee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportGuarantee__Group__0"


    // $ANTLR start "rule__TransportGuarantee__Group__0__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1669:1: rule__TransportGuarantee__Group__0__Impl : ( 'transport-guarantee' ) ;
    public final void rule__TransportGuarantee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1673:1: ( ( 'transport-guarantee' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1674:1: ( 'transport-guarantee' )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1674:1: ( 'transport-guarantee' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1675:1: 'transport-guarantee'
            {
             before(grammarAccess.getTransportGuaranteeAccess().getTransportGuaranteeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TransportGuarantee__Group__0__Impl3322); 
             after(grammarAccess.getTransportGuaranteeAccess().getTransportGuaranteeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportGuarantee__Group__0__Impl"


    // $ANTLR start "rule__TransportGuarantee__Group__1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1688:1: rule__TransportGuarantee__Group__1 : rule__TransportGuarantee__Group__1__Impl ;
    public final void rule__TransportGuarantee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1692:1: ( rule__TransportGuarantee__Group__1__Impl )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1693:2: rule__TransportGuarantee__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TransportGuarantee__Group__1__Impl_in_rule__TransportGuarantee__Group__13353);
            rule__TransportGuarantee__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportGuarantee__Group__1"


    // $ANTLR start "rule__TransportGuarantee__Group__1__Impl"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1699:1: rule__TransportGuarantee__Group__1__Impl : ( ( rule__TransportGuarantee__RestrictionAssignment_1 ) ) ;
    public final void rule__TransportGuarantee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1703:1: ( ( ( rule__TransportGuarantee__RestrictionAssignment_1 ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1704:1: ( ( rule__TransportGuarantee__RestrictionAssignment_1 ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1704:1: ( ( rule__TransportGuarantee__RestrictionAssignment_1 ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1705:1: ( rule__TransportGuarantee__RestrictionAssignment_1 )
            {
             before(grammarAccess.getTransportGuaranteeAccess().getRestrictionAssignment_1()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1706:1: ( rule__TransportGuarantee__RestrictionAssignment_1 )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1706:2: rule__TransportGuarantee__RestrictionAssignment_1
            {
            pushFollow(FOLLOW_rule__TransportGuarantee__RestrictionAssignment_1_in_rule__TransportGuarantee__Group__1__Impl3380);
            rule__TransportGuarantee__RestrictionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransportGuaranteeAccess().getRestrictionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportGuarantee__Group__1__Impl"


    // $ANTLR start "rule__Security__RoleAssignment_0"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1721:1: rule__Security__RoleAssignment_0 : ( ruleSecurityRole ) ;
    public final void rule__Security__RoleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1725:1: ( ( ruleSecurityRole ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1726:1: ( ruleSecurityRole )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1726:1: ( ruleSecurityRole )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1727:1: ruleSecurityRole
            {
             before(grammarAccess.getSecurityAccess().getRoleSecurityRoleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSecurityRole_in_rule__Security__RoleAssignment_03419);
            ruleSecurityRole();

            state._fsp--;

             after(grammarAccess.getSecurityAccess().getRoleSecurityRoleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Security__RoleAssignment_0"


    // $ANTLR start "rule__Security__ConstraintAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1736:1: rule__Security__ConstraintAssignment_1 : ( ruleSecurityConstraint ) ;
    public final void rule__Security__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1740:1: ( ( ruleSecurityConstraint ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1741:1: ( ruleSecurityConstraint )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1741:1: ( ruleSecurityConstraint )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1742:1: ruleSecurityConstraint
            {
             before(grammarAccess.getSecurityAccess().getConstraintSecurityConstraintParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSecurityConstraint_in_rule__Security__ConstraintAssignment_13450);
            ruleSecurityConstraint();

            state._fsp--;

             after(grammarAccess.getSecurityAccess().getConstraintSecurityConstraintParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Security__ConstraintAssignment_1"


    // $ANTLR start "rule__SecurityRole__NameAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1751:1: rule__SecurityRole__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SecurityRole__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1755:1: ( ( RULE_ID ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1756:1: ( RULE_ID )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1756:1: ( RULE_ID )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1757:1: RULE_ID
            {
             before(grammarAccess.getSecurityRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityRole__NameAssignment_13481); 
             after(grammarAccess.getSecurityRoleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityRole__NameAssignment_1"


    // $ANTLR start "rule__SecurityConstraint__DisplayNameAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1766:1: rule__SecurityConstraint__DisplayNameAssignment_1 : ( ruleDisplayName ) ;
    public final void rule__SecurityConstraint__DisplayNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1770:1: ( ( ruleDisplayName ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1771:1: ( ruleDisplayName )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1771:1: ( ruleDisplayName )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1772:1: ruleDisplayName
            {
             before(grammarAccess.getSecurityConstraintAccess().getDisplayNameDisplayNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDisplayName_in_rule__SecurityConstraint__DisplayNameAssignment_13512);
            ruleDisplayName();

            state._fsp--;

             after(grammarAccess.getSecurityConstraintAccess().getDisplayNameDisplayNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__DisplayNameAssignment_1"


    // $ANTLR start "rule__SecurityConstraint__WebResourceCollectionAssignment_2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1781:1: rule__SecurityConstraint__WebResourceCollectionAssignment_2 : ( ruleWebResourceCollection ) ;
    public final void rule__SecurityConstraint__WebResourceCollectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1785:1: ( ( ruleWebResourceCollection ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1786:1: ( ruleWebResourceCollection )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1786:1: ( ruleWebResourceCollection )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1787:1: ruleWebResourceCollection
            {
             before(grammarAccess.getSecurityConstraintAccess().getWebResourceCollectionWebResourceCollectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleWebResourceCollection_in_rule__SecurityConstraint__WebResourceCollectionAssignment_23543);
            ruleWebResourceCollection();

            state._fsp--;

             after(grammarAccess.getSecurityConstraintAccess().getWebResourceCollectionWebResourceCollectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__WebResourceCollectionAssignment_2"


    // $ANTLR start "rule__SecurityConstraint__AuthConstraintAssignment_3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1796:1: rule__SecurityConstraint__AuthConstraintAssignment_3 : ( ruleAuthConstraint ) ;
    public final void rule__SecurityConstraint__AuthConstraintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1800:1: ( ( ruleAuthConstraint ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1801:1: ( ruleAuthConstraint )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1801:1: ( ruleAuthConstraint )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1802:1: ruleAuthConstraint
            {
             before(grammarAccess.getSecurityConstraintAccess().getAuthConstraintAuthConstraintParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAuthConstraint_in_rule__SecurityConstraint__AuthConstraintAssignment_33574);
            ruleAuthConstraint();

            state._fsp--;

             after(grammarAccess.getSecurityConstraintAccess().getAuthConstraintAuthConstraintParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__AuthConstraintAssignment_3"


    // $ANTLR start "rule__SecurityConstraint__UserDataConstraintAssignment_4"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1811:1: rule__SecurityConstraint__UserDataConstraintAssignment_4 : ( ruleUserDataConstraint ) ;
    public final void rule__SecurityConstraint__UserDataConstraintAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1815:1: ( ( ruleUserDataConstraint ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1816:1: ( ruleUserDataConstraint )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1816:1: ( ruleUserDataConstraint )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1817:1: ruleUserDataConstraint
            {
             before(grammarAccess.getSecurityConstraintAccess().getUserDataConstraintUserDataConstraintParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUserDataConstraint_in_rule__SecurityConstraint__UserDataConstraintAssignment_43605);
            ruleUserDataConstraint();

            state._fsp--;

             after(grammarAccess.getSecurityConstraintAccess().getUserDataConstraintUserDataConstraintParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__UserDataConstraintAssignment_4"


    // $ANTLR start "rule__SecurityConstraint__IdAssignment_5"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1826:1: rule__SecurityConstraint__IdAssignment_5 : ( ruleIdentifier ) ;
    public final void rule__SecurityConstraint__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1830:1: ( ( ruleIdentifier ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1831:1: ( ruleIdentifier )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1831:1: ( ruleIdentifier )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1832:1: ruleIdentifier
            {
             before(grammarAccess.getSecurityConstraintAccess().getIdIdentifierParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__SecurityConstraint__IdAssignment_53636);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getSecurityConstraintAccess().getIdIdentifierParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityConstraint__IdAssignment_5"


    // $ANTLR start "rule__Identifier__NameAssignment"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1841:1: rule__Identifier__NameAssignment : ( RULE_ID ) ;
    public final void rule__Identifier__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1845:1: ( ( RULE_ID ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1846:1: ( RULE_ID )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1846:1: ( RULE_ID )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1847:1: RULE_ID
            {
             before(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__NameAssignment3667); 
             after(grammarAccess.getIdentifierAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__NameAssignment"


    // $ANTLR start "rule__DisplayName__ValueAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1856:1: rule__DisplayName__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DisplayName__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1860:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1861:1: ( RULE_STRING )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1861:1: ( RULE_STRING )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1862:1: RULE_STRING
            {
             before(grammarAccess.getDisplayNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DisplayName__ValueAssignment_13698); 
             after(grammarAccess.getDisplayNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DisplayName__ValueAssignment_1"


    // $ANTLR start "rule__WebResourceCollection__WebResourceNameAssignment_3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1871:1: rule__WebResourceCollection__WebResourceNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__WebResourceCollection__WebResourceNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1875:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1876:1: ( RULE_STRING )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1876:1: ( RULE_STRING )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1877:1: RULE_STRING
            {
             before(grammarAccess.getWebResourceCollectionAccess().getWebResourceNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__WebResourceCollection__WebResourceNameAssignment_33729); 
             after(grammarAccess.getWebResourceCollectionAccess().getWebResourceNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__WebResourceNameAssignment_3"


    // $ANTLR start "rule__WebResourceCollection__UrlPatternAssignment_4"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1886:1: rule__WebResourceCollection__UrlPatternAssignment_4 : ( ruleUrlPattern ) ;
    public final void rule__WebResourceCollection__UrlPatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1890:1: ( ( ruleUrlPattern ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1891:1: ( ruleUrlPattern )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1891:1: ( ruleUrlPattern )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1892:1: ruleUrlPattern
            {
             before(grammarAccess.getWebResourceCollectionAccess().getUrlPatternUrlPatternParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUrlPattern_in_rule__WebResourceCollection__UrlPatternAssignment_43760);
            ruleUrlPattern();

            state._fsp--;

             after(grammarAccess.getWebResourceCollectionAccess().getUrlPatternUrlPatternParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__UrlPatternAssignment_4"


    // $ANTLR start "rule__WebResourceCollection__HttpMethodAssignment_5"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1901:1: rule__WebResourceCollection__HttpMethodAssignment_5 : ( ruleHttpMethod ) ;
    public final void rule__WebResourceCollection__HttpMethodAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1905:1: ( ( ruleHttpMethod ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1906:1: ( ruleHttpMethod )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1906:1: ( ruleHttpMethod )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1907:1: ruleHttpMethod
            {
             before(grammarAccess.getWebResourceCollectionAccess().getHttpMethodHttpMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleHttpMethod_in_rule__WebResourceCollection__HttpMethodAssignment_53791);
            ruleHttpMethod();

            state._fsp--;

             after(grammarAccess.getWebResourceCollectionAccess().getHttpMethodHttpMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__HttpMethodAssignment_5"


    // $ANTLR start "rule__WebResourceCollection__IdAssignment_6"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1916:1: rule__WebResourceCollection__IdAssignment_6 : ( ruleIdentifier ) ;
    public final void rule__WebResourceCollection__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1920:1: ( ( ruleIdentifier ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1921:1: ( ruleIdentifier )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1921:1: ( ruleIdentifier )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1922:1: ruleIdentifier
            {
             before(grammarAccess.getWebResourceCollectionAccess().getIdIdentifierParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__WebResourceCollection__IdAssignment_63822);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getWebResourceCollectionAccess().getIdIdentifierParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WebResourceCollection__IdAssignment_6"


    // $ANTLR start "rule__UrlPattern__ValueAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1931:1: rule__UrlPattern__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__UrlPattern__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1935:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1936:1: ( RULE_STRING )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1936:1: ( RULE_STRING )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1937:1: RULE_STRING
            {
             before(grammarAccess.getUrlPatternAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UrlPattern__ValueAssignment_13853); 
             after(grammarAccess.getUrlPatternAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlPattern__ValueAssignment_1"


    // $ANTLR start "rule__HttpMethod__OmissionAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1946:1: rule__HttpMethod__OmissionAssignment_1 : ( ( 'omission' ) ) ;
    public final void rule__HttpMethod__OmissionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1950:1: ( ( ( 'omission' ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1951:1: ( ( 'omission' ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1951:1: ( ( 'omission' ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1952:1: ( 'omission' )
            {
             before(grammarAccess.getHttpMethodAccess().getOmissionOmissionKeyword_1_0()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1953:1: ( 'omission' )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1954:1: 'omission'
            {
             before(grammarAccess.getHttpMethodAccess().getOmissionOmissionKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__HttpMethod__OmissionAssignment_13889); 
             after(grammarAccess.getHttpMethodAccess().getOmissionOmissionKeyword_1_0()); 

            }

             after(grammarAccess.getHttpMethodAccess().getOmissionOmissionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__OmissionAssignment_1"


    // $ANTLR start "rule__HttpMethod__NameAssignment_2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1969:1: rule__HttpMethod__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__HttpMethod__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1973:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1974:1: ( RULE_STRING )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1974:1: ( RULE_STRING )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1975:1: RULE_STRING
            {
             before(grammarAccess.getHttpMethodAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__HttpMethod__NameAssignment_23928); 
             after(grammarAccess.getHttpMethodAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HttpMethod__NameAssignment_2"


    // $ANTLR start "rule__AuthConstraint__RoleNameAssignment_2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1984:1: rule__AuthConstraint__RoleNameAssignment_2 : ( ruleRoleName ) ;
    public final void rule__AuthConstraint__RoleNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1988:1: ( ( ruleRoleName ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1989:1: ( ruleRoleName )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1989:1: ( ruleRoleName )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1990:1: ruleRoleName
            {
             before(grammarAccess.getAuthConstraintAccess().getRoleNameRoleNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRoleName_in_rule__AuthConstraint__RoleNameAssignment_23959);
            ruleRoleName();

            state._fsp--;

             after(grammarAccess.getAuthConstraintAccess().getRoleNameRoleNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__RoleNameAssignment_2"


    // $ANTLR start "rule__AuthConstraint__IdAssignment_3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:1999:1: rule__AuthConstraint__IdAssignment_3 : ( ruleIdentifier ) ;
    public final void rule__AuthConstraint__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2003:1: ( ( ruleIdentifier ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2004:1: ( ruleIdentifier )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2004:1: ( ruleIdentifier )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2005:1: ruleIdentifier
            {
             before(grammarAccess.getAuthConstraintAccess().getIdIdentifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__AuthConstraint__IdAssignment_33990);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getAuthConstraintAccess().getIdIdentifierParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthConstraint__IdAssignment_3"


    // $ANTLR start "rule__RoleName__NameAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2014:1: rule__RoleName__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RoleName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2018:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2019:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2019:1: ( ( RULE_ID ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2020:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleNameAccess().getNameSecurityRoleCrossReference_1_0()); 
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2021:1: ( RULE_ID )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2022:1: RULE_ID
            {
             before(grammarAccess.getRoleNameAccess().getNameSecurityRoleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RoleName__NameAssignment_14025); 
             after(grammarAccess.getRoleNameAccess().getNameSecurityRoleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRoleNameAccess().getNameSecurityRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoleName__NameAssignment_1"


    // $ANTLR start "rule__UserDataConstraint__TransportGuaranteeAssignment_2"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2033:1: rule__UserDataConstraint__TransportGuaranteeAssignment_2 : ( ruleTransportGuarantee ) ;
    public final void rule__UserDataConstraint__TransportGuaranteeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2037:1: ( ( ruleTransportGuarantee ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2038:1: ( ruleTransportGuarantee )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2038:1: ( ruleTransportGuarantee )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2039:1: ruleTransportGuarantee
            {
             before(grammarAccess.getUserDataConstraintAccess().getTransportGuaranteeTransportGuaranteeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTransportGuarantee_in_rule__UserDataConstraint__TransportGuaranteeAssignment_24060);
            ruleTransportGuarantee();

            state._fsp--;

             after(grammarAccess.getUserDataConstraintAccess().getTransportGuaranteeTransportGuaranteeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__TransportGuaranteeAssignment_2"


    // $ANTLR start "rule__UserDataConstraint__IdAssignment_3"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2048:1: rule__UserDataConstraint__IdAssignment_3 : ( ruleIdentifier ) ;
    public final void rule__UserDataConstraint__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2052:1: ( ( ruleIdentifier ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2053:1: ( ruleIdentifier )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2053:1: ( ruleIdentifier )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2054:1: ruleIdentifier
            {
             before(grammarAccess.getUserDataConstraintAccess().getIdIdentifierParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIdentifier_in_rule__UserDataConstraint__IdAssignment_34091);
            ruleIdentifier();

            state._fsp--;

             after(grammarAccess.getUserDataConstraintAccess().getIdIdentifierParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserDataConstraint__IdAssignment_3"


    // $ANTLR start "rule__TransportGuarantee__RestrictionAssignment_1"
    // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2063:1: rule__TransportGuarantee__RestrictionAssignment_1 : ( ruleRestrictionType ) ;
    public final void rule__TransportGuarantee__RestrictionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2067:1: ( ( ruleRestrictionType ) )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2068:1: ( ruleRestrictionType )
            {
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2068:1: ( ruleRestrictionType )
            // ../org.xtext.example.security.ui/src-gen/org/xtext/example/security/ui/contentassist/antlr/internal/InternalSecurity.g:2069:1: ruleRestrictionType
            {
             before(grammarAccess.getTransportGuaranteeAccess().getRestrictionRestrictionTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRestrictionType_in_rule__TransportGuarantee__RestrictionAssignment_14122);
            ruleRestrictionType();

            state._fsp--;

             after(grammarAccess.getTransportGuaranteeAccess().getRestrictionRestrictionTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransportGuarantee__RestrictionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSecurity_in_entryRuleSecurity61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurity68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Security__Group__0_in_ruleSecurity94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRole_in_entryRuleSecurityRole121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityRole128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRole__Group__0_in_ruleSecurityRole154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityConstraint_in_entryRuleSecurityConstraint181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityConstraint188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__0_in_ruleSecurityConstraint214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__NameAssignment_in_ruleIdentifier274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayName_in_entryRuleDisplayName301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisplayName308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayName__Group__0_in_ruleDisplayName334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebResourceCollection_in_entryRuleWebResourceCollection361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWebResourceCollection368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__0_in_ruleWebResourceCollection394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPattern_in_entryRuleUrlPattern421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUrlPattern428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlPattern__Group__0_in_ruleUrlPattern454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_entryRuleHttpMethod481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHttpMethod488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0_in_ruleHttpMethod514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthConstraint_in_entryRuleAuthConstraint541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthConstraint548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__0_in_ruleAuthConstraint574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleName_in_entryRuleRoleName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoleName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleName__Group__0_in_ruleRoleName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDataConstraint_in_entryRuleUserDataConstraint661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserDataConstraint668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__0_in_ruleUserDataConstraint694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransportGuarantee_in_entryRuleTransportGuarantee721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransportGuarantee728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransportGuarantee__Group__0_in_ruleTransportGuarantee754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestrictionType__Alternatives_in_ruleRestrictionType791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RestrictionType__Alternatives827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RestrictionType__Alternatives848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RestrictionType__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Security__Group__0__Impl_in_rule__Security__Group__0902 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Security__Group__1_in_rule__Security__Group__0905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Security__RoleAssignment_0_in_rule__Security__Group__0__Impl932 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Security__Group__1__Impl_in_rule__Security__Group__1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Security__ConstraintAssignment_1_in_rule__Security__Group__1__Impl990 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__SecurityRole__Group__0__Impl_in_rule__SecurityRole__Group__01025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SecurityRole__Group__1_in_rule__SecurityRole__Group__01028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SecurityRole__Group__0__Impl1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRole__Group__1__Impl_in_rule__SecurityRole__Group__11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRole__NameAssignment_1_in_rule__SecurityRole__Group__1__Impl1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__0__Impl_in_rule__SecurityConstraint__Group__01148 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__1_in_rule__SecurityConstraint__Group__01151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SecurityConstraint__Group__0__Impl1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__1__Impl_in_rule__SecurityConstraint__Group__11210 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__2_in_rule__SecurityConstraint__Group__11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__DisplayNameAssignment_1_in_rule__SecurityConstraint__Group__1__Impl1240 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__2__Impl_in_rule__SecurityConstraint__Group__21271 = new BitSet(new long[]{0x0000000002810010L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__3_in_rule__SecurityConstraint__Group__21274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__WebResourceCollectionAssignment_2_in_rule__SecurityConstraint__Group__2__Impl1303 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__WebResourceCollectionAssignment_2_in_rule__SecurityConstraint__Group__2__Impl1315 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__3__Impl_in_rule__SecurityConstraint__Group__31348 = new BitSet(new long[]{0x0000000002810010L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__4_in_rule__SecurityConstraint__Group__31351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__AuthConstraintAssignment_3_in_rule__SecurityConstraint__Group__3__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__4__Impl_in_rule__SecurityConstraint__Group__41409 = new BitSet(new long[]{0x0000000002810010L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__5_in_rule__SecurityConstraint__Group__41412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__UserDataConstraintAssignment_4_in_rule__SecurityConstraint__Group__4__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__5__Impl_in_rule__SecurityConstraint__Group__51470 = new BitSet(new long[]{0x0000000002810010L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__6_in_rule__SecurityConstraint__Group__51473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__IdAssignment_5_in_rule__SecurityConstraint__Group__5__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityConstraint__Group__6__Impl_in_rule__SecurityConstraint__Group__61531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SecurityConstraint__Group__6__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayName__Group__0__Impl_in_rule__DisplayName__Group__01604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DisplayName__Group__1_in_rule__DisplayName__Group__01607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DisplayName__Group__0__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayName__Group__1__Impl_in_rule__DisplayName__Group__11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DisplayName__ValueAssignment_1_in_rule__DisplayName__Group__1__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__0__Impl_in_rule__WebResourceCollection__Group__01727 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__1_in_rule__WebResourceCollection__Group__01730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__WebResourceCollection__Group__0__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__1__Impl_in_rule__WebResourceCollection__Group__11789 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__2_in_rule__WebResourceCollection__Group__11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__WebResourceCollection__Group__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__2__Impl_in_rule__WebResourceCollection__Group__21851 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__3_in_rule__WebResourceCollection__Group__21854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__WebResourceCollection__Group__2__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__3__Impl_in_rule__WebResourceCollection__Group__31913 = new BitSet(new long[]{0x0000000000610010L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__4_in_rule__WebResourceCollection__Group__31916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__WebResourceNameAssignment_3_in_rule__WebResourceCollection__Group__3__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__4__Impl_in_rule__WebResourceCollection__Group__41973 = new BitSet(new long[]{0x0000000000610010L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__5_in_rule__WebResourceCollection__Group__41976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__UrlPatternAssignment_4_in_rule__WebResourceCollection__Group__4__Impl2003 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__5__Impl_in_rule__WebResourceCollection__Group__52034 = new BitSet(new long[]{0x0000000000610010L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__6_in_rule__WebResourceCollection__Group__52037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__HttpMethodAssignment_5_in_rule__WebResourceCollection__Group__5__Impl2064 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__6__Impl_in_rule__WebResourceCollection__Group__62095 = new BitSet(new long[]{0x0000000000610010L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__7_in_rule__WebResourceCollection__Group__62098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__IdAssignment_6_in_rule__WebResourceCollection__Group__6__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WebResourceCollection__Group__7__Impl_in_rule__WebResourceCollection__Group__72156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WebResourceCollection__Group__7__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlPattern__Group__0__Impl_in_rule__UrlPattern__Group__02231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__UrlPattern__Group__1_in_rule__UrlPattern__Group__02234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UrlPattern__Group__0__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlPattern__Group__1__Impl_in_rule__UrlPattern__Group__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UrlPattern__ValueAssignment_1_in_rule__UrlPattern__Group__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__0__Impl_in_rule__HttpMethod__Group__02354 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1_in_rule__HttpMethod__Group__02357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HttpMethod__Group__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__1__Impl_in_rule__HttpMethod__Group__12416 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2_in_rule__HttpMethod__Group__12419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__OmissionAssignment_1_in_rule__HttpMethod__Group__1__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__Group__2__Impl_in_rule__HttpMethod__Group__22476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HttpMethod__NameAssignment_2_in_rule__HttpMethod__Group__2__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__0__Impl_in_rule__AuthConstraint__Group__02539 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__1_in_rule__AuthConstraint__Group__02542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AuthConstraint__Group__0__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__1__Impl_in_rule__AuthConstraint__Group__12601 = new BitSet(new long[]{0x0000000001010010L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__2_in_rule__AuthConstraint__Group__12604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AuthConstraint__Group__1__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__2__Impl_in_rule__AuthConstraint__Group__22663 = new BitSet(new long[]{0x0000000001010010L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__3_in_rule__AuthConstraint__Group__22666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__RoleNameAssignment_2_in_rule__AuthConstraint__Group__2__Impl2693 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__3__Impl_in_rule__AuthConstraint__Group__32724 = new BitSet(new long[]{0x0000000001010010L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__4_in_rule__AuthConstraint__Group__32727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__IdAssignment_3_in_rule__AuthConstraint__Group__3__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthConstraint__Group__4__Impl_in_rule__AuthConstraint__Group__42785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AuthConstraint__Group__4__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleName__Group__0__Impl_in_rule__RoleName__Group__02854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RoleName__Group__1_in_rule__RoleName__Group__02857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RoleName__Group__0__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleName__Group__1__Impl_in_rule__RoleName__Group__12916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RoleName__NameAssignment_1_in_rule__RoleName__Group__1__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__0__Impl_in_rule__UserDataConstraint__Group__02977 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__1_in_rule__UserDataConstraint__Group__02980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UserDataConstraint__Group__0__Impl3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__1__Impl_in_rule__UserDataConstraint__Group__13039 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__2_in_rule__UserDataConstraint__Group__13042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__UserDataConstraint__Group__1__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__2__Impl_in_rule__UserDataConstraint__Group__23101 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__3_in_rule__UserDataConstraint__Group__23104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__TransportGuaranteeAssignment_2_in_rule__UserDataConstraint__Group__2__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__3__Impl_in_rule__UserDataConstraint__Group__33161 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__4_in_rule__UserDataConstraint__Group__33164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__IdAssignment_3_in_rule__UserDataConstraint__Group__3__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserDataConstraint__Group__4__Impl_in_rule__UserDataConstraint__Group__43222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UserDataConstraint__Group__4__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransportGuarantee__Group__0__Impl_in_rule__TransportGuarantee__Group__03291 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__TransportGuarantee__Group__1_in_rule__TransportGuarantee__Group__03294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TransportGuarantee__Group__0__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransportGuarantee__Group__1__Impl_in_rule__TransportGuarantee__Group__13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransportGuarantee__RestrictionAssignment_1_in_rule__TransportGuarantee__Group__1__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRole_in_rule__Security__RoleAssignment_03419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityConstraint_in_rule__Security__ConstraintAssignment_13450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityRole__NameAssignment_13481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisplayName_in_rule__SecurityConstraint__DisplayNameAssignment_13512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWebResourceCollection_in_rule__SecurityConstraint__WebResourceCollectionAssignment_23543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthConstraint_in_rule__SecurityConstraint__AuthConstraintAssignment_33574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserDataConstraint_in_rule__SecurityConstraint__UserDataConstraintAssignment_43605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__SecurityConstraint__IdAssignment_53636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__NameAssignment3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DisplayName__ValueAssignment_13698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__WebResourceCollection__WebResourceNameAssignment_33729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUrlPattern_in_rule__WebResourceCollection__UrlPatternAssignment_43760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHttpMethod_in_rule__WebResourceCollection__HttpMethodAssignment_53791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__WebResourceCollection__IdAssignment_63822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UrlPattern__ValueAssignment_13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__HttpMethod__OmissionAssignment_13889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__HttpMethod__NameAssignment_23928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleName_in_rule__AuthConstraint__RoleNameAssignment_23959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__AuthConstraint__IdAssignment_33990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RoleName__NameAssignment_14025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransportGuarantee_in_rule__UserDataConstraint__TransportGuaranteeAssignment_24060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__UserDataConstraint__IdAssignment_34091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionType_in_rule__TransportGuarantee__RestrictionAssignment_14122 = new BitSet(new long[]{0x0000000000000002L});

}