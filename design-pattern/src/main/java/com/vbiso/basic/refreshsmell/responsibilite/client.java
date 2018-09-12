package com.vbiso.basic.refreshsmell.responsibilite;

import com.vbiso.basic.refreshsmell.responsibilite.concrete.Congress;
import com.vbiso.basic.refreshsmell.responsibilite.concrete.Director;
import com.vbiso.basic.refreshsmell.responsibilite.concrete.President;
import com.vbiso.basic.refreshsmell.responsibilite.concrete.VicePresident;

/**
 * @Author: wenliujie
 * @Description:
 * @Date: Created in 下午3:28 2018/9/11
 * @Modified By:
 */
public class client {


    public static void main(String[] args){
        Approver wjzhang,gyang,jguo,meeting;
        wjzhang=new Director("p3");
        gyang=new VicePresident("p4");
        jguo=new President("p5");
        meeting=new Congress("p6");

        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        PurchaseRequest pr1=new PurchaseRequest(45000,10001,"购买椅子");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2=new PurchaseRequest(60000,10002,"购买金子");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3=new PurchaseRequest(160000,10003,"购买钻石");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4=new PurchaseRequest(8000000,10004,"购买地球");
        wjzhang.processRequest(pr4);
    }

}
