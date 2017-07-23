package cn.com.easystudio.api.customer.model.json.customer.individual;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"detail", "correctness"})
public class DriversLicence {
    @ApiModelProperty(value = "The customer's driver licence", required = true, example = "1234567", position = 1)
    private String detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2)
    private Optional<Correctness> correctness = Optional.empty();

    public DriversLicence() {
    }

    public DriversLicence(String detail, Correctness correctness) {
        this.detail = detail;
        this.correctness = Optional.ofNullable(correctness);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Optional<Correctness> getCorrectness() {
        return correctness;
    }

    public void setCorrectness(Optional<Correctness> correctness) {
        this.correctness = correctness;
    }
}
