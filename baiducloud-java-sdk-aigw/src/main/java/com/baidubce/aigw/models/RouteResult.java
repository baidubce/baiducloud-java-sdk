package com.baidubce.aigw.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteResult {
    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 来源产品标识
     */
    private String srcProduct;

    /**
     * 访问模式：API、Web
     */
    private String accessMode;

    /**
     * API 模式绑定的自定义域名
     */
    private List<String> domains;

    /**
     * Web 模式绑定的公网、内网域名
     */
    private List<String> webDomains;

    /**
     * Web 模式独立子域名
     */
    private String webSubdomain;

    /**
     * Web 模式后端服务路径
     */
    private String servicePath;

    /**
     * 创建时间，格式为 `YYYY-MM-DD HH:mm:ss`
     */
    private String createTime;

    /**
     * 更新时间，格式为 `YYYY-MM-DD HH:mm:ss`
     */
    private String updateTime;

    /**
     * matchRules
     */
    private MatchRule matchRules;

    /**
     * 是否启用多服务
     */
    private Boolean multiService;

    /**
     * 多服务流量分发策略
     */
    private String trafficDistributionStrategy;

    /**
     * 是否启用动态权重调节
     */
    private Boolean enableWeightAdjust;

    /**
     * targetService
     */
    private TargetService targetService;

    /**
     * rewrite
     */
    private Rewrite rewrite;

    /**
     * regexRewrite
     */
    private RegexRewrite regexRewrite;

    /**
     * 自定义请求头
     */
    private List<CustomHeader> customHeaders;

    /**
     * 是否启用消费者认证
     */
    private Boolean authEnabled;

    /**
     * 允许访问的消费者 ID
     */
    private List<String> allowedConsumers;

    /**
     * tokenRateLimit
     */
    private TokenRateLimit tokenRateLimit;

    /**
     * requestRateLimit
     */
    private RequestRateLimit requestRateLimit;

    /**
     * timeoutPolicy
     */
    private TimeoutPolicy timeoutPolicy;

    /**
     * retryPolicy
     */
    private RetryPolicy retryPolicy;

    /**
     * corsPolicy
     */
    private CorsPolicy corsPolicy;

    /**
     * responseHeaders
     */
    private ResponseHeaders responseHeaders;

    /**
     * fallbackConfig
     */
    private FallbackConfig fallbackConfig;

    public RouteResult setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    public String getRouteName() {
        return this.routeName;
    }

    public RouteResult setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getSrcProduct() {
        return this.srcProduct;
    }

    public RouteResult setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    public String getAccessMode() {
        return this.accessMode;
    }

    public RouteResult setDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public RouteResult setWebDomains(List<String> webDomains) {
        this.webDomains = webDomains;
        return this;
    }

    public List<String> getWebDomains() {
        return this.webDomains;
    }

    public RouteResult setWebSubdomain(String webSubdomain) {
        this.webSubdomain = webSubdomain;
        return this;
    }

    public String getWebSubdomain() {
        return this.webSubdomain;
    }

    public RouteResult setServicePath(String servicePath) {
        this.servicePath = servicePath;
        return this;
    }

    public String getServicePath() {
        return this.servicePath;
    }

    public RouteResult setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public RouteResult setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public RouteResult setMatchRules(MatchRule matchRules) {
        this.matchRules = matchRules;
        return this;
    }

    public MatchRule getMatchRules() {
        return this.matchRules;
    }

    public RouteResult setMultiService(Boolean multiService) {
        this.multiService = multiService;
        return this;
    }

    public Boolean getMultiService() {
        return this.multiService;
    }

    public RouteResult setTrafficDistributionStrategy(String trafficDistributionStrategy) {
        this.trafficDistributionStrategy = trafficDistributionStrategy;
        return this;
    }

    public String getTrafficDistributionStrategy() {
        return this.trafficDistributionStrategy;
    }

    public RouteResult setEnableWeightAdjust(Boolean enableWeightAdjust) {
        this.enableWeightAdjust = enableWeightAdjust;
        return this;
    }

    public Boolean getEnableWeightAdjust() {
        return this.enableWeightAdjust;
    }

    public RouteResult setTargetService(TargetService targetService) {
        this.targetService = targetService;
        return this;
    }

    public TargetService getTargetService() {
        return this.targetService;
    }

    public RouteResult setRewrite(Rewrite rewrite) {
        this.rewrite = rewrite;
        return this;
    }

    public Rewrite getRewrite() {
        return this.rewrite;
    }

    public RouteResult setRegexRewrite(RegexRewrite regexRewrite) {
        this.regexRewrite = regexRewrite;
        return this;
    }

    public RegexRewrite getRegexRewrite() {
        return this.regexRewrite;
    }

    public RouteResult setCustomHeaders(List<CustomHeader> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    public List<CustomHeader> getCustomHeaders() {
        return this.customHeaders;
    }

    public RouteResult setAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }

    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }

    public RouteResult setAllowedConsumers(List<String> allowedConsumers) {
        this.allowedConsumers = allowedConsumers;
        return this;
    }

    public List<String> getAllowedConsumers() {
        return this.allowedConsumers;
    }

    public RouteResult setTokenRateLimit(TokenRateLimit tokenRateLimit) {
        this.tokenRateLimit = tokenRateLimit;
        return this;
    }

    public TokenRateLimit getTokenRateLimit() {
        return this.tokenRateLimit;
    }

    public RouteResult setRequestRateLimit(RequestRateLimit requestRateLimit) {
        this.requestRateLimit = requestRateLimit;
        return this;
    }

    public RequestRateLimit getRequestRateLimit() {
        return this.requestRateLimit;
    }

    public RouteResult setTimeoutPolicy(TimeoutPolicy timeoutPolicy) {
        this.timeoutPolicy = timeoutPolicy;
        return this;
    }

    public TimeoutPolicy getTimeoutPolicy() {
        return this.timeoutPolicy;
    }

    public RouteResult setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    public RetryPolicy getRetryPolicy() {
        return this.retryPolicy;
    }

    public RouteResult setCorsPolicy(CorsPolicy corsPolicy) {
        this.corsPolicy = corsPolicy;
        return this;
    }

    public CorsPolicy getCorsPolicy() {
        return this.corsPolicy;
    }

    public RouteResult setResponseHeaders(ResponseHeaders responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }

    public ResponseHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public RouteResult setFallbackConfig(FallbackConfig fallbackConfig) {
        this.fallbackConfig = fallbackConfig;
        return this;
    }

    public FallbackConfig getFallbackConfig() {
        return this.fallbackConfig;
    }

    @Override
    public String toString() {
        return "RouteResult{" + "routeName=" + routeName + "\n" + "srcProduct=" + srcProduct + "\n" + "accessMode=" + accessMode + "\n" + "domains=" + domains + "\n"
                + "webDomains=" + webDomains + "\n" + "webSubdomain=" + webSubdomain + "\n" + "servicePath=" + servicePath + "\n" + "createTime=" + createTime + "\n"
                + "updateTime=" + updateTime + "\n" + "matchRules=" + matchRules + "\n" + "multiService=" + multiService + "\n" + "trafficDistributionStrategy="
                + trafficDistributionStrategy + "\n" + "enableWeightAdjust=" + enableWeightAdjust + "\n" + "targetService=" + targetService + "\n" + "rewrite=" + rewrite + "\n"
                + "regexRewrite=" + regexRewrite + "\n" + "customHeaders=" + customHeaders + "\n" + "authEnabled=" + authEnabled + "\n" + "allowedConsumers=" + allowedConsumers
                + "\n" + "tokenRateLimit=" + tokenRateLimit + "\n" + "requestRateLimit=" + requestRateLimit + "\n" + "timeoutPolicy=" + timeoutPolicy + "\n" + "retryPolicy="
                + retryPolicy + "\n" + "corsPolicy=" + corsPolicy + "\n" + "responseHeaders=" + responseHeaders + "\n" + "fallbackConfig=" + fallbackConfig + "\n" + "}";
    }

}