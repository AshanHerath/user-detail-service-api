package com.techheaven.userdetailserviceapi.repo;


import com.techheaven.userdetailserviceapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
