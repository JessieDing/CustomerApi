package cn.com.easystudio.api.customer.controller;

import cn.com.easystudio.api.customer.entity.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

public class CustomerSearchControllerTest {
    @Test
    public void shouldReturnCutomerGivenBrandAndCustomerId() throws Exception {
        // Given
        String brand = "abc";
        Long customerId = 123L;

        // When
        CustomerSearchController customerSearchController = new CustomerSearchController();
        ResponseEntity<Customer> responseEntity = customerSearchController.getCustomer(brand, customerId);

        // Then
        Assert.assertEquals("001", responseEntity.getBody().getId());
        Assert.assertEquals("zhandsan", responseEntity.getBody().getName());
    }
}