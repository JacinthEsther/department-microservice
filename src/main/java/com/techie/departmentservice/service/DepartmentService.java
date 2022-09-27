package com.techie.departmentservice.service;


import com.techie.departmentservice.entity.Department;
import com.techie.departmentservice.repository.DepartmentRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentService {

    private final DepartmentRepo departmentRepo;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method of DepartmentService");
        return departmentRepo.save(department);
    }


    public Department findDepartmentById(Long departmentId) {
        log.info("inside findDepartmentById method of DepartmentService");

        return departmentRepo.findByDepartmentId(departmentId);
    }
}
