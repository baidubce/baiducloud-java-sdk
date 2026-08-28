package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduVlmLocation {
    /**
     * 单道题位置信息，按照[x,y,w,h]方式返回，其中x,y为左上顶点坐标
     */
    @JsonProperty("qus_location")
    private List<Double> qusLocation;

    /**
     * 图片的位置信息，按照[x,y,w,h]方式返回，其中x,y为左上顶点坐标
     */
    @JsonProperty("pic_location")
    private List<Double> picLocation;

    /**
     * 单道题内的手写内容位置信息，当only_split=false时不返回
     */
    @JsonProperty("ans_location")
    private List<Double> ansLocation;

    public PaperCutEduVlmLocation setQusLocation(List<Double> qusLocation) {
        this.qusLocation = qusLocation;
        return this;
    }

    public List<Double> getQusLocation() {
        return this.qusLocation;
    }

    public PaperCutEduVlmLocation setPicLocation(List<Double> picLocation) {
        this.picLocation = picLocation;
        return this;
    }

    public List<Double> getPicLocation() {
        return this.picLocation;
    }

    public PaperCutEduVlmLocation setAnsLocation(List<Double> ansLocation) {
        this.ansLocation = ansLocation;
        return this;
    }

    public List<Double> getAnsLocation() {
        return this.ansLocation;
    }

    @Override
    public String toString() {
        return "PaperCutEduVlmLocation{" + "qusLocation=" + qusLocation + "\n" + "picLocation=" + picLocation + "\n" + "ansLocation=" + ansLocation + "\n" + "}";
    }

}