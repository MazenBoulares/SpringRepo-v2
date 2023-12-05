package tn.esprit.spring.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Repositories.FoyerRepository;
import tn.esprit.spring.DAO.Services.IFoyerService;

import java.util.List;
import java.util.Optional;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the FoyerRepository bean into the
public class FoyerService implements IFoyerService{

    FoyerRepository FoyerRepository;

    @Override
    public Foyer addFoyer(Foyer b){
        return FoyerRepository.save(b);
    }

    @Override
    public List<Foyer> addAllFoyers(List<Foyer> Foyers){
        return FoyerRepository.saveAll(Foyers);
    }

    @Override
    public Foyer updateFoyer(Foyer b){
        return FoyerRepository.save(b);
    };

    @Override
    public List<Foyer> findAllFoyers(){
        return FoyerRepository.findAll();
    };



    public List<Foyer> UpdateAllFoyers(List<Foyer> Foyers){
        return FoyerRepository.saveAll(Foyers);
    };


    public Foyer findFoyerById(long id){
        return FoyerRepository.findById(id).orElse(Foyer.builder().idFoyer(0).build());

    };

    public void deleteFoyer(Foyer b){
        FoyerRepository.delete(b);
    };

//    Optional<Foyer> findFoyerByID2(long id);
//

    public   void deleteFoyerById(long id){
        FoyerRepository.deleteById(id);
    };



}
