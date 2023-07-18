package com.example.School.School.Service;

import com.example.School.School.Dto.FullSchoolResponse;
import com.example.School.School.Dto.Student;
import com.example.School.School.Entity.Scholl;
import com.example.School.School.Proxy.StudentClient;
import com.example.School.School.Repository.SchollRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchollServiceImpl implements SchollService{
    private SchollRepository schollRepository;
    private StudentClient client;
    public SchollServiceImpl(SchollRepository schollRepository,StudentClient studentClient){
        this.schollRepository = schollRepository;
        this.client = studentClient;
    }
    @Override
    public void schollAdd(Scholl scholl) {
        this.schollRepository.save(scholl);
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        Optional<Scholl> scholl = this.schollRepository.findById(schoolId);
        List<Student> students = this.client.findAllStudentsBySchool(schoolId); // Student listesi olarak al
        FullSchoolResponse fullSchoolResponse = new FullSchoolResponse();
        fullSchoolResponse.setEmail(scholl.get().getSchollName());
        fullSchoolResponse.setName(scholl.get().getSchollName());

        fullSchoolResponse.setStudents(students); // Doğrudan students listesini atama
        return fullSchoolResponse;
    }

}
