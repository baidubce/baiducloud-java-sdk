package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Industry {
    /**
     * 国民经济行业分类门类名称
     */
    private String industry;

    /**
     * 国民经济行业分类大类名称
     */
    private String subindustry;

    public Industry setIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    public String getIndustry() {
        return this.industry;
    }

    public Industry setSubindustry(String subindustry) {
        this.subindustry = subindustry;
        return this;
    }

    public String getSubindustry() {
        return this.subindustry;
    }

    @Override
    public String toString() {
        return "Industry{" + "industry=" + industry + "\n" + "subindustry=" + subindustry + "\n" + "}";
    }

}