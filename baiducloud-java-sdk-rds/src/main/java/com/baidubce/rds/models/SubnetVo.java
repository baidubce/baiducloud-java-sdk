package com.baidubce.rds.models;

import java.lang.String;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubnetVo {
    /**
     * vpcID
     */
    private String vpcId;

    /**
     * 子网短ID
     */
    private String shortId;

    /**
     * 子网名称
     */
    private String name;

    /**
     * IPV4地址及子网掩码 例如：192.168.0.0/20
     */
    private String cidr;

    /**
     * 子网状态， 0表示可用、1表示创建中、大于等于2时表示不可用
     */
    private Integer status;

    /**
     * 创建时间。格式：yyyy-MM-dd'T'HH:mm:ss'Z'
     */
    private String createTime;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否默认子网。 true：有、false：没有；默认false
     */
    private Boolean defaultVpc;

    /**
     * IPV6地址及子网掩码 例如：240c:4081:8005:2e03::/64
     */
    private String ipv6Cidr;

    /**
     * Ipv4地址（vpc辅网络）
     */
    private List<String> auxiliaryCidr;

    /**
     * 是否开启replay。true：开启、false：未开启；默认false
     */
    private Boolean relay;

    /**
     * 子网ID
     */
    private String subnetId;

    /**
     * zone+子网序列 ,例如:zoneA
     */
    private String az;

    /**
     * vpc短ID
     */
    private String vpcShortId;

    /**
     * 子网序列ID
     */
    private String subnetUuid;

    /**
     * 账户ID
     */
    private String accountId;

    /**
     * 设备类型 BCC(1), BBC（2）, BCC\_NAT（3）,BBC\_NAT（4）
     */
    private Integer subnetType;

    /**
     * 网络类型 未分配（-1） VPC(0),SUBNET(1),ROUTE\_TABLE(2), ROUTE\_RULE(3), ACL\_RULE(4), ENI(5);
     */
    private Integer type;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 更新时间
     */
    private String updatedTime;

    /**
     * 使用连接数
     */
    private Integer usedIps;

    /**
     * 总数连接数
     */
    private Integer totalIps;

    /**
     * 分组标签
     */
    private List<Tag> tags;

    /**
     * 区域名称
     */
    private String zoneName;

    /**
     * IPV6 json字符串
     */
    @JsonProperty("enable_ipv6")
    private String enableIpv6;

    public SubnetVo setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public String getVpcId() {
        return this.vpcId;
    }

    public SubnetVo setShortId(String shortId) {
        this.shortId = shortId;
        return this;
    }

    public String getShortId() {
        return this.shortId;
    }

    public SubnetVo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public SubnetVo setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    public String getCidr() {
        return this.cidr;
    }

    public SubnetVo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public SubnetVo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public SubnetVo setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public SubnetVo setDefaultVpc(Boolean defaultVpc) {
        this.defaultVpc = defaultVpc;
        return this;
    }

    public Boolean getDefaultVpc() {
        return this.defaultVpc;
    }

    public SubnetVo setIpv6Cidr(String ipv6Cidr) {
        this.ipv6Cidr = ipv6Cidr;
        return this;
    }

    public String getIpv6Cidr() {
        return this.ipv6Cidr;
    }

    public SubnetVo setAuxiliaryCidr(List<String> auxiliaryCidr) {
        this.auxiliaryCidr = auxiliaryCidr;
        return this;
    }

    public List<String> getAuxiliaryCidr() {
        return this.auxiliaryCidr;
    }

    public SubnetVo setRelay(Boolean relay) {
        this.relay = relay;
        return this;
    }

    public Boolean getRelay() {
        return this.relay;
    }

    public SubnetVo setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getSubnetId() {
        return this.subnetId;
    }

    public SubnetVo setAz(String az) {
        this.az = az;
        return this;
    }

    public String getAz() {
        return this.az;
    }

    public SubnetVo setVpcShortId(String vpcShortId) {
        this.vpcShortId = vpcShortId;
        return this;
    }

    public String getVpcShortId() {
        return this.vpcShortId;
    }

    public SubnetVo setSubnetUuid(String subnetUuid) {
        this.subnetUuid = subnetUuid;
        return this;
    }

    public String getSubnetUuid() {
        return this.subnetUuid;
    }

    public SubnetVo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public SubnetVo setSubnetType(Integer subnetType) {
        this.subnetType = subnetType;
        return this;
    }

    public Integer getSubnetType() {
        return this.subnetType;
    }

    public SubnetVo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public SubnetVo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public SubnetVo setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public SubnetVo setUsedIps(Integer usedIps) {
        this.usedIps = usedIps;
        return this;
    }

    public Integer getUsedIps() {
        return this.usedIps;
    }

    public SubnetVo setTotalIps(Integer totalIps) {
        this.totalIps = totalIps;
        return this;
    }

    public Integer getTotalIps() {
        return this.totalIps;
    }

    public SubnetVo setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public SubnetVo setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getZoneName() {
        return this.zoneName;
    }

    public SubnetVo setEnableIpv6(String enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    public String getEnableIpv6() {
        return this.enableIpv6;
    }

    @Override
    public String toString() {
        return "SubnetVo{" + "vpcId=" + vpcId + "\n" + "shortId=" + shortId + "\n" + "name=" + name + "\n" + "cidr=" + cidr + "\n" + "status=" + status + "\n" + "createTime="
                + createTime + "\n" + "description=" + description + "\n" + "defaultVpc=" + defaultVpc + "\n" + "ipv6Cidr=" + ipv6Cidr + "\n" + "auxiliaryCidr=" + auxiliaryCidr
                + "\n" + "relay=" + relay + "\n" + "subnetId=" + subnetId + "\n" + "az=" + az + "\n" + "vpcShortId=" + vpcShortId + "\n" + "subnetUuid=" + subnetUuid + "\n"
                + "accountId=" + accountId + "\n" + "subnetType=" + subnetType + "\n" + "type=" + type + "\n" + "createdTime=" + createdTime + "\n" + "updatedTime=" + updatedTime
                + "\n" + "usedIps=" + usedIps + "\n" + "totalIps=" + totalIps + "\n" + "tags=" + tags + "\n" + "zoneName=" + zoneName + "\n" + "enableIpv6=" + enableIpv6 + "\n"
                + "}";
    }

}