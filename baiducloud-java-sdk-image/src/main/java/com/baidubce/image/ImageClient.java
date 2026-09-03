package com.baidubce.image;

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

import com.baidubce.image.models.AdvancedGeneralRequest;
import com.baidubce.image.models.AdvancedGeneralResponse;
import com.baidubce.image.models.AiRetouchingCreateTaskRequest;
import com.baidubce.image.models.AiRetouchingCreateTaskResponse;
import com.baidubce.image.models.AiRetouchingQueryTaskRequest;
import com.baidubce.image.models.AiRetouchingQueryTaskResponse;
import com.baidubce.image.models.AnimalRequest;
import com.baidubce.image.models.AnimalResponse;
import com.baidubce.image.models.CarRequest;
import com.baidubce.image.models.CarResponse;
import com.baidubce.image.models.ColorEnhanceRequest;
import com.baidubce.image.models.ColorEnhanceResponse;
import com.baidubce.image.models.ColourizeRequest;
import com.baidubce.image.models.ColourizeResponse;
import com.baidubce.image.models.ContrastEnhanceRequest;
import com.baidubce.image.models.ContrastEnhanceResponse;
import com.baidubce.image.models.DehazeRequest;
import com.baidubce.image.models.DehazeResponse;
import com.baidubce.image.models.DishRequest;
import com.baidubce.image.models.DishResponse;
import com.baidubce.image.models.DocRepairRequest;
import com.baidubce.image.models.DocRepairResponse;
import com.baidubce.image.models.ImageDefinitionEnhanceRequest;
import com.baidubce.image.models.ImageDefinitionEnhanceResponse;
import com.baidubce.image.models.ImageQualityEnhanceRequest;
import com.baidubce.image.models.ImageQualityEnhanceResponse;
import com.baidubce.image.models.ImageUnderstandingGetResultRequest;
import com.baidubce.image.models.ImageUnderstandingGetResultResponse;
import com.baidubce.image.models.ImageUnderstandingRequestRequest;
import com.baidubce.image.models.ImageUnderstandingRequestResponse;
import com.baidubce.image.models.IngredientRequest;
import com.baidubce.image.models.IngredientResponse;
import com.baidubce.image.models.InpaintingRequest;
import com.baidubce.image.models.InpaintingResponse;
import com.baidubce.image.models.LandmarkRequest;
import com.baidubce.image.models.LandmarkResponse;
import com.baidubce.image.models.LogoAddRequest;
import com.baidubce.image.models.LogoAddResponse;
import com.baidubce.image.models.LogoDeleteRequest;
import com.baidubce.image.models.LogoDeleteResponse;
import com.baidubce.image.models.LogoRequest;
import com.baidubce.image.models.LogoResponse;
import com.baidubce.image.models.MaterielImageAddRequest;
import com.baidubce.image.models.MaterielImageAddResponse;
import com.baidubce.image.models.MaterielImageDeleteRequest;
import com.baidubce.image.models.MaterielImageDeleteResponse;
import com.baidubce.image.models.MaterielImageSearchRequest;
import com.baidubce.image.models.MaterielImageSearchResponse;
import com.baidubce.image.models.MaterielImageUpdateRequest;
import com.baidubce.image.models.MaterielImageUpdateResponse;
import com.baidubce.image.models.MultiObjectDetectRequest;
import com.baidubce.image.models.MultiObjectDetectResponse;
import com.baidubce.image.models.ObjectDetectRequest;
import com.baidubce.image.models.ObjectDetectResponse;
import com.baidubce.image.models.PicturebookImageAddRequest;
import com.baidubce.image.models.PicturebookImageAddResponse;
import com.baidubce.image.models.PicturebookImageDeleteRequest;
import com.baidubce.image.models.PicturebookImageDeleteResponse;
import com.baidubce.image.models.PicturebookImageSearchRequest;
import com.baidubce.image.models.PicturebookImageSearchResponse;
import com.baidubce.image.models.PicturebookImageUpdateRequest;
import com.baidubce.image.models.PicturebookImageUpdateResponse;
import com.baidubce.image.models.PlantRequest;
import com.baidubce.image.models.PlantResponse;
import com.baidubce.image.models.ProductImageAddRequest;
import com.baidubce.image.models.ProductImageAddResponse;
import com.baidubce.image.models.ProductImageDeleteRequest;
import com.baidubce.image.models.ProductImageDeleteResponse;
import com.baidubce.image.models.ProductImageSearchRequest;
import com.baidubce.image.models.ProductImageSearchResponse;
import com.baidubce.image.models.ProductImageUpdateRequest;
import com.baidubce.image.models.ProductImageUpdateResponse;
import com.baidubce.image.models.RemoveMoireRequest;
import com.baidubce.image.models.RemoveMoireResponse;
import com.baidubce.image.models.SameImageAddRequest;
import com.baidubce.image.models.SameImageAddResponse;
import com.baidubce.image.models.SameImageDeleteRequest;
import com.baidubce.image.models.SameImageDeleteResponse;
import com.baidubce.image.models.SameImageSearchRequest;
import com.baidubce.image.models.SameImageSearchResponse;
import com.baidubce.image.models.SameImageUpdateRequest;
import com.baidubce.image.models.SameImageUpdateResponse;
import com.baidubce.image.models.SegmentRequest;
import com.baidubce.image.models.SegmentResponse;
import com.baidubce.image.models.SelfieAnimeRequest;
import com.baidubce.image.models.SelfieAnimeResponse;
import com.baidubce.image.models.SimilarImageAddRequest;
import com.baidubce.image.models.SimilarImageAddResponse;
import com.baidubce.image.models.SimilarImageDeleteRequest;
import com.baidubce.image.models.SimilarImageDeleteResponse;
import com.baidubce.image.models.SimilarImageSearchRequest;
import com.baidubce.image.models.SimilarImageSearchResponse;
import com.baidubce.image.models.SimilarImageUpdateRequest;
import com.baidubce.image.models.SimilarImageUpdateResponse;
import com.baidubce.image.models.StretchRestoreRequest;
import com.baidubce.image.models.StretchRestoreResponse;
import com.baidubce.image.models.StyleTransRequest;
import com.baidubce.image.models.StyleTransResponse;
import com.baidubce.image.models.VehicleDetectRequest;
import com.baidubce.image.models.VehicleDetectResponse;

public class ImageClient extends AbstractBceClient {

    private static final String[] HEADERS_TO_SIGN = {"host", "x-bce-date"};

    private static final String CONSTANT_REST = "rest";
    private static final String CONSTANT_2_0 = "2.0";
    private static final String CONSTANT_IMAGE_PROCESS = "image-process";
    private static final String CONSTANT_V1 = "v1";
    private static final String CONSTANT_DEHAZE = "dehaze";
    private static final String CONSTANT_IMAGE_CLASSIFY = "image-classify";
    private static final String CONSTANT_REALTIME_SEARCH = "realtime_search";
    private static final String CONSTANT_MATERIEL = "materiel";
    private static final String CONSTANT_UPDATE = "update";
    private static final String CONSTANT_DELETE = "delete";
    private static final String CONSTANT_SAME_HQ = "same_hq";
    private static final String CONSTANT_SEGMENT = "segment";
    private static final String CONSTANT_V2 = "v2";
    private static final String CONSTANT_LOGO = "logo";
    private static final String CONSTANT_ADD = "add";
    private static final String CONSTANT_LANDMARK = "landmark";
    private static final String CONSTANT_IMAGE_UNDERSTANDING = "image-understanding";
    private static final String CONSTANT_REQUEST = "request";
    private static final String CONSTANT_SEARCH = "search";
    private static final String CONSTANT_CONTRAST_ENHANCE = "contrast_enhance";
    private static final String CONSTANT_SIMILAR = "similar";
    private static final String CONSTANT_RETOUCHING = "retouching";
    private static final String CONSTANT_CREATE_TASK = "create_task";
    private static final String CONSTANT_PRODUCT = "product";
    private static final String CONSTANT_IMAGESEARCH = "imagesearch";
    private static final String CONSTANT_PICTUREBOOK = "picturebook";
    private static final String CONSTANT_QUERY_TASK = "query_task";
    private static final String CONSTANT_DISH = "dish";
    private static final String CONSTANT_SELFIE_ANIME = "selfie_anime";
    private static final String CONSTANT_PLANT = "plant";
    private static final String CONSTANT_ANIMAL = "animal";
    private static final String CONSTANT_IMAGE_DEFINITION_ENHANCE = "image_definition_enhance";
    private static final String CONSTANT_COLOR_ENHANCE = "color_enhance";
    private static final String CONSTANT_COLOURIZE = "colourize";
    private static final String CONSTANT_STYLE_TRANS = "style_trans";
    private static final String CONSTANT_INPAINTING = "inpainting";
    private static final String CONSTANT_MULTI_OBJECT_DETECT = "multi_object_detect";
    private static final String CONSTANT_GET_RESULT = "get-result";
    private static final String CONSTANT_CAR = "car";
    private static final String CONSTANT_REMOVE_MOIRE = "remove_moire";
    private static final String CONSTANT_IMAGE_QUALITY_ENHANCE = "image_quality_enhance";
    private static final String CONSTANT_CLASSIFY = "classify";
    private static final String CONSTANT_INGREDIENT = "ingredient";
    private static final String CONSTANT_ADVANCED_GENERAL = "advanced_general";
    private static final String CONSTANT_OBJECT_DETECT = "object_detect";
    private static final String CONSTANT_DOC_REPAIR = "doc_repair";
    private static final String CONSTANT_VEHICLE_DETECT = "vehicle_detect";
    private static final String CONSTANT_STRETCH_RESTORE = "stretch_restore";

    /**
    * Responsible for handling httpResponses from all service calls.
    */
    private static final HttpResponseHandler[] CLIENT_HANDLERS =
            new HttpResponseHandler[]{new BceMetadataResponseHandler(), new BceErrorResponseHandler(), new BceJsonResponseHandler()};

    public ImageClient() {
        this(new BceClientConfiguration());
    }

    /**
    * Constructs a new InstanceClient to invoke service methods on eip instance.
    *
    * @param clientConfiguration The BCE client configuration options.
    */
    public ImageClient(BceClientConfiguration clientConfiguration) {
        super(clientConfiguration, CLIENT_HANDLERS);
    }

    /**
     * advancedGeneral
     * 
     * @param request 入参结构体
     * @return AdvancedGeneralResponse
     */
    public AdvancedGeneralResponse advancedGeneral(AdvancedGeneralRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V2, CONSTANT_ADVANCED_GENERAL);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, AdvancedGeneralResponse.class);
    }

    /**
     * aiRetouchingCreateTask
     * 
     * @param request 入参结构体
     * @return AiRetouchingCreateTaskResponse
     */
    public AiRetouchingCreateTaskResponse aiRetouchingCreateTask(AiRetouchingCreateTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_RETOUCHING, CONSTANT_CREATE_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AiRetouchingCreateTaskResponse.class);
    }

    /**
     * aiRetouchingQueryTask
     * 
     * @param request 入参结构体
     * @return AiRetouchingQueryTaskResponse
     */
    public AiRetouchingQueryTaskResponse aiRetouchingQueryTask(AiRetouchingQueryTaskRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_RETOUCHING, CONSTANT_QUERY_TASK);
        RequestBodyUtils.fillPayloadAsJson(internalRequest, request);
        return invokeHttpClient(internalRequest, AiRetouchingQueryTaskResponse.class);
    }

    /**
     * animal
     * 
     * @param request 入参结构体
     * @return AnimalResponse
     */
    public AnimalResponse animal(AnimalRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_ANIMAL);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, AnimalResponse.class);
    }

    /**
     * car
     * 
     * @param request 入参结构体
     * @return CarResponse
     */
    public CarResponse car(CarRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_CAR);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, CarResponse.class);
    }

    /**
     * colorEnhance
     * 
     * @param request 入参结构体
     * @return ColorEnhanceResponse
     */
    public ColorEnhanceResponse colorEnhance(ColorEnhanceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_COLOR_ENHANCE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ColorEnhanceResponse.class);
    }

    /**
     * colourize
     * 
     * @param request 入参结构体
     * @return ColourizeResponse
     */
    public ColourizeResponse colourize(ColourizeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_COLOURIZE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ColourizeResponse.class);
    }

    /**
     * contrastEnhance
     * 
     * @param request 入参结构体
     * @return ContrastEnhanceResponse
     */
    public ContrastEnhanceResponse contrastEnhance(ContrastEnhanceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_CONTRAST_ENHANCE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ContrastEnhanceResponse.class);
    }

    /**
     * dehaze
     * 
     * @param request 入参结构体
     * @return DehazeResponse
     */
    public DehazeResponse dehaze(DehazeRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_DEHAZE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DehazeResponse.class);
    }

    /**
     * dish
     * 
     * @param request 入参结构体
     * @return DishResponse
     */
    public DishResponse dish(DishRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V2, CONSTANT_DISH);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DishResponse.class);
    }

    /**
     * docRepair
     * 
     * @param request 入参结构体
     * @return DocRepairResponse
     */
    public DocRepairResponse docRepair(DocRepairRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_DOC_REPAIR);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, DocRepairResponse.class);
    }

    /**
     * imageDefinitionEnhance
     * 
     * @param request 入参结构体
     * @return ImageDefinitionEnhanceResponse
     */
    public ImageDefinitionEnhanceResponse imageDefinitionEnhance(ImageDefinitionEnhanceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_IMAGE_DEFINITION_ENHANCE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ImageDefinitionEnhanceResponse.class);
    }

    /**
     * imageQualityEnhance
     * 
     * @param request 入参结构体
     * @return ImageQualityEnhanceResponse
     */
    public ImageQualityEnhanceResponse imageQualityEnhance(ImageQualityEnhanceRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_IMAGE_QUALITY_ENHANCE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ImageQualityEnhanceResponse.class);
    }

    /**
     * imageUnderstandingGetResult
     * 
     * @param request 入参结构体
     * @return ImageUnderstandingGetResultResponse
     */
    public ImageUnderstandingGetResultResponse imageUnderstandingGetResult(ImageUnderstandingGetResultRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_IMAGE_UNDERSTANDING,
                        CONSTANT_GET_RESULT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ImageUnderstandingGetResultResponse.class);
    }

    /**
     * imageUnderstandingRequest
     * 
     * @param request 入参结构体
     * @return ImageUnderstandingRequestResponse
     */
    public ImageUnderstandingRequestResponse imageUnderstandingRequest(ImageUnderstandingRequestRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_IMAGE_UNDERSTANDING,
                        CONSTANT_REQUEST);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ImageUnderstandingRequestResponse.class);
    }

    /**
     * ingredient
     * 
     * @param request 入参结构体
     * @return IngredientResponse
     */
    public IngredientResponse ingredient(IngredientRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_CLASSIFY, CONSTANT_INGREDIENT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, IngredientResponse.class);
    }

    /**
     * inpainting
     * 
     * @param request 入参结构体
     * @return InpaintingResponse
     */
    public InpaintingResponse inpainting(InpaintingRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_INPAINTING);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, InpaintingResponse.class);
    }

    /**
     * landmark
     * 
     * @param request 入参结构体
     * @return LandmarkResponse
     */
    public LandmarkResponse landmark(LandmarkRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_LANDMARK);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, LandmarkResponse.class);
    }

    /**
     * logo
     * 
     * @param request 入参结构体
     * @return LogoResponse
     */
    public LogoResponse logo(LogoRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V2, CONSTANT_LOGO);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, LogoResponse.class);
    }

    /**
     * logoAdd
     * 
     * @param request 入参结构体
     * @return LogoAddResponse
     */
    public LogoAddResponse logoAdd(LogoAddRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_REALTIME_SEARCH, CONSTANT_V1, CONSTANT_LOGO, CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, LogoAddResponse.class);
    }

    /**
     * logoDelete
     * 
     * @param request 入参结构体
     * @return LogoDeleteResponse
     */
    public LogoDeleteResponse logoDelete(LogoDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_REALTIME_SEARCH, CONSTANT_V1, CONSTANT_LOGO, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, LogoDeleteResponse.class);
    }

    /**
     * materielImageAdd
     * 
     * @param request 入参结构体
     * @return MaterielImageAddResponse
     */
    public MaterielImageAddResponse materielImageAdd(MaterielImageAddRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_MATERIEL,
                        CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MaterielImageAddResponse.class);
    }

    /**
     * materielImageDelete
     * 
     * @param request 入参结构体
     * @return MaterielImageDeleteResponse
     */
    public MaterielImageDeleteResponse materielImageDelete(MaterielImageDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_MATERIEL,
                        CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MaterielImageDeleteResponse.class);
    }

    /**
     * materielImageSearch
     * 
     * @param request 入参结构体
     * @return MaterielImageSearchResponse
     */
    public MaterielImageSearchResponse materielImageSearch(MaterielImageSearchRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_MATERIEL,
                        CONSTANT_SEARCH);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MaterielImageSearchResponse.class);
    }

    /**
     * materielImageUpdate
     * 
     * @param request 入参结构体
     * @return MaterielImageUpdateResponse
     */
    public MaterielImageUpdateResponse materielImageUpdate(MaterielImageUpdateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_MATERIEL,
                        CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MaterielImageUpdateResponse.class);
    }

    /**
     * multiObjectDetect
     * 
     * @param request 入参结构体
     * @return MultiObjectDetectResponse
     */
    public MultiObjectDetectResponse multiObjectDetect(MultiObjectDetectRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_MULTI_OBJECT_DETECT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, MultiObjectDetectResponse.class);
    }

    /**
     * objectDetect
     * 
     * @param request 入参结构体
     * @return ObjectDetectResponse
     */
    public ObjectDetectResponse objectDetect(ObjectDetectRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_OBJECT_DETECT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ObjectDetectResponse.class);
    }

    /**
     * picturebookImageAdd
     * 
     * @param request 入参结构体
     * @return PicturebookImageAddResponse
     */
    public PicturebookImageAddResponse picturebookImageAdd(PicturebookImageAddRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGESEARCH,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PICTUREBOOK,
                        CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PicturebookImageAddResponse.class);
    }

    /**
     * picturebookImageDelete
     * 
     * @param request 入参结构体
     * @return PicturebookImageDeleteResponse
     */
    public PicturebookImageDeleteResponse picturebookImageDelete(PicturebookImageDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGESEARCH,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PICTUREBOOK,
                        CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PicturebookImageDeleteResponse.class);
    }

    /**
     * picturebookImageSearch
     * 
     * @param request 入参结构体
     * @return PicturebookImageSearchResponse
     */
    public PicturebookImageSearchResponse picturebookImageSearch(PicturebookImageSearchRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGESEARCH,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PICTUREBOOK,
                        CONSTANT_SEARCH);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PicturebookImageSearchResponse.class);
    }

    /**
     * picturebookImageUpdate
     * 
     * @param request 入参结构体
     * @return PicturebookImageUpdateResponse
     */
    public PicturebookImageUpdateResponse picturebookImageUpdate(PicturebookImageUpdateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGESEARCH,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PICTUREBOOK,
                        CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PicturebookImageUpdateResponse.class);
    }

    /**
     * plant
     * 
     * @param request 入参结构体
     * @return PlantResponse
     */
    public PlantResponse plant(PlantRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_PLANT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, PlantResponse.class);
    }

    /**
     * productImageAdd
     * 
     * @param request 入参结构体
     * @return ProductImageAddResponse
     */
    public ProductImageAddResponse productImageAdd(ProductImageAddRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PRODUCT,
                        CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ProductImageAddResponse.class);
    }

    /**
     * productImageDelete
     * 
     * @param request 入参结构体
     * @return ProductImageDeleteResponse
     */
    public ProductImageDeleteResponse productImageDelete(ProductImageDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PRODUCT,
                        CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ProductImageDeleteResponse.class);
    }

    /**
     * productImageSearch
     * 
     * @param request 入参结构体
     * @return ProductImageSearchResponse
     */
    public ProductImageSearchResponse productImageSearch(ProductImageSearchRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PRODUCT,
                        CONSTANT_SEARCH);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ProductImageSearchResponse.class);
    }

    /**
     * productImageUpdate
     * 
     * @param request 入参结构体
     * @return ProductImageUpdateResponse
     */
    public ProductImageUpdateResponse productImageUpdate(ProductImageUpdateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_PRODUCT,
                        CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, ProductImageUpdateResponse.class);
    }

    /**
     * removeMoire
     * 
     * @param request 入参结构体
     * @return RemoveMoireResponse
     */
    public RemoveMoireResponse removeMoire(RemoveMoireRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_REMOVE_MOIRE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, RemoveMoireResponse.class);
    }

    /**
     * sameImageAdd
     * 
     * @param request 入参结构体
     * @return SameImageAddResponse
     */
    public SameImageAddResponse sameImageAdd(SameImageAddRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_REALTIME_SEARCH, CONSTANT_SAME_HQ, CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SameImageAddResponse.class);
    }

    /**
     * sameImageDelete
     * 
     * @param request 入参结构体
     * @return SameImageDeleteResponse
     */
    public SameImageDeleteResponse sameImageDelete(SameImageDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_REALTIME_SEARCH, CONSTANT_SAME_HQ, CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SameImageDeleteResponse.class);
    }

    /**
     * sameImageSearch
     * 
     * @param request 入参结构体
     * @return SameImageSearchResponse
     */
    public SameImageSearchResponse sameImageSearch(SameImageSearchRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_REALTIME_SEARCH, CONSTANT_SAME_HQ, CONSTANT_SEARCH);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SameImageSearchResponse.class);
    }

    /**
     * sameImageUpdate
     * 
     * @param request 入参结构体
     * @return SameImageUpdateResponse
     */
    public SameImageUpdateResponse sameImageUpdate(SameImageUpdateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_REALTIME_SEARCH, CONSTANT_SAME_HQ, CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SameImageUpdateResponse.class);
    }

    /**
     * segment
     * 
     * @param request 入参结构体
     * @return SegmentResponse
     */
    public SegmentResponse segment(SegmentRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_SEGMENT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SegmentResponse.class);
    }

    /**
     * selfieAnime
     * 
     * @param request 入参结构体
     * @return SelfieAnimeResponse
     */
    public SelfieAnimeResponse selfieAnime(SelfieAnimeRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_SELFIE_ANIME);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SelfieAnimeResponse.class);
    }

    /**
     * similarImageAdd
     * 
     * @param request 入参结构体
     * @return SimilarImageAddResponse
     */
    public SimilarImageAddResponse similarImageAdd(SimilarImageAddRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_SIMILAR,
                        CONSTANT_ADD);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SimilarImageAddResponse.class);
    }

    /**
     * similarImageDelete
     * 
     * @param request 入参结构体
     * @return SimilarImageDeleteResponse
     */
    public SimilarImageDeleteResponse similarImageDelete(SimilarImageDeleteRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_SIMILAR,
                        CONSTANT_DELETE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SimilarImageDeleteResponse.class);
    }

    /**
     * similarImageSearch
     * 
     * @param request 入参结构体
     * @return SimilarImageSearchResponse
     */
    public SimilarImageSearchResponse similarImageSearch(SimilarImageSearchRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_SIMILAR,
                        CONSTANT_SEARCH);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SimilarImageSearchResponse.class);
    }

    /**
     * similarImageUpdate
     * 
     * @param request 入参结构体
     * @return SimilarImageUpdateResponse
     */
    public SimilarImageUpdateResponse similarImageUpdate(SimilarImageUpdateRequest request) {
        InternalRequest internalRequest =
                this.createRequest(
                        request,
                        HttpMethodName.POST,
                        CONSTANT_REST,
                        CONSTANT_2_0,
                        CONSTANT_IMAGE_CLASSIFY,
                        CONSTANT_V1,
                        CONSTANT_REALTIME_SEARCH,
                        CONSTANT_SIMILAR,
                        CONSTANT_UPDATE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, SimilarImageUpdateResponse.class);
    }

    /**
     * stretchRestore
     * 
     * @param request 入参结构体
     * @return StretchRestoreResponse
     */
    public StretchRestoreResponse stretchRestore(StretchRestoreRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_STRETCH_RESTORE);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, StretchRestoreResponse.class);
    }

    /**
     * styleTrans
     * 
     * @param request 入参结构体
     * @return StyleTransResponse
     */
    public StyleTransResponse styleTrans(StyleTransRequest request) {
        InternalRequest internalRequest = this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_PROCESS, CONSTANT_V1, CONSTANT_STYLE_TRANS);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, StyleTransResponse.class);
    }

    /**
     * vehicleDetect
     * 
     * @param request 入参结构体
     * @return VehicleDetectResponse
     */
    public VehicleDetectResponse vehicleDetect(VehicleDetectRequest request) {
        InternalRequest internalRequest =
                this.createRequest(request, HttpMethodName.POST, CONSTANT_REST, CONSTANT_2_0, CONSTANT_IMAGE_CLASSIFY, CONSTANT_V1, CONSTANT_VEHICLE_DETECT);
        RequestBodyUtils.fillPayloadAsForm(internalRequest, request, "application/x-www-form-urlencoded");
        return invokeHttpClient(internalRequest, VehicleDetectResponse.class);
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
