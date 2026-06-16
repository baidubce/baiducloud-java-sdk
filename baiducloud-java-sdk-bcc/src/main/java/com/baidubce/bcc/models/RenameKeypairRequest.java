package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenameKeypairRequest extends BaseBceRequest {

    /**
    * keypairId
    */
    @JsonIgnore
    private String keypairId;

    /**
    * 新的密钥对名称，只支持大小写字母、数字、汉字以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    public String getKeypairId() {
        return keypairId;
    }

    public RenameKeypairRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getName() {
        return name;
    }

    public RenameKeypairRequest setName(String name) {
        this.name = name;
        return this;
    }

}
