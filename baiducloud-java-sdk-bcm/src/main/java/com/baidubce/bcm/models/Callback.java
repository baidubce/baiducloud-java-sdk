package com.baidubce.bcm.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Callback {
    /**
     * 回调URL，支持HTTP/HTTPS
     */
    private String url;

    /**
     * mention
     */
    private Mention mention;

    public Callback setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public Callback setMention(Mention mention) {
        this.mention = mention;
        return this;
    }

    public Mention getMention() {
        return this.mention;
    }

    @Override
    public String toString() {
        return "Callback{" + "url=" + url + "\n" + "mention=" + mention + "\n" + "}";
    }

}