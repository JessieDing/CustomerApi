package cn.com.easystudio.api.customer.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"versionMeta", "id", "type", "attributes", "links"})
@ApiModel(value = "Customer Data")
public class CustomerData {

    @ApiModelProperty(value = "Customer Resource's Version Number", required = true, readOnly = true, position = 1)
    private VersionMeta versionMeta;

    @ApiModelProperty(value = "Customer's ID", required = true, readOnly = true, example = "EXAMPLE_CUSTOMER_ID", position = 2)
    private String id;

    @ApiModelProperty(value = "Customer", required = true, readOnly = true, example = "CUSTOMER_DATA_TYPE", position = 3)
    private String type = "CUSTOMER_DATA_TYPE";

    @ApiModelProperty(value = "Customer's attributes", required = true, position = 4)
    private CustomerAttributes attributes = new CustomerAttributes();

    @ApiModelProperty(value = "Customer Related Resources", required = true, readOnly = true, position = 5)
    private CustomerLinks links;

    public VersionMeta getVersionMeta() {
        return versionMeta;
    }

    public void setVersionMeta(VersionMeta versionMeta) {
        this.versionMeta = versionMeta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomerAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CustomerAttributes attributes) {
        this.attributes = attributes;
    }

    public CustomerLinks getLinks() {
        return links;
    }

    public void setLinks(CustomerLinks links) {
        this.links = links;
    }
}
