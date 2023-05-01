public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Задача 1");
        byte apples = 7;
        System.out.println("byte apples = " + apples);
        short trees = 15460;
        System.out.println("short trees = " + trees);
        int peoples = 1752000;
        System.out.println("int peoples = " + peoples);
        long dollars = 2553456L;
        System.out.println("long dollars = " + dollars);
        float litres = 35.6F;
        System.out.println("float litres = " + litres);
        double averageValue = 15.33333345;
        System.out.println("double averageValue = " + averageValue);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12F;
        System.out.println("float a = " + a);
        long b = 987678965549L;
        System.out.println("long b = " + b);
        double c = 2.786;
        System.out.println("double c = " + c);
        short d = 569;
        System.out.println("short d = " + d);
        short e = -159;
        System.out.println("short e = " + e);
        short f = 27897;
        System.out.println("short f = " + f);
        byte g = 67;
        System.out.println("byte g = " + g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        short schoolboy1 = 23;
        System.out.println("Учеников у Людмилы Павловны - " + schoolboy1);
        short schoolboy2 = 27;
        System.out.println("Учеников у Анны Сергеевны - " + schoolboy2);
        short schoolboy3 = 30;
        System.out.println("Учеников у Екатерины Андреевны - " + schoolboy3);
        int totalSchoolboys = (schoolboy1 + schoolboy2 + schoolboy3);
        System.out.println("Всего учеников - " + totalSchoolboys + " чел");
        int totalSheets = 480;
        System.out.println("Всего закупили листов - " + totalSheets + " листов");
        int sheetsPerSchoolboy = (totalSheets / totalSchoolboys);
        System.out.println("На каждого ученика рассчитано " + sheetsPerSchoolboy + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte performance2 = 16;
        System.out.println("Производительность машины - " + performance2 + " бутылок за 2 минуты");
        int performance1 = (performance2 / 2);
        System.out.println("Производительность машины - " + performance1 + " бутылок за 1 минуту");
        int performancePer20Minutes = (performance1 * 20);
        System.out.println("За 20 минут машина произвела - " + performancePer20Minutes + " бутылок");
        int performancePerDay = (performance1 * 60 * 24);
        System.out.println("За сутки машина произвела - " + performancePerDay + " бутылок");
        int performancePer3Days = (performancePerDay * 3);
        System.out.println("За 3 дня машина произвела - " + performancePer3Days + " бутылок");
        int performancePerMonth = (performancePerDay * 30);
        System.out.println("За месяц машина произвела - " + performancePerMonth + " бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        short totalJars = 120;
        System.out.println("Требуется всего банок на ремонт школы - " + totalJars);
        short whiteJarsPerOneRoom = 2;
        System.out.println("Банок белой краски на один класс - " + whiteJarsPerOneRoom);
        short brownJarsPerOneRoom = 4;
        System.out.println("Банок коричневой краски на один класс - " + brownJarsPerOneRoom);
        int totalJarsPerOneRoom = (whiteJarsPerOneRoom + brownJarsPerOneRoom);
        System.out.println("Требуется банок краски на один класс - " + totalJarsPerOneRoom);
        int totalRooms = (totalJars / totalJarsPerOneRoom);
        System.out.println("Всего классов - " + totalRooms);
        int totalWhiteJars = (whiteJarsPerOneRoom * totalRooms);
        int totalBrownJars = (brownJarsPerOneRoom * totalRooms);
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int bananaWeight = 80;
        System.out.println("Вес одного банана - " + bananaWeight + " грамм");
        int milkWeight = 105;
        System.out.println("Вес 100 мл молока - " + milkWeight + " грамм");
        int iceCreamWeight = 100;
        System.out.println("Вес одного брикета мороженого - " + iceCreamWeight + " грамм");
        int eggsWeight = 70;
        System.out.println("Вес одного яйца - " + eggsWeight + " грамм");
        int totalWeight = ((bananaWeight * 5) + (milkWeight * 2) + (iceCreamWeight * 2) + (eggsWeight * 4));
        System.out.println("Общий вес завтрака равен - " + totalWeight + " грамм");
        float totalWeightPerKg = (float)totalWeight / 1000;
        System.out.println("Общий вес завтрака равен - " + totalWeightPerKg + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int weightKg = 7;
        System.out.println("Вес, который необходимо сбросить " + weightKg + " кг");
        int kgPerGr = 1000;
        int weightGr = (weightKg * kgPerGr);
        int daysPer250Gr = (weightGr / 250);
        int daysPer500Gr = (weightGr / 500);
        int middleDays = ((daysPer250Gr + daysPer500Gr)/2);
        System.out.println("Если спортсмен каждый день будет терять по 250 грамм, то на похудение уйдет " + daysPer250Gr + " дней; если каждый день будет терять 500 грамм, то на похудение уйдет " + daysPer500Gr + " дней;");
        System.out.println("В среднем для похудения может понадобиться " + middleDays + " день.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalaryBeforePerMonth = 67760;
        int denisSalaryBeforePerMonth = 83690;
        int christinaSalaryBeforePerMonth = 76230;
        System.out.println("Маша получает " + mashaSalaryBeforePerMonth + " рублей в месяц.");
        System.out.println("Денис получает " + denisSalaryBeforePerMonth + " рублей в месяц.");
        System.out.println("Кристина получает " + christinaSalaryBeforePerMonth + " рублей в месяц.");
        int mashaSalaryBeforePerYear = (mashaSalaryBeforePerMonth * 12);
        int denisSalaryBeforePerYear = (denisSalaryBeforePerMonth * 12);
        int christinaSalaryBeforePerYear = (christinaSalaryBeforePerMonth * 12);
        System.out.println("Годовой доход Маши до повышения составляет - " + mashaSalaryBeforePerYear + " руб.");
        System.out.println("Годовой доход Дениса до повышения составляет - " + denisSalaryBeforePerYear + " руб.");
        System.out.println("Годовой доход Кристины до повышения составляет - " + christinaSalaryBeforePerYear + " руб.");
        double mashaSalaryAfterPerMonth = ((mashaSalaryBeforePerMonth) + (mashaSalaryBeforePerMonth * 0.1));
        double denisSalaryAfterPerMonth = ((denisSalaryBeforePerMonth) + (denisSalaryBeforePerMonth * 0.1));
        double christinaSalaryAfterPerMonth = ((christinaSalaryBeforePerMonth) + (christinaSalaryBeforePerMonth * 0.1));
        double mashaSalaryAfterPerYear = (mashaSalaryAfterPerMonth * 12);
        double denisSalaryAfterPerYear = (denisSalaryAfterPerMonth * 12);
        double christinaSalaryAfterPerYear = (christinaSalaryAfterPerMonth * 12);
        double mashaDifferencePerYear = (mashaSalaryAfterPerYear - mashaSalaryBeforePerYear);
        double denisDifferencePerYear = (denisSalaryAfterPerYear - denisSalaryBeforePerYear);
        double christinaDifferencePerYear = (christinaSalaryAfterPerYear - christinaSalaryBeforePerYear);
        System.out.println("Маша теперь получает " + mashaSalaryAfterPerMonth + " рублей в месяц." + "Годовой доход вырос на " + mashaDifferencePerYear + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryAfterPerMonth + " рублей в месяц." + "Годовой доход вырос на " + denisDifferencePerYear + " рублей");
        System.out.println("Кристина теперь получает " + christinaSalaryAfterPerMonth + " рублей в месяц." + "Годовой доход вырос на " + christinaDifferencePerYear + " рублей");
    }
}