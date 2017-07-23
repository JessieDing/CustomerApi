package cn.com.easystudio.api.customer.model.json.customer.organisation;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"detail", "correctness"})
public class ACN {
    @ApiModelProperty(value = "An Australian company number is a unique nine-digit number issued by the Australian " +
            "Securities and Investments Commission(ASIC) to every company registered under the " +
            "Commonwealth Crporations Act 2001 as an indentifier", required = true, example = "004085616", position = 1)
    private String detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2)
    private Optional<Correctness> correctness = Optional.empty();

    public ACN() {
    }

    public ACN(String detail, Correctness correctness) {
        this.detail = detail;
        this.correctness = Optional.ofNullable(correctness);
    }

    public String getDetail() {
        return detail.trim();
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
