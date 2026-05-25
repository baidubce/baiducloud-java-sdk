package com.baidubce.bcm.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpanMessage {
    /**
     * 消息角色，如 user、assistant
     */
    private String role;

    /**
     * 直接指定内容，content和contentRef只会有一个被设置，值可以是任意类型
     */
    private String content;

    /**
     * 通过引用路径指定内容
     */
    private List<String> contentRef;

    public SpanMessage setRole(String role) {
        this.role = role;
        return this;
    }

    public String getRole() {
        return this.role;
    }

    public SpanMessage setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public SpanMessage setContentRef(List<String> contentRef) {
        this.contentRef = contentRef;
        return this;
    }

    public List<String> getContentRef() {
        return this.contentRef;
    }

    @Override
    public String toString() {
        return "SpanMessage{" + "role=" + role + "\n" + "content=" + content + "\n" + "contentRef=" + contentRef + "\n" + "}";
    }

}