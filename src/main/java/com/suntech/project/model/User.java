package com.suntech.project.model;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Boolean isEnabled;
    private Date registerDate;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public String getRegisterDateFmt(){
        return new SimpleDateFormat("dd/MM/yyyy").format(this.registerDate);
    }
}
