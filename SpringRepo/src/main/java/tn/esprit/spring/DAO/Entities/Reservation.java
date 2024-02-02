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
@Table(name="Reservation")
public class Reservation {

    @Id
    @Column(name="idReservation")
    String idReservation;

    private Date anneeuniversitaire;


    private boolean estvalide;

    @ManyToMany
    List<Etudiant> etudiantsList;

}
