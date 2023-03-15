package Seminar.Seminar3.comparator;

import java.util.Comparator;

import Seminar.Seminar3.Student;

public class StudentComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
    
}
