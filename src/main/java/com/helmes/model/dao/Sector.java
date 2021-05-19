package com.helmes.model.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Sector")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private String label;

    @Column()
    private String value;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
