package com.baidubce.iam;

import com.baidubce.iam.models.AddUserToGroupRequest;
import com.baidubce.iam.models.AssociateGroupPermissionsRequest;
import com.baidubce.iam.models.AssociateRolePermissionsRequest;
import com.baidubce.iam.models.AssociateUserPermissionsRequest;
import com.baidubce.iam.models.ChangeSubUserPasswordRequest;
import com.baidubce.iam.models.CreateAccessKeyRequest;
import com.baidubce.iam.models.CreateApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.CreateApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.CreateGroupRequest;
import com.baidubce.iam.models.CreateRoleRequest;
import com.baidubce.iam.models.CreateStrategyRequest;
import com.baidubce.iam.models.CreateUserRequest;
import com.baidubce.iam.models.DecodingApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.DecodingApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.DeleteAccessKeyRequest;
import com.baidubce.iam.models.DeleteApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.DeleteApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.DeleteGroupRequest;
import com.baidubce.iam.models.DeleteLoginProfileRequest;
import com.baidubce.iam.models.DeleteRoleRequest;
import com.baidubce.iam.models.DeleteStrategyRequest;
import com.baidubce.iam.models.DeleteUserRequest;
import com.baidubce.iam.models.DisableAccessKeyRequest;
import com.baidubce.iam.models.EnableAccessKeyRequest;
import com.baidubce.iam.models.GetLoginProfileRequest;
import com.baidubce.iam.models.GetSessionApiKeyRequest;
import com.baidubce.iam.models.GetSessionApiKeyResponse;
import com.baidubce.iam.models.GetUserRequest;
import com.baidubce.iam.models.ListAccessKeyRequest;
import com.baidubce.iam.models.ListAccessKeyResponse;
import com.baidubce.iam.models.ListAllSubjectsGrantedPermissionsRequest;
import com.baidubce.iam.models.ListAllSubjectsGrantedPermissionsResponse;
import com.baidubce.iam.models.ListGroupsResponse;
import com.baidubce.iam.models.ListRolesResponse;
import com.baidubce.iam.models.ListStrategiesRequest;
import com.baidubce.iam.models.ListStrategiesResponse;
import com.baidubce.iam.models.ListThePermissionsOfRolesRequest;
import com.baidubce.iam.models.ListThePermissionsOfRolesResponse;
import com.baidubce.iam.models.ListThePermissionsOfTheGroupRequest;
import com.baidubce.iam.models.ListThePermissionsOfTheGroupResponse;
import com.baidubce.iam.models.ListTheSubjectsGrantedPermissionsRequest;
import com.baidubce.iam.models.ListTheSubjectsGrantedPermissionsResponse;
import com.baidubce.iam.models.ListTheUserSPermissionsRequest;
import com.baidubce.iam.models.ListTheUserSPermissionsResponse;
import com.baidubce.iam.models.ListUserGroupsRequest;
import com.baidubce.iam.models.ListUserGroupsResponse;
import com.baidubce.iam.models.ListUserResponse;
import com.baidubce.iam.models.ListUsersWithinTheGroupRequest;
import com.baidubce.iam.models.ListUsersWithinTheGroupResponse;
import com.baidubce.iam.models.ModifySubUserOperationProtectionRequest;
import com.baidubce.iam.models.ObtainAListOfPermanentlyValidApikeysRequest;
import com.baidubce.iam.models.ObtainAListOfPermanentlyValidApikeysResponse;
import com.baidubce.iam.models.QueryApikeyDetailsPermanentlyValidRequest;
import com.baidubce.iam.models.QueryApikeyDetailsPermanentlyValidResponse;
import com.baidubce.iam.models.QueryGroupRequest;
import com.baidubce.iam.models.QueryRoleRequest;
import com.baidubce.iam.models.QueryStrategyRequest;
import com.baidubce.iam.models.QuerySubUserIdpResponse;
import com.baidubce.iam.models.QuerySummaryOfMainAccountResponse;
import com.baidubce.iam.models.QueryTheLastUsageTimeOfAccesskeyRequest;
import com.baidubce.iam.models.QueryTheLastUsageTimeOfAccesskeyResponse;
import com.baidubce.iam.models.RemoveGroupPermissionsRequest;
import com.baidubce.iam.models.RemoveRolePermissionsRequest;
import com.baidubce.iam.models.RemoveUserFromTheGroupRequest;
import com.baidubce.iam.models.RemoveUserPermissionsRequest;
import com.baidubce.iam.models.UnbindSubUserVirtualMfaRequest;
import com.baidubce.iam.models.UpdateApikeyPermanentlyValidRequest;
import com.baidubce.iam.models.UpdateApikeyPermanentlyValidResponse;
import com.baidubce.iam.models.UpdateGroupRequest;
import com.baidubce.iam.models.UpdateLoginProfileRequest;
import com.baidubce.iam.models.UpdateRoleRequest;
import com.baidubce.iam.models.UpdateStrategyRequest;
import com.baidubce.iam.models.UpdateSubUserIdpRequest;
import com.baidubce.iam.models.UpdateSubUserIdpResponse;
import com.baidubce.iam.models.UpdateSubUserIdpStatusRequest;
import com.baidubce.iam.models.UpdateSubUserIdpStatusResponse;
import com.baidubce.iam.models.UpdateUserRequest;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.DefaultBceCredentials;
import java.util.ArrayList;

/**
 * API tests for IamClient
 */
public class IamClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private IamClient iamClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(AK, SK));
        iamClient = new IamClient(config);
    }

    /**
     * addUserToGroup
     *
     */
    @Test
    public void addUserToGroupTest() {
        AddUserToGroupRequest addUserToGroupRequest = new AddUserToGroupRequest();
        addUserToGroupRequest.setUserName("");
        addUserToGroupRequest.setGroupName("");
        iamClient.addUserToGroup(addUserToGroupRequest);
    }
    /**
     * associateGroupPermissions
     *
     */
    @Test
    public void associateGroupPermissionsTest() {
        AssociateGroupPermissionsRequest associateGroupPermissionsRequest = new AssociateGroupPermissionsRequest();
        associateGroupPermissionsRequest.setGroupName("");
        associateGroupPermissionsRequest.setPolicyName("");
        associateGroupPermissionsRequest.setPolicyType("");
        iamClient.associateGroupPermissions(associateGroupPermissionsRequest);
    }
    /**
     * associateRolePermissions
     *
     */
    @Test
    public void associateRolePermissionsTest() {
        AssociateRolePermissionsRequest associateRolePermissionsRequest = new AssociateRolePermissionsRequest();
        associateRolePermissionsRequest.setRoleName("");
        associateRolePermissionsRequest.setPolicyName("");
        associateRolePermissionsRequest.setPolicyType("");
        iamClient.associateRolePermissions(associateRolePermissionsRequest);
    }
    /**
     * associateUserPermissions
     *
     */
    @Test
    public void associateUserPermissionsTest() {
        AssociateUserPermissionsRequest associateUserPermissionsRequest = new AssociateUserPermissionsRequest();
        associateUserPermissionsRequest.setUserName("");
        associateUserPermissionsRequest.setPolicyName("");
        associateUserPermissionsRequest.setPolicyType("");
        iamClient.associateUserPermissions(associateUserPermissionsRequest);
    }
    /**
     * changeSubUserPassword
     *
     */
    @Test
    public void changeSubUserPasswordTest() {
        ChangeSubUserPasswordRequest changeSubUserPasswordRequest = new ChangeSubUserPasswordRequest();
        changeSubUserPasswordRequest.setUserName("");
        changeSubUserPasswordRequest.setPassword("");
        iamClient.changeSubUserPassword(changeSubUserPasswordRequest);
    }
    /**
     * createAccessKey
     *
     */
    @Test
    public void createAccessKeyTest() {
        CreateAccessKeyRequest createAccessKeyRequest = new CreateAccessKeyRequest();
        createAccessKeyRequest.setUserName("");
        iamClient.createAccessKey(createAccessKeyRequest);
    }
    /**
     * createApikeyPermanentlyValid
     *
     */
    @Test
    public void createApikeyPermanentlyValidTest() {
        CreateApikeyPermanentlyValidRequest createApikeyPermanentlyValidRequest = new CreateApikeyPermanentlyValidRequest();
        createApikeyPermanentlyValidRequest.setUserId("");
        createApikeyPermanentlyValidRequest.setAcl(null);
        createApikeyPermanentlyValidRequest.setName("");
        CreateApikeyPermanentlyValidResponse response = iamClient.createApikeyPermanentlyValid(createApikeyPermanentlyValidRequest);
        System.out.println(response);
    }
    /**
     * createGroup
     *
     */
    @Test
    public void createGroupTest() {
        CreateGroupRequest createGroupRequest = new CreateGroupRequest();
        createGroupRequest.setName("");
        createGroupRequest.setDescription("");
        iamClient.createGroup(createGroupRequest);
    }
    /**
     * createRole
     *
     */
    @Test
    public void createRoleTest() {
        CreateRoleRequest createRoleRequest = new CreateRoleRequest();
        createRoleRequest.setName("");
        createRoleRequest.setDescription("");
        createRoleRequest.setAssumeRolePolicyDocument("");
        iamClient.createRole(createRoleRequest);
    }
    /**
     * createStrategy
     *
     */
    @Test
    public void createStrategyTest() {
        CreateStrategyRequest createStrategyRequest = new CreateStrategyRequest();
        createStrategyRequest.setName("");
        createStrategyRequest.setDescription("");
        createStrategyRequest.setDocument("");
        iamClient.createStrategy(createStrategyRequest);
    }
    /**
     * createUser
     *
     */
    @Test
    public void createUserTest() {
        CreateUserRequest createUserRequest = new CreateUserRequest();
        createUserRequest.setName("");
        createUserRequest.setDescription("");
        iamClient.createUser(createUserRequest);
    }
    /**
     * decodingApikeyPermanentlyValid
     *
     */
    @Test
    public void decodingApikeyPermanentlyValidTest() {
        DecodingApikeyPermanentlyValidRequest decodingApikeyPermanentlyValidRequest = new DecodingApikeyPermanentlyValidRequest();
        decodingApikeyPermanentlyValidRequest.setUserId("");
        decodingApikeyPermanentlyValidRequest.setId("");
        DecodingApikeyPermanentlyValidResponse response = iamClient.decodingApikeyPermanentlyValid(decodingApikeyPermanentlyValidRequest);
        System.out.println(response);
    }
    /**
     * deleteAccessKey
     *
     */
    @Test
    public void deleteAccessKeyTest() {
        DeleteAccessKeyRequest deleteAccessKeyRequest = new DeleteAccessKeyRequest();
        deleteAccessKeyRequest.setUserName("");
        deleteAccessKeyRequest.setAccessKeyId("");
        iamClient.deleteAccessKey(deleteAccessKeyRequest);
    }
    /**
     * deleteApikeyPermanentlyValid
     *
     */
    @Test
    public void deleteApikeyPermanentlyValidTest() {
        DeleteApikeyPermanentlyValidRequest deleteApikeyPermanentlyValidRequest = new DeleteApikeyPermanentlyValidRequest();
        deleteApikeyPermanentlyValidRequest.setUserId("");
        deleteApikeyPermanentlyValidRequest.setId("");
        DeleteApikeyPermanentlyValidResponse response = iamClient.deleteApikeyPermanentlyValid(deleteApikeyPermanentlyValidRequest);
        System.out.println(response);
    }
    /**
     * deleteGroup
     *
     */
    @Test
    public void deleteGroupTest() {
        DeleteGroupRequest deleteGroupRequest = new DeleteGroupRequest();
        deleteGroupRequest.setGroupName("");
        iamClient.deleteGroup(deleteGroupRequest);
    }
    /**
     * deleteLoginProfile
     *
     */
    @Test
    public void deleteLoginProfileTest() {
        DeleteLoginProfileRequest deleteLoginProfileRequest = new DeleteLoginProfileRequest();
        deleteLoginProfileRequest.setUserName("");
        iamClient.deleteLoginProfile(deleteLoginProfileRequest);
    }
    /**
     * deleteRole
     *
     */
    @Test
    public void deleteRoleTest() {
        DeleteRoleRequest deleteRoleRequest = new DeleteRoleRequest();
        deleteRoleRequest.setRoleName("");
        iamClient.deleteRole(deleteRoleRequest);
    }
    /**
     * deleteStrategy
     *
     */
    @Test
    public void deleteStrategyTest() {
        DeleteStrategyRequest deleteStrategyRequest = new DeleteStrategyRequest();
        deleteStrategyRequest.setPolicyName("");
        iamClient.deleteStrategy(deleteStrategyRequest);
    }
    /**
     * deleteSubUserIdp
     *
     */
    @Test
    public void deleteSubUserIdpTest() {
        iamClient.deleteSubUserIdp();
    }
    /**
     * deleteUser
     *
     */
    @Test
    public void deleteUserTest() {
        DeleteUserRequest deleteUserRequest = new DeleteUserRequest();
        deleteUserRequest.setUserName("");
        iamClient.deleteUser(deleteUserRequest);
    }
    /**
     * disableAccessKey
     *
     */
    @Test
    public void disableAccessKeyTest() {
        DisableAccessKeyRequest disableAccessKeyRequest = new DisableAccessKeyRequest();
        disableAccessKeyRequest.setUserName("");
        disableAccessKeyRequest.setAccessKeyId("");
        iamClient.disableAccessKey(disableAccessKeyRequest);
    }
    /**
     * enableAccessKey
     *
     */
    @Test
    public void enableAccessKeyTest() {
        EnableAccessKeyRequest enableAccessKeyRequest = new EnableAccessKeyRequest();
        enableAccessKeyRequest.setUserName("");
        enableAccessKeyRequest.setAccessKeyId("");
        iamClient.enableAccessKey(enableAccessKeyRequest);
    }
    /**
     * getLoginProfile
     *
     */
    @Test
    public void getLoginProfileTest() {
        GetLoginProfileRequest getLoginProfileRequest = new GetLoginProfileRequest();
        getLoginProfileRequest.setUserName("");
        iamClient.getLoginProfile(getLoginProfileRequest);
    }
    /**
     * getSessionApiKey
     *
     */
    @Test
    public void getSessionApiKeyTest() {
        GetSessionApiKeyRequest getSessionApiKeyRequest = new GetSessionApiKeyRequest();
        getSessionApiKeyRequest.setExpireInSeconds(0);
        getSessionApiKeyRequest.setAcl("");
        GetSessionApiKeyResponse response = iamClient.getSessionApiKey(getSessionApiKeyRequest);
        System.out.println(response);
    }
    /**
     * getUser
     *
     */
    @Test
    public void getUserTest() {
        GetUserRequest getUserRequest = new GetUserRequest();
        getUserRequest.setUserName("");
        iamClient.getUser(getUserRequest);
    }
    /**
     * listAccessKey
     *
     */
    @Test
    public void listAccessKeyTest() {
        ListAccessKeyRequest listAccessKeyRequest = new ListAccessKeyRequest();
        listAccessKeyRequest.setUserName("");
        ListAccessKeyResponse response = iamClient.listAccessKey(listAccessKeyRequest);
        System.out.println(response);
    }
    /**
     * listAllSubjectsGrantedPermissions
     *
     */
    @Test
    public void listAllSubjectsGrantedPermissionsTest() {
        ListAllSubjectsGrantedPermissionsRequest listAllSubjectsGrantedPermissionsRequest = new ListAllSubjectsGrantedPermissionsRequest();
        listAllSubjectsGrantedPermissionsRequest.setPolicyId("");
        ListAllSubjectsGrantedPermissionsResponse response = iamClient.listAllSubjectsGrantedPermissions(listAllSubjectsGrantedPermissionsRequest);
        System.out.println(response);
    }
    /**
     * listGroups
     *
     */
    @Test
    public void listGroupsTest() {
        ListGroupsResponse response = iamClient.listGroups();
        System.out.println(response);
    }
    /**
     * listRoles
     *
     */
    @Test
    public void listRolesTest() {
        ListRolesResponse response = iamClient.listRoles();
        System.out.println(response);
    }
    /**
     * listStrategies
     *
     */
    @Test
    public void listStrategiesTest() {
        ListStrategiesRequest listStrategiesRequest = new ListStrategiesRequest();
        listStrategiesRequest.setPolicyType("");
        listStrategiesRequest.setNameFilter("");
        ListStrategiesResponse response = iamClient.listStrategies(listStrategiesRequest);
        System.out.println(response);
    }
    /**
     * listThePermissionsOfRoles
     *
     */
    @Test
    public void listThePermissionsOfRolesTest() {
        ListThePermissionsOfRolesRequest listThePermissionsOfRolesRequest = new ListThePermissionsOfRolesRequest();
        listThePermissionsOfRolesRequest.setRoleName("");
        ListThePermissionsOfRolesResponse response = iamClient.listThePermissionsOfRoles(listThePermissionsOfRolesRequest);
        System.out.println(response);
    }
    /**
     * listThePermissionsOfTheGroup
     *
     */
    @Test
    public void listThePermissionsOfTheGroupTest() {
        ListThePermissionsOfTheGroupRequest listThePermissionsOfTheGroupRequest = new ListThePermissionsOfTheGroupRequest();
        listThePermissionsOfTheGroupRequest.setGroupName("");
        ListThePermissionsOfTheGroupResponse response = iamClient.listThePermissionsOfTheGroup(listThePermissionsOfTheGroupRequest);
        System.out.println(response);
    }
    /**
     * listTheSubjectsGrantedPermissions
     *
     */
    @Test
    public void listTheSubjectsGrantedPermissionsTest() {
        ListTheSubjectsGrantedPermissionsRequest listTheSubjectsGrantedPermissionsRequest = new ListTheSubjectsGrantedPermissionsRequest();
        listTheSubjectsGrantedPermissionsRequest.setPolicyId("");
        listTheSubjectsGrantedPermissionsRequest.setGrantType("");
        ListTheSubjectsGrantedPermissionsResponse response = iamClient.listTheSubjectsGrantedPermissions(listTheSubjectsGrantedPermissionsRequest);
        System.out.println(response);
    }
    /**
     * listTheUserSPermissions
     *
     */
    @Test
    public void listTheUserSPermissionsTest() {
        ListTheUserSPermissionsRequest listTheUserSPermissionsRequest = new ListTheUserSPermissionsRequest();
        listTheUserSPermissionsRequest.setUserName("");
        ListTheUserSPermissionsResponse response = iamClient.listTheUserSPermissions(listTheUserSPermissionsRequest);
        System.out.println(response);
    }
    /**
     * listUser
     *
     */
    @Test
    public void listUserTest() {
        ListUserResponse response = iamClient.listUser();
        System.out.println(response);
    }
    /**
     * listUserGroups
     *
     */
    @Test
    public void listUserGroupsTest() {
        ListUserGroupsRequest listUserGroupsRequest = new ListUserGroupsRequest();
        listUserGroupsRequest.setUserName("");
        ListUserGroupsResponse response = iamClient.listUserGroups(listUserGroupsRequest);
        System.out.println(response);
    }
    /**
     * listUsersWithinTheGroup
     *
     */
    @Test
    public void listUsersWithinTheGroupTest() {
        ListUsersWithinTheGroupRequest listUsersWithinTheGroupRequest = new ListUsersWithinTheGroupRequest();
        listUsersWithinTheGroupRequest.setGroupName("");
        ListUsersWithinTheGroupResponse response = iamClient.listUsersWithinTheGroup(listUsersWithinTheGroupRequest);
        System.out.println(response);
    }
    /**
     * modifySubUserOperationProtection
     *
     */
    @Test
    public void modifySubUserOperationProtectionTest() {
        ModifySubUserOperationProtectionRequest modifySubUserOperationProtectionRequest = new ModifySubUserOperationProtectionRequest();
        modifySubUserOperationProtectionRequest.setUserName("");
        modifySubUserOperationProtectionRequest.setEnabledMfa(false);
        modifySubUserOperationProtectionRequest.setMfaType("");
        iamClient.modifySubUserOperationProtection(modifySubUserOperationProtectionRequest);
    }
    /**
     * obtainAListOfPermanentlyValidApikeys
     *
     */
    @Test
    public void obtainAListOfPermanentlyValidApikeysTest() {
        ObtainAListOfPermanentlyValidApikeysRequest obtainAListOfPermanentlyValidApikeysRequest = new ObtainAListOfPermanentlyValidApikeysRequest();
        obtainAListOfPermanentlyValidApikeysRequest.setUserId("");
        obtainAListOfPermanentlyValidApikeysRequest.setService(new ArrayList<>());
        obtainAListOfPermanentlyValidApikeysRequest.setPageNo(0);
        obtainAListOfPermanentlyValidApikeysRequest.setPageSize(0);
        ObtainAListOfPermanentlyValidApikeysResponse response = iamClient.obtainAListOfPermanentlyValidApikeys(obtainAListOfPermanentlyValidApikeysRequest);
        System.out.println(response);
    }
    /**
     * queryApikeyDetailsPermanentlyValid
     *
     */
    @Test
    public void queryApikeyDetailsPermanentlyValidTest() {
        QueryApikeyDetailsPermanentlyValidRequest queryApikeyDetailsPermanentlyValidRequest = new QueryApikeyDetailsPermanentlyValidRequest();
        queryApikeyDetailsPermanentlyValidRequest.setUserId("");
        queryApikeyDetailsPermanentlyValidRequest.setId("");
        QueryApikeyDetailsPermanentlyValidResponse response = iamClient.queryApikeyDetailsPermanentlyValid(queryApikeyDetailsPermanentlyValidRequest);
        System.out.println(response);
    }
    /**
     * queryGroup
     *
     */
    @Test
    public void queryGroupTest() {
        QueryGroupRequest queryGroupRequest = new QueryGroupRequest();
        queryGroupRequest.setGroupName("");
        iamClient.queryGroup(queryGroupRequest);
    }
    /**
     * queryRole
     *
     */
    @Test
    public void queryRoleTest() {
        QueryRoleRequest queryRoleRequest = new QueryRoleRequest();
        queryRoleRequest.setRoleName("");
        iamClient.queryRole(queryRoleRequest);
    }
    /**
     * queryStrategy
     *
     */
    @Test
    public void queryStrategyTest() {
        QueryStrategyRequest queryStrategyRequest = new QueryStrategyRequest();
        queryStrategyRequest.setPolicyName("");
        queryStrategyRequest.setPolicyType("");
        iamClient.queryStrategy(queryStrategyRequest);
    }
    /**
     * querySubUserIdp
     *
     */
    @Test
    public void querySubUserIdpTest() {
        QuerySubUserIdpResponse response = iamClient.querySubUserIdp();
        System.out.println(response);
    }
    /**
     * querySummaryOfMainAccount
     *
     */
    @Test
    public void querySummaryOfMainAccountTest() {
        QuerySummaryOfMainAccountResponse response = iamClient.querySummaryOfMainAccount();
        System.out.println(response);
    }
    /**
     * queryTheLastUsageTimeOfAccesskey
     *
     */
    @Test
    public void queryTheLastUsageTimeOfAccesskeyTest() {
        QueryTheLastUsageTimeOfAccesskeyRequest queryTheLastUsageTimeOfAccesskeyRequest = new QueryTheLastUsageTimeOfAccesskeyRequest();
        queryTheLastUsageTimeOfAccesskeyRequest.setAccessKeyId("");
        QueryTheLastUsageTimeOfAccesskeyResponse response = iamClient.queryTheLastUsageTimeOfAccesskey(queryTheLastUsageTimeOfAccesskeyRequest);
        System.out.println(response);
    }
    /**
     * removeGroupPermissions
     *
     */
    @Test
    public void removeGroupPermissionsTest() {
        RemoveGroupPermissionsRequest removeGroupPermissionsRequest = new RemoveGroupPermissionsRequest();
        removeGroupPermissionsRequest.setGroupName("");
        removeGroupPermissionsRequest.setPolicyName("");
        removeGroupPermissionsRequest.setPolicyType("");
        iamClient.removeGroupPermissions(removeGroupPermissionsRequest);
    }
    /**
     * removeRolePermissions
     *
     */
    @Test
    public void removeRolePermissionsTest() {
        RemoveRolePermissionsRequest removeRolePermissionsRequest = new RemoveRolePermissionsRequest();
        removeRolePermissionsRequest.setRoleName("");
        removeRolePermissionsRequest.setPolicyName("");
        removeRolePermissionsRequest.setPolicyType("");
        iamClient.removeRolePermissions(removeRolePermissionsRequest);
    }
    /**
     * removeUserFromTheGroup
     *
     */
    @Test
    public void removeUserFromTheGroupTest() {
        RemoveUserFromTheGroupRequest removeUserFromTheGroupRequest = new RemoveUserFromTheGroupRequest();
        removeUserFromTheGroupRequest.setUserName("");
        removeUserFromTheGroupRequest.setGroupName("");
        iamClient.removeUserFromTheGroup(removeUserFromTheGroupRequest);
    }
    /**
     * removeUserPermissions
     *
     */
    @Test
    public void removeUserPermissionsTest() {
        RemoveUserPermissionsRequest removeUserPermissionsRequest = new RemoveUserPermissionsRequest();
        removeUserPermissionsRequest.setUserName("");
        removeUserPermissionsRequest.setPolicyName("");
        removeUserPermissionsRequest.setPolicyType("");
        iamClient.removeUserPermissions(removeUserPermissionsRequest);
    }
    /**
     * unbindSubUserVirtualMfa
     *
     */
    @Test
    public void unbindSubUserVirtualMfaTest() {
        UnbindSubUserVirtualMfaRequest unbindSubUserVirtualMfaRequest = new UnbindSubUserVirtualMfaRequest();
        unbindSubUserVirtualMfaRequest.setUserName("");
        unbindSubUserVirtualMfaRequest.setMfaType("");
        iamClient.unbindSubUserVirtualMfa(unbindSubUserVirtualMfaRequest);
    }
    /**
     * updateApikeyPermanentlyValid
     *
     */
    @Test
    public void updateApikeyPermanentlyValidTest() {
        UpdateApikeyPermanentlyValidRequest updateApikeyPermanentlyValidRequest = new UpdateApikeyPermanentlyValidRequest();
        updateApikeyPermanentlyValidRequest.setUserId("");
        updateApikeyPermanentlyValidRequest.setId("");
        updateApikeyPermanentlyValidRequest.setAcl(null);
        UpdateApikeyPermanentlyValidResponse response = iamClient.updateApikeyPermanentlyValid(updateApikeyPermanentlyValidRequest);
        System.out.println(response);
    }
    /**
     * updateGroup
     *
     */
    @Test
    public void updateGroupTest() {
        UpdateGroupRequest updateGroupRequest = new UpdateGroupRequest();
        updateGroupRequest.setGroupName("");
        updateGroupRequest.setName("");
        updateGroupRequest.setDescription("");
        iamClient.updateGroup(updateGroupRequest);
    }
    /**
     * updateLoginProfile
     *
     */
    @Test
    public void updateLoginProfileTest() {
        UpdateLoginProfileRequest updateLoginProfileRequest = new UpdateLoginProfileRequest();
        updateLoginProfileRequest.setUserName("");
        updateLoginProfileRequest.setPassword("");
        updateLoginProfileRequest.setNeedResetPassword(false);
        updateLoginProfileRequest.setEnabledLogin(false);
        updateLoginProfileRequest.setEnabledLoginMfa(false);
        updateLoginProfileRequest.setLoginMfaType("");
        updateLoginProfileRequest.setThirdPartyType("");
        updateLoginProfileRequest.setThirdPartyAccount("");
        iamClient.updateLoginProfile(updateLoginProfileRequest);
    }
    /**
     * updateRole
     *
     */
    @Test
    public void updateRoleTest() {
        UpdateRoleRequest updateRoleRequest = new UpdateRoleRequest();
        updateRoleRequest.setRoleName("");
        updateRoleRequest.setName("");
        updateRoleRequest.setDescription("");
        updateRoleRequest.setAssumeRolePolicyDocument("");
        iamClient.updateRole(updateRoleRequest);
    }
    /**
     * updateStrategy
     *
     */
    @Test
    public void updateStrategyTest() {
        UpdateStrategyRequest updateStrategyRequest = new UpdateStrategyRequest();
        updateStrategyRequest.setPolicyName("");
        updateStrategyRequest.setName("");
        updateStrategyRequest.setDescription("");
        updateStrategyRequest.setDocument("");
        iamClient.updateStrategy(updateStrategyRequest);
    }
    /**
     * updateSubUserIdp
     *
     */
    @Test
    public void updateSubUserIdpTest() {
        UpdateSubUserIdpRequest updateSubUserIdpRequest = new UpdateSubUserIdpRequest();
        updateSubUserIdpRequest.setFileName("");
        updateSubUserIdpRequest.setEncodeMetadata("");
        updateSubUserIdpRequest.setAuxiliaryDomain("");
        UpdateSubUserIdpResponse response = iamClient.updateSubUserIdp(updateSubUserIdpRequest);
        System.out.println(response);
    }
    /**
     * updateSubUserIdpStatus
     *
     */
    @Test
    public void updateSubUserIdpStatusTest() {
        UpdateSubUserIdpStatusRequest updateSubUserIdpStatusRequest = new UpdateSubUserIdpStatusRequest();
        updateSubUserIdpStatusRequest.setStatus("");
        UpdateSubUserIdpStatusResponse response = iamClient.updateSubUserIdpStatus(updateSubUserIdpStatusRequest);
        System.out.println(response);
    }
    /**
     * updateUser
     *
     */
    @Test
    public void updateUserTest() {
        UpdateUserRequest updateUserRequest = new UpdateUserRequest();
        updateUserRequest.setUserName("");
        updateUserRequest.setName("");
        updateUserRequest.setDescription("");
        updateUserRequest.setEnabled(false);
        iamClient.updateUser(updateUserRequest);
    }
}
