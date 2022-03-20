package com.example.api.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private LocalDate date;

    @Column(unique = true)
    private String email;

    public Student(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public Student(String name, LocalDate date, String email) {
        this.name = name;
        this.date = date;
        this.email = email;
    }

    public int getAge(){
        return Period.between(date, LocalDate.now()).getYears();
    }

}
