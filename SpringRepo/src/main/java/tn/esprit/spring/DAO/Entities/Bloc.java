package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;

import lombok.*;

import lombok.Data;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Bloc")
public class Bloc {

    @Id
    @Column(name="idBloc")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nomBloc;


    private long capaciteBloc;

    @ManyToOne
    Foyer foyer;

    @OneToMany(mappedBy = "bloc")
    List<Chambre> chambresList;



}