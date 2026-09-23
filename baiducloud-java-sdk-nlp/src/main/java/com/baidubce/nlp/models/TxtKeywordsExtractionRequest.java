package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtKeywordsExtractionRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 原文本内容，最大65535字符，建议在文本中同一词语的出现次数少于500次
    */
    private List<String> text;

    /**
    * 需要提取的关键词数量的最大值，取值为大于等于1的正整数，无num字段时返回全部关键词（提示：num取值较大时，返回的关键词数量可能小于num值）
    */
    private Integer num;

    public String getCharset() {
        return charset;
    }

    public TxtKeywordsExtractionRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public List<String> getText() {
        return text;
    }

    public TxtKeywordsExtractionRequest setText(List<String> text) {
        this.text = text;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public TxtKeywordsExtractionRequest setNum(Integer num) {
        this.num = num;
        return this;
    }

}
