package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.entity.CustomerProfile;
import cn.com.easystudio.api.customer.model.enumeration.Correctness;
import cn.com.easystudio.api.customer.model.enumeration.CustomerLifecycle;
import cn.com.easystudio.api.customer.model.enumeration.CustomerType;
import cn.com.easystudio.api.customer.model.enumeration.GenderType;
import cn.com.easystudio.api.customer.model.json.*;
import cn.com.easystudio.api.customer.model.json.address.Address;
import cn.com.easystudio.api.customer.model.json.address.Addresses;
import cn.com.easystudio.api.customer.model.json.contact.Contact;
import cn.com.easystudio.api.customer.model.json.contact.ContactMethods;
import cn.com.easystudio.api.customer.model.json.customer.ABN;
import cn.com.easystudio.api.customer.model.json.customer.Audit;
import cn.com.easystudio.api.customer.model.json.customer.Segment;
import cn.com.easystudio.api.customer.model.json.customer.individual.*;
import cn.com.easystudio.api.customer.model.json.customer.organisation.*;
import org.joda.time.DateTime;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DefaultCustomerResponseTranslator implements ResourceAssembler<CustomerProfile, Resource<CustomerData>> {

    //SearchCustomer 需要individual
    public CustomerData translateProfile(CustomerProfile profile, cn.com.easystudio.api.customer.entity.Individual individual) {
        assert profile != null;
        CustomerData result = new CustomerData();
        result.setId(String.valueOf(profile.getCustomerProfileId()));

        CustomerAttributes customerAttributes = new CustomerAttributes();
         /*
        Attributes设值
        */
        translateABN(customerAttributes);
        translateAddresses(profile, customerAttributes);
        translateAudit(customerAttributes);
        translateContactMethods(customerAttributes, profile);
        translateIndividual(customerAttributes, individual);
        translateOrganisation(customerAttributes);
        translateProductSysCustomerLnks(customerAttributes);
        translateSegment(customerAttributes);
        customerAttributes.setANZSIC("ANZSIC sample");
        customerAttributes.setBrand("PICC Brand");
        customerAttributes.setCustomerType(CustomerType.ORGANISATION);
        customerAttributes.setLifecycle(CustomerLifecycle.CUSTOMER);
        customerAttributes.setWebsite("http://customer-live.com");

        result.setAttributes(customerAttributes);
        CustomerLinks customerLinks = new CustomerLinks();
        result.setLinks(customerLinks);
        result.setType(profile.getPartyType());
        VersionMeta versionMeta = new VersionMeta();
        result.setVersionMeta(versionMeta);

        return result;
    }

    //getCustomer 无需Individual
    public CustomerData translateProfile(CustomerProfile profile) {
        return translateProfile(profile, new cn.com.easystudio.api.customer.entity.Individual());
    }

    private void translateSegment(CustomerAttributes customerAttributes) {
        //Segment 设值
        Segment segment = new Segment("12", "Young Establishers");
        customerAttributes.setSegment(segment);
    }

    private void translateProductSysCustomerLnks(CustomerAttributes customerAttributes) {
        //ProductSystemCustomerLinks 设值
        List<ProductSystemCustomerLink> productSystemCustomerLinks = new ArrayList<>();
       /* for (int i = 0; i < 5; i++) {
            //插入测试数据
            productSystemCustomerLinks.get(i).setBrand("PICC");
            productSystemCustomerLinks.get(i).setProductSystem("NPR" );
            productSystemCustomerLinks.get(i).setProductSystemCustomerId("1700000015");
            productSystemCustomerLinks.get(i).setJointCustomer(true);
        }*/
        customerAttributes.setProductSystemCustomerLinks(productSystemCustomerLinks);
    }

    private void translateOrganisation(CustomerAttributes customerAttributes) {
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
        customerAttributes.setOrganisation(organisation);
    }

    private void translateIndividual(CustomerAttributes customerAttributes, cn.com.easystudio.api.customer.entity.Individual individualEntity) {
        //Individual 设值
        Individual individual = new Individual();
        IndividualName name = new IndividualName(individualEntity.getFirstName(), individualEntity.getMiddleName(),
                individualEntity.getLastName(), individualEntity.getSuffix(), individualEntity.getTitle(),
                individualEntity.getPreferredName(), individualEntity.getUnstandardisedName(),
                true, Correctness.CORRECT);
        individual.setName(name);

        DateOfBirth birthday = new DateOfBirth(individualEntity.getBirthday().toLocalDate(), Correctness.CORRECT);
        individual.setDateOfBirth(birthday);

        GenderType genderType = getGenderType(individualEntity.getGender());
        individual.setGender(new Gender(genderType, Correctness.CORRECT));

        Deceased deceasedStatus = getDeceasedStatus(individualEntity.getDeceased());
        individual.setDeceased(deceasedStatus);

        Occupation occuupation = new Occupation(individualEntity.getOccupation(), individualEntity.getOccupation());
        individual.setOccupation(occuupation);

        customerAttributes.setIndividual(individual);
    }

    //是否在世
    private Deceased getDeceasedStatus(Integer deceased) {
        if (deceased == 0) {
            return new Deceased(false, Correctness.CORRECT);
        } else {
            return new Deceased(true, Correctness.CORRECT);
        }
    }

    //性别0-女；1-男；2-未知
    private GenderType getGenderType(Integer gender) {
        if (gender == 0) {
            return GenderType.FEMALE;
        } else if (gender == 1) {
            return GenderType.MALE;
        } else {
            return GenderType.UNKNOWN;
        }
    }

    private void translateContactMethods(CustomerAttributes customerAttributes, CustomerProfile profile) {
        //ContactMethods 设值
        ContactMethods contactMethods = new ContactMethods();

        if (profile.getContacts() != null) {
            Contact email = new Contact();
            email.setDetail(profile.getContacts().getEmail());//?
            contactMethods.setEmail(email);

            Contact fax = new Contact();
            fax.setDetail(profile.getContacts().getFax());
            contactMethods.setFax(fax);

            Contact homephone = new Contact();
            homephone.setDetail(profile.getContacts().getHomephone());
            contactMethods.setHomePhone(homephone);
        }

        customerAttributes.setContactMethods(contactMethods);
    }

    private void translateAudit(CustomerAttributes customerAttributes) {
        //Audit设值
        Audit audit = new Audit();
        audit.setCreatedBy("u123456");
        audit.setCreatedDateTime(DateTime.now());
        audit.setLastModifiedBy("u654321");
        audit.setLastModifiedDateTime(DateTime.now());
        customerAttributes.setAudit(audit);
    }

    private void translateAddresses(CustomerProfile profile, CustomerAttributes customerAttributes) {
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
        customerAttributes.setAddresses(addresses);
    }


    private void translateABN(CustomerAttributes customerAttributes) {
        //ABN 设值
        ABN abn = new ABN();
        abn.setDetail("abn detail");
        abn.setCorrectness(Optional.of(Correctness.CORRECT));
        customerAttributes.setAbn(abn);
    }

    @Override
    public Resource<CustomerData> toResource(CustomerProfile entity) {
        return new Resource<>(translateProfile(entity));
    }
}
