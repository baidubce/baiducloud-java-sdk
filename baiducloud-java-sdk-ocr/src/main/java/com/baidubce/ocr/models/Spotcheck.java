package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Spotcheck {
    /**
     * 登记编号
     */
    private String no;

    /**
     * 检查实施机关
     */
    private String executiveorg;

    /**
     * 类型
     */
    private String type;

    /**
     * 日期
     */
    private String date;

    /**
     * 结果
     */
    private String consequence;

    /**
     * 备注
     */
    private String remark;

    public Spotcheck setNo(String no) {
        this.no = no;
        return this;
    }

    public String getNo() {
        return this.no;
    }

    public Spotcheck setExecutiveorg(String executiveorg) {
        this.executiveorg = executiveorg;
        return this;
    }

    public String getExecutiveorg() {
        return this.executiveorg;
    }

    public Spotcheck setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Spotcheck setDate(String date) {
        this.date = date;
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public Spotcheck setConsequence(String consequence) {
        this.consequence = consequence;
        return this;
    }

    public String getConsequence() {
        return this.consequence;
    }

    public Spotcheck setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    @Override
    public String toString() {
        return "Spotcheck{" + "no=" + no + "\n" + "executiveorg=" + executiveorg + "\n" + "type=" + type + "\n" + "date=" + date + "\n" + "consequence=" + consequence + "\n"
                + "remark=" + remark + "\n" + "}";
    }

}