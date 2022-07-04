package com.furkansahan.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "students" )
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column( name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name ="email")
    private String email;
    @Column(name ="phonenum")
    private Long phonenum;
    @Column(name ="birthyear")
    @DateTimeFormat(pattern="yyyy-MM-dd mm-hh")
    private String birthyear;



    public Student(String firstName, String lastName, String email,Long phonenum,String birthyear) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phonenum=phonenum;
        this.birthyear=birthyear;
    }

}
