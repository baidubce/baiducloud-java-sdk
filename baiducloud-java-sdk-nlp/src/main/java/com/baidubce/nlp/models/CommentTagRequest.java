package com.baidubce.nlp.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentTagRequest extends BaseBceRequest {

    /**
    * charset
    */
    @JsonIgnore
    private String charset;

    /**
    * 评论内容，最大10240字节
    */
    private String text;

    /**
    * 评论行业类型，默认为4（餐饮美食）。type包含13个类别：1 酒店，2 KTV，3 丽人，4 美食餐饮，5 旅游，6 健康，7 教育，8 商业，9 房产，10 汽车，11 生活，12 购物，13 3C
    */
    private Integer type;

    public String getCharset() {
        return charset;
    }

    public CommentTagRequest setCharset(String charset) {
        this.charset = charset;
        return this;
    }

    public String getText() {
        return text;
    }

    public CommentTagRequest setText(String text) {
        this.text = text;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CommentTagRequest setType(Integer type) {
        this.type = type;
        return this;
    }

}
