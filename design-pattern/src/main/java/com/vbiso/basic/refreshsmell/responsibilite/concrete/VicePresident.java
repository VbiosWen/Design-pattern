package com.vbiso.basic.refreshsmell.responsibilite.concrete;

import com.vbiso.basic.refreshsmell.responsibilite.Approver;
import com.vbiso.basic.refreshsmell.responsibilite.PurchaseRequest;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:24 2018/9/11
 * @Modified By:
 */
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount()<100000){
            System.out.println("副董事长："+this.name+"审批采购清单："+request.getPurpose());
        }else {
            this.successor.processRequest(request);
        }
    }
}
