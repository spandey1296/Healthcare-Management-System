package com.project.healthcaremanagement.repository;

import com.project.healthcaremanagement.model.DoctorModel;
import com.project.healthcaremanagement.model.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorModel,Integer>
{
}
