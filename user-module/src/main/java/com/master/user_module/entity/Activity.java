package com.master.user_module.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activity_increment")
    @GenericGenerator(name = "activity_increment", strategy = "increment")
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "activities")
    private Set<User> users = new HashSet<>();
}

