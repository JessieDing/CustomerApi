package cn.com.easystudio.api.customer.model.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class Link {
    @ApiModelProperty(value = "The URI to the resource", example = "http://some-url.cn.com.picc", required = true)
    private String href;

    @ApiModelProperty(value = "Information regarding the required Content-Type")
    private LinkMeta meta;

    public Link() {
    }

    public Link(String href, String contentType) {
        this.href = href;
        this.meta = new LinkMeta(contentType);
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public LinkMeta getMeta() {
        return meta;
    }

    public void setMeta(LinkMeta meta) {
        this.meta = meta;
    }
}
