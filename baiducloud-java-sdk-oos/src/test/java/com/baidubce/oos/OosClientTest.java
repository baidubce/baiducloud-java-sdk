package com.baidubce.oos;

import com.baidubce.oos.models.CheckTemplateV2Request;
import com.baidubce.oos.models.CheckTemplateV2Response;
import com.baidubce.oos.models.CreateExecutionV2Request;
import com.baidubce.oos.models.CreateExecutionV2Response;
import com.baidubce.oos.models.CreateTemplateV2Request;
import com.baidubce.oos.models.CreateTemplateV2Response;
import com.baidubce.oos.models.DeleteTemplateV2Request;
import com.baidubce.oos.models.DeleteTemplateV2Response;
import com.baidubce.oos.models.GetExecutionDetailV2Request;
import com.baidubce.oos.models.GetExecutionDetailV2Response;
import com.baidubce.oos.models.GetExecutionListV2Request;
import com.baidubce.oos.models.GetExecutionListV2Response;
import com.baidubce.oos.models.GetOperatorListV2Request;
import com.baidubce.oos.models.GetOperatorListV2Response;
import com.baidubce.oos.models.GetTaskChildrenListV2Request;
import com.baidubce.oos.models.GetTaskChildrenListV2Response;
import com.baidubce.oos.models.GetTaskDetailV2Request;
import com.baidubce.oos.models.GetTaskDetailV2Response;
import com.baidubce.oos.models.GetTemplateDetailV2Request;
import com.baidubce.oos.models.GetTemplateDetailV2Response;
import com.baidubce.oos.models.GetTemplateListV2Request;
import com.baidubce.oos.models.GetTemplateListV2Response;
import com.baidubce.oos.models.UpdateTemplateV2Request;
import com.baidubce.oos.models.UpdateTemplateV2Response;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for OosClient
 */
public class OosClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private OosClient oosClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        oosClient = new OosClient(config);
    }

    /**
     * checkTemplateV2
     *
     */
    @Test
    public void checkTemplateV2Test() {
        CheckTemplateV2Request checkTemplateV2Request = new CheckTemplateV2Request();
        checkTemplateV2Request.setName("");
        checkTemplateV2Request.setDescription("");
        checkTemplateV2Request.setTags(new ArrayList<>());
        checkTemplateV2Request.setLinear(false);
        checkTemplateV2Request.setParallelism(0);
        checkTemplateV2Request.setOperators(new ArrayList<>());
        checkTemplateV2Request.setLinks(new ArrayList<>());
        checkTemplateV2Request.setProperties(new ArrayList<>());
        CheckTemplateV2Response response = oosClient.checkTemplateV2(checkTemplateV2Request);
        System.out.println(response);
    }
    /**
     * createExecutionV2
     *
     */
    @Test
    public void createExecutionV2Test() {
        CreateExecutionV2Request createExecutionV2Request = new CreateExecutionV2Request();
        createExecutionV2Request.setLocale("");
        createExecutionV2Request.setDescription("");
        createExecutionV2Request.setTemplate(null);
        createExecutionV2Request.setParallelism(0);
        createExecutionV2Request.setManually(false);
        createExecutionV2Request.setProperties(null);
        createExecutionV2Request.setTags(new ArrayList<>());
        CreateExecutionV2Response response = oosClient.createExecutionV2(createExecutionV2Request);
        System.out.println(response);
    }
    /**
     * createTemplateV2
     *
     */
    @Test
    public void createTemplateV2Test() {
        CreateTemplateV2Request createTemplateV2Request = new CreateTemplateV2Request();
        createTemplateV2Request.setName("");
        createTemplateV2Request.setDescription("");
        createTemplateV2Request.setTags(new ArrayList<>());
        createTemplateV2Request.setLinear(false);
        createTemplateV2Request.setParallelism(0);
        createTemplateV2Request.setOperators(new ArrayList<>());
        createTemplateV2Request.setLinks(new ArrayList<>());
        createTemplateV2Request.setProperties(new ArrayList<>());
        CreateTemplateV2Response response = oosClient.createTemplateV2(createTemplateV2Request);
        System.out.println(response);
    }
    /**
     * deleteTemplateV2
     *
     */
    @Test
    public void deleteTemplateV2Test() {
        DeleteTemplateV2Request deleteTemplateV2Request = new DeleteTemplateV2Request();
        deleteTemplateV2Request.setId("");
        deleteTemplateV2Request.setNamespace("");
        DeleteTemplateV2Response response = oosClient.deleteTemplateV2(deleteTemplateV2Request);
        System.out.println(response);
    }
    /**
     * getExecutionDetailV2
     *
     */
    @Test
    public void getExecutionDetailV2Test() {
        GetExecutionDetailV2Request getExecutionDetailV2Request = new GetExecutionDetailV2Request();
        getExecutionDetailV2Request.setId("");
        getExecutionDetailV2Request.setNamespace("");
        getExecutionDetailV2Request.setWithLog("");
        getExecutionDetailV2Request.setLocale("");
        GetExecutionDetailV2Response response = oosClient.getExecutionDetailV2(getExecutionDetailV2Request);
        System.out.println(response);
    }
    /**
     * getExecutionListV2
     *
     */
    @Test
    public void getExecutionListV2Test() {
        GetExecutionListV2Request getExecutionListV2Request = new GetExecutionListV2Request();
        getExecutionListV2Request.setLocale("");
        getExecutionListV2Request.setNamespace("");
        getExecutionListV2Request.setTemplate(null);
        getExecutionListV2Request.setState("");
        getExecutionListV2Request.setTrigger("");
        getExecutionListV2Request.setCronExecutionName("");
        getExecutionListV2Request.setEventExecutionName("");
        getExecutionListV2Request.setStartTime(0);
        getExecutionListV2Request.setEndTime(0);
        getExecutionListV2Request.setSort("");
        getExecutionListV2Request.setAscending(false);
        getExecutionListV2Request.setPageNo(0);
        getExecutionListV2Request.setPageSize(0);
        GetExecutionListV2Response response = oosClient.getExecutionListV2(getExecutionListV2Request);
        System.out.println(response);
    }
    /**
     * getOperatorListV2
     *
     */
    @Test
    public void getOperatorListV2Test() {
        GetOperatorListV2Request getOperatorListV2Request = new GetOperatorListV2Request();
        getOperatorListV2Request.setLocale("");
        getOperatorListV2Request.setOperator(null);
        getOperatorListV2Request.setSort("");
        getOperatorListV2Request.setAscending(false);
        getOperatorListV2Request.setPageNo(0);
        getOperatorListV2Request.setPageSize(0);
        GetOperatorListV2Response response = oosClient.getOperatorListV2(getOperatorListV2Request);
        System.out.println(response);
    }
    /**
     * getTaskChildrenListV2
     *
     */
    @Test
    public void getTaskChildrenListV2Test() {
        GetTaskChildrenListV2Request getTaskChildrenListV2Request = new GetTaskChildrenListV2Request();
        getTaskChildrenListV2Request.setLocale("");
        getTaskChildrenListV2Request.setExecutionId("");
        getTaskChildrenListV2Request.setTaskId("");
        getTaskChildrenListV2Request.setNamespace("");
        getTaskChildrenListV2Request.setStates(new ArrayList<>());
        getTaskChildrenListV2Request.setPageNo(0);
        getTaskChildrenListV2Request.setPageSize(0);
        GetTaskChildrenListV2Response response = oosClient.getTaskChildrenListV2(getTaskChildrenListV2Request);
        System.out.println(response);
    }
    /**
     * getTaskDetailV2
     *
     */
    @Test
    public void getTaskDetailV2Test() {
        GetTaskDetailV2Request getTaskDetailV2Request = new GetTaskDetailV2Request();
        getTaskDetailV2Request.setDagId("");
        getTaskDetailV2Request.setTaskId("");
        getTaskDetailV2Request.setNamespace("");
        getTaskDetailV2Request.setIgnoreChildren("");
        getTaskDetailV2Request.setLocale("");
        GetTaskDetailV2Response response = oosClient.getTaskDetailV2(getTaskDetailV2Request);
        System.out.println(response);
    }
    /**
     * getTemplateDetailV2
     *
     */
    @Test
    public void getTemplateDetailV2Test() {
        GetTemplateDetailV2Request getTemplateDetailV2Request = new GetTemplateDetailV2Request();
        getTemplateDetailV2Request.setNamespace("");
        getTemplateDetailV2Request.setId("");
        getTemplateDetailV2Request.setName("");
        getTemplateDetailV2Request.setType("");
        getTemplateDetailV2Request.setLocale("");
        GetTemplateDetailV2Response response = oosClient.getTemplateDetailV2(getTemplateDetailV2Request);
        System.out.println(response);
    }
    /**
     * getTemplateListV2
     *
     */
    @Test
    public void getTemplateListV2Test() {
        GetTemplateListV2Request getTemplateListV2Request = new GetTemplateListV2Request();
        getTemplateListV2Request.setLocale("");
        getTemplateListV2Request.setNamespace("");
        getTemplateListV2Request.setName("");
        getTemplateListV2Request.setId("");
        getTemplateListV2Request.setType("");
        getTemplateListV2Request.setSort("");
        getTemplateListV2Request.setAscending(false);
        getTemplateListV2Request.setPageNo(0);
        getTemplateListV2Request.setPageSize(0);
        getTemplateListV2Request.setSupportedInstanceType("");
        GetTemplateListV2Response response = oosClient.getTemplateListV2(getTemplateListV2Request);
        System.out.println(response);
    }
    /**
     * updateTemplateV2
     *
     */
    @Test
    public void updateTemplateV2Test() {
        UpdateTemplateV2Request updateTemplateV2Request = new UpdateTemplateV2Request();
        updateTemplateV2Request.setNamespace("");
        updateTemplateV2Request.setId("");
        updateTemplateV2Request.setName("");
        updateTemplateV2Request.setDescription("");
        updateTemplateV2Request.setTags(new ArrayList<>());
        updateTemplateV2Request.setLinear(false);
        updateTemplateV2Request.setParallelism(0);
        updateTemplateV2Request.setOperators(new ArrayList<>());
        updateTemplateV2Request.setLinks(new ArrayList<>());
        updateTemplateV2Request.setProperties(new ArrayList<>());
        UpdateTemplateV2Response response = oosClient.updateTemplateV2(updateTemplateV2Request);
        System.out.println(response);
    }
}
