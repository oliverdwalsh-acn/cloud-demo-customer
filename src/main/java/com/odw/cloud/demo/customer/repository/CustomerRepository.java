package com.odw.cloud.demo.customer.repository;

import com.odw.cloud.demo.customer.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByCustomerId(int customerId);

}
