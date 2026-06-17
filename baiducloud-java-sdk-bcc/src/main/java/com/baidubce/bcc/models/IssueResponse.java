package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IssueResponse {
    /**
     * 故障名称
     */
    private String issueName;

    /**
     * 事件中文名称
     */
    private String issueAlias;

    /**
     * 故障影响
     */
    private String issueEffect;

    /**
     * 故障描述
     */
    private String issueDescription;

    /**
     * 故障发生时间，符合BCE规范的日期格式
     */
    private String issueOccurTime;

    /**
     * 事件来源
     */
    private String issueSource;

    public IssueResponse setIssueName(String issueName) {
        this.issueName = issueName;
        return this;
    }

    public String getIssueName() {
        return this.issueName;
    }

    public IssueResponse setIssueAlias(String issueAlias) {
        this.issueAlias = issueAlias;
        return this;
    }

    public String getIssueAlias() {
        return this.issueAlias;
    }

    public IssueResponse setIssueEffect(String issueEffect) {
        this.issueEffect = issueEffect;
        return this;
    }

    public String getIssueEffect() {
        return this.issueEffect;
    }

    public IssueResponse setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
        return this;
    }

    public String getIssueDescription() {
        return this.issueDescription;
    }

    public IssueResponse setIssueOccurTime(String issueOccurTime) {
        this.issueOccurTime = issueOccurTime;
        return this;
    }

    public String getIssueOccurTime() {
        return this.issueOccurTime;
    }

    public IssueResponse setIssueSource(String issueSource) {
        this.issueSource = issueSource;
        return this;
    }

    public String getIssueSource() {
        return this.issueSource;
    }

    @Override
    public String toString() {
        return "IssueResponse{" + "issueName=" + issueName + "\n" + "issueAlias=" + issueAlias + "\n" + "issueEffect=" + issueEffect + "\n" + "issueDescription="
                + issueDescription + "\n" + "issueOccurTime=" + issueOccurTime + "\n" + "issueSource=" + issueSource + "\n" + "}";
    }

}