package com.insurancemanagment.InsuranceManagmentSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.insurancemanagment.InsuranceManagmentSystem.dto.PolicyBooking;
import com.insurancemanagment.InsuranceManagmentSystem.dto.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	
	@Query("select u. policyBookings from User u where u.id=?1")
	List<PolicyBooking> findPolicyBookings(int id);

	
	
	

	
}
