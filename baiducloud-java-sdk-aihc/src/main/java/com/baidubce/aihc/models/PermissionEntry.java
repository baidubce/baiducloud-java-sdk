package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermissionEntry {
    /**
     * 是
     */
    private String id;

    /**
     * 是
     */
    private String name;

    /**
     * 是
     */
    private String permission;

    public PermissionEntry setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PermissionEntry setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public PermissionEntry setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public String getPermission() {
        return this.permission;
    }

    @Override
    public String toString() {
        return "PermissionEntry{" + "id=" + id + "\n" + "name=" + name + "\n" + "permission=" + permission + "\n" + "}";
    }

}