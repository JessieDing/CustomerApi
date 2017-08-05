package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.entity.CustomerProfile;
import cn.com.easystudio.api.customer.entity.Individual;
import cn.com.easystudio.api.customer.model.json.Customer;
import cn.com.easystudio.api.customer.model.json.CustomerData;
import cn.com.easystudio.api.customer.model.json.Customers;
import cn.com.easystudio.api.customer.repository.CustomerProfileRepository;
import cn.com.easystudio.api.customer.repository.IndividualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultCustomerProfileService implements CustomerProfileService {

    @Autowired
    private CustomerProfileRepository customerProfileRepository;

    @Autowired
    private IndividualRepository individualRepository;

    @Override
    public ResponseEntity<Customer> getCustomer(String brand, Long customerId) {
        //CustomerProfileId和BrandId与CustomerProfile一致
        CustomerProfile customerProfile = customerProfileRepository.findOneByCustomerProfileIdAndBrandId(customerId, brand);

        //实际CustomerProfile转为CustomerData
        DefaultCustomerResponseTranslator customerResponseTranslator = new DefaultCustomerResponseTranslator();
        CustomerData customerData = customerResponseTranslator.translateProfile(customerProfile);

        Customer customer = new Customer(customerData);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @Override
    //TODO: complete search method
    public ResponseEntity<Customers> searchCustomer(String brand, String firstName) {
        List<Individual> individuals = individualRepository.findAllByFirstName(firstName);
        List<CustomerProfile> customerProfiles = new ArrayList<>();
        for (Individual individual : individuals) {
            CustomerProfile customerProfile = customerProfileRepository.findOneByCustomerProfileIdAndBrandId(individual.getCustomerProfileId(), brand);
            customerProfiles.add(customerProfile);
        }

        Customers customers = new Customers();

        //实际CustomerProfile转为CustomerData
        DefaultCustomerResponseTranslator customerResponseTranslator = new DefaultCustomerResponseTranslator();
        for (CustomerProfile profile : customerProfiles) {
            Individual individual = individuals.stream().filter(i -> i.getCustomerProfileId().equals(profile.getCustomerProfileId())).findFirst().get();
            CustomerData customerData = customerResponseTranslator.translateProfile(profile, individual);
            customers.getCustomerDatas().add(customerData);
        }

        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
