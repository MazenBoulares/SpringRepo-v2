package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Bloc;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long> {


    Bloc fincByNomBloc(String nomBloc);
    Bloc getByNomBloc(String nomBloc);

    Bloc findByNomBlocAndCapaciteBloc(String nomBloc,long capaciteBloc);
    Bloc findByNomBlocOrCapaciteBloc(String nomBloc,long capaciteBloc);


//4- Recherche par nomBloc en ignorant la casse
    Bloc findByNomBlocIgnoreCase(String nomBloc);

//5- Recherche par capaciteBloc supérieure à une valeur donnée
    Bloc findByCapaciteBlocGreaterThan(Long capaciteBloc);

//6- Recherche par nomBloc contenant une sous-chaîne
    List<Bloc> findByNomBlocContaining(String nomBloc);

//7- Tri par nomBloc par ordre alphabétique
    List<Bloc>  findByOrderByNomBlocAsc();






//9- Recherche du bloc d'un foyer spécifique
    Bloc findByFoyerId(Long foyerId);


// 10- Recherche du bloc pour un foyer d'une université donnée

    Bloc findByFoyerUniversityIdAndFoyerId(Long universityId, Long foyerId);




}
