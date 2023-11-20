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
@Table(name="Foyer")
public class Foyer {

    @Id
    @Column(name="idFoyer")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idFoyer;

    private String nomFoyer;

    private long capaciteFoyer;


    @OneToMany(mappedBy = "foyer")
    List<Bloc> blocsList;

    @OneToOne(mappedBy = "foyer")
    University university;



}
