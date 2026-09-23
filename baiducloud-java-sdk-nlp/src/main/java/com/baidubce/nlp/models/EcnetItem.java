package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EcnetItem {
    /**
     * 纠错后的文本
     */
    @JsonProperty("correct_query")
    private String correctQuery;

    /**
     * 模型置信度打分。若score返回为数字7，表示输入不合法，比如输入过长或过短，该情况没有纠错结果
     */
    private Double score;

    /**
     * 替换候选片段信息
     */
    @JsonProperty("vec_fragment")
    private List<VecFragment> vecFragment;

    public EcnetItem setCorrectQuery(String correctQuery) {
        this.correctQuery = correctQuery;
        return this;
    }

    public String getCorrectQuery() {
        return this.correctQuery;
    }

    public EcnetItem setScore(Double score) {
        this.score = score;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    public EcnetItem setVecFragment(List<VecFragment> vecFragment) {
        this.vecFragment = vecFragment;
        return this;
    }

    public List<VecFragment> getVecFragment() {
        return this.vecFragment;
    }

    @Override
    public String toString() {
        return "EcnetItem{" + "correctQuery=" + correctQuery + "\n" + "score=" + score + "\n" + "vecFragment=" + vecFragment + "\n" + "}";
    }

}