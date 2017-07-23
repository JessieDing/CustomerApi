package cn.com.easystudio.api.customer.model.json.customer.organisation;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Company Type")
public class CompanyType {
    @ApiModelProperty(value = "The customer's company type", example = "101601", required = true, position = 1)
    private String code;

    @ApiModelProperty(value = "The company type's description", example = "Company", required = true, position = 1)
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
