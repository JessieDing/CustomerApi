package cn.com.easystudio.api.customer.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_CONTACT")
public class Contacts {
    @Id
    @Column(name = "cust_prof_id")
    private Long customerProfileId;

    private String email;

    @Column(name = "email_cr_ind")
    private String emailCrInd;

    private String fax;

    @Column(name = "fax_cr_ind")
    private String faxCrInd;

    private String homephone;

    @Column(name = "homephone_cr_ind")
    private String homephoneCrInd;

    private String workphone;

    @Column(name = "workphone_cr_ind")
    private String workphoneCrInd;

    private String mobile;

    @Column(name = "mobile_cr_ind")
    private String mobileCrInd;

    @Column(name = "prim_contact_ind")
    private String primContactInd;

    public Long getCustomerProfileId() {
        return customerProfileId;
    }

    public void setCustomerProfileId(Long customerProfileId) {
        this.customerProfileId = customerProfileId;
    }

    public String getEmail() {
        return email.trim();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCrInd() {
        return emailCrInd;
    }

    public void setEmailCrInd(String emailCrInd) {
        this.emailCrInd = emailCrInd;
    }

    public String getFax() {
        return fax.trim();
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFaxCrInd() {
        return faxCrInd;
    }

    public void setFaxCrInd(String faxCrInd) {
        this.faxCrInd = faxCrInd;
    }

    public String getHomephone() {
        return homephone.trim();
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getHomephoneCrInd() {
        return homephoneCrInd;
    }

    public void setHomephoneCrInd(String homephoneCrInd) {
        this.homephoneCrInd = homephoneCrInd;
    }

    public String getWorkphone() {
        return workphone.trim();
    }

    public void setWorkphone(String workphone) {
        this.workphone = workphone;
    }

    public String getWorkphoneCrInd() {
        return workphoneCrInd;
    }

    public void setWorkphoneCrInd(String workphoneCrInd) {
        this.workphoneCrInd = workphoneCrInd;
    }

    public String getMobile() {
        return mobile.trim();
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCrInd() {
        return mobileCrInd;
    }

    public void setMobileCrInd(String mobileCrInd) {
        this.mobileCrInd = mobileCrInd;
    }

    public String getPrimContactInd() {
        return primContactInd;
    }

    public void setPrimContactInd(String primContactInd) {
        this.primContactInd = primContactInd;
    }
}
