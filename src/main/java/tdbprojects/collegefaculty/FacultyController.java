package tdbprojects.collegefaculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @GetMapping("")
    public List<Faculty> getFaculties(){
        return facultyService.getFaculties();
    }

    @GetMapping("/{id}")
    public Optional<Faculty> getFacultyById(@PathVariable long id){
        return facultyService.getFacultyById(id);
    }

    @PostMapping("")
    public Faculty saveFaculty(@RequestBody Faculty faculty){
        return facultyService.saveFaculty(faculty);
    }

    @PutMapping("")
    public Faculty updateFaculty(@RequestBody Faculty faculty){
        return facultyService.updateFaculty(faculty);
    }
}
