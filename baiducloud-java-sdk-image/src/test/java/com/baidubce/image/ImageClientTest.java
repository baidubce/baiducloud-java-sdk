package com.baidubce.image;

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
import org.junit.Test;
import org.junit.Before;
import com.baidubce.BceClientConfiguration;
import com.baidubce.auth.BceApiKeyCredentials;

/**
 * API tests for ImageClient
 */
public class ImageClientTest {

    private static final String AK = "";
    private static final String SK = "";
    private static final String API_KEY = "";
    private static final String SECRET_KEY = "";
    private ImageClient imageClient;

    @Before
    public void setUp() {
        BceClientConfiguration config = new BceClientConfiguration();

        // ==== AK/SK 鉴权 ====
        // config.setCredentials(new DefaultBceCredentials(AK, SK));

        // ==== AccessToken 鉴权（API Key / Secret Key 换取 AccessToken）====
        // config.setCredentials(new BceAccessTokenCredentials(API_KEY, SECRET_KEY));

        // ==== API Key 鉴权 ====
        config.setCredentials(new BceApiKeyCredentials(API_KEY));

        imageClient = new ImageClient(config);
    }

    /**
     * advancedGeneral
     *
     */
    @Test
    public void advancedGeneralTest() {
        AdvancedGeneralRequest advancedGeneralRequest = new AdvancedGeneralRequest();
        advancedGeneralRequest.setImage("");
        advancedGeneralRequest.setUrl("");
        advancedGeneralRequest.setBaikeNum(0);
        AdvancedGeneralResponse response = imageClient.advancedGeneral(advancedGeneralRequest);
        System.out.println(response);
    }
    /**
     * aiRetouchingCreateTask
     *
     */
    @Test
    public void aiRetouchingCreateTaskTest() {
        AiRetouchingCreateTaskRequest aiRetouchingCreateTaskRequest = new AiRetouchingCreateTaskRequest();
        aiRetouchingCreateTaskRequest.setImage("");
        aiRetouchingCreateTaskRequest.setUrl("");
        aiRetouchingCreateTaskRequest.setCallbackData("");
        aiRetouchingCreateTaskRequest.setIcolorParams(null);
        aiRetouchingCreateTaskRequest.setAllHumanOptions(null);
        aiRetouchingCreateTaskRequest.setPartialHumanOptions(null);
        aiRetouchingCreateTaskRequest.setPartialTemplates(null);
        aiRetouchingCreateTaskRequest.setTransformOptions(null);
        AiRetouchingCreateTaskResponse response = imageClient.aiRetouchingCreateTask(aiRetouchingCreateTaskRequest);
        System.out.println(response);
    }
    /**
     * aiRetouchingQueryTask
     *
     */
    @Test
    public void aiRetouchingQueryTaskTest() {
        AiRetouchingQueryTaskRequest aiRetouchingQueryTaskRequest = new AiRetouchingQueryTaskRequest();
        aiRetouchingQueryTaskRequest.setTaskId("");
        AiRetouchingQueryTaskResponse response = imageClient.aiRetouchingQueryTask(aiRetouchingQueryTaskRequest);
        System.out.println(response);
    }
    /**
     * animal
     *
     */
    @Test
    public void animalTest() {
        AnimalRequest animalRequest = new AnimalRequest();
        animalRequest.setImage("");
        animalRequest.setUrl("");
        animalRequest.setTopNum(0);
        animalRequest.setBaikeNum(0);
        AnimalResponse response = imageClient.animal(animalRequest);
        System.out.println(response);
    }
    /**
     * car
     *
     */
    @Test
    public void carTest() {
        CarRequest carRequest = new CarRequest();
        carRequest.setImage("");
        carRequest.setUrl("");
        carRequest.setTopNum(0);
        carRequest.setBaikeNum(0);
        carRequest.setOutputBrand(false);
        CarResponse response = imageClient.car(carRequest);
        System.out.println(response);
    }
    /**
     * colorEnhance
     *
     */
    @Test
    public void colorEnhanceTest() {
        ColorEnhanceRequest colorEnhanceRequest = new ColorEnhanceRequest();
        colorEnhanceRequest.setImage("");
        colorEnhanceRequest.setUrl("");
        ColorEnhanceResponse response = imageClient.colorEnhance(colorEnhanceRequest);
        System.out.println(response);
    }
    /**
     * colourize
     *
     */
    @Test
    public void colourizeTest() {
        ColourizeRequest colourizeRequest = new ColourizeRequest();
        colourizeRequest.setImage("");
        colourizeRequest.setUrl("");
        ColourizeResponse response = imageClient.colourize(colourizeRequest);
        System.out.println(response);
    }
    /**
     * contrastEnhance
     *
     */
    @Test
    public void contrastEnhanceTest() {
        ContrastEnhanceRequest contrastEnhanceRequest = new ContrastEnhanceRequest();
        contrastEnhanceRequest.setImage("");
        contrastEnhanceRequest.setUrl("");
        ContrastEnhanceResponse response = imageClient.contrastEnhance(contrastEnhanceRequest);
        System.out.println(response);
    }
    /**
     * dehaze
     *
     */
    @Test
    public void dehazeTest() {
        DehazeRequest dehazeRequest = new DehazeRequest();
        dehazeRequest.setImage("");
        dehazeRequest.setUrl("");
        DehazeResponse response = imageClient.dehaze(dehazeRequest);
        System.out.println(response);
    }
    /**
     * dish
     *
     */
    @Test
    public void dishTest() {
        DishRequest dishRequest = new DishRequest();
        dishRequest.setImage("");
        dishRequest.setUrl("");
        dishRequest.setTopNum(0);
        dishRequest.setFilterThreshold(0.0f);
        dishRequest.setBaikeNum(0);
        DishResponse response = imageClient.dish(dishRequest);
        System.out.println(response);
    }
    /**
     * docRepair
     *
     */
    @Test
    public void docRepairTest() {
        DocRepairRequest docRepairRequest = new DocRepairRequest();
        docRepairRequest.setImage("");
        docRepairRequest.setUrl("");
        DocRepairResponse response = imageClient.docRepair(docRepairRequest);
        System.out.println(response);
    }
    /**
     * imageDefinitionEnhance
     *
     */
    @Test
    public void imageDefinitionEnhanceTest() {
        ImageDefinitionEnhanceRequest imageDefinitionEnhanceRequest = new ImageDefinitionEnhanceRequest();
        imageDefinitionEnhanceRequest.setImage("");
        imageDefinitionEnhanceRequest.setUrl("");
        ImageDefinitionEnhanceResponse response = imageClient.imageDefinitionEnhance(imageDefinitionEnhanceRequest);
        System.out.println(response);
    }
    /**
     * imageQualityEnhance
     *
     */
    @Test
    public void imageQualityEnhanceTest() {
        ImageQualityEnhanceRequest imageQualityEnhanceRequest = new ImageQualityEnhanceRequest();
        imageQualityEnhanceRequest.setImage("");
        imageQualityEnhanceRequest.setUrl("");
        ImageQualityEnhanceResponse response = imageClient.imageQualityEnhance(imageQualityEnhanceRequest);
        System.out.println(response);
    }
    /**
     * imageUnderstandingGetResult
     *
     */
    @Test
    public void imageUnderstandingGetResultTest() {
        ImageUnderstandingGetResultRequest imageUnderstandingGetResultRequest = new ImageUnderstandingGetResultRequest();
        imageUnderstandingGetResultRequest.setTaskId("");
        ImageUnderstandingGetResultResponse response = imageClient.imageUnderstandingGetResult(imageUnderstandingGetResultRequest);
        System.out.println(response);
    }
    /**
     * imageUnderstandingRequest
     *
     */
    @Test
    public void imageUnderstandingRequestTest() {
        ImageUnderstandingRequestRequest imageUnderstandingRequestRequest = new ImageUnderstandingRequestRequest();
        imageUnderstandingRequestRequest.setQuestion("");
        imageUnderstandingRequestRequest.setImage("");
        imageUnderstandingRequestRequest.setUrl("");
        ImageUnderstandingRequestResponse response = imageClient.imageUnderstandingRequest(imageUnderstandingRequestRequest);
        System.out.println(response);
    }
    /**
     * ingredient
     *
     */
    @Test
    public void ingredientTest() {
        IngredientRequest ingredientRequest = new IngredientRequest();
        ingredientRequest.setImage("");
        ingredientRequest.setUrl("");
        ingredientRequest.setTopNum(0);
        IngredientResponse response = imageClient.ingredient(ingredientRequest);
        System.out.println(response);
    }
    /**
     * inpainting
     *
     */
    @Test
    public void inpaintingTest() {
        InpaintingRequest inpaintingRequest = new InpaintingRequest();
        inpaintingRequest.setRectangle("");
        inpaintingRequest.setImage("");
        inpaintingRequest.setUrl("");
        InpaintingResponse response = imageClient.inpainting(inpaintingRequest);
        System.out.println(response);
    }
    /**
     * landmark
     *
     */
    @Test
    public void landmarkTest() {
        LandmarkRequest landmarkRequest = new LandmarkRequest();
        landmarkRequest.setImage("");
        landmarkRequest.setUrl("");
        LandmarkResponse response = imageClient.landmark(landmarkRequest);
        System.out.println(response);
    }
    /**
     * logo
     *
     */
    @Test
    public void logoTest() {
        LogoRequest logoRequest = new LogoRequest();
        logoRequest.setImage("");
        logoRequest.setUrl("");
        logoRequest.setCustomLib(false);
        LogoResponse response = imageClient.logo(logoRequest);
        System.out.println(response);
    }
    /**
     * logoAdd
     *
     */
    @Test
    public void logoAddTest() {
        LogoAddRequest logoAddRequest = new LogoAddRequest();
        logoAddRequest.setBrief("");
        logoAddRequest.setImage("");
        logoAddRequest.setUrl("");
        LogoAddResponse response = imageClient.logoAdd(logoAddRequest);
        System.out.println(response);
    }
    /**
     * logoDelete
     *
     */
    @Test
    public void logoDeleteTest() {
        LogoDeleteRequest logoDeleteRequest = new LogoDeleteRequest();
        logoDeleteRequest.setImage("");
        logoDeleteRequest.setContSign("");
        LogoDeleteResponse response = imageClient.logoDelete(logoDeleteRequest);
        System.out.println(response);
    }
    /**
     * materielImageAdd
     *
     */
    @Test
    public void materielImageAddTest() {
        MaterielImageAddRequest materielImageAddRequest = new MaterielImageAddRequest();
        materielImageAddRequest.setImage("");
        materielImageAddRequest.setUrl("");
        materielImageAddRequest.setBrief("");
        materielImageAddRequest.setTags("");
        MaterielImageAddResponse response = imageClient.materielImageAdd(materielImageAddRequest);
        System.out.println(response);
    }
    /**
     * materielImageDelete
     *
     */
    @Test
    public void materielImageDeleteTest() {
        MaterielImageDeleteRequest materielImageDeleteRequest = new MaterielImageDeleteRequest();
        materielImageDeleteRequest.setImage("");
        materielImageDeleteRequest.setUrl("");
        materielImageDeleteRequest.setContSign("");
        MaterielImageDeleteResponse response = imageClient.materielImageDelete(materielImageDeleteRequest);
        System.out.println(response);
    }
    /**
     * materielImageSearch
     *
     */
    @Test
    public void materielImageSearchTest() {
        MaterielImageSearchRequest materielImageSearchRequest = new MaterielImageSearchRequest();
        materielImageSearchRequest.setImage("");
        materielImageSearchRequest.setUrl("");
        materielImageSearchRequest.setTags("");
        materielImageSearchRequest.setTagLogic(0);
        materielImageSearchRequest.setPn(0);
        materielImageSearchRequest.setRn(0);
        MaterielImageSearchResponse response = imageClient.materielImageSearch(materielImageSearchRequest);
        System.out.println(response);
    }
    /**
     * materielImageUpdate
     *
     */
    @Test
    public void materielImageUpdateTest() {
        MaterielImageUpdateRequest materielImageUpdateRequest = new MaterielImageUpdateRequest();
        materielImageUpdateRequest.setImage("");
        materielImageUpdateRequest.setUrl("");
        materielImageUpdateRequest.setContSign("");
        materielImageUpdateRequest.setBrief("");
        materielImageUpdateRequest.setTags("");
        MaterielImageUpdateResponse response = imageClient.materielImageUpdate(materielImageUpdateRequest);
        System.out.println(response);
    }
    /**
     * multiObjectDetect
     *
     */
    @Test
    public void multiObjectDetectTest() {
        MultiObjectDetectRequest multiObjectDetectRequest = new MultiObjectDetectRequest();
        multiObjectDetectRequest.setImage("");
        multiObjectDetectRequest.setUrl("");
        MultiObjectDetectResponse response = imageClient.multiObjectDetect(multiObjectDetectRequest);
        System.out.println(response);
    }
    /**
     * objectDetect
     *
     */
    @Test
    public void objectDetectTest() {
        ObjectDetectRequest objectDetectRequest = new ObjectDetectRequest();
        objectDetectRequest.setImage("");
        objectDetectRequest.setWithFace(0);
        ObjectDetectResponse response = imageClient.objectDetect(objectDetectRequest);
        System.out.println(response);
    }
    /**
     * picturebookImageAdd
     *
     */
    @Test
    public void picturebookImageAddTest() {
        PicturebookImageAddRequest picturebookImageAddRequest = new PicturebookImageAddRequest();
        picturebookImageAddRequest.setImage("");
        picturebookImageAddRequest.setUrl("");
        picturebookImageAddRequest.setBrief("");
        picturebookImageAddRequest.setTags("");
        PicturebookImageAddResponse response = imageClient.picturebookImageAdd(picturebookImageAddRequest);
        System.out.println(response);
    }
    /**
     * picturebookImageDelete
     *
     */
    @Test
    public void picturebookImageDeleteTest() {
        PicturebookImageDeleteRequest picturebookImageDeleteRequest = new PicturebookImageDeleteRequest();
        picturebookImageDeleteRequest.setImage("");
        picturebookImageDeleteRequest.setUrl("");
        picturebookImageDeleteRequest.setContSign("");
        PicturebookImageDeleteResponse response = imageClient.picturebookImageDelete(picturebookImageDeleteRequest);
        System.out.println(response);
    }
    /**
     * picturebookImageSearch
     *
     */
    @Test
    public void picturebookImageSearchTest() {
        PicturebookImageSearchRequest picturebookImageSearchRequest = new PicturebookImageSearchRequest();
        picturebookImageSearchRequest.setImage("");
        picturebookImageSearchRequest.setUrl("");
        picturebookImageSearchRequest.setTags("");
        picturebookImageSearchRequest.setTagLogic(0);
        picturebookImageSearchRequest.setPn(0);
        picturebookImageSearchRequest.setRn(0);
        PicturebookImageSearchResponse response = imageClient.picturebookImageSearch(picturebookImageSearchRequest);
        System.out.println(response);
    }
    /**
     * picturebookImageUpdate
     *
     */
    @Test
    public void picturebookImageUpdateTest() {
        PicturebookImageUpdateRequest picturebookImageUpdateRequest = new PicturebookImageUpdateRequest();
        picturebookImageUpdateRequest.setImage("");
        picturebookImageUpdateRequest.setUrl("");
        picturebookImageUpdateRequest.setContSign("");
        picturebookImageUpdateRequest.setBrief("");
        picturebookImageUpdateRequest.setTags("");
        PicturebookImageUpdateResponse response = imageClient.picturebookImageUpdate(picturebookImageUpdateRequest);
        System.out.println(response);
    }
    /**
     * plant
     *
     */
    @Test
    public void plantTest() {
        PlantRequest plantRequest = new PlantRequest();
        plantRequest.setImage("");
        plantRequest.setUrl("");
        plantRequest.setBaikeNum(0);
        PlantResponse response = imageClient.plant(plantRequest);
        System.out.println(response);
    }
    /**
     * productImageAdd
     *
     */
    @Test
    public void productImageAddTest() {
        ProductImageAddRequest productImageAddRequest = new ProductImageAddRequest();
        productImageAddRequest.setBrief("");
        productImageAddRequest.setImage("");
        productImageAddRequest.setUrl("");
        productImageAddRequest.setClassId1(0);
        productImageAddRequest.setClassId2(0);
        ProductImageAddResponse response = imageClient.productImageAdd(productImageAddRequest);
        System.out.println(response);
    }
    /**
     * productImageDelete
     *
     */
    @Test
    public void productImageDeleteTest() {
        ProductImageDeleteRequest productImageDeleteRequest = new ProductImageDeleteRequest();
        productImageDeleteRequest.setImage("");
        productImageDeleteRequest.setUrl("");
        productImageDeleteRequest.setContSign("");
        ProductImageDeleteResponse response = imageClient.productImageDelete(productImageDeleteRequest);
        System.out.println(response);
    }
    /**
     * productImageSearch
     *
     */
    @Test
    public void productImageSearchTest() {
        ProductImageSearchRequest productImageSearchRequest = new ProductImageSearchRequest();
        productImageSearchRequest.setImage("");
        productImageSearchRequest.setUrl("");
        productImageSearchRequest.setClassId1(0);
        productImageSearchRequest.setClassId2(0);
        productImageSearchRequest.setTagLogic(0);
        productImageSearchRequest.setPn(0);
        productImageSearchRequest.setRn(0);
        ProductImageSearchResponse response = imageClient.productImageSearch(productImageSearchRequest);
        System.out.println(response);
    }
    /**
     * productImageUpdate
     *
     */
    @Test
    public void productImageUpdateTest() {
        ProductImageUpdateRequest productImageUpdateRequest = new ProductImageUpdateRequest();
        productImageUpdateRequest.setImage("");
        productImageUpdateRequest.setUrl("");
        productImageUpdateRequest.setContSign("");
        productImageUpdateRequest.setBrief("");
        productImageUpdateRequest.setClassId1(0);
        productImageUpdateRequest.setClassId2(0);
        ProductImageUpdateResponse response = imageClient.productImageUpdate(productImageUpdateRequest);
        System.out.println(response);
    }
    /**
     * removeMoire
     *
     */
    @Test
    public void removeMoireTest() {
        RemoveMoireRequest removeMoireRequest = new RemoveMoireRequest();
        removeMoireRequest.setImage("");
        removeMoireRequest.setUrl("");
        removeMoireRequest.setPdfFile("");
        removeMoireRequest.setPdfFileNum(0);
        RemoveMoireResponse response = imageClient.removeMoire(removeMoireRequest);
        System.out.println(response);
    }
    /**
     * sameImageAdd
     *
     */
    @Test
    public void sameImageAddTest() {
        SameImageAddRequest sameImageAddRequest = new SameImageAddRequest();
        sameImageAddRequest.setImage("");
        sameImageAddRequest.setUrl("");
        sameImageAddRequest.setBrief("");
        sameImageAddRequest.setTags("");
        SameImageAddResponse response = imageClient.sameImageAdd(sameImageAddRequest);
        System.out.println(response);
    }
    /**
     * sameImageDelete
     *
     */
    @Test
    public void sameImageDeleteTest() {
        SameImageDeleteRequest sameImageDeleteRequest = new SameImageDeleteRequest();
        sameImageDeleteRequest.setImage("");
        sameImageDeleteRequest.setUrl("");
        sameImageDeleteRequest.setContSign("");
        SameImageDeleteResponse response = imageClient.sameImageDelete(sameImageDeleteRequest);
        System.out.println(response);
    }
    /**
     * sameImageSearch
     *
     */
    @Test
    public void sameImageSearchTest() {
        SameImageSearchRequest sameImageSearchRequest = new SameImageSearchRequest();
        sameImageSearchRequest.setImage("");
        sameImageSearchRequest.setUrl("");
        sameImageSearchRequest.setTags("");
        sameImageSearchRequest.setTagLogic(0);
        sameImageSearchRequest.setPn(0);
        sameImageSearchRequest.setRn(0);
        SameImageSearchResponse response = imageClient.sameImageSearch(sameImageSearchRequest);
        System.out.println(response);
    }
    /**
     * sameImageUpdate
     *
     */
    @Test
    public void sameImageUpdateTest() {
        SameImageUpdateRequest sameImageUpdateRequest = new SameImageUpdateRequest();
        sameImageUpdateRequest.setImage("");
        sameImageUpdateRequest.setUrl("");
        sameImageUpdateRequest.setContSign("");
        sameImageUpdateRequest.setBrief("");
        sameImageUpdateRequest.setTags("");
        SameImageUpdateResponse response = imageClient.sameImageUpdate(sameImageUpdateRequest);
        System.out.println(response);
    }
    /**
     * segment
     *
     */
    @Test
    public void segmentTest() {
        SegmentRequest segmentRequest = new SegmentRequest();
        segmentRequest.setMethod("");
        segmentRequest.setImage("");
        segmentRequest.setUrl("");
        segmentRequest.setReturnForm("");
        segmentRequest.setRefineMask(false);
        segmentRequest.setPosition("");
        SegmentResponse response = imageClient.segment(segmentRequest);
        System.out.println(response);
    }
    /**
     * selfieAnime
     *
     */
    @Test
    public void selfieAnimeTest() {
        SelfieAnimeRequest selfieAnimeRequest = new SelfieAnimeRequest();
        selfieAnimeRequest.setImage("");
        selfieAnimeRequest.setUrl("");
        selfieAnimeRequest.setType("");
        selfieAnimeRequest.setMaskId("");
        SelfieAnimeResponse response = imageClient.selfieAnime(selfieAnimeRequest);
        System.out.println(response);
    }
    /**
     * similarImageAdd
     *
     */
    @Test
    public void similarImageAddTest() {
        SimilarImageAddRequest similarImageAddRequest = new SimilarImageAddRequest();
        similarImageAddRequest.setImage("");
        similarImageAddRequest.setUrl("");
        similarImageAddRequest.setBrief("");
        similarImageAddRequest.setTags("");
        SimilarImageAddResponse response = imageClient.similarImageAdd(similarImageAddRequest);
        System.out.println(response);
    }
    /**
     * similarImageDelete
     *
     */
    @Test
    public void similarImageDeleteTest() {
        SimilarImageDeleteRequest similarImageDeleteRequest = new SimilarImageDeleteRequest();
        similarImageDeleteRequest.setImage("");
        similarImageDeleteRequest.setUrl("");
        similarImageDeleteRequest.setContSign("");
        SimilarImageDeleteResponse response = imageClient.similarImageDelete(similarImageDeleteRequest);
        System.out.println(response);
    }
    /**
     * similarImageSearch
     *
     */
    @Test
    public void similarImageSearchTest() {
        SimilarImageSearchRequest similarImageSearchRequest = new SimilarImageSearchRequest();
        similarImageSearchRequest.setImage("");
        similarImageSearchRequest.setUrl("");
        similarImageSearchRequest.setTags("");
        similarImageSearchRequest.setTagLogic(0);
        similarImageSearchRequest.setPn(0);
        similarImageSearchRequest.setRn(0);
        SimilarImageSearchResponse response = imageClient.similarImageSearch(similarImageSearchRequest);
        System.out.println(response);
    }
    /**
     * similarImageUpdate
     *
     */
    @Test
    public void similarImageUpdateTest() {
        SimilarImageUpdateRequest similarImageUpdateRequest = new SimilarImageUpdateRequest();
        similarImageUpdateRequest.setImage("");
        similarImageUpdateRequest.setUrl("");
        similarImageUpdateRequest.setContSign("");
        similarImageUpdateRequest.setBrief("");
        similarImageUpdateRequest.setTags("");
        SimilarImageUpdateResponse response = imageClient.similarImageUpdate(similarImageUpdateRequest);
        System.out.println(response);
    }
    /**
     * stretchRestore
     *
     */
    @Test
    public void stretchRestoreTest() {
        StretchRestoreRequest stretchRestoreRequest = new StretchRestoreRequest();
        stretchRestoreRequest.setImage("");
        stretchRestoreRequest.setUrl("");
        StretchRestoreResponse response = imageClient.stretchRestore(stretchRestoreRequest);
        System.out.println(response);
    }
    /**
     * styleTrans
     *
     */
    @Test
    public void styleTransTest() {
        StyleTransRequest styleTransRequest = new StyleTransRequest();
        styleTransRequest.setOption("");
        styleTransRequest.setImage("");
        styleTransRequest.setUrl("");
        StyleTransResponse response = imageClient.styleTrans(styleTransRequest);
        System.out.println(response);
    }
    /**
     * vehicleDetect
     *
     */
    @Test
    public void vehicleDetectTest() {
        VehicleDetectRequest vehicleDetectRequest = new VehicleDetectRequest();
        vehicleDetectRequest.setImage("");
        vehicleDetectRequest.setUrl("");
        vehicleDetectRequest.setArea("");
        VehicleDetectResponse response = imageClient.vehicleDetect(vehicleDetectRequest);
        System.out.println(response);
    }
}
