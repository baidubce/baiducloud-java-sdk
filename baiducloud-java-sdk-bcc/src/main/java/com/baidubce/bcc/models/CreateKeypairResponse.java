package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateKeypairResponse extends BaseBceResponse {

    /**
    * keypair
    */
    private KeypairModel keypair;

    public KeypairModel getKeypair() {
        return keypair;
    }

    public CreateKeypairResponse setKeypair(KeypairModel keypair) {
        this.keypair = keypair;
        return this;
    }

    @Override
    public String toString() {
        return "CreateKeypairResponse{" + "keypair=" + keypair + "\n" + "}";
    }

}
