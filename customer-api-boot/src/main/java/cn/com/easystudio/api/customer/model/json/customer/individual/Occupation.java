package cn.com.easystudio.api.customer.model.json.customer.individual;

import io.swagger.annotations.ApiModelProperty;

public class Occupation {
    @ApiModelProperty(value = "The customer's occupation", required = true, example = "22", position = 1)
    private String code;

    @ApiModelProperty(value = "The occupation's description", required = true, example = "22 Business and Information Professionals", position = 2)
    private String description;

    public Occupation() {
    }

    public Occupation(String code, String description) {
        this.code = code;
        this.description = description;
    }

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
