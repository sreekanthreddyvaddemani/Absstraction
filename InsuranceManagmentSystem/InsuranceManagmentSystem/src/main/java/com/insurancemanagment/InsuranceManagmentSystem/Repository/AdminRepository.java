package com.insurancemanagment.InsuranceManagmentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.insurancemanagment.InsuranceManagmentSystem.dto.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
