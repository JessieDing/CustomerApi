package cn.com.easystudio.api.customer.model.json.contact;

import cn.com.easystudio.api.customer.model.enumeration.ContactType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "Contact Methods")
@JsonPropertyOrder({"preferredContactMehod", "mobilePhone", "homePhone", "workPhone", "fax", "email"})
public class ContactMethods {
    @ApiModelProperty(value = "The customer's preferred method to be contacted", position = 1)
    private ContactType preferredContactMehod;

    @ApiModelProperty(value = "The customer's home phone", position = 2)
    private Contact homePhone;

    @ApiModelProperty(value = "The customer's work phone", position = 3)
    private Contact workPhone;

    @ApiModelProperty(value = "The customer's fax", position = 4)
    private Contact fax;

    @ApiModelProperty(value = "The customer's mobile phone", position = 5)
    private Contact mobilePhone;

    @ApiModelProperty(value = "The customer's email address", position = 6)
    private Contact email;

    public ContactType getPreferredContactMehod() {
        return preferredContactMehod;
    }

    public void setPreferredContactMehod(ContactType preferredContactMethod) {
        this.preferredContactMehod = preferredContactMethod;
    }

    public Contact getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(Contact homePhone) {
        this.homePhone = homePhone;
    }

    public Contact getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(Contact workPhone) {
        this.workPhone = workPhone;
    }

    public Contact getFax() {
        return fax;
    }

    public void setFax(Contact fax) {
        this.fax = fax;
    }

    public Contact getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Contact mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Contact getEmail() {
        return email;
    }

    public void setEmail(Contact email) {
        this.email = email;
    }
}
