package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name="University")
public class University {


    @Id
    @Column(name="idUniversity")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private String nomUniversite;


    private String adresse;

}
