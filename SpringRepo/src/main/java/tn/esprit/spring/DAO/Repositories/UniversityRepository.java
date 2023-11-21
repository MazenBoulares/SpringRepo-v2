package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.University;

public interface UniversityRepository extends JpaRepository<University,Long> {


}
