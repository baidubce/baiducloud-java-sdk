package com.baidubce.ocr;

import com.baidubce.AbstractBceClient;
import com.baidubce.http.handler.HttpResponseHandler;
import com.baidubce.http.handler.BceErrorResponseHandler;
import com.baidubce.http.handler.BceJsonResponseHandler;
import com.baidubce.http.handler.BceMetadataResponseHandler;
import com.baidubce.BceClientConfiguration;
import com.baidubce.internal.InternalRequest;
import com.baidubce.http.HttpMethodName;
import com.baidubce.model.AbstractBceRequest;
import com.baidubce.auth.SignOptions;
import com.baidubce.util.RequestBodyUtils;
import java.util.Arrays;
import java.util.HashSet;

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

public class OcrClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_REST = "rest";
    private static final String CONSTANT_2_0 = "2.0";
    private static final String CONSTANT_OCR = "ocr";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_BUSINESS_LICENSE = "business_license";
    private static final String CONSTANT_BRAIN = "brain";
    private static final String CONSTANT_ONLINE = "online";
    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_PADDLE_VL_PARSER = "paddle-vl-parser";
    private static final String CONSTANT_TASK = "task";
    private static final String CONSTANT_QUERY = "query";
    private static final String CONSTANT_ACCURATE = "accurate";
    private static final String CONSTANT_NUMBERS = "numbers";
    private static final String CONSTANT_FACADE = "facade";
    private static final String CONSTANT_FORGERY_DETECTION = "forgery_detection";
    private static final String CONSTANT_CORRECT_EDU = "correct_edu";
    private static final String CONSTANT_CREATE_TASK = "create_task";
    private static final String CONSTANT_ONLINE_TAXI_ITINERARY = "online_taxi_itinerary";
    private static final String CONSTANT_VEHICLE_REGISTRATION_CERTIFICATE = "vehicle_registration_certificate";
    private static final String CONSTANT_LICENSE_PLATE = "license_plate";
    private static final String CONSTANT_THREE_FACTORS_VERIFICATION = "three_factors_verification";
    private static final String CONSTANT_WAYBILL = "waybill";
    private static final String CONSTANT_PASSPORT = "passport";
    private static final String CONSTANT_WEBIMAGE = "webimage";
    private static final String CONSTANT_GET_RESULT = "get_result";
    private static final String CONSTANT_TOLL_INVOICE = "toll_invoice";
    private static final String CONSTANT_DOC_CLASSIFY = "doc_classify";
    private static final String CONSTANT_VAT_INVOICE = "vat_invoice";
    private static final String CONSTANT_DOC_ANALYSIS_OFFICE = "doc_analysis_office";
    private static final String CONSTANT_TAXI_RECEIPT = "taxi_receipt";
    private static final String CONSTANT_VEHICLE_CERTIFICATE = "vehicle_certificate";
    private static final String CONSTANT_METER = "meter";
    private static final String CONSTANT_HANDWRITING_COMPOSITION = "handwriting_composition";
    private static final String CONSTANT_HANDWRITING = "handwriting";
    private static final String CONSTANT_DOC_CROP_ENHANCE = "doc_crop_enhance";
    private static final String CONSTANT_MEDICAL_RECORD = "medical_record";
    private static final String CONSTANT_BUSINESSLICENSE_VERIFICATION_DETAILED = "businesslicense_verification_detailed";
    private static final String CONSTANT_WEIGHT_NOTE = "weight_note";
    private static final String CONSTANT_SOCIAL_SECURITY_CARD = "social_security_card";
    private static final String CONSTANT_SHOPPING_RECEIPT = "shopping_receipt";
    private static final String CONSTANT_MEDICAL_REPORT_DETECTION = "medical_report_detection";
    private static final String CONSTANT_FERRY_TICKET = "ferry_ticket";
    private static final String CONSTANT_BUSINESSLICENSE_VERIFICATION_STANDARD = "businesslicense_verification_standard";
    private static final String CONSTANT_BIRTH_CERTIFICATE = "birth_certificate";
    private static final String CONSTANT_REAL_ESTATE_CERTIFICATE = "real_estate_certificate";
    private static final String CONSTANT_REMOVE_HANDWRITING = "remove_handwriting";
    private static final String CONSTANT_ACCURATE_BASIC = "accurate_basic";
    private static final String CONSTANT_HOUSEHOLD_REGISTER = "household_register";
    private static final String CONSTANT_OVERSEAS_PASSPORT = "overseas_passport";
    private static final String CONSTANT_SMART_STRUCT = "smart_struct";
    private static final String CONSTANT_QUOTA_INVOICE = "quota_invoice";
    private static final String CONSTANT_MULTIPLE_INVOICE = "multiple_invoice";
    private static final String CONSTANT_WEBIMAGE_LOC = "webimage_loc";
    private static final String CONSTANT_ROAD_TRANSPORT_CERTIFICATE = "road_transport_certificate";
    private static final String CONSTANT_MULTI_IDCARD = "multi_idcard";
    private static final String CONSTANT_QRCODE = "qrcode";
    private static final String CONSTANT_GENERAL_BASIC = "general_basic";
    private static final String CONSTANT_SEAL = "seal";
    private static final String CONSTANT_TWO_FACTORS_VERIFICATION = "two_factors_verification";
    private static final String CONSTANT_FOUR_FACTORS_VERIFICATION = "four_factors_verification";
    private static final String CONSTANT_MEDICAL_DETAIL = "medical_detail";
    private static final String CONSTANT_PARSER = "parser";
    private static final String CONSTANT_PAPER_CUT_EDU_VLM = "paper_cut_edu_vlm";
    private static final String CONSTANT_GENERAL = "general";
    private static final String CONSTANT_BANK_RECEIPT_NEW = "bank_receipt_new";
    private static final String CONSTANT_VIN_CODE = "vin_code";
    private static final String CONSTANT_MEDICAL_STATEMENT = "medical_statement";
    private static final String CONSTANT_FOREIGN_RESIDENT_ID_CARD = "foreign_resident_id_card";
    private static final String CONSTANT_MIXED_MULTI_VEHICLE = "mixed_multi_vehicle";
    private static final String CONSTANT_HK_MACAU_TAIWAN_EXITENTRYPERMIT = "hk_macau_taiwan_exitentrypermit";
    private static final String CONSTANT_DOC_ANALYSIS = "doc_analysis";
    private static final String CONSTANT_TABLE = "table";
    private static final String CONSTANT_VEHICLE_LICENSE = "vehicle_license";
    private static final String CONSTANT_MEDICAL_PRESCRIPTION = "medical_prescription";
    private static final String CONSTANT_MARRIAGE_CERTIFICATE = "marriage_certificate";
    private static final String CONSTANT_MEDICAL_INVOICE = "medical_invoice";
    private static final String CONSTANT_USED_VEHICLE_INVOICE = "used_vehicle_invoice";
    private static final String CONSTANT_HEALTH_REPORT = "health_report";
    private static final String CONSTANT_PAPER_CUT_EDU = "paper_cut_edu";
    private static final String CONSTANT_ACCOUNT_OPENING = "account_opening";
    private static final String CONSTANT_AIR_TICKET = "air_ticket";
    private static final String CONSTANT_TRAIN_TICKET = "train_ticket";
    private static final String CONSTANT_MEDICAL_SUMMARY = "medical_summary";
    private static final String CONSTANT_VEHICLE_INVOICE = "vehicle_invoice";
    private static final String CONSTANT_DRIVING_LICENSE = "driving_license";
    private static final String CONSTANT_DIVORCE_CERTIFICATE = "divorce_certificate";
    private static final String CONSTANT_IDCARD = "idcard";
    private static final String CONSTANT_BUS_TICKET = "bus_ticket";
    private static final String CONSTANT_INVOICE = "invoice";
    private static final String CONSTANT_BANKCARD = "bankcard";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public OcrClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public OcrClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * accountOpening
     * 
     * @param request 入参结构体
     * @return AccountOpeningResponse
     */
    public AccountOpeningResponse accountOpening(AccountOpeningRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_ACCOUNT_OPENING);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, AccountOpeningResponse.class);
    }

    /**
     * accurate
     * 
     * @param request 入参结构体
     * @return AccurateResponse
     */
    public AccurateResponse accurate(AccurateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_ACCURATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, AccurateResponse.class);
    }

    /**
     * accurateBasic
     * 
     * @param request 入参结构体
     * @return AccurateBasicResponse
     */
    public AccurateBasicResponse accurateBasic(AccurateBasicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_ACCURATE_BASIC);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, AccurateBasicResponse.class);
    }

    /**
     * airTicket
     * 
     * @param request 入参结构体
     * @return AirTicketResponse
     */
    public AirTicketResponse airTicket(AirTicketRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_AIR_TICKET);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, AirTicketResponse.class);
    }

    /**
     * bankReceiptNew
     * 
     * @param request 入参结构体
     * @return BankReceiptNewResponse
     */
    public BankReceiptNewResponse bankReceiptNew(BankReceiptNewRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BANK_RECEIPT_NEW);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BankReceiptNewResponse.class);
    }

    /**
     * bankcard
     * 
     * @param request 入参结构体
     * @return BankcardResponse
     */
    public BankcardResponse bankcard(BankcardRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BANKCARD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BankcardResponse.class);
    }

    /**
     * birthCertificate
     * 
     * @param request 入参结构体
     * @return BirthCertificateResponse
     */
    public BirthCertificateResponse birthCertificate(BirthCertificateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BIRTH_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BirthCertificateResponse.class);
    }

    /**
     * busTicket
     * 
     * @param request 入参结构体
     * @return BusTicketResponse
     */
    public BusTicketResponse busTicket(BusTicketRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BUS_TICKET);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BusTicketResponse.class);
    }

    /**
     * businessLicense
     * 
     * @param request 入参结构体
     * @return BusinessLicenseResponse
     */
    public BusinessLicenseResponse businessLicense(BusinessLicenseRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BUSINESS_LICENSE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BusinessLicenseResponse.class);
    }

    /**
     * businesslicenseDetailed
     * 
     * @param request 入参结构体
     * @return BusinesslicenseDetailedResponse
     */
    public BusinesslicenseDetailedResponse businesslicenseDetailed(BusinesslicenseDetailedRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BUSINESSLICENSE_VERIFICATION_DETAILED);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BusinesslicenseDetailedResponse.class);
    }

    /**
     * businesslicenseStandard
     * 
     * @param request 入参结构体
     * @return BusinesslicenseStandardResponse
     */
    public BusinesslicenseStandardResponse businesslicenseStandard(BusinesslicenseStandardRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BUSINESSLICENSE_VERIFICATION_STANDARD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BusinesslicenseStandardResponse.class);
    }

    /**
     * businesslicenseVerificationDetailed
     * 
     * @param request 入参结构体
     * @return BusinesslicenseVerificationDetailedResponse
     */
    public BusinesslicenseVerificationDetailedResponse businesslicenseVerificationDetailed(BusinesslicenseVerificationDetailedRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BUSINESSLICENSE_VERIFICATION_DETAILED);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BusinesslicenseVerificationDetailedResponse.class);
    }

    /**
     * businesslicenseVerificationStandard
     * 
     * @param request 入参结构体
     * @return BusinesslicenseVerificationStandardResponse
     */
    public BusinesslicenseVerificationStandardResponse businesslicenseVerificationStandard(BusinesslicenseVerificationStandardRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_BUSINESSLICENSE_VERIFICATION_STANDARD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, BusinesslicenseVerificationStandardResponse.class);
    }

    /**
     * correctEduCreateTask
     * 
     * @param request 入参结构体
     * @return CorrectEduCreateTaskResponse
     */
    public CorrectEduCreateTaskResponse correctEduCreateTask(CorrectEduCreateTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_CORRECT_EDU, CONSTANT_CREATE_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CorrectEduCreateTaskResponse.class);
    }

    /**
     * correctEduGetResult
     * 
     * @param request 入参结构体
     * @return CorrectEduGetResultResponse
     */
    public CorrectEduGetResultResponse correctEduGetResult(CorrectEduGetResultRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_CORRECT_EDU, CONSTANT_GET_RESULT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CorrectEduGetResultResponse.class);
    }

    /**
     * divorceCertificate
     * 
     * @param request 入参结构体
     * @return DivorceCertificateResponse
     */
    public DivorceCertificateResponse divorceCertificate(DivorceCertificateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_DIVORCE_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DivorceCertificateResponse.class);
    }

    /**
     * docAnalysis
     * 
     * @param request 入参结构体
     * @return DocAnalysisResponse
     */
    public DocAnalysisResponse docAnalysis(DocAnalysisRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_DOC_ANALYSIS);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DocAnalysisResponse.class);
    }

    /**
     * docAnalysisOffice
     * 
     * @param request 入参结构体
     * @return DocAnalysisOfficeResponse
     */
    public DocAnalysisOfficeResponse docAnalysisOffice(DocAnalysisOfficeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_DOC_ANALYSIS_OFFICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DocAnalysisOfficeResponse.class);
    }

    /**
     * docClassify
     * 
     * @param request 入参结构体
     * @return DocClassifyResponse
     */
    public DocClassifyResponse docClassify(DocClassifyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_DOC_CLASSIFY);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DocClassifyResponse.class);
    }

    /**
     * docCropEnhance
     * 
     * @param request 入参结构体
     * @return DocCropEnhanceResponse
     */
    public DocCropEnhanceResponse docCropEnhance(DocCropEnhanceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_DOC_CROP_ENHANCE);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, DocCropEnhanceResponse.class);
    }

    /**
     * drivingLicense
     * 
     * @param request 入参结构体
     * @return DrivingLicenseResponse
     */
    public DrivingLicenseResponse drivingLicense(DrivingLicenseRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_DRIVING_LICENSE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DrivingLicenseResponse.class);
    }

    /**
     * facade
     * 
     * @param request 入参结构体
     * @return FacadeResponse
     */
    public FacadeResponse facade(FacadeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_FACADE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, FacadeResponse.class);
    }

    /**
     * ferryTicket
     * 
     * @param request 入参结构体
     * @return FerryTicketResponse
     */
    public FerryTicketResponse ferryTicket(FerryTicketRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_FERRY_TICKET);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, FerryTicketResponse.class);
    }

    /**
     * foreignResidentIdCard
     * 
     * @param request 入参结构体
     * @return ForeignResidentIdCardResponse
     */
    public ForeignResidentIdCardResponse foreignResidentIdCard(ForeignResidentIdCardRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_FOREIGN_RESIDENT_ID_CARD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ForeignResidentIdCardResponse.class);
    }

    /**
     * forgeryDetection
     * 
     * @param request 入参结构体
     * @return ForgeryDetectionResponse
     */
    public ForgeryDetectionResponse forgeryDetection(ForgeryDetectionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_FORGERY_DETECTION);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ForgeryDetectionResponse.class);
    }

    /**
     * fourFactorsVerification
     * 
     * @param request 入参结构体
     * @return FourFactorsVerificationResponse
     */
    public FourFactorsVerificationResponse fourFactorsVerification(FourFactorsVerificationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_FOUR_FACTORS_VERIFICATION);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, FourFactorsVerificationResponse.class);
    }

    /**
     * general
     * 
     * @param request 入参结构体
     * @return GeneralResponse
     */
    public GeneralResponse general(GeneralRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_GENERAL);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, GeneralResponse.class);
    }

    /**
     * generalBasic
     * 
     * @param request 入参结构体
     * @return GeneralBasicResponse
     */
    public GeneralBasicResponse generalBasic(GeneralBasicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_GENERAL_BASIC);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, GeneralBasicResponse.class);
    }

    /**
     * handwriting
     * 
     * @param request 入参结构体
     * @return HandwritingResponse
     */
    public HandwritingResponse handwriting(HandwritingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_HANDWRITING);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, HandwritingResponse.class);
    }

    /**
     * handwritingCompositionCreateTask
     * 
     * @param request 入参结构体
     * @return HandwritingCompositionCreateTaskResponse
     */
    public HandwritingCompositionCreateTaskResponse handwritingCompositionCreateTask(HandwritingCompositionCreateTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_HANDWRITING_COMPOSITION, CONSTANT_CREATE_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, HandwritingCompositionCreateTaskResponse.class);
    }

    /**
     * handwritingCompositionGetResult
     * 
     * @param request 入参结构体
     * @return HandwritingCompositionGetResultResponse
     */
    public HandwritingCompositionGetResultResponse handwritingCompositionGetResult(HandwritingCompositionGetResultRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_HANDWRITING_COMPOSITION, CONSTANT_GET_RESULT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, HandwritingCompositionGetResultResponse.class);
    }

    /**
     * healthReport
     * 
     * @param request 入参结构体
     * @return HealthReportResponse
     */
    public HealthReportResponse healthReport(HealthReportRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_HEALTH_REPORT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, HealthReportResponse.class);
    }

    /**
     * hkMacauTaiwanExitentrypermit
     * 
     * @param request 入参结构体
     * @return HkMacauTaiwanExitentrypermitResponse
     */
    public HkMacauTaiwanExitentrypermitResponse hkMacauTaiwanExitentrypermit(HkMacauTaiwanExitentrypermitRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_HK_MACAU_TAIWAN_EXITENTRYPERMIT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, HkMacauTaiwanExitentrypermitResponse.class);
    }

    /**
     * hkMacauTaiwanpermit
     * 
     * @param request 入参结构体
     * @return HkMacauTaiwanpermitResponse
     */
    public HkMacauTaiwanpermitResponse hkMacauTaiwanpermit(HkMacauTaiwanpermitRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_HK_MACAU_TAIWAN_EXITENTRYPERMIT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, HkMacauTaiwanpermitResponse.class);
    }

    /**
     * householdRegister
     * 
     * @param request 入参结构体
     * @return HouseholdRegisterResponse
     */
    public HouseholdRegisterResponse householdRegister(HouseholdRegisterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_HOUSEHOLD_REGISTER);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, HouseholdRegisterResponse.class);
    }

    /**
     * idcard
     * 
     * @param request 入参结构体
     * @return IdcardResponse
     */
    public IdcardResponse idcard(IdcardRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_IDCARD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, IdcardResponse.class);
    }

    /**
     * invoice
     * 
     * @param request 入参结构体
     * @return InvoiceResponse
     */
    public InvoiceResponse invoice(InvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, InvoiceResponse.class);
    }

    /**
     * licensePlate
     * 
     * @param request 入参结构体
     * @return LicensePlateResponse
     */
    public LicensePlateResponse licensePlate(LicensePlateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_LICENSE_PLATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, LicensePlateResponse.class);
    }

    /**
     * marriageCertificate
     * 
     * @param request 入参结构体
     * @return MarriageCertificateResponse
     */
    public MarriageCertificateResponse marriageCertificate(MarriageCertificateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MARRIAGE_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MarriageCertificateResponse.class);
    }

    /**
     * medicalDetail
     * 
     * @param request 入参结构体
     * @return MedicalDetailResponse
     */
    public MedicalDetailResponse medicalDetail(MedicalDetailRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MEDICAL_DETAIL);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MedicalDetailResponse.class);
    }

    /**
     * medicalInvoice
     * 
     * @param request 入参结构体
     * @return MedicalInvoiceResponse
     */
    public MedicalInvoiceResponse medicalInvoice(MedicalInvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MEDICAL_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MedicalInvoiceResponse.class);
    }

    /**
     * medicalPrescription
     * 
     * @param request 入参结构体
     * @return MedicalPrescriptionResponse
     */
    public MedicalPrescriptionResponse medicalPrescription(MedicalPrescriptionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MEDICAL_PRESCRIPTION);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MedicalPrescriptionResponse.class);
    }

    /**
     * medicalRecord
     * 
     * @param request 入参结构体
     * @return MedicalRecordResponse
     */
    public MedicalRecordResponse medicalRecord(MedicalRecordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MEDICAL_RECORD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MedicalRecordResponse.class);
    }

    /**
     * medicalReportDetection
     * 
     * @param request 入参结构体
     * @return MedicalReportDetectionResponse
     */
    public MedicalReportDetectionResponse medicalReportDetection(MedicalReportDetectionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MEDICAL_REPORT_DETECTION);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MedicalReportDetectionResponse.class);
    }

    /**
     * medicalStatement
     * 
     * @param request 入参结构体
     * @return MedicalStatementResponse
     */
    public MedicalStatementResponse medicalStatement(MedicalStatementRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MEDICAL_STATEMENT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MedicalStatementResponse.class);
    }

    /**
     * medicalSummary
     * 
     * @param request 入参结构体
     * @return MedicalSummaryResponse
     */
    public MedicalSummaryResponse medicalSummary(MedicalSummaryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MEDICAL_SUMMARY);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MedicalSummaryResponse.class);
    }

    /**
     * meter
     * 
     * @param request 入参结构体
     * @return MeterResponse
     */
    public MeterResponse meter(MeterRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_METER);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MeterResponse.class);
    }

    /**
     * mixedMultiVehicle
     * 
     * @param request 入参结构体
     * @return MixedMultiVehicleResponse
     */
    public MixedMultiVehicleResponse mixedMultiVehicle(MixedMultiVehicleRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MIXED_MULTI_VEHICLE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MixedMultiVehicleResponse.class);
    }

    /**
     * multiIdcard
     * 
     * @param request 入参结构体
     * @return MultiIdcardResponse
     */
    public MultiIdcardResponse multiIdcard(MultiIdcardRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MULTI_IDCARD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MultiIdcardResponse.class);
    }

    /**
     * multipleInvoice
     * 
     * @param request 入参结构体
     * @return MultipleInvoiceResponse
     */
    public MultipleInvoiceResponse multipleInvoice(MultipleInvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_MULTIPLE_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MultipleInvoiceResponse.class);
    }

    /**
     * numbers
     * 
     * @param request 入参结构体
     * @return NumbersResponse
     */
    public NumbersResponse numbers(NumbersRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_NUMBERS);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, NumbersResponse.class);
    }

    /**
     * onlineTaxiItinerary
     * 
     * @param request 入参结构体
     * @return OnlineTaxiItineraryResponse
     */
    public OnlineTaxiItineraryResponse onlineTaxiItinerary(OnlineTaxiItineraryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_ONLINE_TAXI_ITINERARY);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, OnlineTaxiItineraryResponse.class);
    }

    /**
     * overseasPassport
     * 
     * @param request 入参结构体
     * @return OverseasPassportResponse
     */
    public OverseasPassportResponse overseasPassport(OverseasPassportRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_OVERSEAS_PASSPORT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, OverseasPassportResponse.class);
    }

    /**
     * paddleVlParserTask
     * 
     * @param request 入参结构体
     * @return PaddleVlParserTaskResponse
     */
    public PaddleVlParserTaskResponse paddleVlParserTask(PaddleVlParserTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_BRAIN,
                        CONSTANT_ONLINE,
                        CONSTANT_V2,
                        CONSTANT_PADDLE_VL_PARSER,
                        CONSTANT_TASK);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PaddleVlParserTaskResponse.class);
    }

    /**
     * paddleVlParserTaskQuery
     * 
     * @param request 入参结构体
     * @return PaddleVlParserTaskQueryResponse
     */
    public PaddleVlParserTaskQueryResponse paddleVlParserTaskQuery(PaddleVlParserTaskQueryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_BRAIN,
                        CONSTANT_ONLINE,
                        CONSTANT_V2,
                        CONSTANT_PADDLE_VL_PARSER,
                        CONSTANT_TASK,
                        CONSTANT_QUERY);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PaddleVlParserTaskQueryResponse.class);
    }

    /**
     * paperCutEdu
     * 
     * @param request 入参结构体
     * @return PaperCutEduResponse
     */
    public PaperCutEduResponse paperCutEdu(PaperCutEduRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_PAPER_CUT_EDU);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PaperCutEduResponse.class);
    }

    /**
     * paperCutEduVlmCreateTask
     * 
     * @param request 入参结构体
     * @return PaperCutEduVlmCreateTaskResponse
     */
    public PaperCutEduVlmCreateTaskResponse paperCutEduVlmCreateTask(PaperCutEduVlmCreateTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_PAPER_CUT_EDU_VLM, CONSTANT_CREATE_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PaperCutEduVlmCreateTaskResponse.class);
    }

    /**
     * paperCutEduVlmGetResult
     * 
     * @param request 入参结构体
     * @return PaperCutEduVlmGetResultResponse
     */
    public PaperCutEduVlmGetResultResponse paperCutEduVlmGetResult(PaperCutEduVlmGetResultRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_PAPER_CUT_EDU_VLM, CONSTANT_GET_RESULT);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, PaperCutEduVlmGetResultResponse.class);
    }

    /**
     * parserTask
     * 
     * @param request 入参结构体
     * @return ParserTaskResponse
     */
    public ParserTaskResponse parserTask(ParserTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_BRAIN, CONSTANT_ONLINE, CONSTANT_V2, CONSTANT_PARSER, CONSTANT_TASK);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ParserTaskResponse.class);
    }

    /**
     * parserTaskQuery
     * 
     * @param request 入参结构体
     * @return ParserTaskQueryResponse
     */
    public ParserTaskQueryResponse parserTaskQuery(ParserTaskQueryRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_BRAIN,
                        CONSTANT_ONLINE,
                        CONSTANT_V2,
                        CONSTANT_PARSER,
                        CONSTANT_TASK,
                        CONSTANT_QUERY);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ParserTaskQueryResponse.class);
    }

    /**
     * passport
     * 
     * @param request 入参结构体
     * @return PassportResponse
     */
    public PassportResponse passport(PassportRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_PASSPORT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PassportResponse.class);
    }

    /**
     * qrcode
     * 
     * @param request 入参结构体
     * @return QrcodeResponse
     */
    public QrcodeResponse qrcode(QrcodeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_QRCODE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, QrcodeResponse.class);
    }

    /**
     * quotaInvoice
     * 
     * @param request 入参结构体
     * @return QuotaInvoiceResponse
     */
    public QuotaInvoiceResponse quotaInvoice(QuotaInvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_QUOTA_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, QuotaInvoiceResponse.class);
    }

    /**
     * realEstateCertificate
     * 
     * @param request 入参结构体
     * @return RealEstateCertificateResponse
     */
    public RealEstateCertificateResponse realEstateCertificate(RealEstateCertificateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_REAL_ESTATE_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, RealEstateCertificateResponse.class);
    }

    /**
     * removeHandwriting
     * 
     * @param request 入参结构体
     * @return RemoveHandwritingResponse
     */
    public RemoveHandwritingResponse removeHandwriting(RemoveHandwritingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_REMOVE_HANDWRITING);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, RemoveHandwritingResponse.class);
    }

    /**
     * roadTransportCertificate
     * 
     * @param request 入参结构体
     * @return RoadTransportCertificateResponse
     */
    public RoadTransportCertificateResponse roadTransportCertificate(RoadTransportCertificateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_ROAD_TRANSPORT_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, RoadTransportCertificateResponse.class);
    }

    /**
     * seal
     * 
     * @param request 入参结构体
     * @return SealResponse
     */
    public SealResponse seal(SealRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_SEAL);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SealResponse.class);
    }

    /**
     * shoppingReceipt
     * 
     * @param request 入参结构体
     * @return ShoppingReceiptResponse
     */
    public ShoppingReceiptResponse shoppingReceipt(ShoppingReceiptRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_SHOPPING_RECEIPT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ShoppingReceiptResponse.class);
    }

    /**
     * smartStruct
     * 
     * @param request 入参结构体
     * @return SmartStructResponse
     */
    public SmartStructResponse smartStruct(SmartStructRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_SMART_STRUCT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SmartStructResponse.class);
    }

    /**
     * socialSecurityCard
     * 
     * @param request 入参结构体
     * @return SocialSecurityCardResponse
     */
    public SocialSecurityCardResponse socialSecurityCard(SocialSecurityCardRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_SOCIAL_SECURITY_CARD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SocialSecurityCardResponse.class);
    }

    /**
     * table
     * 
     * @param request 入参结构体
     * @return TableResponse
     */
    public TableResponse table(TableRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_TABLE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, TableResponse.class);
    }

    /**
     * taxiReceipt
     * 
     * @param request 入参结构体
     * @return TaxiReceiptResponse
     */
    public TaxiReceiptResponse taxiReceipt(TaxiReceiptRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_TAXI_RECEIPT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, TaxiReceiptResponse.class);
    }

    /**
     * threeFactorsVerification
     * 
     * @param request 入参结构体
     * @return ThreeFactorsVerificationResponse
     */
    public ThreeFactorsVerificationResponse threeFactorsVerification(ThreeFactorsVerificationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_THREE_FACTORS_VERIFICATION);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ThreeFactorsVerificationResponse.class);
    }

    /**
     * tollInvoice
     * 
     * @param request 入参结构体
     * @return TollInvoiceResponse
     */
    public TollInvoiceResponse tollInvoice(TollInvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_TOLL_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, TollInvoiceResponse.class);
    }

    /**
     * trainTicket
     * 
     * @param request 入参结构体
     * @return TrainTicketResponse
     */
    public TrainTicketResponse trainTicket(TrainTicketRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_TRAIN_TICKET);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, TrainTicketResponse.class);
    }

    /**
     * twoFactorsVerification
     * 
     * @param request 入参结构体
     * @return TwoFactorsVerificationResponse
     */
    public TwoFactorsVerificationResponse twoFactorsVerification(TwoFactorsVerificationRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_TWO_FACTORS_VERIFICATION);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, TwoFactorsVerificationResponse.class);
    }

    /**
     * usedVehicleInvoice
     * 
     * @param request 入参结构体
     * @return UsedVehicleInvoiceResponse
     */
    public UsedVehicleInvoiceResponse usedVehicleInvoice(UsedVehicleInvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_USED_VEHICLE_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, UsedVehicleInvoiceResponse.class);
    }

    /**
     * vatInvoice
     * 
     * @param request 入参结构体
     * @return VatInvoiceResponse
     */
    public VatInvoiceResponse vatInvoice(VatInvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_VAT_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VatInvoiceResponse.class);
    }

    /**
     * vehicleCertificate
     * 
     * @param request 入参结构体
     * @return VehicleCertificateResponse
     */
    public VehicleCertificateResponse vehicleCertificate(VehicleCertificateRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_VEHICLE_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VehicleCertificateResponse.class);
    }

    /**
     * vehicleInvoice
     * 
     * @param request 入参结构体
     * @return VehicleInvoiceResponse
     */
    public VehicleInvoiceResponse vehicleInvoice(VehicleInvoiceRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_VEHICLE_INVOICE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VehicleInvoiceResponse.class);
    }

    /**
     * vehicleLicense
     * 
     * @param request 入参结构体
     * @return VehicleLicenseResponse
     */
    public VehicleLicenseResponse vehicleLicense(VehicleLicenseRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_VEHICLE_LICENSE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VehicleLicenseResponse.class);
    }

    /**
     * vehicleRegCertificate
     * 
     * @param request 入参结构体
     * @return VehicleRegCertificateResponse
     */
    public VehicleRegCertificateResponse vehicleRegCertificate(VehicleRegCertificateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_VEHICLE_REGISTRATION_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VehicleRegCertificateResponse.class);
    }

    /**
     * vehicleRegistrationCertificate
     * 
     * @param request 入参结构体
     * @return VehicleRegistrationCertificateResponse
     */
    public VehicleRegistrationCertificateResponse vehicleRegistrationCertificate(VehicleRegistrationCertificateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_VEHICLE_REGISTRATION_CERTIFICATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VehicleRegistrationCertificateResponse.class);
    }

    /**
     * vinCode
     * 
     * @param request 入参结构体
     * @return VinCodeResponse
     */
    public VinCodeResponse vinCode(VinCodeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_VIN_CODE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VinCodeResponse.class);
    }

    /**
     * waybill
     * 
     * @param request 入参结构体
     * @return WaybillResponse
     */
    public WaybillResponse waybill(WaybillRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_WAYBILL);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, WaybillResponse.class);
    }

    /**
     * webImage
     * 
     * @param request 入参结构体
     * @return WebImageResponse
     */
    public WebImageResponse webImage(WebImageRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_WEBIMAGE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, WebImageResponse.class);
    }

    /**
     * webImageLoc
     * 
     * @param request 入参结构体
     * @return WebImageLocResponse
     */
    public WebImageLocResponse webImageLoc(WebImageLocRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_WEBIMAGE_LOC);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, WebImageLocResponse.class);
    }

    /**
     * weightNote
     * 
     * @param request 入参结构体
     * @return WeightNoteResponse
     */
    public WeightNoteResponse weightNote(WeightNoteRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_OCR, CONSTANT_V1, CONSTANT_WEIGHT_NOTE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, WeightNoteResponse.class);
    }

    /**
    * Creates and initializes a new request object for the specified resource.
    *
    * @param bceRequest    The original BCE request created by the user.
    * @param httpMethod    The HTTP method to use when sending the request.
    * @param pathVariables The optional variables used in the URI path.
    * @return A new request object populated with endpoint, resource path and specific
    *         parameters to send.
    */
    protected InternalRequest createRequest(AbstractBceRequest bceRequest, HttpMethodName httpMethod, String... pathVariables) {
        return super.createRequest(bceRequest, httpMethod, createSignOptions(), pathVariables);
    }

    /**
    * 创建签名选项
    *
    * @return 配置了服务所需签名头的 SignOptions
    */
    private SignOptions createSignOptions() {
        SignOptions signOptions = new SignOptions();
        signOptions.setHeadersToSign(new HashSet<String>(Arrays.asList(HEADERS_TO_SIGN)));
        return signOptions;
    }
}
