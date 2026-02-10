
package com.baidubce.vpc.models;



import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResourceIp  {
    /**
     * VPC内网IP
     */
    private String ip;

    /**
     * VPC内网IP所属产品
     */
    private String resourceType;

    public ResourceIp setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public ResourceIp setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    @Override
    public String toString() {
        return "ResourceIp{"
                + "ip=" + ip + "\n"
                + "resourceType=" + resourceType + "\n"
                + "}";
    }




}