package tn.esprit.spring.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Etudiant;
import tn.esprit.spring.DAO.Repositories.EtudiantRepository;
import tn.esprit.spring.DAO.Services.IEtudiantService;

import java.util.List;
import java.util.Optional;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the EtudiantRepository bean into the
public class EtudiantService implements IEtudiantService{

    EtudiantRepository EtudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant b){
        return EtudiantRepository.save(b);
    }

    @Override
    public List<Etudiant> addAllEtudiants(List<Etudiant> Etudiants){
        return EtudiantRepository.saveAll(Etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant b){
        return EtudiantRepository.save(b);
    };

    @Override
    public List<Etudiant> findAllEtudiants(){
        return EtudiantRepository.findAll();
    };



    public List<Etudiant> UpdateAllEtudiants(List<Etudiant> Etudiants){
        return EtudiantRepository.saveAll(Etudiants);
    };


    public Etudiant findEtudiantById(long id){
        return EtudiantRepository.findById(id).orElse(Etudiant.builder().id(0).build());

    };

    public void deleteEtudiant(Etudiant b){
        EtudiantRepository.delete(b);
    };

//    Optional<Etudiant> findEtudiantByID2(long id);
//

    public   void deleteEtudiantById(long id){
        EtudiantRepository.deleteById(id);
    };



}
