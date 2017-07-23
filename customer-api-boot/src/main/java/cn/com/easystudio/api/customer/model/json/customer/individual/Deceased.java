package cn.com.easystudio.api.customer.model.json.customer.individual;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"detail", "correctness"})
public class Deceased {
    @ApiModelProperty(value = "Indicates if the customer is deceased", required = true, example = "false", position = 1)
    private Boolean detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2)
    private Optional<Correctness> correctness = Optional.empty();

    public Deceased() {
    }

    public Deceased(Boolean detail, Correctness correctness) {
        this.detail = detail;
        this.correctness = Optional.ofNullable(correctness);
    }

    public Boolean getDetail() {
        return detail;
    }

    public void setDetail(Boolean detail) {
        this.detail = detail;
    }

    public Optional<Correctness> getCorrectness() {
        return correctness;
    }

    public void setCorrectness(Optional<Correctness> correctness) {
        this.correctness = correctness;
    }
}
