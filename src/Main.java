// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        int paper_per_student = paper / (studentLPavlovna + studentsASeregeevna + studentsEAndreevna);
        System.out.println(" На каждого ученика рассчитано " + paper_per_student + " листов бумаги ");
    }
    public static void task4 () {
        byte machineProductivityWihtin2Minutes = 16;
        byte difference1 = 20 / 2;
        int  machineProductivityWihtin20Minutes = machineProductivityWihtin2Minutes * difference1;
        System.out.println(" За 20 минут машина произвела " + machineProductivityWihtin20Minutes + " штук бутылок ");
        short difference2 = 1440 / 2;
        int machineProductivityDuringTheDay = machineProductivityWihtin2Minutes * difference2;
        System.out.println(" За день машина произвела " + machineProductivityDuringTheDay + " штук бутылок ");
        int difference3 = difference2 * 3;
        int machineProductivityDuringThe3Day = machineProductivityWihtin2Minutes * difference3;
        System.out.println(" За 3 дня машина произвела " + machineProductivityDuringThe3Day + " штук бутылок ");
        int difference4 = difference2 * 30;
        int machineProductivityDuringTheMonth = machineProductivityWihtin2Minutes * difference4;
        System.out.println(" За месяц машина произвела " + machineProductivityDuringTheMonth + " штук бутылок ");
    }
    public static void task5 () {
        byte CanOfPaint = 120;
        byte WhiteCanOfPaintsInOneClass = 2;
        byte BrownCanOfPaintsInOneClass = 4;
        int CanOfPaintsInOneClass = WhiteCanOfPaintsInOneClass + BrownCanOfPaintsInOneClass;
        int numberOfClasses = CanOfPaint / CanOfPaintsInOneClass;
        int WhiteCanOfPaints = numberOfClasses * WhiteCanOfPaintsInOneClass;
        int BrownCanOfPaints = numberOfClasses * BrownCanOfPaintsInOneClass;
        System.out.println(" В школе, где " + numberOfClasses + " классов, нужно " + WhiteCanOfPaints + " банок белой краски и " + BrownCanOfPaints + " банок коричневой краски ");
    }
    public static void task6 () {
        byte oneBanana = 80;
        int fiveBanana = oneBanana * 5;
        byte ml100Milk = 105;
        int ml200Milk = ml100Milk * 2;
        byte IceCreamBar = 100;
        byte oneEgg = 70;
        int fourEggs = oneEgg * 4;
        int sportbreakfast = fiveBanana + ml200Milk + IceCreamBar + fourEggs;
        double sportbreakfastKg = sportbreakfast * 0.001;
        System.out.println(" вес рецепта спортзавтрака " + sportbreakfastKg + " кг и " + sportbreakfast + " г ");
    }
    public static void task7 () {
        int NeedToReset = 7 * 1000;
        short loss250InOneDay = 250;
        int Day1 = NeedToReset / loss250InOneDay;
        System.out.println(" потребуется " + Day1 + " дней, если тратить 250 грамм в день ");
        short loss500InOneDay = 500;
        int Day2 = NeedToReset / loss500InOneDay;
        System.out.println(" потребуется " + Day2 + " дней, если тратить 500 грамм в день ");

    }
}
