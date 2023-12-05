package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Foyer;
import tn.esprit.spring.DAO.Services.IFoyerService;

import java.util.List;


@RestController
@RequestMapping("Foyers")
@AllArgsConstructor
public class FoyerRestController {

    IFoyerService iFoyerService;
    @GetMapping
    public List<Foyer> getAll(){
        return iFoyerService.findAllFoyers();
    }
    //@requestbody => on va passer un objet dans les parametres (json)
    // int,float, string => @ReqyestParam ou @PathVariable


    @GetMapping("/{id}")
    public Foyer getById(@PathVariable long id) {

        return iFoyerService.findFoyerById(id);
    }

    @PostMapping
    public Foyer addFoyer(@RequestBody Foyer Foyer){
        return iFoyerService.addFoyer(Foyer);
    }

    @PutMapping()
    public Foyer updateFoyer(@RequestBody Foyer Foyer){
        return iFoyerService.updateFoyer(Foyer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> updateFoyer(@PathVariable long id){
        try { iFoyerService.deleteFoyerById(id);
            return new ResponseEntity<>("Entity with ID " + id + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>("Entity with ID " + id + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting entity with ID " + id, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
