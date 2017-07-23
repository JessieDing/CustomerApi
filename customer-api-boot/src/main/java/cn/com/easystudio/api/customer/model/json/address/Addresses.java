package cn.com.easystudio.api.customer.model.json.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"physicalAddress", "postalAddress"})
public class Addresses {
    @ApiModelProperty(value = "The customer's physical address(residential or business)", position = 1)
    private Address physicalAddress;

    @ApiModelProperty(value = "The customer's postal address(mailing)", position = 2)
    private Address postalAddress;

    public Address getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(Address physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public Address getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(Address postalAddress) {
        this.postalAddress = postalAddress;
    }
}
