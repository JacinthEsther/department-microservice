package com.techie.departmentservice.repository;


import com.techie.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);
}
