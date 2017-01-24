package org.xtext.anomaly.report.ui.contentassist.antlr.internal; 

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
import org.xtext.anomaly.report.services.ReportGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReportParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Shadowing'", "'Completeness'", "'Redundancy'", "'Syntactical'", "'Reachability'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalReportParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalReportParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalReportParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g"; }


     
     	private ReportGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ReportGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleReport"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:60:1: entryRuleReport : ruleReport EOF ;
    public final void entryRuleReport() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:61:1: ( ruleReport EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:62:1: ruleReport EOF
            {
             before(grammarAccess.getReportRule()); 
            pushFollow(FOLLOW_ruleReport_in_entryRuleReport61);
            ruleReport();

            state._fsp--;

             after(grammarAccess.getReportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReport68); 

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
    // $ANTLR end "entryRuleReport"


    // $ANTLR start "ruleReport"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:69:1: ruleReport : ( ( rule__Report__AnomaliesAssignment )* ) ;
    public final void ruleReport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:73:2: ( ( ( rule__Report__AnomaliesAssignment )* ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:74:1: ( ( rule__Report__AnomaliesAssignment )* )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:74:1: ( ( rule__Report__AnomaliesAssignment )* )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:75:1: ( rule__Report__AnomaliesAssignment )*
            {
             before(grammarAccess.getReportAccess().getAnomaliesAssignment()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:76:1: ( rule__Report__AnomaliesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:76:2: rule__Report__AnomaliesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Report__AnomaliesAssignment_in_ruleReport94);
            	    rule__Report__AnomaliesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getReportAccess().getAnomaliesAssignment()); 

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
    // $ANTLR end "ruleReport"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:89:1: ( ruleEString EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString122);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString129); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:104:1: ( rule__EString__Alternatives )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString155);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAnomaly"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:116:1: entryRuleAnomaly : ruleAnomaly EOF ;
    public final void entryRuleAnomaly() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:117:1: ( ruleAnomaly EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:118:1: ruleAnomaly EOF
            {
             before(grammarAccess.getAnomalyRule()); 
            pushFollow(FOLLOW_ruleAnomaly_in_entryRuleAnomaly182);
            ruleAnomaly();

            state._fsp--;

             after(grammarAccess.getAnomalyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnomaly189); 

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
    // $ANTLR end "entryRuleAnomaly"


    // $ANTLR start "ruleAnomaly"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:125:1: ruleAnomaly : ( ( rule__Anomaly__Alternatives ) ) ;
    public final void ruleAnomaly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:129:2: ( ( ( rule__Anomaly__Alternatives ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:130:1: ( ( rule__Anomaly__Alternatives ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:130:1: ( ( rule__Anomaly__Alternatives ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:131:1: ( rule__Anomaly__Alternatives )
            {
             before(grammarAccess.getAnomalyAccess().getAlternatives()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:132:1: ( rule__Anomaly__Alternatives )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:132:2: rule__Anomaly__Alternatives
            {
            pushFollow(FOLLOW_rule__Anomaly__Alternatives_in_ruleAnomaly215);
            rule__Anomaly__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnomalyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnomaly"


    // $ANTLR start "entryRuleShadowing"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:144:1: entryRuleShadowing : ruleShadowing EOF ;
    public final void entryRuleShadowing() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:145:1: ( ruleShadowing EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:146:1: ruleShadowing EOF
            {
             before(grammarAccess.getShadowingRule()); 
            pushFollow(FOLLOW_ruleShadowing_in_entryRuleShadowing242);
            ruleShadowing();

            state._fsp--;

             after(grammarAccess.getShadowingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShadowing249); 

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
    // $ANTLR end "entryRuleShadowing"


    // $ANTLR start "ruleShadowing"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:153:1: ruleShadowing : ( ( rule__Shadowing__Group__0 ) ) ;
    public final void ruleShadowing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:157:2: ( ( ( rule__Shadowing__Group__0 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:158:1: ( ( rule__Shadowing__Group__0 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:158:1: ( ( rule__Shadowing__Group__0 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:159:1: ( rule__Shadowing__Group__0 )
            {
             before(grammarAccess.getShadowingAccess().getGroup()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:160:1: ( rule__Shadowing__Group__0 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:160:2: rule__Shadowing__Group__0
            {
            pushFollow(FOLLOW_rule__Shadowing__Group__0_in_ruleShadowing275);
            rule__Shadowing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShadowingAccess().getGroup()); 

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
    // $ANTLR end "ruleShadowing"


    // $ANTLR start "entryRuleCompleteness"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:172:1: entryRuleCompleteness : ruleCompleteness EOF ;
    public final void entryRuleCompleteness() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:173:1: ( ruleCompleteness EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:174:1: ruleCompleteness EOF
            {
             before(grammarAccess.getCompletenessRule()); 
            pushFollow(FOLLOW_ruleCompleteness_in_entryRuleCompleteness302);
            ruleCompleteness();

            state._fsp--;

             after(grammarAccess.getCompletenessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompleteness309); 

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
    // $ANTLR end "entryRuleCompleteness"


    // $ANTLR start "ruleCompleteness"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:181:1: ruleCompleteness : ( ( rule__Completeness__Group__0 ) ) ;
    public final void ruleCompleteness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:185:2: ( ( ( rule__Completeness__Group__0 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:186:1: ( ( rule__Completeness__Group__0 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:186:1: ( ( rule__Completeness__Group__0 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:187:1: ( rule__Completeness__Group__0 )
            {
             before(grammarAccess.getCompletenessAccess().getGroup()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:188:1: ( rule__Completeness__Group__0 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:188:2: rule__Completeness__Group__0
            {
            pushFollow(FOLLOW_rule__Completeness__Group__0_in_ruleCompleteness335);
            rule__Completeness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompletenessAccess().getGroup()); 

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
    // $ANTLR end "ruleCompleteness"


    // $ANTLR start "entryRuleRedundancy"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:200:1: entryRuleRedundancy : ruleRedundancy EOF ;
    public final void entryRuleRedundancy() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:201:1: ( ruleRedundancy EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:202:1: ruleRedundancy EOF
            {
             before(grammarAccess.getRedundancyRule()); 
            pushFollow(FOLLOW_ruleRedundancy_in_entryRuleRedundancy362);
            ruleRedundancy();

            state._fsp--;

             after(grammarAccess.getRedundancyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRedundancy369); 

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
    // $ANTLR end "entryRuleRedundancy"


    // $ANTLR start "ruleRedundancy"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:209:1: ruleRedundancy : ( ( rule__Redundancy__Group__0 ) ) ;
    public final void ruleRedundancy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:213:2: ( ( ( rule__Redundancy__Group__0 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:214:1: ( ( rule__Redundancy__Group__0 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:214:1: ( ( rule__Redundancy__Group__0 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:215:1: ( rule__Redundancy__Group__0 )
            {
             before(grammarAccess.getRedundancyAccess().getGroup()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:216:1: ( rule__Redundancy__Group__0 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:216:2: rule__Redundancy__Group__0
            {
            pushFollow(FOLLOW_rule__Redundancy__Group__0_in_ruleRedundancy395);
            rule__Redundancy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRedundancyAccess().getGroup()); 

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
    // $ANTLR end "ruleRedundancy"


    // $ANTLR start "entryRuleSyntactical"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:228:1: entryRuleSyntactical : ruleSyntactical EOF ;
    public final void entryRuleSyntactical() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:229:1: ( ruleSyntactical EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:230:1: ruleSyntactical EOF
            {
             before(grammarAccess.getSyntacticalRule()); 
            pushFollow(FOLLOW_ruleSyntactical_in_entryRuleSyntactical422);
            ruleSyntactical();

            state._fsp--;

             after(grammarAccess.getSyntacticalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntactical429); 

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
    // $ANTLR end "entryRuleSyntactical"


    // $ANTLR start "ruleSyntactical"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:237:1: ruleSyntactical : ( ( rule__Syntactical__Group__0 ) ) ;
    public final void ruleSyntactical() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:241:2: ( ( ( rule__Syntactical__Group__0 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:242:1: ( ( rule__Syntactical__Group__0 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:242:1: ( ( rule__Syntactical__Group__0 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:243:1: ( rule__Syntactical__Group__0 )
            {
             before(grammarAccess.getSyntacticalAccess().getGroup()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:244:1: ( rule__Syntactical__Group__0 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:244:2: rule__Syntactical__Group__0
            {
            pushFollow(FOLLOW_rule__Syntactical__Group__0_in_ruleSyntactical455);
            rule__Syntactical__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSyntacticalAccess().getGroup()); 

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
    // $ANTLR end "ruleSyntactical"


    // $ANTLR start "entryRuleReachability"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:256:1: entryRuleReachability : ruleReachability EOF ;
    public final void entryRuleReachability() throws RecognitionException {
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:257:1: ( ruleReachability EOF )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:258:1: ruleReachability EOF
            {
             before(grammarAccess.getReachabilityRule()); 
            pushFollow(FOLLOW_ruleReachability_in_entryRuleReachability482);
            ruleReachability();

            state._fsp--;

             after(grammarAccess.getReachabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReachability489); 

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
    // $ANTLR end "entryRuleReachability"


    // $ANTLR start "ruleReachability"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:265:1: ruleReachability : ( ( rule__Reachability__Group__0 ) ) ;
    public final void ruleReachability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:269:2: ( ( ( rule__Reachability__Group__0 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:270:1: ( ( rule__Reachability__Group__0 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:270:1: ( ( rule__Reachability__Group__0 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:271:1: ( rule__Reachability__Group__0 )
            {
             before(grammarAccess.getReachabilityAccess().getGroup()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:272:1: ( rule__Reachability__Group__0 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:272:2: rule__Reachability__Group__0
            {
            pushFollow(FOLLOW_rule__Reachability__Group__0_in_ruleReachability515);
            rule__Reachability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReachabilityAccess().getGroup()); 

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
    // $ANTLR end "ruleReachability"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:284:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:288:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:289:1: ( RULE_STRING )
                    {
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:289:1: ( RULE_STRING )
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:290:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives551); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:295:6: ( RULE_ID )
                    {
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:295:6: ( RULE_ID )
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:296:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives568); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Anomaly__Alternatives"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:306:1: rule__Anomaly__Alternatives : ( ( ruleShadowing ) | ( ruleCompleteness ) | ( ruleRedundancy ) | ( ruleSyntactical ) | ( ruleReachability ) );
    public final void rule__Anomaly__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:310:1: ( ( ruleShadowing ) | ( ruleCompleteness ) | ( ruleRedundancy ) | ( ruleSyntactical ) | ( ruleReachability ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:311:1: ( ruleShadowing )
                    {
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:311:1: ( ruleShadowing )
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:312:1: ruleShadowing
                    {
                     before(grammarAccess.getAnomalyAccess().getShadowingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleShadowing_in_rule__Anomaly__Alternatives600);
                    ruleShadowing();

                    state._fsp--;

                     after(grammarAccess.getAnomalyAccess().getShadowingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:317:6: ( ruleCompleteness )
                    {
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:317:6: ( ruleCompleteness )
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:318:1: ruleCompleteness
                    {
                     before(grammarAccess.getAnomalyAccess().getCompletenessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCompleteness_in_rule__Anomaly__Alternatives617);
                    ruleCompleteness();

                    state._fsp--;

                     after(grammarAccess.getAnomalyAccess().getCompletenessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:323:6: ( ruleRedundancy )
                    {
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:323:6: ( ruleRedundancy )
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:324:1: ruleRedundancy
                    {
                     before(grammarAccess.getAnomalyAccess().getRedundancyParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRedundancy_in_rule__Anomaly__Alternatives634);
                    ruleRedundancy();

                    state._fsp--;

                     after(grammarAccess.getAnomalyAccess().getRedundancyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:329:6: ( ruleSyntactical )
                    {
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:329:6: ( ruleSyntactical )
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:330:1: ruleSyntactical
                    {
                     before(grammarAccess.getAnomalyAccess().getSyntacticalParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSyntactical_in_rule__Anomaly__Alternatives651);
                    ruleSyntactical();

                    state._fsp--;

                     after(grammarAccess.getAnomalyAccess().getSyntacticalParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:335:6: ( ruleReachability )
                    {
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:335:6: ( ruleReachability )
                    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:336:1: ruleReachability
                    {
                     before(grammarAccess.getAnomalyAccess().getReachabilityParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleReachability_in_rule__Anomaly__Alternatives668);
                    ruleReachability();

                    state._fsp--;

                     after(grammarAccess.getAnomalyAccess().getReachabilityParserRuleCall_4()); 

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
    // $ANTLR end "rule__Anomaly__Alternatives"


    // $ANTLR start "rule__Shadowing__Group__0"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:348:1: rule__Shadowing__Group__0 : rule__Shadowing__Group__0__Impl rule__Shadowing__Group__1 ;
    public final void rule__Shadowing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:352:1: ( rule__Shadowing__Group__0__Impl rule__Shadowing__Group__1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:353:2: rule__Shadowing__Group__0__Impl rule__Shadowing__Group__1
            {
            pushFollow(FOLLOW_rule__Shadowing__Group__0__Impl_in_rule__Shadowing__Group__0698);
            rule__Shadowing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shadowing__Group__1_in_rule__Shadowing__Group__0701);
            rule__Shadowing__Group__1();

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
    // $ANTLR end "rule__Shadowing__Group__0"


    // $ANTLR start "rule__Shadowing__Group__0__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:360:1: rule__Shadowing__Group__0__Impl : ( 'Shadowing' ) ;
    public final void rule__Shadowing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:364:1: ( ( 'Shadowing' ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:365:1: ( 'Shadowing' )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:365:1: ( 'Shadowing' )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:366:1: 'Shadowing'
            {
             before(grammarAccess.getShadowingAccess().getShadowingKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Shadowing__Group__0__Impl729); 
             after(grammarAccess.getShadowingAccess().getShadowingKeyword_0()); 

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
    // $ANTLR end "rule__Shadowing__Group__0__Impl"


    // $ANTLR start "rule__Shadowing__Group__1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:379:1: rule__Shadowing__Group__1 : rule__Shadowing__Group__1__Impl rule__Shadowing__Group__2 ;
    public final void rule__Shadowing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:383:1: ( rule__Shadowing__Group__1__Impl rule__Shadowing__Group__2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:384:2: rule__Shadowing__Group__1__Impl rule__Shadowing__Group__2
            {
            pushFollow(FOLLOW_rule__Shadowing__Group__1__Impl_in_rule__Shadowing__Group__1760);
            rule__Shadowing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shadowing__Group__2_in_rule__Shadowing__Group__1763);
            rule__Shadowing__Group__2();

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
    // $ANTLR end "rule__Shadowing__Group__1"


    // $ANTLR start "rule__Shadowing__Group__1__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:391:1: rule__Shadowing__Group__1__Impl : ( ( rule__Shadowing__DescriptionAssignment_1 ) ) ;
    public final void rule__Shadowing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:395:1: ( ( ( rule__Shadowing__DescriptionAssignment_1 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:396:1: ( ( rule__Shadowing__DescriptionAssignment_1 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:396:1: ( ( rule__Shadowing__DescriptionAssignment_1 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:397:1: ( rule__Shadowing__DescriptionAssignment_1 )
            {
             before(grammarAccess.getShadowingAccess().getDescriptionAssignment_1()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:398:1: ( rule__Shadowing__DescriptionAssignment_1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:398:2: rule__Shadowing__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Shadowing__DescriptionAssignment_1_in_rule__Shadowing__Group__1__Impl790);
            rule__Shadowing__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShadowingAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__Shadowing__Group__1__Impl"


    // $ANTLR start "rule__Shadowing__Group__2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:408:1: rule__Shadowing__Group__2 : rule__Shadowing__Group__2__Impl rule__Shadowing__Group__3 ;
    public final void rule__Shadowing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:412:1: ( rule__Shadowing__Group__2__Impl rule__Shadowing__Group__3 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:413:2: rule__Shadowing__Group__2__Impl rule__Shadowing__Group__3
            {
            pushFollow(FOLLOW_rule__Shadowing__Group__2__Impl_in_rule__Shadowing__Group__2820);
            rule__Shadowing__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shadowing__Group__3_in_rule__Shadowing__Group__2823);
            rule__Shadowing__Group__3();

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
    // $ANTLR end "rule__Shadowing__Group__2"


    // $ANTLR start "rule__Shadowing__Group__2__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:420:1: rule__Shadowing__Group__2__Impl : ( ( rule__Shadowing__ShadowingAssignment_2 ) ) ;
    public final void rule__Shadowing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:424:1: ( ( ( rule__Shadowing__ShadowingAssignment_2 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:425:1: ( ( rule__Shadowing__ShadowingAssignment_2 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:425:1: ( ( rule__Shadowing__ShadowingAssignment_2 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:426:1: ( rule__Shadowing__ShadowingAssignment_2 )
            {
             before(grammarAccess.getShadowingAccess().getShadowingAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:427:1: ( rule__Shadowing__ShadowingAssignment_2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:427:2: rule__Shadowing__ShadowingAssignment_2
            {
            pushFollow(FOLLOW_rule__Shadowing__ShadowingAssignment_2_in_rule__Shadowing__Group__2__Impl850);
            rule__Shadowing__ShadowingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShadowingAccess().getShadowingAssignment_2()); 

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
    // $ANTLR end "rule__Shadowing__Group__2__Impl"


    // $ANTLR start "rule__Shadowing__Group__3"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:437:1: rule__Shadowing__Group__3 : rule__Shadowing__Group__3__Impl ;
    public final void rule__Shadowing__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:441:1: ( rule__Shadowing__Group__3__Impl )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:442:2: rule__Shadowing__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Shadowing__Group__3__Impl_in_rule__Shadowing__Group__3880);
            rule__Shadowing__Group__3__Impl();

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
    // $ANTLR end "rule__Shadowing__Group__3"


    // $ANTLR start "rule__Shadowing__Group__3__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:448:1: rule__Shadowing__Group__3__Impl : ( ( rule__Shadowing__ShadowedAssignment_3 ) ) ;
    public final void rule__Shadowing__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:452:1: ( ( ( rule__Shadowing__ShadowedAssignment_3 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:453:1: ( ( rule__Shadowing__ShadowedAssignment_3 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:453:1: ( ( rule__Shadowing__ShadowedAssignment_3 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:454:1: ( rule__Shadowing__ShadowedAssignment_3 )
            {
             before(grammarAccess.getShadowingAccess().getShadowedAssignment_3()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:455:1: ( rule__Shadowing__ShadowedAssignment_3 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:455:2: rule__Shadowing__ShadowedAssignment_3
            {
            pushFollow(FOLLOW_rule__Shadowing__ShadowedAssignment_3_in_rule__Shadowing__Group__3__Impl907);
            rule__Shadowing__ShadowedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShadowingAccess().getShadowedAssignment_3()); 

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
    // $ANTLR end "rule__Shadowing__Group__3__Impl"


    // $ANTLR start "rule__Completeness__Group__0"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:473:1: rule__Completeness__Group__0 : rule__Completeness__Group__0__Impl rule__Completeness__Group__1 ;
    public final void rule__Completeness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:477:1: ( rule__Completeness__Group__0__Impl rule__Completeness__Group__1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:478:2: rule__Completeness__Group__0__Impl rule__Completeness__Group__1
            {
            pushFollow(FOLLOW_rule__Completeness__Group__0__Impl_in_rule__Completeness__Group__0945);
            rule__Completeness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Completeness__Group__1_in_rule__Completeness__Group__0948);
            rule__Completeness__Group__1();

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
    // $ANTLR end "rule__Completeness__Group__0"


    // $ANTLR start "rule__Completeness__Group__0__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:485:1: rule__Completeness__Group__0__Impl : ( 'Completeness' ) ;
    public final void rule__Completeness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:489:1: ( ( 'Completeness' ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:490:1: ( 'Completeness' )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:490:1: ( 'Completeness' )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:491:1: 'Completeness'
            {
             before(grammarAccess.getCompletenessAccess().getCompletenessKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Completeness__Group__0__Impl976); 
             after(grammarAccess.getCompletenessAccess().getCompletenessKeyword_0()); 

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
    // $ANTLR end "rule__Completeness__Group__0__Impl"


    // $ANTLR start "rule__Completeness__Group__1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:504:1: rule__Completeness__Group__1 : rule__Completeness__Group__1__Impl rule__Completeness__Group__2 ;
    public final void rule__Completeness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:508:1: ( rule__Completeness__Group__1__Impl rule__Completeness__Group__2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:509:2: rule__Completeness__Group__1__Impl rule__Completeness__Group__2
            {
            pushFollow(FOLLOW_rule__Completeness__Group__1__Impl_in_rule__Completeness__Group__11007);
            rule__Completeness__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Completeness__Group__2_in_rule__Completeness__Group__11010);
            rule__Completeness__Group__2();

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
    // $ANTLR end "rule__Completeness__Group__1"


    // $ANTLR start "rule__Completeness__Group__1__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:516:1: rule__Completeness__Group__1__Impl : ( ( rule__Completeness__DescriptionAssignment_1 ) ) ;
    public final void rule__Completeness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:520:1: ( ( ( rule__Completeness__DescriptionAssignment_1 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:521:1: ( ( rule__Completeness__DescriptionAssignment_1 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:521:1: ( ( rule__Completeness__DescriptionAssignment_1 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:522:1: ( rule__Completeness__DescriptionAssignment_1 )
            {
             before(grammarAccess.getCompletenessAccess().getDescriptionAssignment_1()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:523:1: ( rule__Completeness__DescriptionAssignment_1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:523:2: rule__Completeness__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Completeness__DescriptionAssignment_1_in_rule__Completeness__Group__1__Impl1037);
            rule__Completeness__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompletenessAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__Completeness__Group__1__Impl"


    // $ANTLR start "rule__Completeness__Group__2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:533:1: rule__Completeness__Group__2 : rule__Completeness__Group__2__Impl rule__Completeness__Group__3 ;
    public final void rule__Completeness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:537:1: ( rule__Completeness__Group__2__Impl rule__Completeness__Group__3 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:538:2: rule__Completeness__Group__2__Impl rule__Completeness__Group__3
            {
            pushFollow(FOLLOW_rule__Completeness__Group__2__Impl_in_rule__Completeness__Group__21067);
            rule__Completeness__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Completeness__Group__3_in_rule__Completeness__Group__21070);
            rule__Completeness__Group__3();

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
    // $ANTLR end "rule__Completeness__Group__2"


    // $ANTLR start "rule__Completeness__Group__2__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:545:1: rule__Completeness__Group__2__Impl : ( ( ( rule__Completeness__MissedMethodAssignment_2 ) ) ( ( rule__Completeness__MissedMethodAssignment_2 )* ) ) ;
    public final void rule__Completeness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:549:1: ( ( ( ( rule__Completeness__MissedMethodAssignment_2 ) ) ( ( rule__Completeness__MissedMethodAssignment_2 )* ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:550:1: ( ( ( rule__Completeness__MissedMethodAssignment_2 ) ) ( ( rule__Completeness__MissedMethodAssignment_2 )* ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:550:1: ( ( ( rule__Completeness__MissedMethodAssignment_2 ) ) ( ( rule__Completeness__MissedMethodAssignment_2 )* ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:551:1: ( ( rule__Completeness__MissedMethodAssignment_2 ) ) ( ( rule__Completeness__MissedMethodAssignment_2 )* )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:551:1: ( ( rule__Completeness__MissedMethodAssignment_2 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:552:1: ( rule__Completeness__MissedMethodAssignment_2 )
            {
             before(grammarAccess.getCompletenessAccess().getMissedMethodAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:553:1: ( rule__Completeness__MissedMethodAssignment_2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:553:2: rule__Completeness__MissedMethodAssignment_2
            {
            pushFollow(FOLLOW_rule__Completeness__MissedMethodAssignment_2_in_rule__Completeness__Group__2__Impl1099);
            rule__Completeness__MissedMethodAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompletenessAccess().getMissedMethodAssignment_2()); 

            }

            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:556:1: ( ( rule__Completeness__MissedMethodAssignment_2 )* )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:557:1: ( rule__Completeness__MissedMethodAssignment_2 )*
            {
             before(grammarAccess.getCompletenessAccess().getMissedMethodAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:558:1: ( rule__Completeness__MissedMethodAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>=RULE_STRING && LA4_1<=RULE_ID)) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==RULE_ID) ) {
                    int LA4_2 = input.LA(2);

                    if ( ((LA4_2>=RULE_STRING && LA4_2<=RULE_ID)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:558:2: rule__Completeness__MissedMethodAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Completeness__MissedMethodAssignment_2_in_rule__Completeness__Group__2__Impl1111);
            	    rule__Completeness__MissedMethodAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCompletenessAccess().getMissedMethodAssignment_2()); 

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
    // $ANTLR end "rule__Completeness__Group__2__Impl"


    // $ANTLR start "rule__Completeness__Group__3"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:569:1: rule__Completeness__Group__3 : rule__Completeness__Group__3__Impl ;
    public final void rule__Completeness__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:573:1: ( rule__Completeness__Group__3__Impl )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:574:2: rule__Completeness__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Completeness__Group__3__Impl_in_rule__Completeness__Group__31144);
            rule__Completeness__Group__3__Impl();

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
    // $ANTLR end "rule__Completeness__Group__3"


    // $ANTLR start "rule__Completeness__Group__3__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:580:1: rule__Completeness__Group__3__Impl : ( ( rule__Completeness__SecurityConstraintAssignment_3 ) ) ;
    public final void rule__Completeness__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:584:1: ( ( ( rule__Completeness__SecurityConstraintAssignment_3 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:585:1: ( ( rule__Completeness__SecurityConstraintAssignment_3 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:585:1: ( ( rule__Completeness__SecurityConstraintAssignment_3 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:586:1: ( rule__Completeness__SecurityConstraintAssignment_3 )
            {
             before(grammarAccess.getCompletenessAccess().getSecurityConstraintAssignment_3()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:587:1: ( rule__Completeness__SecurityConstraintAssignment_3 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:587:2: rule__Completeness__SecurityConstraintAssignment_3
            {
            pushFollow(FOLLOW_rule__Completeness__SecurityConstraintAssignment_3_in_rule__Completeness__Group__3__Impl1171);
            rule__Completeness__SecurityConstraintAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompletenessAccess().getSecurityConstraintAssignment_3()); 

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
    // $ANTLR end "rule__Completeness__Group__3__Impl"


    // $ANTLR start "rule__Redundancy__Group__0"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:605:1: rule__Redundancy__Group__0 : rule__Redundancy__Group__0__Impl rule__Redundancy__Group__1 ;
    public final void rule__Redundancy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:609:1: ( rule__Redundancy__Group__0__Impl rule__Redundancy__Group__1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:610:2: rule__Redundancy__Group__0__Impl rule__Redundancy__Group__1
            {
            pushFollow(FOLLOW_rule__Redundancy__Group__0__Impl_in_rule__Redundancy__Group__01209);
            rule__Redundancy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Redundancy__Group__1_in_rule__Redundancy__Group__01212);
            rule__Redundancy__Group__1();

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
    // $ANTLR end "rule__Redundancy__Group__0"


    // $ANTLR start "rule__Redundancy__Group__0__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:617:1: rule__Redundancy__Group__0__Impl : ( 'Redundancy' ) ;
    public final void rule__Redundancy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:621:1: ( ( 'Redundancy' ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:622:1: ( 'Redundancy' )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:622:1: ( 'Redundancy' )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:623:1: 'Redundancy'
            {
             before(grammarAccess.getRedundancyAccess().getRedundancyKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Redundancy__Group__0__Impl1240); 
             after(grammarAccess.getRedundancyAccess().getRedundancyKeyword_0()); 

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
    // $ANTLR end "rule__Redundancy__Group__0__Impl"


    // $ANTLR start "rule__Redundancy__Group__1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:636:1: rule__Redundancy__Group__1 : rule__Redundancy__Group__1__Impl rule__Redundancy__Group__2 ;
    public final void rule__Redundancy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:640:1: ( rule__Redundancy__Group__1__Impl rule__Redundancy__Group__2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:641:2: rule__Redundancy__Group__1__Impl rule__Redundancy__Group__2
            {
            pushFollow(FOLLOW_rule__Redundancy__Group__1__Impl_in_rule__Redundancy__Group__11271);
            rule__Redundancy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Redundancy__Group__2_in_rule__Redundancy__Group__11274);
            rule__Redundancy__Group__2();

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
    // $ANTLR end "rule__Redundancy__Group__1"


    // $ANTLR start "rule__Redundancy__Group__1__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:648:1: rule__Redundancy__Group__1__Impl : ( ( rule__Redundancy__DescriptionAssignment_1 ) ) ;
    public final void rule__Redundancy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:652:1: ( ( ( rule__Redundancy__DescriptionAssignment_1 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:653:1: ( ( rule__Redundancy__DescriptionAssignment_1 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:653:1: ( ( rule__Redundancy__DescriptionAssignment_1 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:654:1: ( rule__Redundancy__DescriptionAssignment_1 )
            {
             before(grammarAccess.getRedundancyAccess().getDescriptionAssignment_1()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:655:1: ( rule__Redundancy__DescriptionAssignment_1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:655:2: rule__Redundancy__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Redundancy__DescriptionAssignment_1_in_rule__Redundancy__Group__1__Impl1301);
            rule__Redundancy__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRedundancyAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__Redundancy__Group__1__Impl"


    // $ANTLR start "rule__Redundancy__Group__2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:665:1: rule__Redundancy__Group__2 : rule__Redundancy__Group__2__Impl rule__Redundancy__Group__3 ;
    public final void rule__Redundancy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:669:1: ( rule__Redundancy__Group__2__Impl rule__Redundancy__Group__3 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:670:2: rule__Redundancy__Group__2__Impl rule__Redundancy__Group__3
            {
            pushFollow(FOLLOW_rule__Redundancy__Group__2__Impl_in_rule__Redundancy__Group__21331);
            rule__Redundancy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Redundancy__Group__3_in_rule__Redundancy__Group__21334);
            rule__Redundancy__Group__3();

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
    // $ANTLR end "rule__Redundancy__Group__2"


    // $ANTLR start "rule__Redundancy__Group__2__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:677:1: rule__Redundancy__Group__2__Impl : ( ( rule__Redundancy__ContainingAssignment_2 ) ) ;
    public final void rule__Redundancy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:681:1: ( ( ( rule__Redundancy__ContainingAssignment_2 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:682:1: ( ( rule__Redundancy__ContainingAssignment_2 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:682:1: ( ( rule__Redundancy__ContainingAssignment_2 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:683:1: ( rule__Redundancy__ContainingAssignment_2 )
            {
             before(grammarAccess.getRedundancyAccess().getContainingAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:684:1: ( rule__Redundancy__ContainingAssignment_2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:684:2: rule__Redundancy__ContainingAssignment_2
            {
            pushFollow(FOLLOW_rule__Redundancy__ContainingAssignment_2_in_rule__Redundancy__Group__2__Impl1361);
            rule__Redundancy__ContainingAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRedundancyAccess().getContainingAssignment_2()); 

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
    // $ANTLR end "rule__Redundancy__Group__2__Impl"


    // $ANTLR start "rule__Redundancy__Group__3"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:694:1: rule__Redundancy__Group__3 : rule__Redundancy__Group__3__Impl ;
    public final void rule__Redundancy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:698:1: ( rule__Redundancy__Group__3__Impl )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:699:2: rule__Redundancy__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Redundancy__Group__3__Impl_in_rule__Redundancy__Group__31391);
            rule__Redundancy__Group__3__Impl();

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
    // $ANTLR end "rule__Redundancy__Group__3"


    // $ANTLR start "rule__Redundancy__Group__3__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:705:1: rule__Redundancy__Group__3__Impl : ( ( rule__Redundancy__ContainedAssignment_3 ) ) ;
    public final void rule__Redundancy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:709:1: ( ( ( rule__Redundancy__ContainedAssignment_3 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:710:1: ( ( rule__Redundancy__ContainedAssignment_3 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:710:1: ( ( rule__Redundancy__ContainedAssignment_3 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:711:1: ( rule__Redundancy__ContainedAssignment_3 )
            {
             before(grammarAccess.getRedundancyAccess().getContainedAssignment_3()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:712:1: ( rule__Redundancy__ContainedAssignment_3 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:712:2: rule__Redundancy__ContainedAssignment_3
            {
            pushFollow(FOLLOW_rule__Redundancy__ContainedAssignment_3_in_rule__Redundancy__Group__3__Impl1418);
            rule__Redundancy__ContainedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRedundancyAccess().getContainedAssignment_3()); 

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
    // $ANTLR end "rule__Redundancy__Group__3__Impl"


    // $ANTLR start "rule__Syntactical__Group__0"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:730:1: rule__Syntactical__Group__0 : rule__Syntactical__Group__0__Impl rule__Syntactical__Group__1 ;
    public final void rule__Syntactical__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:734:1: ( rule__Syntactical__Group__0__Impl rule__Syntactical__Group__1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:735:2: rule__Syntactical__Group__0__Impl rule__Syntactical__Group__1
            {
            pushFollow(FOLLOW_rule__Syntactical__Group__0__Impl_in_rule__Syntactical__Group__01456);
            rule__Syntactical__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Syntactical__Group__1_in_rule__Syntactical__Group__01459);
            rule__Syntactical__Group__1();

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
    // $ANTLR end "rule__Syntactical__Group__0"


    // $ANTLR start "rule__Syntactical__Group__0__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:742:1: rule__Syntactical__Group__0__Impl : ( 'Syntactical' ) ;
    public final void rule__Syntactical__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:746:1: ( ( 'Syntactical' ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:747:1: ( 'Syntactical' )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:747:1: ( 'Syntactical' )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:748:1: 'Syntactical'
            {
             before(grammarAccess.getSyntacticalAccess().getSyntacticalKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Syntactical__Group__0__Impl1487); 
             after(grammarAccess.getSyntacticalAccess().getSyntacticalKeyword_0()); 

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
    // $ANTLR end "rule__Syntactical__Group__0__Impl"


    // $ANTLR start "rule__Syntactical__Group__1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:761:1: rule__Syntactical__Group__1 : rule__Syntactical__Group__1__Impl rule__Syntactical__Group__2 ;
    public final void rule__Syntactical__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:765:1: ( rule__Syntactical__Group__1__Impl rule__Syntactical__Group__2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:766:2: rule__Syntactical__Group__1__Impl rule__Syntactical__Group__2
            {
            pushFollow(FOLLOW_rule__Syntactical__Group__1__Impl_in_rule__Syntactical__Group__11518);
            rule__Syntactical__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Syntactical__Group__2_in_rule__Syntactical__Group__11521);
            rule__Syntactical__Group__2();

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
    // $ANTLR end "rule__Syntactical__Group__1"


    // $ANTLR start "rule__Syntactical__Group__1__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:773:1: rule__Syntactical__Group__1__Impl : ( ( rule__Syntactical__DescriptionAssignment_1 ) ) ;
    public final void rule__Syntactical__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:777:1: ( ( ( rule__Syntactical__DescriptionAssignment_1 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:778:1: ( ( rule__Syntactical__DescriptionAssignment_1 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:778:1: ( ( rule__Syntactical__DescriptionAssignment_1 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:779:1: ( rule__Syntactical__DescriptionAssignment_1 )
            {
             before(grammarAccess.getSyntacticalAccess().getDescriptionAssignment_1()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:780:1: ( rule__Syntactical__DescriptionAssignment_1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:780:2: rule__Syntactical__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Syntactical__DescriptionAssignment_1_in_rule__Syntactical__Group__1__Impl1548);
            rule__Syntactical__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSyntacticalAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__Syntactical__Group__1__Impl"


    // $ANTLR start "rule__Syntactical__Group__2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:790:1: rule__Syntactical__Group__2 : rule__Syntactical__Group__2__Impl ;
    public final void rule__Syntactical__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:794:1: ( rule__Syntactical__Group__2__Impl )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:795:2: rule__Syntactical__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Syntactical__Group__2__Impl_in_rule__Syntactical__Group__21578);
            rule__Syntactical__Group__2__Impl();

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
    // $ANTLR end "rule__Syntactical__Group__2"


    // $ANTLR start "rule__Syntactical__Group__2__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:801:1: rule__Syntactical__Group__2__Impl : ( ( ( rule__Syntactical__MissedRolesAssignment_2 ) ) ( ( rule__Syntactical__MissedRolesAssignment_2 )* ) ) ;
    public final void rule__Syntactical__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:805:1: ( ( ( ( rule__Syntactical__MissedRolesAssignment_2 ) ) ( ( rule__Syntactical__MissedRolesAssignment_2 )* ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:806:1: ( ( ( rule__Syntactical__MissedRolesAssignment_2 ) ) ( ( rule__Syntactical__MissedRolesAssignment_2 )* ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:806:1: ( ( ( rule__Syntactical__MissedRolesAssignment_2 ) ) ( ( rule__Syntactical__MissedRolesAssignment_2 )* ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:807:1: ( ( rule__Syntactical__MissedRolesAssignment_2 ) ) ( ( rule__Syntactical__MissedRolesAssignment_2 )* )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:807:1: ( ( rule__Syntactical__MissedRolesAssignment_2 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:808:1: ( rule__Syntactical__MissedRolesAssignment_2 )
            {
             before(grammarAccess.getSyntacticalAccess().getMissedRolesAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:809:1: ( rule__Syntactical__MissedRolesAssignment_2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:809:2: rule__Syntactical__MissedRolesAssignment_2
            {
            pushFollow(FOLLOW_rule__Syntactical__MissedRolesAssignment_2_in_rule__Syntactical__Group__2__Impl1607);
            rule__Syntactical__MissedRolesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSyntacticalAccess().getMissedRolesAssignment_2()); 

            }

            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:812:1: ( ( rule__Syntactical__MissedRolesAssignment_2 )* )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:813:1: ( rule__Syntactical__MissedRolesAssignment_2 )*
            {
             before(grammarAccess.getSyntacticalAccess().getMissedRolesAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:814:1: ( rule__Syntactical__MissedRolesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:814:2: rule__Syntactical__MissedRolesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Syntactical__MissedRolesAssignment_2_in_rule__Syntactical__Group__2__Impl1619);
            	    rule__Syntactical__MissedRolesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSyntacticalAccess().getMissedRolesAssignment_2()); 

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
    // $ANTLR end "rule__Syntactical__Group__2__Impl"


    // $ANTLR start "rule__Reachability__Group__0"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:831:1: rule__Reachability__Group__0 : rule__Reachability__Group__0__Impl rule__Reachability__Group__1 ;
    public final void rule__Reachability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:835:1: ( rule__Reachability__Group__0__Impl rule__Reachability__Group__1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:836:2: rule__Reachability__Group__0__Impl rule__Reachability__Group__1
            {
            pushFollow(FOLLOW_rule__Reachability__Group__0__Impl_in_rule__Reachability__Group__01658);
            rule__Reachability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reachability__Group__1_in_rule__Reachability__Group__01661);
            rule__Reachability__Group__1();

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
    // $ANTLR end "rule__Reachability__Group__0"


    // $ANTLR start "rule__Reachability__Group__0__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:843:1: rule__Reachability__Group__0__Impl : ( 'Reachability' ) ;
    public final void rule__Reachability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:847:1: ( ( 'Reachability' ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:848:1: ( 'Reachability' )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:848:1: ( 'Reachability' )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:849:1: 'Reachability'
            {
             before(grammarAccess.getReachabilityAccess().getReachabilityKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Reachability__Group__0__Impl1689); 
             after(grammarAccess.getReachabilityAccess().getReachabilityKeyword_0()); 

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
    // $ANTLR end "rule__Reachability__Group__0__Impl"


    // $ANTLR start "rule__Reachability__Group__1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:862:1: rule__Reachability__Group__1 : rule__Reachability__Group__1__Impl rule__Reachability__Group__2 ;
    public final void rule__Reachability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:866:1: ( rule__Reachability__Group__1__Impl rule__Reachability__Group__2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:867:2: rule__Reachability__Group__1__Impl rule__Reachability__Group__2
            {
            pushFollow(FOLLOW_rule__Reachability__Group__1__Impl_in_rule__Reachability__Group__11720);
            rule__Reachability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Reachability__Group__2_in_rule__Reachability__Group__11723);
            rule__Reachability__Group__2();

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
    // $ANTLR end "rule__Reachability__Group__1"


    // $ANTLR start "rule__Reachability__Group__1__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:874:1: rule__Reachability__Group__1__Impl : ( ( rule__Reachability__DescriptionAssignment_1 ) ) ;
    public final void rule__Reachability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:878:1: ( ( ( rule__Reachability__DescriptionAssignment_1 ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:879:1: ( ( rule__Reachability__DescriptionAssignment_1 ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:879:1: ( ( rule__Reachability__DescriptionAssignment_1 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:880:1: ( rule__Reachability__DescriptionAssignment_1 )
            {
             before(grammarAccess.getReachabilityAccess().getDescriptionAssignment_1()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:881:1: ( rule__Reachability__DescriptionAssignment_1 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:881:2: rule__Reachability__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Reachability__DescriptionAssignment_1_in_rule__Reachability__Group__1__Impl1750);
            rule__Reachability__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReachabilityAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__Reachability__Group__1__Impl"


    // $ANTLR start "rule__Reachability__Group__2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:891:1: rule__Reachability__Group__2 : rule__Reachability__Group__2__Impl ;
    public final void rule__Reachability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:895:1: ( rule__Reachability__Group__2__Impl )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:896:2: rule__Reachability__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Reachability__Group__2__Impl_in_rule__Reachability__Group__21780);
            rule__Reachability__Group__2__Impl();

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
    // $ANTLR end "rule__Reachability__Group__2"


    // $ANTLR start "rule__Reachability__Group__2__Impl"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:902:1: rule__Reachability__Group__2__Impl : ( ( ( rule__Reachability__UnreachableResourcesAssignment_2 ) ) ( ( rule__Reachability__UnreachableResourcesAssignment_2 )* ) ) ;
    public final void rule__Reachability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:906:1: ( ( ( ( rule__Reachability__UnreachableResourcesAssignment_2 ) ) ( ( rule__Reachability__UnreachableResourcesAssignment_2 )* ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:907:1: ( ( ( rule__Reachability__UnreachableResourcesAssignment_2 ) ) ( ( rule__Reachability__UnreachableResourcesAssignment_2 )* ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:907:1: ( ( ( rule__Reachability__UnreachableResourcesAssignment_2 ) ) ( ( rule__Reachability__UnreachableResourcesAssignment_2 )* ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:908:1: ( ( rule__Reachability__UnreachableResourcesAssignment_2 ) ) ( ( rule__Reachability__UnreachableResourcesAssignment_2 )* )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:908:1: ( ( rule__Reachability__UnreachableResourcesAssignment_2 ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:909:1: ( rule__Reachability__UnreachableResourcesAssignment_2 )
            {
             before(grammarAccess.getReachabilityAccess().getUnreachableResourcesAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:910:1: ( rule__Reachability__UnreachableResourcesAssignment_2 )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:910:2: rule__Reachability__UnreachableResourcesAssignment_2
            {
            pushFollow(FOLLOW_rule__Reachability__UnreachableResourcesAssignment_2_in_rule__Reachability__Group__2__Impl1809);
            rule__Reachability__UnreachableResourcesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReachabilityAccess().getUnreachableResourcesAssignment_2()); 

            }

            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:913:1: ( ( rule__Reachability__UnreachableResourcesAssignment_2 )* )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:914:1: ( rule__Reachability__UnreachableResourcesAssignment_2 )*
            {
             before(grammarAccess.getReachabilityAccess().getUnreachableResourcesAssignment_2()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:915:1: ( rule__Reachability__UnreachableResourcesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:915:2: rule__Reachability__UnreachableResourcesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Reachability__UnreachableResourcesAssignment_2_in_rule__Reachability__Group__2__Impl1821);
            	    rule__Reachability__UnreachableResourcesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getReachabilityAccess().getUnreachableResourcesAssignment_2()); 

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
    // $ANTLR end "rule__Reachability__Group__2__Impl"


    // $ANTLR start "rule__Report__AnomaliesAssignment"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:933:1: rule__Report__AnomaliesAssignment : ( ruleAnomaly ) ;
    public final void rule__Report__AnomaliesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:937:1: ( ( ruleAnomaly ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:938:1: ( ruleAnomaly )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:938:1: ( ruleAnomaly )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:939:1: ruleAnomaly
            {
             before(grammarAccess.getReportAccess().getAnomaliesAnomalyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnomaly_in_rule__Report__AnomaliesAssignment1865);
            ruleAnomaly();

            state._fsp--;

             after(grammarAccess.getReportAccess().getAnomaliesAnomalyParserRuleCall_0()); 

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
    // $ANTLR end "rule__Report__AnomaliesAssignment"


    // $ANTLR start "rule__Shadowing__DescriptionAssignment_1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:948:1: rule__Shadowing__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Shadowing__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:952:1: ( ( RULE_STRING ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:953:1: ( RULE_STRING )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:953:1: ( RULE_STRING )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:954:1: RULE_STRING
            {
             before(grammarAccess.getShadowingAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Shadowing__DescriptionAssignment_11896); 
             after(grammarAccess.getShadowingAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Shadowing__DescriptionAssignment_1"


    // $ANTLR start "rule__Shadowing__ShadowingAssignment_2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:963:1: rule__Shadowing__ShadowingAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Shadowing__ShadowingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:967:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:968:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:968:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:969:1: ( ruleEString )
            {
             before(grammarAccess.getShadowingAccess().getShadowingEObjectCrossReference_2_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:970:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:971:1: ruleEString
            {
             before(grammarAccess.getShadowingAccess().getShadowingEObjectEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Shadowing__ShadowingAssignment_21931);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShadowingAccess().getShadowingEObjectEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getShadowingAccess().getShadowingEObjectCrossReference_2_0()); 

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
    // $ANTLR end "rule__Shadowing__ShadowingAssignment_2"


    // $ANTLR start "rule__Shadowing__ShadowedAssignment_3"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:982:1: rule__Shadowing__ShadowedAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Shadowing__ShadowedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:986:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:987:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:987:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:988:1: ( ruleEString )
            {
             before(grammarAccess.getShadowingAccess().getShadowedEObjectCrossReference_3_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:989:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:990:1: ruleEString
            {
             before(grammarAccess.getShadowingAccess().getShadowedEObjectEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Shadowing__ShadowedAssignment_31970);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShadowingAccess().getShadowedEObjectEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getShadowingAccess().getShadowedEObjectCrossReference_3_0()); 

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
    // $ANTLR end "rule__Shadowing__ShadowedAssignment_3"


    // $ANTLR start "rule__Completeness__DescriptionAssignment_1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1001:1: rule__Completeness__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Completeness__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1005:1: ( ( RULE_STRING ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1006:1: ( RULE_STRING )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1006:1: ( RULE_STRING )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1007:1: RULE_STRING
            {
             before(grammarAccess.getCompletenessAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Completeness__DescriptionAssignment_12005); 
             after(grammarAccess.getCompletenessAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Completeness__DescriptionAssignment_1"


    // $ANTLR start "rule__Completeness__MissedMethodAssignment_2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1016:1: rule__Completeness__MissedMethodAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Completeness__MissedMethodAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1020:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1021:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1021:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1022:1: ( ruleEString )
            {
             before(grammarAccess.getCompletenessAccess().getMissedMethodEObjectCrossReference_2_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1023:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1024:1: ruleEString
            {
             before(grammarAccess.getCompletenessAccess().getMissedMethodEObjectEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Completeness__MissedMethodAssignment_22040);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompletenessAccess().getMissedMethodEObjectEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCompletenessAccess().getMissedMethodEObjectCrossReference_2_0()); 

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
    // $ANTLR end "rule__Completeness__MissedMethodAssignment_2"


    // $ANTLR start "rule__Completeness__SecurityConstraintAssignment_3"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1035:1: rule__Completeness__SecurityConstraintAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Completeness__SecurityConstraintAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1039:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1040:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1040:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1041:1: ( ruleEString )
            {
             before(grammarAccess.getCompletenessAccess().getSecurityConstraintEObjectCrossReference_3_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1042:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1043:1: ruleEString
            {
             before(grammarAccess.getCompletenessAccess().getSecurityConstraintEObjectEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Completeness__SecurityConstraintAssignment_32079);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompletenessAccess().getSecurityConstraintEObjectEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCompletenessAccess().getSecurityConstraintEObjectCrossReference_3_0()); 

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
    // $ANTLR end "rule__Completeness__SecurityConstraintAssignment_3"


    // $ANTLR start "rule__Redundancy__DescriptionAssignment_1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1054:1: rule__Redundancy__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Redundancy__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1058:1: ( ( RULE_STRING ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1059:1: ( RULE_STRING )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1059:1: ( RULE_STRING )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1060:1: RULE_STRING
            {
             before(grammarAccess.getRedundancyAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Redundancy__DescriptionAssignment_12114); 
             after(grammarAccess.getRedundancyAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Redundancy__DescriptionAssignment_1"


    // $ANTLR start "rule__Redundancy__ContainingAssignment_2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1069:1: rule__Redundancy__ContainingAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Redundancy__ContainingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1073:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1074:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1074:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1075:1: ( ruleEString )
            {
             before(grammarAccess.getRedundancyAccess().getContainingEObjectCrossReference_2_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1076:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1077:1: ruleEString
            {
             before(grammarAccess.getRedundancyAccess().getContainingEObjectEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Redundancy__ContainingAssignment_22149);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRedundancyAccess().getContainingEObjectEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRedundancyAccess().getContainingEObjectCrossReference_2_0()); 

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
    // $ANTLR end "rule__Redundancy__ContainingAssignment_2"


    // $ANTLR start "rule__Redundancy__ContainedAssignment_3"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1088:1: rule__Redundancy__ContainedAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Redundancy__ContainedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1092:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1093:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1093:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1094:1: ( ruleEString )
            {
             before(grammarAccess.getRedundancyAccess().getContainedEObjectCrossReference_3_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1095:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1096:1: ruleEString
            {
             before(grammarAccess.getRedundancyAccess().getContainedEObjectEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Redundancy__ContainedAssignment_32188);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRedundancyAccess().getContainedEObjectEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRedundancyAccess().getContainedEObjectCrossReference_3_0()); 

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
    // $ANTLR end "rule__Redundancy__ContainedAssignment_3"


    // $ANTLR start "rule__Syntactical__DescriptionAssignment_1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1107:1: rule__Syntactical__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Syntactical__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1111:1: ( ( RULE_STRING ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1112:1: ( RULE_STRING )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1112:1: ( RULE_STRING )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1113:1: RULE_STRING
            {
             before(grammarAccess.getSyntacticalAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Syntactical__DescriptionAssignment_12223); 
             after(grammarAccess.getSyntacticalAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Syntactical__DescriptionAssignment_1"


    // $ANTLR start "rule__Syntactical__MissedRolesAssignment_2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1122:1: rule__Syntactical__MissedRolesAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Syntactical__MissedRolesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1126:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1127:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1127:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1128:1: ( ruleEString )
            {
             before(grammarAccess.getSyntacticalAccess().getMissedRolesEObjectCrossReference_2_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1129:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1130:1: ruleEString
            {
             before(grammarAccess.getSyntacticalAccess().getMissedRolesEObjectEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Syntactical__MissedRolesAssignment_22258);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSyntacticalAccess().getMissedRolesEObjectEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSyntacticalAccess().getMissedRolesEObjectCrossReference_2_0()); 

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
    // $ANTLR end "rule__Syntactical__MissedRolesAssignment_2"


    // $ANTLR start "rule__Reachability__DescriptionAssignment_1"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1141:1: rule__Reachability__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Reachability__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1145:1: ( ( RULE_STRING ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1146:1: ( RULE_STRING )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1146:1: ( RULE_STRING )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1147:1: RULE_STRING
            {
             before(grammarAccess.getReachabilityAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Reachability__DescriptionAssignment_12293); 
             after(grammarAccess.getReachabilityAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Reachability__DescriptionAssignment_1"


    // $ANTLR start "rule__Reachability__UnreachableResourcesAssignment_2"
    // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1156:1: rule__Reachability__UnreachableResourcesAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Reachability__UnreachableResourcesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1160:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1161:1: ( ( ruleEString ) )
            {
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1161:1: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1162:1: ( ruleEString )
            {
             before(grammarAccess.getReachabilityAccess().getUnreachableResourcesEObjectCrossReference_2_0()); 
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1163:1: ( ruleEString )
            // ../org.xtext.anomaly.report.ui/src-gen/org/xtext/anomaly/report/ui/contentassist/antlr/internal/InternalReport.g:1164:1: ruleEString
            {
             before(grammarAccess.getReachabilityAccess().getUnreachableResourcesEObjectEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Reachability__UnreachableResourcesAssignment_22328);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReachabilityAccess().getUnreachableResourcesEObjectEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReachabilityAccess().getUnreachableResourcesEObjectCrossReference_2_0()); 

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
    // $ANTLR end "rule__Reachability__UnreachableResourcesAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleReport_in_entryRuleReport61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReport68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Report__AnomaliesAssignment_in_ruleReport94 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnomaly_in_entryRuleAnomaly182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnomaly189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Anomaly__Alternatives_in_ruleAnomaly215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShadowing_in_entryRuleShadowing242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShadowing249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__0_in_ruleShadowing275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompleteness_in_entryRuleCompleteness302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompleteness309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Completeness__Group__0_in_ruleCompleteness335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedundancy_in_entryRuleRedundancy362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRedundancy369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__0_in_ruleRedundancy395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntactical_in_entryRuleSyntactical422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntactical429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntactical__Group__0_in_ruleSyntactical455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReachability_in_entryRuleReachability482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReachability489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reachability__Group__0_in_ruleReachability515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShadowing_in_rule__Anomaly__Alternatives600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompleteness_in_rule__Anomaly__Alternatives617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedundancy_in_rule__Anomaly__Alternatives634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntactical_in_rule__Anomaly__Alternatives651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReachability_in_rule__Anomaly__Alternatives668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__0__Impl_in_rule__Shadowing__Group__0698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__1_in_rule__Shadowing__Group__0701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Shadowing__Group__0__Impl729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__1__Impl_in_rule__Shadowing__Group__1760 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__2_in_rule__Shadowing__Group__1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__DescriptionAssignment_1_in_rule__Shadowing__Group__1__Impl790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__2__Impl_in_rule__Shadowing__Group__2820 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__3_in_rule__Shadowing__Group__2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__ShadowingAssignment_2_in_rule__Shadowing__Group__2__Impl850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__Group__3__Impl_in_rule__Shadowing__Group__3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shadowing__ShadowedAssignment_3_in_rule__Shadowing__Group__3__Impl907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Completeness__Group__0__Impl_in_rule__Completeness__Group__0945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Completeness__Group__1_in_rule__Completeness__Group__0948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Completeness__Group__0__Impl976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Completeness__Group__1__Impl_in_rule__Completeness__Group__11007 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Completeness__Group__2_in_rule__Completeness__Group__11010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Completeness__DescriptionAssignment_1_in_rule__Completeness__Group__1__Impl1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Completeness__Group__2__Impl_in_rule__Completeness__Group__21067 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Completeness__Group__3_in_rule__Completeness__Group__21070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Completeness__MissedMethodAssignment_2_in_rule__Completeness__Group__2__Impl1099 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Completeness__MissedMethodAssignment_2_in_rule__Completeness__Group__2__Impl1111 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Completeness__Group__3__Impl_in_rule__Completeness__Group__31144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Completeness__SecurityConstraintAssignment_3_in_rule__Completeness__Group__3__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__0__Impl_in_rule__Redundancy__Group__01209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__1_in_rule__Redundancy__Group__01212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Redundancy__Group__0__Impl1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__1__Impl_in_rule__Redundancy__Group__11271 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__2_in_rule__Redundancy__Group__11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__DescriptionAssignment_1_in_rule__Redundancy__Group__1__Impl1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__2__Impl_in_rule__Redundancy__Group__21331 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__3_in_rule__Redundancy__Group__21334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__ContainingAssignment_2_in_rule__Redundancy__Group__2__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__Group__3__Impl_in_rule__Redundancy__Group__31391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Redundancy__ContainedAssignment_3_in_rule__Redundancy__Group__3__Impl1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntactical__Group__0__Impl_in_rule__Syntactical__Group__01456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Syntactical__Group__1_in_rule__Syntactical__Group__01459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Syntactical__Group__0__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntactical__Group__1__Impl_in_rule__Syntactical__Group__11518 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Syntactical__Group__2_in_rule__Syntactical__Group__11521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntactical__DescriptionAssignment_1_in_rule__Syntactical__Group__1__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntactical__Group__2__Impl_in_rule__Syntactical__Group__21578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntactical__MissedRolesAssignment_2_in_rule__Syntactical__Group__2__Impl1607 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Syntactical__MissedRolesAssignment_2_in_rule__Syntactical__Group__2__Impl1619 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Reachability__Group__0__Impl_in_rule__Reachability__Group__01658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Reachability__Group__1_in_rule__Reachability__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Reachability__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reachability__Group__1__Impl_in_rule__Reachability__Group__11720 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Reachability__Group__2_in_rule__Reachability__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reachability__DescriptionAssignment_1_in_rule__Reachability__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reachability__Group__2__Impl_in_rule__Reachability__Group__21780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reachability__UnreachableResourcesAssignment_2_in_rule__Reachability__Group__2__Impl1809 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Reachability__UnreachableResourcesAssignment_2_in_rule__Reachability__Group__2__Impl1821 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleAnomaly_in_rule__Report__AnomaliesAssignment1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Shadowing__DescriptionAssignment_11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Shadowing__ShadowingAssignment_21931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Shadowing__ShadowedAssignment_31970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Completeness__DescriptionAssignment_12005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Completeness__MissedMethodAssignment_22040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Completeness__SecurityConstraintAssignment_32079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Redundancy__DescriptionAssignment_12114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Redundancy__ContainingAssignment_22149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Redundancy__ContainedAssignment_32188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Syntactical__DescriptionAssignment_12223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Syntactical__MissedRolesAssignment_22258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Reachability__DescriptionAssignment_12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Reachability__UnreachableResourcesAssignment_22328 = new BitSet(new long[]{0x0000000000000002L});

}