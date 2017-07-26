/*
package cn.com.easystudio.api.customer.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AuditDetails {
    @Column(name = "USER_WRITE")
    private String lastModifiedBy;

    @Column(name = "TIMESTAMP_WRITE")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime lastModifiedDate;

    @Column(name = "USER_ENTER")
    private String createdBy;

    @Column(name = "TIMESTAMP_ENTER")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime createdDate;

    public String getLastModifiedBy() {
        return lastModifiedBy.trim();
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getCreatedBy() {
        return createdBy.trim();
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
*/
