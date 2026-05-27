package com.baidubce.blb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAppBlbServerGroupPortRequest extends BaseBceRequest {

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
    * 要更新的服务器组端口的标识符
    */
    private String portId;

    /**
    * 是否开启健康检查，默认true
    */
    private Boolean enableHealthCheck;

    /**
    * 健康检查协议，支持"HTTP"/"TCP"/"UDP"/"ICMP"，  TCP默认TCP，UDP默认UDP，HTTP默认HTTP
    */
    private String healthCheck;

    /**
    * 健康检查端口，默认为port的取值，当健康检查协议为"HTTP"时生效
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

    public UpdateAppBlbServerGroupPortRequest setBlbId(String blbId) {
        this.blbId = blbId;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public UpdateAppBlbServerGroupPortRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getSgId() {
        return sgId;
    }

    public UpdateAppBlbServerGroupPortRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }

    public String getPortId() {
        return portId;
    }

    public UpdateAppBlbServerGroupPortRequest setPortId(String portId) {
        this.portId = portId;
        return this;
    }

    public Boolean getEnableHealthCheck() {
        return enableHealthCheck;
    }

    public UpdateAppBlbServerGroupPortRequest setEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }

    public String getHealthCheck() {
        return healthCheck;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public Integer getHealthCheckPort() {
        return healthCheckPort;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
        return this;
    }

    public String getHealthCheckUrlPath() {
        return healthCheckUrlPath;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckUrlPath(String healthCheckUrlPath) {
        this.healthCheckUrlPath = healthCheckUrlPath;
        return this;
    }

    public Integer getHealthCheckTimeoutInSecond() {
        return healthCheckTimeoutInSecond;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckTimeoutInSecond(Integer healthCheckTimeoutInSecond) {
        this.healthCheckTimeoutInSecond = healthCheckTimeoutInSecond;
        return this;
    }

    public Integer getHealthCheckIntervalInSecond() {
        return healthCheckIntervalInSecond;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckIntervalInSecond(Integer healthCheckIntervalInSecond) {
        this.healthCheckIntervalInSecond = healthCheckIntervalInSecond;
        return this;
    }

    public Integer getHealthCheckDownRetry() {
        return healthCheckDownRetry;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckDownRetry(Integer healthCheckDownRetry) {
        this.healthCheckDownRetry = healthCheckDownRetry;
        return this;
    }

    public Integer getHealthCheckUpRetry() {
        return healthCheckUpRetry;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckUpRetry(Integer healthCheckUpRetry) {
        this.healthCheckUpRetry = healthCheckUpRetry;
        return this;
    }

    public String getHealthCheckNormalStatus() {
        return healthCheckNormalStatus;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckNormalStatus(String healthCheckNormalStatus) {
        this.healthCheckNormalStatus = healthCheckNormalStatus;
        return this;
    }

    public String getHealthCheckHost() {
        return healthCheckHost;
    }

    public UpdateAppBlbServerGroupPortRequest setHealthCheckHost(String healthCheckHost) {
        this.healthCheckHost = healthCheckHost;
        return this;
    }

    public String getUdpHealthCheckString() {
        return udpHealthCheckString;
    }

    public UpdateAppBlbServerGroupPortRequest setUdpHealthCheckString(String udpHealthCheckString) {
        this.udpHealthCheckString = udpHealthCheckString;
        return this;
    }

}
