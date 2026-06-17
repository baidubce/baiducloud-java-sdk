package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Notice {
    /**
     * 报警模板id
     */
    private String id;

    /**
     * 报警模板名称
     */
    private String name;

    /**
     * 报警模板用户列表
     */
    private List<String> members;

    /**
     * 报警模板通知方式，取值：EMAIL: 邮件，SMS: 短信， PHONE: 电话
     */
    private List<String> methods;

    /**
     * 报警模板回调地址
     */
    private List<String> callbacks;

    /**
     * 屏蔽时间
     */
    private List<DisableTime> disableTimes;

    public Notice setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Notice setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Notice setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    public List<String> getMembers() {
        return this.members;
    }

    public Notice setMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    public List<String> getMethods() {
        return this.methods;
    }

    public Notice setCallbacks(List<String> callbacks) {
        this.callbacks = callbacks;
        return this;
    }

    public List<String> getCallbacks() {
        return this.callbacks;
    }

    public Notice setDisableTimes(List<DisableTime> disableTimes) {
        this.disableTimes = disableTimes;
        return this;
    }

    public List<DisableTime> getDisableTimes() {
        return this.disableTimes;
    }

    @Override
    public String toString() {
        return "Notice{" + "id=" + id + "\n" + "name=" + name + "\n" + "members=" + members + "\n" + "methods=" + methods + "\n" + "callbacks=" + callbacks + "\n"
                + "disableTimes=" + disableTimes + "\n" + "}";
    }

}