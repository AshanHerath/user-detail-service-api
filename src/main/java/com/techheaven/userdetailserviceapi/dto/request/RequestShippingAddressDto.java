package com.techheaven.userdetailserviceapi.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestShippingAddressDto {

    private String country;

    private String city;

    private String zip;

    private Long customerId;

}
