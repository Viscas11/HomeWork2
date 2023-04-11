// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int a = -1325693345;
        byte b = 46;
        short c = 11111;
        long d = -1234567890987L;
        float e = 2.5f;
        double g = -0.4f;
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
           System.out.println(d);
           System.out.println(e);
           System.out.println(g);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
      byte studentLPavlovna = 23;
      byte studentsASeregeevna = 27;
      byte studentsEAndreevna = 30;
      short paper = 480;
      var paper_per_student = paper / (studentLPavlovna + studentsASeregeevna + studentsEAndreevna);
        System.out.println(" На каждого ученика рассчитано " + paper_per_student + " листов бумаги ");
    }
}
