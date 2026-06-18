package com.baidubce.iam.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTheSubjectsGrantedPermissionsResponse extends BaseBceResponse {

    /**
    * 策略被授予主体对象的列表
    */
    private List<AttachedEntities> entities;

    /**
    * 主体 id
    */
    private String id;

    /**
    * 主体名称
    */
    private String name;

    /**
    * UserPolicy或 GroupPolicy
    */
    private String type;

    /**
    * 策略被授予时间
    */
    private String attachTime;

    public List<AttachedEntities> getEntities() {
        return entities;
    }

    public ListTheSubjectsGrantedPermissionsResponse setEntities(List<AttachedEntities> entities) {
        this.entities = entities;
        return this;
    }

    public String getId() {
        return id;
    }

    public ListTheSubjectsGrantedPermissionsResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ListTheSubjectsGrantedPermissionsResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public ListTheSubjectsGrantedPermissionsResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getAttachTime() {
        return attachTime;
    }

    public ListTheSubjectsGrantedPermissionsResponse setAttachTime(String attachTime) {
        this.attachTime = attachTime;
        return this;
    }

    @Override
    public String toString() {
        return "ListTheSubjectsGrantedPermissionsResponse{" + "entities=" + entities + "\n" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "attachTime="
                + attachTime + "\n" + "}";
    }

}
