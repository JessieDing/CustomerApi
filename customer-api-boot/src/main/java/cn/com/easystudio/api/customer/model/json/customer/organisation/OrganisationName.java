package cn.com.easystudio.api.customer.model.json.customer.organisation;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@ApiModel(value = "Organisation Name")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"organisationName", "unstandardisedName", "standardised", "correctness"})
public class OrganisationName {
    @ApiModelProperty(value = "The customer's name", example = "ROSTERING UNLIMITED PTY LTD", position = 1)
    private String organisationName;

    @ApiModelProperty(value = "STANDARDISED", readOnly = true, example = "ROSTERING UNLIMITED PTY !23123 LTD", position = 2)
    private String unstandardisedName;

    @ApiModelProperty(value = "STANDARDISED_FLAG", required = true, position = 3)
    private Boolean standardised;

    @ApiModelProperty(value = "CORRECTNESS", position = 4)
    private Optional<Correctness> correctness = Optional.empty();

    public OrganisationName() {
    }

    public OrganisationName(String organisationName, String unstandardisedName, Boolean standardised, Correctness correctness) {
        this.organisationName = organisationName;
        this.unstandardisedName = unstandardisedName;
        this.standardised = standardised;
        this.correctness = Optional.ofNullable(correctness);
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public String getUnstandardisedName() {
        return unstandardisedName;
    }

    public void setUnstandardisedName(String unstandardisedName) {
        this.unstandardisedName = unstandardisedName;
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

    public void setCorrectness(Optional<Correctness> correctness) {
        this.correctness = correctness;
    }
}
