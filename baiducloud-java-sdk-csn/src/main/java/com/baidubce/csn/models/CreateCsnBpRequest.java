package com.baidubce.csn.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCsnBpRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 带宽包的名称，不能为空
    */
    private String name;

    /**
    * 带宽包的互通类型，取值 [ center \| center-edge \| edge-edge ]，分别表示云间互通、云边互通、边边互通，默认为云间互通
    */
    private String interworkType;

    /**
    * 带宽包的带宽值，最大值为10000
    */
    private Integer bandwidth;

    /**
    * 网络实例所属的区域。取值 [ China \| Asia-Pacific ]，分别表示中国大陆、亚太区域
    */
    private String geographicA;

    /**
    * 另一个网络实例所属的区域。取值 [ China \| Asia-Pacific ]，分别表示中国大陆、亚太区域
    */
    private String geographicB;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 待创建的标签键值对列表
    */
    private List<TagModel> tags;

    public String getClientToken() {
        return clientToken;
    }

    public CreateCsnBpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateCsnBpRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getInterworkType() {
        return interworkType;
    }

    public CreateCsnBpRequest setInterworkType(String interworkType) {
        this.interworkType = interworkType;
        return this;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public CreateCsnBpRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public String getGeographicA() {
        return geographicA;
    }

    public CreateCsnBpRequest setGeographicA(String geographicA) {
        this.geographicA = geographicA;
        return this;
    }

    public String getGeographicB() {
        return geographicB;
    }

    public CreateCsnBpRequest setGeographicB(String geographicB) {
        this.geographicB = geographicB;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateCsnBpRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateCsnBpRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
