package cn.com.easystudio.api.customer.controller;


import cn.com.easystudio.api.customer.entity.Customer;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/brands/{brand}")
public class CustomerSearchController {

    private static final int SC_BAD_REQUEST = 1;
    private static final int SC_NOT_FOUND = 2;
    private static final String VERSION_HEADER = "version header";
    private static final String VERSION_DESCRIPTION = "version description";

    @RequestMapping(value = "/customers/{customerId}", method = GET)
    @ApiOperation(value = "Retrieve Customer", notes = "Supports retrieving a customer based on their brand and GCIS id" +
            "This is direct retrieval from GCIS and is not considered a search.")
    @ApiResponses({
            @ApiResponse(code = SC_BAD_REQUEST, response = Errors.class, message = "Code: 008<br />customerId is in a invalid format."),
            @ApiResponse(code = SC_NOT_FOUND, response = Errors.class, message = "Code: 003<br />No customer found with customer id.")
    })
    @ResponseHeader(name = VERSION_HEADER, description = VERSION_DESCRIPTION)
    public ResponseEntity<Customer> getCustomer(@PathVariable @ApiParam(value = "Brand", required = true) String brand,
                                                @PathVariable @ApiParam(value = "Customer Id", required = true) Long customerId) {

        Customer customer = new Customer();
        customer.setId("001");
        customer.setName("zhandsan");
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
