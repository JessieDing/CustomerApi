package cn.com.easystudio.api.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_PROF")
public class CustomerProfile {
    @Id
    @Column(name = "cust_prof_id")
    private Long customerProfileId;

    private String auditDetails;

    private String contacts;

    private String addresses;

    private String customerSearches;

    private String categoryDetails;

    private String productSystemLinks;

    private String profileStatus;

    private String brandId;

    private String partyType;

    private Long useCount;

    public Long getCustomerProfileId() {
        return customerProfileId;
    }

    public void setCustomerProfileId(Long customerProfileId) {
        this.customerProfileId = customerProfileId;
    }

    public String getAuditDetails() {
        return auditDetails;
    }

    public void setAuditDetails(String auditDetails) {
        this.auditDetails = auditDetails;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public String getCustomerSearches() {
        return customerSearches;
    }

    public void setCustomerSearches(String customerSearches) {
        this.customerSearches = customerSearches;
    }

    public String getCategoryDetails() {
        return categoryDetails;
    }

    public void setCategoryDetails(String categoryDetails) {
        this.categoryDetails = categoryDetails;
    }

    public String getProductSystemLinks() {
        return productSystemLinks;
    }

    public void setProductSystemLinks(String productSystemLinks) {
        this.productSystemLinks = productSystemLinks;
    }

    public String getProfileStatus() {
        return profileStatus;
    }

    public void setProfileStatus(String profileStatus) {
        this.profileStatus = profileStatus;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public Long getUseCount() {
        return useCount;
    }

    public void setUseCount(Long useCount) {
        this.useCount = useCount;
    }
}
