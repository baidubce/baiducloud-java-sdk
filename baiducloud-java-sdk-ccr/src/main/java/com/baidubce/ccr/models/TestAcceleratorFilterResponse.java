package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestAcceleratorFilterResponse extends BaseBceResponse {

    /**
    * 验证是否满足按需加载规则
    */
    private Boolean matched;

    public Boolean getMatched() {
        return matched;
    }

    public TestAcceleratorFilterResponse setMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }

    @Override
    public String toString() {
        return "TestAcceleratorFilterResponse{" + "matched=" + matched + "\n" + "}";
    }

}
