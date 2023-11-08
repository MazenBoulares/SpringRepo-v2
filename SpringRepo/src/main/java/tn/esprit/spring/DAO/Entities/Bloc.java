package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import java.sql.Date;
@Entity
@Table(name="Bloc")
public class Bloc {

    @Id
    @Column(name="idBloc")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nomlboc;


    private long capaciteBloc;




}