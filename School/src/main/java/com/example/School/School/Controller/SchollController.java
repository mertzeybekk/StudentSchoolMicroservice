package com.example.School.School.Controller;

import com.example.School.School.Dto.FullSchoolResponse;
import com.example.School.School.Entity.Scholl;
import com.example.School.School.Service.SchollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scholl")
public class SchollController {
    private SchollService schollService;
    public SchollController(SchollService schollService){
        this.schollService = schollService;
    }
    @PostMapping("/add")
    public void schollAdd(@RequestBody Scholl scholl){
        this.schollService.schollAdd(scholl);
    }
    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllStudentsBySchoolId(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(this.schollService.findSchoolsWithStudents(schoolId));
    }
}
