package com.baidubce.blb;

import com.baidubce.blb.models.BillingChangeCancelToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbResponse;
import com.baidubce.blb.models.BillingChangePreToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePreToPostBlbResponse;
import com.baidubce.blb.models.BlbInquiryRequest;
import com.baidubce.blb.models.BlbInquiryResponse;
import com.baidubce.blb.models.CreateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.CreateAppBlbHttpsListenerRequest;
import com.baidubce.blb.models.CreateAppBlbPolicyRequest;
import com.baidubce.blb.models.CreateAppBlbRequest;
import com.baidubce.blb.models.CreateAppBlbResponse;
import com.baidubce.blb.models.CreateAppBlbSslListenerRequest;
import com.baidubce.blb.models.CreateAppBlbTcpListenerRequest;
import com.baidubce.blb.models.CreateAppBlbUdpListenerRequest;
import com.baidubce.blb.models.DeleteAppBlbListenerRequest;
import com.baidubce.blb.models.DeleteAppBlbPolicyRequest;
import com.baidubce.blb.models.DescribeAppBlbHttpListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbHttpListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbHttpsListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbHttpsListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbPolicyRequest;
import com.baidubce.blb.models.DescribeAppBlbPolicyResponse;
import com.baidubce.blb.models.DescribeAppBlbRequest;
import com.baidubce.blb.models.DescribeAppBlbResponse;
import com.baidubce.blb.models.DescribeAppBlbSslListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbSslListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbTcpListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbTcpListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbUdpListenerRequest;
import com.baidubce.blb.models.DescribeAppBlbUdpListenerResponse;
import com.baidubce.blb.models.DescribeAppBlbsRequest;
import com.baidubce.blb.models.DescribeAppBlbsResponse;
import com.baidubce.blb.models.RefundBlbRequest;
import com.baidubce.blb.models.ReleaseAppBlbRequest;
import com.baidubce.blb.models.ResizeBlbRequest;
import com.baidubce.blb.models.ResizeBlbResponse;
import com.baidubce.blb.models.UpdateAppBlbHttpListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbHttpsListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbPolicyRequest;
import com.baidubce.blb.models.UpdateAppBlbRequest;
import com.baidubce.blb.models.UpdateAppBlbSslListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbTcpListenerRequest;
import com.baidubce.blb.models.UpdateAppBlbUdpListenerRequest;
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
        DescribeAppBlbsResponse response = blbClient.describeAppBlbs(describeAppBlbsRequest);
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
        blbClient.releaseAppBlb(releaseAppBlbRequest);
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
        updateAppBlbHttpListenerRequest.setClientToken("");
        updateAppBlbHttpListenerRequest.setListenerPort(0);
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
        updateAppBlbHttpsListenerRequest.setClientToken("");
        updateAppBlbHttpsListenerRequest.setListenerPort(0);
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
     * updateAppBlbSslListener
     *
     */
    @Test
    public void updateAppBlbSslListenerTest() {
        UpdateAppBlbSslListenerRequest updateAppBlbSslListenerRequest = new UpdateAppBlbSslListenerRequest();
        updateAppBlbSslListenerRequest.setBlbId("");
        updateAppBlbSslListenerRequest.setClientToken("");
        updateAppBlbSslListenerRequest.setListenerPort(0);
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
        updateAppBlbTcpListenerRequest.setClientToken("");
        updateAppBlbTcpListenerRequest.setListenerPort(0);
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
        updateAppBlbUdpListenerRequest.setClientToken("");
        updateAppBlbUdpListenerRequest.setListenerPort(0);
        updateAppBlbUdpListenerRequest.setScheduler("");
        updateAppBlbUdpListenerRequest.setUdpSessionTimeout(0);
        updateAppBlbUdpListenerRequest.setDescription("");
        blbClient.updateAppBlbUdpListener(updateAppBlbUdpListenerRequest);
    }
}
