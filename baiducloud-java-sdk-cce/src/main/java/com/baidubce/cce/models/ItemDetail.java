package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDetail {
    /**
     * 巡检项 ID
     */
    private Integer itemID;

    /**
     * 巡检项描述
     */
    private String description;

    /**
     * 巡检项开关，true 表示开启，false 表示关闭
     */
    private Boolean status;

    /**
     * 巡检项中文名
     */
    private String itemNameZH;

    public ItemDetail setItemID(Integer itemID) {
        this.itemID = itemID;
        return this;
    }

    public Integer getItemID() {
        return this.itemID;
    }

    public ItemDetail setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ItemDetail setStatus(Boolean status) {
        this.status = status;
        return this;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public ItemDetail setItemNameZH(String itemNameZH) {
        this.itemNameZH = itemNameZH;
        return this;
    }

    public String getItemNameZH() {
        return this.itemNameZH;
    }

    @Override
    public String toString() {
        return "ItemDetail{" + "itemID=" + itemID + "\n" + "description=" + description + "\n" + "status=" + status + "\n" + "itemNameZH=" + itemNameZH + "\n" + "}";
    }

}