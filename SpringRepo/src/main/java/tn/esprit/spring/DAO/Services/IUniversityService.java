package tn.esprit.spring.DAO.Services;

import tn.esprit.spring.DAO.Entities.University;
import tn.esprit.spring.DAO.Repositories.UniversityRepository;

import java.util.List;
import java.util.Optional;

public interface IUniversityService {

    University addUniversity(University b);
    List<University> addAllUniversitys(List<University> Universitys);
    University updateUniversity(University b);
    List<University> findAllUniversitys();
    University findUniversityById(long id);
    void deleteUniversity(University b);
    void deleteUniversityById(long id);
//    void deleteUniversityById(long id);
//    Optional<University>  findUniversityByID2(long id);
}
