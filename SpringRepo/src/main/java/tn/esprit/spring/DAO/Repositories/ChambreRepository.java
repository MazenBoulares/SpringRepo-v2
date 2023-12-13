package tn.esprit.spring.DAO.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Entities.TypeChambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    //1- Recherche par numéro de chambre
    Chambre findByNumeroChambre(long numChambre);

    //2- Recherche par type de chambre
    List<Chambre> findByTypeC(TypeChambre typeC);

    //3- Recherche des chambres par bloc
    List<Chambre> findByBloc(Bloc bloc);


    //4- Recherche des chambres par bloc et type de chambre
    List<Chambre> findByBlocIdAndTypeC(Long blocId, String chambreType);


    //5- Recherche des chambres par numéro de chambre et type de chambre
    List<Chambre> findByNumeroChambreAndTypeC(String numero, String chambreType);

    //6- Récupérer des chambres en filtrant par le nom de l'université associée au foyer, l'année de réservation, le nom de l'étudiant dans la réservation et le numéro de chambre
    List<Chambre> findByFoyerUniversityNomAndReservationsAnneeAndReservationsEtudiantNomEtAndNumero( String universityNom,
            int reservationAnnee,String etudiantNom, String numero
    );


}
