package com.baidubce.ocr;

import com.baidubce.ocr.models.AccountOpeningRequest;
import com.baidubce.ocr.models.AccountOpeningResponse;
import com.baidubce.ocr.models.AccurateBasicRequest;
import com.baidubce.ocr.models.AccurateBasicResponse;
import com.baidubce.ocr.models.AccurateRequest;
import com.baidubce.ocr.models.AccurateResponse;
import com.baidubce.ocr.models.AirTicketRequest;
import com.baidubce.ocr.models.AirTicketResponse;
import com.baidubce.ocr.models.BankReceiptNewRequest;
import com.baidubce.ocr.models.BankReceiptNewResponse;
import com.baidubce.ocr.models.BankcardRequest;
import com.baidubce.ocr.models.BankcardResponse;
import com.baidubce.ocr.models.BirthCertificateRequest;
import com.baidubce.ocr.models.BirthCertificateResponse;
import com.baidubce.ocr.models.BusTicketRequest;
import com.baidubce.ocr.models.BusTicketResponse;
import com.baidubce.ocr.models.BusinessLicenseRequest;
import com.baidubce.ocr.models.BusinessLicenseResponse;
import com.baidubce.ocr.models.BusinesslicenseDetailedRequest;
import com.baidubce.ocr.models.BusinesslicenseDetailedResponse;
import com.baidubce.ocr.models.BusinesslicenseStandardRequest;
import com.baidubce.ocr.models.BusinesslicenseStandardResponse;
import com.baidubce.ocr.models.BusinesslicenseVerificationDetailedRequest;
import com.baidubce.ocr.models.BusinesslicenseVerificationDetailedResponse;
import com.baidubce.ocr.models.BusinesslicenseVerificationStandardRequest;
import com.baidubce.ocr.models.BusinesslicenseVerificationStandardResponse;
import com.baidubce.ocr.models.CorrectEduCreateTaskRequest;
import com.baidubce.ocr.models.CorrectEduCreateTaskResponse;
import com.baidubce.ocr.models.CorrectEduGetResultRequest;
import com.baidubce.ocr.models.CorrectEduGetResultResponse;
import com.baidubce.ocr.models.DivorceCertificateRequest;
import com.baidubce.ocr.models.DivorceCertificateResponse;
import com.baidubce.ocr.models.DocAnalysisOfficeRequest;
import com.baidubce.ocr.models.DocAnalysisOfficeResponse;
import com.baidubce.ocr.models.DocAnalysisRequest;
import com.baidubce.ocr.models.DocAnalysisResponse;
import com.baidubce.ocr.models.DocClassifyRequest;
import com.baidubce.ocr.models.DocClassifyResponse;
import com.baidubce.ocr.models.DocCropEnhanceRequest;
import com.baidubce.ocr.models.DocCropEnhanceResponse;
import com.baidubce.ocr.models.DrivingLicenseRequest;
import com.baidubce.ocr.models.DrivingLicenseResponse;
import com.baidubce.ocr.models.FacadeRequest;
import com.baidubce.ocr.models.FacadeResponse;
import com.baidubce.ocr.models.FerryTicketRequest;
import com.baidubce.ocr.models.FerryTicketResponse;
import com.baidubce.ocr.models.ForeignResidentIdCardRequest;
import com.baidubce.ocr.models.ForeignResidentIdCardResponse;
import com.baidubce.ocr.models.ForgeryDetectionRequest;
import com.baidubce.ocr.models.ForgeryDetectionResponse;
import com.baidubce.ocr.models.FourFactorsVerificationRequest;
import com.baidubce.ocr.models.FourFactorsVerificationResponse;
import com.baidubce.ocr.models.GeneralBasicRequest;
import com.baidubce.ocr.models.GeneralBasicResponse;
import com.baidubce.ocr.models.GeneralRequest;
import com.baidubce.ocr.models.GeneralResponse;
import com.baidubce.ocr.models.HandwritingCompositionCreateTaskRequest;
import com.baidubce.ocr.models.HandwritingCompositionCreateTaskResponse;
import com.baidubce.ocr.models.HandwritingCompositionGetResultRequest;
import com.baidubce.ocr.models.HandwritingCompositionGetResultResponse;
import com.baidubce.ocr.models.HandwritingRequest;
import com.baidubce.ocr.models.HandwritingResponse;
import com.baidubce.ocr.models.HealthReportRequest;
import com.baidubce.ocr.models.HealthReportResponse;
import com.baidubce.ocr.models.HkMacauTaiwanExitentrypermitRequest;
import com.baidubce.ocr.models.HkMacauTaiwanExitentrypermitResponse;
import com.baidubce.ocr.models.HkMacauTaiwanpermitRequest;
import com.baidubce.ocr.models.HkMacauTaiwanpermitResponse;
import com.baidubce.ocr.models.HouseholdRegisterRequest;
import com.baidubce.ocr.models.HouseholdRegisterResponse;
import com.baidubce.ocr.models.IdcardRequest;
import com.baidubce.ocr.models.IdcardResponse;
import com.baidubce.ocr.models.InvoiceRequest;
import com.baidubce.ocr.models.InvoiceResponse;
import com.baidubce.ocr.models.LicensePlateRequest;
import com.baidubce.ocr.models.LicensePlateResponse;
import com.baidubce.ocr.models.MarriageCertificateRequest;
import com.baidubce.ocr.models.MarriageCertificateResponse;
import com.baidubce.ocr.models.MedicalDetailRequest;
import com.baidubce.ocr.models.MedicalDetailResponse;
import com.baidubce.ocr.models.MedicalInvoiceRequest;
import com.baidubce.ocr.models.MedicalInvoiceResponse;
import com.baidubce.ocr.models.MedicalPrescriptionRequest;
import com.baidubce.ocr.models.MedicalPrescriptionResponse;
import com.baidubce.ocr.models.MedicalRecordRequest;
import com.baidubce.ocr.models.MedicalRecordResponse;
import com.baidubce.ocr.models.MedicalReportDetectionRequest;
import com.baidubce.ocr.models.MedicalReportDetectionResponse;
import com.baidubce.ocr.models.MedicalStatementRequest;
import com.baidubce.ocr.models.MedicalStatementResponse;
import com.baidubce.ocr.models.MedicalSummaryRequest;
import com.baidubce.ocr.models.MedicalSummaryResponse;
import com.baidubce.ocr.models.MeterRequest;
import com.baidubce.ocr.models.MeterResponse;
import com.baidubce.ocr.models.MixedMultiVehicleRequest;
import com.baidubce.ocr.models.MixedMultiVehicleResponse;
import com.baidubce.ocr.models.MultiIdcardRequest;
import com.baidubce.ocr.models.MultiIdcardResponse;
import com.baidubce.ocr.models.MultipleInvoiceRequest;
import com.baidubce.ocr.models.MultipleInvoiceResponse;
import com.baidubce.ocr.models.NumbersRequest;
import com.baidubce.ocr.models.NumbersResponse;
import com.baidubce.ocr.models.OnlineTaxiItineraryRequest;
import com.baidubce.ocr.models.OnlineTaxiItineraryResponse;
import com.baidubce.ocr.models.OverseasPassportRequest;
import com.baidubce.ocr.models.OverseasPassportResponse;
import com.baidubce.ocr.models.PaddleVlParserTaskQueryRequest;
import com.baidubce.ocr.models.PaddleVlParserTaskQueryResponse;
import com.baidubce.ocr.models.PaddleVlParserTaskRequest;
import com.baidubce.ocr.models.PaddleVlParserTaskResponse;
import com.baidubce.ocr.models.PaperCutEduRequest;
import com.baidubce.ocr.models.PaperCutEduResponse;
import com.baidubce.ocr.models.PaperCutEduVlmCreateTaskRequest;
import com.baidubce.ocr.models.PaperCutEduVlmCreateTaskResponse;
import com.baidubce.ocr.models.PaperCutEduVlmGetResultRequest;
import com.baidubce.ocr.models.PaperCutEduVlmGetResultResponse;
import com.baidubce.ocr.models.ParserTaskQueryRequest;
import com.baidubce.ocr.models.ParserTaskQueryResponse;
import com.baidubce.ocr.models.ParserTaskRequest;
import com.baidubce.ocr.models.ParserTaskResponse;
import com.baidubce.ocr.models.PassportRequest;
import com.baidubce.ocr.models.PassportResponse;
import com.baidubce.ocr.models.QrcodeRequest;
import com.baidubce.ocr.models.QrcodeResponse;
import com.baidubce.ocr.models.QuotaInvoiceRequest;
import com.baidubce.ocr.models.QuotaInvoiceResponse;
import com.baidubce.ocr.models.RealEstateCertificateRequest;
import com.baidubce.ocr.models.RealEstateCertificateResponse;
import com.baidubce.ocr.models.RemoveHandwritingRequest;
import com.baidubce.ocr.models.RemoveHandwritingResponse;
import com.baidubce.ocr.models.RoadTransportCertificateRequest;
import com.baidubce.ocr.models.RoadTransportCertificateResponse;
import com.baidubce.ocr.models.SealRequest;
import com.baidubce.ocr.models.SealResponse;
import com.baidubce.ocr.models.ShoppingReceiptRequest;
import com.baidubce.ocr.models.ShoppingReceiptResponse;
import com.baidubce.ocr.models.SmartStructRequest;
import com.baidubce.ocr.models.SmartStructResponse;
import com.baidubce.ocr.models.SocialSecurityCardRequest;
import com.baidubce.ocr.models.SocialSecurityCardResponse;
import com.baidubce.ocr.models.TableRequest;
import com.baidubce.ocr.models.TableResponse;
import com.baidubce.ocr.models.TaxiReceiptRequest;
import com.baidubce.ocr.models.TaxiReceiptResponse;
import com.baidubce.ocr.models.ThreeFactorsVerificationRequest;
import com.baidubce.ocr.models.ThreeFactorsVerificationResponse;
import com.baidubce.ocr.models.TollInvoiceRequest;
import com.baidubce.ocr.models.TollInvoiceResponse;
import com.baidubce.ocr.models.TrainTicketRequest;
import com.baidubce.ocr.models.TrainTicketResponse;
import com.baidubce.ocr.models.TwoFactorsVerificationRequest;
import com.baidubce.ocr.models.TwoFactorsVerificationResponse;
import com.baidubce.ocr.models.UsedVehicleInvoiceRequest;
import com.baidubce.ocr.models.UsedVehicleInvoiceResponse;
import com.baidubce.ocr.models.VatInvoiceRequest;
import com.baidubce.ocr.models.VatInvoiceResponse;
import com.baidubce.ocr.models.VehicleCertificateRequest;
import com.baidubce.ocr.models.VehicleCertificateResponse;
import com.baidubce.ocr.models.VehicleInvoiceRequest;
import com.baidubce.ocr.models.VehicleInvoiceResponse;
import com.baidubce.ocr.models.VehicleLicenseRequest;
import com.baidubce.ocr.models.VehicleLicenseResponse;
import com.baidubce.ocr.models.VehicleRegCertificateRequest;
import com.baidubce.ocr.models.VehicleRegCertificateResponse;
import com.baidubce.ocr.models.VehicleRegistrationCertificateRequest;
import com.baidubce.ocr.models.VehicleRegistrationCertificateResponse;
import com.baidubce.ocr.models.VinCodeRequest;
import com.baidubce.ocr.models.VinCodeResponse;
import com.baidubce.ocr.models.WaybillRequest;
import com.baidubce.ocr.models.WaybillResponse;
import com.baidubce.ocr.models.WebImageLocRequest;
import com.baidubce.ocr.models.WebImageLocResponse;
import com.baidubce.ocr.models.WebImageRequest;
import com.baidubce.ocr.models.WebImageResponse;
import com.baidubce.ocr.models.WeightNoteRequest;
import com.baidubce.ocr.models.WeightNoteResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.BceApiKeyCredentials;

/**
 * API tests for OcrClient
 */
public class OcrClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private static final String API_KEY = "";
    private static final String SECRET_KEY = "";
    private OcrClient ocrClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        // config.setCredentials(new DefaultBceCredentials(AK, SK));

        // ==== AccessToken 鉴权（API Key / Secret Key 换取 AccessToken）====
        // config.setCredentials(new BceAccessTokenCredentials(API_KEY, SECRET_KEY));

        // ==== API Key 鉴权 ====
        config.setCredentials(new BceApiKeyCredentials(API_KEY));

        ocrClient = new OcrClient(config);
    }

    /**
     * accountOpening
     *
     */
    @Test
    public void accountOpeningTest() {
        AccountOpeningRequest accountOpeningRequest = new AccountOpeningRequest();
        accountOpeningRequest.setImage("");
        accountOpeningRequest.setUrl("");
        accountOpeningRequest.setPdfFile("");
        accountOpeningRequest.setPdfFileNum(0);
        AccountOpeningResponse response = ocrClient.accountOpening(accountOpeningRequest);
        System.out.println(response);
    }
    /**
     * accurate
     *
     */
    @Test
    public void accurateTest() {
        AccurateRequest accurateRequest = new AccurateRequest();
        accurateRequest.setImage("");
        accurateRequest.setUrl("");
        accurateRequest.setPdfFile("");
        accurateRequest.setPdfFileNum(0);
        accurateRequest.setOfdFile("");
        accurateRequest.setOfdFileNum(0);
        accurateRequest.setLanguageType("");
        accurateRequest.setEngGranularity("");
        accurateRequest.setRecognizeGranularity("");
        accurateRequest.setDetectDirection(false);
        accurateRequest.setVertexesLocation(false);
        accurateRequest.setParagraph(false);
        accurateRequest.setProbability(false);
        accurateRequest.setCharProbability(false);
        accurateRequest.setMultidirectionalRecognize(false);
        AccurateResponse response = ocrClient.accurate(accurateRequest);
        System.out.println(response);
    }
    /**
     * accurateBasic
     *
     */
    @Test
    public void accurateBasicTest() {
        AccurateBasicRequest accurateBasicRequest = new AccurateBasicRequest();
        accurateBasicRequest.setImage("");
        accurateBasicRequest.setUrl("");
        accurateBasicRequest.setPdfFile("");
        accurateBasicRequest.setPdfFileNum(0);
        accurateBasicRequest.setOfdFile("");
        accurateBasicRequest.setOfdFileNum(0);
        accurateBasicRequest.setLanguageType("");
        accurateBasicRequest.setDetectDirection(false);
        accurateBasicRequest.setParagraph(false);
        accurateBasicRequest.setProbability(false);
        accurateBasicRequest.setMultidirectionalRecognize(false);
        AccurateBasicResponse response = ocrClient.accurateBasic(accurateBasicRequest);
        System.out.println(response);
    }
    /**
     * airTicket
     *
     */
    @Test
    public void airTicketTest() {
        AirTicketRequest airTicketRequest = new AirTicketRequest();
        airTicketRequest.setImage("");
        airTicketRequest.setUrl("");
        airTicketRequest.setPdfFile("");
        airTicketRequest.setPdfFileNum(0);
        airTicketRequest.setOfdFile("");
        airTicketRequest.setOfdFileNum(0);
        airTicketRequest.setMultiDetect(false);
        AirTicketResponse response = ocrClient.airTicket(airTicketRequest);
        System.out.println(response);
    }
    /**
     * bankReceiptNew
     *
     */
    @Test
    public void bankReceiptNewTest() {
        BankReceiptNewRequest bankReceiptNewRequest = new BankReceiptNewRequest();
        bankReceiptNewRequest.setImage("");
        bankReceiptNewRequest.setUrl("");
        bankReceiptNewRequest.setPdfFile("");
        bankReceiptNewRequest.setPdfFileNum(0);
        bankReceiptNewRequest.setOfdFile("");
        bankReceiptNewRequest.setOfdFileNum(0);
        bankReceiptNewRequest.setProbability(false);
        bankReceiptNewRequest.setLocation(false);
        BankReceiptNewResponse response = ocrClient.bankReceiptNew(bankReceiptNewRequest);
        System.out.println(response);
    }
    /**
     * bankcard
     *
     */
    @Test
    public void bankcardTest() {
        BankcardRequest bankcardRequest = new BankcardRequest();
        bankcardRequest.setImage("");
        bankcardRequest.setUrl("");
        bankcardRequest.setLocation(false);
        bankcardRequest.setDetectQuality(false);
        BankcardResponse response = ocrClient.bankcard(bankcardRequest);
        System.out.println(response);
    }
    /**
     * birthCertificate
     *
     */
    @Test
    public void birthCertificateTest() {
        BirthCertificateRequest birthCertificateRequest = new BirthCertificateRequest();
        birthCertificateRequest.setImage("");
        birthCertificateRequest.setUrl("");
        BirthCertificateResponse response = ocrClient.birthCertificate(birthCertificateRequest);
        System.out.println(response);
    }
    /**
     * busTicket
     *
     */
    @Test
    public void busTicketTest() {
        BusTicketRequest busTicketRequest = new BusTicketRequest();
        busTicketRequest.setImage("");
        busTicketRequest.setUrl("");
        busTicketRequest.setPdfFile("");
        busTicketRequest.setPdfFileNum(0);
        busTicketRequest.setOfdFile("");
        busTicketRequest.setOfdFileNum(0);
        BusTicketResponse response = ocrClient.busTicket(busTicketRequest);
        System.out.println(response);
    }
    /**
     * businessLicense
     *
     */
    @Test
    public void businessLicenseTest() {
        BusinessLicenseRequest businessLicenseRequest = new BusinessLicenseRequest();
        businessLicenseRequest.setImage("");
        businessLicenseRequest.setUrl("");
        businessLicenseRequest.setAccuracy("");
        businessLicenseRequest.setRiskWarn(false);
        businessLicenseRequest.setDetectQuality(false);
        businessLicenseRequest.setFullwidthShift(false);
        BusinessLicenseResponse response = ocrClient.businessLicense(businessLicenseRequest);
        System.out.println(response);
    }
    /**
     * businesslicenseDetailed
     *
     */
    @Test
    public void businesslicenseDetailedTest() {
        BusinesslicenseDetailedRequest businesslicenseDetailedRequest = new BusinesslicenseDetailedRequest();
        businesslicenseDetailedRequest.setVerifynum("");
        BusinesslicenseDetailedResponse response = ocrClient.businesslicenseDetailed(businesslicenseDetailedRequest);
        System.out.println(response);
    }
    /**
     * businesslicenseStandard
     *
     */
    @Test
    public void businesslicenseStandardTest() {
        BusinesslicenseStandardRequest businesslicenseStandardRequest = new BusinesslicenseStandardRequest();
        businesslicenseStandardRequest.setVerifynum("");
        BusinesslicenseStandardResponse response = ocrClient.businesslicenseStandard(businesslicenseStandardRequest);
        System.out.println(response);
    }
    /**
     * businesslicenseVerificationDetailed
     *
     */
    @Test
    public void businesslicenseVerificationDetailedTest() {
        BusinesslicenseVerificationDetailedRequest businesslicenseVerificationDetailedRequest = new BusinesslicenseVerificationDetailedRequest();
        businesslicenseVerificationDetailedRequest.setVerifynum("");
        BusinesslicenseVerificationDetailedResponse response = ocrClient.businesslicenseVerificationDetailed(businesslicenseVerificationDetailedRequest);
        System.out.println(response);
    }
    /**
     * businesslicenseVerificationStandard
     *
     */
    @Test
    public void businesslicenseVerificationStandardTest() {
        BusinesslicenseVerificationStandardRequest businesslicenseVerificationStandardRequest = new BusinesslicenseVerificationStandardRequest();
        businesslicenseVerificationStandardRequest.setVerifynum("");
        BusinesslicenseVerificationStandardResponse response = ocrClient.businesslicenseVerificationStandard(businesslicenseVerificationStandardRequest);
        System.out.println(response);
    }
    /**
     * correctEduCreateTask
     *
     */
    @Test
    public void correctEduCreateTaskTest() {
        CorrectEduCreateTaskRequest correctEduCreateTaskRequest = new CorrectEduCreateTaskRequest();
        correctEduCreateTaskRequest.setImage("");
        correctEduCreateTaskRequest.setUrl("");
        correctEduCreateTaskRequest.setOnlySplit(false);
        correctEduCreateTaskRequest.setDisablePreprocess(false);
        CorrectEduCreateTaskResponse response = ocrClient.correctEduCreateTask(correctEduCreateTaskRequest);
        System.out.println(response);
    }
    /**
     * correctEduGetResult
     *
     */
    @Test
    public void correctEduGetResultTest() {
        CorrectEduGetResultRequest correctEduGetResultRequest = new CorrectEduGetResultRequest();
        correctEduGetResultRequest.setTaskId("");
        CorrectEduGetResultResponse response = ocrClient.correctEduGetResult(correctEduGetResultRequest);
        System.out.println(response);
    }
    /**
     * divorceCertificate
     *
     */
    @Test
    public void divorceCertificateTest() {
        DivorceCertificateRequest divorceCertificateRequest = new DivorceCertificateRequest();
        divorceCertificateRequest.setImage("");
        divorceCertificateRequest.setUrl("");
        divorceCertificateRequest.setPdfFile("");
        divorceCertificateRequest.setPdfFileNum(0);
        DivorceCertificateResponse response = ocrClient.divorceCertificate(divorceCertificateRequest);
        System.out.println(response);
    }
    /**
     * docAnalysis
     *
     */
    @Test
    public void docAnalysisTest() {
        DocAnalysisRequest docAnalysisRequest = new DocAnalysisRequest();
        docAnalysisRequest.setImage("");
        docAnalysisRequest.setUrl("");
        docAnalysisRequest.setPdfFile("");
        docAnalysisRequest.setPdfFileNum(0);
        docAnalysisRequest.setLanguageType("");
        docAnalysisRequest.setResultType("");
        docAnalysisRequest.setDetectDirection(false);
        docAnalysisRequest.setLineProbability(false);
        docAnalysisRequest.setDispLinePoly(false);
        docAnalysisRequest.setWordsType("");
        docAnalysisRequest.setLayoutAnalysis(false);
        docAnalysisRequest.setRecgFormula(false);
        docAnalysisRequest.setRecgLongDivision(false);
        docAnalysisRequest.setDispUnderlineAnalysis(false);
        docAnalysisRequest.setRecgAlter(false);
        DocAnalysisResponse response = ocrClient.docAnalysis(docAnalysisRequest);
        System.out.println(response);
    }
    /**
     * docAnalysisOffice
     *
     */
    @Test
    public void docAnalysisOfficeTest() {
        DocAnalysisOfficeRequest docAnalysisOfficeRequest = new DocAnalysisOfficeRequest();
        docAnalysisOfficeRequest.setImage("");
        docAnalysisOfficeRequest.setUrl("");
        docAnalysisOfficeRequest.setPdfFile("");
        docAnalysisOfficeRequest.setPdfFileNum(0);
        docAnalysisOfficeRequest.setOfdFile("");
        docAnalysisOfficeRequest.setOfdFileNum(0);
        docAnalysisOfficeRequest.setLanguageType("");
        docAnalysisOfficeRequest.setResultType("");
        docAnalysisOfficeRequest.setCharProbability(false);
        docAnalysisOfficeRequest.setDetectDirection(false);
        docAnalysisOfficeRequest.setLineProbability(false);
        docAnalysisOfficeRequest.setDispLinePoly(false);
        docAnalysisOfficeRequest.setWordsType("");
        docAnalysisOfficeRequest.setLayoutAnalysis(false);
        docAnalysisOfficeRequest.setRecgTables(false);
        docAnalysisOfficeRequest.setRecogSeal(false);
        docAnalysisOfficeRequest.setRecgFormula(false);
        docAnalysisOfficeRequest.setEraseSeal(false);
        docAnalysisOfficeRequest.setDispUnderlineAnalysis(false);
        DocAnalysisOfficeResponse response = ocrClient.docAnalysisOffice(docAnalysisOfficeRequest);
        System.out.println(response);
    }
    /**
     * docClassify
     *
     */
    @Test
    public void docClassifyTest() {
        DocClassifyRequest docClassifyRequest = new DocClassifyRequest();
        docClassifyRequest.setImage("");
        docClassifyRequest.setUrl("");
        DocClassifyResponse response = ocrClient.docClassify(docClassifyRequest);
        System.out.println(response);
    }
    /**
     * docCropEnhance
     *
     */
    @Test
    public void docCropEnhanceTest() {
        DocCropEnhanceRequest docCropEnhanceRequest = new DocCropEnhanceRequest();
        docCropEnhanceRequest.setImage("");
        docCropEnhanceRequest.setUrl("");
        docCropEnhanceRequest.setPdfFile("");
        docCropEnhanceRequest.setPdfFileNum(0);
        docCropEnhanceRequest.setScanType(0);
        docCropEnhanceRequest.setPoints("");
        docCropEnhanceRequest.setEnhanceType(0);
        DocCropEnhanceResponse response = ocrClient.docCropEnhance(docCropEnhanceRequest);
        System.out.println(response);
    }
    /**
     * drivingLicense
     *
     */
    @Test
    public void drivingLicenseTest() {
        DrivingLicenseRequest drivingLicenseRequest = new DrivingLicenseRequest();
        drivingLicenseRequest.setImage("");
        drivingLicenseRequest.setUrl("");
        drivingLicenseRequest.setDetectDirection(false);
        drivingLicenseRequest.setDrivingLicenseSide("");
        drivingLicenseRequest.setUnifiedValidPeriod(false);
        drivingLicenseRequest.setQualityWarn(false);
        drivingLicenseRequest.setRiskWarn(false);
        DrivingLicenseResponse response = ocrClient.drivingLicense(drivingLicenseRequest);
        System.out.println(response);
    }
    /**
     * facade
     *
     */
    @Test
    public void facadeTest() {
        FacadeRequest facadeRequest = new FacadeRequest();
        facadeRequest.setImage("");
        FacadeResponse response = ocrClient.facade(facadeRequest);
        System.out.println(response);
    }
    /**
     * ferryTicket
     *
     */
    @Test
    public void ferryTicketTest() {
        FerryTicketRequest ferryTicketRequest = new FerryTicketRequest();
        ferryTicketRequest.setImage("");
        ferryTicketRequest.setUrl("");
        ferryTicketRequest.setPdfFile("");
        ferryTicketRequest.setPdfFileNum(0);
        ferryTicketRequest.setOfdFile("");
        ferryTicketRequest.setOfdFileNum(0);
        FerryTicketResponse response = ocrClient.ferryTicket(ferryTicketRequest);
        System.out.println(response);
    }
    /**
     * foreignResidentIdCard
     *
     */
    @Test
    public void foreignResidentIdCardTest() {
        ForeignResidentIdCardRequest foreignResidentIdCardRequest = new ForeignResidentIdCardRequest();
        foreignResidentIdCardRequest.setImage("");
        foreignResidentIdCardRequest.setUrl("");
        foreignResidentIdCardRequest.setPdfFile("");
        foreignResidentIdCardRequest.setPdfFileNum(0);
        ForeignResidentIdCardResponse response = ocrClient.foreignResidentIdCard(foreignResidentIdCardRequest);
        System.out.println(response);
    }
    /**
     * forgeryDetection
     *
     */
    @Test
    public void forgeryDetectionTest() {
        ForgeryDetectionRequest forgeryDetectionRequest = new ForgeryDetectionRequest();
        forgeryDetectionRequest.setImage("");
        forgeryDetectionRequest.setUrl("");
        forgeryDetectionRequest.setDetectProportion(false);
        forgeryDetectionRequest.setDetectThreshold(0.0);
        forgeryDetectionRequest.setReturnHeatmap(false);
        forgeryDetectionRequest.setRestrictProbability(0.0);
        ForgeryDetectionResponse response = ocrClient.forgeryDetection(forgeryDetectionRequest);
        System.out.println(response);
    }
    /**
     * fourFactorsVerification
     *
     */
    @Test
    public void fourFactorsVerificationTest() {
        FourFactorsVerificationRequest fourFactorsVerificationRequest = new FourFactorsVerificationRequest();
        fourFactorsVerificationRequest.setName("");
        fourFactorsVerificationRequest.setIdcard("");
        fourFactorsVerificationRequest.setCompany("");
        fourFactorsVerificationRequest.setRegnum("");
        FourFactorsVerificationResponse response = ocrClient.fourFactorsVerification(fourFactorsVerificationRequest);
        System.out.println(response);
    }
    /**
     * general
     *
     */
    @Test
    public void generalTest() {
        GeneralRequest generalRequest = new GeneralRequest();
        generalRequest.setImage("");
        generalRequest.setUrl("");
        generalRequest.setPdfFile("");
        generalRequest.setPdfFileNum(0);
        generalRequest.setOfdFile("");
        generalRequest.setOfdFileNum(0);
        generalRequest.setRecognizeGranularity("");
        generalRequest.setLanguageType("");
        generalRequest.setDetectDirection(false);
        generalRequest.setDetectLanguage(false);
        generalRequest.setParagraph(false);
        generalRequest.setVertexesLocation(false);
        generalRequest.setProbability(false);
        GeneralResponse response = ocrClient.general(generalRequest);
        System.out.println(response);
    }
    /**
     * generalBasic
     *
     */
    @Test
    public void generalBasicTest() {
        GeneralBasicRequest generalBasicRequest = new GeneralBasicRequest();
        generalBasicRequest.setImage("");
        generalBasicRequest.setUrl("");
        generalBasicRequest.setPdfFile("");
        generalBasicRequest.setPdfFileNum(0);
        generalBasicRequest.setOfdFile("");
        generalBasicRequest.setOfdFileNum(0);
        generalBasicRequest.setLanguageType("");
        generalBasicRequest.setDetectDirection(false);
        generalBasicRequest.setDetectLanguage(false);
        generalBasicRequest.setParagraph(false);
        generalBasicRequest.setProbability(false);
        GeneralBasicResponse response = ocrClient.generalBasic(generalBasicRequest);
        System.out.println(response);
    }
    /**
     * handwriting
     *
     */
    @Test
    public void handwritingTest() {
        HandwritingRequest handwritingRequest = new HandwritingRequest();
        handwritingRequest.setImage("");
        handwritingRequest.setUrl("");
        handwritingRequest.setPdfFile("");
        handwritingRequest.setPdfFileNum(0);
        handwritingRequest.setOfdFile("");
        handwritingRequest.setOfdFileNum(0);
        handwritingRequest.setRecognizeGranularity("");
        handwritingRequest.setEngGranularity("");
        handwritingRequest.setProbability(false);
        handwritingRequest.setDetectDirection(false);
        handwritingRequest.setDetectAlteration(false);
        handwritingRequest.setLanguageType("");
        HandwritingResponse response = ocrClient.handwriting(handwritingRequest);
        System.out.println(response);
    }
    /**
     * handwritingCompositionCreateTask
     *
     */
    @Test
    public void handwritingCompositionCreateTaskTest() {
        HandwritingCompositionCreateTaskRequest handwritingCompositionCreateTaskRequest = new HandwritingCompositionCreateTaskRequest();
        handwritingCompositionCreateTaskRequest.setImage("");
        handwritingCompositionCreateTaskRequest.setUrl("");
        handwritingCompositionCreateTaskRequest.setPdfFile("");
        handwritingCompositionCreateTaskRequest.setRecognizeGranularity("");
        handwritingCompositionCreateTaskRequest.setPdfFileNum(0);
        HandwritingCompositionCreateTaskResponse response = ocrClient.handwritingCompositionCreateTask(handwritingCompositionCreateTaskRequest);
        System.out.println(response);
    }
    /**
     * handwritingCompositionGetResult
     *
     */
    @Test
    public void handwritingCompositionGetResultTest() {
        HandwritingCompositionGetResultRequest handwritingCompositionGetResultRequest = new HandwritingCompositionGetResultRequest();
        handwritingCompositionGetResultRequest.setTaskId("");
        HandwritingCompositionGetResultResponse response = ocrClient.handwritingCompositionGetResult(handwritingCompositionGetResultRequest);
        System.out.println(response);
    }
    /**
     * healthReport
     *
     */
    @Test
    public void healthReportTest() {
        HealthReportRequest healthReportRequest = new HealthReportRequest();
        healthReportRequest.setImage("");
        healthReportRequest.setUrl("");
        healthReportRequest.setLocation(false);
        healthReportRequest.setProbability(false);
        HealthReportResponse response = ocrClient.healthReport(healthReportRequest);
        System.out.println(response);
    }
    /**
     * hkMacauTaiwanExitentrypermit
     *
     */
    @Test
    public void hkMacauTaiwanExitentrypermitTest() {
        HkMacauTaiwanExitentrypermitRequest hkMacauTaiwanExitentrypermitRequest = new HkMacauTaiwanExitentrypermitRequest();
        hkMacauTaiwanExitentrypermitRequest.setExitentrypermitType("");
        hkMacauTaiwanExitentrypermitRequest.setImage("");
        hkMacauTaiwanExitentrypermitRequest.setUrl("");
        hkMacauTaiwanExitentrypermitRequest.setPdfFile("");
        hkMacauTaiwanExitentrypermitRequest.setPdfFileNum(0);
        hkMacauTaiwanExitentrypermitRequest.setProbability(false);
        hkMacauTaiwanExitentrypermitRequest.setLocation(false);
        HkMacauTaiwanExitentrypermitResponse response = ocrClient.hkMacauTaiwanExitentrypermit(hkMacauTaiwanExitentrypermitRequest);
        System.out.println(response);
    }
    /**
     * hkMacauTaiwanpermit
     *
     */
    @Test
    public void hkMacauTaiwanpermitTest() {
        HkMacauTaiwanpermitRequest hkMacauTaiwanpermitRequest = new HkMacauTaiwanpermitRequest();
        hkMacauTaiwanpermitRequest.setExitentrypermitType("");
        hkMacauTaiwanpermitRequest.setImage("");
        hkMacauTaiwanpermitRequest.setUrl("");
        hkMacauTaiwanpermitRequest.setPdfFile("");
        hkMacauTaiwanpermitRequest.setPdfFileNum(0);
        hkMacauTaiwanpermitRequest.setProbability(false);
        hkMacauTaiwanpermitRequest.setLocation(false);
        HkMacauTaiwanpermitResponse response = ocrClient.hkMacauTaiwanpermit(hkMacauTaiwanpermitRequest);
        System.out.println(response);
    }
    /**
     * householdRegister
     *
     */
    @Test
    public void householdRegisterTest() {
        HouseholdRegisterRequest householdRegisterRequest = new HouseholdRegisterRequest();
        householdRegisterRequest.setImage("");
        householdRegisterRequest.setUrl("");
        householdRegisterRequest.setHouseholdRegisterSide("");
        HouseholdRegisterResponse response = ocrClient.householdRegister(householdRegisterRequest);
        System.out.println(response);
    }
    /**
     * idcard
     *
     */
    @Test
    public void idcardTest() {
        IdcardRequest idcardRequest = new IdcardRequest();
        idcardRequest.setIdCardSide("");
        idcardRequest.setImage("");
        idcardRequest.setUrl("");
        idcardRequest.setDetectPs(false);
        idcardRequest.setDetectRisk(false);
        idcardRequest.setDetectQuality(false);
        idcardRequest.setDetectPhoto(false);
        idcardRequest.setDetectCard(false);
        idcardRequest.setDetectDirection(false);
        idcardRequest.setDetectScreenshot(false);
        IdcardResponse response = ocrClient.idcard(idcardRequest);
        System.out.println(response);
    }
    /**
     * invoice
     *
     */
    @Test
    public void invoiceTest() {
        InvoiceRequest invoiceRequest = new InvoiceRequest();
        invoiceRequest.setImage("");
        invoiceRequest.setUrl("");
        invoiceRequest.setPdfFile("");
        invoiceRequest.setPdfFileNum(0);
        invoiceRequest.setOfdFile("");
        invoiceRequest.setOfdFileNum(0);
        InvoiceResponse response = ocrClient.invoice(invoiceRequest);
        System.out.println(response);
    }
    /**
     * licensePlate
     *
     */
    @Test
    public void licensePlateTest() {
        LicensePlateRequest licensePlateRequest = new LicensePlateRequest();
        licensePlateRequest.setImage("");
        licensePlateRequest.setUrl("");
        licensePlateRequest.setMultiDetect(false);
        licensePlateRequest.setMultiScale(false);
        licensePlateRequest.setDetectComplete(false);
        licensePlateRequest.setDetectRisk(false);
        LicensePlateResponse response = ocrClient.licensePlate(licensePlateRequest);
        System.out.println(response);
    }
    /**
     * marriageCertificate
     *
     */
    @Test
    public void marriageCertificateTest() {
        MarriageCertificateRequest marriageCertificateRequest = new MarriageCertificateRequest();
        marriageCertificateRequest.setImage("");
        marriageCertificateRequest.setUrl("");
        marriageCertificateRequest.setPdfFile("");
        marriageCertificateRequest.setPdfFileNum(0);
        marriageCertificateRequest.setProbability(false);
        marriageCertificateRequest.setLocation(false);
        MarriageCertificateResponse response = ocrClient.marriageCertificate(marriageCertificateRequest);
        System.out.println(response);
    }
    /**
     * medicalDetail
     *
     */
    @Test
    public void medicalDetailTest() {
        MedicalDetailRequest medicalDetailRequest = new MedicalDetailRequest();
        medicalDetailRequest.setImage("");
        medicalDetailRequest.setUrl("");
        medicalDetailRequest.setLocation(false);
        medicalDetailRequest.setProbability(false);
        MedicalDetailResponse response = ocrClient.medicalDetail(medicalDetailRequest);
        System.out.println(response);
    }
    /**
     * medicalInvoice
     *
     */
    @Test
    public void medicalInvoiceTest() {
        MedicalInvoiceRequest medicalInvoiceRequest = new MedicalInvoiceRequest();
        medicalInvoiceRequest.setImage("");
        medicalInvoiceRequest.setUrl("");
        medicalInvoiceRequest.setLocation(false);
        medicalInvoiceRequest.setProbability(false);
        medicalInvoiceRequest.setMediQuery("");
        MedicalInvoiceResponse response = ocrClient.medicalInvoice(medicalInvoiceRequest);
        System.out.println(response);
    }
    /**
     * medicalPrescription
     *
     */
    @Test
    public void medicalPrescriptionTest() {
        MedicalPrescriptionRequest medicalPrescriptionRequest = new MedicalPrescriptionRequest();
        medicalPrescriptionRequest.setImage("");
        medicalPrescriptionRequest.setUrl("");
        medicalPrescriptionRequest.setLocation(false);
        medicalPrescriptionRequest.setProbability(false);
        MedicalPrescriptionResponse response = ocrClient.medicalPrescription(medicalPrescriptionRequest);
        System.out.println(response);
    }
    /**
     * medicalRecord
     *
     */
    @Test
    public void medicalRecordTest() {
        MedicalRecordRequest medicalRecordRequest = new MedicalRecordRequest();
        medicalRecordRequest.setImage("");
        medicalRecordRequest.setUrl("");
        medicalRecordRequest.setLocation(false);
        medicalRecordRequest.setProbability(false);
        MedicalRecordResponse response = ocrClient.medicalRecord(medicalRecordRequest);
        System.out.println(response);
    }
    /**
     * medicalReportDetection
     *
     */
    @Test
    public void medicalReportDetectionTest() {
        MedicalReportDetectionRequest medicalReportDetectionRequest = new MedicalReportDetectionRequest();
        medicalReportDetectionRequest.setImage("");
        medicalReportDetectionRequest.setUrl("");
        medicalReportDetectionRequest.setLocation(false);
        medicalReportDetectionRequest.setProbability(false);
        MedicalReportDetectionResponse response = ocrClient.medicalReportDetection(medicalReportDetectionRequest);
        System.out.println(response);
    }
    /**
     * medicalStatement
     *
     */
    @Test
    public void medicalStatementTest() {
        MedicalStatementRequest medicalStatementRequest = new MedicalStatementRequest();
        medicalStatementRequest.setImage("");
        medicalStatementRequest.setUrl("");
        medicalStatementRequest.setLocation(false);
        medicalStatementRequest.setProbability(false);
        MedicalStatementResponse response = ocrClient.medicalStatement(medicalStatementRequest);
        System.out.println(response);
    }
    /**
     * medicalSummary
     *
     */
    @Test
    public void medicalSummaryTest() {
        MedicalSummaryRequest medicalSummaryRequest = new MedicalSummaryRequest();
        medicalSummaryRequest.setImage("");
        medicalSummaryRequest.setUrl("");
        medicalSummaryRequest.setLocation(false);
        medicalSummaryRequest.setProbability(false);
        MedicalSummaryResponse response = ocrClient.medicalSummary(medicalSummaryRequest);
        System.out.println(response);
    }
    /**
     * meter
     *
     */
    @Test
    public void meterTest() {
        MeterRequest meterRequest = new MeterRequest();
        meterRequest.setImage("");
        meterRequest.setUrl("");
        meterRequest.setProbability(false);
        meterRequest.setPolyLocation(false);
        MeterResponse response = ocrClient.meter(meterRequest);
        System.out.println(response);
    }
    /**
     * mixedMultiVehicle
     *
     */
    @Test
    public void mixedMultiVehicleTest() {
        MixedMultiVehicleRequest mixedMultiVehicleRequest = new MixedMultiVehicleRequest();
        mixedMultiVehicleRequest.setImage("");
        mixedMultiVehicleRequest.setUrl("");
        mixedMultiVehicleRequest.setDetectDirection(false);
        mixedMultiVehicleRequest.setUnified(false);
        MixedMultiVehicleResponse response = ocrClient.mixedMultiVehicle(mixedMultiVehicleRequest);
        System.out.println(response);
    }
    /**
     * multiIdcard
     *
     */
    @Test
    public void multiIdcardTest() {
        MultiIdcardRequest multiIdcardRequest = new MultiIdcardRequest();
        multiIdcardRequest.setImage("");
        multiIdcardRequest.setUrl("");
        multiIdcardRequest.setDetectRisk(false);
        multiIdcardRequest.setDetectQuality(false);
        multiIdcardRequest.setDetectPhoto(false);
        multiIdcardRequest.setDetectCard(false);
        multiIdcardRequest.setDetectScreenshot(false);
        MultiIdcardResponse response = ocrClient.multiIdcard(multiIdcardRequest);
        System.out.println(response);
    }
    /**
     * multipleInvoice
     *
     */
    @Test
    public void multipleInvoiceTest() {
        MultipleInvoiceRequest multipleInvoiceRequest = new MultipleInvoiceRequest();
        multipleInvoiceRequest.setImage("");
        multipleInvoiceRequest.setUrl("");
        multipleInvoiceRequest.setPdfFile("");
        multipleInvoiceRequest.setPdfFileNum(0);
        multipleInvoiceRequest.setOfdFile("");
        multipleInvoiceRequest.setOfdFileNum(0);
        multipleInvoiceRequest.setVerifyParameter(false);
        multipleInvoiceRequest.setProbability(false);
        multipleInvoiceRequest.setLocation(false);
        MultipleInvoiceResponse response = ocrClient.multipleInvoice(multipleInvoiceRequest);
        System.out.println(response);
    }
    /**
     * numbers
     *
     */
    @Test
    public void numbersTest() {
        NumbersRequest numbersRequest = new NumbersRequest();
        numbersRequest.setImage("");
        numbersRequest.setUrl("");
        numbersRequest.setPdfFile("");
        numbersRequest.setPdfFileNum(0);
        numbersRequest.setOfdFile("");
        numbersRequest.setOfdFileNum(0);
        numbersRequest.setRecognizeGranularity("");
        numbersRequest.setDetectDirection(false);
        NumbersResponse response = ocrClient.numbers(numbersRequest);
        System.out.println(response);
    }
    /**
     * onlineTaxiItinerary
     *
     */
    @Test
    public void onlineTaxiItineraryTest() {
        OnlineTaxiItineraryRequest onlineTaxiItineraryRequest = new OnlineTaxiItineraryRequest();
        onlineTaxiItineraryRequest.setImage("");
        onlineTaxiItineraryRequest.setUrl("");
        onlineTaxiItineraryRequest.setPdfFile("");
        onlineTaxiItineraryRequest.setPdfFileNum(0);
        onlineTaxiItineraryRequest.setOfdFile("");
        onlineTaxiItineraryRequest.setOfdFileNum(0);
        OnlineTaxiItineraryResponse response = ocrClient.onlineTaxiItinerary(onlineTaxiItineraryRequest);
        System.out.println(response);
    }
    /**
     * overseasPassport
     *
     */
    @Test
    public void overseasPassportTest() {
        OverseasPassportRequest overseasPassportRequest = new OverseasPassportRequest();
        overseasPassportRequest.setImage("");
        overseasPassportRequest.setUrl("");
        overseasPassportRequest.setPdfFile("");
        overseasPassportRequest.setPdfFileNum(0);
        OverseasPassportResponse response = ocrClient.overseasPassport(overseasPassportRequest);
        System.out.println(response);
    }
    /**
     * paddleVlParserTask
     *
     */
    @Test
    public void paddleVlParserTaskTest() {
        PaddleVlParserTaskRequest paddleVlParserTaskRequest = new PaddleVlParserTaskRequest();
        paddleVlParserTaskRequest.setFileName("");
        paddleVlParserTaskRequest.setFileData("");
        paddleVlParserTaskRequest.setFileUrl("");
        paddleVlParserTaskRequest.setAnalysisChart(false);
        paddleVlParserTaskRequest.setMergeTables(false);
        paddleVlParserTaskRequest.setRelevelTitles(false);
        paddleVlParserTaskRequest.setRecognizeSeal(false);
        paddleVlParserTaskRequest.setReturnSpanBoxes(false);
        PaddleVlParserTaskResponse response = ocrClient.paddleVlParserTask(paddleVlParserTaskRequest);
        System.out.println(response);
    }
    /**
     * paddleVlParserTaskQuery
     *
     */
    @Test
    public void paddleVlParserTaskQueryTest() {
        PaddleVlParserTaskQueryRequest paddleVlParserTaskQueryRequest = new PaddleVlParserTaskQueryRequest();
        paddleVlParserTaskQueryRequest.setTaskId("");
        PaddleVlParserTaskQueryResponse response = ocrClient.paddleVlParserTaskQuery(paddleVlParserTaskQueryRequest);
        System.out.println(response);
    }
    /**
     * paperCutEdu
     *
     */
    @Test
    public void paperCutEduTest() {
        PaperCutEduRequest paperCutEduRequest = new PaperCutEduRequest();
        paperCutEduRequest.setImage("");
        paperCutEduRequest.setUrl("");
        paperCutEduRequest.setPdfFile("");
        paperCutEduRequest.setPdfFileNum(0);
        paperCutEduRequest.setLanguageType("");
        paperCutEduRequest.setDetectDirection(false);
        paperCutEduRequest.setWordsType("");
        paperCutEduRequest.setSpliceText(false);
        paperCutEduRequest.setEnhance(false);
        paperCutEduRequest.setOnlySplit(false);
        PaperCutEduResponse response = ocrClient.paperCutEdu(paperCutEduRequest);
        System.out.println(response);
    }
    /**
     * paperCutEduVlmCreateTask
     *
     */
    @Test
    public void paperCutEduVlmCreateTaskTest() {
        PaperCutEduVlmCreateTaskRequest paperCutEduVlmCreateTaskRequest = new PaperCutEduVlmCreateTaskRequest();
        paperCutEduVlmCreateTaskRequest.setImage("");
        paperCutEduVlmCreateTaskRequest.setUrl("");
        paperCutEduVlmCreateTaskRequest.setPdfFile("");
        paperCutEduVlmCreateTaskRequest.setPdfFileNum(0);
        paperCutEduVlmCreateTaskRequest.setOnlySplit(false);
        paperCutEduVlmCreateTaskRequest.setSceneType("");
        paperCutEduVlmCreateTaskRequest.setEnhance(false);
        PaperCutEduVlmCreateTaskResponse response = ocrClient.paperCutEduVlmCreateTask(paperCutEduVlmCreateTaskRequest);
        System.out.println(response);
    }
    /**
     * paperCutEduVlmGetResult
     *
     */
    @Test
    public void paperCutEduVlmGetResultTest() {
        PaperCutEduVlmGetResultRequest paperCutEduVlmGetResultRequest = new PaperCutEduVlmGetResultRequest();
        paperCutEduVlmGetResultRequest.setTaskId("");
        PaperCutEduVlmGetResultResponse response = ocrClient.paperCutEduVlmGetResult(paperCutEduVlmGetResultRequest);
        System.out.println(response);
    }
    /**
     * parserTask
     *
     */
    @Test
    public void parserTaskTest() {
        ParserTaskRequest parserTaskRequest = new ParserTaskRequest();
        parserTaskRequest.setFileName("");
        parserTaskRequest.setFileData("");
        parserTaskRequest.setFileUrl("");
        parserTaskRequest.setRecognizeFormula(false);
        parserTaskRequest.setAnalysisChart(false);
        parserTaskRequest.setAngleAdjust(false);
        parserTaskRequest.setParseImageLayout(false);
        parserTaskRequest.setLanguageType("");
        parserTaskRequest.setSwitchDigitalWidth("");
        parserTaskRequest.setHtmlTableFormat(false);
        parserTaskRequest.setReturnDocChunks("");
        ParserTaskResponse response = ocrClient.parserTask(parserTaskRequest);
        System.out.println(response);
    }
    /**
     * parserTaskQuery
     *
     */
    @Test
    public void parserTaskQueryTest() {
        ParserTaskQueryRequest parserTaskQueryRequest = new ParserTaskQueryRequest();
        parserTaskQueryRequest.setTaskId("");
        ParserTaskQueryResponse response = ocrClient.parserTaskQuery(parserTaskQueryRequest);
        System.out.println(response);
    }
    /**
     * passport
     *
     */
    @Test
    public void passportTest() {
        PassportRequest passportRequest = new PassportRequest();
        passportRequest.setImage("");
        passportRequest.setUrl("");
        PassportResponse response = ocrClient.passport(passportRequest);
        System.out.println(response);
    }
    /**
     * qrcode
     *
     */
    @Test
    public void qrcodeTest() {
        QrcodeRequest qrcodeRequest = new QrcodeRequest();
        qrcodeRequest.setImage("");
        qrcodeRequest.setUrl("");
        qrcodeRequest.setPdfFile("");
        qrcodeRequest.setPdfFileNum(0);
        qrcodeRequest.setOfdFile("");
        qrcodeRequest.setOfdFileNum(0);
        qrcodeRequest.setLocation(false);
        QrcodeResponse response = ocrClient.qrcode(qrcodeRequest);
        System.out.println(response);
    }
    /**
     * quotaInvoice
     *
     */
    @Test
    public void quotaInvoiceTest() {
        QuotaInvoiceRequest quotaInvoiceRequest = new QuotaInvoiceRequest();
        quotaInvoiceRequest.setImage("");
        quotaInvoiceRequest.setUrl("");
        quotaInvoiceRequest.setPdfFile("");
        quotaInvoiceRequest.setPdfFileNum(0);
        quotaInvoiceRequest.setOfdFile("");
        quotaInvoiceRequest.setOfdFileNum(0);
        QuotaInvoiceResponse response = ocrClient.quotaInvoice(quotaInvoiceRequest);
        System.out.println(response);
    }
    /**
     * realEstateCertificate
     *
     */
    @Test
    public void realEstateCertificateTest() {
        RealEstateCertificateRequest realEstateCertificateRequest = new RealEstateCertificateRequest();
        realEstateCertificateRequest.setImage("");
        realEstateCertificateRequest.setUrl("");
        realEstateCertificateRequest.setPdfFile("");
        realEstateCertificateRequest.setPdfFileNum(0);
        realEstateCertificateRequest.setProbability(false);
        realEstateCertificateRequest.setLocation(false);
        RealEstateCertificateResponse response = ocrClient.realEstateCertificate(realEstateCertificateRequest);
        System.out.println(response);
    }
    /**
     * removeHandwriting
     *
     */
    @Test
    public void removeHandwritingTest() {
        RemoveHandwritingRequest removeHandwritingRequest = new RemoveHandwritingRequest();
        removeHandwritingRequest.setImage("");
        removeHandwritingRequest.setUrl("");
        removeHandwritingRequest.setPdfFile("");
        removeHandwritingRequest.setPdfFileNum(0);
        removeHandwritingRequest.setEnableDetect(false);
        RemoveHandwritingResponse response = ocrClient.removeHandwriting(removeHandwritingRequest);
        System.out.println(response);
    }
    /**
     * roadTransportCertificate
     *
     */
    @Test
    public void roadTransportCertificateTest() {
        RoadTransportCertificateRequest roadTransportCertificateRequest = new RoadTransportCertificateRequest();
        roadTransportCertificateRequest.setImage("");
        roadTransportCertificateRequest.setUrl("");
        roadTransportCertificateRequest.setPdfFile("");
        roadTransportCertificateRequest.setPdfFileNum(0);
        RoadTransportCertificateResponse response = ocrClient.roadTransportCertificate(roadTransportCertificateRequest);
        System.out.println(response);
    }
    /**
     * seal
     *
     */
    @Test
    public void sealTest() {
        SealRequest sealRequest = new SealRequest();
        sealRequest.setImage("");
        sealRequest.setUrl("");
        sealRequest.setPdfFile("");
        sealRequest.setPdfFileNum(0);
        sealRequest.setOfdFile("");
        sealRequest.setOfdFileNum(0);
        sealRequest.setReturnImage(false);
        sealRequest.setFlattenImage(false);
        SealResponse response = ocrClient.seal(sealRequest);
        System.out.println(response);
    }
    /**
     * shoppingReceipt
     *
     */
    @Test
    public void shoppingReceiptTest() {
        ShoppingReceiptRequest shoppingReceiptRequest = new ShoppingReceiptRequest();
        shoppingReceiptRequest.setImage("");
        shoppingReceiptRequest.setUrl("");
        shoppingReceiptRequest.setPdfFile("");
        shoppingReceiptRequest.setPdfFileNum(0);
        shoppingReceiptRequest.setOfdFile("");
        shoppingReceiptRequest.setOfdFileNum(0);
        shoppingReceiptRequest.setProbability(false);
        shoppingReceiptRequest.setLocation(false);
        ShoppingReceiptResponse response = ocrClient.shoppingReceipt(shoppingReceiptRequest);
        System.out.println(response);
    }
    /**
     * smartStruct
     *
     */
    @Test
    public void smartStructTest() {
        SmartStructRequest smartStructRequest = new SmartStructRequest();
        smartStructRequest.setImage("");
        smartStructRequest.setUrl("");
        smartStructRequest.setPdfFile("");
        smartStructRequest.setPdfFileNum(0);
        smartStructRequest.setReturnRelation(false);
        SmartStructResponse response = ocrClient.smartStruct(smartStructRequest);
        System.out.println(response);
    }
    /**
     * socialSecurityCard
     *
     */
    @Test
    public void socialSecurityCardTest() {
        SocialSecurityCardRequest socialSecurityCardRequest = new SocialSecurityCardRequest();
        socialSecurityCardRequest.setImage("");
        socialSecurityCardRequest.setUrl("");
        SocialSecurityCardResponse response = ocrClient.socialSecurityCard(socialSecurityCardRequest);
        System.out.println(response);
    }
    /**
     * table
     *
     */
    @Test
    public void tableTest() {
        TableRequest tableRequest = new TableRequest();
        tableRequest.setImage("");
        tableRequest.setUrl("");
        tableRequest.setPdfFile("");
        tableRequest.setPdfFileNum(0);
        tableRequest.setOfdFile("");
        tableRequest.setOfdFileNum(0);
        tableRequest.setReturnExcel(false);
        tableRequest.setCellContents(false);
        TableResponse response = ocrClient.table(tableRequest);
        System.out.println(response);
    }
    /**
     * taxiReceipt
     *
     */
    @Test
    public void taxiReceiptTest() {
        TaxiReceiptRequest taxiReceiptRequest = new TaxiReceiptRequest();
        taxiReceiptRequest.setImage("");
        taxiReceiptRequest.setUrl("");
        taxiReceiptRequest.setPdfFile("");
        taxiReceiptRequest.setPdfFileNum(0);
        taxiReceiptRequest.setOfdFile("");
        taxiReceiptRequest.setOfdFileNum(0);
        TaxiReceiptResponse response = ocrClient.taxiReceipt(taxiReceiptRequest);
        System.out.println(response);
    }
    /**
     * threeFactorsVerification
     *
     */
    @Test
    public void threeFactorsVerificationTest() {
        ThreeFactorsVerificationRequest threeFactorsVerificationRequest = new ThreeFactorsVerificationRequest();
        threeFactorsVerificationRequest.setName("");
        threeFactorsVerificationRequest.setCompany("");
        threeFactorsVerificationRequest.setRegnum("");
        ThreeFactorsVerificationResponse response = ocrClient.threeFactorsVerification(threeFactorsVerificationRequest);
        System.out.println(response);
    }
    /**
     * tollInvoice
     *
     */
    @Test
    public void tollInvoiceTest() {
        TollInvoiceRequest tollInvoiceRequest = new TollInvoiceRequest();
        tollInvoiceRequest.setImage("");
        tollInvoiceRequest.setUrl("");
        tollInvoiceRequest.setPdfFile("");
        tollInvoiceRequest.setPdfFileNum(0);
        tollInvoiceRequest.setOfdFile("");
        tollInvoiceRequest.setOfdFileNum(0);
        TollInvoiceResponse response = ocrClient.tollInvoice(tollInvoiceRequest);
        System.out.println(response);
    }
    /**
     * trainTicket
     *
     */
    @Test
    public void trainTicketTest() {
        TrainTicketRequest trainTicketRequest = new TrainTicketRequest();
        trainTicketRequest.setImage("");
        trainTicketRequest.setUrl("");
        trainTicketRequest.setPdfFile("");
        trainTicketRequest.setPdfFileNum(0);
        trainTicketRequest.setOfdFile("");
        trainTicketRequest.setOfdFileNum(0);
        TrainTicketResponse response = ocrClient.trainTicket(trainTicketRequest);
        System.out.println(response);
    }
    /**
     * twoFactorsVerification
     *
     */
    @Test
    public void twoFactorsVerificationTest() {
        TwoFactorsVerificationRequest twoFactorsVerificationRequest = new TwoFactorsVerificationRequest();
        twoFactorsVerificationRequest.setCompany("");
        twoFactorsVerificationRequest.setRegnum("");
        TwoFactorsVerificationResponse response = ocrClient.twoFactorsVerification(twoFactorsVerificationRequest);
        System.out.println(response);
    }
    /**
     * usedVehicleInvoice
     *
     */
    @Test
    public void usedVehicleInvoiceTest() {
        UsedVehicleInvoiceRequest usedVehicleInvoiceRequest = new UsedVehicleInvoiceRequest();
        usedVehicleInvoiceRequest.setImage("");
        usedVehicleInvoiceRequest.setUrl("");
        usedVehicleInvoiceRequest.setPdfFile("");
        usedVehicleInvoiceRequest.setPdfFileNum(0);
        UsedVehicleInvoiceResponse response = ocrClient.usedVehicleInvoice(usedVehicleInvoiceRequest);
        System.out.println(response);
    }
    /**
     * vatInvoice
     *
     */
    @Test
    public void vatInvoiceTest() {
        VatInvoiceRequest vatInvoiceRequest = new VatInvoiceRequest();
        vatInvoiceRequest.setImage("");
        vatInvoiceRequest.setUrl("");
        vatInvoiceRequest.setPdfFile("");
        vatInvoiceRequest.setPdfFileNum(0);
        vatInvoiceRequest.setOfdFile("");
        vatInvoiceRequest.setOfdFileNum(0);
        vatInvoiceRequest.setType("");
        vatInvoiceRequest.setSealTag(false);
        VatInvoiceResponse response = ocrClient.vatInvoice(vatInvoiceRequest);
        System.out.println(response);
    }
    /**
     * vehicleCertificate
     *
     */
    @Test
    public void vehicleCertificateTest() {
        VehicleCertificateRequest vehicleCertificateRequest = new VehicleCertificateRequest();
        vehicleCertificateRequest.setImage("");
        vehicleCertificateRequest.setUrl("");
        VehicleCertificateResponse response = ocrClient.vehicleCertificate(vehicleCertificateRequest);
        System.out.println(response);
    }
    /**
     * vehicleInvoice
     *
     */
    @Test
    public void vehicleInvoiceTest() {
        VehicleInvoiceRequest vehicleInvoiceRequest = new VehicleInvoiceRequest();
        vehicleInvoiceRequest.setImage("");
        vehicleInvoiceRequest.setUrl("");
        vehicleInvoiceRequest.setPdfFile("");
        vehicleInvoiceRequest.setPdfFileNum(0);
        VehicleInvoiceResponse response = ocrClient.vehicleInvoice(vehicleInvoiceRequest);
        System.out.println(response);
    }
    /**
     * vehicleLicense
     *
     */
    @Test
    public void vehicleLicenseTest() {
        VehicleLicenseRequest vehicleLicenseRequest = new VehicleLicenseRequest();
        vehicleLicenseRequest.setImage("");
        vehicleLicenseRequest.setUrl("");
        vehicleLicenseRequest.setDetectDirection(false);
        vehicleLicenseRequest.setVehicleLicenseSide("");
        vehicleLicenseRequest.setUnified(false);
        vehicleLicenseRequest.setQualityWarn(false);
        vehicleLicenseRequest.setRiskWarn(false);
        VehicleLicenseResponse response = ocrClient.vehicleLicense(vehicleLicenseRequest);
        System.out.println(response);
    }
    /**
     * vehicleRegCertificate
     *
     */
    @Test
    public void vehicleRegCertificateTest() {
        VehicleRegCertificateRequest vehicleRegCertificateRequest = new VehicleRegCertificateRequest();
        vehicleRegCertificateRequest.setImage("");
        vehicleRegCertificateRequest.setUrl("");
        VehicleRegCertificateResponse response = ocrClient.vehicleRegCertificate(vehicleRegCertificateRequest);
        System.out.println(response);
    }
    /**
     * vehicleRegistrationCertificate
     *
     */
    @Test
    public void vehicleRegistrationCertificateTest() {
        VehicleRegistrationCertificateRequest vehicleRegistrationCertificateRequest = new VehicleRegistrationCertificateRequest();
        vehicleRegistrationCertificateRequest.setImage("");
        vehicleRegistrationCertificateRequest.setUrl("");
        VehicleRegistrationCertificateResponse response = ocrClient.vehicleRegistrationCertificate(vehicleRegistrationCertificateRequest);
        System.out.println(response);
    }
    /**
     * vinCode
     *
     */
    @Test
    public void vinCodeTest() {
        VinCodeRequest vinCodeRequest = new VinCodeRequest();
        vinCodeRequest.setImage("");
        vinCodeRequest.setUrl("");
        VinCodeResponse response = ocrClient.vinCode(vinCodeRequest);
        System.out.println(response);
    }
    /**
     * waybill
     *
     */
    @Test
    public void waybillTest() {
        WaybillRequest waybillRequest = new WaybillRequest();
        waybillRequest.setImage("");
        waybillRequest.setUrl("");
        waybillRequest.setIsIdentifyVirtualWaybill(false);
        WaybillResponse response = ocrClient.waybill(waybillRequest);
        System.out.println(response);
    }
    /**
     * webImage
     *
     */
    @Test
    public void webImageTest() {
        WebImageRequest webImageRequest = new WebImageRequest();
        webImageRequest.setImage("");
        webImageRequest.setUrl("");
        webImageRequest.setPdfFile("");
        webImageRequest.setPdfFileNum(0);
        webImageRequest.setOfdFile("");
        webImageRequest.setOfdFileNum(0);
        webImageRequest.setDetectDirection(false);
        webImageRequest.setDetectLanguage(false);
        WebImageResponse response = ocrClient.webImage(webImageRequest);
        System.out.println(response);
    }
    /**
     * webImageLoc
     *
     */
    @Test
    public void webImageLocTest() {
        WebImageLocRequest webImageLocRequest = new WebImageLocRequest();
        webImageLocRequest.setImage("");
        webImageLocRequest.setUrl("");
        webImageLocRequest.setPdfFile("");
        webImageLocRequest.setPdfFileNum(0);
        webImageLocRequest.setOfdFile("");
        webImageLocRequest.setOfdFileNum(0);
        webImageLocRequest.setDetectDirection(false);
        webImageLocRequest.setProbability(false);
        webImageLocRequest.setPolyLocation(false);
        webImageLocRequest.setRecognizeGranularity("");
        WebImageLocResponse response = ocrClient.webImageLoc(webImageLocRequest);
        System.out.println(response);
    }
    /**
     * weightNote
     *
     */
    @Test
    public void weightNoteTest() {
        WeightNoteRequest weightNoteRequest = new WeightNoteRequest();
        weightNoteRequest.setImage("");
        weightNoteRequest.setUrl("");
        weightNoteRequest.setPdfFile("");
        weightNoteRequest.setPdfFileNum(0);
        weightNoteRequest.setProbability(false);
        WeightNoteResponse response = ocrClient.weightNote(weightNoteRequest);
        System.out.println(response);
    }
}
