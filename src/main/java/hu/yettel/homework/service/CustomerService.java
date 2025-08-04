package hu.yettel.homework.service;

import hu.yettel.homework.service.dto.Customer;
import hu.yettel.homework.service.dto.external.ExternalApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerService {
    @Value("${api.tmf.base-url}")
    private String tmfApiBaseUrl;

    private final RestTemplate restTemplate;

    public CustomerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Customer getCustomer(String id) {
        String url = tmfApiBaseUrl + "/customer/{id}";
        ResponseEntity<Customer> response = restTemplate.exchange(url, HttpMethod.GET, null, Customer.class, id);
        return response.getBody();
    }

    public ExternalApiResponse<Customer> create(Customer customer) {
        String url = tmfApiBaseUrl + "/customer";

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, "application/json");

        HttpEntity<Customer> body = new HttpEntity<>(customer, headers);

        ResponseEntity<Customer> response;
        response = restTemplate.exchange(url, HttpMethod.POST, body, Customer.class);

        return new ExternalApiResponse<>(response.getBody(), response.getStatusCode());
    }

    public ExternalApiResponse<Customer> update(Customer customer, String id) {
        String url = tmfApiBaseUrl + "/customer/{id}";

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, "application/json");

        HttpEntity<Customer> body = new HttpEntity<>(customer, headers);

        ResponseEntity<Customer> response;
        response = restTemplate.exchange(url, HttpMethod.PATCH, body, Customer.class, id);

        return new ExternalApiResponse<>(response.getBody(), response.getStatusCode());
    }

    public ExternalApiResponse<String> delete(String id) {
        String url = tmfApiBaseUrl + "/customer/{id}";

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.DELETE, null, String.class, id);

        return new ExternalApiResponse<>(response.getBody(), response.getStatusCode());
    }
}
