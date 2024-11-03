public class Main {
    public static double calculatePower(String xStr, String yStr) {
        int x = parseInt(xStr); // преобразуем строку X в число
        int y = parseInt(yStr); // преобразуем строку Y в число
        return pow(x, y); // возводим x в степень y
    }

    public static void main(String[] args) {
        if (args.length != 2) { // если количество аргументов не равно двум
            System.out.println("Укажите два числа в качестве аргументов командной строки.");
            return;
        }
        double result = calculatePower(args[0], args[1]);
        System.out.println(String.format("Результат: %.2f", result));
    }

    private static int parseInt(String s) { // перевод строки в число
        try {
            int i = Integer.parseInt(s);
            return i;
        }
        catch (NumberFormatException e) {
            System.out.println("Некорректный ввод! Возвращено 1");
            return 1;
        }
    }

    private static double pow(int base, int exponent) { // возведение в степень
        return Math.pow(base, exponent);
    }
}