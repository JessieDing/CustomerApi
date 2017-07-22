package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.entity.CustomerProfile;
import cn.com.easystudio.api.customer.model.json.CustomerAttributes;
import cn.com.easystudio.api.customer.model.json.CustomerData;
import cn.com.easystudio.api.customer.model.json.CustomerLinks;
import cn.com.easystudio.api.customer.model.json.VersionMeta;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;

public class DefaultCustomerResponseTranslator implements ResourceAssembler<CustomerProfile,Resource<CustomerData>> {

    public CustomerData translateProfile(CustomerProfile profile){
        assert profile !=null;
        CustomerData result = new CustomerData();

        result.setId(String.valueOf(profile.getCustomerProfileId()));

        //Todo:complete CustomerAttributes
        CustomerAttributes customerAttributes = new CustomerAttributes();
        result.setAttributes(customerAttributes);

        //Todo:complete CustomerLinks
        CustomerLinks customerLinks = new CustomerLinks();
        result.setLinks(customerLinks);

        //Todo:complete type
        result.setType(profile.getPartyType());

        VersionMeta versionMeta = new VersionMeta();
        result.setVersionMeta(versionMeta);

        return result;
    }



    @Override
    public Resource<CustomerData> toResource(CustomerProfile entity) {
        return new Resource<>(translateProfile(entity));
    }
}
