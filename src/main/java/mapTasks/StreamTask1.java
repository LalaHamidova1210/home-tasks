package mapTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StreamTask1 {
    public static void main(String[] args) {
        LinkedList<String> student = new LinkedList<>();
        student.add("Lala");
        student.add("Senuber");
        student.add("Tural");
        student.add("Aynur");
        student.add("Rena");
        student.add("Seyran");
        student.add("Ali");
        student.add("Ibrahim");
        student.add("Fexri");

        List<String> list =new ArrayList<>();
        student.stream().filter(String-> String.length()>5||String.startsWith("A")).forEach(list::add);

        System.out.println(list);
    }

}



