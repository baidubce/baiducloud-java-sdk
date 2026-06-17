package com.baidubce.sts;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.auth.SignOptions;
import com.baidubce.util.RequestBodyUtils;
import java.util.Arrays;
import java.util.HashSet;

import com.baidubce.sts.models.AssumeRoleRequest;
import com.baidubce.sts.models.AssumeRoleResponse;
import com.baidubce.sts.models.GetSessionTokenRequest;
import com.baidubce.sts.models.GetSessionTokenResponse;

public class StsClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_SESSION_TOKEN = "sessionToken";
    private static final String CONSTANT_CREDENTIAL = "credential";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public StsClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public StsClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * assumeRole
     * 
     * @param request 入参结构体
     * @return AssumeRoleResponse
     */
    public AssumeRoleResponse assumeRole(AssumeRoleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_CREDENTIAL);
        internalRequest.addParameter("assumeRole", null);
        if (request.getAccountId() != null) {
            internalRequest.addParameter("accountId", request.getAccountId());
        }
        if (request.getRoleName() != null) {
            internalRequest.addParameter("roleName", request.getRoleName());
        }
        if (request.getDurationSeconds() != null) {
            internalRequest.addParameter("durationSeconds", request.getDurationSeconds());
        }
        if (request.getUserId() != null) {
            internalRequest.addParameter("userId", request.getUserId());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AssumeRoleResponse.class);
    }

    /**
     * getSessionToken
     * 
     * @param request 入参结构体
     * @return GetSessionTokenResponse
     */
    public GetSessionTokenResponse getSessionToken(GetSessionTokenRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SESSION_TOKEN);
        if (request.getDurationSeconds() != null) {
            internalRequest.addParameter("durationSeconds", request.getDurationSeconds());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GetSessionTokenResponse.class);
    }

    /**
    * Creates and initializes a new request object for the specified resource.
    *
    * @param bceRequest    The original BCE request created by the user.
    * @param httpMethod    The HTTP method to use when sending the request.
    * @param pathVariables The optional variables used in the URI path.
    * @return A new request object populated with endpoint, resource path and specific
    *         parameters to send.
    */
    protected InternalRequest createRequest(AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
        return super.createRequest(bceRequest, httpMethod, createSignOptions(), pathVariables);
    }

    /**
    * 创建签名选项
    *
    * @return 配置了服务所需签名头的 SignOptions
    */
    private SignOptions createSignOptions() {
        SignOptions signOptions = new SignOptions();
        signOptions.setHeadersToSign(new HashSet<String>(Arrays.asList(HEADERS_TO_SIGN)));
        return signOptions;
    }
}
