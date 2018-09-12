package com.vbiso.basic.refreshsmell.responsibilite.concrete;

import com.vbiso.basic.refreshsmell.responsibilite.Approver;
import com.vbiso.basic.refreshsmell.responsibilite.PurchaseRequest;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:22 2018/9/11
 * @Modified By:
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount()<5000){
            System.out.println("主任"+this.name+"审批采购单："+request.getPurpose());
        }else{
            this.successor.processRequest(request);
        }
    }
}
