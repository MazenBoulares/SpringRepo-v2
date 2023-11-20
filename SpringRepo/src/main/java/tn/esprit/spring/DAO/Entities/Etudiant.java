package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder




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

    @ManyToMany(mappedBy = "etudiantsList")
    List<Reservation> reservations;


}
