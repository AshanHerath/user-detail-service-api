package com.techheaven.userdetailserviceapi.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestCustomerDto {

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String email;

    private Long shippingAddressId;

    private Long billingAddressId;

    private Long userId;

}
