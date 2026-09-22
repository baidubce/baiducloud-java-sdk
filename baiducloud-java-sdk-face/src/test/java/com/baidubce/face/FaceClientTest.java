package com.baidubce.face;

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
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.BceApiKeyCredentials;

/**
 * API tests for FaceClient
 */
public class FaceClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private static final String API_KEY = "";
    private static final String SECRET_KEY = "";
    private FaceClient faceClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        // config.setCredentials(new DefaultBceCredentials(AK, SK));

        // ==== AccessToken 鉴权（API Key / Secret Key 换取 AccessToken）====
        // config.setCredentials(new BceAccessTokenCredentials(API_KEY, SECRET_KEY));

        // ==== API Key 鉴权 ====
        config.setCredentials(new BceApiKeyCredentials(API_KEY));

        faceClient = new FaceClient(config);
    }

    /**
     * faceDelete
     *
     */
    @Test
    public void faceDeleteTest() {
        FaceDeleteRequest faceDeleteRequest = new FaceDeleteRequest();
        faceDeleteRequest.setUserId("");
        faceDeleteRequest.setGroupId("");
        faceDeleteRequest.setFaceToken("");
        faceDeleteRequest.setLogId(0L);
        FaceDeleteResponse response = faceClient.faceDelete(faceDeleteRequest);
        System.out.println(response);
    }
    /**
     * faceDetect
     *
     */
    @Test
    public void faceDetectTest() {
        FaceDetectRequest faceDetectRequest = new FaceDetectRequest();
        faceDetectRequest.setImage("");
        faceDetectRequest.setImageType("");
        faceDetectRequest.setFaceField("");
        faceDetectRequest.setMaxFaceNum(0);
        faceDetectRequest.setFaceType("");
        faceDetectRequest.setLivenessControl("");
        faceDetectRequest.setFaceSortType(0);
        faceDetectRequest.setDisplayCorpImage(0);
        FaceDetectResponse response = faceClient.faceDetect(faceDetectRequest);
        System.out.println(response);
    }
    /**
     * faceEditAttr
     *
     */
    @Test
    public void faceEditAttrTest() {
        FaceEditAttrRequest faceEditAttrRequest = new FaceEditAttrRequest();
        faceEditAttrRequest.setImage("");
        faceEditAttrRequest.setImageType("");
        faceEditAttrRequest.setActionType("");
        faceEditAttrRequest.setTarget(0);
        faceEditAttrRequest.setQualityControl("");
        faceEditAttrRequest.setFaceLocation("");
        FaceEditAttrResponse response = faceClient.faceEditAttr(faceEditAttrRequest);
        System.out.println(response);
    }
    /**
     * faceGetList
     *
     */
    @Test
    public void faceGetListTest() {
        FaceGetListRequest faceGetListRequest = new FaceGetListRequest();
        faceGetListRequest.setUserId("");
        faceGetListRequest.setGroupId("");
        FaceGetListResponse response = faceClient.faceGetList(faceGetListRequest);
        System.out.println(response);
    }
    /**
     * faceLandmark
     *
     */
    @Test
    public void faceLandmarkTest() {
        FaceLandmarkRequest faceLandmarkRequest = new FaceLandmarkRequest();
        faceLandmarkRequest.setImage("");
        faceLandmarkRequest.setImageType("");
        faceLandmarkRequest.setMaxFaceNum(0);
        faceLandmarkRequest.setFaceField("");
        FaceLandmarkResponse response = faceClient.faceLandmark(faceLandmarkRequest);
        System.out.println(response);
    }
    /**
     * faceMerge
     *
     */
    @Test
    public void faceMergeTest() {
        FaceMergeRequest faceMergeRequest = new FaceMergeRequest();
        faceMergeRequest.setVersion("");
        faceMergeRequest.setAlpha(0.0f);
        faceMergeRequest.setImageTemplate("");
        faceMergeRequest.setImageTarget("");
        faceMergeRequest.setMergeDegree("");
        faceMergeRequest.setPosition(0);
        faceMergeRequest.setLanguage(0);
        FaceMergeResponse response = faceClient.faceMerge(faceMergeRequest);
        System.out.println(response);
    }
    /**
     * faceMultiSearch
     *
     */
    @Test
    public void faceMultiSearchTest() {
        FaceMultiSearchRequest faceMultiSearchRequest = new FaceMultiSearchRequest();
        faceMultiSearchRequest.setImage("");
        faceMultiSearchRequest.setImageType("");
        faceMultiSearchRequest.setGroupIdList("");
        faceMultiSearchRequest.setMaxFaceNum(0);
        faceMultiSearchRequest.setMatchThreshold(0);
        faceMultiSearchRequest.setQualityControl("");
        faceMultiSearchRequest.setLivenessControl("");
        faceMultiSearchRequest.setSpoofingControl("");
        faceMultiSearchRequest.setMaxUserNum(0);
        FaceMultiSearchResponse response = faceClient.faceMultiSearch(faceMultiSearchRequest);
        System.out.println(response);
    }
    /**
     * facePersonVerify
     *
     */
    @Test
    public void facePersonVerifyTest() {
        FacePersonVerifyRequest facePersonVerifyRequest = new FacePersonVerifyRequest();
        facePersonVerifyRequest.setImage("");
        facePersonVerifyRequest.setImageType("");
        facePersonVerifyRequest.setIdCardNumber("");
        facePersonVerifyRequest.setName("");
        facePersonVerifyRequest.setQualityControl("");
        facePersonVerifyRequest.setLivenessControl("");
        facePersonVerifyRequest.setSpoofingControl("");
        FacePersonVerifyResponse response = faceClient.facePersonVerify(facePersonVerifyRequest);
        System.out.println(response);
    }
    /**
     * faceSearch
     *
     */
    @Test
    public void faceSearchTest() {
        FaceSearchRequest faceSearchRequest = new FaceSearchRequest();
        faceSearchRequest.setImage("");
        faceSearchRequest.setImageType("");
        faceSearchRequest.setGroupIdList("");
        faceSearchRequest.setQualityControl("");
        faceSearchRequest.setLivenessControl("");
        faceSearchRequest.setSpoofingControl("");
        faceSearchRequest.setUserId("");
        faceSearchRequest.setMaxUserNum(0);
        faceSearchRequest.setFaceSortType(0);
        faceSearchRequest.setMatchThreshold(0);
        FaceSearchResponse response = faceClient.faceSearch(faceSearchRequest);
        System.out.println(response);
    }
    /**
     * faceVerify
     *
     */
    @Test
    public void faceVerifyTest() {
        FaceVerifyResponse response = faceClient.faceVerify();
        System.out.println(response);
    }
    /**
     * faceVerifyDate
     *
     */
    @Test
    public void faceVerifyDateTest() {
        FaceVerifyDateRequest faceVerifyDateRequest = new FaceVerifyDateRequest();
        faceVerifyDateRequest.setName("");
        faceVerifyDateRequest.setIdCardNumber("");
        faceVerifyDateRequest.setStartDate("");
        faceVerifyDateRequest.setEndDate("");
        faceVerifyDateRequest.setImage("");
        faceVerifyDateRequest.setImageType("");
        faceVerifyDateRequest.setLivenessControl("");
        faceVerifyDateRequest.setSpoofingControl("");
        faceVerifyDateRequest.setQualityControl("");
        FaceVerifyDateResponse response = faceClient.faceVerifyDate(faceVerifyDateRequest);
        System.out.println(response);
    }
    /**
     * groupAdd
     *
     */
    @Test
    public void groupAddTest() {
        GroupAddRequest groupAddRequest = new GroupAddRequest();
        groupAddRequest.setGroupId("");
        GroupAddResponse response = faceClient.groupAdd(groupAddRequest);
        System.out.println(response);
    }
    /**
     * groupDelete
     *
     */
    @Test
    public void groupDeleteTest() {
        GroupDeleteRequest groupDeleteRequest = new GroupDeleteRequest();
        groupDeleteRequest.setGroupId("");
        GroupDeleteResponse response = faceClient.groupDelete(groupDeleteRequest);
        System.out.println(response);
    }
    /**
     * groupGetList
     *
     */
    @Test
    public void groupGetListTest() {
        GroupGetListRequest groupGetListRequest = new GroupGetListRequest();
        groupGetListRequest.setStart(0);
        groupGetListRequest.setLength(0);
        GroupGetListResponse response = faceClient.groupGetList(groupGetListRequest);
        System.out.println(response);
    }
    /**
     * groupGetUsers
     *
     */
    @Test
    public void groupGetUsersTest() {
        GroupGetUsersRequest groupGetUsersRequest = new GroupGetUsersRequest();
        groupGetUsersRequest.setGroupId("");
        groupGetUsersRequest.setStart(0);
        groupGetUsersRequest.setLength(0);
        GroupGetUsersResponse response = faceClient.groupGetUsers(groupGetUsersRequest);
        System.out.println(response);
    }
    /**
     * idMatchDate
     *
     */
    @Test
    public void idMatchDateTest() {
        IdMatchDateRequest idMatchDateRequest = new IdMatchDateRequest();
        idMatchDateRequest.setName("");
        idMatchDateRequest.setIdCardNumber("");
        idMatchDateRequest.setStartDate("");
        idMatchDateRequest.setEndDate("");
        IdMatchDateResponse response = faceClient.idMatchDate(idMatchDateRequest);
        System.out.println(response);
    }
    /**
     * idMatchStatus
     *
     */
    @Test
    public void idMatchStatusTest() {
        IdMatchStatusRequest idMatchStatusRequest = new IdMatchStatusRequest();
        idMatchStatusRequest.setName("");
        idMatchStatusRequest.setIdCardNumber("");
        idMatchStatusRequest.setStartDate("");
        idMatchStatusRequest.setEndDate("");
        IdMatchStatusResponse response = faceClient.idMatchStatus(idMatchStatusRequest);
        System.out.println(response);
    }
    /**
     * personIdMatch
     *
     */
    @Test
    public void personIdMatchTest() {
        PersonIdMatchRequest personIdMatchRequest = new PersonIdMatchRequest();
        personIdMatchRequest.setIdCardNumber("");
        personIdMatchRequest.setName("");
        PersonIdMatchResponse response = faceClient.personIdMatch(personIdMatchRequest);
        System.out.println(response);
    }
    /**
     * sessionCode
     *
     */
    @Test
    public void sessionCodeTest() {
        SessionCodeRequest sessionCodeRequest = new SessionCodeRequest();
        sessionCodeRequest.setType("");
        sessionCodeRequest.setMinCodeLength("");
        sessionCodeRequest.setMaxCodeLength("");
        SessionCodeResponse response = faceClient.sessionCode(sessionCodeRequest);
        System.out.println(response);
    }
    /**
     * userAdd
     *
     */
    @Test
    public void userAddTest() {
        UserAddRequest userAddRequest = new UserAddRequest();
        userAddRequest.setImage("");
        userAddRequest.setImageType("");
        userAddRequest.setGroupId("");
        userAddRequest.setUserId("");
        userAddRequest.setUserInfo("");
        userAddRequest.setQualityControl("");
        userAddRequest.setLivenessControl("");
        userAddRequest.setSpoofingControl("");
        userAddRequest.setActionType("");
        userAddRequest.setFaceSortType(0);
        UserAddResponse response = faceClient.userAdd(userAddRequest);
        System.out.println(response);
    }
    /**
     * userCopy
     *
     */
    @Test
    public void userCopyTest() {
        UserCopyRequest userCopyRequest = new UserCopyRequest();
        userCopyRequest.setUserId("");
        userCopyRequest.setSrcGroupId("");
        userCopyRequest.setDstGroupId("");
        UserCopyResponse response = faceClient.userCopy(userCopyRequest);
        System.out.println(response);
    }
    /**
     * userDelete
     *
     */
    @Test
    public void userDeleteTest() {
        UserDeleteRequest userDeleteRequest = new UserDeleteRequest();
        userDeleteRequest.setGroupId("");
        userDeleteRequest.setUserId("");
        UserDeleteResponse response = faceClient.userDelete(userDeleteRequest);
        System.out.println(response);
    }
    /**
     * userGet
     *
     */
    @Test
    public void userGetTest() {
        UserGetRequest userGetRequest = new UserGetRequest();
        userGetRequest.setUserId("");
        userGetRequest.setGroupId("");
        UserGetResponse response = faceClient.userGet(userGetRequest);
        System.out.println(response);
    }
    /**
     * userUpdate
     *
     */
    @Test
    public void userUpdateTest() {
        UserUpdateRequest userUpdateRequest = new UserUpdateRequest();
        userUpdateRequest.setImage("");
        userUpdateRequest.setImageType("");
        userUpdateRequest.setGroupId("");
        userUpdateRequest.setUserId("");
        userUpdateRequest.setUserInfo("");
        userUpdateRequest.setQualityControl("");
        userUpdateRequest.setLivenessControl("");
        userUpdateRequest.setSpoofingControl("");
        userUpdateRequest.setActionType("");
        UserUpdateResponse response = faceClient.userUpdate(userUpdateRequest);
        System.out.println(response);
    }
    /**
     * verify
     *
     */
    @Test
    public void verifyTest() {
        VerifyRequest verifyRequest = new VerifyRequest();
        verifyRequest.setVideoBase64("");
        verifyRequest.setTypeIdentify("");
        verifyRequest.setSessionId("");
        verifyRequest.setLipIdentify("");
        verifyRequest.setFaceField("");
        VerifyResponse response = faceClient.verify(verifyRequest);
        System.out.println(response);
    }
}
