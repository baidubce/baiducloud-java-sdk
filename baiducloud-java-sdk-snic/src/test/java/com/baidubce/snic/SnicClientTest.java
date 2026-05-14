package com.baidubce.snic;

import com.baidubce.snic.models.CreateSnicRequest;
import com.baidubce.snic.models.CreateSnicResponse;
import com.baidubce.snic.models.DeleteSnicRequest;
import com.baidubce.snic.models.DescribeSnicRequest;
import com.baidubce.snic.models.DescribeSnicResponse;
import com.baidubce.snic.models.ListSnicRequest;
import com.baidubce.snic.models.ListSnicResponse;
import com.baidubce.snic.models.QueryAvailablePublicServicesResponse;
import com.baidubce.snic.models.UpdateSnicEsgRequest;
import com.baidubce.snic.models.UpdateSnicRequest;
import com.baidubce.snic.models.UpdateSnicSgRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for SnicClient
 */
public class SnicClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private SnicClient snicClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        snicClient = new SnicClient(config);
    }

    /**
     * createSnic
     *
     */
    @Test
    public void createSnicTest() {
        CreateSnicRequest createSnicRequest = new CreateSnicRequest();
        createSnicRequest.setClientToken("");
        createSnicRequest.setVpcId("");
        createSnicRequest.setName("");
        createSnicRequest.setSubnetId("");
        createSnicRequest.setService("");
        createSnicRequest.setDescription("");
        createSnicRequest.setIpAddress("");
        createSnicRequest.setBandwidth(0);
        createSnicRequest.setBilling(null);
        createSnicRequest.setTags(new ArrayList<>());
        createSnicRequest.setResourceGroupId("");
        CreateSnicResponse response = snicClient.createSnic(createSnicRequest);
        System.out.println(response);
    }
    /**
     * deleteSnic
     *
     */
    @Test
    public void deleteSnicTest() {
        DeleteSnicRequest deleteSnicRequest = new DeleteSnicRequest();
        deleteSnicRequest.setEndpointId("");
        deleteSnicRequest.setClientToken("");
        snicClient.deleteSnic(deleteSnicRequest);
    }
    /**
     * describeSnic
     *
     */
    @Test
    public void describeSnicTest() {
        DescribeSnicRequest describeSnicRequest = new DescribeSnicRequest();
        describeSnicRequest.setEndpointId("");
        DescribeSnicResponse response = snicClient.describeSnic(describeSnicRequest);
        System.out.println(response);
    }
    /**
     * listSnic
     *
     */
    @Test
    public void listSnicTest() {
        ListSnicRequest listSnicRequest = new ListSnicRequest();
        listSnicRequest.setVpcId("");
        listSnicRequest.setName("");
        listSnicRequest.setIpAddress("");
        listSnicRequest.setStatus("");
        listSnicRequest.setSubnetId("");
        listSnicRequest.setService("");
        listSnicRequest.setMarker("");
        listSnicRequest.setMaxKeys(0);
        ListSnicResponse response = snicClient.listSnic(listSnicRequest);
        System.out.println(response);
    }
    /**
     * queryAvailablePublicServices
     *
     */
    @Test
    public void queryAvailablePublicServicesTest() {
        QueryAvailablePublicServicesResponse response = snicClient.queryAvailablePublicServices();
        System.out.println(response);
    }
    /**
     * updateSnic
     *
     */
    @Test
    public void updateSnicTest() {
        UpdateSnicRequest updateSnicRequest = new UpdateSnicRequest();
        updateSnicRequest.setEndpointId("");
        updateSnicRequest.setClientToken("");
        updateSnicRequest.setName("");
        updateSnicRequest.setDescription("");
        snicClient.updateSnic(updateSnicRequest);
    }
    /**
     * updateSnicEsg
     *
     */
    @Test
    public void updateSnicEsgTest() {
        UpdateSnicEsgRequest updateSnicEsgRequest = new UpdateSnicEsgRequest();
        updateSnicEsgRequest.setEndpointId("");
        updateSnicEsgRequest.setClientToken("");
        updateSnicEsgRequest.setEnterpriseSecurityGroupIds(new ArrayList<>());
        snicClient.updateSnicEsg(updateSnicEsgRequest);
    }
    /**
     * updateSnicSg
     *
     */
    @Test
    public void updateSnicSgTest() {
        UpdateSnicSgRequest updateSnicSgRequest = new UpdateSnicSgRequest();
        updateSnicSgRequest.setEndpointId("");
        updateSnicSgRequest.setClientToken("");
        updateSnicSgRequest.setSecurityGroupIds(new ArrayList<>());
        snicClient.updateSnicSg(updateSnicSgRequest);
    }
}
