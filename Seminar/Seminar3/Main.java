package Seminar.Seminar3;

// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        StudyGroupService service = new StudyGroupService(studyGroup);

        service.addStudent("Vasia IvAnov", 15);
        service.addStudent("Maria Ma", 20);
        service.addStudent("Dash X", 14);
        service.addStudent("Ivan IvAnov", 17);
        service.addStudent("Kirill Lebe", 25);

        for(Student student : studyGroup) {
            System.out.println(student);
        }

        System.out.println();

        studyGroup.sortByName();

        for(Student student : studyGroup) {
            System.out.println(student);
        }

        System.out.println();

        studyGroup.sortByAge();

        for(Student student : studyGroup) {
            System.out.println(student);
        }
        // List<Integer> list = new ArrayList<>();

        // Iterator<Integer> iterator = list.iterator();
        // Integer integer;
        // while (iterator.hasNext()){
        //     integer = iterator.next();
        // }
        // for (Integer int: list) {
        // }

    }
}
