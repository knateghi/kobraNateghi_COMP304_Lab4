package com.example.kobranateghi_comp304_lab4.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.kobranateghi_comp304_lab4.Models.Nurse;
import com.example.kobranateghi_comp304_lab4.Models.NurseRepository;
import com.example.kobranateghi_comp304_lab4.Models.Test;
import com.example.kobranateghi_comp304_lab4.Models.TestRepository;

import java.util.List;

public class TestViewModel extends AndroidViewModel {


    private TestRepository testRepository;

    //private List<Patient> allPatients;


    public TestViewModel(@NonNull Application application) {
        super(application);
        this.testRepository = new TestRepository(application);
        //     this.allPatients = patientRepository.AllPatients();
    }

    public void insert(Test test){
        testRepository.insert(test);
    }
    public void update(Test test){
        testRepository.update(test);
    }

    public void delete(Test test){
        testRepository.delete(test);
    }

    public List<Test> allTests(){
        return testRepository.AllTests();
    }

    public Test getTestById(int testId)
    {
        return testRepository.getTestById(testId);
    }

    public List<Test> getTestsByPatientId(int patientId)
    {
        return testRepository.GetTestsByPatientId(patientId);
    }
}