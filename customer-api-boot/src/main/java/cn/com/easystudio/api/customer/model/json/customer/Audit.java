package cn.com.easystudio.api.customer.model.json.customer;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

@JsonPropertyOrder({"lastModifiedBy", "lastModifiedDateTime", "createdBy", "createdDateTime"})
public class Audit {
    @ApiModelProperty(value = "The user who last modified the customer", required = true, readOnly = true,
            example = "u123456", position = 1)
    private String lastModifiedBy;

    @ApiModelProperty(value = "The time when the customer was last modified", required = true, readOnly = true,
            example = "2016-11-23T02:29:54+0000", position = 2)
    private DateTime lastModifiedDateTime;

    @ApiModelProperty(value = "The user who created the customer", required = true, readOnly = true,
            example = "u654321", position = 3)
    private String createdBy;

    @ApiModelProperty(value = "The time when the customer was created", required = true, readOnly = true,
            example = "2016-03-23T02:29:54+0000", position = 4)
    private DateTime createdDateTime;

    public Audit() {
    }

    public Audit(String lastModifiedBy, DateTime lastModifiedDateTime, String createdBy, DateTime createdDateTime) {
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.createdBy = createdBy;
        this.createdDateTime = createdDateTime;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public DateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(DateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
