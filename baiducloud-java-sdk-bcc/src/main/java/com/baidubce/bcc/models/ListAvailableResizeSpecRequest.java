package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAvailableResizeSpecRequest extends BaseBceRequest {

    /**
    * 实例规格。实例规格、规格族ID和实例ID有且只能传一个。
    */
    private String spec;

    /**
    * 规格族ID。实例规格、规格族ID和实例ID有且只能传一个。
    */
    private String specId;

    /**
    * 指定zone信息，命名规范是"国家-region-可用区序列"，小写，例如北京可用区A为"cn-bj-a"。若传入spec或specId，则该参数为必填。
    */
    private String zone;

    /**
    * 实例ID列表。实例规格、规格族ID和实例ID有且只能传一个。
    */
    private List<String> instanceIdList;

    public String getSpec() {
        return spec;
    }

    public ListAvailableResizeSpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getSpecId() {
        return specId;
    }

    public ListAvailableResizeSpecRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public String getZone() {
        return zone;
    }

    public ListAvailableResizeSpecRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public ListAvailableResizeSpecRequest setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

}
