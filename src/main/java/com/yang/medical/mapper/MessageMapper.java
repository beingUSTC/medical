package com.yang.medical.mapper;

import com.yang.medical.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MessageMapper {
    void add(Message message);
    List<Message> get(Integer rid);
    void delete(Integer id);
}
