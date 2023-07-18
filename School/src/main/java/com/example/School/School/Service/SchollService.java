package com.example.School.School.Service;

import com.example.School.School.Dto.FullSchoolResponse;
import com.example.School.School.Entity.Scholl;

public interface SchollService {
    public void schollAdd(Scholl scholl);
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId);
}
