public class Main {
    public static void main(String[] args) {

        // Задача №1
        int a = 1000;
        System.out.println("«Значение переменной a с типом int равно " + a + "»" );
        byte b = 10;
        System.out.println("«Значение переменной b с типом byte равно " + b + "»" );
        short c = 100;
        System.out.println("«Значение переменной c с типом short равно " + c + "»" );
        long d = 10000L;
        System.out.println("«Значение переменной d с типом long равно " + d + "»" );
        float f = 3.14f;
        System.out.println("«Значение переменной f с типом float равно " + f + "»" );
        double g = 314.314;
        System.out.println("«Значение переменной g с типом int равно " + g + "»" );

        // Задача №2
        float x =27.12f;
        long y = 987_678_965_549L;
        double z = 2.786;
        short h =569;
        short r = -159;
        int k = 27_897;
        byte s = 67;

        // Задача №3
        short lyudmilaPavlovnaStudent = 23;
        short annaSergeevnaStudent = 27;
        short ekaterinaAndreevnaStudent = 30;
        short totalSheetsPaper = 480;
        int totalStudents = lyudmilaPavlovnaStudent + annaSergeevnaStudent + ekaterinaAndreevnaStudent;
        int sheetsPaper =totalSheetsPaper / totalStudents;
        System.out.println("«На каждого ученика рассчитано " + sheetsPaper + " листов бумаги»");

        // Задача №4
        short inTwoMinutesBottles = 16;
        int oneMinuteBottles = inTwoMinutesBottles / 2;
        short timeMachinePerformanceMinutes1 = 20;
        short timeMachinePerformanceMinutes2 = 1440;
        short timeMachinePerformanceMinutes3 = 4320;
        int timeMachinePerformanceMinutes4 = 43200;
        int twentyMinutesBottles = timeMachinePerformanceMinutes1 * oneMinuteBottles;
        System.out.println("«За 20 минут машина произвела " + twentyMinutesBottles + " штук бутылок»");
        int producedBottlesDay = timeMachinePerformanceMinutes2 * oneMinuteBottles;
        System.out.println("«За сутки машина произвела " + producedBottlesDay + " штук бутылок»");
        int inThreeDaysBottles = timeMachinePerformanceMinutes3 * oneMinuteBottles;
        System.out.println("«За три дня машина произвела " + inThreeDaysBottles + " штук бутылок»");
        int forMonthBottles = timeMachinePerformanceMinutes4 * oneMinuteBottles;
        System.out.println("«За месяц машина произвела " + forMonthBottles + " штук бутылок»");

        // Задача №5
        int cansPaintTwoColors = 120;
        int canWhitePaint = 2;
        int cansBrownPaint = 4;
        int totalPaintsClass = canWhitePaint + cansBrownPaint;
        int totalClasses = cansPaintTwoColors / totalPaintsClass;
        int totalWhitePaint = totalClasses * canWhitePaint;
        int totalBrownPaint = totalClasses * cansBrownPaint;
        System.out.println("«В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски»");

        // Задача №6











    }
}