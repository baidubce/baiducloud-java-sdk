package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtMonetRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 输入的文本列表，支持不超过2段的文本进行批量提取
    */
    @JsonProperty("content_list")
    private List<ContentItem> contentList;

    public String getCharset() {
        return charset;
    }

    public TxtMonetRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public List<ContentItem> getContentList() {
        return contentList;
    }

    public TxtMonetRequest setContentList(List<ContentItem> contentList) {
        this.contentList = contentList;
        return this;
    }

}
