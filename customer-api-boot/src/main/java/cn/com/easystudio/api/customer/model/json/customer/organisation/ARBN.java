package cn.com.easystudio.api.customer.model.json.customer.organisation;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"detail", "correctness"})
public class ARBN {
    @ApiModelProperty(value = "An Australian registered Body Number is a nine digit number allocated by ASIC" +
            " when a body is registered with them other than as a company, for example, foreign companies " +
            "and registrable Australian bodies", required = true, example = "123456789", position = 1)
    private String detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2)
    private Optional<Correctness> correctness = Optional.empty();

    public ARBN() {
    }

    public ARBN(String detail, Correctness correctness) {
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
