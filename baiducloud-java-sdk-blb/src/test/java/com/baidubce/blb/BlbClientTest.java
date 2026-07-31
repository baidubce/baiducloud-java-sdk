package com.baidubce.blb;

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
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for BlbClient
 */
public class BlbClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private BlbClient blbClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        blbClient = new BlbClient(config);
    }

    /**
     * addAppBlbServerGroupRs
     *
     */
    @Test
    public void addAppBlbServerGroupRsTest() {
        AddAppBlbServerGroupRsRequest addAppBlbServerGroupRsRequest = new AddAppBlbServerGroupRsRequest();
        addAppBlbServerGroupRsRequest.setBlbId("");
        addAppBlbServerGroupRsRequest.setClientToken("");
        addAppBlbServerGroupRsRequest.setSgId("");
        addAppBlbServerGroupRsRequest.setBackendServerList(new ArrayList<>());
        blbClient.addAppBlbServerGroupRs(addAppBlbServerGroupRsRequest);
    }
    /**
     * addBlbServer
     *
     */
    @Test
    public void addBlbServerTest() {
        AddBlbServerRequest addBlbServerRequest = new AddBlbServerRequest();
        addBlbServerRequest.setBlbId("");
        addBlbServerRequest.setClientToken("");
        addBlbServerRequest.setBackendServerList(new ArrayList<>());
        blbClient.addBlbServer(addBlbServerRequest);
    }
    /**
     * addServiceAuth
     *
     */
    @Test
    public void addServiceAuthTest() {
        AddServiceAuthRequest addServiceAuthRequest = new AddServiceAuthRequest();
        addServiceAuthRequest.setService("");
        addServiceAuthRequest.setClientToken("");
        addServiceAuthRequest.setAuthList(new ArrayList<>());
        blbClient.addServiceAuth(addServiceAuthRequest);
    }
    /**
     * billingChangeCancelToPostBlb
     *
     */
    @Test
    public void billingChangeCancelToPostBlbTest() {
        BillingChangeCancelToPostBlbRequest billingChangeCancelToPostBlbRequest = new BillingChangeCancelToPostBlbRequest();
        billingChangeCancelToPostBlbRequest.setBlbId("");
        billingChangeCancelToPostBlbRequest.setClientToken("");
        blbClient.billingChangeCancelToPostBlb(billingChangeCancelToPostBlbRequest);
    }
    /**
     * billingChangePostToPreBlb
     *
     */
    @Test
    public void billingChangePostToPreBlbTest() {
        BillingChangePostToPreBlbRequest billingChangePostToPreBlbRequest = new BillingChangePostToPreBlbRequest();
        billingChangePostToPreBlbRequest.setBlbId("");
        billingChangePostToPreBlbRequest.setClientToken("");
        billingChangePostToPreBlbRequest.setBillingMethod("");
        billingChangePostToPreBlbRequest.setPerformanceLevel("");
        billingChangePostToPreBlbRequest.setReservationLength(0);
        BillingChangePostToPreBlbResponse response = blbClient.billingChangePostToPreBlb(billingChangePostToPreBlbRequest);
        System.out.println(response);
    }
    /**
     * billingChangePreToPostBlb
     *
     */
    @Test
    public void billingChangePreToPostBlbTest() {
        BillingChangePreToPostBlbRequest billingChangePreToPostBlbRequest = new BillingChangePreToPostBlbRequest();
        billingChangePreToPostBlbRequest.setBlbId("");
        billingChangePreToPostBlbRequest.setClientToken("");
        billingChangePreToPostBlbRequest.setBillingMethod("");
        billingChangePreToPostBlbRequest.setPerformanceLevel("");
        billingChangePreToPostBlbRequest.setEffectiveImmediately(false);
        BillingChangePreToPostBlbResponse response = blbClient.billingChangePreToPostBlb(billingChangePreToPostBlbRequest);
        System.out.println(response);
    }
    /**
     * bindBlbEnterpriseSecurityGroup
     *
     */
    @Test
    public void bindBlbEnterpriseSecurityGroupTest() {
        BindBlbEnterpriseSecurityGroupRequest bindBlbEnterpriseSecurityGroupRequest = new BindBlbEnterpriseSecurityGroupRequest();
        bindBlbEnterpriseSecurityGroupRequest.setBlbId("");
        bindBlbEnterpriseSecurityGroupRequest.setClientToken("");
        bindBlbEnterpriseSecurityGroupRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        blbClient.bindBlbEnterpriseSecurityGroup(bindBlbEnterpriseSecurityGroupRequest);
    }
    /**
     * bindBlbSecurityGroup
     *
     */
    @Test
    public void bindBlbSecurityGroupTest() {
        BindBlbSecurityGroupRequest bindBlbSecurityGroupRequest = new BindBlbSecurityGroupRequest();
        bindBlbSecurityGroupRequest.setBlbId("");
        bindBlbSecurityGroupRequest.setClientToken("");
        bindBlbSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        blbClient.bindBlbSecurityGroup(bindBlbSecurityGroupRequest);
    }
    /**
     * bindInstanceToService
     *
     */
    @Test
    public void bindInstanceToServiceTest() {
        BindInstanceToServiceRequest bindInstanceToServiceRequest = new BindInstanceToServiceRequest();
        bindInstanceToServiceRequest.setService("");
        bindInstanceToServiceRequest.setClientToken("");
        bindInstanceToServiceRequest.setInstanceId("");
        blbClient.bindInstanceToService(bindInstanceToServiceRequest);
    }
    /**
     * blbInquiry
     *
     */
    @Test
    public void blbInquiryTest() {
        BlbInquiryRequest blbInquiryRequest = new BlbInquiryRequest();
        blbInquiryRequest.setBlbType("");
        blbInquiryRequest.setPerformanceLevel("");
        blbInquiryRequest.setCount(0);
        blbInquiryRequest.setBilling(null);
        BlbInquiryResponse response = blbClient.blbInquiry(blbInquiryRequest);
        System.out.println(response);
    }
    /**
     * createAppBlb
     *
     */
    @Test
    public void createAppBlbTest() {
        CreateAppBlbRequest createAppBlbRequest = new CreateAppBlbRequest();
        createAppBlbRequest.setClientToken("");
        createAppBlbRequest.setName("");
        createAppBlbRequest.setType("");
        createAppBlbRequest.setDesc("");
        createAppBlbRequest.setSubnetId("");
        createAppBlbRequest.setVpcId("");
        createAppBlbRequest.setAddress("");
        createAppBlbRequest.setEip("");
        createAppBlbRequest.setTags(new ArrayList<>());
        createAppBlbRequest.setBilling(null);
        createAppBlbRequest.setPerformanceLevel("");
        createAppBlbRequest.setAutoRenewLength(0);
        createAppBlbRequest.setAutoRenewTimeUnit("");
        createAppBlbRequest.setResourceGroupId("");
        createAppBlbRequest.setAllowDelete(false);
        createAppBlbRequest.setAllowModify(false);
        createAppBlbRequest.setModificationProtectionReason("");
        createAppBlbRequest.setAllocateIpv6(false);
        CreateAppBlbResponse response = blbClient.createAppBlb(createAppBlbRequest);
        System.out.println(response);
    }
    /**
     * createAppBlbHttpListener
     *
     */
    @Test
    public void createAppBlbHttpListenerTest() {
        CreateAppBlbHttpListenerRequest createAppBlbHttpListenerRequest = new CreateAppBlbHttpListenerRequest();
        createAppBlbHttpListenerRequest.setBlbId("");
        createAppBlbHttpListenerRequest.setClientToken("");
        createAppBlbHttpListenerRequest.setListenerPort(0);
        createAppBlbHttpListenerRequest.setScheduler("");
        createAppBlbHttpListenerRequest.setKeepSession(false);
        createAppBlbHttpListenerRequest.setKeepSessionType("");
        createAppBlbHttpListenerRequest.setKeepSessionTimeout(0);
        createAppBlbHttpListenerRequest.setKeepSessionCookieName("");
        createAppBlbHttpListenerRequest.setXForwardedFor(false);
        createAppBlbHttpListenerRequest.setXForwardedProto(false);
        createAppBlbHttpListenerRequest.setAdditionalAttributes(null);
        createAppBlbHttpListenerRequest.setServerTimeout(0);
        createAppBlbHttpListenerRequest.setRedirectPort(0);
        createAppBlbHttpListenerRequest.setDescription("");
        blbClient.createAppBlbHttpListener(createAppBlbHttpListenerRequest);
    }
    /**
     * createAppBlbHttpsListener
     *
     */
    @Test
    public void createAppBlbHttpsListenerTest() {
        CreateAppBlbHttpsListenerRequest createAppBlbHttpsListenerRequest = new CreateAppBlbHttpsListenerRequest();
        createAppBlbHttpsListenerRequest.setBlbId("");
        createAppBlbHttpsListenerRequest.setClientToken("");
        createAppBlbHttpsListenerRequest.setListenerPort(0);
        createAppBlbHttpsListenerRequest.setScheduler("");
        createAppBlbHttpsListenerRequest.setKeepSession(false);
        createAppBlbHttpsListenerRequest.setKeepSessionType("");
        createAppBlbHttpsListenerRequest.setKeepSessionTimeout(0);
        createAppBlbHttpsListenerRequest.setKeepSessionCookieName("");
        createAppBlbHttpsListenerRequest.setXForwardedFor(false);
        createAppBlbHttpsListenerRequest.setXForwardedProto(false);
        createAppBlbHttpsListenerRequest.setAdditionalAttributes(null);
        createAppBlbHttpsListenerRequest.setServerTimeout(0);
        createAppBlbHttpsListenerRequest.setCertIds(new ArrayList<>());
        createAppBlbHttpsListenerRequest.setEncryptionType("");
        createAppBlbHttpsListenerRequest.setEncryptionProtocols(new ArrayList<>());
        createAppBlbHttpsListenerRequest.setAppliedCiphers("");
        createAppBlbHttpsListenerRequest.setDualAuth(false);
        createAppBlbHttpsListenerRequest.setClientCertIds(new ArrayList<>());
        createAppBlbHttpsListenerRequest.setAdditionalCertDomains(new ArrayList<>());
        createAppBlbHttpsListenerRequest.setDescription("");
        blbClient.createAppBlbHttpsListener(createAppBlbHttpsListenerRequest);
    }
    /**
     * createAppBlbIpGroup
     *
     */
    @Test
    public void createAppBlbIpGroupTest() {
        CreateAppBlbIpGroupRequest createAppBlbIpGroupRequest = new CreateAppBlbIpGroupRequest();
        createAppBlbIpGroupRequest.setBlbId("");
        createAppBlbIpGroupRequest.setClientToken("");
        createAppBlbIpGroupRequest.setName("");
        createAppBlbIpGroupRequest.setDesc("");
        createAppBlbIpGroupRequest.setMemberList(new ArrayList<>());
        CreateAppBlbIpGroupResponse response = blbClient.createAppBlbIpGroup(createAppBlbIpGroupRequest);
        System.out.println(response);
    }
    /**
     * createAppBlbIpGroupMember
     *
     */
    @Test
    public void createAppBlbIpGroupMemberTest() {
        CreateAppBlbIpGroupMemberRequest createAppBlbIpGroupMemberRequest = new CreateAppBlbIpGroupMemberRequest();
        createAppBlbIpGroupMemberRequest.setBlbId("");
        createAppBlbIpGroupMemberRequest.setClientToken("");
        createAppBlbIpGroupMemberRequest.setIpGroupId("");
        createAppBlbIpGroupMemberRequest.setMemberList(new ArrayList<>());
        blbClient.createAppBlbIpGroupMember(createAppBlbIpGroupMemberRequest);
    }
    /**
     * createAppBlbIpGroupProtocol
     *
     */
    @Test
    public void createAppBlbIpGroupProtocolTest() {
        CreateAppBlbIpGroupProtocolRequest createAppBlbIpGroupProtocolRequest = new CreateAppBlbIpGroupProtocolRequest();
        createAppBlbIpGroupProtocolRequest.setBlbId("");
        createAppBlbIpGroupProtocolRequest.setClientToken("");
        createAppBlbIpGroupProtocolRequest.setIpGroupId("");
        createAppBlbIpGroupProtocolRequest.setType("");
        createAppBlbIpGroupProtocolRequest.setHealthCheck("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckPort(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckUrlPath("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckTimeoutInSecond(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckIntervalInSecond(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckDownRetry(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckUpRetry(0);
        createAppBlbIpGroupProtocolRequest.setHealthCheckNormalStatus("");
        createAppBlbIpGroupProtocolRequest.setHealthCheckHost("");
        createAppBlbIpGroupProtocolRequest.setUdpHealthCheckString("");
        blbClient.createAppBlbIpGroupProtocol(createAppBlbIpGroupProtocolRequest);
    }
    /**
     * createAppBlbPolicy
     *
     */
    @Test
    public void createAppBlbPolicyTest() {
        CreateAppBlbPolicyRequest createAppBlbPolicyRequest = new CreateAppBlbPolicyRequest();
        createAppBlbPolicyRequest.setBlbId("");
        createAppBlbPolicyRequest.setClientToken("");
        createAppBlbPolicyRequest.setListenerPort(0);
        createAppBlbPolicyRequest.setAppPolicyVos(new ArrayList<>());
        createAppBlbPolicyRequest.setType("");
        blbClient.createAppBlbPolicy(createAppBlbPolicyRequest);
    }
    /**
     * createAppBlbServerGroup
     *
     */
    @Test
    public void createAppBlbServerGroupTest() {
        CreateAppBlbServerGroupRequest createAppBlbServerGroupRequest = new CreateAppBlbServerGroupRequest();
        createAppBlbServerGroupRequest.setBlbId("");
        createAppBlbServerGroupRequest.setClientToken("");
        createAppBlbServerGroupRequest.setName("");
        createAppBlbServerGroupRequest.setDesc("");
        createAppBlbServerGroupRequest.setBackendServerList(new ArrayList<>());
        CreateAppBlbServerGroupResponse response = blbClient.createAppBlbServerGroup(createAppBlbServerGroupRequest);
        System.out.println(response);
    }
    /**
     * createAppBlbServerGroupPort
     *
     */
    @Test
    public void createAppBlbServerGroupPortTest() {
        CreateAppBlbServerGroupPortRequest createAppBlbServerGroupPortRequest = new CreateAppBlbServerGroupPortRequest();
        createAppBlbServerGroupPortRequest.setBlbId("");
        createAppBlbServerGroupPortRequest.setClientToken("");
        createAppBlbServerGroupPortRequest.setSgId("");
        createAppBlbServerGroupPortRequest.setPort(0);
        createAppBlbServerGroupPortRequest.setType("");
        createAppBlbServerGroupPortRequest.setEnableHealthCheck(false);
        createAppBlbServerGroupPortRequest.setHealthCheck("");
        createAppBlbServerGroupPortRequest.setHealthCheckPort(0);
        createAppBlbServerGroupPortRequest.setHealthCheckUrlPath("");
        createAppBlbServerGroupPortRequest.setHealthCheckTimeoutInSecond(0);
        createAppBlbServerGroupPortRequest.setHealthCheckIntervalInSecond(0);
        createAppBlbServerGroupPortRequest.setHealthCheckDownRetry(0);
        createAppBlbServerGroupPortRequest.setHealthCheckUpRetry(0);
        createAppBlbServerGroupPortRequest.setHealthCheckNormalStatus("");
        createAppBlbServerGroupPortRequest.setHealthCheckHost("");
        createAppBlbServerGroupPortRequest.setUdpHealthCheckString("");
        CreateAppBlbServerGroupPortResponse response = blbClient.createAppBlbServerGroupPort(createAppBlbServerGroupPortRequest);
        System.out.println(response);
    }
    /**
     * createAppBlbSslListener
     *
     */
    @Test
    public void createAppBlbSslListenerTest() {
        CreateAppBlbSslListenerRequest createAppBlbSslListenerRequest = new CreateAppBlbSslListenerRequest();
        createAppBlbSslListenerRequest.setBlbId("");
        createAppBlbSslListenerRequest.setClientToken("");
        createAppBlbSslListenerRequest.setListenerPort(0);
        createAppBlbSslListenerRequest.setScheduler("");
        createAppBlbSslListenerRequest.setCertIds(new ArrayList<>());
        createAppBlbSslListenerRequest.setEncryptionType("");
        createAppBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        createAppBlbSslListenerRequest.setAppliedCiphers("");
        createAppBlbSslListenerRequest.setDualAuth(false);
        createAppBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        createAppBlbSslListenerRequest.setDescription("");
        blbClient.createAppBlbSslListener(createAppBlbSslListenerRequest);
    }
    /**
     * createAppBlbTcpListener
     *
     */
    @Test
    public void createAppBlbTcpListenerTest() {
        CreateAppBlbTcpListenerRequest createAppBlbTcpListenerRequest = new CreateAppBlbTcpListenerRequest();
        createAppBlbTcpListenerRequest.setBlbId("");
        createAppBlbTcpListenerRequest.setClientToken("");
        createAppBlbTcpListenerRequest.setListenerPort(0);
        createAppBlbTcpListenerRequest.setScheduler("");
        createAppBlbTcpListenerRequest.setTcpSessionTimeout(0);
        createAppBlbTcpListenerRequest.setDescription("");
        blbClient.createAppBlbTcpListener(createAppBlbTcpListenerRequest);
    }
    /**
     * createAppBlbUdpListener
     *
     */
    @Test
    public void createAppBlbUdpListenerTest() {
        CreateAppBlbUdpListenerRequest createAppBlbUdpListenerRequest = new CreateAppBlbUdpListenerRequest();
        createAppBlbUdpListenerRequest.setBlbId("");
        createAppBlbUdpListenerRequest.setClientToken("");
        createAppBlbUdpListenerRequest.setListenerPort(0);
        createAppBlbUdpListenerRequest.setScheduler("");
        createAppBlbUdpListenerRequest.setUdpSessionTimeout(0);
        createAppBlbUdpListenerRequest.setDescription("");
        blbClient.createAppBlbUdpListener(createAppBlbUdpListenerRequest);
    }
    /**
     * createBlb
     *
     */
    @Test
    public void createBlbTest() {
        CreateBlbRequest createBlbRequest = new CreateBlbRequest();
        createBlbRequest.setClientToken("");
        createBlbRequest.setName("");
        createBlbRequest.setDesc("");
        createBlbRequest.setVpcId("");
        createBlbRequest.setSubnetId("");
        createBlbRequest.setAddress("");
        createBlbRequest.setType("");
        createBlbRequest.setEip("");
        createBlbRequest.setTags(new ArrayList<>());
        createBlbRequest.setBilling(null);
        createBlbRequest.setPerformanceLevel("");
        createBlbRequest.setAutoRenewLength(0);
        createBlbRequest.setAutoRenewTimeUnit("");
        createBlbRequest.setResourceGroupId("");
        createBlbRequest.setAllowDelete(false);
        createBlbRequest.setAllowModify(false);
        createBlbRequest.setModificationProtectionReason("");
        createBlbRequest.setAllocateIpv6(false);
        CreateBlbResponse response = blbClient.createBlb(createBlbRequest);
        System.out.println(response);
    }
    /**
     * createBlbHttpListener
     *
     */
    @Test
    public void createBlbHttpListenerTest() {
        CreateBlbHttpListenerRequest createBlbHttpListenerRequest = new CreateBlbHttpListenerRequest();
        createBlbHttpListenerRequest.setBlbId("");
        createBlbHttpListenerRequest.setClientToken("");
        createBlbHttpListenerRequest.setListenerPort(0);
        createBlbHttpListenerRequest.setBackendPort(0);
        createBlbHttpListenerRequest.setScheduler("");
        createBlbHttpListenerRequest.setKeepSession(false);
        createBlbHttpListenerRequest.setKeepSessionType("");
        createBlbHttpListenerRequest.setKeepSessionDuration(0);
        createBlbHttpListenerRequest.setKeepSessionCookieName("");
        createBlbHttpListenerRequest.setXForwardFor(false);
        createBlbHttpListenerRequest.setXForwardedProto(false);
        createBlbHttpListenerRequest.setAdditionalAttributes(null);
        createBlbHttpListenerRequest.setHealthCheckType("");
        createBlbHttpListenerRequest.setHealthCheckPort(0);
        createBlbHttpListenerRequest.setHealthCheckURI("");
        createBlbHttpListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbHttpListenerRequest.setHealthCheckInterval(0);
        createBlbHttpListenerRequest.setUnhealthyThreshold(0);
        createBlbHttpListenerRequest.setHealthyThreshold(0);
        createBlbHttpListenerRequest.setHealthCheckNormalStatus("");
        createBlbHttpListenerRequest.setHealthCheckHost("");
        createBlbHttpListenerRequest.setServerTimeout(0);
        createBlbHttpListenerRequest.setRedirectPort(0);
        blbClient.createBlbHttpListener(createBlbHttpListenerRequest);
    }
    /**
     * createBlbHttpsListener
     *
     */
    @Test
    public void createBlbHttpsListenerTest() {
        CreateBlbHttpsListenerRequest createBlbHttpsListenerRequest = new CreateBlbHttpsListenerRequest();
        createBlbHttpsListenerRequest.setBlbId("");
        createBlbHttpsListenerRequest.setClientToken("");
        createBlbHttpsListenerRequest.setListenerPort(0);
        createBlbHttpsListenerRequest.setBackendPort(0);
        createBlbHttpsListenerRequest.setScheduler("");
        createBlbHttpsListenerRequest.setKeepSession(false);
        createBlbHttpsListenerRequest.setKeepSessionType("");
        createBlbHttpsListenerRequest.setKeepSessionDuration(0);
        createBlbHttpsListenerRequest.setKeepSessionCookieName(0);
        createBlbHttpsListenerRequest.setXForwardFor(false);
        createBlbHttpsListenerRequest.setXForwardedProto(false);
        createBlbHttpsListenerRequest.setAdditionalAttributes(null);
        createBlbHttpsListenerRequest.setHealthCheckType("");
        createBlbHttpsListenerRequest.setHealthCheckPort(0);
        createBlbHttpsListenerRequest.setHealthCheckURI("");
        createBlbHttpsListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbHttpsListenerRequest.setHealthCheckInterval(0);
        createBlbHttpsListenerRequest.setUnhealthyThreshold(0);
        createBlbHttpsListenerRequest.setHealthyThreshold(0);
        createBlbHttpsListenerRequest.setHealthCheckNormalStatus("");
        createBlbHttpsListenerRequest.setHealthCheckHost("");
        createBlbHttpsListenerRequest.setServerTimeout(0);
        createBlbHttpsListenerRequest.setCertIds(new ArrayList<>());
        createBlbHttpsListenerRequest.setEncryptionType("");
        createBlbHttpsListenerRequest.setEncryptionProtocols(new ArrayList<>());
        createBlbHttpsListenerRequest.setAppliedCiphers("");
        createBlbHttpsListenerRequest.setDualAuth(false);
        createBlbHttpsListenerRequest.setClientCertIds(new ArrayList<>());
        createBlbHttpsListenerRequest.setAdditionalCertDomains(new ArrayList<>());
        blbClient.createBlbHttpsListener(createBlbHttpsListenerRequest);
    }
    /**
     * createBlbSslListener
     *
     */
    @Test
    public void createBlbSslListenerTest() {
        CreateBlbSslListenerRequest createBlbSslListenerRequest = new CreateBlbSslListenerRequest();
        createBlbSslListenerRequest.setBlbId("");
        createBlbSslListenerRequest.setClientToken("");
        createBlbSslListenerRequest.setListenerPort(0);
        createBlbSslListenerRequest.setBackendPort(0);
        createBlbSslListenerRequest.setScheduler("");
        createBlbSslListenerRequest.setHealthCheckType("");
        createBlbSslListenerRequest.setServerTimeout(0);
        createBlbSslListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbSslListenerRequest.setHealthCheckInterval(0);
        createBlbSslListenerRequest.setUnhealthyThreshold(0);
        createBlbSslListenerRequest.setHealthyThreshold(0);
        createBlbSslListenerRequest.setCertIds(new ArrayList<>());
        createBlbSslListenerRequest.setEncryptionType("");
        createBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        createBlbSslListenerRequest.setAppliedCiphers("");
        createBlbSslListenerRequest.setDualAuth(false);
        createBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        blbClient.createBlbSslListener(createBlbSslListenerRequest);
    }
    /**
     * createBlbTcpListener
     *
     */
    @Test
    public void createBlbTcpListenerTest() {
        CreateBlbTcpListenerRequest createBlbTcpListenerRequest = new CreateBlbTcpListenerRequest();
        createBlbTcpListenerRequest.setBlbId("");
        createBlbTcpListenerRequest.setClientToken("");
        createBlbTcpListenerRequest.setListenerPort(0);
        createBlbTcpListenerRequest.setBackendPort(0);
        createBlbTcpListenerRequest.setScheduler("");
        createBlbTcpListenerRequest.setTcpSessionTimeout(0);
        createBlbTcpListenerRequest.setHealthCheckType("");
        createBlbTcpListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbTcpListenerRequest.setHealthCheckInterval(0);
        createBlbTcpListenerRequest.setUnhealthyThreshold(0);
        createBlbTcpListenerRequest.setHealthyThreshold(0);
        blbClient.createBlbTcpListener(createBlbTcpListenerRequest);
    }
    /**
     * createBlbUdpListener
     *
     */
    @Test
    public void createBlbUdpListenerTest() {
        CreateBlbUdpListenerRequest createBlbUdpListenerRequest = new CreateBlbUdpListenerRequest();
        createBlbUdpListenerRequest.setBlbId("");
        createBlbUdpListenerRequest.setClientToken("");
        createBlbUdpListenerRequest.setListenerPort(0);
        createBlbUdpListenerRequest.setBackendPort(0);
        createBlbUdpListenerRequest.setScheduler("");
        createBlbUdpListenerRequest.setHealthCheckType("");
        createBlbUdpListenerRequest.setHealthCheckPort(0);
        createBlbUdpListenerRequest.setHealthCheckString("");
        createBlbUdpListenerRequest.setHealthCheckTimeoutInSecond(0);
        createBlbUdpListenerRequest.setHealthCheckInterval(0);
        createBlbUdpListenerRequest.setUnhealthyThreshold(0);
        createBlbUdpListenerRequest.setHealthyThreshold(0);
        createBlbUdpListenerRequest.setUdpSessionTimeout(0);
        blbClient.createBlbUdpListener(createBlbUdpListenerRequest);
    }
    /**
     * createLbdc
     *
     */
    @Test
    public void createLbdcTest() {
        CreateLbdcRequest createLbdcRequest = new CreateLbdcRequest();
        createLbdcRequest.setClientToken("");
        createLbdcRequest.setName("");
        createLbdcRequest.setType("");
        createLbdcRequest.setCcuCount(0);
        createLbdcRequest.setDesc("");
        createLbdcRequest.setBilling(null);
        createLbdcRequest.setRenewReservation(null);
        createLbdcRequest.setTags(new ArrayList<>());
        CreateLbdcResponse response = blbClient.createLbdc(createLbdcRequest);
        System.out.println(response);
    }
    /**
     * createService
     *
     */
    @Test
    public void createServiceTest() {
        CreateServiceRequest createServiceRequest = new CreateServiceRequest();
        createServiceRequest.setClientToken("");
        createServiceRequest.setName("");
        createServiceRequest.setDescription("");
        createServiceRequest.setServiceName("");
        createServiceRequest.setInstanceId("");
        createServiceRequest.setAuthList(new ArrayList<>());
        CreateServiceResponse response = blbClient.createService(createServiceRequest);
        System.out.println(response);
    }
    /**
     * deleteAppBlbIpGroup
     *
     */
    @Test
    public void deleteAppBlbIpGroupTest() {
        DeleteAppBlbIpGroupRequest deleteAppBlbIpGroupRequest = new DeleteAppBlbIpGroupRequest();
        deleteAppBlbIpGroupRequest.setBlbId("");
        deleteAppBlbIpGroupRequest.setClientToken("");
        deleteAppBlbIpGroupRequest.setIpGroupId("");
        blbClient.deleteAppBlbIpGroup(deleteAppBlbIpGroupRequest);
    }
    /**
     * deleteAppBlbIpGroupMember
     *
     */
    @Test
    public void deleteAppBlbIpGroupMemberTest() {
        DeleteAppBlbIpGroupMemberRequest deleteAppBlbIpGroupMemberRequest = new DeleteAppBlbIpGroupMemberRequest();
        deleteAppBlbIpGroupMemberRequest.setBlbId("");
        deleteAppBlbIpGroupMemberRequest.setClientToken("");
        deleteAppBlbIpGroupMemberRequest.setIpGroupId("");
        deleteAppBlbIpGroupMemberRequest.setMemberIdList(new ArrayList<>());
        blbClient.deleteAppBlbIpGroupMember(deleteAppBlbIpGroupMemberRequest);
    }
    /**
     * deleteAppBlbIpGroupProtocol
     *
     */
    @Test
    public void deleteAppBlbIpGroupProtocolTest() {
        DeleteAppBlbIpGroupProtocolRequest deleteAppBlbIpGroupProtocolRequest = new DeleteAppBlbIpGroupProtocolRequest();
        deleteAppBlbIpGroupProtocolRequest.setBlbId("");
        deleteAppBlbIpGroupProtocolRequest.setClientToken("");
        deleteAppBlbIpGroupProtocolRequest.setIpGroupId("");
        deleteAppBlbIpGroupProtocolRequest.setBackendPolicyIdList(new ArrayList<>());
        blbClient.deleteAppBlbIpGroupProtocol(deleteAppBlbIpGroupProtocolRequest);
    }
    /**
     * deleteAppBlbListener
     *
     */
    @Test
    public void deleteAppBlbListenerTest() {
        DeleteAppBlbListenerRequest deleteAppBlbListenerRequest = new DeleteAppBlbListenerRequest();
        deleteAppBlbListenerRequest.setBlbId("");
        deleteAppBlbListenerRequest.setClientToken("");
        deleteAppBlbListenerRequest.setPortList(new ArrayList<>());
        deleteAppBlbListenerRequest.setPortTypeList(new ArrayList<>());
        blbClient.deleteAppBlbListener(deleteAppBlbListenerRequest);
    }
    /**
     * deleteAppBlbPolicy
     *
     */
    @Test
    public void deleteAppBlbPolicyTest() {
        DeleteAppBlbPolicyRequest deleteAppBlbPolicyRequest = new DeleteAppBlbPolicyRequest();
        deleteAppBlbPolicyRequest.setBlbId("");
        deleteAppBlbPolicyRequest.setClientToken("");
        deleteAppBlbPolicyRequest.setPort(0);
        deleteAppBlbPolicyRequest.setPolicyIdList(new ArrayList<>());
        deleteAppBlbPolicyRequest.setType("");
        blbClient.deleteAppBlbPolicy(deleteAppBlbPolicyRequest);
    }
    /**
     * deleteAppBlbServerGroup
     *
     */
    @Test
    public void deleteAppBlbServerGroupTest() {
        DeleteAppBlbServerGroupRequest deleteAppBlbServerGroupRequest = new DeleteAppBlbServerGroupRequest();
        deleteAppBlbServerGroupRequest.setBlbId("");
        deleteAppBlbServerGroupRequest.setClientToken("");
        deleteAppBlbServerGroupRequest.setSgId("");
        blbClient.deleteAppBlbServerGroup(deleteAppBlbServerGroupRequest);
    }
    /**
     * deleteAppBlbServerGroupPort
     *
     */
    @Test
    public void deleteAppBlbServerGroupPortTest() {
        DeleteAppBlbServerGroupPortRequest deleteAppBlbServerGroupPortRequest = new DeleteAppBlbServerGroupPortRequest();
        deleteAppBlbServerGroupPortRequest.setBlbId("");
        deleteAppBlbServerGroupPortRequest.setClientToken("");
        deleteAppBlbServerGroupPortRequest.setSgId("");
        deleteAppBlbServerGroupPortRequest.setPortIdList(new ArrayList<>());
        blbClient.deleteAppBlbServerGroupPort(deleteAppBlbServerGroupPortRequest);
    }
    /**
     * deleteAppBlbServerGroupRs
     *
     */
    @Test
    public void deleteAppBlbServerGroupRsTest() {
        DeleteAppBlbServerGroupRsRequest deleteAppBlbServerGroupRsRequest = new DeleteAppBlbServerGroupRsRequest();
        deleteAppBlbServerGroupRsRequest.setBlbId("");
        deleteAppBlbServerGroupRsRequest.setClientToken("");
        deleteAppBlbServerGroupRsRequest.setSgId("");
        deleteAppBlbServerGroupRsRequest.setBackendServerIdList(new ArrayList<>());
        blbClient.deleteAppBlbServerGroupRs(deleteAppBlbServerGroupRsRequest);
    }
    /**
     * deleteBlbListener
     *
     */
    @Test
    public void deleteBlbListenerTest() {
        DeleteBlbListenerRequest deleteBlbListenerRequest = new DeleteBlbListenerRequest();
        deleteBlbListenerRequest.setBlbId("");
        deleteBlbListenerRequest.setClientToken("");
        deleteBlbListenerRequest.setPortList(new ArrayList<>());
        deleteBlbListenerRequest.setPortTypeList(new ArrayList<>());
        blbClient.deleteBlbListener(deleteBlbListenerRequest);
    }
    /**
     * deleteBlbServer
     *
     */
    @Test
    public void deleteBlbServerTest() {
        DeleteBlbServerRequest deleteBlbServerRequest = new DeleteBlbServerRequest();
        deleteBlbServerRequest.setBlbId("");
        deleteBlbServerRequest.setClientToken("");
        deleteBlbServerRequest.setBackendServerList(new ArrayList<>());
        blbClient.deleteBlbServer(deleteBlbServerRequest);
    }
    /**
     * deleteService
     *
     */
    @Test
    public void deleteServiceTest() {
        DeleteServiceRequest deleteServiceRequest = new DeleteServiceRequest();
        deleteServiceRequest.setService("");
        deleteServiceRequest.setClientToken("");
        blbClient.deleteService(deleteServiceRequest);
    }
    /**
     * deleteServiceAuth
     *
     */
    @Test
    public void deleteServiceAuthTest() {
        DeleteServiceAuthRequest deleteServiceAuthRequest = new DeleteServiceAuthRequest();
        deleteServiceAuthRequest.setService("");
        deleteServiceAuthRequest.setAction("");
        deleteServiceAuthRequest.setClientToken("");
        deleteServiceAuthRequest.setUidList(new ArrayList<>());
        blbClient.deleteServiceAuth(deleteServiceAuthRequest);
    }
    /**
     * describeAppBlb
     *
     */
    @Test
    public void describeAppBlbTest() {
        DescribeAppBlbRequest describeAppBlbRequest = new DescribeAppBlbRequest();
        describeAppBlbRequest.setBlbId("");
        DescribeAppBlbResponse response = blbClient.describeAppBlb(describeAppBlbRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbHttpListener
     *
     */
    @Test
    public void describeAppBlbHttpListenerTest() {
        DescribeAppBlbHttpListenerRequest describeAppBlbHttpListenerRequest = new DescribeAppBlbHttpListenerRequest();
        describeAppBlbHttpListenerRequest.setBlbId("");
        describeAppBlbHttpListenerRequest.setListenerPort(0);
        describeAppBlbHttpListenerRequest.setMarker("");
        describeAppBlbHttpListenerRequest.setMaxKeys(0);
        DescribeAppBlbHttpListenerResponse response = blbClient.describeAppBlbHttpListener(describeAppBlbHttpListenerRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbHttpsListener
     *
     */
    @Test
    public void describeAppBlbHttpsListenerTest() {
        DescribeAppBlbHttpsListenerRequest describeAppBlbHttpsListenerRequest = new DescribeAppBlbHttpsListenerRequest();
        describeAppBlbHttpsListenerRequest.setBlbId("");
        describeAppBlbHttpsListenerRequest.setListenerPort(0);
        describeAppBlbHttpsListenerRequest.setMarker("");
        describeAppBlbHttpsListenerRequest.setMaxKeys(0);
        DescribeAppBlbHttpsListenerResponse response = blbClient.describeAppBlbHttpsListener(describeAppBlbHttpsListenerRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbIpGroup
     *
     */
    @Test
    public void describeAppBlbIpGroupTest() {
        DescribeAppBlbIpGroupRequest describeAppBlbIpGroupRequest = new DescribeAppBlbIpGroupRequest();
        describeAppBlbIpGroupRequest.setBlbId("");
        describeAppBlbIpGroupRequest.setName("");
        describeAppBlbIpGroupRequest.setExactlyMatch(false);
        describeAppBlbIpGroupRequest.setMarker("");
        describeAppBlbIpGroupRequest.setMaxKeys(0);
        DescribeAppBlbIpGroupResponse response = blbClient.describeAppBlbIpGroup(describeAppBlbIpGroupRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbIpGroupMember
     *
     */
    @Test
    public void describeAppBlbIpGroupMemberTest() {
        DescribeAppBlbIpGroupMemberRequest describeAppBlbIpGroupMemberRequest = new DescribeAppBlbIpGroupMemberRequest();
        describeAppBlbIpGroupMemberRequest.setBlbId("");
        describeAppBlbIpGroupMemberRequest.setIpGroupId("");
        describeAppBlbIpGroupMemberRequest.setMarker("");
        describeAppBlbIpGroupMemberRequest.setMaxKeys(0);
        DescribeAppBlbIpGroupMemberResponse response = blbClient.describeAppBlbIpGroupMember(describeAppBlbIpGroupMemberRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbListener
     *
     */
    @Test
    public void describeAppBlbListenerTest() {
        DescribeAppBlbListenerRequest describeAppBlbListenerRequest = new DescribeAppBlbListenerRequest();
        describeAppBlbListenerRequest.setBlbId("");
        describeAppBlbListenerRequest.setListenerPort(0);
        describeAppBlbListenerRequest.setMarker("");
        describeAppBlbListenerRequest.setMaxKeys(0);
        DescribeAppBlbListenerResponse response = blbClient.describeAppBlbListener(describeAppBlbListenerRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbPolicy
     *
     */
    @Test
    public void describeAppBlbPolicyTest() {
        DescribeAppBlbPolicyRequest describeAppBlbPolicyRequest = new DescribeAppBlbPolicyRequest();
        describeAppBlbPolicyRequest.setBlbId("");
        describeAppBlbPolicyRequest.setPort(0);
        describeAppBlbPolicyRequest.setType("");
        describeAppBlbPolicyRequest.setMarker("");
        describeAppBlbPolicyRequest.setMaxKeys(0);
        DescribeAppBlbPolicyResponse response = blbClient.describeAppBlbPolicy(describeAppBlbPolicyRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbServerGroup
     *
     */
    @Test
    public void describeAppBlbServerGroupTest() {
        DescribeAppBlbServerGroupRequest describeAppBlbServerGroupRequest = new DescribeAppBlbServerGroupRequest();
        describeAppBlbServerGroupRequest.setBlbId("");
        describeAppBlbServerGroupRequest.setName("");
        describeAppBlbServerGroupRequest.setExactlyMatch(false);
        describeAppBlbServerGroupRequest.setMarker("");
        describeAppBlbServerGroupRequest.setMaxKeys(0);
        DescribeAppBlbServerGroupResponse response = blbClient.describeAppBlbServerGroup(describeAppBlbServerGroupRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbServerGroupMountRs
     *
     */
    @Test
    public void describeAppBlbServerGroupMountRsTest() {
        DescribeAppBlbServerGroupMountRsRequest describeAppBlbServerGroupMountRsRequest = new DescribeAppBlbServerGroupMountRsRequest();
        describeAppBlbServerGroupMountRsRequest.setBlbId("");
        describeAppBlbServerGroupMountRsRequest.setSgId("");
        DescribeAppBlbServerGroupMountRsResponse response = blbClient.describeAppBlbServerGroupMountRs(describeAppBlbServerGroupMountRsRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbServerGroupRs
     *
     */
    @Test
    public void describeAppBlbServerGroupRsTest() {
        DescribeAppBlbServerGroupRsRequest describeAppBlbServerGroupRsRequest = new DescribeAppBlbServerGroupRsRequest();
        describeAppBlbServerGroupRsRequest.setBlbId("");
        describeAppBlbServerGroupRsRequest.setSgId("");
        describeAppBlbServerGroupRsRequest.setMarker("");
        describeAppBlbServerGroupRsRequest.setMaxKeys(0);
        DescribeAppBlbServerGroupRsResponse response = blbClient.describeAppBlbServerGroupRs(describeAppBlbServerGroupRsRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbServerGroupUnmountRs
     *
     */
    @Test
    public void describeAppBlbServerGroupUnmountRsTest() {
        DescribeAppBlbServerGroupUnmountRsRequest describeAppBlbServerGroupUnmountRsRequest = new DescribeAppBlbServerGroupUnmountRsRequest();
        describeAppBlbServerGroupUnmountRsRequest.setBlbId("");
        describeAppBlbServerGroupUnmountRsRequest.setSgId("");
        DescribeAppBlbServerGroupUnmountRsResponse response = blbClient.describeAppBlbServerGroupUnmountRs(describeAppBlbServerGroupUnmountRsRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbSslListener
     *
     */
    @Test
    public void describeAppBlbSslListenerTest() {
        DescribeAppBlbSslListenerRequest describeAppBlbSslListenerRequest = new DescribeAppBlbSslListenerRequest();
        describeAppBlbSslListenerRequest.setBlbId("");
        describeAppBlbSslListenerRequest.setListenerPort(0);
        describeAppBlbSslListenerRequest.setMarker("");
        describeAppBlbSslListenerRequest.setMaxKeys(0);
        DescribeAppBlbSslListenerResponse response = blbClient.describeAppBlbSslListener(describeAppBlbSslListenerRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbTcpListener
     *
     */
    @Test
    public void describeAppBlbTcpListenerTest() {
        DescribeAppBlbTcpListenerRequest describeAppBlbTcpListenerRequest = new DescribeAppBlbTcpListenerRequest();
        describeAppBlbTcpListenerRequest.setBlbId("");
        describeAppBlbTcpListenerRequest.setListenerPort(0);
        describeAppBlbTcpListenerRequest.setMarker("");
        describeAppBlbTcpListenerRequest.setMaxKeys(0);
        DescribeAppBlbTcpListenerResponse response = blbClient.describeAppBlbTcpListener(describeAppBlbTcpListenerRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbUdpListener
     *
     */
    @Test
    public void describeAppBlbUdpListenerTest() {
        DescribeAppBlbUdpListenerRequest describeAppBlbUdpListenerRequest = new DescribeAppBlbUdpListenerRequest();
        describeAppBlbUdpListenerRequest.setBlbId("");
        describeAppBlbUdpListenerRequest.setListenerPort(0);
        describeAppBlbUdpListenerRequest.setMarker("");
        describeAppBlbUdpListenerRequest.setMaxKeys(0);
        DescribeAppBlbUdpListenerResponse response = blbClient.describeAppBlbUdpListener(describeAppBlbUdpListenerRequest);
        System.out.println(response);
    }
    /**
     * describeAppBlbs
     *
     */
    @Test
    public void describeAppBlbsTest() {
        DescribeAppBlbsRequest describeAppBlbsRequest = new DescribeAppBlbsRequest();
        describeAppBlbsRequest.setAddress("");
        describeAppBlbsRequest.setName("");
        describeAppBlbsRequest.setBlbId("");
        describeAppBlbsRequest.setBccId("");
        describeAppBlbsRequest.setExactlyMatch(false);
        describeAppBlbsRequest.setMarker("");
        describeAppBlbsRequest.setMaxKeys(0);
        describeAppBlbsRequest.setType("");
        DescribeAppBlbsResponse response = blbClient.describeAppBlbs(describeAppBlbsRequest);
        System.out.println(response);
    }
    /**
     * describeBlb
     *
     */
    @Test
    public void describeBlbTest() {
        DescribeBlbRequest describeBlbRequest = new DescribeBlbRequest();
        describeBlbRequest.setBlbId("");
        describeBlbRequest.setType("");
        DescribeBlbResponse response = blbClient.describeBlb(describeBlbRequest);
        System.out.println(response);
    }
    /**
     * describeBlbEnterpriseSecurityGroups
     *
     */
    @Test
    public void describeBlbEnterpriseSecurityGroupsTest() {
        DescribeBlbEnterpriseSecurityGroupsRequest describeBlbEnterpriseSecurityGroupsRequest = new DescribeBlbEnterpriseSecurityGroupsRequest();
        describeBlbEnterpriseSecurityGroupsRequest.setBlbId("");
        DescribeBlbEnterpriseSecurityGroupsResponse response = blbClient.describeBlbEnterpriseSecurityGroups(describeBlbEnterpriseSecurityGroupsRequest);
        System.out.println(response);
    }
    /**
     * describeBlbHttpListener
     *
     */
    @Test
    public void describeBlbHttpListenerTest() {
        DescribeBlbHttpListenerRequest describeBlbHttpListenerRequest = new DescribeBlbHttpListenerRequest();
        describeBlbHttpListenerRequest.setBlbId("");
        describeBlbHttpListenerRequest.setListenerPort(0);
        describeBlbHttpListenerRequest.setMarker("");
        describeBlbHttpListenerRequest.setMaxKeys(0);
        DescribeBlbHttpListenerResponse response = blbClient.describeBlbHttpListener(describeBlbHttpListenerRequest);
        System.out.println(response);
    }
    /**
     * describeBlbHttpsListener
     *
     */
    @Test
    public void describeBlbHttpsListenerTest() {
        DescribeBlbHttpsListenerRequest describeBlbHttpsListenerRequest = new DescribeBlbHttpsListenerRequest();
        describeBlbHttpsListenerRequest.setBlbId("");
        describeBlbHttpsListenerRequest.setListenerPort(0);
        describeBlbHttpsListenerRequest.setMarker("");
        describeBlbHttpsListenerRequest.setMaxKeys(0);
        DescribeBlbHttpsListenerResponse response = blbClient.describeBlbHttpsListener(describeBlbHttpsListenerRequest);
        System.out.println(response);
    }
    /**
     * describeBlbListener
     *
     */
    @Test
    public void describeBlbListenerTest() {
        DescribeBlbListenerRequest describeBlbListenerRequest = new DescribeBlbListenerRequest();
        describeBlbListenerRequest.setBlbId("");
        describeBlbListenerRequest.setListenerPort(0);
        describeBlbListenerRequest.setMarker("");
        describeBlbListenerRequest.setMaxKeys(0);
        DescribeBlbListenerResponse response = blbClient.describeBlbListener(describeBlbListenerRequest);
        System.out.println(response);
    }
    /**
     * describeBlbSecurityGroups
     *
     */
    @Test
    public void describeBlbSecurityGroupsTest() {
        DescribeBlbSecurityGroupsRequest describeBlbSecurityGroupsRequest = new DescribeBlbSecurityGroupsRequest();
        describeBlbSecurityGroupsRequest.setBlbId("");
        DescribeBlbSecurityGroupsResponse response = blbClient.describeBlbSecurityGroups(describeBlbSecurityGroupsRequest);
        System.out.println(response);
    }
    /**
     * describeBlbServerHealth
     *
     */
    @Test
    public void describeBlbServerHealthTest() {
        DescribeBlbServerHealthRequest describeBlbServerHealthRequest = new DescribeBlbServerHealthRequest();
        describeBlbServerHealthRequest.setBlbId("");
        describeBlbServerHealthRequest.setListenerPort(0);
        describeBlbServerHealthRequest.setMarker("");
        describeBlbServerHealthRequest.setMaxKeys(0);
        DescribeBlbServerHealthResponse response = blbClient.describeBlbServerHealth(describeBlbServerHealthRequest);
        System.out.println(response);
    }
    /**
     * describeBlbServers
     *
     */
    @Test
    public void describeBlbServersTest() {
        DescribeBlbServersRequest describeBlbServersRequest = new DescribeBlbServersRequest();
        describeBlbServersRequest.setBlbId("");
        describeBlbServersRequest.setMarker("");
        describeBlbServersRequest.setMaxKeys(0);
        DescribeBlbServersResponse response = blbClient.describeBlbServers(describeBlbServersRequest);
        System.out.println(response);
    }
    /**
     * describeBlbSslListener
     *
     */
    @Test
    public void describeBlbSslListenerTest() {
        DescribeBlbSslListenerRequest describeBlbSslListenerRequest = new DescribeBlbSslListenerRequest();
        describeBlbSslListenerRequest.setBlbId("");
        describeBlbSslListenerRequest.setListenerPort(0);
        describeBlbSslListenerRequest.setMarker("");
        describeBlbSslListenerRequest.setMaxKeys(0);
        DescribeBlbSslListenerResponse response = blbClient.describeBlbSslListener(describeBlbSslListenerRequest);
        System.out.println(response);
    }
    /**
     * describeBlbTcpListener
     *
     */
    @Test
    public void describeBlbTcpListenerTest() {
        DescribeBlbTcpListenerRequest describeBlbTcpListenerRequest = new DescribeBlbTcpListenerRequest();
        describeBlbTcpListenerRequest.setBlbId("");
        describeBlbTcpListenerRequest.setListenerPort(0);
        describeBlbTcpListenerRequest.setMarker("");
        describeBlbTcpListenerRequest.setMaxKeys(0);
        DescribeBlbTcpListenerResponse response = blbClient.describeBlbTcpListener(describeBlbTcpListenerRequest);
        System.out.println(response);
    }
    /**
     * describeBlbUdpListener
     *
     */
    @Test
    public void describeBlbUdpListenerTest() {
        DescribeBlbUdpListenerRequest describeBlbUdpListenerRequest = new DescribeBlbUdpListenerRequest();
        describeBlbUdpListenerRequest.setBlbId("");
        describeBlbUdpListenerRequest.setListenerPort(0);
        describeBlbUdpListenerRequest.setMarker("");
        describeBlbUdpListenerRequest.setMaxKeys(0);
        DescribeBlbUdpListenerResponse response = blbClient.describeBlbUdpListener(describeBlbUdpListenerRequest);
        System.out.println(response);
    }
    /**
     * describeBlbs
     *
     */
    @Test
    public void describeBlbsTest() {
        DescribeBlbsRequest describeBlbsRequest = new DescribeBlbsRequest();
        describeBlbsRequest.setAddress("");
        describeBlbsRequest.setName("");
        describeBlbsRequest.setBlbId("");
        describeBlbsRequest.setBccId("");
        describeBlbsRequest.setExactlyMatch(false);
        describeBlbsRequest.setMarker("");
        describeBlbsRequest.setMaxKeys(0);
        describeBlbsRequest.setType("");
        DescribeBlbsResponse response = blbClient.describeBlbs(describeBlbsRequest);
        System.out.println(response);
    }
    /**
     * describeLbdc
     *
     */
    @Test
    public void describeLbdcTest() {
        DescribeLbdcRequest describeLbdcRequest = new DescribeLbdcRequest();
        describeLbdcRequest.setId("");
        DescribeLbdcResponse response = blbClient.describeLbdc(describeLbdcRequest);
        System.out.println(response);
    }
    /**
     * describeLbdcBlb
     *
     */
    @Test
    public void describeLbdcBlbTest() {
        DescribeLbdcBlbRequest describeLbdcBlbRequest = new DescribeLbdcBlbRequest();
        describeLbdcBlbRequest.setId("");
        DescribeLbdcBlbResponse response = blbClient.describeLbdcBlb(describeLbdcBlbRequest);
        System.out.println(response);
    }
    /**
     * describeLbdcs
     *
     */
    @Test
    public void describeLbdcsTest() {
        DescribeLbdcsRequest describeLbdcsRequest = new DescribeLbdcsRequest();
        describeLbdcsRequest.setId("");
        describeLbdcsRequest.setName("");
        DescribeLbdcsResponse response = blbClient.describeLbdcs(describeLbdcsRequest);
        System.out.println(response);
    }
    /**
     * describeService
     *
     */
    @Test
    public void describeServiceTest() {
        DescribeServiceRequest describeServiceRequest = new DescribeServiceRequest();
        describeServiceRequest.setService("");
        DescribeServiceResponse response = blbClient.describeService(describeServiceRequest);
        System.out.println(response);
    }
    /**
     * describeServices
     *
     */
    @Test
    public void describeServicesTest() {
        DescribeServicesRequest describeServicesRequest = new DescribeServicesRequest();
        describeServicesRequest.setMarker("");
        DescribeServicesResponse response = blbClient.describeServices(describeServicesRequest);
        System.out.println(response);
    }
    /**
     * refundBlb
     *
     */
    @Test
    public void refundBlbTest() {
        RefundBlbRequest refundBlbRequest = new RefundBlbRequest();
        refundBlbRequest.setBlbId("");
        refundBlbRequest.setClientToken("");
        blbClient.refundBlb(refundBlbRequest);
    }
    /**
     * releaseAppBlb
     *
     */
    @Test
    public void releaseAppBlbTest() {
        ReleaseAppBlbRequest releaseAppBlbRequest = new ReleaseAppBlbRequest();
        releaseAppBlbRequest.setBlbId("");
        releaseAppBlbRequest.setClientToken("");
        blbClient.releaseAppBlb(releaseAppBlbRequest);
    }
    /**
     * releaseBlb
     *
     */
    @Test
    public void releaseBlbTest() {
        ReleaseBlbRequest releaseBlbRequest = new ReleaseBlbRequest();
        releaseBlbRequest.setBlbId("");
        releaseBlbRequest.setClientToken("");
        blbClient.releaseBlb(releaseBlbRequest);
    }
    /**
     * renewLbdc
     *
     */
    @Test
    public void renewLbdcTest() {
        RenewLbdcRequest renewLbdcRequest = new RenewLbdcRequest();
        renewLbdcRequest.setId("");
        renewLbdcRequest.setClientToken("");
        renewLbdcRequest.setBilling(null);
        blbClient.renewLbdc(renewLbdcRequest);
    }
    /**
     * resizeBlb
     *
     */
    @Test
    public void resizeBlbTest() {
        ResizeBlbRequest resizeBlbRequest = new ResizeBlbRequest();
        resizeBlbRequest.setBlbId("");
        resizeBlbRequest.setClientToken("");
        resizeBlbRequest.setPerformanceLevel("");
        ResizeBlbResponse response = blbClient.resizeBlb(resizeBlbRequest);
        System.out.println(response);
    }
    /**
     * unbindBlbEnterpriseSecurityGroup
     *
     */
    @Test
    public void unbindBlbEnterpriseSecurityGroupTest() {
        UnbindBlbEnterpriseSecurityGroupRequest unbindBlbEnterpriseSecurityGroupRequest = new UnbindBlbEnterpriseSecurityGroupRequest();
        unbindBlbEnterpriseSecurityGroupRequest.setBlbId("");
        unbindBlbEnterpriseSecurityGroupRequest.setClientToken("");
        unbindBlbEnterpriseSecurityGroupRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        blbClient.unbindBlbEnterpriseSecurityGroup(unbindBlbEnterpriseSecurityGroupRequest);
    }
    /**
     * unbindBlbSecurityGroup
     *
     */
    @Test
    public void unbindBlbSecurityGroupTest() {
        UnbindBlbSecurityGroupRequest unbindBlbSecurityGroupRequest = new UnbindBlbSecurityGroupRequest();
        unbindBlbSecurityGroupRequest.setBlbId("");
        unbindBlbSecurityGroupRequest.setClientToken("");
        unbindBlbSecurityGroupRequest.setSecurityGroupIds(new ArrayList<>());
        blbClient.unbindBlbSecurityGroup(unbindBlbSecurityGroupRequest);
    }
    /**
     * unbindInstanceFromService
     *
     */
    @Test
    public void unbindInstanceFromServiceTest() {
        UnbindInstanceFromServiceRequest unbindInstanceFromServiceRequest = new UnbindInstanceFromServiceRequest();
        unbindInstanceFromServiceRequest.setService("");
        unbindInstanceFromServiceRequest.setClientToken("");
        blbClient.unbindInstanceFromService(unbindInstanceFromServiceRequest);
    }
    /**
     * updateAppBlb
     *
     */
    @Test
    public void updateAppBlbTest() {
        UpdateAppBlbRequest updateAppBlbRequest = new UpdateAppBlbRequest();
        updateAppBlbRequest.setBlbId("");
        updateAppBlbRequest.setClientToken("");
        updateAppBlbRequest.setName("");
        updateAppBlbRequest.setDesc("");
        updateAppBlbRequest.setAllowDelete(false);
        updateAppBlbRequest.setAllocateIpv6(false);
        blbClient.updateAppBlb(updateAppBlbRequest);
    }
    /**
     * updateAppBlbHttpListener
     *
     */
    @Test
    public void updateAppBlbHttpListenerTest() {
        UpdateAppBlbHttpListenerRequest updateAppBlbHttpListenerRequest = new UpdateAppBlbHttpListenerRequest();
        updateAppBlbHttpListenerRequest.setBlbId("");
        updateAppBlbHttpListenerRequest.setListenerPort(0);
        updateAppBlbHttpListenerRequest.setClientToken("");
        updateAppBlbHttpListenerRequest.setScheduler("");
        updateAppBlbHttpListenerRequest.setKeepSession(false);
        updateAppBlbHttpListenerRequest.setKeepSessionType("");
        updateAppBlbHttpListenerRequest.setKeepSessionTimeout(0);
        updateAppBlbHttpListenerRequest.setKeepSessionCookieName("");
        updateAppBlbHttpListenerRequest.setXForwardedFor(false);
        updateAppBlbHttpListenerRequest.setXForwardedProto(false);
        updateAppBlbHttpListenerRequest.setAdditionalAttributes(null);
        updateAppBlbHttpListenerRequest.setServerTimeout(0);
        updateAppBlbHttpListenerRequest.setRedirectPort(0);
        updateAppBlbHttpListenerRequest.setDescription("");
        blbClient.updateAppBlbHttpListener(updateAppBlbHttpListenerRequest);
    }
    /**
     * updateAppBlbHttpsListener
     *
     */
    @Test
    public void updateAppBlbHttpsListenerTest() {
        UpdateAppBlbHttpsListenerRequest updateAppBlbHttpsListenerRequest = new UpdateAppBlbHttpsListenerRequest();
        updateAppBlbHttpsListenerRequest.setBlbId("");
        updateAppBlbHttpsListenerRequest.setListenerPort(0);
        updateAppBlbHttpsListenerRequest.setClientToken("");
        updateAppBlbHttpsListenerRequest.setScheduler("");
        updateAppBlbHttpsListenerRequest.setKeepSession(false);
        updateAppBlbHttpsListenerRequest.setKeepSessionType("");
        updateAppBlbHttpsListenerRequest.setKeepSessionTimeout(0);
        updateAppBlbHttpsListenerRequest.setKeepSessionCookieName("");
        updateAppBlbHttpsListenerRequest.setXForwardedFor(false);
        updateAppBlbHttpsListenerRequest.setXForwardedProto(false);
        updateAppBlbHttpsListenerRequest.setServerTimeout(0);
        updateAppBlbHttpsListenerRequest.setCertIds(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setEncryptionType("");
        updateAppBlbHttpsListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setAppliedCiphers("");
        updateAppBlbHttpsListenerRequest.setDualAuth(false);
        updateAppBlbHttpsListenerRequest.setClientCertIds(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setAdditionalCertDomains(new ArrayList<>());
        updateAppBlbHttpsListenerRequest.setDescription("");
        blbClient.updateAppBlbHttpsListener(updateAppBlbHttpsListenerRequest);
    }
    /**
     * updateAppBlbIpGroup
     *
     */
    @Test
    public void updateAppBlbIpGroupTest() {
        UpdateAppBlbIpGroupRequest updateAppBlbIpGroupRequest = new UpdateAppBlbIpGroupRequest();
        updateAppBlbIpGroupRequest.setBlbId("");
        updateAppBlbIpGroupRequest.setClientToken("");
        updateAppBlbIpGroupRequest.setIpGroupId("");
        updateAppBlbIpGroupRequest.setName("");
        updateAppBlbIpGroupRequest.setDesc("");
        blbClient.updateAppBlbIpGroup(updateAppBlbIpGroupRequest);
    }
    /**
     * updateAppBlbIpGroupMember
     *
     */
    @Test
    public void updateAppBlbIpGroupMemberTest() {
        UpdateAppBlbIpGroupMemberRequest updateAppBlbIpGroupMemberRequest = new UpdateAppBlbIpGroupMemberRequest();
        updateAppBlbIpGroupMemberRequest.setBlbId("");
        updateAppBlbIpGroupMemberRequest.setClientToken("");
        updateAppBlbIpGroupMemberRequest.setIpGroupId("");
        updateAppBlbIpGroupMemberRequest.setMemberList(new ArrayList<>());
        blbClient.updateAppBlbIpGroupMember(updateAppBlbIpGroupMemberRequest);
    }
    /**
     * updateAppBlbIpGroupProtocol
     *
     */
    @Test
    public void updateAppBlbIpGroupProtocolTest() {
        UpdateAppBlbIpGroupProtocolRequest updateAppBlbIpGroupProtocolRequest = new UpdateAppBlbIpGroupProtocolRequest();
        updateAppBlbIpGroupProtocolRequest.setBlbId("");
        updateAppBlbIpGroupProtocolRequest.setClientToken("");
        updateAppBlbIpGroupProtocolRequest.setIpGroupId("");
        updateAppBlbIpGroupProtocolRequest.setId("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheck("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckPort(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckUrlPath("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckTimeoutInSecond(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckIntervalInSecond(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckDownRetry(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckUpRetry(0);
        updateAppBlbIpGroupProtocolRequest.setHealthCheckNormalStatus("");
        updateAppBlbIpGroupProtocolRequest.setHealthCheckHost("");
        updateAppBlbIpGroupProtocolRequest.setUdpHealthCheckString("");
        blbClient.updateAppBlbIpGroupProtocol(updateAppBlbIpGroupProtocolRequest);
    }
    /**
     * updateAppBlbPolicy
     *
     */
    @Test
    public void updateAppBlbPolicyTest() {
        UpdateAppBlbPolicyRequest updateAppBlbPolicyRequest = new UpdateAppBlbPolicyRequest();
        updateAppBlbPolicyRequest.setBlbId("");
        updateAppBlbPolicyRequest.setClientToken("");
        updateAppBlbPolicyRequest.setPort(0);
        updateAppBlbPolicyRequest.setType("");
        updateAppBlbPolicyRequest.setPolicyList(new ArrayList<>());
        blbClient.updateAppBlbPolicy(updateAppBlbPolicyRequest);
    }
    /**
     * updateAppBlbServerGroup
     *
     */
    @Test
    public void updateAppBlbServerGroupTest() {
        UpdateAppBlbServerGroupRequest updateAppBlbServerGroupRequest = new UpdateAppBlbServerGroupRequest();
        updateAppBlbServerGroupRequest.setBlbId("");
        updateAppBlbServerGroupRequest.setClientToken("");
        updateAppBlbServerGroupRequest.setSgId("");
        updateAppBlbServerGroupRequest.setName("");
        updateAppBlbServerGroupRequest.setDesc("");
        blbClient.updateAppBlbServerGroup(updateAppBlbServerGroupRequest);
    }
    /**
     * updateAppBlbServerGroupPort
     *
     */
    @Test
    public void updateAppBlbServerGroupPortTest() {
        UpdateAppBlbServerGroupPortRequest updateAppBlbServerGroupPortRequest = new UpdateAppBlbServerGroupPortRequest();
        updateAppBlbServerGroupPortRequest.setBlbId("");
        updateAppBlbServerGroupPortRequest.setClientToken("");
        updateAppBlbServerGroupPortRequest.setSgId("");
        updateAppBlbServerGroupPortRequest.setPortId("");
        updateAppBlbServerGroupPortRequest.setEnableHealthCheck(false);
        updateAppBlbServerGroupPortRequest.setHealthCheck("");
        updateAppBlbServerGroupPortRequest.setHealthCheckPort(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckUrlPath("");
        updateAppBlbServerGroupPortRequest.setHealthCheckTimeoutInSecond(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckIntervalInSecond(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckDownRetry(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckUpRetry(0);
        updateAppBlbServerGroupPortRequest.setHealthCheckNormalStatus("");
        updateAppBlbServerGroupPortRequest.setHealthCheckHost("");
        updateAppBlbServerGroupPortRequest.setUdpHealthCheckString("");
        blbClient.updateAppBlbServerGroupPort(updateAppBlbServerGroupPortRequest);
    }
    /**
     * updateAppBlbServerGroupRs
     *
     */
    @Test
    public void updateAppBlbServerGroupRsTest() {
        UpdateAppBlbServerGroupRsRequest updateAppBlbServerGroupRsRequest = new UpdateAppBlbServerGroupRsRequest();
        updateAppBlbServerGroupRsRequest.setBlbId("");
        updateAppBlbServerGroupRsRequest.setClientToken("");
        updateAppBlbServerGroupRsRequest.setSgId("");
        updateAppBlbServerGroupRsRequest.setBackendServerList(new ArrayList<>());
        blbClient.updateAppBlbServerGroupRs(updateAppBlbServerGroupRsRequest);
    }
    /**
     * updateAppBlbSslListener
     *
     */
    @Test
    public void updateAppBlbSslListenerTest() {
        UpdateAppBlbSslListenerRequest updateAppBlbSslListenerRequest = new UpdateAppBlbSslListenerRequest();
        updateAppBlbSslListenerRequest.setBlbId("");
        updateAppBlbSslListenerRequest.setListenerPort(0);
        updateAppBlbSslListenerRequest.setClientToken("");
        updateAppBlbSslListenerRequest.setScheduler("");
        updateAppBlbSslListenerRequest.setCertIds(new ArrayList<>());
        updateAppBlbSslListenerRequest.setEncryptionType("");
        updateAppBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateAppBlbSslListenerRequest.setAppliedCiphers("");
        updateAppBlbSslListenerRequest.setDualAuth(false);
        updateAppBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        updateAppBlbSslListenerRequest.setDescription("");
        blbClient.updateAppBlbSslListener(updateAppBlbSslListenerRequest);
    }
    /**
     * updateAppBlbTcpListener
     *
     */
    @Test
    public void updateAppBlbTcpListenerTest() {
        UpdateAppBlbTcpListenerRequest updateAppBlbTcpListenerRequest = new UpdateAppBlbTcpListenerRequest();
        updateAppBlbTcpListenerRequest.setBlbId("");
        updateAppBlbTcpListenerRequest.setListenerPort(0);
        updateAppBlbTcpListenerRequest.setClientToken("");
        updateAppBlbTcpListenerRequest.setScheduler("");
        updateAppBlbTcpListenerRequest.setTcpSessionTimeout(0);
        updateAppBlbTcpListenerRequest.setDescription("");
        blbClient.updateAppBlbTcpListener(updateAppBlbTcpListenerRequest);
    }
    /**
     * updateAppBlbUdpListener
     *
     */
    @Test
    public void updateAppBlbUdpListenerTest() {
        UpdateAppBlbUdpListenerRequest updateAppBlbUdpListenerRequest = new UpdateAppBlbUdpListenerRequest();
        updateAppBlbUdpListenerRequest.setBlbId("");
        updateAppBlbUdpListenerRequest.setListenerPort(0);
        updateAppBlbUdpListenerRequest.setClientToken("");
        updateAppBlbUdpListenerRequest.setScheduler("");
        updateAppBlbUdpListenerRequest.setUdpSessionTimeout(0);
        updateAppBlbUdpListenerRequest.setDescription("");
        blbClient.updateAppBlbUdpListener(updateAppBlbUdpListenerRequest);
    }
    /**
     * updateBlb
     *
     */
    @Test
    public void updateBlbTest() {
        UpdateBlbRequest updateBlbRequest = new UpdateBlbRequest();
        updateBlbRequest.setBlbId("");
        updateBlbRequest.setClientToken("");
        updateBlbRequest.setName("");
        updateBlbRequest.setDesc("");
        updateBlbRequest.setAllowDelete(false);
        updateBlbRequest.setAllocateIpv6(false);
        blbClient.updateBlb(updateBlbRequest);
    }
    /**
     * updateBlbAcl
     *
     */
    @Test
    public void updateBlbAclTest() {
        UpdateBlbAclRequest updateBlbAclRequest = new UpdateBlbAclRequest();
        updateBlbAclRequest.setBlbId("");
        updateBlbAclRequest.setClientToken("");
        updateBlbAclRequest.setSupportAcl(false);
        blbClient.updateBlbAcl(updateBlbAclRequest);
    }
    /**
     * updateBlbHttpListener
     *
     */
    @Test
    public void updateBlbHttpListenerTest() {
        UpdateBlbHttpListenerRequest updateBlbHttpListenerRequest = new UpdateBlbHttpListenerRequest();
        updateBlbHttpListenerRequest.setBlbId("");
        updateBlbHttpListenerRequest.setListenerPort(0);
        updateBlbHttpListenerRequest.setClientToken("");
        updateBlbHttpListenerRequest.setBackendPort(0);
        updateBlbHttpListenerRequest.setScheduler("");
        updateBlbHttpListenerRequest.setKeepSession(false);
        updateBlbHttpListenerRequest.setKeepSessionType("");
        updateBlbHttpListenerRequest.setKeepSessionDuration(0);
        updateBlbHttpListenerRequest.setKeepSessionCookieName("");
        updateBlbHttpListenerRequest.setXForwardFor(false);
        updateBlbHttpListenerRequest.setXForwardedProto(false);
        updateBlbHttpListenerRequest.setAdditionalAttributes(null);
        updateBlbHttpListenerRequest.setHealthCheckType("");
        updateBlbHttpListenerRequest.setHealthCheckPort(0);
        updateBlbHttpListenerRequest.setHealthCheckURI("");
        updateBlbHttpListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbHttpListenerRequest.setHealthCheckInterval(0);
        updateBlbHttpListenerRequest.setUnhealthyThreshold(0);
        updateBlbHttpListenerRequest.setHealthyThreshold(0);
        updateBlbHttpListenerRequest.setHealthCheckNormalStatus("");
        updateBlbHttpListenerRequest.setHealthCheckHost("");
        updateBlbHttpListenerRequest.setServerTimeout(0);
        updateBlbHttpListenerRequest.setRedirectPort(0);
        blbClient.updateBlbHttpListener(updateBlbHttpListenerRequest);
    }
    /**
     * updateBlbHttpsListener
     *
     */
    @Test
    public void updateBlbHttpsListenerTest() {
        UpdateBlbHttpsListenerRequest updateBlbHttpsListenerRequest = new UpdateBlbHttpsListenerRequest();
        updateBlbHttpsListenerRequest.setBlbId("");
        updateBlbHttpsListenerRequest.setListenerPort(0);
        updateBlbHttpsListenerRequest.setClientToken("");
        updateBlbHttpsListenerRequest.setBackendPort(0);
        updateBlbHttpsListenerRequest.setScheduler("");
        updateBlbHttpsListenerRequest.setKeepSession(false);
        updateBlbHttpsListenerRequest.setKeepSessionType("");
        updateBlbHttpsListenerRequest.setKeepSessionDuration(0);
        updateBlbHttpsListenerRequest.setKeepSessionCookieName("");
        updateBlbHttpsListenerRequest.setXForwardFor(false);
        updateBlbHttpsListenerRequest.setXForwardedProto(false);
        updateBlbHttpsListenerRequest.setAdditionalAttributes(null);
        updateBlbHttpsListenerRequest.setHealthCheckType("");
        updateBlbHttpsListenerRequest.setHealthCheckPort(0);
        updateBlbHttpsListenerRequest.setHealthCheckURI("");
        updateBlbHttpsListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbHttpsListenerRequest.setHealthCheckInterval(0);
        updateBlbHttpsListenerRequest.setUnhealthyThreshold(0);
        updateBlbHttpsListenerRequest.setHealthyThreshold(0);
        updateBlbHttpsListenerRequest.setHealthCheckNormalStatus("");
        updateBlbHttpsListenerRequest.setHealthCheckHost("");
        updateBlbHttpsListenerRequest.setServerTimeout(0);
        updateBlbHttpsListenerRequest.setCertIds(new ArrayList<>());
        updateBlbHttpsListenerRequest.setAdditionalCertDomains(new ArrayList<>());
        updateBlbHttpsListenerRequest.setEncryptionType("");
        updateBlbHttpsListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateBlbHttpsListenerRequest.setAppliedCiphers("");
        blbClient.updateBlbHttpsListener(updateBlbHttpsListenerRequest);
    }
    /**
     * updateBlbModifyProtection
     *
     */
    @Test
    public void updateBlbModifyProtectionTest() {
        UpdateBlbModifyProtectionRequest updateBlbModifyProtectionRequest = new UpdateBlbModifyProtectionRequest();
        updateBlbModifyProtectionRequest.setBlbId("");
        updateBlbModifyProtectionRequest.setClientToken("");
        updateBlbModifyProtectionRequest.setAllowModify(false);
        updateBlbModifyProtectionRequest.setModificationProtectionReason("");
        blbClient.updateBlbModifyProtection(updateBlbModifyProtectionRequest);
    }
    /**
     * updateBlbServer
     *
     */
    @Test
    public void updateBlbServerTest() {
        UpdateBlbServerRequest updateBlbServerRequest = new UpdateBlbServerRequest();
        updateBlbServerRequest.setBlbId("");
        updateBlbServerRequest.setClientToken("");
        updateBlbServerRequest.setBackendServerList(new ArrayList<>());
        blbClient.updateBlbServer(updateBlbServerRequest);
    }
    /**
     * updateBlbSslListener
     *
     */
    @Test
    public void updateBlbSslListenerTest() {
        UpdateBlbSslListenerRequest updateBlbSslListenerRequest = new UpdateBlbSslListenerRequest();
        updateBlbSslListenerRequest.setBlbId("");
        updateBlbSslListenerRequest.setListenerPort(0);
        updateBlbSslListenerRequest.setClientToken("");
        updateBlbSslListenerRequest.setBackendPort(0);
        updateBlbSslListenerRequest.setScheduler("");
        updateBlbSslListenerRequest.setHealthCheckType("");
        updateBlbSslListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbSslListenerRequest.setHealthCheckInterval(0);
        updateBlbSslListenerRequest.setUnhealthyThreshold(0);
        updateBlbSslListenerRequest.setHealthyThreshold(0);
        updateBlbSslListenerRequest.setCertIds(new ArrayList<>());
        updateBlbSslListenerRequest.setEncryptionType("");
        updateBlbSslListenerRequest.setEncryptionProtocols(new ArrayList<>());
        updateBlbSslListenerRequest.setAppliedCiphers("");
        updateBlbSslListenerRequest.setDualAuth(false);
        updateBlbSslListenerRequest.setClientCertIds(new ArrayList<>());
        blbClient.updateBlbSslListener(updateBlbSslListenerRequest);
    }
    /**
     * updateBlbTcpListener
     *
     */
    @Test
    public void updateBlbTcpListenerTest() {
        UpdateBlbTcpListenerRequest updateBlbTcpListenerRequest = new UpdateBlbTcpListenerRequest();
        updateBlbTcpListenerRequest.setBlbId("");
        updateBlbTcpListenerRequest.setListenerPort(0);
        updateBlbTcpListenerRequest.setClientToken("");
        updateBlbTcpListenerRequest.setBackendPort(0);
        updateBlbTcpListenerRequest.setScheduler("");
        updateBlbTcpListenerRequest.setHealthCheckType("");
        updateBlbTcpListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbTcpListenerRequest.setHealthCheckInterval(0);
        updateBlbTcpListenerRequest.setUnhealthyThreshold(0);
        updateBlbTcpListenerRequest.setHealthyThreshold(0);
        blbClient.updateBlbTcpListener(updateBlbTcpListenerRequest);
    }
    /**
     * updateBlbUdpListener
     *
     */
    @Test
    public void updateBlbUdpListenerTest() {
        UpdateBlbUdpListenerRequest updateBlbUdpListenerRequest = new UpdateBlbUdpListenerRequest();
        updateBlbUdpListenerRequest.setBlbId("");
        updateBlbUdpListenerRequest.setListenerPort(0);
        updateBlbUdpListenerRequest.setClientToken("");
        updateBlbUdpListenerRequest.setBackendPort(0);
        updateBlbUdpListenerRequest.setScheduler("");
        updateBlbUdpListenerRequest.setHealthCheckType("");
        updateBlbUdpListenerRequest.setHealthCheckPort(0);
        updateBlbUdpListenerRequest.setHealthCheckTimeoutInSecond(0);
        updateBlbUdpListenerRequest.setHealthCheckInterval(0);
        updateBlbUdpListenerRequest.setUnhealthyThreshold(0);
        updateBlbUdpListenerRequest.setHealthyThreshold(0);
        updateBlbUdpListenerRequest.setHealthCheckString("");
        updateBlbUdpListenerRequest.setUdpSessionTimeout(0);
        blbClient.updateBlbUdpListener(updateBlbUdpListenerRequest);
    }
    /**
     * updateLbdc
     *
     */
    @Test
    public void updateLbdcTest() {
        UpdateLbdcRequest updateLbdcRequest = new UpdateLbdcRequest();
        updateLbdcRequest.setId("");
        updateLbdcRequest.setClientToken("");
        updateLbdcRequest.setName("");
        updateLbdcRequest.setDesc("");
        blbClient.updateLbdc(updateLbdcRequest);
    }
    /**
     * updateService
     *
     */
    @Test
    public void updateServiceTest() {
        UpdateServiceRequest updateServiceRequest = new UpdateServiceRequest();
        updateServiceRequest.setService("");
        updateServiceRequest.setClientToken("");
        updateServiceRequest.setName("");
        updateServiceRequest.setDescription("");
        blbClient.updateService(updateServiceRequest);
    }
    /**
     * updateServiceAuth
     *
     */
    @Test
    public void updateServiceAuthTest() {
        UpdateServiceAuthRequest updateServiceAuthRequest = new UpdateServiceAuthRequest();
        updateServiceAuthRequest.setService("");
        updateServiceAuthRequest.setClientToken("");
        updateServiceAuthRequest.setAuthList(new ArrayList<>());
        blbClient.updateServiceAuth(updateServiceAuthRequest);
    }
    /**
     * upgradeLbdc
     *
     */
    @Test
    public void upgradeLbdcTest() {
        UpgradeLbdcRequest upgradeLbdcRequest = new UpgradeLbdcRequest();
        upgradeLbdcRequest.setId("");
        upgradeLbdcRequest.setClientToken("");
        upgradeLbdcRequest.setCcuCount(0);
        blbClient.upgradeLbdc(upgradeLbdcRequest);
    }
}
