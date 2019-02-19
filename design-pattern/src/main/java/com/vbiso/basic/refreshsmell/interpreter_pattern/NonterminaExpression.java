package com.vbiso.basic.refreshsmell.interpreter_pattern;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 11:07 PM 2019/2/18
 * @Modified By:
 */
public class NonterminaExpression extends AbstractExpression {

  private AbstractExpression left;

  private AbstractExpression right;

  public NonterminaExpression(
      AbstractExpression left,
      AbstractExpression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public void interpret(Context context) {

  }
}
