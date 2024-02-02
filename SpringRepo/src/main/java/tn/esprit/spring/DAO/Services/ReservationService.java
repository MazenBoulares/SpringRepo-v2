package tn.esprit.spring.DAO.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.DAO.Repositories.ReservationRepository;
import tn.esprit.spring.DAO.Services.IReservationService;

import java.util.List;
import java.util.Optional;

//l ids maktoubin 3la ases String , lezem nbadl fihom
@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the ReservationRepository bean into the
public class ReservationService implements IReservationService{

    ReservationRepository ReservationRepository;

    @Override
    public Reservation addReservation(Reservation b){
        return ReservationRepository.save(b);
    }

    @Override
    public List<Reservation> addAllReservations(List<Reservation> Reservations){
        return ReservationRepository.saveAll(Reservations);
    }

    @Override
    public Reservation updateReservation(Reservation b){
        return ReservationRepository.save(b);
    };

    @Override
    public List<Reservation> findAllReservations(){
        return ReservationRepository.findAll();
    };



    public List<Reservation> UpdateAllReservations(List<Reservation> Reservations){
        return ReservationRepository.saveAll(Reservations);
    };


//    public Reservation findReservationById(String id){
//        return ReservationRepository.findById(id).orElse(Reservation.builder().idReservation(0).build());
//
//    };

    public void deleteReservation(Reservation b){
        ReservationRepository.delete(b);
    };

//    Optional<Reservation> findReservationByID2(long id);
//

    public   void deleteReservationById(String id){
        ReservationRepository.deleteById(id);
    };


//public Reservation ajouterReseervationEtAssignerACahmbreEtEtudiant(
//        Long numChambre, String cin){
//
//}




}
