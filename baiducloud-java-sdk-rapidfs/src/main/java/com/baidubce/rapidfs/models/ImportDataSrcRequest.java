package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportDataSrcRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * RapidFS 实例 ID
    */
    private String instanceId;

    /**
    * 数据源名称
    */
    private String dataSrcName;

    /**
    * 数据源的对象存储 Bucket（当前只支持同地域的存储桶）
    */
    private String bucket;

    /**
    * 是否为其他账号的 bucket，若为true则需要提供导入 Bucket 带读写权限的AK/SK，默认 false; storageType 非 BOS 时必填, 传 false 或不传都会被隐式归一化为 true
    */
    private Boolean otherAccount;

    /**
    * 对象存储类型，取值 BOS（默认，兼容存量）/ OSS，其他取值报错 Invalid storageType。缺省即 BOS，存量请求语义不变
    */
    private String storageType;

    /**
    * 对象存储服务的 endpoint <br>storageType 非 BOS 时必填 <br>storageType 为 BOS 时可选，传入则使用传入值，未传则由后端按 region 自动推导。
    */
    private String bucketEndpoint;

    /**
    * otherAccount 为 true 时必填，无需加密
    */
    private String bucketAK;

    /**
    * otherAccount 为 true 时必填，bucketSK字段需要基于请求 header x-bce-accesskey 对应的 secretkey
    * 进行加密传输，详见[密码加密传输规范定义](https://cloud.baidu.com/doc/BCC/s/ojwvynrqn#%E5%AF%86%E7%A0%81%E5%8A%A0%E5%AF%86%E4%BC%A0%E8%BE%93%E8%A7%84%E8%8C%83)。可参考
    * [bce-python-sdk](https://cloud.baidu.com/doc/Developer/index.html) aes128_encrypt_16char_key()函数实现
    */
    private String bucketSK;

    /**
    * otherAccount 为 true 时有效，无需加密
    */
    private String bucketStsToken;

    /**
    * BOS Bucket的目录前缀，默认值为/。例如，用户想要导入bos:/bucket_name/model_data/2025/下所有对象，则dirPrefix值为/model_data/2025/
    */
    private String dirPrefix;

    /**
    * 数据源导入时是否立即同步元数据，默认 true
    */
    private Boolean syncMetaOnImport;

    /**
    * 是否保留软链，保留软链会降低数据源导入效率，以及后续增量元数据同步效率，默认 false
    */
    private Boolean keepSymlink;

    /**
    * 权限组ID，默认权限组 ID 为 AG-RAPIDFS_DEFAULT_AUTHGROUP_ID
    */
    private String authGroupId;

    /**
    * 数据源要绑定的挂载服务列表，元素类型见数据类型 MountServiceBinding。<br>不传或传空列表：不绑定任何挂载服务 <br>传入非空列表：请求时统一校验，全部通过才予受理，数据源导入成功后逐个绑定 <br>同一 mountServiceId 不可重复出现 <br>若导入失败则不执行绑定，已占用的挂载路径随之释放
    */
    private List<MountServiceBinding> mountServiceBindings;

    /**
    * 数据源描述信息
    */
    private String description;

    /**
    * 该数据源的容量配额，表示该数据源的可用最大容量，不能超过实例的缓存总容量
    */
    private Integer quotaMiB;

    public String getClientToken() {
        return clientToken;
    }

    public ImportDataSrcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ImportDataSrcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getDataSrcName() {
        return dataSrcName;
    }

    public ImportDataSrcRequest setDataSrcName(String dataSrcName) {
        this.dataSrcName = dataSrcName;
        return this;
    }

    public String getBucket() {
        return bucket;
    }

    public ImportDataSrcRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public Boolean getOtherAccount() {
        return otherAccount;
    }

    public ImportDataSrcRequest setOtherAccount(Boolean otherAccount) {
        this.otherAccount = otherAccount;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public ImportDataSrcRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getBucketEndpoint() {
        return bucketEndpoint;
    }

    public ImportDataSrcRequest setBucketEndpoint(String bucketEndpoint) {
        this.bucketEndpoint = bucketEndpoint;
        return this;
    }

    public String getBucketAK() {
        return bucketAK;
    }

    public ImportDataSrcRequest setBucketAK(String bucketAK) {
        this.bucketAK = bucketAK;
        return this;
    }

    public String getBucketSK() {
        return bucketSK;
    }

    public ImportDataSrcRequest setBucketSK(String bucketSK) {
        this.bucketSK = bucketSK;
        return this;
    }

    public String getBucketStsToken() {
        return bucketStsToken;
    }

    public ImportDataSrcRequest setBucketStsToken(String bucketStsToken) {
        this.bucketStsToken = bucketStsToken;
        return this;
    }

    public String getDirPrefix() {
        return dirPrefix;
    }

    public ImportDataSrcRequest setDirPrefix(String dirPrefix) {
        this.dirPrefix = dirPrefix;
        return this;
    }

    public Boolean getSyncMetaOnImport() {
        return syncMetaOnImport;
    }

    public ImportDataSrcRequest setSyncMetaOnImport(Boolean syncMetaOnImport) {
        this.syncMetaOnImport = syncMetaOnImport;
        return this;
    }

    public Boolean getKeepSymlink() {
        return keepSymlink;
    }

    public ImportDataSrcRequest setKeepSymlink(Boolean keepSymlink) {
        this.keepSymlink = keepSymlink;
        return this;
    }

    public String getAuthGroupId() {
        return authGroupId;
    }

    public ImportDataSrcRequest setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

    public List<MountServiceBinding> getMountServiceBindings() {
        return mountServiceBindings;
    }

    public ImportDataSrcRequest setMountServiceBindings(List<MountServiceBinding> mountServiceBindings) {
        this.mountServiceBindings = mountServiceBindings;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ImportDataSrcRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getQuotaMiB() {
        return quotaMiB;
    }

    public ImportDataSrcRequest setQuotaMiB(Integer quotaMiB) {
        this.quotaMiB = quotaMiB;
        return this;
    }

}
