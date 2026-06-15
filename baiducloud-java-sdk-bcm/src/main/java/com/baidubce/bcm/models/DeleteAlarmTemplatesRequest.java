package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAlarmTemplatesRequest extends BaseBceRequest {

    /**
    * 要删除的报警模板ID列表
    */
    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public DeleteAlarmTemplatesRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

}
