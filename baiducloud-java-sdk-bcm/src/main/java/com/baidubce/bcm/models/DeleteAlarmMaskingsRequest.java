package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAlarmMaskingsRequest extends BaseBceRequest {

    /**
    * 屏蔽规则ID列表
    */
    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }

    public DeleteAlarmMaskingsRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

}
