package com.baidubce.nlp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TxtMonetResult {
    /**
     * 每个query的返回结果集合
     */
    private List<TxtMonetItem> items;

    public TxtMonetResult setItems(List<TxtMonetItem> items) {
        this.items = items;
        return this;
    }

    public List<TxtMonetItem> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "TxtMonetResult{" + "items=" + items + "\n" + "}";
    }

}