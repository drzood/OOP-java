package Seminar.Seminar4_;

import java.util.Iterator;
import java.util.List;

class StudentIterator<T extends User> implements Iterator<T> {

    private int index;
    private List<T> students;

    public StudentIterator(List<T> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return students.size() > index;
    }

    @Override
    public T next() {
        return students.get(index++);
    }
}