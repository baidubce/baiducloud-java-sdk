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
import com.baidubce.auth.SignOptions;
import com.baidubce.util.RequestBodyUtils;
import java.util.Arrays;
import java.util.HashSet;
import com.baidubce.common.BaseBceResponse;

import com.baidubce.blb.models.AddAppBlbServerGroupRsRequest;
import com.baidubce.blb.models.AddBlbServerRequest;
import com.baidubce.blb.models.AddServiceAuthRequest;
import com.baidubce.blb.models.BillingChangeCancelToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbResponse;
import com.baidubce.blb.models.BillingChangePreToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePreToPostBlbResponse;
import com.baidubce.blb.models.BindBlbEnterpriseSecurityGroupRequest;
import com.baidubce.blb.models.BindBlbSecurityGroupRequest;
import com.baidubce.blb.models.BindInstanceToServiceRequest;
import com.baidubce.blb.models.BlbInquiryRequest;
import com.baidubce.blb.models.BlbInquiryResponse;
import com.baidubce.blb.models.CreateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.CreateAppBlbHttpsListenerRequest;
import com.baidubce.blb.models.CreateAppBlbIpGroupMemberRequest;
import com.baidubce.blb.models.CreateAppBlbIpGroupProtocolRequest;
import com.baidubce.blb.models.CreateAppBlbIpGroupRequest;
import com.baidubce.blb.models.CreateAppBlbIpGroupResponse;
import com.baidubce.blb.models.CreateAppBlbPolicyRequest;
import com.baidubce.blb.models.CreateAppBlbRequest;
import com.baidubce.blb.models.CreateAppBlbResponse;
import com.baidubce.blb.models.CreateAppBlbServerGroupPortRequest;
import com.baidubce.blb.models.CreateAppBlbServerGroupPortResponse;
import com.baidubce.blb.models.CreateAppBlbServerGroupRequest;
import com.baidubce.blb.models.CreateAppBlbServerGroupResponse;
import com.baidubce.blb.models.CreateAppBlbSslListenerRequest;
import com.baidubce.blb.models.CreateAppBlbTcpListenerRequest;
import com.baidubce.blb.models.CreateAppBlbUdpListenerRequest;
import com.baidubce.blb.models.CreateBlbHttpListenerRequest;
import com.baidubce.blb.models.CreateBlbHttpsListenerRequest;
import com.baidubce.blb.models.CreateBlbRequest;
import com.baidubce.blb.models.CreateBlbResponse;
import com.baidubce.blb.models.CreateBlbSslListenerRequest;
import com.baidubce.blb.models.CreateBlbTcpListenerRequest;
import com.baidubce.blb.models.CreateBlbUdpListenerRequest;
import com.baidubce.blb.models.CreateLbdcRequest;
import com.baidubce.blb.models.CreateLbdcResponse;
import com.baidubce.blb.models.CreateServiceRequest;
import com.baidubce.blb.models.CreateServiceResponse;
import com.baidubce.blb.models.DeleteAppBlbIpGroupMemberRequest;
import com.baidubce.blb.models.DeleteAppBlbIpGroupProtocolRequest;
import com.baidubce.blb.models.DeleteAppBlbIpGroupRequest;
import com.baidubce.blb.models.DeleteAppBlbListenerRequest;
import com.baidubce.blb.models.DeleteAppBlbPolicyRequest;
import com.baidubce.blb.models.DeleteAppBlbServerGroupPortRequest;
import com.baidubce.blb.models.DeleteAppBlbServerGroupRequest;
import com.baidubce.blb.models.DeleteAppBlbServerGroupRsRequest;
import com.baidubce.blb.models.DeleteBlbListenerRequest;
import com.baidubce.blb.models.DeleteBlbServerRequest;
import com.baidubce.blb.models.DeleteServiceAuthRequest;
import com.baidubce.blb.models.DeleteServiceRequest;
import com.baidubce.blb.models.DescribeAppBlbHttpListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbHttpListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbHttpsListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbHttpsListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbIpGroupMemberRequest;
import com.baidubce.blb.models.DescribeAppBlbIpGroupMemberResponse;
import com.baidubce.blb.models.DescribeAppBlbIpGroupRequest;
import com.baidubce.blb.models.DescribeAppBlbIpGroupResponse;
import com.baidubce.blb.models.DescribeAppBlbListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbPolicyRequest;
import com.baidubce.blb.models.DescribeAppBlbPolicyResponse;
import com.baidubce.blb.models.DescribeAppBlbRequest;
import com.baidubce.blb.models.DescribeAppBlbResponse;
import com.baidubce.blb.models.DescribeAppBlbServerGroupMountRsRequest;
import com.baidubce.blb.models.DescribeAppBlbServerGroupMountRsResponse;
import com.baidubce.blb.models.DescribeAppBlbServerGroupRequest;
import com.baidubce.blb.models.DescribeAppBlbServerGroupResponse;
import com.baidubce.blb.models.DescribeAppBlbServerGroupRsRequest;
import com.baidubce.blb.models.DescribeAppBlbServerGroupRsResponse;
import com.baidubce.blb.models.DescribeAppBlbServerGroupUnmountRsRequest;
import com.baidubce.blb.models.DescribeAppBlbServerGroupUnmountRsResponse;
import com.baidubce.blb.models.DescribeAppBlbSslListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbSslListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbTcpListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbTcpListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbUdpListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbUdpListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbsRequest;
import com.baidubce.blb.models.DescribeAppBlbsResponse;
import com.baidubce.blb.models.DescribeBlbEnterpriseSecurityGroupsRequest;
import com.baidubce.blb.models.DescribeBlbEnterpriseSecurityGroupsResponse;
import com.baidubce.blb.models.DescribeBlbHttpListenerRequest;
import com.baidubce.blb.models.DescribeBlbHttpListenerResponse;
import com.baidubce.blb.models.DescribeBlbHttpsListenerRequest;
import com.baidubce.blb.models.DescribeBlbHttpsListenerResponse;
import com.baidubce.blb.models.DescribeBlbListenerRequest;
import com.baidubce.blb.models.DescribeBlbListenerResponse;
import com.baidubce.blb.models.DescribeBlbRequest;
import com.baidubce.blb.models.DescribeBlbResponse;
import com.baidubce.blb.models.DescribeBlbSecurityGroupsRequest;
import com.baidubce.blb.models.DescribeBlbSecurityGroupsResponse;
import com.baidubce.blb.models.DescribeBlbServerHealthRequest;
import com.baidubce.blb.models.DescribeBlbServerHealthResponse;
import com.baidubce.blb.models.DescribeBlbServersRequest;
import com.baidubce.blb.models.DescribeBlbServersResponse;
import com.baidubce.blb.models.DescribeBlbSslListenerRequest;
import com.baidubce.blb.models.DescribeBlbSslListenerResponse;
import com.baidubce.blb.models.DescribeBlbTcpListenerRequest;
import com.baidubce.blb.models.DescribeBlbTcpListenerResponse;
import com.baidubce.blb.models.DescribeBlbUdpListenerRequest;
import com.baidubce.blb.models.DescribeBlbUdpListenerResponse;
import com.baidubce.blb.models.DescribeBlbsRequest;
import com.baidubce.blb.models.DescribeBlbsResponse;
import com.baidubce.blb.models.DescribeLbdcBlbRequest;
import com.baidubce.blb.models.DescribeLbdcBlbResponse;
import com.baidubce.blb.models.DescribeLbdcRequest;
import com.baidubce.blb.models.DescribeLbdcResponse;
import com.baidubce.blb.models.DescribeLbdcsRequest;
import com.baidubce.blb.models.DescribeLbdcsResponse;
import com.baidubce.blb.models.DescribeServiceRequest;
import com.baidubce.blb.models.DescribeServiceResponse;
import com.baidubce.blb.models.DescribeServicesRequest;
import com.baidubce.blb.models.DescribeServicesResponse;
import com.baidubce.blb.models.RefundBlbRequest;
import com.baidubce.blb.models.ReleaseAppBlbRequest;
import com.baidubce.blb.models.ReleaseBlbRequest;
import com.baidubce.blb.models.RenewLbdcRequest;
import com.baidubce.blb.models.ResizeBlbRequest;
import com.baidubce.blb.models.ResizeBlbResponse;
import com.baidubce.blb.models.UnbindBlbEnterpriseSecurityGroupRequest;
import com.baidubce.blb.models.UnbindBlbSecurityGroupRequest;
import com.baidubce.blb.models.UnbindInstanceFromServiceRequest;
import com.baidubce.blb.models.UpdateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbHttpsListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbIpGroupMemberRequest;
import com.baidubce.blb.models.UpdateAppBlbIpGroupProtocolRequest;
import com.baidubce.blb.models.UpdateAppBlbIpGroupRequest;
import com.baidubce.blb.models.UpdateAppBlbPolicyRequest;
import com.baidubce.blb.models.UpdateAppBlbRequest;
import com.baidubce.blb.models.UpdateAppBlbServerGroupPortRequest;
import com.baidubce.blb.models.UpdateAppBlbServerGroupRequest;
import com.baidubce.blb.models.UpdateAppBlbServerGroupRsRequest;
import com.baidubce.blb.models.UpdateAppBlbSslListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbTcpListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbUdpListenerRequest;
import com.baidubce.blb.models.UpdateBlbAclRequest;
import com.baidubce.blb.models.UpdateBlbHttpListenerRequest;
import com.baidubce.blb.models.UpdateBlbHttpsListenerRequest;
import com.baidubce.blb.models.UpdateBlbModifyProtectionRequest;
import com.baidubce.blb.models.UpdateBlbRequest;
import com.baidubce.blb.models.UpdateBlbServerRequest;
import com.baidubce.blb.models.UpdateBlbSslListenerRequest;
import com.baidubce.blb.models.UpdateBlbTcpListenerRequest;
import com.baidubce.blb.models.UpdateBlbUdpListenerRequest;
import com.baidubce.blb.models.UpdateLbdcRequest;
import com.baidubce.blb.models.UpdateServiceAuthRequest;
import com.baidubce.blb.models.UpdateServiceRequest;
import com.baidubce.blb.models.UpgradeLbdcRequest;

public class BlbClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String VERSION_V1 = "v1";
    private static final String CONSTANT_BLB = "blb";
    private static final String CONSTANT_SECURITYGROUP = "securitygroup";
    private static final String CONSTANT_ENTERPRISE = "enterprise";
    private static final String CONSTANT_APPBLB = "appblb";
    private static final String CONSTANT_APPSERVERGROUP = "appservergroup";
    private static final String CONSTANT_LBDC = "lbdc";
    private static final String CONSTANT_SERVICE = "service";
    private static final String CONSTANT_H_T_T_P_SLISTENER = "HTTPSlistener";
    private static final String CONSTANT_BACKENDSERVER = "backendserver";
    private static final String CONSTANT_IPGROUP = "ipgroup";
    private static final String CONSTANT_MEMBER = "member";
    private static final String CONSTANT_CHARGE = "charge";
    private static final String CONSTANT_T_C_PLISTENER = "TCPlistener";
    private static final String CONSTANT_U_D_PLISTENER = "UDPlistener";
    private static final String CONSTANT_S_S_LLISTENER = "SSLlistener";
    private static final String CONSTANT_LISTENER = "listener";
    private static final String CONSTANT_BACKENDPOLICY = "backendpolicy";
    private static final String CONSTANT_APPSERVERGROUPPORT = "appservergroupport";
    private static final String CONSTANT_REFUND = "refund";
    private static final String CONSTANT_BLBRS = "blbrs";
    private static final String CONSTANT_H_T_T_PLISTENER = "HTTPlistener";
    private static final String CONSTANT_MODIFICATION_PROTECTION = "modification_protection";
    private static final String CONSTANT_ACL = "acl";
    private static final String CONSTANT_POLICYS = "policys";
    private static final String CONSTANT_PRICE = "price";
    private static final String CONSTANT_BLBRSUNMOUNT = "blbrsunmount";
    private static final String CONSTANT_BLBRSMOUNT = "blbrsmount";

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
     * addAppBlbServerGroupRs
     * 
     * @param request 入参结构体
     */
    public void addAppBlbServerGroupRs(AddAppBlbServerGroupRsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_BLBRS);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addBlbServer
     * 
     * @param request 入参结构体
     */
    public void addBlbServer(AddBlbServerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_BACKENDSERVER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * addServiceAuth
     * 
     * @param request 入参结构体
     */
    public void addServiceAuth(AddServiceAuthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SERVICE, request.getService());
        internalRequest.addParameter("addAuth", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * billingChangeCancelToPostBlb
     * 
     * @param request 入参结构体
     */
    public void billingChangeCancelToPostBlb(BillingChangeCancelToPostBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_CHARGE);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BillingChangePreToPostBlbResponse.class);
    }

    /**
     * bindBlbEnterpriseSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void bindBlbEnterpriseSecurityGroup(BindBlbEnterpriseSecurityGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_ENTERPRISE, CONSTANT_SECURITYGROUP);
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindBlbSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void bindBlbSecurityGroup(BindBlbSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_SECURITYGROUP);
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * bindInstanceToService
     * 
     * @param request 入参结构体
     */
    public void bindInstanceToService(BindInstanceToServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SERVICE, request.getService());
        internalRequest.addParameter("bind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * blbInquiry
     * 
     * @param request 入参结构体
     * @return BlbInquiryResponse
     */
    public BlbInquiryResponse blbInquiry(BlbInquiryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, CONSTANT_PRICE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, BlbInquiryResponse.class);
    }

    /**
     * createAppBlb
     * 
     * @param request 入参结构体
     * @return CreateAppBlbResponse
     */
    public CreateAppBlbResponse createAppBlb(CreateAppBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAppBlbResponse.class);
    }

    /**
     * createAppBlbHttpListener
     * 
     * @param request 入参结构体
     */
    public void createAppBlbHttpListener(CreateAppBlbHttpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_H_T_T_PLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAppBlbHttpsListener
     * 
     * @param request 入参结构体
     */
    public void createAppBlbHttpsListener(CreateAppBlbHttpsListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_H_T_T_P_SLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAppBlbIpGroup
     * 
     * @param request 入参结构体
     * @return CreateAppBlbIpGroupResponse
     */
    public CreateAppBlbIpGroupResponse createAppBlbIpGroup(CreateAppBlbIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAppBlbIpGroupResponse.class);
    }

    /**
     * createAppBlbIpGroupMember
     * 
     * @param request 入参结构体
     */
    public void createAppBlbIpGroupMember(CreateAppBlbIpGroupMemberRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP, CONSTANT_MEMBER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAppBlbIpGroupProtocol
     * 
     * @param request 入参结构体
     */
    public void createAppBlbIpGroupProtocol(CreateAppBlbIpGroupProtocolRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP, CONSTANT_BACKENDPOLICY);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAppBlbPolicy
     * 
     * @param request 入参结构体
     */
    public void createAppBlbPolicy(CreateAppBlbPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_POLICYS);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAppBlbServerGroup
     * 
     * @param request 入参结构体
     * @return CreateAppBlbServerGroupResponse
     */
    public CreateAppBlbServerGroupResponse createAppBlbServerGroup(CreateAppBlbServerGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_APPSERVERGROUP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAppBlbServerGroupResponse.class);
    }

    /**
     * createAppBlbServerGroupPort
     * 
     * @param request 入参结构体
     * @return CreateAppBlbServerGroupPortResponse
     */
    public CreateAppBlbServerGroupPortResponse createAppBlbServerGroupPort(CreateAppBlbServerGroupPortRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_APPSERVERGROUPPORT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateAppBlbServerGroupPortResponse.class);
    }

    /**
     * createAppBlbSslListener
     * 
     * @param request 入参结构体
     */
    public void createAppBlbSslListener(CreateAppBlbSslListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_S_S_LLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAppBlbTcpListener
     * 
     * @param request 入参结构体
     */
    public void createAppBlbTcpListener(CreateAppBlbTcpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_T_C_PLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createAppBlbUdpListener
     * 
     * @param request 入参结构体
     */
    public void createAppBlbUdpListener(CreateAppBlbUdpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_U_D_PLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createBlb
     * 
     * @param request 入参结构体
     * @return CreateBlbResponse
     */
    public CreateBlbResponse createBlb(CreateBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateBlbResponse.class);
    }

    /**
     * createBlbHttpListener
     * 
     * @param request 入参结构体
     */
    public void createBlbHttpListener(CreateBlbHttpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_H_T_T_PLISTENER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createBlbHttpsListener
     * 
     * @param request 入参结构体
     */
    public void createBlbHttpsListener(CreateBlbHttpsListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_H_T_T_P_SLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createBlbSslListener
     * 
     * @param request 入参结构体
     */
    public void createBlbSslListener(CreateBlbSslListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_S_S_LLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createBlbTcpListener
     * 
     * @param request 入参结构体
     */
    public void createBlbTcpListener(CreateBlbTcpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_T_C_PLISTENER);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createBlbUdpListener
     * 
     * @param request 入参结构体
     */
    public void createBlbUdpListener(CreateBlbUdpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_U_D_PLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * createLbdc
     * 
     * @param request 入参结构体
     * @return CreateLbdcResponse
     */
    public CreateLbdcResponse createLbdc(CreateLbdcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_LBDC);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateLbdcResponse.class);
    }

    /**
     * createService
     * 
     * @param request 入参结构体
     * @return CreateServiceResponse
     */
    public CreateServiceResponse createService(CreateServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, VERSION_V1, CONSTANT_SERVICE);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CreateServiceResponse.class);
    }

    /**
     * deleteAppBlbIpGroup
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbIpGroup(DeleteAppBlbIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP);
        internalRequest.addParameter("delete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAppBlbIpGroupMember
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbIpGroupMember(DeleteAppBlbIpGroupMemberRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP, CONSTANT_MEMBER);
        internalRequest.addParameter("delete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAppBlbIpGroupProtocol
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbIpGroupProtocol(DeleteAppBlbIpGroupProtocolRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP, CONSTANT_BACKENDPOLICY);
        internalRequest.addParameter("delete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAppBlbListener
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbListener(DeleteAppBlbListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_LISTENER);
        internalRequest.addParameter("batchdelete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAppBlbPolicy
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbPolicy(DeleteAppBlbPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_POLICYS);
        internalRequest.addParameter("batchdelete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAppBlbServerGroup
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbServerGroup(DeleteAppBlbServerGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_APPSERVERGROUP);
        internalRequest.addParameter("delete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAppBlbServerGroupPort
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbServerGroupPort(DeleteAppBlbServerGroupPortRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_APPSERVERGROUPPORT);
        internalRequest.addParameter("batchdelete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteAppBlbServerGroupRs
     * 
     * @param request 入参结构体
     */
    public void deleteAppBlbServerGroupRs(DeleteAppBlbServerGroupRsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_BLBRS);
        internalRequest.addParameter("batchdelete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteBlbListener
     * 
     * @param request 入参结构体
     */
    public void deleteBlbListener(DeleteBlbListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_LISTENER);
        internalRequest.addParameter("batchdelete", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteBlbServer
     * 
     * @param request 入参结构体
     */
    public void deleteBlbServer(DeleteBlbServerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_BACKENDSERVER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteService
     * 
     * @param request 入参结构体
     */
    public void deleteService(DeleteServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_SERVICE, request.getService());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * deleteServiceAuth
     * 
     * @param request 入参结构体
     */
    public void deleteServiceAuth(DeleteServiceAuthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SERVICE, request.getService());
        internalRequest.addParameter("removeAuth", null);
        if (request.getAction() != null) {
            internalRequest.addParameter("action", request.getAction());
        }
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * describeAppBlb
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbResponse
     */
    public DescribeAppBlbResponse describeAppBlb(DescribeAppBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId());
        return invokeHttpClient(internalRequest, DescribeAppBlbResponse.class);
    }

    /**
     * describeAppBlbHttpListener
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbHttpListenerResponse
     */
    public DescribeAppBlbHttpListenerResponse describeAppBlbHttpListener(DescribeAppBlbHttpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_H_T_T_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbHttpListenerResponse.class);
    }

    /**
     * describeAppBlbHttpsListener
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbHttpsListenerResponse
     */
    public DescribeAppBlbHttpsListenerResponse describeAppBlbHttpsListener(DescribeAppBlbHttpsListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_H_T_T_P_SLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbHttpsListenerResponse.class);
    }

    /**
     * describeAppBlbIpGroup
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbIpGroupResponse
     */
    public DescribeAppBlbIpGroupResponse describeAppBlbIpGroup(DescribeAppBlbIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP);
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getExactlyMatch() != null) {
            internalRequest.addParameter("exactlyMatch", String.valueOf(request.getExactlyMatch()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbIpGroupResponse.class);
    }

    /**
     * describeAppBlbIpGroupMember
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbIpGroupMemberResponse
     */
    public DescribeAppBlbIpGroupMemberResponse describeAppBlbIpGroupMember(DescribeAppBlbIpGroupMemberRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP, CONSTANT_MEMBER);
        if (request.getIpGroupId() != null) {
            internalRequest.addParameter("ipGroupId", request.getIpGroupId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbIpGroupMemberResponse.class);
    }

    /**
     * describeAppBlbListener
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbListenerResponse
     */
    public DescribeAppBlbListenerResponse describeAppBlbListener(DescribeAppBlbListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_LISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbListenerResponse.class);
    }

    /**
     * describeAppBlbPolicy
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbPolicyResponse
     */
    public DescribeAppBlbPolicyResponse describeAppBlbPolicy(DescribeAppBlbPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_POLICYS);
        if (request.getPort() != null) {
            internalRequest.addParameter("port", String.valueOf(request.getPort()));
        }
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbPolicyResponse.class);
    }

    /**
     * describeAppBlbServerGroup
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbServerGroupResponse
     */
    public DescribeAppBlbServerGroupResponse describeAppBlbServerGroup(DescribeAppBlbServerGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_APPSERVERGROUP);
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getExactlyMatch() != null) {
            internalRequest.addParameter("exactlyMatch", String.valueOf(request.getExactlyMatch()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbServerGroupResponse.class);
    }

    /**
     * describeAppBlbServerGroupMountRs
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbServerGroupMountRsResponse
     */
    public DescribeAppBlbServerGroupMountRsResponse describeAppBlbServerGroupMountRs(DescribeAppBlbServerGroupMountRsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_BLBRSMOUNT);
        if (request.getSgId() != null) {
            internalRequest.addParameter("sgId", request.getSgId());
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbServerGroupMountRsResponse.class);
    }

    /**
     * describeAppBlbServerGroupRs
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbServerGroupRsResponse
     */
    public DescribeAppBlbServerGroupRsResponse describeAppBlbServerGroupRs(DescribeAppBlbServerGroupRsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_BLBRS);
        if (request.getSgId() != null) {
            internalRequest.addParameter("sgId", request.getSgId());
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbServerGroupRsResponse.class);
    }

    /**
     * describeAppBlbServerGroupUnmountRs
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbServerGroupUnmountRsResponse
     */
    public DescribeAppBlbServerGroupUnmountRsResponse describeAppBlbServerGroupUnmountRs(DescribeAppBlbServerGroupUnmountRsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_BLBRSUNMOUNT);
        if (request.getSgId() != null) {
            internalRequest.addParameter("sgId", request.getSgId());
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbServerGroupUnmountRsResponse.class);
    }

    /**
     * describeAppBlbSslListener
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbSslListenerResponse
     */
    public DescribeAppBlbSslListenerResponse describeAppBlbSslListener(DescribeAppBlbSslListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_S_S_LLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbSslListenerResponse.class);
    }

    /**
     * describeAppBlbTcpListener
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbTcpListenerResponse
     */
    public DescribeAppBlbTcpListenerResponse describeAppBlbTcpListener(DescribeAppBlbTcpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_T_C_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbTcpListenerResponse.class);
    }

    /**
     * describeAppBlbUdpListener
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbUdpListenerResponse
     */
    public DescribeAppBlbUdpListenerResponse describeAppBlbUdpListener(DescribeAppBlbUdpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_U_D_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbUdpListenerResponse.class);
    }

    /**
     * describeAppBlbs
     * 
     * @param request 入参结构体
     * @return DescribeAppBlbsResponse
     */
    public DescribeAppBlbsResponse describeAppBlbs(DescribeAppBlbsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_APPBLB);
        if (request.getAddress() != null) {
            internalRequest.addParameter("address", request.getAddress());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getBlbId() != null) {
            internalRequest.addParameter("blbId", request.getBlbId());
        }
        if (request.getBccId() != null) {
            internalRequest.addParameter("bccId", request.getBccId());
        }
        if (request.getExactlyMatch() != null) {
            internalRequest.addParameter("exactlyMatch", String.valueOf(request.getExactlyMatch()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeAppBlbsResponse.class);
    }

    /**
     * describeBlb
     * 
     * @param request 入参结构体
     * @return DescribeBlbResponse
     */
    public DescribeBlbResponse describeBlb(DescribeBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId());
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        return invokeHttpClient(internalRequest, DescribeBlbResponse.class);
    }

    /**
     * describeBlbEnterpriseSecurityGroups
     * 
     * @param request 入参结构体
     * @return DescribeBlbEnterpriseSecurityGroupsResponse
     */
    public DescribeBlbEnterpriseSecurityGroupsResponse describeBlbEnterpriseSecurityGroups(DescribeBlbEnterpriseSecurityGroupsRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_ENTERPRISE, CONSTANT_SECURITYGROUP);
        return invokeHttpClient(internalRequest, DescribeBlbEnterpriseSecurityGroupsResponse.class);
    }

    /**
     * describeBlbHttpListener
     * 
     * @param request 入参结构体
     * @return DescribeBlbHttpListenerResponse
     */
    public DescribeBlbHttpListenerResponse describeBlbHttpListener(DescribeBlbHttpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_H_T_T_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbHttpListenerResponse.class);
    }

    /**
     * describeBlbHttpsListener
     * 
     * @param request 入参结构体
     * @return DescribeBlbHttpsListenerResponse
     */
    public DescribeBlbHttpsListenerResponse describeBlbHttpsListener(DescribeBlbHttpsListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_H_T_T_P_SLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbHttpsListenerResponse.class);
    }

    /**
     * describeBlbListener
     * 
     * @param request 入参结构体
     * @return DescribeBlbListenerResponse
     */
    public DescribeBlbListenerResponse describeBlbListener(DescribeBlbListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_LISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbListenerResponse.class);
    }

    /**
     * describeBlbSecurityGroups
     * 
     * @param request 入参结构体
     * @return DescribeBlbSecurityGroupsResponse
     */
    public DescribeBlbSecurityGroupsResponse describeBlbSecurityGroups(DescribeBlbSecurityGroupsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_SECURITYGROUP);
        return invokeHttpClient(internalRequest, DescribeBlbSecurityGroupsResponse.class);
    }

    /**
     * describeBlbServerHealth
     * 
     * @param request 入参结构体
     * @return DescribeBlbServerHealthResponse
     */
    public DescribeBlbServerHealthResponse describeBlbServerHealth(DescribeBlbServerHealthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_BACKENDSERVER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbServerHealthResponse.class);
    }

    /**
     * describeBlbServers
     * 
     * @param request 入参结构体
     * @return DescribeBlbServersResponse
     */
    public DescribeBlbServersResponse describeBlbServers(DescribeBlbServersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_BACKENDSERVER);
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbServersResponse.class);
    }

    /**
     * describeBlbSslListener
     * 
     * @param request 入参结构体
     * @return DescribeBlbSslListenerResponse
     */
    public DescribeBlbSslListenerResponse describeBlbSslListener(DescribeBlbSslListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_S_S_LLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbSslListenerResponse.class);
    }

    /**
     * describeBlbTcpListener
     * 
     * @param request 入参结构体
     * @return DescribeBlbTcpListenerResponse
     */
    public DescribeBlbTcpListenerResponse describeBlbTcpListener(DescribeBlbTcpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_T_C_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbTcpListenerResponse.class);
    }

    /**
     * describeBlbUdpListener
     * 
     * @param request 入参结构体
     * @return DescribeBlbUdpListenerResponse
     */
    public DescribeBlbUdpListenerResponse describeBlbUdpListener(DescribeBlbUdpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_U_D_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        return invokeHttpClient(internalRequest, DescribeBlbUdpListenerResponse.class);
    }

    /**
     * describeBlbs
     * 
     * @param request 入参结构体
     * @return DescribeBlbsResponse
     */
    public DescribeBlbsResponse describeBlbs(DescribeBlbsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_BLB);
        if (request.getAddress() != null) {
            internalRequest.addParameter("address", request.getAddress());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        if (request.getBlbId() != null) {
            internalRequest.addParameter("blbId", request.getBlbId());
        }
        if (request.getBccId() != null) {
            internalRequest.addParameter("bccId", request.getBccId());
        }
        if (request.getExactlyMatch() != null) {
            internalRequest.addParameter("exactlyMatch", String.valueOf(request.getExactlyMatch()));
        }
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        if (request.getMaxKeys() != null) {
            internalRequest.addParameter("maxKeys", String.valueOf(request.getMaxKeys()));
        }
        if (request.getType() != null) {
            internalRequest.addParameter("type", request.getType());
        }
        return invokeHttpClient(internalRequest, DescribeBlbsResponse.class);
    }

    /**
     * describeLbdc
     * 
     * @param request 入参结构体
     * @return DescribeLbdcResponse
     */
    public DescribeLbdcResponse describeLbdc(DescribeLbdcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LBDC, request.getId());
        return invokeHttpClient(internalRequest, DescribeLbdcResponse.class);
    }

    /**
     * describeLbdcBlb
     * 
     * @param request 入参结构体
     * @return DescribeLbdcBlbResponse
     */
    public DescribeLbdcBlbResponse describeLbdcBlb(DescribeLbdcBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LBDC, request.getId(), CONSTANT_BLB);
        return invokeHttpClient(internalRequest, DescribeLbdcBlbResponse.class);
    }

    /**
     * describeLbdcs
     * 
     * @param request 入参结构体
     * @return DescribeLbdcsResponse
     */
    public DescribeLbdcsResponse describeLbdcs(DescribeLbdcsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_LBDC);
        if (request.getId() != null) {
            internalRequest.addParameter("id", request.getId());
        }
        if (request.getName() != null) {
            internalRequest.addParameter("name", request.getName());
        }
        return invokeHttpClient(internalRequest, DescribeLbdcsResponse.class);
    }

    /**
     * describeService
     * 
     * @param request 入参结构体
     * @return DescribeServiceResponse
     */
    public DescribeServiceResponse describeService(DescribeServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SERVICE, request.getService());
        return invokeHttpClient(internalRequest, DescribeServiceResponse.class);
    }

    /**
     * describeServices
     * 
     * @param request 入参结构体
     * @return DescribeServicesResponse
     */
    public DescribeServicesResponse describeServices(DescribeServicesRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.GET, VERSION_V1, CONSTANT_SERVICE);
        internalRequest.addParameter("maxKeys", "1");
        if (request.getMarker() != null) {
            internalRequest.addParameter("marker", request.getMarker());
        }
        return invokeHttpClient(internalRequest, DescribeServicesResponse.class);
    }

    /**
     * refundBlb
     * 
     * @param request 入参结构体
     */
    public void refundBlb(RefundBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, CONSTANT_REFUND, request.getBlbId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseAppBlb
     * 
     * @param request 入参结构体
     */
    public void releaseAppBlb(ReleaseAppBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_APPBLB, request.getBlbId());
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * releaseBlb
     * 
     * @param request 入参结构体
     */
    public void releaseBlb(ReleaseBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.DELETE, VERSION_V1, CONSTANT_BLB, request.getBlbId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * renewLbdc
     * 
     * @param request 入参结构体
     */
    public void renewLbdc(RenewLbdcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LBDC, request.getId());
        internalRequest.addParameter("purchaseReserved", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
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
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, ResizeBlbResponse.class);
    }

    /**
     * unbindBlbEnterpriseSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void unbindBlbEnterpriseSecurityGroup(UnbindBlbEnterpriseSecurityGroupRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_ENTERPRISE, CONSTANT_SECURITYGROUP);
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindBlbSecurityGroup
     * 
     * @param request 入参结构体
     */
    public void unbindBlbSecurityGroup(UnbindBlbSecurityGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_SECURITYGROUP);
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * unbindInstanceFromService
     * 
     * @param request 入参结构体
     */
    public void unbindInstanceFromService(UnbindInstanceFromServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SERVICE, request.getService());
        internalRequest.addParameter("unbind", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlb
     * 
     * @param request 入参结构体
     */
    public void updateAppBlb(UpdateAppBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbHttpListener
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbHttpListener(UpdateAppBlbHttpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_H_T_T_PLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbHttpsListener
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbHttpsListener(UpdateAppBlbHttpsListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_H_T_T_P_SLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbIpGroup
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbIpGroup(UpdateAppBlbIpGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbIpGroupMember
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbIpGroupMember(UpdateAppBlbIpGroupMemberRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP, CONSTANT_MEMBER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbIpGroupProtocol
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbIpGroupProtocol(UpdateAppBlbIpGroupProtocolRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_IPGROUP, CONSTANT_BACKENDPOLICY);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbPolicy
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbPolicy(UpdateAppBlbPolicyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_POLICYS);
        internalRequest.addParameter("batchupdate", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbServerGroup
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbServerGroup(UpdateAppBlbServerGroupRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_APPSERVERGROUP);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbServerGroupPort
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbServerGroupPort(UpdateAppBlbServerGroupPortRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_APPSERVERGROUPPORT);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbServerGroupRs
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbServerGroupRs(UpdateAppBlbServerGroupRsRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_BLBRS);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbSslListener
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbSslListener(UpdateAppBlbSslListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_S_S_LLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbTcpListener
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbTcpListener(UpdateAppBlbTcpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_T_C_PLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateAppBlbUdpListener
     * 
     * @param request 入参结构体
     */
    public void updateAppBlbUdpListener(UpdateAppBlbUdpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_APPBLB, request.getBlbId(), CONSTANT_U_D_PLISTENER);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlb
     * 
     * @param request 入参结构体
     */
    public void updateBlb(UpdateBlbRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbAcl
     * 
     * @param request 入参结构体
     */
    public void updateBlbAcl(UpdateBlbAclRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, CONSTANT_ACL, request.getBlbId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbHttpListener
     * 
     * @param request 入参结构体
     */
    public void updateBlbHttpListener(UpdateBlbHttpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_H_T_T_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbHttpsListener
     * 
     * @param request 入参结构体
     */
    public void updateBlbHttpsListener(UpdateBlbHttpsListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_H_T_T_P_SLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbModifyProtection
     * 
     * @param request 入参结构体
     */
    public void updateBlbModifyProtection(UpdateBlbModifyProtectionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, CONSTANT_MODIFICATION_PROTECTION, request.getBlbId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbServer
     * 
     * @param request 入参结构体
     */
    public void updateBlbServer(UpdateBlbServerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_BACKENDSERVER);
        internalRequest.addParameter("update", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbSslListener
     * 
     * @param request 入参结构体
     */
    public void updateBlbSslListener(UpdateBlbSslListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_S_S_LLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbTcpListener
     * 
     * @param request 入参结构体
     */
    public void updateBlbTcpListener(UpdateBlbTcpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_T_C_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateBlbUdpListener
     * 
     * @param request 入参结构体
     */
    public void updateBlbUdpListener(UpdateBlbUdpListenerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_BLB, request.getBlbId(), CONSTANT_U_D_PLISTENER);
        if (request.getListenerPort() != null) {
            internalRequest.addParameter("listenerPort", String.valueOf(request.getListenerPort()));
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateLbdc
     * 
     * @param request 入参结构体
     */
    public void updateLbdc(UpdateLbdcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LBDC, request.getId());
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateService
     * 
     * @param request 入参结构体
     */
    public void updateService(UpdateServiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SERVICE, request.getService());
        internalRequest.addParameter("modifyAttribute", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * updateServiceAuth
     * 
     * @param request 入参结构体
     */
    public void updateServiceAuth(UpdateServiceAuthRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_SERVICE, request.getService());
        internalRequest.addParameter("editAuth", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
    }

    /**
     * upgradeLbdc
     * 
     * @param request 入参结构体
     */
    public void upgradeLbdc(UpgradeLbdcRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.PUT, VERSION_V1, CONSTANT_LBDC, request.getId());
        internalRequest.addParameter("resize", null);
        if (request.getClientToken() != null) {
            internalRequest.addParameter("clientToken", request.getClientToken());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        invokeHttpClient(internalRequest, BaseBceResponse.class);
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
