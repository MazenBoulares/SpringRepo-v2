package tn.esprit.spring.DAO.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.University;
import tn.esprit.spring.DAO.Repositories.UniversityRepository;
import tn.esprit.spring.DAO.Services.IUniversityService;

import java.util.List;
import java.util.Optional;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the UniversityRepository bean into the
public class UniversityService implements IUniversityService{

    UniversityRepository UniversityRepository;

    @Override
    public University addUniversity(University b){
        return UniversityRepository.save(b);
    }

    @Override
    public List<University> addAllUniversitys(List<University> Universitys){
        return UniversityRepository.saveAll(Universitys);
    }

    @Override
    public University updateUniversity(University b){
        return UniversityRepository.save(b);
    };

    @Override
    public List<University> findAllUniversitys(){
        return UniversityRepository.findAll();
    };



    public List<University> UpdateAllUniversitys(List<University> Universitys){
        return UniversityRepository.saveAll(Universitys);
    };


    public University findUniversityById(long id){
        return UniversityRepository.findById(id).orElse(University.builder().id(0).build());

    };

    public void deleteUniversity(University b){
        UniversityRepository.delete(b);
    };

//    Optional<University> findUniversityByID2(long id);
//

    public   void deleteUniversityById(long id){
        UniversityRepository.deleteById(id);
    };



}
