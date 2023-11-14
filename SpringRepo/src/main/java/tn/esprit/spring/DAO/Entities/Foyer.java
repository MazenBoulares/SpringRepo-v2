package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name="Foyer")
public class Foyer {

    @Id
    @Column(name="idFoyer")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idFoyer;

    private String nomFoyer;

    private long capaciteFoyer;


}
