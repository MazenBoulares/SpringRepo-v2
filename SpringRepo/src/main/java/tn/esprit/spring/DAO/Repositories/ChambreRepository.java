package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Chambre;

public interface ChambreRepository  extends JpaRepository<Chambre,Long> {


}
