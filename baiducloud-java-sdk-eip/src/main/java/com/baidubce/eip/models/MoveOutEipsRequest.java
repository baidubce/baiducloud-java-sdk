package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveOutEipsRequest extends BaseBceRequest {

    /**
    * id
    */
    @JsonIgnore
    private String id;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 待移出EIP列表，包括IPv4 EIP和IPv6 EIP
    */
    private List<EipMoveOutModel> moveOutEips;

    public String getId() {
        return id;
    }

    public MoveOutEipsRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public MoveOutEipsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public List<EipMoveOutModel> getMoveOutEips() {
        return moveOutEips;
    }

    public MoveOutEipsRequest setMoveOutEips(List<EipMoveOutModel> moveOutEips) {
        this.moveOutEips = moveOutEips;
        return this;
    }

}
