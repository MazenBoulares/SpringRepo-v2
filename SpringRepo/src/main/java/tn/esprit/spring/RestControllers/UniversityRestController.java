package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.University;
import tn.esprit.spring.DAO.Services.IUniversityService;

import java.util.List;


@RestController
@RequestMapping("Universitys")
@AllArgsConstructor
public class UniversityRestController {

    IUniversityService iUniversityService;
    @GetMapping
    public List<University> getAll(){
        return iUniversityService.findAllUniversitys();
    }
    //@requestbody => on va passer un objet dans les parametres (json)
    // int,float, string => @ReqyestParam ou @PathVariable


    @GetMapping("/{id}")
    public University getById(@PathVariable long id) {

        return iUniversityService.findUniversityById(id);
    }

    @PostMapping
    public University addUniversity(@RequestBody University University){
        return iUniversityService.addUniversity(University);
    }

    @PutMapping()
    public University updateUniversity(@RequestBody University University){
        return iUniversityService.updateUniversity(University);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> updateUniversity(@PathVariable long id){
        try { iUniversityService.deleteUniversityById(id);
            return new ResponseEntity<>("Entity with ID " + id + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>("Entity with ID " + id + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting entity with ID " + id, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
