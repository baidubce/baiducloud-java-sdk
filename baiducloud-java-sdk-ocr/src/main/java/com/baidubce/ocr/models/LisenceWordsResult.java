package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LisenceWordsResult {
    /**
     * 车牌颜色
     */
    private String color;

    /**
     * 车牌号码
     */
    private String number;

    /**
     * 7个数字分别为车牌中每个字符的置信度（从左往右），区间为0-1
     */
    private List<Float> probability;

    /**
     * 返回文字外接多边形顶点位置
     */
    @JsonProperty("vertexes_location")
    private List<VertexLocation> vertexesLocation;

    /**
     * 判断车牌有没有被遮挡，当detect_complete=true时生效
     */
    @JsonProperty("cover_info")
    private String coverInfo;

    /**
     * 判断车牌有没有被遮挡，当detect_risk=true时生效；如果检测车牌被编辑过，该字段指定编辑软件名称
     */
    @JsonProperty("edit_tool")
    private String editTool;

    public LisenceWordsResult setColor(String color) {
        this.color = color;
        return this;
    }

    public String getColor() {
        return this.color;
    }

    public LisenceWordsResult setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getNumber() {
        return this.number;
    }

    public LisenceWordsResult setProbability(List<Float> probability) {
        this.probability = probability;
        return this;
    }

    public List<Float> getProbability() {
        return this.probability;
    }

    public LisenceWordsResult setVertexesLocation(List<VertexLocation> vertexesLocation) {
        this.vertexesLocation = vertexesLocation;
        return this;
    }

    public List<VertexLocation> getVertexesLocation() {
        return this.vertexesLocation;
    }

    public LisenceWordsResult setCoverInfo(String coverInfo) {
        this.coverInfo = coverInfo;
        return this;
    }

    public String getCoverInfo() {
        return this.coverInfo;
    }

    public LisenceWordsResult setEditTool(String editTool) {
        this.editTool = editTool;
        return this;
    }

    public String getEditTool() {
        return this.editTool;
    }

    @Override
    public String toString() {
        return "LisenceWordsResult{" + "color=" + color + "\n" + "number=" + number + "\n" + "probability=" + probability + "\n" + "vertexesLocation=" + vertexesLocation + "\n"
                + "coverInfo=" + coverInfo + "\n" + "editTool=" + editTool + "\n" + "}";
    }

}