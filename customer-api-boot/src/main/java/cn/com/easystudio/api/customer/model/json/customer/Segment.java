package cn.com.easystudio.api.customer.model.json.customer;

import io.swagger.annotations.ApiModelProperty;

public class Segment {
    @ApiModelProperty(value = "The marketing segment for the customer", required = true, example = "12", position = 1)
    private String code;
    @ApiModelProperty(value = "The marketing segment's description", required = true, example = "Young Establishers", position = 2)
    private String description;

    public Segment() {
    }

    public Segment(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
