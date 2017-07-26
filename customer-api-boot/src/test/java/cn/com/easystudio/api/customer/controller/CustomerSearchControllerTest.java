package cn.com.easystudio.api.customer.controller;

import org.junit.Test;

public class CustomerSearchControllerTest {
    @Test
    public void shouldReturnCustomerGivenBrandAndCustomerId() throws Exception {
     /*   // Given
        String brand = "abc";
        Long customerId = 123L;

        // When
        CustomerSearchController customerSearchController = new CustomerSearchController();
        ResponseEntity<Customer> responseEntity = customerSearchController.getCustomer(brand, customerId);

        // Then
        Assert.assertEquals("001", responseEntity.getBody().getId());
        Assert.assertEquals("zhandsan", responseEntity.getBody().getName());*/
    }

    @Test
    public void shouldThrowInvalidBrandExceptionGivenWrongBrandAndCustomerIdWhenGetCustomer() throws Exception {


    }
}