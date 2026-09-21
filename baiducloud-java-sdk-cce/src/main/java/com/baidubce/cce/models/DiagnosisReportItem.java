package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiagnosisReportItem {
    /**
     * 诊断项 ID
     */
    private Integer itemId;

    /**
     * 诊断是否通过，true 表示通过，false 表示不通过
     */
    private Boolean result;

    /**
     * 复合结果（result 与 grade 组合后的结果），正常时为 normal
     */
    private String composedResult;

    /**
     * 诊断项结果信息，正常时为 Normal，异常时为错误信息
     */
    private String value;

    /**
     * 错误信息
     */
    private String exactMessage;

    /**
     * 诊断项中文名
     */
    private String itemNameZH;

    /**
     * 诊断项描述
     */
    private String description;

    /**
     * 诊断项修复建议
     */
    private String suggestion;

    /**
     * 诊断项等级，可选 [ warning（警告）, error（异常） ]
     */
    private String grade;

    /**
     * 诊断项是否启用
     */
    private Boolean enable;

    public DiagnosisReportItem setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public DiagnosisReportItem setResult(Boolean result) {
        this.result = result;
        return this;
    }

    public Boolean getResult() {
        return this.result;
    }

    public DiagnosisReportItem setComposedResult(String composedResult) {
        this.composedResult = composedResult;
        return this;
    }

    public String getComposedResult() {
        return this.composedResult;
    }

    public DiagnosisReportItem setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return this.value;
    }

    public DiagnosisReportItem setExactMessage(String exactMessage) {
        this.exactMessage = exactMessage;
        return this;
    }

    public String getExactMessage() {
        return this.exactMessage;
    }

    public DiagnosisReportItem setItemNameZH(String itemNameZH) {
        this.itemNameZH = itemNameZH;
        return this;
    }

    public String getItemNameZH() {
        return this.itemNameZH;
    }

    public DiagnosisReportItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public DiagnosisReportItem setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public DiagnosisReportItem setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public String getGrade() {
        return this.grade;
    }

    public DiagnosisReportItem setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    @Override
    public String toString() {
        return "DiagnosisReportItem{" + "itemId=" + itemId + "\n" + "result=" + result + "\n" + "composedResult=" + composedResult + "\n" + "value=" + value + "\n"
                + "exactMessage=" + exactMessage + "\n" + "itemNameZH=" + itemNameZH + "\n" + "description=" + description + "\n" + "suggestion=" + suggestion + "\n" + "grade="
                + grade + "\n" + "enable=" + enable + "\n" + "}";
    }

}