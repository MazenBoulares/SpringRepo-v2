package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Services.IBlocService;

import java.util.List;


@RestController
@RequestMapping("blocs")
@AllArgsConstructor
public class BlocRestController {

    IBlocService iBlocService;
    @GetMapping
    public List<Bloc> getAll(){
        return iBlocService.findAllBlocs();
    }
    //@requestbody => on va passer un objet dans les parametres (json)
    // int,float, string => @ReqyestParam ou @PathVariable


    @GetMapping("/{id}")
    public Bloc getById(@PathVariable long id) {

        return iBlocService.findBlocById(id);
    }

    @PostMapping
    public Bloc addBloc(@RequestBody Bloc bloc){
        return iBlocService.addBloc(bloc);
    }

    @PutMapping()
    public Bloc updateBloc(@RequestBody Bloc bloc){
        return iBlocService.updateBloc(bloc);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> updateBloc(@PathVariable long id){
        try { iBlocService.deleteBlocById(id);
            return new ResponseEntity<>("Entity with ID " + id + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>("Entity with ID " + id + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting entity with ID " + id, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
