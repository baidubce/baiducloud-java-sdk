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

import com.baidubce.ocr.models.HealthReportRequest;
import com.baidubce.ocr.models.HealthReportResponse;
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

public class OcrClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_REST = "rest";
    private static final String CONSTANT_2_0 = "2.0";
    private static final String CONSTANT_OCR = "ocr";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_MEDICAL_SUMMARY = "medical_summary";
    private static final String CONSTANT_MEDICAL_STATEMENT = "medical_statement";
    private static final String CONSTANT_MEDICAL_PRESCRIPTION = "medical_prescription";
    private static final String CONSTANT_MEDICAL_INVOICE = "medical_invoice";
    private static final String CONSTANT_MEDICAL_RECORD = "medical_record";
    private static final String CONSTANT_HEALTH_REPORT = "health_report";
    private static final String CONSTANT_MEDICAL_DETAIL = "medical_detail";
    private static final String CONSTANT_MEDICAL_REPORT_DETECTION = "medical_report_detection";

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
