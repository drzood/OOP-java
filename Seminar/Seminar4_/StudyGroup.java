package Seminar.Seminar4_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Seminar.Seminar4_.comparator.StudentComparatorByAge;
import Seminar.Seminar4_.comparator.StudentComparatorByName;

public class StudyGroup<T extends User> implements Iterable<T>{
    private List<T> students;
    private int numGroop;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(T student) {
        students.add(student);
    }

    public List<T> getStudents() {
        return students;
    }
    public void setStudents(List<T> student) {
        students = student;
    }
    public int getNumGroop() {
        return numGroop;
    }
    public void setNumGroop(int numGroop) {
        this.numGroop = numGroop;
    }

    @Override
    public Iterator<T> iterator() {
        // return new StudentIterator(students);
        return students.iterator(); // 2 вариант, более простой
    }

    public void sortByName() {
        students.sort(new StudentComparatorByName<T>());
    }
    public void sortByAge() {
        students.sort(new StudentComparatorByAge<T>());
    }
}


