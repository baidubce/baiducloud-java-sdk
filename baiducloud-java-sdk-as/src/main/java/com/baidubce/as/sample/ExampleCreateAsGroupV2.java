package com.baidubce.as.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.as.AsClient;
import com.baidubce.as.models.CreateAsGroupV2Request;
import com.baidubce.as.models.CmdConfig;
import com.baidubce.as.models.EipConfig;
import com.baidubce.as.models.EipGroupIncrease;
import com.baidubce.as.models.CreateAsGroupV2Response;
import com.baidubce.as.models.BillingInfo;
import com.baidubce.as.models.EipGroupDecrease;
import com.baidubce.as.models.AssignTagInfo;
import com.baidubce.as.models.Reservation;
import com.baidubce.as.models.GroupConfig;
import com.baidubce.as.models.EipGroupBandwidth;
import com.baidubce.as.models.HealthCheckConfig;
import com.baidubce.as.models.BccNameConfig;
import com.baidubce.as.models.EipInfo;
import java.util.ArrayList;

public class ExampleCreateAsGroupV2 {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        AsClient client = new AsClient(bceClientConfig);
        GroupConfig config = new GroupConfig();
        config.setMinNodeNum(0);
        config.setMaxNodeNum(0);
        config.setCooldownInSec(0);
        config.setExpectNum(0);
        config.setInitNum(0);

        EipInfo eip = new EipInfo();
        eip.setIfBindEip(false);
        eip.setBandwidthInMbps(0);
        eip.setEipProductType("");
        eip.setPurchaseType("");

        EipConfig eipConfig = new EipConfig();
        eipConfig.setEipGroupBindStrategy("");
        eipConfig.setEipGroupUnbindStrategy("");
        eipConfig.setEipGroupIdList(new ArrayList<>());
        EipGroupIncrease increase = new EipGroupIncrease();
        increase.setEnabled(false);
        increase.setStrategy("");

        eipConfig.setIncrease(increase);
        EipGroupDecrease decrease = new EipGroupDecrease();
        decrease.setEnabled(false);

        eipConfig.setDecrease(decrease);
        EipGroupBandwidth bandwidth = new EipGroupBandwidth();
        bandwidth.setMax(0);
        bandwidth.setMin(0);
        bandwidth.setStandard(0);

        eipConfig.setBandwidth(bandwidth);

        BillingInfo billing = new BillingInfo();
        billing.setPaymentTiming("");
        Reservation reservation = new Reservation();
        reservation.setReservationLengthInMonth(0);

        billing.setReservation(reservation);

        HealthCheckConfig healthCheck = new HealthCheckConfig();
        healthCheck.setHealthCheckInterval(0);
        healthCheck.setGraceTime(0);

        AssignTagInfo assignTagInfo = new AssignTagInfo();
        assignTagInfo.setResourceId("");
        assignTagInfo.setRelationTag(false);
        assignTagInfo.setTags(new ArrayList<>());

        CmdConfig cmdConfig = new CmdConfig();
        cmdConfig.setHasDecreaseCmd(false);
        cmdConfig.setDecCmdStrategy("");
        cmdConfig.setDecCmdData("");
        cmdConfig.setDecCmdTimeout(0);
        cmdConfig.setDecCmdManual(false);
        cmdConfig.setHasIncreaseCmd(false);
        cmdConfig.setIncCmdStrategy("");
        cmdConfig.setIncCmdData("");
        cmdConfig.setIncCmdTimeout(0);
        cmdConfig.setIncCmdManual(false);

        BccNameConfig bccNameConfig = new BccNameConfig();
        bccNameConfig.setBccName("");
        bccNameConfig.setBccHostname("");
        bccNameConfig.setAutoSeqSuffix(false);
        bccNameConfig.setOpenHostnameDomain(false);

        CreateAsGroupV2Request createAsGroupV2Request = new CreateAsGroupV2Request();
        createAsGroupV2Request.setGroupName("");
        createAsGroupV2Request.setZoneInfo(new ArrayList<>());
        createAsGroupV2Request.setConfig(config);
        createAsGroupV2Request.setKeypairId("");
        createAsGroupV2Request.setKeypairName("");
        createAsGroupV2Request.setKeepImageLogin(0);
        createAsGroupV2Request.setBlb(new ArrayList<>());
        createAsGroupV2Request.setBlbUnbindWaitTime(0);
        createAsGroupV2Request.setNodes(new ArrayList<>());
        createAsGroupV2Request.setEip(eip);
        createAsGroupV2Request.setEipConfig(eipConfig);
        createAsGroupV2Request.setBilling(billing);
        createAsGroupV2Request.setRds(new ArrayList<>());
        createAsGroupV2Request.setScs(new ArrayList<>());
        createAsGroupV2Request.setHealthCheck(healthCheck);
        createAsGroupV2Request.setExpansionStrategy("");
        createAsGroupV2Request.setShrinkageStrategy("");
        createAsGroupV2Request.setAssignTagInfo(assignTagInfo);
        createAsGroupV2Request.setCmdConfig(cmdConfig);
        createAsGroupV2Request.setBccNameConfig(bccNameConfig);
        try {
            CreateAsGroupV2Response response = client.createAsGroupV2(createAsGroupV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
