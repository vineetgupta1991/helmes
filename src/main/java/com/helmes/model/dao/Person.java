package com.helmes.model.dao;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private String name;

    @OneToMany(mappedBy = "person",  cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sector> sector = new ArrayList<>();

    @Column()
    private boolean acceptedTerms;

}
