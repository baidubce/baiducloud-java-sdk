package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 文章标题，最大80字节
    */
    private String title;

    /**
    * 文章内容，最大65535字节
    */
    private String content;

    public String getCharset() {
        return charset;
    }

    public KeywordRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public KeywordRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public KeywordRequest setContent(String content) {
        this.content = content;
        return this;
    }

}
