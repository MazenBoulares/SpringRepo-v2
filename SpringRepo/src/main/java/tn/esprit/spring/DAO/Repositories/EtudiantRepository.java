package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Entities.TypeChambre;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    ;
    //select * from Etudiant where cin=...

    Etudiant findByCin(long cin);

    List<Etudiant> findByNomEtLike(String nom);

    List<Etudiant> findByNomEtContains(String nom);

    List<Etudiant> findByNomEtContaining(String nom);


}
