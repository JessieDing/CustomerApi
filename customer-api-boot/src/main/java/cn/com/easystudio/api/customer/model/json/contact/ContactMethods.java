package cn.com.easystudio.api.customer.model.json.contact;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "Contact Methods")
@JsonPropertyOrder({"preferredContactMehod", "mobilePhone", "homePhone", "workPhone", "fax", "email"})
public class ContactMethods {
    @ApiModelProperty(value = "The customer's preferred method to be contacted", position = 1)
    //TODO:ContactType
    private String preferredContactMehod;

    @ApiModelProperty(value = "The customer's home phone", position = 2)
    //TODO:Contact
    private String homePhone;

    @ApiModelProperty(value = "The customer's work phone", position = 3)
    //TODO:Contact
    private String workPhone;

    @ApiModelProperty(value = "The customer's fax", position = 4)
    //TODO:Contact
    private String fax;

    @ApiModelProperty(value = "The customer's mobile phone", position = 5)
    //TODO:Contact
    private String mobilePhone;

    @ApiModelProperty(value = "The customer's email address", position = 6)
    //TODO:Contact
    private String email;

    public String getPreferredContactMehod() {
        return preferredContactMehod;
    }

    public void setPreferredContactMehod(String preferredContactMehod) {
        this.preferredContactMehod = preferredContactMehod;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
