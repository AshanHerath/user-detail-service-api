package com.techheaven.userdetailserviceapi.repo;


import com.techheaven.userdetailserviceapi.entity.BillingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAddressRepository extends JpaRepository<BillingAddress, Long> {
}
