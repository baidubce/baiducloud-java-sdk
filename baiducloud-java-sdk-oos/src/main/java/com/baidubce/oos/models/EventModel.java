package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventModel {
    /**
     * 事件属性键值对
     */
    private Object properties;

    public EventModel setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    public Object getProperties() {
        return this.properties;
    }

    @Override
    public String toString() {
        return "EventModel{" + "properties=" + properties + "\n" + "}";
    }

}