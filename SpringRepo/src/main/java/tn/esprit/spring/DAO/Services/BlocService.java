package tn.esprit.spring.DAO.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Repositories.BlocRepository;
import tn.esprit.spring.DAO.Repositories.ChambreRepository;
import tn.esprit.spring.DAO.Services.IBlocService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the BlocRepository bean into the
public class BlocService implements IBlocService{

    BlocRepository blocRepository;

    ChambreRepository chambreRepository;

    @Override
    public Bloc addBloc(Bloc b){
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs){
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b){
        return blocRepository.save(b);
    };

    @Override
    public List<Bloc> findAllBlocs(){
        return blocRepository.findAll();
    };



    public List<Bloc> UpdateAllBlocs(List<Bloc> blocs){
        return blocRepository.saveAll(blocs);
    };


    public Bloc findBlocById(long id){
        return blocRepository.findById(id).orElse(Bloc.builder().id(0).build());

    };

        public void deleteBloc(Bloc b){
         blocRepository.delete(b);
    };

//    Optional<Bloc> findBlocByID2(long id);
//

public   void deleteBlocById(long id){
    blocRepository.deleteById(id);
};





public Bloc affecterChambresABloc(List<Long> numChambre,String nomBloc){

    Bloc b= blocRepository.selectByNomBSQLK(nomBloc);
    Chambre c=new Chambre();


    // manst7a9 nbadl ken fl parent, no need to update the child


    for(Long l:numChambre){
        c=chambreRepository.findByNumeroChambre(l);

        c.setBloc(b);

        chambreRepository.save(c);


    }




return b;
}







}
