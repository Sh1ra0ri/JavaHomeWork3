public class Main {
    public static void main(String[] args) {

        int a = 21;
        byte b = 36;
        short c = 2879;
        long d = 543534564L;
        float e = 45.335f;
        double f = 9.8543854;
        System.out.println("Значение переменной a с типом int равно " + a );
        System.out.println("Значение переменной b с типом byte равно " + b );
        System.out.println("Значение переменной c с типом short равно " + c );
        System.out.println("Значение переменной d с типом long равно " + d );
        System.out.println("Значение переменной e с типом float равно " + e );
        System.out.println("Значение переменной f с типом double равно " + f );

        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786;
        int j = 569;
        int k = -159;
        short l = 27897;
        byte m = 67;

        int studentsLudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;
        int totalPaper = 480;
        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int paperForStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");

        int bottlePerMinute = 16 / 2;
        int bottleFor20Minutes = bottlePerMinute * 20;
        int bottleForDay = bottlePerMinute * 1440;
        int bottleFor3Days = bottlePerMinute * 4320;
        int bottleForMonth = bottlePerMinute * 43200;
        System.out.println("За 20 минут машина произвела " + bottleFor20Minutes + " штук бутылок");
        System.out.println("За день машина произвела " + bottleForDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottleFor3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleForMonth + " штук бутылок");

        int totalPaint = 120;
        int whitePaintForClass = 2;
        int brownPaintForClass = 4;
        int paintsForClass = whitePaintForClass + brownPaintForClass;
        int numberOfClasses = totalPaint / paintsForClass;
        int totalWhitePaints = numberOfClasses * whitePaintForClass;
        int totalBrownPaints = numberOfClasses * brownPaintForClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhitePaints + " банок белой краски и " + totalBrownPaints + " банок коричневой краски");

        int bananas = 5;
        int weightOfOneBanana = 80;
        int milk = 200;
        int gramOfOneMilk = 105;
        int iceCream = 2;
        int weightOfOneIceCream = 100;
        int eggs = 4;
        int weightOfOneEgg = 70;
        int totalWeightInGrams = bananas * weightOfOneBanana + (milk * gramOfOneMilk) / 100 + iceCream * weightOfOneIceCream + eggs * weightOfOneEgg;
        double totalWeightInKilograms = totalWeightInGrams / 1000.0;
        System.out.println("Вес такого спортзавтрака в граммах будет: " + totalWeightInGrams + ", а в килограммах " + totalWeightInKilograms);

        int weightToLose = 7000;
        int weightToLoseInOneDay1 = 250;
        int weightToLoseInOneDay2 = 500;
        int numberOfDays1 = weightToLose / weightToLoseInOneDay1;
        int numberOfDays2 = weightToLose / weightToLoseInOneDay2;
        int averageQuantity = weightToLose / (weightToLoseInOneDay1 + weightToLoseInOneDay2);
        System.out.println("Количество дней, если спортсмен будет терять по 250 грамм в день: " + numberOfDays1);
        System.out.println("Количество дней, если спортсмен будет терять по 500 грамм в день: " + numberOfDays2);
        System.out.println("Среднее количество дней для похудения: " + averageQuantity);

        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryChristina = 76230;
        double newSalaryMasha = salaryMasha * 1.10;
        double newSalaryDenis = salaryDenis * 1.10;
        double newSalaryChristina = salaryChristina * 1.10;
        double mashaSalaryPerYear = salaryMasha * 12;
        double denisSalaryPerYear = salaryDenis * 12;
        double christinaSalaryPerYear = salaryChristina * 12;
        double newMashaSalaryPerYear = newSalaryMasha * 12;
        double newDenisSalaryPerYear = newSalaryDenis * 12;
        double newChristinaSalaryPerYear = newSalaryChristina * 12;
        double mashaSalaryDifference = newMashaSalaryPerYear - mashaSalaryPerYear;
        double denisSalaryDifference = newDenisSalaryPerYear - denisSalaryPerYear;
        double christinaSalaryDifference = newChristinaSalaryPerYear - christinaSalaryPerYear;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryChristina + " рублей. Годовой доход вырос на " + christinaSalaryDifference + " рублей.");
    }

}

