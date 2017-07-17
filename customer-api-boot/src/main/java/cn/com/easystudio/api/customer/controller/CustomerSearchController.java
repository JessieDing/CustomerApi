package cn.com.easystudio.api.customer.controller;


import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/brands/{brand}")
public class CustomerSearchController {

    @RequestMapping(value = "/customers/{customerId}", method = GET)
    public String getCustomer(@PathVariable @ApiParam(value = "Brand", required = true) String brand,
                              @PathVariable @ApiParam(value = "Customer Id", required = true) Long customerId) {

        return "Test...";
    }
}
