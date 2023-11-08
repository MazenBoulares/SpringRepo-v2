package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="Reservation")
public class Reservation {

    @Id
    @Column(name="idReservation")
    String id;

    private Date anneeuniversitaire;


    private boolean estvalide;

}
