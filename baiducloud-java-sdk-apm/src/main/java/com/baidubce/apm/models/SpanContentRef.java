package com.baidubce.apm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpanContentRef {
    /**
     * 直接指定文本内容，content和contentRef只会有一个被设置，值可以是任意类型
     */
    private String content;

    /**
     * 通过引用路径指定文本，如["attributes", "traceloop.entity.input", "inputs"]
     */
    private List<String> contentRef;

    public SpanContentRef setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public SpanContentRef setContentRef(List<String> contentRef) {
        this.contentRef = contentRef;
        return this;
    }

    public List<String> getContentRef() {
        return this.contentRef;
    }

    @Override
    public String toString() {
        return "SpanContentRef{" + "content=" + content + "\n" + "contentRef=" + contentRef + "\n" + "}";
    }

}