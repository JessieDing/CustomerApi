package cn.com.easystudio.api.customer.model.json.customer.individual;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import cn.com.easystudio.api.customer.model.enumeration.GenderType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"detail", "correctness"})
public class Gender {
    @ApiModelProperty(value = "The customer's gender", required = true, example = "FEMALE", position = 1)
    private GenderType detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2)
    private Optional<Correctness> correctness = Optional.empty();

    public Gender() {
    }

    public Gender(GenderType detail, Correctness correctness) {
        this.detail = detail;
        this.correctness = Optional.ofNullable(correctness);
    }

    public GenderType getDetail() {
        return detail;
    }

    public void setDetail(GenderType detail) {
        this.detail = detail;
    }

    public Optional<Correctness> getCorrectness() {
        return correctness;
    }

    public void setCorrectness(Optional<Correctness> correctness) {
        this.correctness = correctness;
    }
}
