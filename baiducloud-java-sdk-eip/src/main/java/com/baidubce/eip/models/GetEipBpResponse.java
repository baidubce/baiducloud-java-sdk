package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEipBpResponse extends BaseBceResponse {

    /**
    * 带宽包名称
    */
    private String name;

    /**
    * 带宽包id
    */
    private String id;

    /**
    * 带宽包所绑定的资源的类型，\"eip\"（弹性公网EIP）或\"eipgroup\"（共享带宽）
    */
    private String bindType;

    /**
    * 带宽包的带宽值
    */
    private Integer bandwidthInMbps;

    /**
    * 带宽包绑定资源的id
    */
    private String instanceId;

    /**
    * 若bindType为\"eip\"，只包含一个eip地址；若bindType为\"eipgroup\"，则包含共享带宽下的全部eip地址
    */
    private List<String> eips;

    /**
    * 若bindType为\"eip\"，表示带宽包所绑定的eip的带宽;若bindType为\"eipgroup\"，表示带宽包所绑定的共享带宽的带宽
    */
    private Integer instanceBandwidthInMbps;

    /**
    * 带宽包创建时间
    */
    private String createTime;

    /**
    * 带宽包自动释放时间,若未设置则同所绑定资源的到期时间一致
    */
    private String autoReleaseTime;

    /**
    * 带宽包的类型，BandwidthPackage（带宽包）或 AccelerationPackage（跨境加速包）
    */
    private String type;

    /**
    * 带宽包所属区域
    */
    private String region;

    public String getName() {
        return name;
    }

    public GetEipBpResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetEipBpResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getBindType() {
        return bindType;
    }

    public GetEipBpResponse setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }

    public Integer getBandwidthInMbps() {
        return bandwidthInMbps;
    }

    public GetEipBpResponse setBandwidthInMbps(Integer bandwidthInMbps) {
        this.bandwidthInMbps = bandwidthInMbps;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public GetEipBpResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public List<String> getEips() {
        return eips;
    }

    public GetEipBpResponse setEips(List<String> eips) {
        this.eips = eips;
        return this;
    }

    public Integer getInstanceBandwidthInMbps() {
        return instanceBandwidthInMbps;
    }

    public GetEipBpResponse setInstanceBandwidthInMbps(Integer instanceBandwidthInMbps) {
        this.instanceBandwidthInMbps = instanceBandwidthInMbps;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public GetEipBpResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getAutoReleaseTime() {
        return autoReleaseTime;
    }

    public GetEipBpResponse setAutoReleaseTime(String autoReleaseTime) {
        this.autoReleaseTime = autoReleaseTime;
        return this;
    }

    public String getType() {
        return type;
    }

    public GetEipBpResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public GetEipBpResponse setRegion(String region) {
        this.region = region;
        return this;
    }

    @Override
    public String toString() {
        return "GetEipBpResponse{" + "name=" + name + "\n" + "id=" + id + "\n" + "bindType=" + bindType + "\n" + "bandwidthInMbps=" + bandwidthInMbps + "\n" + "instanceId="
                + instanceId + "\n" + "eips=" + eips + "\n" + "instanceBandwidthInMbps=" + instanceBandwidthInMbps + "\n" + "createTime=" + createTime + "\n" + "autoReleaseTime="
                + autoReleaseTime + "\n" + "type=" + type + "\n" + "region=" + region + "\n" + "}";
    }

}
