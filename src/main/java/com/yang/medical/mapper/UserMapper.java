package com.yang.medical.mapper;

import com.yang.medical.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository

public interface UserMapper {
    User Login(String name);
}
