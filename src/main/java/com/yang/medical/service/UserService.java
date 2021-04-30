package com.yang.medical.service;

import com.yang.medical.entity.MedicalRecord;
import com.yang.medical.entity.Result;
import com.yang.medical.entity.User;
import com.yang.medical.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService {
    //病人模块：用于加密，上传病历
    @Autowired
    private UserMapper userMapper;

    public User userLogin(String name,String password){
        User user = userMapper.Login(name);
        if(password.equals(user.getPassword())){
            return user;
        }
        return null;
    }

//    public String Upload(MedicalRecord record){
//        //session认证 没有用Result返回
//        String result = record.toString();
//        return result;
//    }
//
//    //监听redis中的数据，当有数据就是有医生想看病历
//    public String[] getRecordToDoctor(String Did){
//        String[] res = new String[0];
//        return res;
//    }


}
