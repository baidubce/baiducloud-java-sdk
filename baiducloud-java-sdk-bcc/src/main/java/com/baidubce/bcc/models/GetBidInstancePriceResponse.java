package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBidInstancePriceResponse extends BaseBceResponse {

    /**
    * 总价
    */
    private String money;

    /**
    * 购买个数
    */
    private String count;

    /**
    * 原价总价
    */
    private String originalMoney;

    /**
    * 原价单价
    */
    private String perOriginalMoney;

    /**
    * 单个价格
    */
    private String perMoney;

    public String getMoney() {
        return money;
    }

    public GetBidInstancePriceResponse setMoney(String money) {
        this.money = money;
        return this;
    }

    public String getCount() {
        return count;
    }

    public GetBidInstancePriceResponse setCount(String count) {
        this.count = count;
        return this;
    }

    public String getOriginalMoney() {
        return originalMoney;
    }

    public GetBidInstancePriceResponse setOriginalMoney(String originalMoney) {
        this.originalMoney = originalMoney;
        return this;
    }

    public String getPerOriginalMoney() {
        return perOriginalMoney;
    }

    public GetBidInstancePriceResponse setPerOriginalMoney(String perOriginalMoney) {
        this.perOriginalMoney = perOriginalMoney;
        return this;
    }

    public String getPerMoney() {
        return perMoney;
    }

    public GetBidInstancePriceResponse setPerMoney(String perMoney) {
        this.perMoney = perMoney;
        return this;
    }

    @Override
    public String toString() {
        return "GetBidInstancePriceResponse{" + "money=" + money + "\n" + "count=" + count + "\n" + "originalMoney=" + originalMoney + "\n" + "perOriginalMoney="
                + perOriginalMoney + "\n" + "perMoney=" + perMoney + "\n" + "}";
    }

}
