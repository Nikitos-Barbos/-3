import java.nio.channels.FileLock;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int aboba = 4000000;
        System.out.println("Значение переменной int с типом Целочисленные равно " + aboba);
        byte chupapu = -15;
        System.out.println("Значение переменной byte с типом Целочисленные равно " + chupapu);
        short nebo = 21865;
        System.out.println("Значение переменной short с типом Целочисленные равно " + nebo);
        long trusilya = -73892181L;
        System.out.println("Значение переменной long с типом Целочисленные равно " + trusilya);
        float trupik = 2.83928f;
        System.out.println("Значение переменной float с типом С плавающей точкой " + trupik);
        double glist = -18.921918982;
        System.out.println("Значение переменной double с типом С плавающей точкой " + glist);
        System.out.println();

        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
        System.out.println();

        byte lyudmilaPavlovna = 23;
        System.out.println("У Людмилы Павловны — " + lyudmilaPavlovna + " ученика.");
        byte annaSergeevna = 27;
        System.out.println("У Анны Сергеевны — " + annaSergeevna + " учеников.");
        byte catherineAndreyevna = 30;
        System.out.println("У Екатерины Андреевны  — " + catherineAndreyevna + " учеников.");
        short together = 480;
        System.out.println(together + " листов бумаги.");
        short totalstudents = (short) (lyudmilaPavlovna + annaSergeevna + catherineAndreyevna);
        System.out.println(totalstudents);
        float sheetsOfPaper = (float) together / totalstudents;
        System.out.println("На каждого ученика рассчитано — " + sheetsOfPaper + " листов бумаги.");
        System.out.println();


        byte bottles = 16;
        System.out.println(bottles + " бутылок.");
        byte productionTime = 2;
        System.out.println(productionTime + " минуты.");
        int first = (bottles / productionTime) * 20;
        System.out.println("За 20 минут машина произвела - " + first + " штук бутылок.");
        int second = (bottles / productionTime) * (24 * 60);
        System.out.println("За сутки машина произвела - " + second + " штук бутылок.");
        int third = (bottles / productionTime) * (24 * 3 * 60);
        System.out.println("За 3 дня машина произвела - " + third + " штук бутылок.");
        int fourth = (bottles / productionTime) * (24 * 31 * 60);
        System.out.println("За 1 месяц машина произвела - " + fourth + " штук бутылок.");
        System.out.println();

        byte cans = 120;
        System.out.println(cans);
        byte whitePaint = 2;
        System.out.println(whitePaint);
        byte brownPaint = 4;
        System.out.println(brownPaint);
        int totalOfColors = whitePaint + brownPaint;
        System.out.println(totalOfColors);
        int classesAtSchool = cans / totalOfColors;
        System.out.println(classesAtSchool);
        int white = classesAtSchool * whitePaint;
        System.out.println(white);
        int brown = classesAtSchool * brownPaint;
        System.out.println(brown);
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");
        System.out.println();

        int bananas = 5 * 80;
        System.out.println(bananas);
        int milk = 2 * 105;
        System.out.println(milk);
        int iceCream = 2 * 100;
        System.out.println(iceCream);
        int eggs = 4 * 70;
        System.out.println(eggs);
        int amountOfGrams = bananas + milk + iceCream + eggs;
        System.out.println("Результат продукта в граммах " + amountOfGrams + " кг.");
        double quantityInKilograms = (bananas + milk + iceCream + eggs) / 1000.0;
        System.out.println("Результат продукта в киллограммах " + quantityInKilograms + " кг.");
        System.out.println();

        short task = 7000;
        System.out.println(task);
        short reset1 = 250;
        System.out.println(reset1);
        short reset2 = 500;
        System.out.println(reset2);
        int minimumLoad = task / reset1;
        System.out.println("Чтобы добиться минимального результата похудения, потребуется " + minimumLoad + " дней .");
        int maximumLoad = task / reset2;
        System.out.println("Чтобы добиться максимального результата похудения, потребуется " + maximumLoad + " дней .");
        int averageValue = (maximumLoad + minimumLoad) / 2;
        System.out.println("Чтобы добиться результата похудения, потребуется в среднем " + averageValue + " дней .");
        System.out.println();

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaNewSalary = (int) (mashaSalary * 1.10);
        int denisNewSalary = (int) (denisSalary * 1.10);
        int kristinaNewSalary = (int) (kristinaSalary * 1.10);
        int mashaAnnualBefore = mashaSalary * 12;
        int mashaAnnualAfter = mashaNewSalary * 12;
        int denisAnnualBefore = denisSalary * 12;
        int denisAnnualAfter = denisNewSalary * 12;
        int kristinaAnnualBefore = kristinaSalary * 12;
        int kristinaAnnualAfter = kristinaNewSalary * 12;
        int mashaDifference = mashaAnnualAfter - mashaAnnualBefore;
        int denisDifference = denisAnnualAfter - denisAnnualBefore;
        int kristinaDifference = kristinaAnnualAfter - kristinaAnnualBefore;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей.");
        System.out.println();

    }
}