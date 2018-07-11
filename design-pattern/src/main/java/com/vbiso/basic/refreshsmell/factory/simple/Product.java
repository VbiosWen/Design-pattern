package com.vbiso.basic.refreshsmell.factory.simple;

/**
 * @Author: wenliujie
 * @Description: 抽象产品类
 * @Date: Created in 下午9:28 2018/7/9
 * @Modified By:
 */
public abstract class Product {

  private long productId;

  private String productName;

  private String productSign;

  public abstract void display();

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductSign() {
    return productSign;
  }

  public void setProductSign(String productSign) {
    this.productSign = productSign;
  }
}
