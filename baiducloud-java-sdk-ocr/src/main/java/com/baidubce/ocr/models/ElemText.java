package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ElemText {
    /**
     * 题干文本信息
     */
    @JsonProperty("stem_text")
    private String stemText;

    /**
     * 子题文本信息
     */
    @JsonProperty("subqus_text")
    private String subqusText;

    /**
     * 答案文本信息
     */
    @JsonProperty("answer_text")
    private String answerText;

    /**
     * 选项文本信息，仅在题目类型为选择题时输出
     */
    @JsonProperty("option_text")
    private String optionText;

    /**
     * 参考答案文本信息
     */
    @JsonProperty("interpretation_text")
    private String interpretationText;

    public ElemText setStemText(String stemText) {
        this.stemText = stemText;
        return this;
    }

    public String getStemText() {
        return this.stemText;
    }

    public ElemText setSubqusText(String subqusText) {
        this.subqusText = subqusText;
        return this;
    }

    public String getSubqusText() {
        return this.subqusText;
    }

    public ElemText setAnswerText(String answerText) {
        this.answerText = answerText;
        return this;
    }

    public String getAnswerText() {
        return this.answerText;
    }

    public ElemText setOptionText(String optionText) {
        this.optionText = optionText;
        return this;
    }

    public String getOptionText() {
        return this.optionText;
    }

    public ElemText setInterpretationText(String interpretationText) {
        this.interpretationText = interpretationText;
        return this;
    }

    public String getInterpretationText() {
        return this.interpretationText;
    }

    @Override
    public String toString() {
        return "ElemText{" + "stemText=" + stemText + "\n" + "subqusText=" + subqusText + "\n" + "answerText=" + answerText + "\n" + "optionText=" + optionText + "\n"
                + "interpretationText=" + interpretationText + "\n" + "}";
    }

}