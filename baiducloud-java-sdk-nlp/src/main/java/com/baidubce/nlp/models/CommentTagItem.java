package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentTagItem {
    /**
     * 匹配上的属性词
     */
    private String prop;

    /**
     * 匹配上的描述词
     */
    private String adj;

    /**
     * 该情感搭配的极性（0表示消极，1表示中性，2表示积极）
     */
    private Integer sentiment;

    /**
     * 该情感搭配在句子中的开始位置
     */
    @JsonProperty("begin_pos")
    private Integer beginPos;

    /**
     * 该情感搭配在句子中的结束位置
     */
    @JsonProperty("end_pos")
    private Integer endPos;

    /**
     * 对应于该情感搭配的短句摘要
     */
    @JsonProperty("abstract")
    private String nlpAbstract;

    public CommentTagItem setProp(String prop) {
        this.prop = prop;
        return this;
    }

    public String getProp() {
        return this.prop;
    }

    public CommentTagItem setAdj(String adj) {
        this.adj = adj;
        return this;
    }

    public String getAdj() {
        return this.adj;
    }

    public CommentTagItem setSentiment(Integer sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    public Integer getSentiment() {
        return this.sentiment;
    }

    public CommentTagItem setBeginPos(Integer beginPos) {
        this.beginPos = beginPos;
        return this;
    }

    public Integer getBeginPos() {
        return this.beginPos;
    }

    public CommentTagItem setEndPos(Integer endPos) {
        this.endPos = endPos;
        return this;
    }

    public Integer getEndPos() {
        return this.endPos;
    }

    public CommentTagItem setAbstract(String nlpAbstract) {
        this.nlpAbstract = nlpAbstract;
        return this;
    }

    public String getAbstract() {
        return this.nlpAbstract;
    }

    @Override
    public String toString() {
        return "CommentTagItem{" + "prop=" + prop + "\n" + "adj=" + adj + "\n" + "sentiment=" + sentiment + "\n" + "beginPos=" + beginPos + "\n" + "endPos=" + endPos + "\n"
                + "nlpAbstract=" + nlpAbstract + "\n" + "}";
    }

}