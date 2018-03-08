/*
 * generated by Xtext 2.12.0
 */
package org.archware.sosadl.ide.contentassist.antlr;

import java.util.Collection;
import java.util.Collections;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.partialEditing.IPartialEditingContentAssistParser;
import org.eclipse.xtext.util.PolymorphicDispatcher;

public class PartialSosADLContentAssistParser extends SosADLParser implements IPartialEditingContentAssistParser {

	private AbstractRule rule;

	@Override
	public void initializeFor(AbstractRule rule) {
		this.rule = rule;
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		if (rule == null || rule.eIsProxy())
			return Collections.emptyList();
		String methodName = "entryRule" + rule.getName();
		PolymorphicDispatcher<Collection<FollowElement>> dispatcher = 
			new PolymorphicDispatcher<Collection<FollowElement>>(methodName, 0, 0, Collections.singletonList(parser));
		dispatcher.invoke();
		return parser.getFollowElements();
	}

}
