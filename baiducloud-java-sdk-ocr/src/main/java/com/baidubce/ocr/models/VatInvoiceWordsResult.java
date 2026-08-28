package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VatInvoiceWordsResult {
    /**
     * 发票消费类型。不同消费类型输出：餐饮、电器设备、通讯、服务、日用品食品、医疗、交通、其他
     */
    @JsonProperty("ServiceType")
    private String serviceType;

    /**
     * 发票种类。不同类型发票输出：普通发票、专用发票、电子普通发票、电子专用发票、通行费电子普票、区块链发票、通用机打电子发票、电子发票(专用发票)、电子发票(普通发票)
     */
    @JsonProperty("InvoiceType")
    private String invoiceType;

    /**
     * 发票名称
     */
    @JsonProperty("InvoiceTypeOrg")
    private String invoiceTypeOrg;

    /**
     * 发票代码
     */
    @JsonProperty("InvoiceCode")
    private String invoiceCode;

    /**
     * 发票号码
     */
    @JsonProperty("InvoiceNum")
    private String invoiceNum;

    /**
     * 发票代码的辅助校验码，一般业务情景可忽略
     */
    @JsonProperty("InvoiceCodeConfirm")
    private String invoiceCodeConfirm;

    /**
     * 发票号码的辅助校验码，一般业务情景可忽略
     */
    @JsonProperty("InvoiceNumConfirm")
    private String invoiceNumConfirm;

    /**
     * 数电票号，仅针对纸质的全电发票，在密码区有数电票号码的字段输出
     */
    @JsonProperty("InvoiceNumDigit")
    private String invoiceNumDigit;

    /**
     * 增值税发票左上角标志。包含：通行费、销项负数、代开、收购、成品油、其他
     */
    @JsonProperty("InvoiceTag")
    private String invoiceTag;

    /**
     * 机打号码。仅增值税卷票含有此参数
     */
    @JsonProperty("MachineNum")
    private String machineNum;

    /**
     * 机器编号。仅增值税卷票含有此参数
     */
    @JsonProperty("MachineCode")
    private String machineCode;

    /**
     * 校验码
     */
    @JsonProperty("CheckCode")
    private String checkCode;

    /**
     * 开票日期
     */
    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    /**
     * 购方名称
     */
    @JsonProperty("PurchaserName")
    private String purchaserName;

    /**
     * 购方纳税人识别号
     */
    @JsonProperty("PurchaserRegisterNum")
    private String purchaserRegisterNum;

    /**
     * 购方地址及电话
     */
    @JsonProperty("PurchaserAddress")
    private String purchaserAddress;

    /**
     * 购方开户行及账号
     */
    @JsonProperty("PurchaserBank")
    private String purchaserBank;

    /**
     * 密码区
     */
    @JsonProperty("Password")
    private String password;

    /**
     * 省
     */
    @JsonProperty("Province")
    private String province;

    /**
     * 市
     */
    @JsonProperty("City")
    private String city;

    /**
     * 联次信息。专票第一联到第三联分别输出：第一联：记账联、第二联：抵扣联、第三联：发票联；普通发票第一联到第二联分别输出：第一联：记账联、第二联：发票联
     */
    @JsonProperty("SheetNum")
    private String sheetNum;

    /**
     * 是否代开
     */
    @JsonProperty("Agent")
    private String agent;

    /**
     * 货物名称
     */
    @JsonProperty("CommodityName")
    private List<VatInvoiceRowWord> commodityName;

    /**
     * 规格型号
     */
    @JsonProperty("CommodityType")
    private List<VatInvoiceRowWord> commodityType;

    /**
     * 单位
     */
    @JsonProperty("CommodityUnit")
    private List<VatInvoiceRowWord> commodityUnit;

    /**
     * 数量
     */
    @JsonProperty("CommodityNum")
    private List<VatInvoiceRowWord> commodityNum;

    /**
     * 单价
     */
    @JsonProperty("CommodityPrice")
    private List<VatInvoiceRowWord> commodityPrice;

    /**
     * 金额
     */
    @JsonProperty("CommodityAmount")
    private List<VatInvoiceRowWord> commodityAmount;

    /**
     * 税率
     */
    @JsonProperty("CommodityTaxRate")
    private List<VatInvoiceRowWord> commodityTaxRate;

    /**
     * 税额
     */
    @JsonProperty("CommodityTax")
    private List<VatInvoiceRowWord> commodityTax;

    /**
     * 车牌号。仅通行费增值税电子普通发票含有此参数
     */
    @JsonProperty("CommodityPlateNum")
    private List<VatInvoiceRowWord> commodityPlateNum;

    /**
     * 类型。仅通行费增值税电子普通发票含有此参数
     */
    @JsonProperty("CommodityVehicleType")
    private List<VatInvoiceRowWord> commodityVehicleType;

    /**
     * 通行日期起。仅通行费增值税电子普通发票含有此参数
     */
    @JsonProperty("CommodityStartDate")
    private List<VatInvoiceRowWord> commodityStartDate;

    /**
     * 通行日期止。仅通行费增值税电子普通发票含有此参数
     */
    @JsonProperty("CommodityEndDate")
    private List<VatInvoiceRowWord> commodityEndDate;

    /**
     * 电子支付标识。仅区块链发票含有此参数
     */
    @JsonProperty("OnlinePay")
    private String onlinePay;

    /**
     * 销售方名称
     */
    @JsonProperty("SellerName")
    private String sellerName;

    /**
     * 销售方纳税人识别号
     */
    @JsonProperty("SellerRegisterNum")
    private String sellerRegisterNum;

    /**
     * 销售方地址及电话
     */
    @JsonProperty("SellerAddress")
    private String sellerAddress;

    /**
     * 销售方开户行及账号
     */
    @JsonProperty("SellerBank")
    private String sellerBank;

    /**
     * 合计金额
     */
    @JsonProperty("TotalAmount")
    private String totalAmount;

    /**
     * 合计税额
     */
    @JsonProperty("TotalTax")
    private String totalTax;

    /**
     * 价税合计(大写)
     */
    @JsonProperty("AmountInWords")
    private String amountInWords;

    /**
     * 价税合计(小写)
     */
    @JsonProperty("AmountInFiguers")
    private String amountInFiguers;

    /**
     * 收款人
     */
    @JsonProperty("Payee")
    private String payee;

    /**
     * 复核
     */
    @JsonProperty("Checker")
    private String checker;

    /**
     * 开票人
     */
    @JsonProperty("NoteDrawer")
    private String noteDrawer;

    /**
     * 备注
     */
    @JsonProperty("Remarks")
    private String remarks;

    /**
     * 判断是否存在公司印章。返回"0"或"1"，当seal_tag=true时返回该字段。1：代表存在公司印章；0：代表不存在公司印章
     */
    @JsonProperty("company_seal")
    private String companySeal;

    /**
     * 公司印章识别结果内容。当seal_tag=true时返回该字段
     */
    @JsonProperty("seal_info")
    private String sealInfo;

    /**
     * 判断是否存在监制印章。返回"0"或"1"，当seal_tag=true时返回该字段。1：代表存在监制印章；0：代表不存在监制印章
     */
    @JsonProperty("supervision_seal")
    private String supervisionSeal;

    /**
     * 监制印章识别结果内容。当seal_tag=true时返回该字段
     */
    @JsonProperty("supervision_seal_info")
    private String supervisionSealInfo;

    /**
     * 出行人，仅旅客运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("PassengerName")
    private List<String> passengerName;

    /**
     * 有效身份证件号，仅旅客运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("PassengerIdNum")
    private List<String> passengerIdNum;

    /**
     * 出行日期，仅旅客运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("PassengerDate")
    private List<String> passengerDate;

    /**
     * 出发地，仅旅客运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("PassengerDeparture")
    private List<String> passengerDeparture;

    /**
     * 到达地，仅旅客运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("PassengerArrival")
    private List<String> passengerArrival;

    /**
     * 等级，仅旅客运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("PassengerClass")
    private List<String> passengerClass;

    /**
     * 交通工具类型，仅旅客运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("PassengerVehicleType")
    private List<String> passengerVehicleType;

    /**
     * 运输工具种类，仅货物运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("TransportType")
    private List<String> transportType;

    /**
     * 运输工具牌号，仅货物运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("TransportPlateNum")
    private List<String> transportPlateNum;

    /**
     * 起运地，仅货物运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("TransportDeparture")
    private List<String> transportDeparture;

    /**
     * 到达地，仅货物运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("TransportArrival")
    private List<String> transportArrival;

    /**
     * 运输货物名称，仅货物运输类发票有此参数，其余类型该参数返回为空
     */
    @JsonProperty("TransportCargoInfo")
    private List<String> transportCargoInfo;

    public VatInvoiceWordsResult setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public VatInvoiceWordsResult setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public String getInvoiceType() {
        return this.invoiceType;
    }

    public VatInvoiceWordsResult setInvoiceTypeOrg(String invoiceTypeOrg) {
        this.invoiceTypeOrg = invoiceTypeOrg;
        return this;
    }

    public String getInvoiceTypeOrg() {
        return this.invoiceTypeOrg;
    }

    public VatInvoiceWordsResult setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public VatInvoiceWordsResult setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
        return this;
    }

    public String getInvoiceNum() {
        return this.invoiceNum;
    }

    public VatInvoiceWordsResult setInvoiceCodeConfirm(String invoiceCodeConfirm) {
        this.invoiceCodeConfirm = invoiceCodeConfirm;
        return this;
    }

    public String getInvoiceCodeConfirm() {
        return this.invoiceCodeConfirm;
    }

    public VatInvoiceWordsResult setInvoiceNumConfirm(String invoiceNumConfirm) {
        this.invoiceNumConfirm = invoiceNumConfirm;
        return this;
    }

    public String getInvoiceNumConfirm() {
        return this.invoiceNumConfirm;
    }

    public VatInvoiceWordsResult setInvoiceNumDigit(String invoiceNumDigit) {
        this.invoiceNumDigit = invoiceNumDigit;
        return this;
    }

    public String getInvoiceNumDigit() {
        return this.invoiceNumDigit;
    }

    public VatInvoiceWordsResult setInvoiceTag(String invoiceTag) {
        this.invoiceTag = invoiceTag;
        return this;
    }

    public String getInvoiceTag() {
        return this.invoiceTag;
    }

    public VatInvoiceWordsResult setMachineNum(String machineNum) {
        this.machineNum = machineNum;
        return this;
    }

    public String getMachineNum() {
        return this.machineNum;
    }

    public VatInvoiceWordsResult setMachineCode(String machineCode) {
        this.machineCode = machineCode;
        return this;
    }

    public String getMachineCode() {
        return this.machineCode;
    }

    public VatInvoiceWordsResult setCheckCode(String checkCode) {
        this.checkCode = checkCode;
        return this;
    }

    public String getCheckCode() {
        return this.checkCode;
    }

    public VatInvoiceWordsResult setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public VatInvoiceWordsResult setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
        return this;
    }

    public String getPurchaserName() {
        return this.purchaserName;
    }

    public VatInvoiceWordsResult setPurchaserRegisterNum(String purchaserRegisterNum) {
        this.purchaserRegisterNum = purchaserRegisterNum;
        return this;
    }

    public String getPurchaserRegisterNum() {
        return this.purchaserRegisterNum;
    }

    public VatInvoiceWordsResult setPurchaserAddress(String purchaserAddress) {
        this.purchaserAddress = purchaserAddress;
        return this;
    }

    public String getPurchaserAddress() {
        return this.purchaserAddress;
    }

    public VatInvoiceWordsResult setPurchaserBank(String purchaserBank) {
        this.purchaserBank = purchaserBank;
        return this;
    }

    public String getPurchaserBank() {
        return this.purchaserBank;
    }

    public VatInvoiceWordsResult setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public VatInvoiceWordsResult setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getProvince() {
        return this.province;
    }

    public VatInvoiceWordsResult setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return this.city;
    }

    public VatInvoiceWordsResult setSheetNum(String sheetNum) {
        this.sheetNum = sheetNum;
        return this;
    }

    public String getSheetNum() {
        return this.sheetNum;
    }

    public VatInvoiceWordsResult setAgent(String agent) {
        this.agent = agent;
        return this;
    }

    public String getAgent() {
        return this.agent;
    }

    public VatInvoiceWordsResult setCommodityName(List<VatInvoiceRowWord> commodityName) {
        this.commodityName = commodityName;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityName() {
        return this.commodityName;
    }

    public VatInvoiceWordsResult setCommodityType(List<VatInvoiceRowWord> commodityType) {
        this.commodityType = commodityType;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityType() {
        return this.commodityType;
    }

    public VatInvoiceWordsResult setCommodityUnit(List<VatInvoiceRowWord> commodityUnit) {
        this.commodityUnit = commodityUnit;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityUnit() {
        return this.commodityUnit;
    }

    public VatInvoiceWordsResult setCommodityNum(List<VatInvoiceRowWord> commodityNum) {
        this.commodityNum = commodityNum;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityNum() {
        return this.commodityNum;
    }

    public VatInvoiceWordsResult setCommodityPrice(List<VatInvoiceRowWord> commodityPrice) {
        this.commodityPrice = commodityPrice;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityPrice() {
        return this.commodityPrice;
    }

    public VatInvoiceWordsResult setCommodityAmount(List<VatInvoiceRowWord> commodityAmount) {
        this.commodityAmount = commodityAmount;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityAmount() {
        return this.commodityAmount;
    }

    public VatInvoiceWordsResult setCommodityTaxRate(List<VatInvoiceRowWord> commodityTaxRate) {
        this.commodityTaxRate = commodityTaxRate;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityTaxRate() {
        return this.commodityTaxRate;
    }

    public VatInvoiceWordsResult setCommodityTax(List<VatInvoiceRowWord> commodityTax) {
        this.commodityTax = commodityTax;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityTax() {
        return this.commodityTax;
    }

    public VatInvoiceWordsResult setCommodityPlateNum(List<VatInvoiceRowWord> commodityPlateNum) {
        this.commodityPlateNum = commodityPlateNum;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityPlateNum() {
        return this.commodityPlateNum;
    }

    public VatInvoiceWordsResult setCommodityVehicleType(List<VatInvoiceRowWord> commodityVehicleType) {
        this.commodityVehicleType = commodityVehicleType;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityVehicleType() {
        return this.commodityVehicleType;
    }

    public VatInvoiceWordsResult setCommodityStartDate(List<VatInvoiceRowWord> commodityStartDate) {
        this.commodityStartDate = commodityStartDate;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityStartDate() {
        return this.commodityStartDate;
    }

    public VatInvoiceWordsResult setCommodityEndDate(List<VatInvoiceRowWord> commodityEndDate) {
        this.commodityEndDate = commodityEndDate;
        return this;
    }

    public List<VatInvoiceRowWord> getCommodityEndDate() {
        return this.commodityEndDate;
    }

    public VatInvoiceWordsResult setOnlinePay(String onlinePay) {
        this.onlinePay = onlinePay;
        return this;
    }

    public String getOnlinePay() {
        return this.onlinePay;
    }

    public VatInvoiceWordsResult setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public VatInvoiceWordsResult setSellerRegisterNum(String sellerRegisterNum) {
        this.sellerRegisterNum = sellerRegisterNum;
        return this;
    }

    public String getSellerRegisterNum() {
        return this.sellerRegisterNum;
    }

    public VatInvoiceWordsResult setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
        return this;
    }

    public String getSellerAddress() {
        return this.sellerAddress;
    }

    public VatInvoiceWordsResult setSellerBank(String sellerBank) {
        this.sellerBank = sellerBank;
        return this;
    }

    public String getSellerBank() {
        return this.sellerBank;
    }

    public VatInvoiceWordsResult setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public VatInvoiceWordsResult setTotalTax(String totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    public String getTotalTax() {
        return this.totalTax;
    }

    public VatInvoiceWordsResult setAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords;
        return this;
    }

    public String getAmountInWords() {
        return this.amountInWords;
    }

    public VatInvoiceWordsResult setAmountInFiguers(String amountInFiguers) {
        this.amountInFiguers = amountInFiguers;
        return this;
    }

    public String getAmountInFiguers() {
        return this.amountInFiguers;
    }

    public VatInvoiceWordsResult setPayee(String payee) {
        this.payee = payee;
        return this;
    }

    public String getPayee() {
        return this.payee;
    }

    public VatInvoiceWordsResult setChecker(String checker) {
        this.checker = checker;
        return this;
    }

    public String getChecker() {
        return this.checker;
    }

    public VatInvoiceWordsResult setNoteDrawer(String noteDrawer) {
        this.noteDrawer = noteDrawer;
        return this;
    }

    public String getNoteDrawer() {
        return this.noteDrawer;
    }

    public VatInvoiceWordsResult setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public VatInvoiceWordsResult setCompanySeal(String companySeal) {
        this.companySeal = companySeal;
        return this;
    }

    public String getCompanySeal() {
        return this.companySeal;
    }

    public VatInvoiceWordsResult setSealInfo(String sealInfo) {
        this.sealInfo = sealInfo;
        return this;
    }

    public String getSealInfo() {
        return this.sealInfo;
    }

    public VatInvoiceWordsResult setSupervisionSeal(String supervisionSeal) {
        this.supervisionSeal = supervisionSeal;
        return this;
    }

    public String getSupervisionSeal() {
        return this.supervisionSeal;
    }

    public VatInvoiceWordsResult setSupervisionSealInfo(String supervisionSealInfo) {
        this.supervisionSealInfo = supervisionSealInfo;
        return this;
    }

    public String getSupervisionSealInfo() {
        return this.supervisionSealInfo;
    }

    public VatInvoiceWordsResult setPassengerName(List<String> passengerName) {
        this.passengerName = passengerName;
        return this;
    }

    public List<String> getPassengerName() {
        return this.passengerName;
    }

    public VatInvoiceWordsResult setPassengerIdNum(List<String> passengerIdNum) {
        this.passengerIdNum = passengerIdNum;
        return this;
    }

    public List<String> getPassengerIdNum() {
        return this.passengerIdNum;
    }

    public VatInvoiceWordsResult setPassengerDate(List<String> passengerDate) {
        this.passengerDate = passengerDate;
        return this;
    }

    public List<String> getPassengerDate() {
        return this.passengerDate;
    }

    public VatInvoiceWordsResult setPassengerDeparture(List<String> passengerDeparture) {
        this.passengerDeparture = passengerDeparture;
        return this;
    }

    public List<String> getPassengerDeparture() {
        return this.passengerDeparture;
    }

    public VatInvoiceWordsResult setPassengerArrival(List<String> passengerArrival) {
        this.passengerArrival = passengerArrival;
        return this;
    }

    public List<String> getPassengerArrival() {
        return this.passengerArrival;
    }

    public VatInvoiceWordsResult setPassengerClass(List<String> passengerClass) {
        this.passengerClass = passengerClass;
        return this;
    }

    public List<String> getPassengerClass() {
        return this.passengerClass;
    }

    public VatInvoiceWordsResult setPassengerVehicleType(List<String> passengerVehicleType) {
        this.passengerVehicleType = passengerVehicleType;
        return this;
    }

    public List<String> getPassengerVehicleType() {
        return this.passengerVehicleType;
    }

    public VatInvoiceWordsResult setTransportType(List<String> transportType) {
        this.transportType = transportType;
        return this;
    }

    public List<String> getTransportType() {
        return this.transportType;
    }

    public VatInvoiceWordsResult setTransportPlateNum(List<String> transportPlateNum) {
        this.transportPlateNum = transportPlateNum;
        return this;
    }

    public List<String> getTransportPlateNum() {
        return this.transportPlateNum;
    }

    public VatInvoiceWordsResult setTransportDeparture(List<String> transportDeparture) {
        this.transportDeparture = transportDeparture;
        return this;
    }

    public List<String> getTransportDeparture() {
        return this.transportDeparture;
    }

    public VatInvoiceWordsResult setTransportArrival(List<String> transportArrival) {
        this.transportArrival = transportArrival;
        return this;
    }

    public List<String> getTransportArrival() {
        return this.transportArrival;
    }

    public VatInvoiceWordsResult setTransportCargoInfo(List<String> transportCargoInfo) {
        this.transportCargoInfo = transportCargoInfo;
        return this;
    }

    public List<String> getTransportCargoInfo() {
        return this.transportCargoInfo;
    }

    @Override
    public String toString() {
        return "VatInvoiceWordsResult{" + "serviceType=" + serviceType + "\n" + "invoiceType=" + invoiceType + "\n" + "invoiceTypeOrg=" + invoiceTypeOrg + "\n" + "invoiceCode="
                + invoiceCode + "\n" + "invoiceNum=" + invoiceNum + "\n" + "invoiceCodeConfirm=" + invoiceCodeConfirm + "\n" + "invoiceNumConfirm=" + invoiceNumConfirm + "\n"
                + "invoiceNumDigit=" + invoiceNumDigit + "\n" + "invoiceTag=" + invoiceTag + "\n" + "machineNum=" + machineNum + "\n" + "machineCode=" + machineCode + "\n"
                + "checkCode=" + checkCode + "\n" + "invoiceDate=" + invoiceDate + "\n" + "purchaserName=" + purchaserName + "\n" + "purchaserRegisterNum=" + purchaserRegisterNum
                + "\n" + "purchaserAddress=" + purchaserAddress + "\n" + "purchaserBank=" + purchaserBank + "\n" + "password=" + password + "\n" + "province=" + province + "\n"
                + "city=" + city + "\n" + "sheetNum=" + sheetNum + "\n" + "agent=" + agent + "\n" + "commodityName=" + commodityName + "\n" + "commodityType=" + commodityType
                + "\n" + "commodityUnit=" + commodityUnit + "\n" + "commodityNum=" + commodityNum + "\n" + "commodityPrice=" + commodityPrice + "\n" + "commodityAmount="
                + commodityAmount + "\n" + "commodityTaxRate=" + commodityTaxRate + "\n" + "commodityTax=" + commodityTax + "\n" + "commodityPlateNum=" + commodityPlateNum + "\n"
                + "commodityVehicleType=" + commodityVehicleType + "\n" + "commodityStartDate=" + commodityStartDate + "\n" + "commodityEndDate=" + commodityEndDate + "\n"
                + "onlinePay=" + onlinePay + "\n" + "sellerName=" + sellerName + "\n" + "sellerRegisterNum=" + sellerRegisterNum + "\n" + "sellerAddress=" + sellerAddress + "\n"
                + "sellerBank=" + sellerBank + "\n" + "totalAmount=" + totalAmount + "\n" + "totalTax=" + totalTax + "\n" + "amountInWords=" + amountInWords + "\n"
                + "amountInFiguers=" + amountInFiguers + "\n" + "payee=" + payee + "\n" + "checker=" + checker + "\n" + "noteDrawer=" + noteDrawer + "\n" + "remarks=" + remarks
                + "\n" + "companySeal=" + companySeal + "\n" + "sealInfo=" + sealInfo + "\n" + "supervisionSeal=" + supervisionSeal + "\n" + "supervisionSealInfo="
                + supervisionSealInfo + "\n" + "passengerName=" + passengerName + "\n" + "passengerIdNum=" + passengerIdNum + "\n" + "passengerDate=" + passengerDate + "\n"
                + "passengerDeparture=" + passengerDeparture + "\n" + "passengerArrival=" + passengerArrival + "\n" + "passengerClass=" + passengerClass + "\n"
                + "passengerVehicleType=" + passengerVehicleType + "\n" + "transportType=" + transportType + "\n" + "transportPlateNum=" + transportPlateNum + "\n"
                + "transportDeparture=" + transportDeparture + "\n" + "transportArrival=" + transportArrival + "\n" + "transportCargoInfo=" + transportCargoInfo + "\n" + "}";
    }

}