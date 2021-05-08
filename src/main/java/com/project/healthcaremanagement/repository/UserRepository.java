package com.project.healthcaremanagement.repository;

import com.project.healthcaremanagement.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,String>
{

}
