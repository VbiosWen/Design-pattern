package com.vbiso.basic.refreshsmell.responsibilite;

/**
 * @Author: wenliujie
 * @Description: 抽象处理者
 * @Date: Created in 下午3:20 2018/9/11
 * @Modified By:
 */
public abstract class Approver {

    protected Approver successor;

    protected String name;//审批者姓名

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);

}
