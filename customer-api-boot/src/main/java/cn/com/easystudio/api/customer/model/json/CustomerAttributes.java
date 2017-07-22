package cn.com.easystudio.api.customer.model.json;

import cn.com.easystudio.api.customer.entity.Addresses;
import cn.com.easystudio.api.customer.model.enumeration.CustomerLifecycle;
import cn.com.easystudio.api.customer.model.enumeration.CustomerType;
import cn.com.easystudio.api.customer.model.json.contact.ContactMethods;
import cn.com.easystudio.api.customer.model.json.customer.ABN;
import cn.com.easystudio.api.customer.model.json.customer.Audit;
import cn.com.easystudio.api.customer.model.json.customer.Segment;
import cn.com.easystudio.api.customer.model.json.customer.individual.Individual;
import cn.com.easystudio.api.customer.model.json.customer.organisation.Organisation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "Attributes")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"brand", "customerType", "lifecycle", "abn", "anzsic", "segment", "website", "individual", "organisation",
        "addresses", "contactMethods", "productSystemCustomerLinks", "audit"})
public class CustomerAttributes {
    @ApiModelProperty(value = "Customer's Brand", required = true, example = "PICC", position = 1)
    private String brand;

    @ApiModelProperty(value = "Customer's Type", required = true, position = 2)
    private CustomerType customerType;

    @ApiModelProperty(value = "The current lifecycle of the customer.", readOnly = true, example = "CUSTOMER", position = 3)
    private CustomerLifecycle lifecycle;

    @ApiModelProperty(value = "Australian Business Number", position = 4)
    // TODO: complete ABN
    private ABN abn;

    @ApiModelProperty(value = "Customer's Industry Code", position = 5)
    private String ANZSIC;

    @ApiModelProperty(value = "Customer's Marketing Segment", readOnly = true, position = 6)
    private Segment segment;

    private String website;

    // TODO: complete Individual
    private Individual individual;

    // TODO: complete Organisation
    private Organisation organisation;

    // TODO: complete Addresses
    private Addresses addresses;

    // TODO: complete ContactMethods
    private ContactMethods contactMethods;

    // TODO: complete ProductSystemCustomerLink
    private List<ProductSystemCustomerLink> productSystemCustomerLinks;

    // TODO: complete Audit
    private Audit audit;
}
