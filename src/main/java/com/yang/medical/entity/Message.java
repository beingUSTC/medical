package com.yang.medical.entity;

public class Message {
    private Integer Rid;
    private String Record;

    public Message(Integer rid, String record) {
        Rid = rid;
        Record = record;
    }

    public void setRid(Integer rid) {
        Rid = rid;
    }

    public void setRecord(String record) {
        Record = record;
    }

    public Integer getRid() {
        return Rid;
    }

    public String getRecord() {
        return Record;
    }
}
