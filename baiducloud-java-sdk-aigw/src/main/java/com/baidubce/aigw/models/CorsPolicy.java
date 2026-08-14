package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorsPolicy {
    /**
     * 是否启用跨域策略
     */
    private Boolean enabled;

    /**
     * 允许的来源，每项包含 matchType、value
     */
    private List<OriginMatch> allowOrigins;

    /**
     * 允许的 HTTP 方法
     */
    private List<String> allowMethods;

    /**
     * 允许的请求头
     */
    private List<String> allowHeaders;

    /**
     * 暴露的响应头
     */
    private List<String> exposeHeaders;

    /**
     * 预检请求缓存时间，单位为秒
     */
    private Integer maxAge;

    /**
     * 是否允许携带凭证
     */
    private Boolean allowCredentials;

    public CorsPolicy setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public CorsPolicy setAllowOrigins(List<OriginMatch> allowOrigins) {
        this.allowOrigins = allowOrigins;
        return this;
    }

    public List<OriginMatch> getAllowOrigins() {
        return this.allowOrigins;
    }

    public CorsPolicy setAllowMethods(List<String> allowMethods) {
        this.allowMethods = allowMethods;
        return this;
    }

    public List<String> getAllowMethods() {
        return this.allowMethods;
    }

    public CorsPolicy setAllowHeaders(List<String> allowHeaders) {
        this.allowHeaders = allowHeaders;
        return this;
    }

    public List<String> getAllowHeaders() {
        return this.allowHeaders;
    }

    public CorsPolicy setExposeHeaders(List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }

    public List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }

    public CorsPolicy setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    public Integer getMaxAge() {
        return this.maxAge;
    }

    public CorsPolicy setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }

    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    @Override
    public String toString() {
        return "CorsPolicy{" + "enabled=" + enabled + "\n" + "allowOrigins=" + allowOrigins + "\n" + "allowMethods=" + allowMethods + "\n" + "allowHeaders=" + allowHeaders + "\n"
                + "exposeHeaders=" + exposeHeaders + "\n" + "maxAge=" + maxAge + "\n" + "allowCredentials=" + allowCredentials + "\n" + "}";
    }

}
