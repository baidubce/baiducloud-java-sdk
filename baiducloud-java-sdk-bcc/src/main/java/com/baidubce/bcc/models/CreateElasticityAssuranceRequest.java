package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateElasticityAssuranceRequest extends BaseBceRequest {

    /**
    * 弹性保障名称，规则：支持大小写字母、数字、中文以及-_ /.特殊字符，必须以中文或字母开头，长度1-65，可重复；客户未命名的情况下自动命名：elasticityAssurance-${随机生成}，同样遵循以上命名规则
    */
    private String elasticityAssuranceName;

    /**
    * 可用区，例如cn-bj-a
    */
    private String zoneName;

    /**
    * 弹性保障实例规格，例如bcc.g4.c2m8
    */
    private String spec;

    /**
    * 保障数量，最少为1，最大为100
    */
    private Integer capacity;

    /**
    * 弹性保障购买时长，支持1~9、12、24、36、48、60，单位默认为month，不可变更
    */
    private Integer period;

    /**
    * 自动续费开关，默认为false，续费时长与period一致
    */
    private Boolean autoRenew;

    /**
    * 待创建的标签列表
    */
    private List<TagModel> tags;

    public String getElasticityAssuranceName() {
        return elasticityAssuranceName;
    }

    public CreateElasticityAssuranceRequest setElasticityAssuranceName(String elasticityAssuranceName) {
        this.elasticityAssuranceName = elasticityAssuranceName;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateElasticityAssuranceRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public CreateElasticityAssuranceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public CreateElasticityAssuranceRequest setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public CreateElasticityAssuranceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public Boolean getAutoRenew() {
        return autoRenew;
    }

    public CreateElasticityAssuranceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateElasticityAssuranceRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

}
