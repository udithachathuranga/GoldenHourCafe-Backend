package com.golden_hour_cafe.golden_hour_cafe.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="reviews")
public class Review {

    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "f_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "l_name", nullable = false,length = 50)
    private String lastName;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "contact_no",nullable = false)
    private String contactNumber;

    @Column(name = "date",nullable = false)
    private Date date;

    @Column(name = "comment",nullable = false,length = 200)
    private String comment;
}
