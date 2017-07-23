package cn.com.easystudio.api.customer.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@ApiModel(value = "Link Meta")
public class LinkMeta {
    @JsonProperty("Content-Type")
    @ApiModelProperty(value = "The required content type to access the resource", example = "application/vnd.api+json", required = true)
    private String contentType;

    public LinkMeta() {
    }

    public LinkMeta(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
