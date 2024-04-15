package com.techheaven.userdetailserviceapi.repo;


import com.techheaven.userdetailserviceapi.entity.UserRoleHasUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleHasUserRepository extends JpaRepository<UserRoleHasUser, Long> {}
