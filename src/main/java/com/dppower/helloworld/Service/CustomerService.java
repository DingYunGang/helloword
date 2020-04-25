package com.dppower.helloworld.Service;

import org.springframework.beans.factory.annotation.Autowired;
import com.dppower.helloworld.entity.*;
import com.dppower.helloworld.dao.*;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    public  List <Customer> findCostomer(String firstName, String lastName){
        System.out.println("hello");
        return customerMapper.Login(firstName,lastName);
    }

}
