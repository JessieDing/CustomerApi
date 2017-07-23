package cn.com.easystudio.api.customer.model.json.customer.organisation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"name", "companyType", "acn", "arbn"})
public class Organisation {
    @ApiModelProperty(value = "The customer's name", required = true, position = 1)
    private OrganisationName name;

    @ApiModelProperty(value = "The type of the organisation", position = 2)
    private CompanyType companyType;

    @ApiModelProperty(value = "Australian Company Number", position = 3)
    private ACN acn;

    @ApiModelProperty(value = "Australian Registered Body Number", position = 4)
    private ARBN arbn;

    public OrganisationName getName() {
        return name;
    }

    public void setName(OrganisationName name) {
        this.name = name;
    }

    public CompanyType getCompanyType() {
        return companyType;
    }

    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }

    public ACN getAcn() {
        return acn;
    }

    public void setAcn(ACN acn) {
        this.acn = acn;
    }

    public ARBN getArbn() {
        return arbn;
    }

    public void setArbn(ARBN arbn) {
        this.arbn = arbn;
    }
}
