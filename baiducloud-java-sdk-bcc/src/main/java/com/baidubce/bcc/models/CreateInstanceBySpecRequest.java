package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateInstanceBySpecRequest extends BaseBceRequest {

    /**
    * 是否使用镜像预设的密码，默认取值：false。true：表示使用镜像中预设的密码; false：表示不使用镜像中预设的密码。 1. 若取值为“true”，则password、keypairId需为空。 2. 仅支持镜像为自定义镜像或共享镜像。
    */
    private Boolean keepImageLogin;

    /**
    * 在创建BCC实例时执行的自动化脚本
    */
    private String bccCreateWithScript;

    /**
    * 虚拟机名字（可选）。默认都不指定name。如果指定name：批量时name作为名字的前缀。后端将加上后缀，后缀生成方式：name{
    * -序号}。如果没有指定name，则自动生成，方式：{instance-八位随机串-序号}。注：随机串从0~9a~z生成；序号按照count的数量级，依次递增，如果count为100，则序号从000~100递增，如果为10，则从00~10递增。支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    /**
    * 调整每物理核的线程数（vCPU），本质上对应各处理器的超线程能力是否启用。 取值范围：1、2 注意： 1. 默认情况下，百度智能云实例按照默认值2配置。 2. 仅Intel第七代以上、AMD第三代以上的裸金属实例规格支持设置 CPU 线程数。
    */
    private String cpuThreadConfig;

    /**
    * 调整CPU的NUMA配置，对于不同处理器平台取值有不同含义。 1. Intel平台：0代表关闭NUMA特性，1代表开启NUMA特性。 2. AMD平台：主要影响NPS(Nodes Per Socket)的配置，可取值0、1、2、4、auto，分别对应NPS0、NPS1、NPS2、NPS4以及自动。 注意： 1.
    * 默认情况下，百度智能云实例按照开启NUMA优化（Intel实例）、NPS1（AMD实例），也即默认值1配置。 2. 仅Intel第七代以上、AMD第三代以上的裸金属实例规格支持设置NUMA选项。
    */
    private String numaConfig;

    /**
    * 是否开启删除保护功能
    */
    private Boolean enableDeleteProtection;

    /**
    * 虚拟机主机名（可选）。默认都不指定hostname。如果指定hostname：批量时hostname作为名字的前缀。后端将加上后缀，后缀生成方式：name{
    * -序号}。如果没有指定name，则自动生成，方式：{instance-八位随机串-序号}。注：随机串从0~9a~z生成；序号按照count的数量级，依次递增，如果count为100，则序号从000~100递增，如果为10，则从00~10递增。仅支持小写字母、数字以及- .
    * 特殊字符，必须以字母开头，不可连续使用特殊符号，不支持特殊符号开头或结尾，长度2-64
    */
    private String hostname;

    /**
    * 是否自动生成name和hostname有序后缀（可选参数） 是:true 否:false
    */
    private Boolean autoSeqSuffix;

    /**
    * 是否自动生成hostname domain（可选参数） 是:true 否:false
    */
    private Boolean isOpenHostnameDomain;

    /**
    * 待指定的实例管理员密码，8-32位字符，大写字母、小写字母、数字、特殊符号至少存在三种，符号仅限()`~!@#$%^&*-_+=\|{}[]:;'<>,.?/，密码需要加密传输
    */
    private String adminPass;

    /**
    * 待创建实例所要绑定的密钥对ID
    */
    private String keypairId;

    /**
    * 自动快照策略ID
    */
    private String aspId;

    /**
    * 规格族
    */
    private String specId;

    /**
    * 是否开启Jumbo帧，默认值false，开启:true，关闭:false。注意:只有支持Jumbo帧的套餐才能开启
    */
    private Boolean enableJumboFrame;

    /**
    * 若实例满足使用实例自定义数据的限制，您可传入UserData信息。因为传输API请求时，不会加密您设置的UserData，建议不要以明文方式传入机密的信息，例如密码和私钥等。如果必须传入，建议加密后，然后以Base64的方式编码后再传入，在实例内部以同样的方式反解密。
    */
    private String userData;

    /**
    * 实例释放保护，默认0未开启，1开启，开启后禁止手动释放虚机
    */
    private String deletionProtection;

    /**
    * 若开启自动续费，则需传值，不开启为空。按月付费或者按年付费 月是"month",年是"year"
    */
    private String autoRenewTimeUnit;

    /**
    * 若开启自动续费，则需传值，不开启为空。自动续费的时间 按月是1-9 按年是 1-5
    */
    private Integer autoRenewTime;

    /**
    * 主机安全类型，isOpenHostEye为true时生效； "enterprise"，表示开启企业版主机安全；“open”或不传，表示开启基础版主机安全
    */
    private String hosteyeType;

    /**
    * 控制是否启用NUMA优化功能
    */
    private Boolean enableNuma;

    /**
    * 数据盘文件格式,可选值：xfs，ext4
    */
    private String dataPartitionType;

    /**
    * 系统盘文件格式,可选值：xfs，ext4
    */
    private String rootPartitionType;

    /**
    * 【此参数废弃，cds自动续费和bcc保持一致】cds是否自动续费 是:true 否:false
    */
    private Boolean cdsAutoRenew;

    /**
    * 待创建的CDS磁盘列表
    */
    private List<CreateCdsModel> createCdsList;

    /**
    * 待创建虚拟机实例的镜像ID，可通过调用查询镜像列表接口选择获取所需镜像ID。
    */
    private String imageId;

    /**
    * 待创建虚拟机实例的套餐规格例bcc.g7.c2m8，通过使用实例套餐规格列表接口来查看可使用实例套餐及套餐规格。
    */
    private String spec;

    /**
    * 角色名称
    */
    private String roleName;

    /**
    * 抢占实例出价模型， 市场价: "market" 自定义："custom"。参考BidModel
    */
    private String bidModel;

    /**
    * 抢占实例出价金额，单位：元/分钟。若是自定义出价，且出价金额小于市场价，则不允许创建。当bidModel='custom'时才有效。
    */
    private String bidPrice;

    /**
    * 待创建虚拟机实例的系统盘大小，单位GB，Linux默认是20GB，范围为[10,2048]GB,Windows默认是40GB，范围为[40, 2048]GB。注意指定的系统盘大小需要满足所使用镜像最小磁盘空间限制。
    */
    private Integer rootDiskSizeInGb;

    /**
    * 配置根磁盘的额外IO性能
    */
    private String rootDiskExtraIo;

    /**
    * 待创建虚拟机实例系统盘介质，默认使用高性能云磁盘（hp1），可指定系统盘磁盘类型可参见StorageType。
    */
    private String rootDiskStorageType;

    /**
    * 公网带宽，单位为Mbps。对于包年包月以及按使用带宽计费的后付费EIP，标准型BGP限制为1~500之间的整数，增强型BGP限制为100~5000之间的整数（代表带宽上限）；对于按使用流量计费的后付费EIP，标准型BGP限制为1~200之间的整数（代表允许的带宽流量峰值），为0表示不分配公网IP，默认为0Mbps
    */
    private Integer networkCapacityInMbps;

    /**
    * 创建roce实例时可选参数，若为空则使用默认EHC集群
    */
    private String ehcClusterId;

    /**
    * 批量创建（购买）的虚拟机实例个数，必须为大于0的整数，可选参数，缺省为1
    */
    private Integer purchaseCount;

    /**
    * 批量创建（购买）的虚拟机实例最小个数
    */
    private Integer purchaseMinCount;

    /**
    * 专属服务器id，指定虚机置放位置时指定该值。
    */
    private String dedicatedHostId;

    /**
    * 其关联资源CDS（数据盘）、EIP、快照、快照链是否统一加标签，默认为false。
    */
    private Boolean relationTag;

    /**
    * 待创建的标签列表
    */
    private List<TagModel> tags;

    /**
    * 指定实例要挂载的cfs文件系统列表
    */
    private List<FileSystemModel> fileSystems;

    /**
    * DCC实例可以创建多块本地盘，需要指定磁盘类型以及大小。其他类型BCC最多只能使用一块本地盘，使用默认磁盘类型，需要指定磁盘大小。FPGA实例以及GPU实例默认使用一块本地磁盘，根据配置指定本地盘大小
    */
    private List<EphemeralDisk> ephemeralDisks;

    /**
    * 已废弃，指定securityGroup信息，为空时将使用默认安全组
    */
    private String securityGroupId;

    /**
    * 指定企业安全组
    */
    private String enterpriseSecurityGroupId;

    /**
    * 指定securityGroup信息列表，为空时将使用默认安全组
    */
    private List<String> securityGroupIds;

    /**
    * 指定企业安全组信息列表，不为空时，securityGroupIds无效，为空时将使用默认安全组
    */
    private List<String> enterpriseSecurityGroupIds;

    /**
    * 指定subnet信息，为空时将使用默认子网
    */
    private String subnetId;

    /**
    * 指定实例所在的部署集id
    */
    private String deployId;

    /**
    * 指定实例所在的部署集id列表
    */
    private List<String> deployIdList;

    /**
    * 待挂载的弹性网卡短ID列表。批量创建时会根据传入数量平均分配到实例上，所以请保证传入的弹性网卡id数量是实例数量的整数倍，且每个实例分配的eni数量不超过实例能挂载的最大数量。ebc裸金属实例暂不支持。eniIds数量最大为5000。
    */
    private List<String> eniIds;

    /**
    * 创建实例时是否隐藏系统盘SN,默认false。 true:隐藏 fase:不隐藏
    */
    private String disableRootDiskSerial;

    /**
    * 指定zone信息，可通过调用查询可用区列表接口查询可用区列表。zoneName命名规范是“国家-region-可用区序列"，小写，例如北京可用区A为"cn-bj-a"。专属实例使用专属服务器所在zone,无需指定该字段。
    */
    private String zoneName;

    /**
    * 内网IP列表
    */
    private List<String> internalIps;

    /**
    * 指定实例要绑定的资源组id
    */
    private String resGroupId;

    /**
    * 实例绑定的后付费EIP是否随实例关联自动释放，是：true，否：false，不传默认为false。仅当公网带宽计费方式为按使用带宽/流量计费时，该参数才生效。
    */
    private Boolean isEipAutoRelatedDelete;

    /**
    * EIP线路类型，包含标准BGP（BGP）和增强BGP（BGP_S），默认标准BGP
    */
    private String networkPurchaseType;

    /**
    * 待创建虚拟机实例的类型，具体可选类型参见InstanceType，为空时使用默认虚机类型
    */
    private String instanceType;

    /**
    * 公网带宽计费方式，可选参数详见internetChargeType，若不指定internetChargeType，默认付费方式同BCC，预付费默认为包年包月按带宽，后付费默认为按使用带宽计费。
    */
    private String internetChargeType;

    /**
    * 公网IP名称，长度1～65个字节，字母开头，可包含字母数字-_/.字符。若不传该参数，服务会自动生成name。
    */
    private String eipName;

    /**
    * 是否开启主机安全，true:开启，false：关闭；不传默认开启
    */
    private Boolean isOpenHostEye;

    /**
    * 是否开启Ht,ebc使用，默认值true, true:开启，false:关闭
    */
    private Boolean enableHt;

    /**
    * billing
    */
    private Billing billing;

    /**
    * 待创建实例是否开启ipv6，只有当镜像和子网都支持ipv6时才可开启，true表示开启，false表示关闭，不传表示自动适配镜像和子网的ipv6支持情况
    */
    private Boolean isOpenIpv6;

    public Boolean getKeepImageLogin() {
        return keepImageLogin;
    }

    public CreateInstanceBySpecRequest setKeepImageLogin(Boolean keepImageLogin) {
        this.keepImageLogin = keepImageLogin;
        return this;
    }

    public String getBccCreateWithScript() {
        return bccCreateWithScript;
    }

    public CreateInstanceBySpecRequest setBccCreateWithScript(String bccCreateWithScript) {
        this.bccCreateWithScript = bccCreateWithScript;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateInstanceBySpecRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getCpuThreadConfig() {
        return cpuThreadConfig;
    }

    public CreateInstanceBySpecRequest setCpuThreadConfig(String cpuThreadConfig) {
        this.cpuThreadConfig = cpuThreadConfig;
        return this;
    }

    public String getNumaConfig() {
        return numaConfig;
    }

    public CreateInstanceBySpecRequest setNumaConfig(String numaConfig) {
        this.numaConfig = numaConfig;
        return this;
    }

    public Boolean getEnableDeleteProtection() {
        return enableDeleteProtection;
    }

    public CreateInstanceBySpecRequest setEnableDeleteProtection(Boolean enableDeleteProtection) {
        this.enableDeleteProtection = enableDeleteProtection;
        return this;
    }

    public String getHostname() {
        return hostname;
    }

    public CreateInstanceBySpecRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    public Boolean getAutoSeqSuffix() {
        return autoSeqSuffix;
    }

    public CreateInstanceBySpecRequest setAutoSeqSuffix(Boolean autoSeqSuffix) {
        this.autoSeqSuffix = autoSeqSuffix;
        return this;
    }

    public Boolean getIsOpenHostnameDomain() {
        return isOpenHostnameDomain;
    }

    public CreateInstanceBySpecRequest setIsOpenHostnameDomain(Boolean isOpenHostnameDomain) {
        this.isOpenHostnameDomain = isOpenHostnameDomain;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public CreateInstanceBySpecRequest setAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public String getKeypairId() {
        return keypairId;
    }

    public CreateInstanceBySpecRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getAspId() {
        return aspId;
    }

    public CreateInstanceBySpecRequest setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    public String getSpecId() {
        return specId;
    }

    public CreateInstanceBySpecRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }

    public Boolean getEnableJumboFrame() {
        return enableJumboFrame;
    }

    public CreateInstanceBySpecRequest setEnableJumboFrame(Boolean enableJumboFrame) {
        this.enableJumboFrame = enableJumboFrame;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public CreateInstanceBySpecRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getDeletionProtection() {
        return deletionProtection;
    }

    public CreateInstanceBySpecRequest setDeletionProtection(String deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }

    public String getAutoRenewTimeUnit() {
        return autoRenewTimeUnit;
    }

    public CreateInstanceBySpecRequest setAutoRenewTimeUnit(String autoRenewTimeUnit) {
        this.autoRenewTimeUnit = autoRenewTimeUnit;
        return this;
    }

    public Integer getAutoRenewTime() {
        return autoRenewTime;
    }

    public CreateInstanceBySpecRequest setAutoRenewTime(Integer autoRenewTime) {
        this.autoRenewTime = autoRenewTime;
        return this;
    }

    public String getHosteyeType() {
        return hosteyeType;
    }

    public CreateInstanceBySpecRequest setHosteyeType(String hosteyeType) {
        this.hosteyeType = hosteyeType;
        return this;
    }

    public Boolean getEnableNuma() {
        return enableNuma;
    }

    public CreateInstanceBySpecRequest setEnableNuma(Boolean enableNuma) {
        this.enableNuma = enableNuma;
        return this;
    }

    public String getDataPartitionType() {
        return dataPartitionType;
    }

    public CreateInstanceBySpecRequest setDataPartitionType(String dataPartitionType) {
        this.dataPartitionType = dataPartitionType;
        return this;
    }

    public String getRootPartitionType() {
        return rootPartitionType;
    }

    public CreateInstanceBySpecRequest setRootPartitionType(String rootPartitionType) {
        this.rootPartitionType = rootPartitionType;
        return this;
    }

    public Boolean getCdsAutoRenew() {
        return cdsAutoRenew;
    }

    public CreateInstanceBySpecRequest setCdsAutoRenew(Boolean cdsAutoRenew) {
        this.cdsAutoRenew = cdsAutoRenew;
        return this;
    }

    public List<CreateCdsModel> getCreateCdsList() {
        return createCdsList;
    }

    public CreateInstanceBySpecRequest setCreateCdsList(List<CreateCdsModel> createCdsList) {
        this.createCdsList = createCdsList;
        return this;
    }

    public String getImageId() {
        return imageId;
    }

    public CreateInstanceBySpecRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getSpec() {
        return spec;
    }

    public CreateInstanceBySpecRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public CreateInstanceBySpecRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public String getBidModel() {
        return bidModel;
    }

    public CreateInstanceBySpecRequest setBidModel(String bidModel) {
        this.bidModel = bidModel;
        return this;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public CreateInstanceBySpecRequest setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    public Integer getRootDiskSizeInGb() {
        return rootDiskSizeInGb;
    }

    public CreateInstanceBySpecRequest setRootDiskSizeInGb(Integer rootDiskSizeInGb) {
        this.rootDiskSizeInGb = rootDiskSizeInGb;
        return this;
    }

    public String getRootDiskExtraIo() {
        return rootDiskExtraIo;
    }

    public CreateInstanceBySpecRequest setRootDiskExtraIo(String rootDiskExtraIo) {
        this.rootDiskExtraIo = rootDiskExtraIo;
        return this;
    }

    public String getRootDiskStorageType() {
        return rootDiskStorageType;
    }

    public CreateInstanceBySpecRequest setRootDiskStorageType(String rootDiskStorageType) {
        this.rootDiskStorageType = rootDiskStorageType;
        return this;
    }

    public Integer getNetworkCapacityInMbps() {
        return networkCapacityInMbps;
    }

    public CreateInstanceBySpecRequest setNetworkCapacityInMbps(Integer networkCapacityInMbps) {
        this.networkCapacityInMbps = networkCapacityInMbps;
        return this;
    }

    public String getEhcClusterId() {
        return ehcClusterId;
    }

    public CreateInstanceBySpecRequest setEhcClusterId(String ehcClusterId) {
        this.ehcClusterId = ehcClusterId;
        return this;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public CreateInstanceBySpecRequest setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
        return this;
    }

    public Integer getPurchaseMinCount() {
        return purchaseMinCount;
    }

    public CreateInstanceBySpecRequest setPurchaseMinCount(Integer purchaseMinCount) {
        this.purchaseMinCount = purchaseMinCount;
        return this;
    }

    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public CreateInstanceBySpecRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    public Boolean getRelationTag() {
        return relationTag;
    }

    public CreateInstanceBySpecRequest setRelationTag(Boolean relationTag) {
        this.relationTag = relationTag;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public CreateInstanceBySpecRequest setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    public List<FileSystemModel> getFileSystems() {
        return fileSystems;
    }

    public CreateInstanceBySpecRequest setFileSystems(List<FileSystemModel> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }

    public List<EphemeralDisk> getEphemeralDisks() {
        return ephemeralDisks;
    }

    public CreateInstanceBySpecRequest setEphemeralDisks(List<EphemeralDisk> ephemeralDisks) {
        this.ephemeralDisks = ephemeralDisks;
        return this;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public CreateInstanceBySpecRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    public String getEnterpriseSecurityGroupId() {
        return enterpriseSecurityGroupId;
    }

    public CreateInstanceBySpecRequest setEnterpriseSecurityGroupId(String enterpriseSecurityGroupId) {
        this.enterpriseSecurityGroupId = enterpriseSecurityGroupId;
        return this;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public CreateInstanceBySpecRequest setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public List<String> getEnterpriseSecurityGroupIds() {
        return enterpriseSecurityGroupIds;
    }

    public CreateInstanceBySpecRequest setEnterpriseSecurityGroupIds(List<String> enterpriseSecurityGroupIds) {
        this.enterpriseSecurityGroupIds = enterpriseSecurityGroupIds;
        return this;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public CreateInstanceBySpecRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    public String getDeployId() {
        return deployId;
    }

    public CreateInstanceBySpecRequest setDeployId(String deployId) {
        this.deployId = deployId;
        return this;
    }

    public List<String> getDeployIdList() {
        return deployIdList;
    }

    public CreateInstanceBySpecRequest setDeployIdList(List<String> deployIdList) {
        this.deployIdList = deployIdList;
        return this;
    }

    public List<String> getEniIds() {
        return eniIds;
    }

    public CreateInstanceBySpecRequest setEniIds(List<String> eniIds) {
        this.eniIds = eniIds;
        return this;
    }

    public String getDisableRootDiskSerial() {
        return disableRootDiskSerial;
    }

    public CreateInstanceBySpecRequest setDisableRootDiskSerial(String disableRootDiskSerial) {
        this.disableRootDiskSerial = disableRootDiskSerial;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public CreateInstanceBySpecRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public List<String> getInternalIps() {
        return internalIps;
    }

    public CreateInstanceBySpecRequest setInternalIps(List<String> internalIps) {
        this.internalIps = internalIps;
        return this;
    }

    public String getResGroupId() {
        return resGroupId;
    }

    public CreateInstanceBySpecRequest setResGroupId(String resGroupId) {
        this.resGroupId = resGroupId;
        return this;
    }

    public Boolean getIsEipAutoRelatedDelete() {
        return isEipAutoRelatedDelete;
    }

    public CreateInstanceBySpecRequest setIsEipAutoRelatedDelete(Boolean isEipAutoRelatedDelete) {
        this.isEipAutoRelatedDelete = isEipAutoRelatedDelete;
        return this;
    }

    public String getNetworkPurchaseType() {
        return networkPurchaseType;
    }

    public CreateInstanceBySpecRequest setNetworkPurchaseType(String networkPurchaseType) {
        this.networkPurchaseType = networkPurchaseType;
        return this;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public CreateInstanceBySpecRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInternetChargeType() {
        return internetChargeType;
    }

    public CreateInstanceBySpecRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }

    public String getEipName() {
        return eipName;
    }

    public CreateInstanceBySpecRequest setEipName(String eipName) {
        this.eipName = eipName;
        return this;
    }

    public Boolean getIsOpenHostEye() {
        return isOpenHostEye;
    }

    public CreateInstanceBySpecRequest setIsOpenHostEye(Boolean isOpenHostEye) {
        this.isOpenHostEye = isOpenHostEye;
        return this;
    }

    public Boolean getEnableHt() {
        return enableHt;
    }

    public CreateInstanceBySpecRequest setEnableHt(Boolean enableHt) {
        this.enableHt = enableHt;
        return this;
    }

    public Billing getBilling() {
        return billing;
    }

    public CreateInstanceBySpecRequest setBilling(Billing billing) {
        this.billing = billing;
        return this;
    }

    public Boolean getIsOpenIpv6() {
        return isOpenIpv6;
    }

    public CreateInstanceBySpecRequest setIsOpenIpv6(Boolean isOpenIpv6) {
        this.isOpenIpv6 = isOpenIpv6;
        return this;
    }

}
