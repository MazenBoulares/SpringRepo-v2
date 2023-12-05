package tn.esprit.spring.DAO.Services;

import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Repositories.ChambreRepository;

import java.util.List;
import java.util.Optional;

public interface IChambreService {

    Chambre addChambre(Chambre b);
    List<Chambre> addAllChambres(List<Chambre> Chambres);
    Chambre updateChambre(Chambre b);
    List<Chambre> findAllChambres();
    Chambre findChambreById(long id);
    void deleteChambre(Chambre b);
    void deleteChambreById(long id);

//    Optional<Chambre>  findChambreByID2(long id);
}
