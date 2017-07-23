package cn.com.easystudio.api.customer.model.json.address;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"addressLine1", "addressLine2", "addressLine3", "addressLine4", "addressLine5", "Locality", "suburb",
        "townCity", "state", "postcode", "countryCode", "dpId", "standardised", "correctness"})
public class Address {
    @ApiModelProperty(value = "The first address line", required = true, example = "MAIL SERVICE 501", position = 1)
    private String addressLine1;

    @ApiModelProperty(value = "The second address line", example = "LOT 49", position = 2)
    private String addressLine2;

    @ApiModelProperty(value = "The third address line", example = "BOWERBIRD LANE", position = 3)
    private String addressLine3;

    @ApiModelProperty(value = "The fourth address line", example = "BUNYA", position = 4)
    private String addressLine4;

    @ApiModelProperty(value = "The fifth address line", example = "MOUNTAINS", position = 5)
    private String addressLine5;

    @ApiModelProperty(value = "[NZ Only] The locality of the address", example = "MOUNT WELLINGTON", position = 6)
    private String locality;

    @ApiModelProperty(value = "[Non-NZ] The address suburb", example = "AUCHENFLOWER", position = 7)
    private String suburb;

    @ApiModelProperty(value = "[NZ Only] The town or city", example = "AUCKLAND", position = 8)
    private String townCity;

    @ApiModelProperty(value = "[Non-NZ] The address state", example = "QUEENSLAND", position = 9)
    private String state;

    @ApiModelProperty(value = "The postal code", example = "4066", position = 10)
    private String postcode;

    @ApiModelProperty(value = "The two character country ISO ALPHA-2 Code where the address resides", required = true, example = "AU", position = 11)
    private String countryCode;

    @ApiModelProperty(value = "The DPID is the Australia Post, Delivery Point Identifier. This is an 8 digit number " +
            "that is unique to every address in Australia, generated by validating against Australia Post's PAF",
            readOnly = true, example = "53094881", position = 12)
    private String dpId;

    @ApiModelProperty(value = "JsonConstants.STANDARDISED_FLAG", required = true, example = "true", position = 13)
    private Boolean standardised;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 14)
    private Optional<Correctness> correctness = Optional.empty();

    @ApiModelProperty(value = "The force address indicator which indicates whether to do force address update", required = true, position = 15)
    private Boolean forceAddress;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine5() {
        return addressLine5;
    }

    public void setAddressLine5(String addressLine5) {
        this.addressLine5 = addressLine5;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getTownCity() {
        return townCity;
    }

    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public Boolean getStandardised() {
        return standardised;
    }

    public void setStandardised(Boolean standardised) {
        this.standardised = standardised;
    }

    public Optional<Correctness> getCorrectness() {
        return correctness;
    }

    public void setCorrectness(Correctness correctness) {
        this.correctness = Optional.ofNullable(correctness);
    }

    public Boolean getForceAddress() {
        return forceAddress;
    }

    public void setForceAddress(Boolean forceAddress) {
        this.forceAddress = forceAddress;
    }
}