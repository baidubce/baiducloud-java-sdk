package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePermissionGroupRulesRequest extends BaseBceRequest {

    /**
    * agName
    */
    @JsonIgnore
    private String agName;

    /**
    * 授权ip地址，虚拟VPC IP，允许单IP或结合mask参数设置网段，支持IPV4和IPV6，如10.10.1.123或2001::/16
    */
    private String ip;

    /**
    * 结合ip参数实现指定网段，如果单IP则设置为32（IPV4）或128（IPV6）
    */
    private Integer mask;

    /**
    * 读写规则，支持"read_only"表示只读, "read_write"表示读写
    */
    private String writeAccess;

    /**
    * 用户权限规则，支持"no_squash"表示不限制root用户, "root_squash"表示限制root用户, "all_squash"表示限制所有用户
    */
    private String userAccess;

    /**
    * 规则优先级，优先级可选范围为1-100，1为最高优先级
    */
    private Integer priority;

    public String getAgName() {
        return agName;
    }

    public CreatePermissionGroupRulesRequest setAgName(String agName) {
        this.agName = agName;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public CreatePermissionGroupRulesRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public Integer getMask() {
        return mask;
    }

    public CreatePermissionGroupRulesRequest setMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    public String getWriteAccess() {
        return writeAccess;
    }

    public CreatePermissionGroupRulesRequest setWriteAccess(String writeAccess) {
        this.writeAccess = writeAccess;
        return this;
    }

    public String getUserAccess() {
        return userAccess;
    }

    public CreatePermissionGroupRulesRequest setUserAccess(String userAccess) {
        this.userAccess = userAccess;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public CreatePermissionGroupRulesRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
