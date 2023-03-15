package Seminar.Seminar4_.comparator;

import java.util.Comparator;

import Seminar.Seminar4_.User;

public class StudentComparatorByName<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
    
}
