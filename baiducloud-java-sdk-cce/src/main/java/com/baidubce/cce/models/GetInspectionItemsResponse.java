package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInspectionItemsResponse extends BaseBceResponse {

    /**
    * 巡检项列表，外层 key 为巡检项类别，内层 key 为巡检项英文名
    */
    private Map<String,Map<String,ItemDetail>>（根元素）;

    public Map<String, Map<String, ItemDetail>> get（根元素）()
    {
        return （根元素）;
    }

    public GetInspectionItemsResponse set（根元素）(Map<String,Map<String,ItemDetail>>（根元素）)
    {
        this.（根元素） = （根元素）;
        return this;
    }

    @Override
    public String toString() {
        return "GetInspectionItemsResponse{"
+ "（根元素）=" + （根元素） + "\n"
+ "}";
    }

}
