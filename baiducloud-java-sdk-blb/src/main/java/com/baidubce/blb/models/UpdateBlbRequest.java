package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateBlbRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * LoadBalancer的名称，方便记忆。长度1~65个字节，字母开头，可包含字母数字-\_/.字符。若不传该参数，会自动生成
    */
    private String name;

    /**
    * LoadBalancer实例的描述，便于用户添加更详细的描述信息。长度0~450个字节，支持中文。默认为空
    */
    private String desc;

    /**
    * 是否允许删除。缺省值为true，代表允许删除
    */
    private Boolean allowDelete;

    /**
    * 是否分配ipv6地址。true代表分配ipv6地址，false代表不分配ipv6地址
    */
    private Boolean allocateIpv6;

    public String getBlbId() {
        return blbId;
    }

    public UpdateBlbRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateBlbRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateBlbRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public UpdateBlbRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Boolean getAllowDelete() {
        return allowDelete;
    }

    public UpdateBlbRequest setAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
        return this;
    }

    public Boolean getAllocateIpv6() {
        return allocateIpv6;
    }

    public UpdateBlbRequest setAllocateIpv6(Boolean allocateIpv6) {
        this.allocateIpv6 = allocateIpv6;
        return this;
    }

}
