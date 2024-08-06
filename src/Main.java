import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task1.printThreeWords();
        Task2.checkSumSign();
        Task3.printColor();
        Task4.compareNumbers();
        boolean Task5ResultTrue = Task5.predeli(5,6);
        boolean Task5ResultFalse = Task5.predeli(5,18);
        System.out.println("Task5ResultTrue: " + Task5ResultTrue);
        System.out.println("Task5ResultFalse: " + Task5ResultFalse);
        Task6.six(-1);
        Task6.six(0);
        Task6.six(1);
        boolean Task7ResultTrue = Task7.seven(-1);
        boolean Task7ResultFalse = Task7.seven(1);
        System.out.println("Task7ResultTrue: " + Task7ResultTrue);
        System.out.println("Task7ResultFalse: " + Task7ResultFalse);
        Task8.eight("abc", 3);
        boolean Task9ResultFalse =  Task9.nine(2003);
        boolean Task9ResultTrue = Task9.nine(2004);
        System.out.println("Task9ResultFalse: " + Task9ResultFalse);
        System.out.println("Task9ResultTrue: " + Task9ResultTrue);
        Task9ResultFalse =  Task9.nine(2900);
        Task9ResultTrue = Task9.nine(2000);
        System.out.println("Task9ResultFalse: " + Task9ResultFalse);
        System.out.println("Task9ResultTrue: " + Task9ResultTrue);
        Task10.ten();
        System.out.println();
        Task11.eleven();
        System.out.println();
        Task12.twelve();
        System.out.println();
        Task13.thirteen(4);
        int [] Task14Result = Task14.fourteen(3,6);
        System.out.println("Task14Result: " + Arrays.toString(Task14Result));
        }

    }
        