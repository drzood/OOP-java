package Seminar.Seminar4_.comparator;

import java.util.Comparator;

import Seminar.Seminar4_.User;

public class StudentComparatorByAge<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
