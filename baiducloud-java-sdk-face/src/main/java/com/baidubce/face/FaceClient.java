package com.baidubce.face;

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
import com.baidubce.common.BaseBceRequest;

import com.baidubce.face.models.FaceDeleteRequest;
import com.baidubce.face.models.FaceDeleteResponse;
import com.baidubce.face.models.FaceDetectRequest;
import com.baidubce.face.models.FaceDetectResponse;
import com.baidubce.face.models.FaceEditAttrRequest;
import com.baidubce.face.models.FaceEditAttrResponse;
import com.baidubce.face.models.FaceGetListRequest;
import com.baidubce.face.models.FaceGetListResponse;
import com.baidubce.face.models.FaceLandmarkRequest;
import com.baidubce.face.models.FaceLandmarkResponse;
import com.baidubce.face.models.FaceMergeRequest;
import com.baidubce.face.models.FaceMergeResponse;
import com.baidubce.face.models.FaceMultiSearchRequest;
import com.baidubce.face.models.FaceMultiSearchResponse;
import com.baidubce.face.models.FacePersonVerifyRequest;
import com.baidubce.face.models.FacePersonVerifyResponse;
import com.baidubce.face.models.FaceSearchRequest;
import com.baidubce.face.models.FaceSearchResponse;
import com.baidubce.face.models.FaceVerifyDateRequest;
import com.baidubce.face.models.FaceVerifyDateResponse;
import com.baidubce.face.models.FaceVerifyResponse;
import com.baidubce.face.models.GroupAddRequest;
import com.baidubce.face.models.GroupAddResponse;
import com.baidubce.face.models.GroupDeleteRequest;
import com.baidubce.face.models.GroupDeleteResponse;
import com.baidubce.face.models.GroupGetListRequest;
import com.baidubce.face.models.GroupGetListResponse;
import com.baidubce.face.models.GroupGetUsersRequest;
import com.baidubce.face.models.GroupGetUsersResponse;
import com.baidubce.face.models.IdMatchDateRequest;
import com.baidubce.face.models.IdMatchDateResponse;
import com.baidubce.face.models.IdMatchStatusRequest;
import com.baidubce.face.models.IdMatchStatusResponse;
import com.baidubce.face.models.PersonIdMatchRequest;
import com.baidubce.face.models.PersonIdMatchResponse;
import com.baidubce.face.models.SessionCodeRequest;
import com.baidubce.face.models.SessionCodeResponse;
import com.baidubce.face.models.UserAddRequest;
import com.baidubce.face.models.UserAddResponse;
import com.baidubce.face.models.UserCopyRequest;
import com.baidubce.face.models.UserCopyResponse;
import com.baidubce.face.models.UserDeleteRequest;
import com.baidubce.face.models.UserDeleteResponse;
import com.baidubce.face.models.UserGetRequest;
import com.baidubce.face.models.UserGetResponse;
import com.baidubce.face.models.UserUpdateRequest;
import com.baidubce.face.models.UserUpdateResponse;
import com.baidubce.face.models.VerifyRequest;
import com.baidubce.face.models.VerifyResponse;

public class FaceClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_REST = "rest";
    private static final String CONSTANT_2_0 = "2.0";
    private static final String CONSTANT_FACE = "face";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_FACELIVENESS = "faceliveness";
    private static final String CONSTANT_SESSIONCODE = "sessioncode";
    private static final String CONSTANT_V3 = "v3";
    private static final String CONSTANT_DETECT = "detect";
    private static final String CONSTANT_FACESET = "faceset";
    private static final String CONSTANT_GROUP = "group";
    private static final String CONSTANT_ADD = "add";
    private static final String CONSTANT_GETLIST = "getlist";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_PERSON = "person";
    private static final String CONSTANT_VERIFY = "verify";
    private static final String CONSTANT_FACEVERIFY = "faceverify";
    private static final String CONSTANT_SEARCH = "search";
    private static final String CONSTANT_LANDMARK = "landmark";
    private static final String CONSTANT_USER = "user";
    private static final String CONSTANT_MULTI_SEARCH = "multi-search";
    private static final String CONSTANT_UPDATE = "update";
    private static final String CONSTANT_GETUSERS = "getusers";
    private static final String CONSTANT_V4 = "v4";
    private static final String CONSTANT_VERIFY_DATE = "verify_date";
    private static final String CONSTANT_IDMATCH_STATUS = "idmatch_status";
    private static final String CONSTANT_GET = "get";
    private static final String CONSTANT_COPY = "copy";
    private static final String CONSTANT_IDMATCH = "idmatch";
    private static final String CONSTANT_IDMATCH_DATE = "idmatch_date";
    private static final String CONSTANT_EDITATTR = "editattr";
    private static final String CONSTANT_MERGE = "merge";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public FaceClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public FaceClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * faceDelete
     * 
     * @param request 入参结构体
     * @return FaceDeleteResponse
     */
    public FaceDeleteResponse faceDelete(FaceDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_FACE, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceDeleteResponse.class);
    }

    /**
     * faceDetect
     * 
     * @param request 入参结构体
     * @return FaceDetectResponse
     */
    public FaceDetectResponse faceDetect(FaceDetectRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_DETECT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceDetectResponse.class);
    }

    /**
     * faceEditAttr
     * 
     * @param request 入参结构体
     * @return FaceEditAttrResponse
     */
    public FaceEditAttrResponse faceEditAttr(FaceEditAttrRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V1, CONSTANT_EDITATTR);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceEditAttrResponse.class);
    }

    /**
     * faceGetList
     * 
     * @param request 入参结构体
     * @return FaceGetListResponse
     */
    public FaceGetListResponse faceGetList(FaceGetListRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_FACE, CONSTANT_GETLIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceGetListResponse.class);
    }

    /**
     * faceLandmark
     * 
     * @param request 入参结构体
     * @return FaceLandmarkResponse
     */
    public FaceLandmarkResponse faceLandmark(FaceLandmarkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V1, CONSTANT_LANDMARK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceLandmarkResponse.class);
    }

    /**
     * faceMerge
     * 
     * @param request 入参结构体
     * @return FaceMergeResponse
     */
    public FaceMergeResponse faceMerge(FaceMergeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V1, CONSTANT_MERGE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceMergeResponse.class);
    }

    /**
     * faceMultiSearch
     * 
     * @param request 入参结构体
     * @return FaceMultiSearchResponse
     */
    public FaceMultiSearchResponse faceMultiSearch(FaceMultiSearchRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_MULTI_SEARCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceMultiSearchResponse.class);
    }

    /**
     * facePersonVerify
     * 
     * @param request 入参结构体
     * @return FacePersonVerifyResponse
     */
    public FacePersonVerifyResponse facePersonVerify(FacePersonVerifyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_PERSON, CONSTANT_VERIFY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FacePersonVerifyResponse.class);
    }

    /**
     * faceSearch
     * 
     * @param request 入参结构体
     * @return FaceSearchResponse
     */
    public FaceSearchResponse faceSearch(FaceSearchRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_SEARCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceSearchResponse.class);
    }

    /**
     * faceVerify
     * 
     * @return FaceVerifyResponse
     */
    public FaceVerifyResponse faceVerify() {
        InternalRequest internalRequest =
                this.createRequest(new BaseBceRequest(), HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACEVERIFY);
        return invokeHttpClient(internalRequest, FaceVerifyResponse.class);
    }

    /**
     * faceVerifyDate
     * 
     * @param request 入参结构体
     * @return FaceVerifyDateResponse
     */
    public FaceVerifyDateResponse faceVerifyDate(FaceVerifyDateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V4, CONSTANT_VERIFY_DATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, FaceVerifyDateResponse.class);
    }

    /**
     * groupAdd
     * 
     * @param request 入参结构体
     * @return GroupAddResponse
     */
    public GroupAddResponse groupAdd(GroupAddRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_GROUP, CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GroupAddResponse.class);
    }

    /**
     * groupDelete
     * 
     * @param request 入参结构体
     * @return GroupDeleteResponse
     */
    public GroupDeleteResponse groupDelete(GroupDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_GROUP, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GroupDeleteResponse.class);
    }

    /**
     * groupGetList
     * 
     * @param request 入参结构体
     * @return GroupGetListResponse
     */
    public GroupGetListResponse groupGetList(GroupGetListRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_GROUP, CONSTANT_GETLIST);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GroupGetListResponse.class);
    }

    /**
     * groupGetUsers
     * 
     * @param request 入参结构体
     * @return GroupGetUsersResponse
     */
    public GroupGetUsersResponse groupGetUsers(GroupGetUsersRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_GROUP, CONSTANT_GETUSERS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, GroupGetUsersResponse.class);
    }

    /**
     * idMatchDate
     * 
     * @param request 入参结构体
     * @return IdMatchDateResponse
     */
    public IdMatchDateResponse idMatchDate(IdMatchDateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V4, CONSTANT_IDMATCH_DATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, IdMatchDateResponse.class);
    }

    /**
     * idMatchStatus
     * 
     * @param request 入参结构体
     * @return IdMatchStatusResponse
     */
    public IdMatchStatusResponse idMatchStatus(IdMatchStatusRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V4, CONSTANT_IDMATCH_STATUS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, IdMatchStatusResponse.class);
    }

    /**
     * personIdMatch
     * 
     * @param request 入参结构体
     * @return PersonIdMatchResponse
     */
    public PersonIdMatchResponse personIdMatch(PersonIdMatchRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_PERSON, CONSTANT_IDMATCH);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PersonIdMatchResponse.class);
    }

    /**
     * sessionCode
     * 
     * @param request 入参结构体
     * @return SessionCodeResponse
     */
    public SessionCodeResponse sessionCode(SessionCodeRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V1, CONSTANT_FACELIVENESS, CONSTANT_SESSIONCODE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SessionCodeResponse.class);
    }

    /**
     * userAdd
     * 
     * @param request 入参结构体
     * @return UserAddResponse
     */
    public UserAddResponse userAdd(UserAddRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_USER, CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UserAddResponse.class);
    }

    /**
     * userCopy
     * 
     * @param request 入参结构体
     * @return UserCopyResponse
     */
    public UserCopyResponse userCopy(UserCopyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_USER, CONSTANT_COPY);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UserCopyResponse.class);
    }

    /**
     * userDelete
     * 
     * @param request 入参结构体
     * @return UserDeleteResponse
     */
    public UserDeleteResponse userDelete(UserDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_USER, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UserDeleteResponse.class);
    }

    /**
     * userGet
     * 
     * @param request 入参结构体
     * @return UserGetResponse
     */
    public UserGetResponse userGet(UserGetRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_USER, CONSTANT_GET);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UserGetResponse.class);
    }

    /**
     * userUpdate
     * 
     * @param request 入参结构体
     * @return UserUpdateResponse
     */
    public UserUpdateResponse userUpdate(UserUpdateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V3, CONSTANT_FACESET, CONSTANT_USER, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, UserUpdateResponse.class);
    }

    /**
     * verify
     * 
     * @param request 入参结构体
     * @return VerifyResponse
     */
    public VerifyResponse verify(VerifyRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_FACE, CONSTANT_V1, CONSTANT_FACELIVENESS, CONSTANT_VERIFY);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VerifyResponse.class);
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
