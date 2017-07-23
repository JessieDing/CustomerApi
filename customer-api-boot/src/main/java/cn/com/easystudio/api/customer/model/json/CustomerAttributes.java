package cn.com.easystudio.api.customer.model.json;

import cn.com.easystudio.api.customer.entity.Addresses;
import cn.com.easystudio.api.customer.model.enumeration.Brand;
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
    private ABN abn;

    @ApiModelProperty(value = "Customer's Industry Code", position = 5)
    private String ANZSIC;

    @ApiModelProperty(value = "Customer's Marketing Segment", readOnly = true, position = 6)
    private Segment segment;

    @ApiModelProperty(value = "Customer's Website", example = "http://customer-live.com", position = 7)
    private String website;

    @ApiModelProperty(value = "Customer's individual specific information", position = 8)
    private Individual individual;

    @ApiModelProperty(value = "Customer's organisation specific information", position = 9)
    private Organisation organisation;

    @ApiModelProperty(value = "Customer's Addresses", position = 10)
    // TODO: complete Addresses
    private Addresses addresses;

    @ApiModelProperty(value = "Customer's contact methods", position = 11)
    // TODO: complete ContactMethods
    private ContactMethods contactMethods;

    @ApiModelProperty(value = "Customer's product system customer indentifiers", readOnly = true, position = 12)
    // TODO: complete ProductSystemCustomerLink
    private List<ProductSystemCustomerLink> productSystemCustomerLinks;

    @ApiModelProperty(value = "Audit details for the resource", required = true, readOnly = true, position = 13)
    // TODO: complete Audit
    private Audit audit;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand.name();
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public CustomerLifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(CustomerLifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public ABN getAbn() {
        return abn;
    }

    public void setAbn(ABN abn) {
        this.abn = abn;
    }

    public String getANZSIC() {
        return ANZSIC;
    }

    public void setANZSIC(String ANZSIC) {
        this.ANZSIC = ANZSIC;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public ContactMethods getContactMethods() {
        return contactMethods;
    }

    public void setContactMethods(ContactMethods contactMethods) {
        this.contactMethods = contactMethods;
    }

    public List<ProductSystemCustomerLink> getProductSystemCustomerLinks() {
        return productSystemCustomerLinks;
    }

    public void setProductSystemCustomerLinks(List<ProductSystemCustomerLink> productSystemCustomerLinks) {
        this.productSystemCustomerLinks = productSystemCustomerLinks;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }
}
