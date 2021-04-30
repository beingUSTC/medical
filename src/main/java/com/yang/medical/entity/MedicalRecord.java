package com.yang.medical.entity;

public class MedicalRecord {

    private Integer id;
    private String patientName;
    private String doctorName;
    private String createTime;
    private String description;
    public MedicalRecord() {
        super();
    }

    public String getPatientName() {
        return patientName;
    }

    public Integer getPatientID() {
        return id;
    }

    public void setPatientID(Integer patientID) {
        this.id = patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MedicalRecord(Integer id, String patientName, String doctorName, String createTime,
                         String medicalPicture, String description) {
        super();
        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.createTime = createTime;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}