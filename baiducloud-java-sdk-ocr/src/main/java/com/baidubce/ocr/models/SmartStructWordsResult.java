package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructWordsResult {
    /**
     * structInfo
     */
    @JsonProperty("struct_info")
    private SmartStructStructInfo structInfo;

    /**
     * relations
     */
    private SmartStructRelations relations;

    /**
     * 文字行的识别结果、类别、置信度、位置信息等，当 return_relation=true 时返回
     */
    @JsonProperty("line_info")
    private List<SmartStructLineInfo> lineInfo;

    public SmartStructWordsResult setStructInfo(SmartStructStructInfo structInfo) {
        this.structInfo = structInfo;
        return this;
    }

    public SmartStructStructInfo getStructInfo() {
        return this.structInfo;
    }

    public SmartStructWordsResult setRelations(SmartStructRelations relations) {
        this.relations = relations;
        return this;
    }

    public SmartStructRelations getRelations() {
        return this.relations;
    }

    public SmartStructWordsResult setLineInfo(List<SmartStructLineInfo> lineInfo) {
        this.lineInfo = lineInfo;
        return this;
    }

    public List<SmartStructLineInfo> getLineInfo() {
        return this.lineInfo;
    }

    @Override
    public String toString() {
        return "SmartStructWordsResult{" + "structInfo=" + structInfo + "\n" + "relations=" + relations + "\n" + "lineInfo=" + lineInfo + "\n" + "}";
    }

}