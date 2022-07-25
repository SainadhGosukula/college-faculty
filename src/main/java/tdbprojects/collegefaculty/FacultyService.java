package tdbprojects.collegefaculty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    @PostConstruct
    public void saveFaculty(){
        Faculty faculty1=new Faculty(1,"Mike","Hyderabad","433432345345",500000.0,"mike@gmail.com");
        Faculty faculty2=new Faculty(2,"Nike","Boston","433432350000",750000.0,"nike@gmail.com");
        List<Faculty> faculties=new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);
        facultyRepository.saveAll(faculties);
    }

    public List<Faculty> getFaculties(){
        return facultyRepository.findAll();
    }

    public Optional<Faculty> getFacultyById(long id){
        return facultyRepository.findById(id);
    }

    public Faculty saveFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    }

    public Faculty updateFaculty(Faculty faculty){
        Optional<Faculty> updateFaculty=getFacultyById(faculty.getFaculty_id());
        updateFaculty.get().setFaculty_name(faculty.getFaculty_name());
        updateFaculty.get().setFaculty_address(faculty.getFaculty_address());
        updateFaculty.get().setFaculty_phone(faculty.getFaculty_phone());
        updateFaculty.get().setFaculty_salary(faculty.getFaculty_salary());
        updateFaculty.get().setFaculty_email(faculty.getFaculty_email());
        return facultyRepository.save(updateFaculty.get());
    }
}
