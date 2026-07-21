package com.baidubce.iam.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ACL {
    /**
     * id
     */
    private String id;

    /**
     * "v2"
     */
    private String version;

    /**
     * ACL entry
     */
    private List<ACLEntry> accessControlList;

    public ACL setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ACL setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return this.version;
    }

    public ACL setAccessControlList(List<ACLEntry> accessControlList) {
        this.accessControlList = accessControlList;
        return this;
    }

    public List<ACLEntry> getAccessControlList() {
        return this.accessControlList;
    }

    @Override
    public String toString() {
        return "ACL{" + "id=" + id + "\n" + "version=" + version + "\n" + "accessControlList=" + accessControlList + "\n" + "}";
    }

}