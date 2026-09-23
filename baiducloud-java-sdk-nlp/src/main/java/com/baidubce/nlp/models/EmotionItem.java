package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmotionItem {
    /**
     * 情绪一级分类标签；pessimistic（负向情绪）、neutral（中性情绪）、optimistic（正向情绪）
     */
    private String label;

    /**
     * 情绪一级分类标签对应的概率
     */
    private Double prob;

    /**
     * 二级分析结果数组
     */
    private List<EmotionSubitem> subitems;

    /**
     * 参考回复话术，中性情绪下该项为空
     */
    private List<String> replies;

    public EmotionItem setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getLabel() {
        return this.label;
    }

    public EmotionItem setProb(Double prob) {
        this.prob = prob;
        return this;
    }

    public Double getProb() {
        return this.prob;
    }

    public EmotionItem setSubitems(List<EmotionSubitem> subitems) {
        this.subitems = subitems;
        return this;
    }

    public List<EmotionSubitem> getSubitems() {
        return this.subitems;
    }

    public EmotionItem setReplies(List<String> replies) {
        this.replies = replies;
        return this;
    }

    public List<String> getReplies() {
        return this.replies;
    }

    @Override
    public String toString() {
        return "EmotionItem{" + "label=" + label + "\n" + "prob=" + prob + "\n" + "subitems=" + subitems + "\n" + "replies=" + replies + "\n" + "}";
    }

}