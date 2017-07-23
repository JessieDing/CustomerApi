package cn.com.easystudio.api.customer.model.json.customer.individual;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"name", "dateOfBirth", "gender", "deceased", "occupation", "driversLicence"})
public class Individual {
    @ApiModelProperty(value = "The customer's name", required = true, position = 1)
    private IndividualName name;

    @ApiModelProperty(value = "The date the customer was born", required = true, position = 2)
    private DateOfBirth dateOfBirth;

    @ApiModelProperty(value = "The customer's gender", position = 3)
    private Gender gender;

    @ApiModelProperty(value = "The customer's deceased state", position = 4)
    private Deceased deceased;

    @ApiModelProperty(value = "The customer's occupation", position = 5)
    private Occupation occupation;

    @ApiModelProperty(value = "The customer's driver licence", position = 6, readOnly = true)
    private DriversLicence driversLicence;

    public IndividualName getName() {
        return name;
    }

    public void setName(IndividualName name) {
        this.name = name;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Deceased getDeceased() {
        return deceased;
    }

    public void setDeceased(Deceased deceased) {
        this.deceased = deceased;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public DriversLicence getDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(DriversLicence driversLicence) {
        this.driversLicence = driversLicence;
    }
}
