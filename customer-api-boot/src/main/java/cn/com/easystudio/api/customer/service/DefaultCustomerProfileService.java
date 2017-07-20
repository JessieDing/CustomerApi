package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DefaultCustomerProfileService implements CustomerProfileService {
    @Override
    public ResponseEntity<Customer> getCustomer(String brand, Long customerId) {
        Customer customer = new Customer();
        customer.setId("123");
        customer.setName("abc");
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
