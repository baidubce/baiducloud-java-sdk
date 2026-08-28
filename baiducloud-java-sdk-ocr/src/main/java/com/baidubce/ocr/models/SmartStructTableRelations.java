package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructTableRelations {
    /**
     * 表格区的 k-k 结构关系，即多级表头的结构关系，可支持一对一、一对多的关系
     */
    @JsonProperty("kk_relations")
    private List<SmartStructKVRelation> kkRelations;

    /**
     * 表格区的k-v结构关系，可支持一对一、一对多的关系
     */
    @JsonProperty("kv_relations")
    private List<SmartStructKVRelation> kvRelations;

    /**
     * 表格区的v-v结构关系，可支持一对一、一对多的关系
     */
    @JsonProperty("vv_relations")
    private List<SmartStructKVRelation> vvRelations;

    public SmartStructTableRelations setKkRelations(List<SmartStructKVRelation> kkRelations) {
        this.kkRelations = kkRelations;
        return this;
    }

    public List<SmartStructKVRelation> getKkRelations() {
        return this.kkRelations;
    }

    public SmartStructTableRelations setKvRelations(List<SmartStructKVRelation> kvRelations) {
        this.kvRelations = kvRelations;
        return this;
    }

    public List<SmartStructKVRelation> getKvRelations() {
        return this.kvRelations;
    }

    public SmartStructTableRelations setVvRelations(List<SmartStructKVRelation> vvRelations) {
        this.vvRelations = vvRelations;
        return this;
    }

    public List<SmartStructKVRelation> getVvRelations() {
        return this.vvRelations;
    }

    @Override
    public String toString() {
        return "SmartStructTableRelations{" + "kkRelations=" + kkRelations + "\n" + "kvRelations=" + kvRelations + "\n" + "vvRelations=" + vvRelations + "\n" + "}";
    }

}