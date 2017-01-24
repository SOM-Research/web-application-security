package org.xtext.anomaly.report.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.anomaly.report.services.ReportGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReportParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g"; }



     	private ReportGrammarAccess grammarAccess;
     	
        public InternalReportParser(TokenStream input, ReportGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Report";	
       	}
       	
       	@Override
       	protected ReportGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleReport"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:67:1: entryRuleReport returns [EObject current=null] : iv_ruleReport= ruleReport EOF ;
    public final EObject entryRuleReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReport = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:68:2: (iv_ruleReport= ruleReport EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:69:2: iv_ruleReport= ruleReport EOF
            {
             newCompositeNode(grammarAccess.getReportRule()); 
            pushFollow(FOLLOW_ruleReport_in_entryRuleReport75);
            iv_ruleReport=ruleReport();

            state._fsp--;

             current =iv_ruleReport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReport85); 

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
    // $ANTLR end "entryRuleReport"


    // $ANTLR start "ruleReport"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:76:1: ruleReport returns [EObject current=null] : ( (lv_anomalies_0_0= ruleAnomaly ) )* ;
    public final EObject ruleReport() throws RecognitionException {
        EObject current = null;

        EObject lv_anomalies_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:79:28: ( ( (lv_anomalies_0_0= ruleAnomaly ) )* )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:80:1: ( (lv_anomalies_0_0= ruleAnomaly ) )*
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:80:1: ( (lv_anomalies_0_0= ruleAnomaly ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:81:1: (lv_anomalies_0_0= ruleAnomaly )
            	    {
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:81:1: (lv_anomalies_0_0= ruleAnomaly )
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:82:3: lv_anomalies_0_0= ruleAnomaly
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReportAccess().getAnomaliesAnomalyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnomaly_in_ruleReport130);
            	    lv_anomalies_0_0=ruleAnomaly();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReportRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"anomalies",
            	            		lv_anomalies_0_0, 
            	            		"Anomaly");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleReport"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:106:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:107:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:108:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString167);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString178); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:115:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:118:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:119:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:119:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:119:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString218); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:127:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString244); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAnomaly"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:142:1: entryRuleAnomaly returns [EObject current=null] : iv_ruleAnomaly= ruleAnomaly EOF ;
    public final EObject entryRuleAnomaly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnomaly = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:143:2: (iv_ruleAnomaly= ruleAnomaly EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:144:2: iv_ruleAnomaly= ruleAnomaly EOF
            {
             newCompositeNode(grammarAccess.getAnomalyRule()); 
            pushFollow(FOLLOW_ruleAnomaly_in_entryRuleAnomaly289);
            iv_ruleAnomaly=ruleAnomaly();

            state._fsp--;

             current =iv_ruleAnomaly; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnomaly299); 

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
    // $ANTLR end "entryRuleAnomaly"


    // $ANTLR start "ruleAnomaly"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:151:1: ruleAnomaly returns [EObject current=null] : (this_Shadowing_0= ruleShadowing | this_Completeness_1= ruleCompleteness | this_Redundancy_2= ruleRedundancy | this_Syntactical_3= ruleSyntactical | this_Reachability_4= ruleReachability ) ;
    public final EObject ruleAnomaly() throws RecognitionException {
        EObject current = null;

        EObject this_Shadowing_0 = null;

        EObject this_Completeness_1 = null;

        EObject this_Redundancy_2 = null;

        EObject this_Syntactical_3 = null;

        EObject this_Reachability_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:154:28: ( (this_Shadowing_0= ruleShadowing | this_Completeness_1= ruleCompleteness | this_Redundancy_2= ruleRedundancy | this_Syntactical_3= ruleSyntactical | this_Reachability_4= ruleReachability ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:155:1: (this_Shadowing_0= ruleShadowing | this_Completeness_1= ruleCompleteness | this_Redundancy_2= ruleRedundancy | this_Syntactical_3= ruleSyntactical | this_Reachability_4= ruleReachability )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:155:1: (this_Shadowing_0= ruleShadowing | this_Completeness_1= ruleCompleteness | this_Redundancy_2= ruleRedundancy | this_Syntactical_3= ruleSyntactical | this_Reachability_4= ruleReachability )
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
                    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:156:5: this_Shadowing_0= ruleShadowing
                    {
                     
                            newCompositeNode(grammarAccess.getAnomalyAccess().getShadowingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleShadowing_in_ruleAnomaly346);
                    this_Shadowing_0=ruleShadowing();

                    state._fsp--;

                     
                            current = this_Shadowing_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:166:5: this_Completeness_1= ruleCompleteness
                    {
                     
                            newCompositeNode(grammarAccess.getAnomalyAccess().getCompletenessParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCompleteness_in_ruleAnomaly373);
                    this_Completeness_1=ruleCompleteness();

                    state._fsp--;

                     
                            current = this_Completeness_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:176:5: this_Redundancy_2= ruleRedundancy
                    {
                     
                            newCompositeNode(grammarAccess.getAnomalyAccess().getRedundancyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRedundancy_in_ruleAnomaly400);
                    this_Redundancy_2=ruleRedundancy();

                    state._fsp--;

                     
                            current = this_Redundancy_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:186:5: this_Syntactical_3= ruleSyntactical
                    {
                     
                            newCompositeNode(grammarAccess.getAnomalyAccess().getSyntacticalParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSyntactical_in_ruleAnomaly427);
                    this_Syntactical_3=ruleSyntactical();

                    state._fsp--;

                     
                            current = this_Syntactical_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:196:5: this_Reachability_4= ruleReachability
                    {
                     
                            newCompositeNode(grammarAccess.getAnomalyAccess().getReachabilityParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReachability_in_ruleAnomaly454);
                    this_Reachability_4=ruleReachability();

                    state._fsp--;

                     
                            current = this_Reachability_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAnomaly"


    // $ANTLR start "entryRuleShadowing"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:212:1: entryRuleShadowing returns [EObject current=null] : iv_ruleShadowing= ruleShadowing EOF ;
    public final EObject entryRuleShadowing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowing = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:213:2: (iv_ruleShadowing= ruleShadowing EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:214:2: iv_ruleShadowing= ruleShadowing EOF
            {
             newCompositeNode(grammarAccess.getShadowingRule()); 
            pushFollow(FOLLOW_ruleShadowing_in_entryRuleShadowing489);
            iv_ruleShadowing=ruleShadowing();

            state._fsp--;

             current =iv_ruleShadowing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShadowing499); 

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
    // $ANTLR end "entryRuleShadowing"


    // $ANTLR start "ruleShadowing"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:221:1: ruleShadowing returns [EObject current=null] : (otherlv_0= 'Shadowing' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleShadowing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:224:28: ( (otherlv_0= 'Shadowing' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:225:1: (otherlv_0= 'Shadowing' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:225:1: (otherlv_0= 'Shadowing' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:225:3: otherlv_0= 'Shadowing' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleShadowing536); 

                	newLeafNode(otherlv_0, grammarAccess.getShadowingAccess().getShadowingKeyword_0());
                
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:229:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:230:1: (lv_description_1_0= RULE_STRING )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:230:1: (lv_description_1_0= RULE_STRING )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:231:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleShadowing553); 

            			newLeafNode(lv_description_1_0, grammarAccess.getShadowingAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getShadowingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:247:2: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:248:1: ( ruleEString )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:248:1: ( ruleEString )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:249:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getShadowingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getShadowingAccess().getShadowingEObjectCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleShadowing581);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:262:2: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:263:1: ( ruleEString )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:263:1: ( ruleEString )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:264:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getShadowingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getShadowingAccess().getShadowedEObjectCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleShadowing604);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleShadowing"


    // $ANTLR start "entryRuleCompleteness"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:285:1: entryRuleCompleteness returns [EObject current=null] : iv_ruleCompleteness= ruleCompleteness EOF ;
    public final EObject entryRuleCompleteness() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteness = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:286:2: (iv_ruleCompleteness= ruleCompleteness EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:287:2: iv_ruleCompleteness= ruleCompleteness EOF
            {
             newCompositeNode(grammarAccess.getCompletenessRule()); 
            pushFollow(FOLLOW_ruleCompleteness_in_entryRuleCompleteness640);
            iv_ruleCompleteness=ruleCompleteness();

            state._fsp--;

             current =iv_ruleCompleteness; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompleteness650); 

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
    // $ANTLR end "entryRuleCompleteness"


    // $ANTLR start "ruleCompleteness"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:294:1: ruleCompleteness returns [EObject current=null] : (otherlv_0= 'Completeness' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ( ( ruleEString ) ) ) ;
    public final EObject ruleCompleteness() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:297:28: ( (otherlv_0= 'Completeness' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ( ( ruleEString ) ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:298:1: (otherlv_0= 'Completeness' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ( ( ruleEString ) ) )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:298:1: (otherlv_0= 'Completeness' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:298:3: otherlv_0= 'Completeness' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleCompleteness687); 

                	newLeafNode(otherlv_0, grammarAccess.getCompletenessAccess().getCompletenessKeyword_0());
                
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:302:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:303:1: (lv_description_1_0= RULE_STRING )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:303:1: (lv_description_1_0= RULE_STRING )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:304:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompleteness704); 

            			newLeafNode(lv_description_1_0, grammarAccess.getCompletenessAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompletenessRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:320:2: ( ( ruleEString ) )+
            int cnt4=0;
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
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:321:1: ( ruleEString )
            	    {
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:321:1: ( ruleEString )
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:322:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompletenessRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getCompletenessAccess().getMissedMethodEObjectCrossReference_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleCompleteness732);
            	    ruleEString();

            	    state._fsp--;

            	     
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

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:335:3: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:336:1: ( ruleEString )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:336:1: ( ruleEString )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:337:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompletenessRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCompletenessAccess().getSecurityConstraintEObjectCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleCompleteness756);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleCompleteness"


    // $ANTLR start "entryRuleRedundancy"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:358:1: entryRuleRedundancy returns [EObject current=null] : iv_ruleRedundancy= ruleRedundancy EOF ;
    public final EObject entryRuleRedundancy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedundancy = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:359:2: (iv_ruleRedundancy= ruleRedundancy EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:360:2: iv_ruleRedundancy= ruleRedundancy EOF
            {
             newCompositeNode(grammarAccess.getRedundancyRule()); 
            pushFollow(FOLLOW_ruleRedundancy_in_entryRuleRedundancy792);
            iv_ruleRedundancy=ruleRedundancy();

            state._fsp--;

             current =iv_ruleRedundancy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRedundancy802); 

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
    // $ANTLR end "entryRuleRedundancy"


    // $ANTLR start "ruleRedundancy"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:367:1: ruleRedundancy returns [EObject current=null] : (otherlv_0= 'Redundancy' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleRedundancy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:370:28: ( (otherlv_0= 'Redundancy' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:371:1: (otherlv_0= 'Redundancy' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:371:1: (otherlv_0= 'Redundancy' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:371:3: otherlv_0= 'Redundancy' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleRedundancy839); 

                	newLeafNode(otherlv_0, grammarAccess.getRedundancyAccess().getRedundancyKeyword_0());
                
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:375:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:376:1: (lv_description_1_0= RULE_STRING )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:376:1: (lv_description_1_0= RULE_STRING )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:377:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRedundancy856); 

            			newLeafNode(lv_description_1_0, grammarAccess.getRedundancyAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRedundancyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:393:2: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:394:1: ( ruleEString )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:394:1: ( ruleEString )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:395:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRedundancyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRedundancyAccess().getContainingEObjectCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleRedundancy884);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:408:2: ( ( ruleEString ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:409:1: ( ruleEString )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:409:1: ( ruleEString )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:410:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRedundancyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRedundancyAccess().getContainedEObjectCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleRedundancy907);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleRedundancy"


    // $ANTLR start "entryRuleSyntactical"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:431:1: entryRuleSyntactical returns [EObject current=null] : iv_ruleSyntactical= ruleSyntactical EOF ;
    public final EObject entryRuleSyntactical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntactical = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:432:2: (iv_ruleSyntactical= ruleSyntactical EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:433:2: iv_ruleSyntactical= ruleSyntactical EOF
            {
             newCompositeNode(grammarAccess.getSyntacticalRule()); 
            pushFollow(FOLLOW_ruleSyntactical_in_entryRuleSyntactical943);
            iv_ruleSyntactical=ruleSyntactical();

            state._fsp--;

             current =iv_ruleSyntactical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntactical953); 

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
    // $ANTLR end "entryRuleSyntactical"


    // $ANTLR start "ruleSyntactical"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:440:1: ruleSyntactical returns [EObject current=null] : (otherlv_0= 'Syntactical' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ) ;
    public final EObject ruleSyntactical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:443:28: ( (otherlv_0= 'Syntactical' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:444:1: (otherlv_0= 'Syntactical' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:444:1: (otherlv_0= 'Syntactical' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:444:3: otherlv_0= 'Syntactical' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSyntactical990); 

                	newLeafNode(otherlv_0, grammarAccess.getSyntacticalAccess().getSyntacticalKeyword_0());
                
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:448:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:449:1: (lv_description_1_0= RULE_STRING )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:449:1: (lv_description_1_0= RULE_STRING )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:450:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSyntactical1007); 

            			newLeafNode(lv_description_1_0, grammarAccess.getSyntacticalAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSyntacticalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:466:2: ( ( ruleEString ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:467:1: ( ruleEString )
            	    {
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:467:1: ( ruleEString )
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:468:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSyntacticalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getSyntacticalAccess().getMissedRolesEObjectCrossReference_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleSyntactical1035);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleSyntactical"


    // $ANTLR start "entryRuleReachability"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:489:1: entryRuleReachability returns [EObject current=null] : iv_ruleReachability= ruleReachability EOF ;
    public final EObject entryRuleReachability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReachability = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:490:2: (iv_ruleReachability= ruleReachability EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:491:2: iv_ruleReachability= ruleReachability EOF
            {
             newCompositeNode(grammarAccess.getReachabilityRule()); 
            pushFollow(FOLLOW_ruleReachability_in_entryRuleReachability1072);
            iv_ruleReachability=ruleReachability();

            state._fsp--;

             current =iv_ruleReachability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReachability1082); 

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
    // $ANTLR end "entryRuleReachability"


    // $ANTLR start "ruleReachability"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:498:1: ruleReachability returns [EObject current=null] : (otherlv_0= 'Reachability' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ) ;
    public final EObject ruleReachability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:501:28: ( (otherlv_0= 'Reachability' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:502:1: (otherlv_0= 'Reachability' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:502:1: (otherlv_0= 'Reachability' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+ )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:502:3: otherlv_0= 'Reachability' ( (lv_description_1_0= RULE_STRING ) ) ( ( ruleEString ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleReachability1119); 

                	newLeafNode(otherlv_0, grammarAccess.getReachabilityAccess().getReachabilityKeyword_0());
                
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:506:1: ( (lv_description_1_0= RULE_STRING ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:507:1: (lv_description_1_0= RULE_STRING )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:507:1: (lv_description_1_0= RULE_STRING )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:508:3: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleReachability1136); 

            			newLeafNode(lv_description_1_0, grammarAccess.getReachabilityAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReachabilityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:524:2: ( ( ruleEString ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:525:1: ( ruleEString )
            	    {
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:525:1: ( ruleEString )
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:526:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getReachabilityRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getReachabilityAccess().getUnreachableResourcesEObjectCrossReference_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleReachability1164);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleReachability"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleReport_in_entryRuleReport75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReport85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnomaly_in_ruleReport130 = new BitSet(new long[]{0x000000000000F802L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnomaly_in_entryRuleAnomaly289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnomaly299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShadowing_in_ruleAnomaly346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompleteness_in_ruleAnomaly373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedundancy_in_ruleAnomaly400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntactical_in_ruleAnomaly427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReachability_in_ruleAnomaly454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShadowing_in_entryRuleShadowing489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShadowing499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleShadowing536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleShadowing553 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleShadowing581 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleShadowing604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompleteness_in_entryRuleCompleteness640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompleteness650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCompleteness687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompleteness704 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCompleteness732 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleCompleteness756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRedundancy_in_entryRuleRedundancy792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRedundancy802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRedundancy839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRedundancy856 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRedundancy884 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRedundancy907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntactical_in_entryRuleSyntactical943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntactical953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSyntactical990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSyntactical1007 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSyntactical1035 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleReachability_in_entryRuleReachability1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReachability1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleReachability1119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleReachability1136 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleReachability1164 = new BitSet(new long[]{0x0000000000000032L});

}