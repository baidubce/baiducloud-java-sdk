package com.baidubce.nlp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LexerLocDetail {
    /**
     * 成分类型，如省、市、区、县
     */
    private String type;

    /**
     * 在item中的字节级offset
     */
    @JsonProperty("byte_offset")
    private Integer byteOffset;

    /**
     * 字节级length
     */
    @JsonProperty("byte_length")
    private Integer byteLength;

    public LexerLocDetail setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public LexerLocDetail setByteOffset(Integer byteOffset) {
        this.byteOffset = byteOffset;
        return this;
    }

    public Integer getByteOffset() {
        return this.byteOffset;
    }

    public LexerLocDetail setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
        return this;
    }

    public Integer getByteLength() {
        return this.byteLength;
    }

    @Override
    public String toString() {
        return "LexerLocDetail{" + "type=" + type + "\n" + "byteOffset=" + byteOffset + "\n" + "byteLength=" + byteLength + "\n" + "}";
    }

}