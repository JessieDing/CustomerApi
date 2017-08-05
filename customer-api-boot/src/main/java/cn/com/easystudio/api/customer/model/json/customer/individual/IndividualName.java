package cn.com.easystudio.api.customer.model.json.customer.individual;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(value = "Individual Name")
@JsonPropertyOrder({"preferredName", "title", "firstName", "middleName", "lastName", "suffix", "standardised", "unstandardisedName", "correctness"})
public class IndividualName {
    @ApiModelProperty(value = "The name which the customer prefers to be referred as", example = "THOR", position = 1)
    private String preferredName;

    @ApiModelProperty(value = "The customer's title", example = "MS", position = 2)
    private String title;

    @ApiModelProperty(value = "The customer's given name", example = "JANE", position = 3)
    private String firstName;

    @ApiModelProperty(value = "The customer's middle name(s)", example = "NELSON", position = 4)
    private String middleName;

    @ApiModelProperty(value = "The customer's family name", example = "FOSTER", position = 5)
    private String lastName;

    @ApiModelProperty(value = "The customer's name suffix", example = "SNR", position = 6)
    private String suffix;

    @ApiModelProperty(value = "STANDARDISED", readOnly = true, example = "MS JANE NELSON FOSTER SNR", position = 7)
// value??
    private String unstandardisedName;

    @ApiModelProperty(value = "STANDARDISED_FLAG", required = true, readOnly = true, position = 8)// value??
    private Boolean standardised;

    @ApiModelProperty(value = "CORRECTNESS", position = 9)// value??
    private Optional<Correctness> correctness = Optional.empty();   // Optional<>  ?

    public IndividualName() {
    }

    public IndividualName(String firstName, String middleName, String lastName, String suffix, String title, String preferredName,
                          String unstandardisedName, Boolean standardised, Correctness correctness) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.title = title;
        this.preferredName = preferredName;
        this.unstandardisedName = unstandardisedName;
        this.standardised = standardised;
        this.correctness = Optional.ofNullable(correctness);
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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
