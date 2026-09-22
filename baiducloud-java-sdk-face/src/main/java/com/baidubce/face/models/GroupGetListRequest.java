package com.baidubce.face.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupGetListRequest extends BaseBceRequest {

    /**
    * 起始序号，默认为0
    */
    private Integer start;

    /**
    * 返回数量，默认100，最大1000
    */
    private Integer length;

    public Integer getStart() {
        return start;
    }

    public GroupGetListRequest setStart(Integer start) {
        this.start = start;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public GroupGetListRequest setLength(Integer length) {
        this.length = length;
        return this;
    }

}
