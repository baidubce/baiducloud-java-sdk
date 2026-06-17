package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteLogStoreTemplatesRequest extends BaseBceRequest {

    /**
    * 模板名称列表，支持批量删除
    */
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public DeleteLogStoreTemplatesRequest setNames(List<String> names) {
        this.names = names;
        return this;
    }

}
