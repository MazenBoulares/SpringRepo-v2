package tn.esprit.spring.DAO.Services;

import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Repositories.BlocRepository;

import java.util.List;
import java.util.Optional;

public interface IBlocService {

    Bloc addBloc(Bloc b);
    List<Bloc> addAllBlocs(List<Bloc> blocs);
    Bloc updateBloc(Bloc b);
    List<Bloc> findAllBlocs();
    Bloc findBlocById(long id);
    void deleteBloc(Bloc b);
    void deleteBlocById(long id);
//    void deleteBlocById(long id);
//    Optional<Bloc>  findBlocByID2(long id);


   Bloc affecterChambresABloc(List<Long> numChambre,String nomBloc);


}
