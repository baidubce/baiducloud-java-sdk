
package com.baidubce.vpc.models;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vpc  {
    /**
     * VPC的ID
     */
    private String vpcId;

    /**
     * 名称
     */
    private String name;

    /**
     * 网段及子网掩码
     */
    private String cidr;

    /**
     * VPC的IPv6网段
     */
    private String ipv6Cidr;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否为默认VPC，true:是，false:否
     */
    private Boolean isDefault;

    /**
     * 是否开启VPC中继，true:是，false:否
     */
    private Boolean relay;

    /**
     * VPC的辅助网段CIDR列表
     */
    private List<String> secondaryCidr;

    /**
     * VPC绑定的标签集合
     */
    private List<TagModel> tags;

    public Vpc setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public Vpc setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Vpc setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public Vpc setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
        return this;
    }

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    public Vpc setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Vpc setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Vpc setRelay(Boolean relay) {
        this.relay = relay;
        return this;
    }

    public Boolean getRelay() {
        return this.relay;
    }

    public Vpc setSecondaryCidr(List<String> secondaryCidr) {
        this.secondaryCidr = secondaryCidr;
        return this;
    }

    public List<String> getSecondaryCidr() {
        return this.secondaryCidr;
    }

    public Vpc setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<TagModel> getTags() {
        return this.tags;
    }

    @Override
    public String toString() {
        return "Vpc{"
                + "vpcId=" + vpcId + "\n"
                + "name=" + name + "\n"
                + "cidr=" + cidr + "\n"
                + "ipv6Cidr=" + ipv6Cidr + "\n"
                + "description=" + description + "\n"
                + "isDefault=" + isDefault + "\n"
                + "relay=" + relay + "\n"
                + "secondaryCidr=" + secondaryCidr + "\n"
                + "tags=" + tags + "\n"
                + "}";
    }




}