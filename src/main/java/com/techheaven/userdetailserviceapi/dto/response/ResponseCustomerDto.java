package com.techheaven.userdetailserviceapi.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseCustomerDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String mobileNumber;

    private String email;

    private Long shippingAddressId;

    private Long billingAddressId;

    private Long userId;

}
