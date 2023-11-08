package tn.esprit.spring.DAO.Entities;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name="utulisateur")
public class User {

    //id generer auto c'est IDENTITY, pas auto
    @Id
    @Column(name="Identifiant")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nom;

    private String prenom;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    private Date dateNaissance;


    //nzidha si nheb fl bd maysvilich number, typha nhebou varchar
    @Enumerated(EnumType.STRING)
    private Sexe sexe;


    @Transient
    private int age;


}
