package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Foyer;

public interface EtudiantRepository extends JpaRepository<Foyer,Long> {


}
