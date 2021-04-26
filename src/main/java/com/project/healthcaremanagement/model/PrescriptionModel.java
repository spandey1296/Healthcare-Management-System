package com.project.healthcaremanagement.model;

import java.util.Date;
import java.util.List;

public class PrescriptionModel {

   /* i. prescriptionID: String
    ii. userId: UserModel  (problem)
    iii. date: Date
    iv. description: List <String>
    v. issuedBy: UserModel    (problem)  */

    private String prescriptionID;
    private Date date;
    private List<String> description;

}
