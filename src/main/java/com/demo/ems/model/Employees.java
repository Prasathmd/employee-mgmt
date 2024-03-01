package com.demo.ems.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {

        @GeneratedValue
        @Id
        Integer id;

        @Column(name = "first_name")
        String firstName;
        @Column(name = "last_name")
        String lastName;
        @Column(name = "email")
        String email;

}
