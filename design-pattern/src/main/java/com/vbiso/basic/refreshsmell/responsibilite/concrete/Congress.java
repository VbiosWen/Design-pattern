package com.vbiso.basic.refreshsmell.responsibilite.concrete;

import com.vbiso.basic.refreshsmell.responsibilite.Approver;
import com.vbiso.basic.refreshsmell.responsibilite.PurchaseRequest;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:27 2018/9/11
 * @Modified By:
 */
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单:"+request.getNumber()+"清单"+request.getPurpose());
    }
}
