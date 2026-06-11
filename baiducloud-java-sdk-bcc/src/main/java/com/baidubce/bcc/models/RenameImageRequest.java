package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenameImageRequest extends BaseBceRequest {

    /**
    * 自定义镜像的ID列表
    */
    private List<String> imageIds;

    /**
    * 待创建的自定义镜像名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    public List<String> getImageIds() {
        return imageIds;
    }

    public RenameImageRequest setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
        return this;
    }

    public String getName() {
        return name;
    }

    public RenameImageRequest setName(String name) {
        this.name = name;
        return this;
    }

}
