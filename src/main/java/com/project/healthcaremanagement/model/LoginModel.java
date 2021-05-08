package com.project.healthcaremanagement.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@Getter
@Setter
public class LoginModel {
    @Id
    private String email;
    private String password;
}
