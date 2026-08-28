package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartStructRelations {
    /**
     * 非表格区的 k-v 结构化关系，可支持一对一、一对多的关系
     */
    @JsonProperty("kv_relations")
    private List<SmartStructKVRelation> kvRelations;

    /**
     * tableRelations
     */
    @JsonProperty("table_relations")
    private SmartStructTableRelations tableRelations;

    public SmartStructRelations setKvRelations(List<SmartStructKVRelation> kvRelations) {
        this.kvRelations = kvRelations;
        return this;
    }

    public List<SmartStructKVRelation> getKvRelations() {
        return this.kvRelations;
    }

    public SmartStructRelations setTableRelations(SmartStructTableRelations tableRelations) {
        this.tableRelations = tableRelations;
        return this;
    }

    public SmartStructTableRelations getTableRelations() {
        return this.tableRelations;
    }

    @Override
    public String toString() {
        return "SmartStructRelations{" + "kvRelations=" + kvRelations + "\n" + "tableRelations=" + tableRelations + "\n" + "}";
    }

}