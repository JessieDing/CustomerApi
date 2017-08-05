package cn.com.easystudio.api.customer.controller;


import cn.com.easystudio.api.customer.model.json.Customer;
import cn.com.easystudio.api.customer.model.json.Customers;
import cn.com.easystudio.api.customer.service.CustomerProfileService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static javax.servlet.http.HttpServletResponse.SC_BAD_REQUEST;
import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;
import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
@RequestMapping("/brands/{brand}")
public class CustomerSearchController {

    private static final String VERSION_HEADER = "version header";
    private static final String VERSION_DESCRIPTION = "version description";

    private static final String CUSTOMER_SEARCH_DESCRIPTION = "Supports searching for customers...";
    private static final String ACTIVITY_SEARCH_DESCRIPTION = "Supports retrieval of a Customer based on...";
    private static final String CLAIM_SEARCH_DESCRIPTION = "Supports retrieval of a Customer based on a claim...";
    private static final String MOTOR_RISK_SEARCH_DESCRIPTION = "Supports retrieving customer based on their vehicle...";
    private static final String PRODUCT_LINE_SEARCH_DESCRIPTION = "Supports a broader search for a product by...";
    private static final String STRICT_MATCH = "By default searching will be done as a wildcard search...";
    private static final String PRODUCT_LINE = "The customer has a product that belongs to a particular product line of...";

    @Autowired
    private CustomerProfileService service;

    @RequestMapping(value = "/customers/{customerId}", method = GET)
    @ApiOperation(value = "Retrieve Customer", notes = "Supports retrieving a customer based on their brand and DB id" +
            "This is direct retrieval from DB and is not considered a search.")
    @ApiResponses({
            @ApiResponse(code = SC_BAD_REQUEST, response = Errors.class, message = "Code: 008<br />customerId is in a invalid format."),
            @ApiResponse(code = SC_NOT_FOUND, response = Errors.class, message = "Code: 003<br />No customer found with customer id.")
    })
    @ResponseHeader(name = VERSION_HEADER, description = VERSION_DESCRIPTION)
    public ResponseEntity<Customer> getCustomer(@PathVariable @ApiParam(value = "Brand", required = true) String brand,
                                                @PathVariable @ApiParam(value = "Customer Id", required = true) Long customerId) {
        return service.getCustomer(brand, customerId);
    }

    //TODO:
    @RequestMapping(value = "/customers", method = GET)
    @ApiOperation(value = "Search Customers", notes = "Supports searching customers based on their brand and first name")
    @ApiResponses({
            @ApiResponse(code = SC_BAD_REQUEST, response = Errors.class, message = "Code: 008<br />first name is in a invalid format."),
            @ApiResponse(code = SC_NOT_FOUND, response = Errors.class, message = "Code: 003<br />No customer found with this name.")
    })
    @ResponseHeader(name = VERSION_HEADER, description = VERSION_DESCRIPTION)
    public ResponseEntity<Customers> searchCustomer(@PathVariable @ApiParam(value = "Brand", required = true) String brand,
                                                    @ApiParam(value = "First Name") @RequestParam(value = "firstName") String firstName) {
        return service.searchCustomer(brand, firstName);
    }
}
