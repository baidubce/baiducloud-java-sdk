package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resource {
    /**
     * 
     */
    private String name;

    /**
     * 资源量，可传递int或float类型，GPU资源单位为卡数，cpu 资源单位为核，内存资源单位为GB，共享内存资源单位为GB
     */
    private Integer quantity;

    public Resource setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Resource setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Resource{" + "name=" + name + "\n" + "quantity=" + quantity + "\n" + "}";
    }

}