package mapTasks;

import java.util.stream.IntStream;

public class StreamTask2 {
    public static void main(String[] args) {


        IntStream.range(1, 100+1).filter(n -> n % 3 == 0 && n % 5 == 0).map(n -> n * n).forEach(System.out::println);

    }

}
