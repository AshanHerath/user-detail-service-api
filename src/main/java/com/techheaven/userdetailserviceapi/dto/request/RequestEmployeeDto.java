package com.techheaven.userdetailserviceapi.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class RequestEmployeeDto {

    private String firstName;

    private String lastName;

    private String email;

    private Date joinDate;

    private double salary;

    private String mobileNumber;

    private Long userId;

}
