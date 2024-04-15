package com.techheaven.userdetailserviceapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", length = 50)
    private String firstMame;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "join_date")
    private Date joinDate;

    @Column(name = "salary")
    private double salary;

    @Column(name = "mobile_number", length = 15)
    private String mobileNumber;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
