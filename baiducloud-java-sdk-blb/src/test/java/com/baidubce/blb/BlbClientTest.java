package com.baidubce.blb;

import com.baidubce.blb.models.BillingChangeCancelToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbRequest;
import com.baidubce.blb.models.BillingChangePostToPreBlbResponse;
import com.baidubce.blb.models.BillingChangePreToPostBlbRequest;
import com.baidubce.blb.models.BillingChangePreToPostBlbResponse;
import com.baidubce.blb.models.BlbInquiryRequest;
import com.baidubce.blb.models.RefundBlbRequest;
import com.baidubce.blb.models.ResizeBlbRequest;
import com.baidubce.blb.models.ResizeBlbResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;

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
        blbClient.blbInquiry(blbInquiryRequest);
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
}
