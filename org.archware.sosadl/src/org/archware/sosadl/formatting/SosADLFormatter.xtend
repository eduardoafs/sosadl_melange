/*
 * generated by Xtext
 */
package org.archware.sosadl.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import com.google.inject.Inject;
import org.archware.sosadl.services.SosADLGrammarAccess
import org.eclipse.xtext.IGrammarAccess
import org.eclipse.xtext.Keyword


/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class SosADLFormatter extends AbstractDeclarativeFormatter {

	@Inject extension SosADLGrammarAccess
	
	IGrammarAccess f;
	
	@Override
	override protected void configureFormatting(FormattingConfig c) {
		f = getGrammarAccess();
		
		c.setAutoLinewrap(120);
		c.setWrappedLineIndentation(2);
		
		for (Keyword block : f.findKeywords("{")) {
			c.setSpace(' ').before(block);
			c.setLinewrap(0,0,1).after(block);
			c.setIndentationIncrement().after(block);
		}
		for (Keyword block : f.findKeywords("}")) {
			c.setLinewrap(0,0,1).before(block);
			c.setIndentationDecrement().before(block);
		}
		for (Keyword colon : f.findKeywords(":","::")) {
			c.setNoSpace().around(colon);
		}
		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
			c.setSpace(' ').after(comma);
		}
		for (Keyword lparent : f.findKeywords("(")) {
			c.setNoSpace().before(lparent);
			c.setSpace(' ').after(lparent);
		}
		for (Keyword rparent : f.findKeywords(")")) {
			c.setSpace(' ').before(rparent);
		}
		
		for (Keyword keyword : f.findKeywords("with","library","datatype","function","sos",
				"system","architecture","mediator","gate","guarantee","duty","assume",
				"environment","connection","protocol","repeat","if","choose","foreach","do",
				"via","ask","tell","untell","behavior","value","unobservable")) {
			c.setLinewrap(0,1,2).before(keyword);
		}

		// formatting for Comments
		// It's usually a good idea to activate the following three statements.
		// They will add and preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
	}
}