package com.project.healthcaremanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
@Entity
public class PrescriptionModel {

   /* i. prescriptionID: String
    ii. userId: UserModel  (problem)
    iii. date: Date
    iv. description: List <String>
    v. issuedBy: UserModel    (problem)  */
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Integer id;
    private String prescriptionID;
    private Date date;


}
