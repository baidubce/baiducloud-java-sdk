package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeSpecsRequest extends BaseBceRequest {

    /**
    * 条件筛选，见附录 Filter，多组 filter 之间为条件与关系，多个 value 之间为条件或关系。当前支持字段：<br> • name=managedMode，按部署类型筛选，例如 value=["FullyManaged"]；<br> • name=metaSpec，按元数据规格筛选，按例如 value=["M2"]；<br> •
    * name=dataSpec，按数据规格筛选，例如 value=["Basic"]
    */
    private List<Filter> filters;

    public List<Filter> getFilters() {
        return filters;
    }

    public DescribeSpecsRequest setFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

}
