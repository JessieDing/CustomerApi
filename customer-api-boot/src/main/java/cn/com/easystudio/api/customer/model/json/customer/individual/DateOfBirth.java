package cn.com.easystudio.api.customer.model.json.customer.individual;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Optional;

@ApiModel(value = "Date of Birth")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({"detail", "correctness"})
public class DateOfBirth {
    @ApiModelProperty(value = "The date the customer was born", required = true, example = "1987-09-13", position = 1)
    private LocalDate detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2) // value = ?
    private Optional<Correctness> correctness = Optional.empty();

    public DateOfBirth() {
    }

    public DateOfBirth(LocalDate detail, Correctness correctness) {
        this.detail = detail;
        this.correctness = Optional.ofNullable(correctness);
    }

    public LocalDate getDetail() {
        return detail;
    }

    public void setDetail(LocalDate detail) {
        this.detail = detail;
    }

    public Optional<Correctness> getCorrectness() {
        return correctness;
    }

    public void setCorrectness(Optional<Correctness> correctness) {
        this.correctness = correctness;
    }
}
