package fileİO;

import java.io.Serializable;

public class Turing implements Serializable {

    private String teacherName;
    private String subjectName;

    public Turing(String teacherName, String subjectName) {
        this.teacherName = teacherName;
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "Turing{" +
                "teacherName='" + teacherName + '\'' +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
