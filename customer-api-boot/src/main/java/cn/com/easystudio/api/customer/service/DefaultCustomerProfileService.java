package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.entity.CustomerProfile;
import cn.com.easystudio.api.customer.model.json.Customer;
import cn.com.easystudio.api.customer.model.json.CustomerData;
import cn.com.easystudio.api.customer.repository.CustomerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DefaultCustomerProfileService implements CustomerProfileService {

    @Autowired
    private CustomerProfileRepository customerProfileRepository;

    @Override
    public ResponseEntity<Customer> getCustomer(String brand, Long customerId) {
        //CustomerProfileId和BrandId与CustomerProfile一致
        CustomerProfile customerProfile = customerProfileRepository.findOneByCustomerProfileIdAndBrandId(customerId, brand);
        //TODO: 实际CustomerProfile转为CustomerData
        CustomerData customerData = new CustomerData();
        Customer customer = new Customer(customerData);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
