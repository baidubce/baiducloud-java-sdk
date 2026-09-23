package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntityAnalysisRequest extends BaseBceRequest {

    /**
    * 需要进行实体分析的文本，最多128个汉字
    */
    private String text;

    /**
    * 输入需要指定分析的实体
    */
    private String mention;

    public String getText() {
        return text;
    }

    public EntityAnalysisRequest setText(String text) {
        this.text = text;
        return this;
    }

    public String getMention() {
        return mention;
    }

    public EntityAnalysisRequest setMention(String mention) {
        this.mention = mention;
        return this;
    }

}
