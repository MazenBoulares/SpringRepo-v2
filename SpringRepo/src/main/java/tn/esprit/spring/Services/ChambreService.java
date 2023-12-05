package tn.esprit.spring.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Repositories.ChambreRepository;
import tn.esprit.spring.DAO.Services.IChambreService;

import java.util.List;
import java.util.Optional;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the ChambreRepository bean into the
public class ChambreService implements IChambreService{

    ChambreRepository ChambreRepository;

    @Override
    public Chambre addChambre(Chambre b){
        return ChambreRepository.save(b);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> Chambres){
        return ChambreRepository.saveAll(Chambres);
    }

    @Override
    public Chambre updateChambre(Chambre b){
        return ChambreRepository.save(b);
    };

    @Override
    public List<Chambre> findAllChambres(){
        return ChambreRepository.findAll();
    };



    public List<Chambre> UpdateAllChambres(List<Chambre> Chambres){
        return ChambreRepository.saveAll(Chambres);
    };


    public Chambre findChambreById(long id){
        return ChambreRepository.findById(id).orElse(Chambre.builder().id(0).build());

    };

    public void deleteChambre(Chambre b){
        ChambreRepository.delete(b);
    };

//    Optional<Chambre> findChambreByID2(long id);
//

    public   void deleteChambreById(long id){
        ChambreRepository.deleteById(id);
    };



}
