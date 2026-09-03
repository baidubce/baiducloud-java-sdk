package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllHumanOptions {
    /**
     * 增高
     */
    @JsonProperty("body_heighten")
    private Double bodyHeighten;

    /**
     * 非纯色背景去瑕疵
     */
    @JsonProperty("remove_bg_flaw")
    private Double removeBgFlaw;

    /**
     * 长腿
     */
    @JsonProperty("leg_long")
    private Double legLong;

    /**
     * 多人肤色统一
     */
    @JsonProperty("all_skin_color_same")
    private Double allSkinColorSame;

    /**
     * 纯色背景去瑕疵
     */
    @JsonProperty("remove_pure_bg_flaw")
    private Double removePureBgFlaw;

    public AllHumanOptions setBodyHeighten(Double bodyHeighten) {
        this.bodyHeighten = bodyHeighten;
        return this;
    }

    public Double getBodyHeighten() {
        return this.bodyHeighten;
    }

    public AllHumanOptions setRemoveBgFlaw(Double removeBgFlaw) {
        this.removeBgFlaw = removeBgFlaw;
        return this;
    }

    public Double getRemoveBgFlaw() {
        return this.removeBgFlaw;
    }

    public AllHumanOptions setLegLong(Double legLong) {
        this.legLong = legLong;
        return this;
    }

    public Double getLegLong() {
        return this.legLong;
    }

    public AllHumanOptions setAllSkinColorSame(Double allSkinColorSame) {
        this.allSkinColorSame = allSkinColorSame;
        return this;
    }

    public Double getAllSkinColorSame() {
        return this.allSkinColorSame;
    }

    public AllHumanOptions setRemovePureBgFlaw(Double removePureBgFlaw) {
        this.removePureBgFlaw = removePureBgFlaw;
        return this;
    }

    public Double getRemovePureBgFlaw() {
        return this.removePureBgFlaw;
    }

    @Override
    public String toString() {
        return "AllHumanOptions{" + "bodyHeighten=" + bodyHeighten + "\n" + "removeBgFlaw=" + removeBgFlaw + "\n" + "legLong=" + legLong + "\n" + "allSkinColorSame="
                + allSkinColorSame + "\n" + "removePureBgFlaw=" + removePureBgFlaw + "\n" + "}";
    }

}