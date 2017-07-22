package cn.com.easystudio.api.customer.model.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Version Info Meta")
public class VersionMeta {
    @JsonProperty("ETag")
    @ApiModelProperty(value = "The current version of the resource",example = "3",readOnly = true,required = true)
    private Long eTag;

    public VersionMeta() {
    }

    public VersionMeta(Long eTag) {
        this.eTag = eTag;
    }

    public Long geteTag() {
        return eTag;
    }

    public void seteTag(Long eTag) {
        this.eTag = eTag;
    }
}
