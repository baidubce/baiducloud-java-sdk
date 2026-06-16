package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeypairDetailResponse extends BaseBceResponse {

    /**
    * keypair
    */
    private KeypairModel keypair;

    public KeypairModel getKeypair() {
        return keypair;
    }

    public KeypairDetailResponse setKeypair(KeypairModel keypair) {
        this.keypair = keypair;
        return this;
    }

    @Override
    public String toString() {
        return "KeypairDetailResponse{" + "keypair=" + keypair + "\n" + "}";
    }

}
