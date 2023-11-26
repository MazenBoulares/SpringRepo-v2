package tn.esprit.spring.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Repositories.EtudiantRepository;
import tn.esprit.spring.DAO.Services.IEtudiantService;

@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the BlocRepository bean into the
// blocRepository field when creating an instance of BlocService.
public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;
}
