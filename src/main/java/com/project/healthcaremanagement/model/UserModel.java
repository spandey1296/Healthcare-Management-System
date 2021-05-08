package com.project.healthcaremanagement.model;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
public class UserModel {
    @Id
    @Column(unique = true)
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private boolean active;
    private String role;


}
