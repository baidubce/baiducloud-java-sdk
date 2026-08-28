package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiIdcardItem {
    /**
     * cardInfo
     */
    @JsonProperty("card_info")
    private MultiIdcardCardInfo cardInfo;

    /**
     * 识别结果
     */
    @JsonProperty("card_result")
    private Object cardResult;

    public MultiIdcardItem setCardInfo(MultiIdcardCardInfo cardInfo) {
        this.cardInfo = cardInfo;
        return this;
    }

    public MultiIdcardCardInfo getCardInfo() {
        return this.cardInfo;
    }

    public MultiIdcardItem setCardResult(Object cardResult) {
        this.cardResult = cardResult;
        return this;
    }

    public Object getCardResult() {
        return this.cardResult;
    }

    @Override
    public String toString() {
        return "MultiIdcardItem{" + "cardInfo=" + cardInfo + "\n" + "cardResult=" + cardResult + "\n" + "}";
    }

}