package Seminar.Seminar4_;

public class StudyGroupService {
    private StudyGroup group;
    private static int id;

    public StudyGroupService(StudyGroup group) {
        this.group = group;
        // id = 3; // id начнется с 3
    }

    public void addStudent(String name, int age) {
        group.addStudent(new Student(id++, name, age));
    }
}
