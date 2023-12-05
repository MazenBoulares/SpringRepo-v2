package tn.esprit.spring.DAO.Services;

import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.DAO.Repositories.EtudiantRepository;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {

    Etudiant addEtudiant(Etudiant b);
    List<Etudiant> addAllEtudiants(List<Etudiant> Etudiants);
    Etudiant updateEtudiant(Etudiant b);
    List<Etudiant> findAllEtudiants();
    Etudiant findEtudiantById(long id);
    void deleteEtudiant(Etudiant b);
    void deleteEtudiantById(long id);
//    void deleteEtudiantById(long id);
//    Optional<Etudiant>  findEtudiantByID2(long id);
}
