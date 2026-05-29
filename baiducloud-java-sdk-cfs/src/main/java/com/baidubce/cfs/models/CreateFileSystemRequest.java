package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateFileSystemRequest extends BaseBceRequest {

    /**
    * FileSystem的名称，方便记忆。长度1~65个字节，字母开头，可包含字母数字-_/.字符。
    */
    private String fsName;

    /**
    * FileSystem所在可用区，例如zoneB。
    */
    private String zone;

    /**
    * 文件系统类型：1.cap(容量型) 2.ssd(性能型) 当前默认是容量型
    */
    private String type;

    /**
    * 协议类型：1.nfs 2.smb，默认nfs协议。
    */
    private String protocol;

    /**
    * 文件系统标签
    */
    private List<Tag> tags;

    /**
    * 文件系统的quota值，不选或者值为0是表示无自定义硬限，否则表示上限容量（设置时最小为1GB，最大为10PB），单位 bytes。
    */
    private Long capacityQuota;

    public String getFsName() {
        return fsName;
    }

    public CreateFileSystemRequest setFsName(String fsName) {
        this.fsName = fsName;
        return this;
    }

    public String getZone() {
        return zone;
    }

    public CreateFileSystemRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateFileSystemRequest setType(String type) {
        this.type = type;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public CreateFileSystemRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public CreateFileSystemRequest setTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Long getCapacityQuota() {
        return capacityQuota;
    }

    public CreateFileSystemRequest setCapacityQuota(Long capacityQuota) {
        this.capacityQuota = capacityQuota;
        return this;
    }

}
