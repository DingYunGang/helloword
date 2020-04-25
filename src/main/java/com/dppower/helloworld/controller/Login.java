package com.dppower.helloworld.controller;

import com.dppower.helloworld.Service.CustomerService;
import com.dppower.helloworld.entity.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.dppower.helloworld.entity.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class Login {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/login")
    public Msg login(@RequestParam("firstName")String firstName,
                     @RequestParam("lastName")String lastName,
                     HttpSession session){
        List<Customer> list = customerService.findCostomer(firstName,lastName);
        if(list.size()<1){
            //登陆失败
            System.out.print("登陆失败"+firstName+"  "+lastName);
            return Msg.fail();
        }else{
            //登陆成功
            System.out.print("登陆成功: "+list.get(0).getFirstName()+" "+list.get(0).getLastName());
            session.setAttribute("loginUser",list.get(0).getFirstName());
            return Msg.success().add("rigth",list.get(0));
        }
    }
}
