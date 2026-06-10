package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenameVolumeRequest extends BaseBceRequest {

    /**
    * volumeId
    */
    @JsonIgnore
    private String volumeId;

    /**
    * 磁盘新的名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    public String getVolumeId() {
        return volumeId;
    }

    public RenameVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getName() {
        return name;
    }

    public RenameVolumeRequest setName(String name) {
        this.name = name;
        return this;
    }

}
