package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {
    /**
     * 事件名称
     */
    private String name;

    /**
     * 事件描述
     */
    private String description;

    /**
     * 事件来源服务
     */
    private String service;

    /**
     * 事件所属地域
     */
    private String region;

    /**
     * resource
     */
    private Resource resource;

    public Event setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Event setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Event setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    public Event setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public Event setResource(Resource resource) {
        this.resource = resource;
        return this;
    }

    public Resource getResource() {
        return this.resource;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + "\n" + "description=" + description + "\n" + "service=" + service + "\n" + "region=" + region + "\n" + "resource=" + resource + "\n"
                + "}";
    }

}