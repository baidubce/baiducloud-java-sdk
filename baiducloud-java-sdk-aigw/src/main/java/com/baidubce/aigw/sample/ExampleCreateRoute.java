package com.baidubce.aigw.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.aigw.AigwClient;
import com.baidubce.aigw.models.CreateRouteRequest;
import com.baidubce.aigw.models.MatchRule;
import com.baidubce.aigw.models.TokenRateLimit;
import com.baidubce.aigw.models.PathRule;
import com.baidubce.aigw.models.ResponseHeaders;
import com.baidubce.aigw.models.CreateRouteResponse;
import com.baidubce.aigw.models.RegexRewrite;
import com.baidubce.aigw.models.TargetService;
import com.baidubce.aigw.models.FallbackConfig;
import com.baidubce.aigw.models.Rewrite;
import com.baidubce.aigw.models.CorsPolicy;
import com.baidubce.aigw.models.RequestRateLimit;
import com.baidubce.aigw.models.TimeoutPolicy;
import com.baidubce.aigw.models.RetryPolicy;
import java.util.ArrayList;

public class ExampleCreateRoute {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        AigwClient client = new AigwClient(bceClientConfig);
        MatchRule matchRules = new MatchRule();
        PathRule pathRule = new PathRule();
        pathRule.setMatchType("");
        pathRule.setValue("");
        pathRule.setCaseSensitive(false);

        matchRules.setPathRule(pathRule);
        matchRules.setMethods(new ArrayList<>());
        matchRules.setHeaders(new ArrayList<>());
        matchRules.setQueryParams(new ArrayList<>());

        TargetService targetService = new TargetService();
        targetService.setServiceSource("");
        targetService.setServiceName("");
        targetService.setNamespace("");
        targetService.setServicePort(0);
        targetService.setLoadBalanceAlgorithm("");
        targetService.setHashType("");
        targetService.setHashKey("");
        targetService.setRequestRatio(0);
        targetService.setModelName("");
        targetService.setWeightFactor(0);
        targetService.setModelNameMode("");
        targetService.setSpecifiedModelName("");

        Rewrite rewrite = new Rewrite();
        rewrite.setEnabled(false);
        rewrite.setPath("");

        RegexRewrite regexRewrite = new RegexRewrite();
        regexRewrite.setMatch("");
        regexRewrite.setRewrite("");

        TokenRateLimit tokenRateLimit = new TokenRateLimit();
        tokenRateLimit.setRuleName("");
        tokenRateLimit.setEnabled(false);
        tokenRateLimit.setPreReserveRemainingRatio(0.0f);
        tokenRateLimit.setPreReserveHistoryWindowSeconds(0);
        tokenRateLimit.setPreReserveSafetyFactor(0.0f);
        tokenRateLimit.setPreReserveEstimationMode("");
        tokenRateLimit.setPreReserveInitialTokens(java.util.Collections.singletonMap("key", 0));
        tokenRateLimit.setSlidingWindowBucketCount(0);
        tokenRateLimit.setPreReserveAdmissionMode("");
        tokenRateLimit.setPreReserveAdmissionBurstSeconds(0);
        tokenRateLimit.setPreReserveRetryJitterMs(0);
        tokenRateLimit.setRuleItems(new ArrayList<>());

        RequestRateLimit requestRateLimit = new RequestRateLimit();
        requestRateLimit.setRuleName("");
        requestRateLimit.setEnabled(false);
        requestRateLimit.setRuleItems(new ArrayList<>());

        TimeoutPolicy timeoutPolicy = new TimeoutPolicy();
        timeoutPolicy.setEnabled(false);
        timeoutPolicy.setTimeout(0);

        RetryPolicy retryPolicy = new RetryPolicy();
        retryPolicy.setEnabled(false);
        retryPolicy.setRetryConditions("");
        retryPolicy.setNumRetries(0);

        CorsPolicy corsPolicy = new CorsPolicy();
        corsPolicy.setEnabled(false);
        corsPolicy.setAllowOrigins(new ArrayList<>());
        corsPolicy.setAllowMethods(new ArrayList<>());
        corsPolicy.setAllowHeaders(new ArrayList<>());
        corsPolicy.setExposeHeaders(new ArrayList<>());
        corsPolicy.setMaxAge(0);
        corsPolicy.setAllowCredentials(false);

        ResponseHeaders responseHeaders = new ResponseHeaders();
        responseHeaders.setEnabled(false);
        responseHeaders.setHeaders(new ArrayList<>());

        FallbackConfig fallbackConfig = new FallbackConfig();
        fallbackConfig.setEnabled(false);
        fallbackConfig.setServiceName("");
        fallbackConfig.setModelNameMode("");
        fallbackConfig.setSpecifiedModelName("");

        CreateRouteRequest createRouteRequest = new CreateRouteRequest();
        createRouteRequest.setInstanceId("");
        createRouteRequest.setClusterId("");
        createRouteRequest.setXRegion("");
        createRouteRequest.setRouteName("");
        createRouteRequest.setSrcProduct("");
        createRouteRequest.setAccessMode("");
        createRouteRequest.setWebSubdomain("");
        createRouteRequest.setServicePath("");
        createRouteRequest.setDomains(new ArrayList<>());
        createRouteRequest.setMatchRules(matchRules);
        createRouteRequest.setMultiService(false);
        createRouteRequest.setTrafficDistributionStrategy("");
        createRouteRequest.setEnableWeightAdjust(false);
        createRouteRequest.setTargetService(targetService);
        createRouteRequest.setRewrite(rewrite);
        createRouteRequest.setRegexRewrite(regexRewrite);
        createRouteRequest.setCustomHeaders(new ArrayList<>());
        createRouteRequest.setSkipSetHostHeader(false);
        createRouteRequest.setAuthEnabled(false);
        createRouteRequest.setAllowedConsumers(new ArrayList<>());
        createRouteRequest.setTokenRateLimit(tokenRateLimit);
        createRouteRequest.setRequestRateLimit(requestRateLimit);
        createRouteRequest.setTimeoutPolicy(timeoutPolicy);
        createRouteRequest.setRetryPolicy(retryPolicy);
        createRouteRequest.setCorsPolicy(corsPolicy);
        createRouteRequest.setResponseHeaders(responseHeaders);
        createRouteRequest.setFallbackConfig(fallbackConfig);
        try {
            CreateRouteResponse response = client.createRoute(createRouteRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
