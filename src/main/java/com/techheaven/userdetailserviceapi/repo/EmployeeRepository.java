package com.techheaven.userdetailserviceapi.repo;

import com.techheaven.userdetailserviceapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
