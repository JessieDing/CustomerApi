package cn.com.easystudio.api.customer.model.json;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Product System Customer Link")
@JsonPropertyOrder({"productSystem", "brand", "productSystemCustomerId", "jointCustomer"})
public class ProductSystemCustomerLink {
    @ApiModelProperty(value = "Three letter product system code", example = "NPR", required = true, readOnly = true, position = 1)
    private String productSystem;

    @ApiModelProperty(value = "Three customer's brand", required = true, example = "PICC", readOnly = true, position = 2)
    private String brand;

    @ApiModelProperty(value = "Three customer's product system customer identifier", required = true, example = "1700000015", readOnly = true, position = 3)
    private String productSystemCustomerId;

    @ApiModelProperty(value = "A flag to indicate if this product system customer represents multiple customer",
            required = true, example = "false", readOnly = true, position = 4)
    private boolean jointCustomer;

    public String getProductSystem() {
        return productSystem;
    }

    public void setProductSystem(String productSystem) {
        this.productSystem = productSystem;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductSystemCustomerId() {
        return productSystemCustomerId;
    }

    public void setProductSystemCustomerId(String productSystemCustomerId) {
        this.productSystemCustomerId = productSystemCustomerId;
    }

    public boolean isJointCustomer() {
        return jointCustomer;
    }

    public void setJointCustomer(boolean jointCustomer) {
        this.jointCustomer = jointCustomer;
    }
}
