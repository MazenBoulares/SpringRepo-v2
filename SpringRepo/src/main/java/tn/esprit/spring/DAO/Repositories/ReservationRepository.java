package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Reservation;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {

    // 1- Recherche des réservations validées
//    List<Reservation> findByValidatedTrue();
//
//    // 2- Recherche des réservations par l'id de l'étudiant
//    List<Reservation> findByEtudiantsId(long etudiantId);
//
//    // 3- Recherche des réservations par année et validité
//    List<Reservation> findByAnneUniversitaireAndEstValideTrue(int year);







}
