package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAppBlbServerGroupPortRequest extends BaseBceRequest {

    /**
    * blbId
    */
    @JsonIgnore
    private String blbId;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 要删除的端口所在服务器组id
    */
    private String sgId;

    /**
    * 所有待释放的端口id，一起组成一个数组
    */
    private List<String> portIdList;

    public String getBlbId() {
        return blbId;
    }

    public DeleteAppBlbServerGroupPortRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public DeleteAppBlbServerGroupPortRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public DeleteAppBlbServerGroupPortRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public List<String> getPortIdList() {
        return portIdList;
    }

    public DeleteAppBlbServerGroupPortRequest setPortIdList(List<String> portIdList) {
        this.portIdList = portIdList;
        return this;
    }

}
