package com.techheaven.userdetailserviceapi.repo;


import com.techheaven.userdetailserviceapi.entity.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Long> {
}
