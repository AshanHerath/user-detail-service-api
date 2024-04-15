package com.techheaven.userdetailserviceapi.service.impl;

import com.techheaven.userdetailserviceapi.entity.UserRole;
import com.techheaven.userdetailserviceapi.repo.UserRoleRepository;
import com.techheaven.userdetailserviceapi.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public void initializeRoles() {

        if (userRoleRepository.count()==0){
            UserRole admin = UserRole.builder().id(1).roleName("ADMIN").description("admin").userRoleHasUsers(null).build();
            UserRole customer = UserRole.builder().id(2).roleName("CUSTOMER").description("customer").userRoleHasUsers(null).build();
            UserRole manager = UserRole.builder().id(3).roleName("MANAGER").description("manager").userRoleHasUsers(null).build();
            UserRole marketingManager = UserRole.builder().id(4).roleName("MARKETING-MANAGER").description("marketing manager").userRoleHasUsers(null).build();
            UserRole accountant  = UserRole.builder().id(5).roleName("ACCOUNTANT").description("accountant").userRoleHasUsers(null).build();
            userRoleRepository.saveAll(List.of(admin, customer, manager, marketingManager, accountant));
        }

    }
}
