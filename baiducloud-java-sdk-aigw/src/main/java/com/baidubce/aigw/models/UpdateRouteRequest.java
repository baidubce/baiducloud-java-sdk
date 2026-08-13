package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateRouteRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * routeName
    */
    @JsonIgnore
    private String routeName;

    /**
    * 来源产品标识
    */
    private String srcProduct;

    /**
    * 访问模式，取值为 API 或 Web，默认为 API
    */
    private String accessMode;

    /**
    * Web 模式的独立子域名，accessMode 为 Web 时必需
    */
    private String webSubdomain;

    /**
    * Web 模式的后端服务路径，accessMode 为 Web 时必需，必须以 `/` 开头
    */
    private String servicePath;

    /**
    * API 模式绑定的自定义域名列表；为空时使用实例默认域名
    */
    private List<String> domains;

    /**
    * matchRules
    */
    private MatchRule matchRules;

    /**
    * 是否启用多服务，默认为 false；Web 模式不支持多服务
    */
    private Boolean multiService;

    /**
    * 多服务流量分发策略，取值为 ratio 或 model_name，multiService 为 true 时必需
    */
    private String trafficDistributionStrategy;

    /**
    * 是否启用动态权重调节，仅多服务 ratio 策略生效，默认为 false
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
    * 自定义请求头列表；更新时完全替换原配置
    */
    private List<CustomHeader> customHeaders;

    /**
    * FIXED_IP 或 DNS_DOMAIN 服务是否跳过自动设置 Host 请求头
    */
    private Boolean skipSetHostHeader;

    /**
    * 是否启用消费者认证，默认为 false
    */
    private Boolean authEnabled;

    /**
    * 允许访问的消费者 ID 列表，authEnabled 为 true 时至少传一项
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

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateRouteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getRouteName() {
        return routeName;
    }

    public UpdateRouteRequest setRouteName(String routeName) {
        this.routeName = routeName;
        return this;
    }

    public String getSrcProduct() {
        return srcProduct;
    }

    public UpdateRouteRequest setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getAccessMode() {
        return accessMode;
    }

    public UpdateRouteRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    public String getWebSubdomain() {
        return webSubdomain;
    }

    public UpdateRouteRequest setWebSubdomain(String webSubdomain) {
        this.webSubdomain = webSubdomain;
        return this;
    }

    public String getServicePath() {
        return servicePath;
    }

    public UpdateRouteRequest setServicePath(String servicePath) {
        this.servicePath = servicePath;
        return this;
    }

    public List<String> getDomains() {
        return domains;
    }

    public UpdateRouteRequest setDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public MatchRule getMatchRules() {
        return matchRules;
    }

    public UpdateRouteRequest setMatchRules(MatchRule matchRules) {
        this.matchRules = matchRules;
        return this;
    }

    public Boolean getMultiService() {
        return multiService;
    }

    public UpdateRouteRequest setMultiService(Boolean multiService) {
        this.multiService = multiService;
        return this;
    }

    public String getTrafficDistributionStrategy() {
        return trafficDistributionStrategy;
    }

    public UpdateRouteRequest setTrafficDistributionStrategy(String trafficDistributionStrategy) {
        this.trafficDistributionStrategy = trafficDistributionStrategy;
        return this;
    }

    public Boolean getEnableWeightAdjust() {
        return enableWeightAdjust;
    }

    public UpdateRouteRequest setEnableWeightAdjust(Boolean enableWeightAdjust) {
        this.enableWeightAdjust = enableWeightAdjust;
        return this;
    }

    public TargetService getTargetService() {
        return targetService;
    }

    public UpdateRouteRequest setTargetService(TargetService targetService) {
        this.targetService = targetService;
        return this;
    }

    public Rewrite getRewrite() {
        return rewrite;
    }

    public UpdateRouteRequest setRewrite(Rewrite rewrite) {
        this.rewrite = rewrite;
        return this;
    }

    public RegexRewrite getRegexRewrite() {
        return regexRewrite;
    }

    public UpdateRouteRequest setRegexRewrite(RegexRewrite regexRewrite) {
        this.regexRewrite = regexRewrite;
        return this;
    }

    public List<CustomHeader> getCustomHeaders() {
        return customHeaders;
    }

    public UpdateRouteRequest setCustomHeaders(List<CustomHeader> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    public Boolean getSkipSetHostHeader() {
        return skipSetHostHeader;
    }

    public UpdateRouteRequest setSkipSetHostHeader(Boolean skipSetHostHeader) {
        this.skipSetHostHeader = skipSetHostHeader;
        return this;
    }

    public Boolean getAuthEnabled() {
        return authEnabled;
    }

    public UpdateRouteRequest setAuthEnabled(Boolean authEnabled) {
        this.authEnabled = authEnabled;
        return this;
    }

    public List<String> getAllowedConsumers() {
        return allowedConsumers;
    }

    public UpdateRouteRequest setAllowedConsumers(List<String> allowedConsumers) {
        this.allowedConsumers = allowedConsumers;
        return this;
    }

    public TokenRateLimit getTokenRateLimit() {
        return tokenRateLimit;
    }

    public UpdateRouteRequest setTokenRateLimit(TokenRateLimit tokenRateLimit) {
        this.tokenRateLimit = tokenRateLimit;
        return this;
    }

    public RequestRateLimit getRequestRateLimit() {
        return requestRateLimit;
    }

    public UpdateRouteRequest setRequestRateLimit(RequestRateLimit requestRateLimit) {
        this.requestRateLimit = requestRateLimit;
        return this;
    }

    public TimeoutPolicy getTimeoutPolicy() {
        return timeoutPolicy;
    }

    public UpdateRouteRequest setTimeoutPolicy(TimeoutPolicy timeoutPolicy) {
        this.timeoutPolicy = timeoutPolicy;
        return this;
    }

    public RetryPolicy getRetryPolicy() {
        return retryPolicy;
    }

    public UpdateRouteRequest setRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    public CorsPolicy getCorsPolicy() {
        return corsPolicy;
    }

    public UpdateRouteRequest setCorsPolicy(CorsPolicy corsPolicy) {
        this.corsPolicy = corsPolicy;
        return this;
    }

    public ResponseHeaders getResponseHeaders() {
        return responseHeaders;
    }

    public UpdateRouteRequest setResponseHeaders(ResponseHeaders responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }

    public FallbackConfig getFallbackConfig() {
        return fallbackConfig;
    }

    public UpdateRouteRequest setFallbackConfig(FallbackConfig fallbackConfig) {
        this.fallbackConfig = fallbackConfig;
        return this;
    }

}
