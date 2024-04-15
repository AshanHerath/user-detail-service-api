package com.techheaven.userdetailserviceapi.repo;

import com.techheaven.userdetailserviceapi.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {}
