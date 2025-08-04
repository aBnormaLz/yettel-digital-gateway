package hu.yettel.homework.controller;

import hu.yettel.homework.service.CustomerService;
import hu.yettel.homework.service.dto.Customer;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
class GraphqlController {
    private final CustomerService customerService;

    GraphqlController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @QueryMapping
    public Customer customer(@Argument String id) {
        return customerService.getCustomer(id);
    }
}
