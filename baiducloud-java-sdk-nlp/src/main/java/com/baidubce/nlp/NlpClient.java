package com.baidubce.nlp;

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

public class NlpClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_RPC = "rpc";
    private static final String CONSTANT_2_0 = "2.0";
    private static final String CONSTANT_NLP = "nlp";
    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_TEXT_CORRECTION = "text_correction";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_ECNET = "ecnet";
    private static final String CONSTANT_ADDRESS = "address";
    private static final String CONSTANT_NEWS_SUMMARY = "news_summary";
    private static final String CONSTANT_COMMENT_TAG = "comment_tag";
    private static final String CONSTANT_LEXER = "lexer";
    private static final String CONSTANT_EMOTION = "emotion";
    private static final String CONSTANT_TXT_KEYWORDS_EXTRACTION = "txt_keywords_extraction";
    private static final String CONSTANT_TOPIC = "topic";
    private static final String CONSTANT_TXT_MONET = "txt_monet";
    private static final String CONSTANT_ENTITY_ANALYSIS = "entity_analysis";
    private static final String CONSTANT_SENTIMENT_CLASSIFY = "sentiment_classify";
    private static final String CONSTANT_KEYWORD = "keyword";
    private static final String CONSTANT_SIMNET = "simnet";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public NlpClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public NlpClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * address
     * 
     * @param request 入参结构体
     * @return AddressResponse
     */
    public AddressResponse address(AddressRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_ADDRESS);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AddressResponse.class);
    }

    /**
     * commentTag
     * 
     * @param request 入参结构体
     * @return CommentTagResponse
     */
    public CommentTagResponse commentTag(CommentTagRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V2, CONSTANT_COMMENT_TAG);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, CommentTagResponse.class);
    }

    /**
     * ecnet
     * 
     * @param request 入参结构体
     * @return EcnetResponse
     */
    public EcnetResponse ecnet(EcnetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_ECNET);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, EcnetResponse.class);
    }

    /**
     * emotion
     * 
     * @param request 入参结构体
     * @return EmotionResponse
     */
    public EmotionResponse emotion(EmotionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_EMOTION);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, EmotionResponse.class);
    }

    /**
     * entityAnalysis
     * 
     * @param request 入参结构体
     * @return EntityAnalysisResponse
     */
    public EntityAnalysisResponse entityAnalysis(EntityAnalysisRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_ENTITY_ANALYSIS);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, EntityAnalysisResponse.class);
    }

    /**
     * keyword
     * 
     * @param request 入参结构体
     * @return KeywordResponse
     */
    public KeywordResponse keyword(KeywordRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_KEYWORD);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, KeywordResponse.class);
    }

    /**
     * lexer
     * 
     * @param request 入参结构体
     * @return LexerResponse
     */
    public LexerResponse lexer(LexerRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_LEXER);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, LexerResponse.class);
    }

    /**
     * newsSummary
     * 
     * @param request 入参结构体
     * @return NewsSummaryResponse
     */
    public NewsSummaryResponse newsSummary(NewsSummaryRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_NEWS_SUMMARY);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, NewsSummaryResponse.class);
    }

    /**
     * sentimentClassify
     * 
     * @param request 入参结构体
     * @return SentimentClassifyResponse
     */
    public SentimentClassifyResponse sentimentClassify(SentimentClassifyRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_SENTIMENT_CLASSIFY);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, SentimentClassifyResponse.class);
    }

    /**
     * simnet
     * 
     * @param request 入参结构体
     * @return SimnetResponse
     */
    public SimnetResponse simnet(SimnetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V2, CONSTANT_SIMNET);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, SimnetResponse.class);
    }

    /**
     * textCorrection
     * 
     * @param request 入参结构体
     * @return TextCorrectionResponse
     */
    public TextCorrectionResponse textCorrection(TextCorrectionRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V2, CONSTANT_TEXT_CORRECTION);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TextCorrectionResponse.class);
    }

    /**
     * topic
     * 
     * @param request 入参结构体
     * @return TopicResponse
     */
    public TopicResponse topic(TopicRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_TOPIC);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TopicResponse.class);
    }

    /**
     * txtKeywordsExtraction
     * 
     * @param request 入参结构体
     * @return TxtKeywordsExtractionResponse
     */
    public TxtKeywordsExtractionResponse txtKeywordsExtraction(TxtKeywordsExtractionRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_TXT_KEYWORDS_EXTRACTION);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TxtKeywordsExtractionResponse.class);
    }

    /**
     * txtMonet
     * 
     * @param request 入参结构体
     * @return TxtMonetResponse
     */
    public TxtMonetResponse txtMonet(TxtMonetRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_RPC, CONSTANT_2_0, CONSTANT_NLP, CONSTANT_V1, CONSTANT_TXT_MONET);
        if (request.getCharset() != null) {
            internalRequest.addParameter("charset", request.getCharset());
        }
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, TxtMonetResponse.class);
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
