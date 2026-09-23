package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewsSummaryRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 字符串（限200字符数）。字符串仅支持GBK编码，长度需小于200字符数（即400字节），请输入前确认字符数没有超限，若字符数超长会返回错误。标题在算法中具有重要的作用，若文章确无标题，不必输入此参数
    */
    private String title;

    /**
    * 字符串（限3000字符数以内）。字符串仅支持GBK编码，长度需小于3000字符数（即6000字节），请输入前确认字符数没有超限，若字符数超长会返回错误。正文中如果包含段落信息，请使用"\n"分隔，段落信息算法中有重要的作用，请尽量保留
    */
    private String content;

    /**
    * 此数值将作为摘要结果的最大长度。例如：原文长度1000字，本参数设置为150，则摘要结果的最大长度是150字；推荐最优区间：200-500字
    */
    @JsonProperty("max_summary_len")
    private Integer maxSummaryLen;

    public String getCharset() {
        return charset;
    }

    public NewsSummaryRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public NewsSummaryRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public NewsSummaryRequest setContent(String content) {
        this.content = content;
        return this;
    }

    public Integer getMaxSummaryLen() {
        return maxSummaryLen;
    }

    public NewsSummaryRequest setMaxSummaryLen(Integer maxSummaryLen) {
        this.maxSummaryLen = maxSummaryLen;
        return this;
    }

}
