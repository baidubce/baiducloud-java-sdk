package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResizeVolumeResponse extends BaseBceResponse {

    /**
    * 磁盘扩容变更产生的warning信息
    */
    private List<String> warningList;

    public List<String> getWarningList() {
        return warningList;
    }

    public ResizeVolumeResponse setWarningList(List<String> warningList) {
        this.warningList = warningList;
        return this;
    }

    @Override
    public String toString() {
        return "ResizeVolumeResponse{" + "warningList=" + warningList + "\n" + "}";
    }

}
