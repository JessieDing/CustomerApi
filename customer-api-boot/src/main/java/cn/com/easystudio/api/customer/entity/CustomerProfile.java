package cn.com.easystudio.api.customer.entity;

import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER_PROF")
public class CustomerProfile {
    @Id
    @Column(name = "cust_prof_id")
    private Long customerProfileId;

    @Column(name = "audit_details")
    private String auditDetails;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Contacts contacts;

    @Column(name = "addresses")
    private String addresses;

    @Column(name = "customer_searches")
    private String customerSearches;

    @Column(name = "category_details")
    private String categoryDetails;

    @Column(name = "product_system_links")
    private String productSystemLinks;

    @Column(name = "profile_status")
    private String profileStatus;

    @Column(name = "brand_id")
    private String brandId;

    @Column(name = "party_type")
    private String partyType;

    @Column(name = "use_count")
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

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
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
