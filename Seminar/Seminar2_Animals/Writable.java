package Seminar.Seminar2_Animals;

import java.io.Serializable;

public interface Writable {
    void save(Serializable serializable);
    Object read();
}