
package com.baidubce.vpc.models;



import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpReserve  {
    /**
     * 预留网段的ID
     */
    private String ipReserveId;

    /**
     * 预留网段所在的子网ID
     */
    private String subnetId;

    /**
     * 预留网段的IP或CIDR
     */
    private String ipCidr;

    /**
     * 预留网段的IP版本
     */
    private String ipVersion;

    /**
     * 预留网段的描述
     */
    private String description;

    /**
     * 预留网段实例创建时间
     */
    private String createdTime;

    /**
     * 预留网段实例更新时间
     */
    private String updatedTime;

    public IpReserve setIpReserveId(String ipReserveId) {
        this.ipReserveId = ipReserveId;
        return this;
    }

    public String getIpReserveId() {
        return this.ipReserveId;
    }

    public IpReserve setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public IpReserve setIpCidr(String ipCidr) {
        this.ipCidr = ipCidr;
        return this;
    }

    public String getIpCidr() {
        return this.ipCidr;
    }

    public IpReserve setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    public String getIpVersion() {
        return this.ipVersion;
    }

    public IpReserve setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public IpReserve setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public IpReserve setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    @Override
    public String toString() {
        return "IpReserve{"
                + "ipReserveId=" + ipReserveId + "\n"
                + "subnetId=" + subnetId + "\n"
                + "ipCidr=" + ipCidr + "\n"
                + "ipVersion=" + ipVersion + "\n"
                + "description=" + description + "\n"
                + "createdTime=" + createdTime + "\n"
                + "updatedTime=" + updatedTime + "\n"
                + "}";
    }




}