
package tn.esprit.spring.DAO.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.TypeChambre;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
//    Foyer findByNomFoyer(String nom);
//
//    List<Foyer> findByCapaciteFoyerGreaterThan(int capcite);
//
//    List<Foyer> findByCapaciteFoyerLessThan(int capcite);
//
//    List<Foyer> findByCapaciteFoyerBetween(int min, int max);
//
//    Foyer findByUniversityNomUniversite(String nom);
//
//    List<Foyer> getByBlocsChambresTypec(TypeChambre typeChambre);
//
//
//    List<Foyer> findByBlocsNomBloc(String nomBloc);
//
//    // 2- Recherche du foyer par son idFoyer pour un bloc donné
//    Foyer findByIdAndBlocsNomBloc(Long id, String nomBloc);
//
//    // 3- Recherche des foyers d'un bloc ayant une capacité spécifique
//    List<Foyer> findByBlocsNomBlocAndCapaciteFoyer(String nomBloc, long capaciteFoyer);
//
//    // 4- Recherche du foyer d'un bloc spécifique dans une université donnée
//    Foyer findByBlocsNomBlocAndUniversityNomUniversite(String nomBloc, String nomUniversite);
}




