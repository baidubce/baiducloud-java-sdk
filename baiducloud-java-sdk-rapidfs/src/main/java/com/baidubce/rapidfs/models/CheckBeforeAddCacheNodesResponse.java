package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckBeforeAddCacheNodesResponse extends BaseBceResponse {

    /**
    * 检查是否通过
    */
    private Boolean pass;

    /**
    * 错误列表，见附录 ErrInfo，pass 为 false 时返回
    */
    private List<ErrInfo> errInfos;

    public Boolean getPass() {
        return pass;
    }

    public CheckBeforeAddCacheNodesResponse setPass(Boolean pass) {
        this.pass = pass;
        return this;
    }

    public List<ErrInfo> getErrInfos() {
        return errInfos;
    }

    public CheckBeforeAddCacheNodesResponse setErrInfos(List<ErrInfo> errInfos) {
        this.errInfos = errInfos;
        return this;
    }

    @Override
    public String toString() {
        return "CheckBeforeAddCacheNodesResponse{" + "pass=" + pass + "\n" + "errInfos=" + errInfos + "\n" + "}";
    }

}
