package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Slot {
    /**
     * 作答区ID
     */
    private String slotId;

    /**
     * 作答区序号，1：作答区1；2：作答区2；依此类推
     */
    private Integer seqence;

    /**
     * handwritingArea
     */
    private Area handwritingArea;

    /**
     * 作答区批改结果，0：未批，1：正确，2：错误，3：未作答
     */
    private Integer correctResult;

    /**
     * 批改原因 / 错因描述，空表示无额外说明（当前口算题无错因分析内容）
     */
    private String reason;

    public Slot setSlotId(String slotId) {
        this.slotId = slotId;
        return this;
    }

    public String getSlotId() {
        return this.slotId;
    }

    public Slot setSeqence(Integer seqence) {
        this.seqence = seqence;
        return this;
    }

    public Integer getSeqence() {
        return this.seqence;
    }

    public Slot setHandwritingArea(Area handwritingArea) {
        this.handwritingArea = handwritingArea;
        return this;
    }

    public Area getHandwritingArea() {
        return this.handwritingArea;
    }

    public Slot setCorrectResult(Integer correctResult) {
        this.correctResult = correctResult;
        return this;
    }

    public Integer getCorrectResult() {
        return this.correctResult;
    }

    public Slot setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    @Override
    public String toString() {
        return "Slot{" + "slotId=" + slotId + "\n" + "seqence=" + seqence + "\n" + "handwritingArea=" + handwritingArea + "\n" + "correctResult=" + correctResult + "\n"
                + "reason=" + reason + "\n" + "}";
    }

}