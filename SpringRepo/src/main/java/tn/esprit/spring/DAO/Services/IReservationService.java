package tn.esprit.spring.DAO.Services;

import tn.esprit.spring.DAO.Entities.Reservation;
import tn.esprit.spring.DAO.Repositories.ReservationRepository;

import java.util.List;
import java.util.Optional;

public interface IReservationService {

    Reservation addReservation(Reservation b);
    List<Reservation> addAllReservations(List<Reservation> Reservations);
    Reservation updateReservation(Reservation b);
    List<Reservation> findAllReservations();
//    Reservation findReservationById(String id);
    void deleteReservation(Reservation b);
    void deleteReservationById(String id);
//    void deleteReservationById(long id);
//    Optional<Reservation>  findReservationByID2(long id);
}
