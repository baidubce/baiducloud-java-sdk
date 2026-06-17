package com.baidubce.bls.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Highlight {
    /**
     * 高亮的前置标识，默认@kibana-highlighted-field@
     */
    private List<String> preTags;

    /**
     * 高亮的后置标识，默认@/kibana-highlighted-field@
     */
    private List<String> postTags;

    public Highlight setPreTags(List<String> preTags) {
        this.preTags = preTags;
        return this;
    }

    public List<String> getPreTags() {
        return this.preTags;
    }

    public Highlight setPostTags(List<String> postTags) {
        this.postTags = postTags;
        return this;
    }

    public List<String> getPostTags() {
        return this.postTags;
    }

    @Override
    public String toString() {
        return "Highlight{" + "preTags=" + preTags + "\n" + "postTags=" + postTags + "\n" + "}";
    }

}