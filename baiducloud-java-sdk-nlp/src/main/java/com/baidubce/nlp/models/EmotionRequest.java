package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmotionRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 待识别情感文本，输入限制512字节
    */
    private String text;

    /**
    * default（默认项-不区分场景），talk（闲聊对话-如度秘聊天等），task（任务型对话-如导航对话等），customer_service（客服对话-如电信/银行客服等）
    */
    private String scene;

    public String getCharset() {
        return charset;
    }

    public EmotionRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getText() {
        return text;
    }

    public EmotionRequest setText(String text) {
        this.text = text;
        return this;
    }

    public String getScene() {
        return scene;
    }

    public EmotionRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }

}
