package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReleaseInstanceByPostRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 是否关联释放当前时刻实例挂载的全部按量付费的EIP(加入共享带宽的EIP会自动解绑)和按量付费的云磁盘数据盘，当值为true且cdsAttributeActive参数值为true时数据盘只释放有关联释放属性的磁盘，cdsAttributeActive为false时释放全部磁盘
    */
    private Boolean relatedReleaseFlag;

    /**
    * 是否在释放云磁盘时释放云磁盘的全部快照，当cdsAttributeActive参数值为true时该值不生效，仅根据关联释放属性判断是否释放自动快照，手动快照默认保留。
    */
    private Boolean deleteCdsSnapshotFlag;

    /**
    * 实例释放时是否删除关联的ENI
    */
    private Boolean deleteRelatedEnisFlag;

    /**
    * 实例释放时是否进入回收站
    */
    private Boolean bccRecycleFlag;

    /**
    * 是否按照磁盘关联释放属性释放资源，默认为false，当该参数为true时将按照磁盘配置的关联释放属性确定资源是否释放，优先级高于relatedReleaseFlag和deleteCdsSnapshotFlag选项
    */
    private Boolean cdsAttributeActive;

    public String getInstanceId() {
        return instanceId;
    }

    public ReleaseInstanceByPostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getRelatedReleaseFlag() {
        return relatedReleaseFlag;
    }

    public ReleaseInstanceByPostRequest setRelatedReleaseFlag(Boolean relatedReleaseFlag) {
        this.relatedReleaseFlag = relatedReleaseFlag;
        return this;
    }

    public Boolean getDeleteCdsSnapshotFlag() {
        return deleteCdsSnapshotFlag;
    }

    public ReleaseInstanceByPostRequest setDeleteCdsSnapshotFlag(Boolean deleteCdsSnapshotFlag) {
        this.deleteCdsSnapshotFlag = deleteCdsSnapshotFlag;
        return this;
    }

    public Boolean getDeleteRelatedEnisFlag() {
        return deleteRelatedEnisFlag;
    }

    public ReleaseInstanceByPostRequest setDeleteRelatedEnisFlag(Boolean deleteRelatedEnisFlag) {
        this.deleteRelatedEnisFlag = deleteRelatedEnisFlag;
        return this;
    }

    public Boolean getBccRecycleFlag() {
        return bccRecycleFlag;
    }

    public ReleaseInstanceByPostRequest setBccRecycleFlag(Boolean bccRecycleFlag) {
        this.bccRecycleFlag = bccRecycleFlag;
        return this;
    }

    public Boolean getCdsAttributeActive() {
        return cdsAttributeActive;
    }

    public ReleaseInstanceByPostRequest setCdsAttributeActive(Boolean cdsAttributeActive) {
        this.cdsAttributeActive = cdsAttributeActive;
        return this;
    }

}
