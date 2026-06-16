package com.baidubce.cfw.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateStatelessCfwRequest extends BaseBceRequest {

    /**
    * CFW名称，长度不超过65个字符，必须以字母或中文开头，只能包含大小写字母、数字、中文及-_/.字符
    */
    private String name;

    /**
    * CFW描述，不超过200字符
    */
    private String description;

    /**
    * 默认策略，白名单模式取值deny、黑名单模式取值allow
    */
    private String defaultAction;

    /**
    * 协议，取值 [ TCP \| UDP \| ICMP \| ALL ]
    */
    private String protocol;

    /**
    * IP列表，黑名单模式下命中ipList中的IP拒绝访问，白名单模式下命中ipList中的IP允许访问
    */
    private List<String> ipList;

    public String getName() {
        return name;
    }

    public CreateStatelessCfwRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateStatelessCfwRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDefaultAction() {
        return defaultAction;
    }

    public CreateStatelessCfwRequest setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public CreateStatelessCfwRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public List<String> getIpList() {
        return ipList;
    }

    public CreateStatelessCfwRequest setIpList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }

}
