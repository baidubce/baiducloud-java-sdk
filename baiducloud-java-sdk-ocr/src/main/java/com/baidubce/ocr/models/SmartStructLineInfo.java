package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructLineInfo {
    /**
     * 文字行的 id，唯一标识，按从上到下从左到右顺序，依次顺位排列
     */
    @JsonProperty("object_id")
    private Integer objectId;

    /**
     * 换行文字的 id，另一唯一标识，属于同一个词义的 n 个文字行的 block_id一致，按从上到下从左到右顺序，依次顺位排列。非换行的 block 元素固定返回 -1
     */
    @JsonProperty("block_id")
    private Integer blockId;

    /**
     * 文字行的文字结果
     */
    private String word;

    /**
     * 文字行的类别，key 表示非表格区的 key 值，value 表示非表格区的 value 值，table_value 表格区的 value 值，other 表示无结构化关系的文本行
     */
    @JsonProperty("line_class")
    private String lineClass;

    /**
     * line_class 的分类置信度
     */
    @JsonProperty("line_class_probability")
    private Double lineClassProbability;

    /**
     * 文字行的文字结果识别置信度
     */
    @JsonProperty("line__probability")
    private Double lineProbability;

    /**
     * 文字行左上角水平坐标
     */
    private Double left;

    /**
     * 文字行左上角垂直坐标
     */
    private Double top;

    /**
     * 文字行宽度
     */
    private Double width;

    /**
     * 文字行高度
     */
    private Double height;

    /**
     * lineLocation
     */
    @JsonProperty("line_location")
    private SmartStructLocation lineLocation;

    public SmartStructLineInfo setObjectId(Integer objectId) {
        this.objectId = objectId;
        return this;
    }

    public Integer getObjectId() {
        return this.objectId;
    }

    public SmartStructLineInfo setBlockId(Integer blockId) {
        this.blockId = blockId;
        return this;
    }

    public Integer getBlockId() {
        return this.blockId;
    }

    public SmartStructLineInfo setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public SmartStructLineInfo setLineClass(String lineClass) {
        this.lineClass = lineClass;
        return this;
    }

    public String getLineClass() {
        return this.lineClass;
    }

    public SmartStructLineInfo setLineClassProbability(Double lineClassProbability) {
        this.lineClassProbability = lineClassProbability;
        return this;
    }

    public Double getLineClassProbability() {
        return this.lineClassProbability;
    }

    public SmartStructLineInfo setLineProbability(Double lineProbability) {
        this.lineProbability = lineProbability;
        return this;
    }

    public Double getLineProbability() {
        return this.lineProbability;
    }

    public SmartStructLineInfo setLeft(Double left) {
        this.left = left;
        return this;
    }

    public Double getLeft() {
        return this.left;
    }

    public SmartStructLineInfo setTop(Double top) {
        this.top = top;
        return this;
    }

    public Double getTop() {
        return this.top;
    }

    public SmartStructLineInfo setWidth(Double width) {
        this.width = width;
        return this;
    }

    public Double getWidth() {
        return this.width;
    }

    public SmartStructLineInfo setHeight(Double height) {
        this.height = height;
        return this;
    }

    public Double getHeight() {
        return this.height;
    }

    public SmartStructLineInfo setLineLocation(SmartStructLocation lineLocation) {
        this.lineLocation = lineLocation;
        return this;
    }

    public SmartStructLocation getLineLocation() {
        return this.lineLocation;
    }

    @Override
    public String toString() {
        return "SmartStructLineInfo{" + "objectId=" + objectId + "\n" + "blockId=" + blockId + "\n" + "word=" + word + "\n" + "lineClass=" + lineClass + "\n"
                + "lineClassProbability=" + lineClassProbability + "\n" + "lineProbability=" + lineProbability + "\n" + "left=" + left + "\n" + "top=" + top + "\n" + "width="
                + width + "\n" + "height=" + height + "\n" + "lineLocation=" + lineLocation + "\n" + "}";
    }

}