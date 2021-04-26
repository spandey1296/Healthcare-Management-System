package com.project.healthcaremanagement.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.sql.Time;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class BookingModel {
/*
    i. bookingId: String
    ii. patientDetail: UserModel( problem)
    iii. doctorDetail: DoctorModel (problem)
    iv. hospitalName: String
    v. date: Date
    vi. time: Date
    vii. bookingStatus: Boolean*/

   private  String bookingId;
   private String hospitalName;
   private Date date;
   private Time time;
   private boolean bookingStatus;


}
