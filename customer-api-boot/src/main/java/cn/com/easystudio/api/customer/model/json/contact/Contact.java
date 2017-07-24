package cn.com.easystudio.api.customer.model.json.contact;

import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import io.swagger.annotations.ApiModelProperty;

import java.util.Optional;

public class Contact {
    @ApiModelProperty(value = "The contact detail", required = true, example = "+86-0102234567", position = 1)
    protected String detail;

    @ApiModelProperty(value = "CORRECTNESS", required = true, position = 2)
    protected Optional<Correctness> correctness = Optional.empty();

    public Contact() {
    }

    public Contact(String detail, Correctness correctness) {
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
