package hu.yettel.homework.controller;

import hu.yettel.homework.service.CustomerService;
import hu.yettel.homework.service.dto.Customer;
import hu.yettel.homework.service.dto.external.ExternalApiResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        ExternalApiResponse<Customer> response = service.create(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json");

        return new ResponseEntity<>(response.body(), headers, response.statusCode());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Customer> update(@RequestBody Customer customer, @PathVariable("id") String id) {
        ExternalApiResponse<Customer> response = service.update(customer, id);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json");

        return new ResponseEntity<>(response.body(), headers, response.statusCode());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") String id) {
        ExternalApiResponse<String> response = service.delete(id);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json");

        return new ResponseEntity<>(response.body(), headers, response.statusCode());
    }
}
