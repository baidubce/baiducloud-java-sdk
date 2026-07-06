package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeJobWebterminalResponse extends BaseBceResponse {

    /**
    * 请求ID
    */
    private String requestId;

    /**
    * WebTerminal的连接地址
    */
    private String webTerminalUrl;

    public String getRequestId() {
        return requestId;
    }

    public DescribeJobWebterminalResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getWebTerminalUrl() {
        return webTerminalUrl;
    }

    public DescribeJobWebterminalResponse setWebTerminalUrl(String webTerminalUrl) {
        this.webTerminalUrl = webTerminalUrl;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeJobWebterminalResponse{" + "requestId=" + requestId + "\n" + "webTerminalUrl=" + webTerminalUrl + "\n" + "}";
    }

}
