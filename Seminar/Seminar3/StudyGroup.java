package Seminar.Seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Seminar.Seminar3.comparator.StudentComparatorByAge;
import Seminar.Seminar3.comparator.StudentComparatorByName;

public class StudyGroup implements Iterable<Student>{
    private List<Student> students;
    private int numGroop;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> student) {
        students = student;
    }
    public int getNumGroop() {
        return numGroop;
    }
    public void setNumGroop(int numGroop) {
        this.numGroop = numGroop;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
        // return students.iterator(); // 2 вариант, более простой
    }

    public void sortByName() {
        students.sort(new StudentComparatorByName());
    }
    public void sortByAge() {
        students.sort(new StudentComparatorByAge());
    }
}


