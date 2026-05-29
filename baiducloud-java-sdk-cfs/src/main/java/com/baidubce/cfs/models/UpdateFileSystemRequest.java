package com.baidubce.cfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateFileSystemRequest extends BaseBceRequest {

    /**
    * fsId
    */
    @JsonIgnore
    private String fsId;

    /**
    * FileSystem的名称，方便记忆。长度1~65个字节，字母开头，可包含字母数字-_/.字符。
    */
    private String fsName;

    /**
    * 更新之后的quota值，不选或者值为0是表示无自定义硬限，否则表示上限容量（设置时最小为1GB，最大为10PB），单位 bytes。
    */
    private Integer capacityQuota;

    public String getFsId() {
        return fsId;
    }

    public UpdateFileSystemRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }

    public String getFsName() {
        return fsName;
    }

    public UpdateFileSystemRequest setFsName(String fsName) {
        this.fsName = fsName;
        return this;
    }

    public Integer getCapacityQuota() {
        return capacityQuota;
    }

    public UpdateFileSystemRequest setCapacityQuota(Integer capacityQuota) {
        this.capacityQuota = capacityQuota;
        return this;
    }

}
