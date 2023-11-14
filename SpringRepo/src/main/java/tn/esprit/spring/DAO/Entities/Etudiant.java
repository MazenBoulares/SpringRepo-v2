package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor




@Entity
@Table(name="Etudiant")
public class Etudiant {

    @Id
    @Column(name="idEtudiant")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nomEt;
    private String prenomEt;

    private long cin;

    private String ecole;

    private Date datenaissance;


}
