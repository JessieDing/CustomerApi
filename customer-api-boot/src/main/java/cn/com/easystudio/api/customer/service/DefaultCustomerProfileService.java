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
        CustomerProfile customerProfile = customerProfileRepository.findOneByCustomerProfileIdAndName(1L, "Ada");
        //TODO: 实际CustomerProfile转为CustomerData
        CustomerData customerData = new CustomerData();
        Customer customer = new Customer(customerData);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
