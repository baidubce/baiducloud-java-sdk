package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportKeypairRequest extends BaseBceRequest {

    /**
    * 待创建的密钥对名称，只支持大小写字母、数字、汉字以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    /**
    * 待创建的密钥对的描述，只支持中文、字母、数字、点号“.”、空格、下划线“_”、中划线“-”、等号“=”、英文逗号“,”、中文逗号“，”、冒号“：”、斜杠 “/” 和中文句号“。”
    */
    private String description;

    /**
    * 公钥内容
    */
    private String publicKey;

    public String getName() {
        return name;
    }

    public ImportKeypairRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ImportKeypairRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public ImportKeypairRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

}
