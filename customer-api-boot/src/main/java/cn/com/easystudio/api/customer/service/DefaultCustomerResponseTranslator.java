package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.entity.CustomerProfile;
import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import cn.com.easystudio.api.customer.model.enumeration.CustomerLifecycle;
import cn.com.easystudio.api.customer.model.enumeration.CustomerType;
import cn.com.easystudio.api.customer.model.json.*;
import cn.com.easystudio.api.customer.model.json.address.Address;
import cn.com.easystudio.api.customer.model.json.address.Addresses;
import cn.com.easystudio.api.customer.model.json.contact.ContactMethods;
import cn.com.easystudio.api.customer.model.json.customer.ABN;
import cn.com.easystudio.api.customer.model.json.customer.Audit;
import cn.com.easystudio.api.customer.model.json.customer.Segment;
import cn.com.easystudio.api.customer.model.json.customer.individual.Individual;
import cn.com.easystudio.api.customer.model.json.customer.individual.IndividualName;
import cn.com.easystudio.api.customer.model.json.customer.organisation.*;
import org.joda.time.DateTime;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultCustomerResponseTranslator implements ResourceAssembler<CustomerProfile, Resource<CustomerData>> {

    public CustomerData translateProfile(CustomerProfile profile) {
        assert profile != null;
        CustomerData result = new CustomerData();

        result.setId(String.valueOf(profile.getCustomerProfileId()));

        /*
        Attributes设值
        */
        //Todo:set values for CustomerAttributes according to CustomerProfile
        CustomerAttributes customerAttributes = new CustomerAttributes();

        //ABN 设值
        ABN abn = new ABN();
        abn.setDetail("abn detail");
        abn.setCorrectness(Optional.of(Correctness.CORRECT));

        //new Address 设值
        Address address = new Address();
        address.setAddressLine1(profile.getAddresses());
        address.setSuburb("Suburb sample");
        address.setLocality("Locality sample");
        address.setTownCity("TownCity sample");
        address.setState("State sample");
        address.setPostcode("100100");
        address.setCountryCode("AU");
        address.setDpId("53094881");
        address.setCorrectness(Optional.of(Correctness.CORRECT));
        address.setStandardised(true);
        address.setForceAddress(true);
        //new Addresses 设值
        Addresses addresses = new Addresses();
        addresses.setPhysicalAddress(address);
        //假设PhysicalAddress与PostalAddress相同
        addresses.setPostalAddress(address);

        //Audit设值
        Audit audit = new Audit();
        audit.setCreatedBy("u123456");
        audit.setCreatedDateTime(DateTime.now());
        audit.setLastModifiedBy("u654321");
        audit.setLastModifiedDateTime(DateTime.now());

        //ContactMethods 设值
        ContactMethods contactMethods = new ContactMethods();
        contactMethods.setEmail("aaa@bbb.com");
        contactMethods.setFax("001-2345678");
        contactMethods.setHomePhone("123456789");
        contactMethods.setWorkPhone("001-2345678");
        contactMethods.setMobilePhone("13923456789");
        contactMethods.setPreferredContactMehod("preferredContactMehod sample");

        //Individual 设值
        Individual individual = new Individual();
        IndividualName name = new IndividualName("Chandler", "Nelson", "Green", "SNR", "MR", "Chan", "CHANDLER NELSON GREEN SNR",
                true, Correctness.CORRECT);
        individual.setName(name);

        //Organisation 设值
        Organisation organisation = new Organisation();
        ACN acn = new ACN("004085616", Correctness.CORRECT);
        organisation.setAcn(acn);
        ARBN arbn = new ARBN("123456789", Correctness.CORRECT);
        organisation.setArbn(arbn);
        CompanyType companyType = new CompanyType();
        companyType.setCode("101601");
        companyType.setDescription("a IT company");
        organisation.setCompanyType(companyType);
        OrganisationName organisationName = new OrganisationName("ROSTERING UNLIMITED PTY LTD", "ROSTERING UNLIMITED PTY !23123 LTD",
                true, Correctness.CORRECT);
        organisation.setName(organisationName);

        //ProductSystemCustomerLinks 设值
        List<ProductSystemCustomerLink> productSystemCustomerLinks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            //插入测试数据
            productSystemCustomerLinks.get(i).setBrand("PICC" + i);
            productSystemCustomerLinks.get(i).setProductSystem("NPR" + i);
            productSystemCustomerLinks.get(i).setProductSystemCustomerId("1700000015" + i);
            productSystemCustomerLinks.get(i).setJointCustomer(true);
        }

        //Segment 设值
        Segment segment = new Segment("12", "Young Establishers");

        customerAttributes.setAbn(abn);
        customerAttributes.setAddresses(addresses);
        customerAttributes.setANZSIC("ANZSIC sample");
        customerAttributes.setAudit(audit);
        customerAttributes.setBrand("PICC Brand");
        customerAttributes.setContactMethods(contactMethods);
        customerAttributes.setCustomerType(CustomerType.ORGANISATION);
        customerAttributes.setIndividual(individual);
        customerAttributes.setLifecycle(CustomerLifecycle.CUSTOMER);
        customerAttributes.setOrganisation(organisation);
        customerAttributes.setProductSystemCustomerLinks(productSystemCustomerLinks);
        customerAttributes.setSegment(segment);
        customerAttributes.setWebsite("http://customer-live.com");


        //将Attributes设给CustomerData
        result.setAttributes(customerAttributes);

        //将CustomerLinks设给CustomerData
        CustomerLinks customerLinks = new CustomerLinks();
        result.setLinks(customerLinks);

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
