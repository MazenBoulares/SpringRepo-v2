package tn.esprit.spring.DAO.Services;

import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Repositories.FoyerRepository;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {

    Foyer addFoyer(Foyer b);
    List<Foyer> addAllFoyers(List<Foyer> Foyers);
    Foyer updateFoyer(Foyer b);
    List<Foyer> findAllFoyers();
    Foyer findFoyerById(long id);
    void deleteFoyer(Foyer b);
    void deleteFoyerById(long id);
//    void deleteFoyerById(long id);
//    Optional<Foyer>  findFoyerByID2(long id);
}
