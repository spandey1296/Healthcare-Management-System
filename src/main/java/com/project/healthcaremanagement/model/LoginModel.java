package com.project.healthcaremanagement.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class LoginModel {
    private String email;
    private String password;
}
