package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAppBlbServerGroupPortRequest extends BaseBceRequest {

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
    * 端口所属服务器组标识符
    */
    private String sgId;

    /**
    * 端口号，需为1-65535间的整数
    */
    private Integer port;

    /**
    * 监听端口的协议类型，"TCP"/"UDP"/"HTTP"
    */
    private String type;

    /**
    * 是否开启健康检查，默认true
    */
    private Boolean enableHealthCheck;

    /**
    * 健康检查协议，支持"HTTP"/"TCP"/"UDP"/"ICMP"，  TCP默认TCP，UDP默认UDP，HTTP默认HTTP
    */
    private String healthCheck;

    /**
    * 健康检查端口，允许范围为1-65535，默认为port的取值，当健康检查协议为"HTTP"时生效
    */
    private Integer healthCheckPort;

    /**
    * 健康检查URI，默认/。当健康检查协议为"HTTP"时生效
    */
    private String healthCheckUrlPath;

    /**
    * 健康检查超时（单位：秒），默认为3，需为1-60间的整数
    */
    private Integer healthCheckTimeoutInSecond;

    /**
    * 健康检查间隔（单位：秒），默认为3，需为1-10间的整数
    */
    private Integer healthCheckIntervalInSecond;

    /**
    * 不健康阈值，即连续多少次健康检查失败后，屏蔽该后端服务器。默认为3，需为2-5间的整数
    */
    private Integer healthCheckDownRetry;

    /**
    * 健康阈值，即连续多少次健康检查成功后，重新将该后端服务器置为可用。默认为3，需为2-5间的整数
    */
    private Integer healthCheckUpRetry;

    /**
    * 健康检查正常时的HTTP状态码，支持5类状态码的组合，例如"http_1xx\|http_2xx"，默认"http_2xx\|http_3xx"。当健康检查协议为"HTTP"时生效
    */
    private String healthCheckNormalStatus;

    /**
    * 7层健康检查请求的头部域会带指定的host字段，例如"localhost"，默认""。当健康检查协议为"HTTP"时生效
    */
    private String healthCheckHost;

    /**
    * UDP服务的健康检查字段。当健康检查协议为"UDP"时，则必传
    */
    private String udpHealthCheckString;

    public String getBlbId() {
        return blbId;
    }

    public CreateAppBlbServerGroupPortRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public CreateAppBlbServerGroupPortRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public CreateAppBlbServerGroupPortRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public CreateAppBlbServerGroupPortRequest setPort(Integer port) {
        this.port = port;
        return this;
    }

    public String getType() {
        return type;
    }

    public CreateAppBlbServerGroupPortRequest setType(String type) {
        this.type = type;
        return this;
    }

    public Boolean getEnableHealthCheck() {
        return enableHealthCheck;
    }

    public CreateAppBlbServerGroupPortRequest setEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }

    public String getHealthCheck() {
        return healthCheck;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public String getHealthCheckUrlPath() {
        return healthCheckUrlPath;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckUrlPath(String healthCheckUrlPath) {
        this.healthCheckUrlPath = healthCheckUrlPath;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return healthCheckTimeoutInSecond;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckIntervalInSecond() {
        return healthCheckIntervalInSecond;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckIntervalInSecond(Integer healthCheckIntervalInSecond) {
        this.healthCheckIntervalInSecond = healthCheckIntervalInSecond;
        return this;
    }

    public Integer getHealthCheckDownRetry() {
        return healthCheckDownRetry;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckDownRetry(Integer healthCheckDownRetry) {
        this.healthCheckDownRetry = healthCheckDownRetry;
        return this;
    }

    public Integer getHealthCheckUpRetry() {
        return healthCheckUpRetry;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckUpRetry(Integer healthCheckUpRetry) {
        this.healthCheckUpRetry = healthCheckUpRetry;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return healthCheckNormalStatus;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckHost() {
        return healthCheckHost;
    }

    public CreateAppBlbServerGroupPortRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getUdpHealthCheckString() {
        return udpHealthCheckString;
    }

    public CreateAppBlbServerGroupPortRequest setUdpHealthCheckString(String udpHealthCheckString) {
        this.udpHealthCheckString = udpHealthCheckString;
        return this;
    }

}
