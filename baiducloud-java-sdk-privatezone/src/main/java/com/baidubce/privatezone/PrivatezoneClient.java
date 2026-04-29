package com.baidubce.privatezone;

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

import com.baidubce.privatezone.models.AddParsingRecordsRequest;
import com.baidubce.privatezone.models.AddParsingRecordsResponse;
import com.baidubce.privatezone.models.AssociateVpcRequest;
import com.baidubce.privatezone.models.CreateAPrivateZoneRequest;
import com.baidubce.privatezone.models.CreateAPrivateZoneResponse;
import com.baidubce.privatezone.models.DeleteParsingRecordsRequest;
import com.baidubce.privatezone.models.DeletePrivateZoneRequest;
import com.baidubce.privatezone.models.DisassociateVpcRequest;
import com.baidubce.privatezone.models.ModifyParsingRecordsRequest;
import com.baidubce.privatezone.models.QueryAndParseRecordListRequest;
import com.baidubce.privatezone.models.QueryAndParseRecordListResponse;
import com.baidubce.privatezone.models.QueryTheListOfPrivateZonesRequest;
import com.baidubce.privatezone.models.QueryTheListOfPrivateZonesResponse;
import com.baidubce.privatezone.models.SearchForDetailsOfPrivatzoneRequest;
import com.baidubce.privatezone.models.SearchForDetailsOfPrivatzoneResponse;
import com.baidubce.privatezone.models.SetParsingRecordStatusRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class PrivatezoneClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";

    private static final String CONSTANT_PRIVATEZONE = "privatezone";

    private static final String CONSTANT_RECORD = "record";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public PrivatezoneClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public PrivatezoneClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * addParsingRecords
     * 
     * @param request 入参结构体
     * @return AddParsingRecordsResponse
     */
    public AddParsingRecordsResponse addParsingRecords(AddParsingRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId(), CONSTANT_RECORD);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, AddParsingRecordsResponse.class);
    }

    /**
     * associateVpc
     * 
     * @param request 入参结构体
     */
    public void associateVpc(AssociateVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        internalRequest.addParameter(request.getAction(), null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAPrivateZone
     * 
     * @param request 入参结构体
     * @return CreateAPrivateZoneResponse
     */
    public CreateAPrivateZoneResponse createAPrivateZone(CreateAPrivateZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_PRIVATEZONE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAPrivateZoneResponse.class);
    }

    /**
     * deleteParsingRecords
     * 
     * @param request 入参结构体
     */
    public void deleteParsingRecords(DeleteParsingRecordsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_PRIVATEZONE, CONSTANT_RECORD, request.getRecordId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deletePrivateZone
     * 
     * @param request 入参结构体
     */
    public void deletePrivateZone(DeletePrivateZoneRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.DELETE, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * disassociateVpc
     * 
     * @param request 入参结构体
     */
    public void disassociateVpc(DisassociateVpcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        internalRequest.addParameter(request.getAction(), null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * modifyParsingRecords
     * 
     * @param request 入参结构体
     */
    public void modifyParsingRecords(ModifyParsingRecordsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, CONSTANT_RECORD, request.getRecordId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        fillPayload(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * queryAndParseRecordList
     * 
     * @param request 入参结构体
     * @return QueryAndParseRecordListResponse
     */
    public QueryAndParseRecordListResponse queryAndParseRecordList(QueryAndParseRecordListRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId(), CONSTANT_RECORD);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getRr() != null) {
            internalRequest.addParameter("rr", request.getRr());
        }
        if (request.getSearchMode() != null) {
            internalRequest.addParameter("searchMode", request.getSearchMode());
        }
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        if (request.getValue() != null) {
            internalRequest.addParameter("value", request.getValue());
        }
        return invokeHttpClient(internalRequest, QueryAndParseRecordListResponse.class);
    }

    /**
     * queryTheListOfPrivateZones
     * 
     * @param request 入参结构体
     * @return QueryTheListOfPrivateZonesResponse
     */
    public QueryTheListOfPrivateZonesResponse queryTheListOfPrivateZones(QueryTheListOfPrivateZonesRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_PRIVATEZONE);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, QueryTheListOfPrivateZonesResponse.class);
    }

    /**
     * searchForDetailsOfPrivatzone
     * 
     * @param request 入参结构体
     * @return SearchForDetailsOfPrivatzoneResponse
     */
    public SearchForDetailsOfPrivatzoneResponse searchForDetailsOfPrivatzone(SearchForDetailsOfPrivatzoneRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.GET, VERSION_V1, CONSTANT_PRIVATEZONE, request.getZoneId());
        return invokeHttpClient(internalRequest, SearchForDetailsOfPrivatzoneResponse.class);
    }

    /**
     * setParsingRecordStatus
     * 
     * @param request 入参结构体
     */
    public void setParsingRecordStatus(SetParsingRecordStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(new BaseBceRequest(), HttpMethodName.PUT, VERSION_V1, CONSTANT_PRIVATEZONE, CONSTANT_RECORD, request.getRecordId());
        internalRequest.addParameter(request.getAction(), null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
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
