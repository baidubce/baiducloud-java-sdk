package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Partner {
    /**
     * 股东
     */
    private String stockname;

    /**
     * 股东类型
     */
    private String stocktype;

    /**
     * 出资比例
     */
    private String stockpercent;

    /**
     * 认缴出资额
     */
    private String stockcapital;

    /**
     * 认缴出资时间
     */
    private String shouddate;

    /**
     * 认缴出资方式
     */
    private String investtype;

    /**
     * 实缴出资额
     */
    private String stockrealcapital;

    /**
     * 实缴时间
     */
    private String capidate;

    /**
     * 实际出资方式
     */
    private String investname;

    /**
     * 出资币种
     */
    private String concur;

    public Partner setStockname(String stockname) {
        this.stockname = stockname;
        return this;
    }

    public String getStockname() {
        return this.stockname;
    }

    public Partner setStocktype(String stocktype) {
        this.stocktype = stocktype;
        return this;
    }

    public String getStocktype() {
        return this.stocktype;
    }

    public Partner setStockpercent(String stockpercent) {
        this.stockpercent = stockpercent;
        return this;
    }

    public String getStockpercent() {
        return this.stockpercent;
    }

    public Partner setStockcapital(String stockcapital) {
        this.stockcapital = stockcapital;
        return this;
    }

    public String getStockcapital() {
        return this.stockcapital;
    }

    public Partner setShouddate(String shouddate) {
        this.shouddate = shouddate;
        return this;
    }

    public String getShouddate() {
        return this.shouddate;
    }

    public Partner setInvesttype(String investtype) {
        this.investtype = investtype;
        return this;
    }

    public String getInvesttype() {
        return this.investtype;
    }

    public Partner setStockrealcapital(String stockrealcapital) {
        this.stockrealcapital = stockrealcapital;
        return this;
    }

    public String getStockrealcapital() {
        return this.stockrealcapital;
    }

    public Partner setCapidate(String capidate) {
        this.capidate = capidate;
        return this;
    }

    public String getCapidate() {
        return this.capidate;
    }

    public Partner setInvestname(String investname) {
        this.investname = investname;
        return this;
    }

    public String getInvestname() {
        return this.investname;
    }

    public Partner setConcur(String concur) {
        this.concur = concur;
        return this;
    }

    public String getConcur() {
        return this.concur;
    }

    @Override
    public String toString() {
        return "Partner{" + "stockname=" + stockname + "\n" + "stocktype=" + stocktype + "\n" + "stockpercent=" + stockpercent + "\n" + "stockcapital=" + stockcapital + "\n"
                + "shouddate=" + shouddate + "\n" + "investtype=" + investtype + "\n" + "stockrealcapital=" + stockrealcapital + "\n" + "capidate=" + capidate + "\n"
                + "investname=" + investname + "\n" + "concur=" + concur + "\n" + "}";
    }

}