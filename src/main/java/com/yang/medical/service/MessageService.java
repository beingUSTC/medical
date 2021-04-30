package com.yang.medical.service;

import com.yang.medical.entity.MedicalRecord;
import com.yang.medical.entity.Message;
import com.yang.medical.entity.Result;
import com.yang.medical.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MessageService {
   @Autowired
    private MessageMapper messageMapper;

   public Result add(Integer rid,String record){//这里第二个参数应该是medicalRecord
       Result result = new Result(200);
       Message message = new Message(rid,record);
       messageMapper.add(message);
       return result;
   }

   public Result get(Integer rid){
       Result result = new Result(200);
       List<Message> message = messageMapper.get(rid);
       messageMapper.delete(rid);
       List<Map<String,Object>> data = new ArrayList<>();

       for(Message mess:message){
           Map<String,Object> map = new HashMap<>();
           map.put("Message",mess.getRecord());
           data.add(map);
       }
       if(data.size()==0){
           Map<String,Object> map = new HashMap<>();
           map.put("Message","您没有待取的病历");
           data.add(map);
       }
       result.setData(data);
       return result;
   }
}
