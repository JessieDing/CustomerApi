package cn.com.easystudio.api.customer.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_CONTACT")
public class Contacts {
    @Id
    @Column(name = "cust_prof_id")
    private Long customerProfileId;

    @Embedded
    private AuditDetails auditDetails;

    private String email;
    private String emailCrInd;
    private String fax;
    private String faxCrInd;
    private String homephone;
    private String homephoneCrInd;
    private String workphone;
    private String workphoneCrInd;
    private String mobile;
    private String mobileCrInd;
    private String primContactInd;

    public Long getCustomerProfileId() {
        return customerProfileId;
    }

    public void setCustomerProfileId(Long customerProfileId) {
        this.customerProfileId = customerProfileId;
    }

    public AuditDetails getAuditDetails() {
        return auditDetails;
    }

    public void setAuditDetails(AuditDetails auditDetails) {
        this.auditDetails = auditDetails;
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
