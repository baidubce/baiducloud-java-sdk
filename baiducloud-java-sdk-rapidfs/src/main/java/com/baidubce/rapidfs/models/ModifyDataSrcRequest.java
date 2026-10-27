package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyDataSrcRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 待修改的数据源 ID
    */
    private String dataSrcId;

    /**
    * 所属 RapidFS 实例唯一 ID
    */
    private String instanceId;

    /**
    * 修改 bucket 凭证。仅 otherAccount == true 的数据源可改；必须与 bucketSK 成对提供
    */
    private String bucketAK;

    /**
    * 修改 bucket 凭证，加密方式与导入数据源时一致，详见[密码加密传输规范定义](https://cloud.baidu.com/doc/BCC/s/ojwvynrqn#%E5%AF%86%E7%A0%81%E5%8A%A0%E5%AF%86%E4%BC%A0%E8%BE%93%E8%A7%84%E8%8C%83)。可参考
    * [bce-python-sdk](https://cloud.baidu.com/doc/Developer/index.html) aes128_encrypt_16char_key()函数实现；必须与 bucketAK 成对提供
    */
    private String bucketSK;

    /**
    * 是否保留 BOS 软链，保留软链会降低数据源导入效率，以及后续增量元数据同步效率
    */
    private Boolean keepSymlink;

    /**
    * 权限组Id
    */
    private String authGroupId;

    /**
    * 数据源绑定的目标全集，见数据类型 MountServiceBinding。<br>传入（含空列表）：以列表为准整体覆盖该数据源的绑定，空列表表示摘除全部绑定 <br>数据源状态为 RUNNING 或 CHANGE_FAILED 时允许修改，绑定变更为异步执行<br>BIND_FAILED / UNBIND_FAILED 的绑定可再次提交修改重试
    */
    private List<MountServiceBinding> mountServiceBindings;

    /**
    * 数据源描述信息，不超过256个字符
    */
    private String description;

    /**
    * 该数据源的容量配额，表示该数据源的可用最大容量，不能超过实例的缓存总容量。-1 表示取消对数据源的容量限制
    */
    private Integer quotaMiB;

    public String getClientToken() {
        return clientToken;
    }

    public ModifyDataSrcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public ModifyDataSrcRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyDataSrcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getBucketAK() {
        return bucketAK;
    }

    public ModifyDataSrcRequest setBucketAK(String bucketAK) {
        this.bucketAK = bucketAK;
        return this;
    }

    public String getBucketSK() {
        return bucketSK;
    }

    public ModifyDataSrcRequest setBucketSK(String bucketSK) {
        this.bucketSK = bucketSK;
        return this;
    }

    public Boolean getKeepSymlink() {
        return keepSymlink;
    }

    public ModifyDataSrcRequest setKeepSymlink(Boolean keepSymlink) {
        this.keepSymlink = keepSymlink;
        return this;
    }

    public String getAuthGroupId() {
        return authGroupId;
    }

    public ModifyDataSrcRequest setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

    public List<MountServiceBinding> getMountServiceBindings() {
        return mountServiceBindings;
    }

    public ModifyDataSrcRequest setMountServiceBindings(List<MountServiceBinding> mountServiceBindings) {
        this.mountServiceBindings = mountServiceBindings;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyDataSrcRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getQuotaMiB() {
        return quotaMiB;
    }

    public ModifyDataSrcRequest setQuotaMiB(Integer quotaMiB) {
        this.quotaMiB = quotaMiB;
        return this;
    }

}
