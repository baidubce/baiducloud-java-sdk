package com.baidubce.cloudassistant.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TargetImport {
    /**
     * 实例列表导入类型。枚举值：instanceId（通过实例ID导入），internalIp表示（通过实例内网导入）
     */
    private String keywordType;

    /**
     * 实例清单列表
     */
    private List<String> instances;

    public TargetImport setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getKeywordType() {
        return this.keywordType;
    }

    public TargetImport setInstances(List<String> instances) {
        this.instances = instances;
        return this;
    }

    public List<String> getInstances() {
        return this.instances;
    }

    @Override
    public String toString() {
        return "TargetImport{" + "keywordType=" + keywordType + "\n" + "instances=" + instances + "\n" + "}";
    }

}