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
        float flo = 27.12f;
        long lon = 987_678_965_549L;
        double doub = 2.786;
        short shor = 569;
        short stop = -159;
        int in = 27_897;
        byte byt = 67;

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
        int productBananasPieces = 5;
        int productMilkMilliliters = 200;
        int iceCreamBriquettePieces = 2;
        int eggProductsPieces = 4;
        int oneBananaInGrams = 80;
        int oneServingOfMilkInGrams = 105;
        int oneIceCreamInGrams = 100;
        int oneEggInGrams = 70;
        int weightSportsBreakfastGrams = (productBananasPieces * oneBananaInGrams) + (productMilkMilliliters * oneServingOfMilkInGrams / 100) + (iceCreamBriquettePieces * oneIceCreamInGrams) + (eggProductsPieces * oneEggInGrams);
        double weightsportsBreakfastKilograms = weightSportsBreakfastGrams / 1000.0;
        System.out.println("Вес спортзавтрака в граммах составляет " + weightSportsBreakfastGrams + " гр, а в килограммах " + weightsportsBreakfastKilograms + " кг.");

        // Задача №7
        int loseTotalWeightKg = 7;
        float firstWeightGrams = 250f;
        float secondWeightGrams = 500f;
        float firstOptionWeightLossDays = (loseTotalWeightKg / firstWeightGrams) * 1000;
        float secondOptionWeightLossDays = loseTotalWeightKg / secondWeightGrams * 1000;
        float averageNumberDaysLoseWeight = (firstOptionWeightLossDays + secondOptionWeightLossDays) / 2;
        System.out.println("Для похудениея спортсмену на 7 кг, при потере веса на " + firstWeightGrams + " грамм в день, составит " + firstOptionWeightLossDays + " дней, а если терять вес по " + secondWeightGrams + " грамм в день, составит " + secondOptionWeightLossDays + " дней.");
        System.out.println("В среднем, чтобы добиться результата похудения на 7 кг, потребуется " + averageNumberDaysLoseWeight + " день.");

        // Задача №8
        int salaryMaria = 67_760;
        int salaryDenis = 83_690;
        int salaryKristi = 76_230;
        int salaryIndexingMaria =  (int) (salaryMaria * 1.1);
        int salaryIndexingDenis = (int) (salaryDenis * 1.1);
        int salaryIndexingKristi = (int) (salaryKristi * 1.1);
        int annualIncome = 12;
        int annualSalaryMaria = salaryMaria * annualIncome;
        int annualSalaryDenis = salaryDenis * annualIncome;
        int annualSalaryKristi = salaryKristi * annualIncome;
        int annualSalaryAfterPromotionMaria = salaryIndexingMaria * annualIncome;
        int annualSalaryAfterPromotionDenis = salaryIndexingDenis * annualIncome;
        int annualSalaryAfterPromotionKristi = salaryIndexingKristi * annualIncome;
        int differenceAnnualIncomeMaria = annualSalaryAfterPromotionMaria - annualSalaryMaria;
        int differenceAnnualIncomeDenis = annualSalaryAfterPromotionDenis - annualSalaryDenis;
        int differenceAnnualIncomeKristi = annualSalaryAfterPromotionKristi - annualSalaryKristi;
        System.out.println("«Маша теперь получает " + salaryIndexingMaria + " рублей. Годовой доход вырос на " + differenceAnnualIncomeMaria + " рублей».");
        System.out.println("«Денис теперь получает " + salaryIndexingDenis + " рублей. Годовой доход вырос на " + differenceAnnualIncomeDenis + " рублей».");
        System.out.println("«Кристина теперь получает " + salaryIndexingKristi + " рублей. Годовой доход вырос на " + differenceAnnualIncomeKristi + " рублей».");
    }
}