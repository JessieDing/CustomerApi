package cn.com.easystudio.api.customer.service;

import cn.com.easystudio.api.customer.model.json.Customer;
import cn.com.easystudio.api.customer.model.json.Customers;
import org.springframework.http.ResponseEntity;

public interface CustomerProfileService {
    ResponseEntity<Customer> getCustomer(String brand, Long customerId);

    //根据firstName查询客户信息
    ResponseEntity<Customers> searchCustomer(String brand, String firstName);
}
