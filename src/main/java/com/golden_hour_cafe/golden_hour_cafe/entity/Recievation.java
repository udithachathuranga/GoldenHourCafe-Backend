package com.golden_hour_cafe.golden_hour_cafe.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="recievations")
public class Recievation {
    @Id
    @Column(name = "recievation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = false, length = 50)
    private String name;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "contact_no")
    private String contactNumber;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "no_guests")
    private int numberOfGuests;
}
