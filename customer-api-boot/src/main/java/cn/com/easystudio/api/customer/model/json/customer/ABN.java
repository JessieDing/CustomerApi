package cn.com.easystudio.api.customer.model.json.customer;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ABN {
    @ApiModelProperty(value = "The Australian Business Number is a unique identifier issued by the Australian Business" +
            "... by the Australian Taxation Office", required = true, example = "85716127104", position = 1)
    private String detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2)
    private Optional<Correctness> correctness = Optional.empty();

    public ABN() {
    }

    public ABN(String detail, Correctness correctness) {
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
