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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Property'", "'Description'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
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
        	return "Model";	
       	}
       	
       	@Override
       	protected ReportGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:76:1: ruleModel returns [EObject current=null] : ( (lv_anomalies_0_0= ruleAnomaly ) )* ;
    public final EObject ruleModel() throws RecognitionException {
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

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:81:1: (lv_anomalies_0_0= ruleAnomaly )
            	    {
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:81:1: (lv_anomalies_0_0= ruleAnomaly )
            	    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:82:3: lv_anomalies_0_0= ruleAnomaly
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getAnomaliesAnomalyParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnomaly_in_ruleModel130);
            	    lv_anomalies_0_0=ruleAnomaly();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAnomaly"
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:106:1: entryRuleAnomaly returns [EObject current=null] : iv_ruleAnomaly= ruleAnomaly EOF ;
    public final EObject entryRuleAnomaly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnomaly = null;


        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:107:2: (iv_ruleAnomaly= ruleAnomaly EOF )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:108:2: iv_ruleAnomaly= ruleAnomaly EOF
            {
             newCompositeNode(grammarAccess.getAnomalyRule()); 
            pushFollow(FOLLOW_ruleAnomaly_in_entryRuleAnomaly166);
            iv_ruleAnomaly=ruleAnomaly();

            state._fsp--;

             current =iv_ruleAnomaly; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnomaly176); 

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
    // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:115:1: ruleAnomaly returns [EObject current=null] : (otherlv_0= 'Property' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_descr_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnomaly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_descr_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:118:28: ( (otherlv_0= 'Property' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_descr_3_0= RULE_STRING ) ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:119:1: (otherlv_0= 'Property' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_descr_3_0= RULE_STRING ) ) )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:119:1: (otherlv_0= 'Property' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_descr_3_0= RULE_STRING ) ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:119:3: otherlv_0= 'Property' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Description' ( (lv_descr_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAnomaly213); 

                	newLeafNode(otherlv_0, grammarAccess.getAnomalyAccess().getPropertyKeyword_0());
                
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:123:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:124:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:124:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:125:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnomaly230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnomalyAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnomalyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAnomaly247); 

                	newLeafNode(otherlv_2, grammarAccess.getAnomalyAccess().getDescriptionKeyword_2());
                
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:145:1: ( (lv_descr_3_0= RULE_STRING ) )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:146:1: (lv_descr_3_0= RULE_STRING )
            {
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:146:1: (lv_descr_3_0= RULE_STRING )
            // ../org.xtext.anomaly.report/src-gen/org/xtext/anomaly/report/parser/antlr/internal/InternalReport.g:147:3: lv_descr_3_0= RULE_STRING
            {
            lv_descr_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnomaly264); 

            			newLeafNode(lv_descr_3_0, grammarAccess.getAnomalyAccess().getDescrSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnomalyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"descr",
                    		lv_descr_3_0, 
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
    // $ANTLR end "ruleAnomaly"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnomaly_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleAnomaly_in_entryRuleAnomaly166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnomaly176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAnomaly213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnomaly230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAnomaly247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnomaly264 = new BitSet(new long[]{0x0000000000000002L});

}