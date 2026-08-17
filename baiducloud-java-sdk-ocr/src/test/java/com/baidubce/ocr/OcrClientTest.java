package com.baidubce.ocr;

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
}
