package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LexerItem {
    /**
     * 词汇的字符串
     */
    private String item;

    /**
     * 命名实体类型，命名实体识别算法使用。词性标注算法中，此项为空串
     */
    private String ne;

    /**
     * 词性，词性标注算法使用。命名实体识别算法中，此项为空串
     */
    private String pos;

    /**
     * 在text中的字节级offset
     */
    @JsonProperty("byte_offset")
    private Integer byteOffset;

    /**
     * 字节级length
     */
    @JsonProperty("byte_length")
    private Integer byteLength;

    /**
     * 链指到知识库的URI，只对命名实体有效。对于非命名实体和链接不到知识库的命名实体，此项为空串
     */
    private String uri;

    /**
     * 词汇的标准化表达，主要针对时间、数字单位，没有归一化表达的，此项为空串
     */
    private String formal;

    /**
     * 基本词成分
     */
    @JsonProperty("basic_words")
    private List<String> basicWords;

    /**
     * 地址成分，非必需，仅对地址型命名实体有效，没有地址成分的，此项为空数组
     */
    @JsonProperty("loc_details")
    private List<LexerLocDetail> locDetails;

    public LexerItem setItem(String item) {
        this.item = item;
        return this;
    }

    public String getItem() {
        return this.item;
    }

    public LexerItem setNe(String ne) {
        this.ne = ne;
        return this;
    }

    public String getNe() {
        return this.ne;
    }

    public LexerItem setPos(String pos) {
        this.pos = pos;
        return this;
    }

    public String getPos() {
        return this.pos;
    }

    public LexerItem setByteOffset(Integer byteOffset) {
        this.byteOffset = byteOffset;
        return this;
    }

    public Integer getByteOffset() {
        return this.byteOffset;
    }

    public LexerItem setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
        return this;
    }

    public Integer getByteLength() {
        return this.byteLength;
    }

    public LexerItem setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public String getUri() {
        return this.uri;
    }

    public LexerItem setFormal(String formal) {
        this.formal = formal;
        return this;
    }

    public String getFormal() {
        return this.formal;
    }

    public LexerItem setBasicWords(List<String> basicWords) {
        this.basicWords = basicWords;
        return this;
    }

    public List<String> getBasicWords() {
        return this.basicWords;
    }

    public LexerItem setLocDetails(List<LexerLocDetail> locDetails) {
        this.locDetails = locDetails;
        return this;
    }

    public List<LexerLocDetail> getLocDetails() {
        return this.locDetails;
    }

    @Override
    public String toString() {
        return "LexerItem{" + "item=" + item + "\n" + "ne=" + ne + "\n" + "pos=" + pos + "\n" + "byteOffset=" + byteOffset + "\n" + "byteLength=" + byteLength + "\n" + "uri="
                + uri + "\n" + "formal=" + formal + "\n" + "basicWords=" + basicWords + "\n" + "locDetails=" + locDetails + "\n" + "}";
    }

}