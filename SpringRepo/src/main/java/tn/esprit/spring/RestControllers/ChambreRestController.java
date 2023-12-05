package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Chambre;
import tn.esprit.spring.DAO.Services.IChambreService;

import java.util.List;


@RestController
@RequestMapping("chambres")
@AllArgsConstructor
public class ChambreRestController {

    IChambreService iChambreService;
    @GetMapping
    public List<Chambre> getAll(){
        return iChambreService.findAllChambres();
    }
    //@requestbody => on va passer un objet dans les parametres (json)
    // int,float, string => @ReqyestParam ou @PathVariable


    @GetMapping("/{id}")
    public Chambre getById(@PathVariable long id) {

        return iChambreService.findChambreById(id);
    }

    @PostMapping
    public Chambre addChambre(@RequestBody Chambre Chambre){
        return iChambreService.addChambre(Chambre);
    }

    @PutMapping()
    public Chambre updateChambre(@RequestBody Chambre Chambre){
        return iChambreService.updateChambre(Chambre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> updateChambre(@PathVariable long id){
        try { iChambreService.deleteChambreById(id);
            return new ResponseEntity<>("Entity with ID " + id + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>("Entity with ID " + id + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting entity with ID " + id, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
