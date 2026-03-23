package com.baidubce.blb;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.util.HttpUtils;
import java.net.URI;
import com.baidubce.util.JsonUtils;
import java.io.UnsupportedEncodingException;
import com.baidubce.BceClientException;
import com.baidubce.auth.SignOptions;
import com.baidubce.http.Headers;
import com.baidubce.internal.RestartableInputStream;
import com.baidubce.common.BaseBceRequest;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.blb.models.BillingChangeCancelToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbResponse;
import com.baidubce.blb.models.BillingChangePreToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePreToPostBlbResponse;
import com.baidubce.blb.models.BlbInquiryRequest;
import com.baidubce.blb.models.BlbInquiryResponse;
import com.baidubce.blb.models.RefundBlbRequest;
import com.baidubce.blb.models.ResizeBlbRequest;
import com.baidubce.blb.models.ResizeBlbResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class BlbClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";

    private static final String CONSTANT_BLB = "blb";

    private static final String CONSTANT_CHARGE = "charge";

    private static final String CONSTANT_PRICE = "price";

    private static final String CONSTANT_REFUND = "refund";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public BlbClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public BlbClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * billingChangeCancelToPostBlb
     * 
     * @param request 入参结构体
     */
    public void billingChangeCancelToPostBlb(BillingChangeCancelToPostBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_CHARGE);
        internalRequest.addParameter("action", "CANCEL_TO_POSTPAY");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * billingChangePostToPreBlb
     * 
     * @param request 入参结构体
     * @return BillingChangePostToPreBlbResponse
     */
    public BillingChangePostToPreBlbResponse billingChangePostToPreBlb(BillingChangePostToPreBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_CHARGE);
        internalRequest.addParameter("action", "TO_PREPAY");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, BillingChangePostToPreBlbResponse.class);
    }

    /**
     * billingChangePreToPostBlb
     * 
     * @param request 入参结构体
     * @return BillingChangePreToPostBlbResponse
     */
    public BillingChangePreToPostBlbResponse billingChangePreToPostBlb(BillingChangePreToPostBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_CHARGE);
        internalRequest.addParameter("action", "TO_POSTPAY");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, BillingChangePreToPostBlbResponse.class);
    }

    /**
     * blbInquiry
     *
     * @param request 入参结构体
     * @return BlbInquiryResponse
     */
    public BlbInquiryResponse blbInquiry(BlbInquiryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, CONSTANT_PRICE);
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, BlbInquiryResponse.class);
    }

    /**
     * refundBlb
     * 
     * @param request 入参结构体
     */
    public void refundBlb(RefundBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, CONSTANT_REFUND, request.getBlbId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * resizeBlb
     * 
     * @param request 入参结构体
     * @return ResizeBlbResponse
     */
    public ResizeBlbResponse resizeBlb(ResizeBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId());
        internalRequest.addParameter("action", "RESIZE");
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, ResizeBlbResponse.class);
    }

    /**
    * Creates and initializes a new request object for the specified resource.
    *
    * @param bceRequest The original BCE request created by the user.
    * @param httpMethod The HTTP method to use when sending the request.
    * @param pathVariables The optional variables used in the URI path.
    * @return A new request object populated with endpoint, resource path and specific
    *         parameters to send.
    */
    private InternalRequest createRequest(AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
        List<String> path = new ArrayList<String>();
        if (pathVariables != null) {
            for (String pathVariable : pathVariables) {
                path.add(pathVariable);
            }
        }
        URI uri = HttpUtils.appendUri(this.getEndpoint(), path.toArray(new String[path.size()]));
        InternalRequest request = new InternalRequest(httpMethod, uri);
        SignOptions signOptions = new SignOptions();
        signOptions.setHeadersToSign(new HashSet<String>(Arrays.asList(HEADERS_TO_SIGN)));
        request.setSignOptions(signOptions);
        request.setCredentials(bceRequest.getRequestCredentials());
        return request;
    }

    /**
    * the method to fill the internalRequest's content field with bceRequest
    * only support HttpMethodName.POST or HttpMethodName.PUT
    *
    * @param internalRequest A request object, populated with endpoint, resource path, ready for callers to populate
    * any additional headers or parameters, and execute.
    * @param bceRequest The original request, as created by the user.
    */
    protected void fillPayload(InternalRequest internalRequest, AbstractBceRequest bceRequest) {
        if (internalRequest.getHttpMethod() == HttpMethodName.POST || internalRequest.getHttpMethod() == HttpMethodName.PUT) {
            String strJson = JsonUtils.toJsonString(bceRequest);
            byte[] requestJson = null;
            try {
                requestJson = strJson.getBytes(DEFAULT_ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new BceClientException("Unsupported encode.", e);
            }
            internalRequest.addHeader(Headers.CONTENT_LENGTH, String.valueOf(requestJson.length));
            internalRequest.addHeader(Headers.CONTENT_TYPE, DEFAULT_CONTENT_TYPE);
            internalRequest.setContent(RestartableInputStream.wrap(requestJson));
        }
    }
}
