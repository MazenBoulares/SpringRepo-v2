package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor



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


}
