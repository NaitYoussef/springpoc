package com.iristeam.rd.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "email")
    String email;
}
