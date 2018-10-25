package com.codegymvn.service;

import com.codegymvn.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "dat09", "dat09@gmail.com", "bai cut"));
        customers.put(2, new Customer(1, "dat08", "dat08@gmail.com", "bai cut"));
        customers.put(3, new Customer(1, "dat07", "dat07@gmail.com", "bai cut"));
        customers.put(4, new Customer(1, "dat06", "dat06@gmail.com", "bai cut"));
        customers.put(5, new Customer(1, "dat05", "dat05@gmail.com", "bai cut"));
        customers.put(6, new Customer(1, "dat04", "dat04@gmail.com", "bai cut"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
