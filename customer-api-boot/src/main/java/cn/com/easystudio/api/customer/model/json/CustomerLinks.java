package cn.com.easystudio.api.customer.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "Customer Links")
@JsonPropertyOrder({"self", "productV1", "consentV1", "activityV1", "identityMappingV1"})
public class CustomerLinks {
    @ApiModelProperty(value = "A link to this resource in the Customer API", required = true, readOnly = true,
            position = 1)
    private Link self;

    @ApiModelProperty(value = "A link to related product resources in the Product API", required = true, readOnly = true,
            position = 2)
    private Link productV1;

    @ApiModelProperty(value = "A link to related consent resources in the Consent API", required = true, readOnly = true,
            position = 3)
    private Link consentV1;

    @ApiModelProperty(value = "A link to related activity resource in the Customer API", required = true, readOnly = true,
            position = 4)
    private Link activityV1;

    @ApiModelProperty(value = "A link to related identity mapping resource in the Identity Mapping API", required = true,
            readOnly = true, position = 5)
    private Link identityMappingV1;

    public Link getSelf() {
        return self;
    }

    public void setSelf(Link self) {
        this.self = self;
    }

    public Link getProductV1() {
        return productV1;
    }

    public void setProductV1(Link productV1) {
        this.productV1 = productV1;
    }

    public Link getConsentV1() {
        return consentV1;
    }

    public void setConsentV1(Link consentV1) {
        this.consentV1 = consentV1;
    }

    public Link getActivityV1() {
        return activityV1;
    }

    public void setActivityV1(Link activityV1) {
        this.activityV1 = activityV1;
    }

    public Link getIdentityMappingV1() {
        return identityMappingV1;
    }

    public void setIdentityMappingV1(Link identityMappingV1) {
        this.identityMappingV1 = identityMappingV1;
    }
}
