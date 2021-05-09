package com.project.healthcaremanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class CheckupModel {

 /*
    checkupID: String
    ii. appointmentDetail BookingModel  (problem)
    iii. prescriptionDetail PrescriptionModel   (problem)
    iv. date: Date
    v. diseases: String
    vi. report: String
    vii. issuedBy: UserModel   (problem)


*/

    @Id
    private String checkupID;

    private Date date;

    private String diseases;

    private  String report;



}
