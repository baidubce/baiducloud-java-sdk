package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InspectionItemInfo {
    /**
     * 巡检项中文名/解释说明
     */
    private String itemNameZH;

    /**
     * 巡检项 ID
     */
    private Integer itemId;

    /**
     * 巡检结果，可选 [ normal（正常）, abnormal（异常）, unknown（未知） ]
     */
    private String result;

    /**
     * 异常影响
     */
    private String effect;

    /**
     * 修复建议
     */
    private String suggestion;

    /**
     * 风险级别，可选 [ normal（正常）, lowRisk（低风险）, mediumRisk（中风险）, highRisk（高风险） ]
     */
    private String grade;

    /**
     * 复合结果，可选 [ normal, lowRisk, mediumRisk, highRisk ]
     */
    private String composedResult;

    public InspectionItemInfo setItemNameZH(String itemNameZH) {
        this.itemNameZH = itemNameZH;
        return this;
    }

    public String getItemNameZH() {
        return this.itemNameZH;
    }

    public InspectionItemInfo setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public InspectionItemInfo setResult(String result) {
        this.result = result;
        return this;
    }

    public String getResult() {
        return this.result;
    }

    public InspectionItemInfo setEffect(String effect) {
        this.effect = effect;
        return this;
    }

    public String getEffect() {
        return this.effect;
    }

    public InspectionItemInfo setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public InspectionItemInfo setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public String getGrade() {
        return this.grade;
    }

    public InspectionItemInfo setComposedResult(String composedResult) {
        this.composedResult = composedResult;
        return this;
    }

    public String getComposedResult() {
        return this.composedResult;
    }

    @Override
    public String toString() {
        return "InspectionItemInfo{" + "itemNameZH=" + itemNameZH + "\n" + "itemId=" + itemId + "\n" + "result=" + result + "\n" + "effect=" + effect + "\n" + "suggestion="
                + suggestion + "\n" + "grade=" + grade + "\n" + "composedResult=" + composedResult + "\n" + "}";
    }

}