package eu.stratosphere.sopremo.expressions;

import org.junit.Test;

import eu.stratosphere.sopremo.EvaluationException;
import eu.stratosphere.sopremo.type.NullNode;

public class ErroneousExpressionTest extends EvaluableExpressionTest<UnevaluableExpression> {

	@Test(expected = EvaluationException.class)
	public void shouldThrowException() {
		new UnevaluableExpression("TestExceptionMessage").evaluate(NullNode.getInstance());

	}

	@Override
	protected UnevaluableExpression createDefaultInstance(final int index) {
		return new UnevaluableExpression(String.valueOf(index));
	}
}
