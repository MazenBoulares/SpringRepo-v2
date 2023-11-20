package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;


import lombok.*;

import lombok.Data;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder




@Entity
@Table(name="Chambre")
public class Chambre {

    @Id
    @Column(name="idChambre")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private long numeroChambre;


    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne
    Bloc bloc;

    @OneToMany
    List<Reservation> reservationsList;




}
