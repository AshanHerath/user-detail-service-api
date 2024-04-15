package com.techheaven.userdetailserviceapi.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseBillingAddressDto {
    private Long propertyId;

    private String country;

    private String city;

    private String zip;

    private Long customerId;
}
