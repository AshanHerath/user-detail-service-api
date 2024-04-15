package com.techheaven.userdetailserviceapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "mobile_number", length = 15)
    private String mobileNumber;

    @Column(name = "email", length = 100)
    private String email;

    @OneToOne(mappedBy = "customer")
    private ShippingAddress shippingAddress;

    @OneToOne(mappedBy = "customer")
    private BillingAddress billingAddress;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
