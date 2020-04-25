package com.dppower.helloworld.dao;

import org.apache.ibatis.annotations.*;
import com.dppower.helloworld.entity.*;
import java.util.List;

@Mapper
public interface CustomerMapper {

    @Select("select * from customer where first_name=#{firstName} and last_name=#{lastName}")
    List<Customer> Login(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
