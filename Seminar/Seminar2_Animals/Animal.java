package Seminar.Seminar2_Animals;

import java.io.Serializable;

public abstract class Animal implements Speakable {
//    public abstract void speak();
    private Writable writable;

    public void save(){

        if (writable instanceof FileHandler){
            FileHandler fileHandler1 = (FileHandler) writable;
            fileHandler1.test();
        }

        if (writable != null){
            // writable.save();
        }
    }

    public void setWritable(Writable writable) {
        this.writable = writable;
    }

}