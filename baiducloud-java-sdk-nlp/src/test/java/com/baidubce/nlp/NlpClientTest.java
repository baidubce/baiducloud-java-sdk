package com.baidubce.nlp;

import com.baidubce.nlp.models.AddressRequest;
import com.baidubce.nlp.models.AddressResponse;
import com.baidubce.nlp.models.CommentTagRequest;
import com.baidubce.nlp.models.CommentTagResponse;
import com.baidubce.nlp.models.EcnetRequest;
import com.baidubce.nlp.models.EcnetResponse;
import com.baidubce.nlp.models.EmotionRequest;
import com.baidubce.nlp.models.EmotionResponse;
import com.baidubce.nlp.models.EntityAnalysisRequest;
import com.baidubce.nlp.models.EntityAnalysisResponse;
import com.baidubce.nlp.models.KeywordRequest;
import com.baidubce.nlp.models.KeywordResponse;
import com.baidubce.nlp.models.LexerRequest;
import com.baidubce.nlp.models.LexerResponse;
import com.baidubce.nlp.models.NewsSummaryRequest;
import com.baidubce.nlp.models.NewsSummaryResponse;
import com.baidubce.nlp.models.SentimentClassifyRequest;
import com.baidubce.nlp.models.SentimentClassifyResponse;
import com.baidubce.nlp.models.SimnetRequest;
import com.baidubce.nlp.models.SimnetResponse;
import com.baidubce.nlp.models.TextCorrectionRequest;
import com.baidubce.nlp.models.TextCorrectionResponse;
import com.baidubce.nlp.models.TopicRequest;
import com.baidubce.nlp.models.TopicResponse;
import com.baidubce.nlp.models.TxtKeywordsExtractionRequest;
import com.baidubce.nlp.models.TxtKeywordsExtractionResponse;
import com.baidubce.nlp.models.TxtMonetRequest;
import com.baidubce.nlp.models.TxtMonetResponse;
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.BceApiKeyCredentials;
import java.util.ArrayList;

/**
 * API tests for NlpClient
 */
public class NlpClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private static final String API_KEY = "";
    private static final String SECRET_KEY = "";
    private NlpClient nlpClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        // config.setCredentials(new DefaultBceCredentials(AK, SK));

        // ==== AccessToken 鉴权（API Key / Secret Key 换取 AccessToken）====
        // config.setCredentials(new BceAccessTokenCredentials(API_KEY, SECRET_KEY));

        // ==== API Key 鉴权 ====
        config.setCredentials(new BceApiKeyCredentials(API_KEY));

        nlpClient = new NlpClient(config);
    }

    /**
     * address
     *
     */
    @Test
    public void addressTest() {
        AddressRequest addressRequest = new AddressRequest();
        addressRequest.setCharset("");
        addressRequest.setText("");
        AddressResponse response = nlpClient.address(addressRequest);
        System.out.println(response);
    }
    /**
     * commentTag
     *
     */
    @Test
    public void commentTagTest() {
        CommentTagRequest commentTagRequest = new CommentTagRequest();
        commentTagRequest.setCharset("");
        commentTagRequest.setText("");
        commentTagRequest.setType(0);
        CommentTagResponse response = nlpClient.commentTag(commentTagRequest);
        System.out.println(response);
    }
    /**
     * ecnet
     *
     */
    @Test
    public void ecnetTest() {
        EcnetRequest ecnetRequest = new EcnetRequest();
        ecnetRequest.setCharset("");
        ecnetRequest.setText("");
        EcnetResponse response = nlpClient.ecnet(ecnetRequest);
        System.out.println(response);
    }
    /**
     * emotion
     *
     */
    @Test
    public void emotionTest() {
        EmotionRequest emotionRequest = new EmotionRequest();
        emotionRequest.setCharset("");
        emotionRequest.setText("");
        emotionRequest.setScene("");
        EmotionResponse response = nlpClient.emotion(emotionRequest);
        System.out.println(response);
    }
    /**
     * entityAnalysis
     *
     */
    @Test
    public void entityAnalysisTest() {
        EntityAnalysisRequest entityAnalysisRequest = new EntityAnalysisRequest();
        entityAnalysisRequest.setText("");
        entityAnalysisRequest.setMention("");
        EntityAnalysisResponse response = nlpClient.entityAnalysis(entityAnalysisRequest);
        System.out.println(response);
    }
    /**
     * keyword
     *
     */
    @Test
    public void keywordTest() {
        KeywordRequest keywordRequest = new KeywordRequest();
        keywordRequest.setCharset("");
        keywordRequest.setTitle("");
        keywordRequest.setContent("");
        KeywordResponse response = nlpClient.keyword(keywordRequest);
        System.out.println(response);
    }
    /**
     * lexer
     *
     */
    @Test
    public void lexerTest() {
        LexerRequest lexerRequest = new LexerRequest();
        lexerRequest.setCharset("");
        lexerRequest.setText("");
        LexerResponse response = nlpClient.lexer(lexerRequest);
        System.out.println(response);
    }
    /**
     * newsSummary
     *
     */
    @Test
    public void newsSummaryTest() {
        NewsSummaryRequest newsSummaryRequest = new NewsSummaryRequest();
        newsSummaryRequest.setCharset("");
        newsSummaryRequest.setTitle("");
        newsSummaryRequest.setContent("");
        newsSummaryRequest.setMaxSummaryLen(0);
        NewsSummaryResponse response = nlpClient.newsSummary(newsSummaryRequest);
        System.out.println(response);
    }
    /**
     * sentimentClassify
     *
     */
    @Test
    public void sentimentClassifyTest() {
        SentimentClassifyRequest sentimentClassifyRequest = new SentimentClassifyRequest();
        sentimentClassifyRequest.setCharset("");
        sentimentClassifyRequest.setText("");
        SentimentClassifyResponse response = nlpClient.sentimentClassify(sentimentClassifyRequest);
        System.out.println(response);
    }
    /**
     * simnet
     *
     */
    @Test
    public void simnetTest() {
        SimnetRequest simnetRequest = new SimnetRequest();
        simnetRequest.setCharset("");
        simnetRequest.setText1("");
        simnetRequest.setText2("");
        simnetRequest.setModel("");
        SimnetResponse response = nlpClient.simnet(simnetRequest);
        System.out.println(response);
    }
    /**
     * textCorrection
     *
     */
    @Test
    public void textCorrectionTest() {
        TextCorrectionRequest textCorrectionRequest = new TextCorrectionRequest();
        textCorrectionRequest.setCharset("");
        textCorrectionRequest.setText("");
        TextCorrectionResponse response = nlpClient.textCorrection(textCorrectionRequest);
        System.out.println(response);
    }
    /**
     * topic
     *
     */
    @Test
    public void topicTest() {
        TopicRequest topicRequest = new TopicRequest();
        topicRequest.setCharset("");
        topicRequest.setTitle("");
        topicRequest.setContent("");
        TopicResponse response = nlpClient.topic(topicRequest);
        System.out.println(response);
    }
    /**
     * txtKeywordsExtraction
     *
     */
    @Test
    public void txtKeywordsExtractionTest() {
        TxtKeywordsExtractionRequest txtKeywordsExtractionRequest = new TxtKeywordsExtractionRequest();
        txtKeywordsExtractionRequest.setCharset("");
        txtKeywordsExtractionRequest.setText(new ArrayList<>());
        txtKeywordsExtractionRequest.setNum(0);
        TxtKeywordsExtractionResponse response = nlpClient.txtKeywordsExtraction(txtKeywordsExtractionRequest);
        System.out.println(response);
    }
    /**
     * txtMonet
     *
     */
    @Test
    public void txtMonetTest() {
        TxtMonetRequest txtMonetRequest = new TxtMonetRequest();
        txtMonetRequest.setCharset("");
        txtMonetRequest.setContentList(new ArrayList<>());
        TxtMonetResponse response = nlpClient.txtMonet(txtMonetRequest);
        System.out.println(response);
    }
}
