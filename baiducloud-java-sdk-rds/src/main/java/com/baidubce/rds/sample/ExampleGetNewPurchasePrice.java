package com.baidubce.rds.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rds.RdsClient;
import com.baidubce.rds.models.GetNewPurchasePriceRequest;
import com.baidubce.rds.models.BlbService;
import com.baidubce.rds.models.Instance;
import com.baidubce.rds.models.EncryptStrategy;
import com.baidubce.rds.models.Topology;
import com.baidubce.rds.models.ResourceGroupsDetailFull;
import com.baidubce.rds.models.DccHostInfo;
import com.baidubce.rds.models.SnapshotPolicy;
import com.baidubce.rds.models.Endpoint;
import com.baidubce.rds.models.RoleInfo;
import com.baidubce.rds.models.GetNewPurchasePriceResponse;
import com.baidubce.rds.models.ReadReplicaIdMapping;
import com.baidubce.rds.models.MasterIdMapping;
import com.baidubce.rds.models.DccHostId;
import java.util.ArrayList;

public class ExampleGetNewPurchasePrice {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        RdsClient client = new RdsClient(bceClientConfig);
        Instance instance = new Instance();
        instance.setInstanceId("");
        instance.setInstanceShortId("");
        instance.setInstanceName("");
        instance.setEngine("");
        instance.setEngineVersion("");
        instance.setRdsMinorVersion("");
        instance.setCharacterSetName("");
        Endpoint endpoint = new Endpoint();
        endpoint.setPort(0);
        endpoint.setVnetIp("");
        endpoint.setInetIp("");
        endpoint.setAddress("");
        endpoint.setInetIpV6("");
        endpoint.setVnetIpV6("");

        instance.setEndpoint(endpoint);
        instance.setInstanceClass("");
        instance.setAllocatedMemoryInMB(0);
        instance.setAllocatedMemoryInGB(0);
        instance.setMemoryCapacity(0.0);
        instance.setAllocatedStorageInGB(0);
        instance.setVolumeCapacity(0);
        instance.setTotalStorageInGB(0);
        instance.setUsedStorageInMB(0);
        instance.setUsedStorageInGB(0.0);
        instance.setUsedStorage(0.0);
        instance.setCpuCount(0);
        instance.setInstanceType("");
        instance.setSourceInstanceId("");
        instance.setReadReplicaNum(0);
        instance.setReadReplica(new ArrayList<>());
        instance.setInstanceStatus("");
        instance.setLockMode("");
        instance.setEipStatus("");
        instance.setPublicAccessStatus("");
        instance.setSuperUserFlag("");
        instance.setReplicationType("");
        instance.setSyncMode("");
        instance.setSqlserverBrType("");
        SnapshotPolicy backupPolicy = new SnapshotPolicy();
        backupPolicy.setBackupTime("");
        backupPolicy.setBackupDays("");
        backupPolicy.setPersistent(false);
        backupPolicy.setExpireInDays(0);
        backupPolicy.setLogBackupRetainDays(0);
        backupPolicy.setFreeSpaceInGB(0);
        backupPolicy.setDataBackupType("");
        backupPolicy.setFreeSpace(0);
        backupPolicy.setIncrementalDataBackupEnable(false);
        backupPolicy.setTimeUnit("");
        backupPolicy.setDataBackupCopyEnable(false);
        backupPolicy.setIncrementalDataBackupInterval(0);
        backupPolicy.setLatestDataBackupRetainDays(0);
        backupPolicy.setRetentionPeriod(0);
        backupPolicy.setDataBackupRetainStrategys(new ArrayList<>());
        EncryptStrategy encryptStrategy = new EncryptStrategy();
        encryptStrategy.setEncryptEnable(false);
        encryptStrategy.setKeyManagementServiceName("");
        encryptStrategy.setKeyManagementType("");
        encryptStrategy.setSecretKeyID("");

        backupPolicy.setEncryptStrategy(encryptStrategy);

        instance.setBackupPolicy(backupPolicy);
        BlbService blbService = new BlbService();
        blbService.setStatus("");
        blbService.setService("");

        instance.setBlbService(blbService);
        instance.setPubliclyAccessible(false);
        instance.setInstanceCreateTime("");
        instance.setInstanceExpireTime("");
        instance.setProductType("");
        instance.setPaymentTiming("");
        Topology topology = new Topology();
        topology.setMaster(new ArrayList<>());
        topology.setReadReplica(new ArrayList<>());
        topology.setRdsproxy(new ArrayList<>());
        topology.setReadReplicaIdMapping(new ArrayList<>());
        MasterIdMapping masterIdMapping = new MasterIdMapping();
        masterIdMapping.setAppId("");
        masterIdMapping.setAppIdShort("");
        masterIdMapping.setStatus("");
        masterIdMapping.setAllocatedMemoryInMB(0);
        masterIdMapping.setCpuCount(0);
        masterIdMapping.setAllocatedStorageInGB(0);
        masterIdMapping.setUsedStorageInGB(0.0);

        topology.setMasterIdMapping(masterIdMapping);
        ReadReplicaIdMapping rdsproxyIdMapping = new ReadReplicaIdMapping();
        rdsproxyIdMapping.setAppId("");
        rdsproxyIdMapping.setAppIdShort("");
        rdsproxyIdMapping.setStatus("");
        rdsproxyIdMapping.setAllocatedMemoryInMB(0);
        rdsproxyIdMapping.setCpuCount(0);
        rdsproxyIdMapping.setAllocatedStorageInGB(0);
        rdsproxyIdMapping.setUsedStorageInGB(0.0);

        topology.setRdsproxyIdMapping(rdsproxyIdMapping);
        topology.setRdsproxyIdMappings(new ArrayList<>());

        instance.setTopology(topology);
        instance.setAzone("");
        instance.setVpcId("");
        instance.setSubnetId(java.util.Collections.singletonMap("key", ""));
        instance.setPhysicalZone(java.util.Collections.singletonMap("key", ""));
        instance.setRegion("");
        instance.setSourceRegion("");
        instance.setBillingStatus("");
        instance.setApplicationType("");
        instance.setNodeAmount(0);
        instance.setOldInstance(0);
        instance.setOnlineStatus(0);
        instance.setIsSingle(false);
        DccHostInfo dccHostIds = new DccHostInfo();
        DccHostId master = new DccHostId();
        master.setHostId("");
        master.setAzone("");

        dccHostIds.setMaster(master);
        DccHostId backup = new DccHostId();
        backup.setHostId("");
        backup.setAzone("");

        dccHostIds.setBackup(backup);

        instance.setDccHostIds(dccHostIds);
        instance.setMachineType(0);
        instance.setWeight(0);
        instance.setNodeType("");
        instance.setRepairStartTime("");
        instance.setRepairEndTime("");
        instance.setQuotStatus("");
        RoleInfo nodeReadReplica = new RoleInfo();
        nodeReadReplica.setId("");
        nodeReadReplica.setAzone("");
        nodeReadReplica.setSubnetId("");
        nodeReadReplica.setName("");
        nodeReadReplica.setVpcCidr("");
        nodeReadReplica.setShortId("");

        instance.setNodeReadReplica(nodeReadReplica);
        RoleInfo nodeMaster = new RoleInfo();
        nodeMaster.setId("");
        nodeMaster.setAzone("");
        nodeMaster.setSubnetId("");
        nodeMaster.setName("");
        nodeMaster.setVpcCidr("");
        nodeMaster.setShortId("");

        instance.setNodeMaster(nodeMaster);
        RoleInfo nodeSlave = new RoleInfo();
        nodeSlave.setId("");
        nodeSlave.setAzone("");
        nodeSlave.setSubnetId("");
        nodeSlave.setName("");
        nodeSlave.setVpcCidr("");
        nodeSlave.setShortId("");

        instance.setNodeSlave(nodeSlave);
        RoleInfo nodeProxy = new RoleInfo();
        nodeProxy.setId("");
        nodeProxy.setAzone("");
        nodeProxy.setSubnetId("");
        nodeProxy.setName("");
        nodeProxy.setVpcCidr("");
        nodeProxy.setShortId("");

        instance.setNodeProxy(nodeProxy);
        instance.setDiskIoType("");
        instance.setGroupId("");
        instance.setGroupName("");
        instance.setTdeStatus("");
        instance.setUserId("");
        instance.setBgwGroupId("");
        instance.setBgwGroupExclusive(false);
        instance.setRoGroupList(new ArrayList<>());
        instance.setRoGroupAbnormal(false);
        instance.setDiskType("");
        instance.setCdsType("");
        instance.setMaintainStartTime("");
        instance.setMaintainDuration(0);
        instance.setMaintainPeriod("");
        instance.setInstanceSubStatus("");
        instance.setBcmSendCycle("");
        instance.setAutoResizeDisk(0);
        instance.setAutoResizeCpu(0);
        instance.setEdgeRegion("");
        instance.setEdgeRegionName("");
        instance.setEdgeVpcId("");
        instance.setEdgeSubnetId("");
        instance.setGtidType(0);
        RoleInfo nodeMasterReadReplica = new RoleInfo();
        nodeMasterReadReplica.setId("");
        nodeMasterReadReplica.setAzone("");
        nodeMasterReadReplica.setSubnetId("");
        nodeMasterReadReplica.setName("");
        nodeMasterReadReplica.setVpcCidr("");
        nodeMasterReadReplica.setShortId("");

        instance.setNodeMasterReadReplica(nodeMasterReadReplica);
        RoleInfo nodeBackupReadReplica = new RoleInfo();
        nodeBackupReadReplica.setId("");
        nodeBackupReadReplica.setAzone("");
        nodeBackupReadReplica.setSubnetId("");
        nodeBackupReadReplica.setName("");
        nodeBackupReadReplica.setVpcCidr("");
        nodeBackupReadReplica.setShortId("");

        instance.setNodeBackupReadReplica(nodeBackupReadReplica);
        instance.setHaStrategy(0);
        instance.setIsDBRSEnable(false);
        instance.setReplicaType("");
        instance.setResourceType("");
        instance.setCdsEncrypt(0);
        instance.setCdsEncryptKey("");
        instance.setResourcePlatform("");
        instance.setLocation("");
        instance.setHasSlave(false);
        instance.setExpireDate(0);
        instance.setHasProxy(false);
        instance.setVpcName("");
        instance.setResourceUuid("");
        instance.setTags(new ArrayList<>());
        instance.setTask("");
        instance.setOrderStatus("");
        instance.setVpcCidr("");
        instance.setZoneNames(new ArrayList<>());
        instance.setDccHosts(new ArrayList<>());
        instance.setCategory("");
        instance.setName("");
        ResourceGroupsDetailFull resourceGroup = new ResourceGroupsDetailFull();
        resourceGroup.setGroups(new ArrayList<>());
        resourceGroup.setName("");
        resourceGroup.setType("");
        resourceGroup.setRegion("");
        resourceGroup.setId("");
        resourceGroup.setUuid("");
        resourceGroup.setSummary("");
        resourceGroup.setUrl("");
        resourceGroup.setAccountId("");
        resourceGroup.setUserId("");
        resourceGroup.setTags(new ArrayList<>());
        resourceGroup.setResUuid("");

        instance.setResourceGroup(resourceGroup);
        instance.setResourceGroupId("");
        instance.setResourceGroupName("");
        instance.setIsChargeProxy(false);
        instance.setSingle(false);

        GetNewPurchasePriceRequest getNewPurchasePriceRequest = new GetNewPurchasePriceRequest();
        getNewPurchasePriceRequest.setInstance(instance);
        getNewPurchasePriceRequest.setDuration(0);
        getNewPurchasePriceRequest.setNumber(0);
        getNewPurchasePriceRequest.setProductType("");
        try {
            GetNewPurchasePriceResponse response = client.getNewPurchasePrice(getNewPurchasePriceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
