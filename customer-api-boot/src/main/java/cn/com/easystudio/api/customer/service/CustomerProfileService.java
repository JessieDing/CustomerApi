package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.entity.Customer;
import org.springframework.http.ResponseEntity;

public interface CustomerProfileService {
    ResponseEntity<Customer> getCustomer(String brand, Long customerId);
}
