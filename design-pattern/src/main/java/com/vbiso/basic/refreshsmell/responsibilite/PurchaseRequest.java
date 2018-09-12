package com.vbiso.basic.refreshsmell.responsibilite;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: wenliujie
 * @Description: 请求类
 * @Date: Created in 下午3:19 2018/9/11
 * @Modified By:
 */
@Setter
@Getter
public class PurchaseRequest {

    private double amount;

    private int number;

    private String purpose;

    public PurchaseRequest() {
    }

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }
}
