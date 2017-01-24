/*
* generated by Xtext
*/
package org.xtext.anomaly.report.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.anomaly.report.services.ReportGrammarAccess;

public class ReportParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ReportGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.anomaly.report.parser.antlr.internal.InternalReportParser createParser(XtextTokenStream stream) {
		return new org.xtext.anomaly.report.parser.antlr.internal.InternalReportParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Report";
	}
	
	public ReportGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ReportGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
