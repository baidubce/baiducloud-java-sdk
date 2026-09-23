package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityAnalysisResponse extends BaseBceResponse {

    /**
    * 错误码
    */
    @JsonProperty("error_code")
    private Integer errorCode;

    /**
    * 错误信息
    */
    @JsonProperty("error_msg")
    private String errorMsg;

    /**
    * 请求唯一标识码
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 需要进行实体分析的文本
    */
    private String text;

    /**
    * 实体标注结果的数组集合
    */
    @JsonProperty("entity_analysis")
    private List<EntityAnalysis> entityAnalysis;

    public Integer getErrorCode() {
        return errorCode;
    }

    public EntityAnalysisResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public EntityAnalysisResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public EntityAnalysisResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getText() {
        return text;
    }

    public EntityAnalysisResponse setText(String text) {
        this.text = text;
        return this;
    }

    public List<EntityAnalysis> getEntityAnalysis() {
        return entityAnalysis;
    }

    public EntityAnalysisResponse setEntityAnalysis(List<EntityAnalysis> entityAnalysis) {
        this.entityAnalysis = entityAnalysis;
        return this;
    }

    @Override
    public String toString() {
        return "EntityAnalysisResponse{" + "errorCode=" + errorCode + "\n" + "errorMsg=" + errorMsg + "\n" + "logId=" + logId + "\n" + "text=" + text + "\n" + "entityAnalysis="
                + entityAnalysis + "\n" + "}";
    }

}
