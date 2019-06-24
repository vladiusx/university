package com.universuty.students.repository;

import com.universuty.students.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public List<Student> findStudents() {
        return students;
    }

    public Student findById(Integer id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return students.get(i);
            }
        }
        return null;
    }

    public void studentCreate(Student student) {
        Random r = new Random();
        Integer id = r.nextInt();
        student.setId(id);
        students.add(student);
    }


    public void studentUpdate(Student student) {
        for (int i = 0; i < students.size(); i++)
            if(students.get(i).getId().equals(student.getId())){
                students.get(i).setSurname(student.getSurname());
                students.get(i).setName(student.getName());
                students.get(i).setFathername(student.getFathername());
                students.get(i).setBirthday(student.getBirthday());
                students.get(i).setTelephoneNumber(student.getTelephoneNumber());
                students.get(i).setGroupId(student.getGroupId());
                return;
            }
    }

    public void studentDelete(Integer id){
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getId().equals(id)){
                students.remove(i);
                return;
            }
        }
    }

}
