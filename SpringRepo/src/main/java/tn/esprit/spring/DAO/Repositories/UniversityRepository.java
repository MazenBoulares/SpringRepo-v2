package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.University;

import java.util.List;

@Repository
public interface UniversityRepository extends JpaRepository<University,Long> {

    //1- Afficher la liste des universités qui ont des étudiants dont leurs noms contiennet la chaine de caractère en paramètre et leurs dates de naissance entre deux dates passées en paramètre


}
