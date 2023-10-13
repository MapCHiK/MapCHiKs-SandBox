import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Добро пожаловать в MapCHiK's SandBox! Для получения списка доступных команд введите \"$help\"!");
        Scanner cmd = new Scanner(System.in);
        int calcLoop = 0;
        int loop = 0;
        while (loop == 0) {
            calcLoop = 0;
            String input = cmd.nextLine();
            switch (input) {
                case "$help":
                    System.out.println("\"$help\" - Вызов списка команд.\n\"$credits\" - Показывает информацию о разработчике.\n\"$exit\" - Завершение работы программы.\n\"$calc_prog\" - Примитивный калькулятор. Может складывать/вычитать/умножать/делить два числа.\n\"$kaleidoscope_prog\" - Какое-то подобие калейдоскопа. Вводишь нужную последовательность и программа повторяет её. Выход вряд ли будет реализован. ВНИМАНИЕ! СИЛЬНО НАГРУЖАЕТ ПРОЦЕССОР!\n\"$updatelogs\" - Сведения об обновлениях MapSB");
                    break;
                case "$credits":
                    System.out.println("Программу делал: MapCHiK\nTelegram: https://t.me/MapCHiK_tg\nYouTube: https://youtube.com/@MapCHiK\nDiscord: @mapchik\nGitHub: https://github.com/MapCHiK");
                    break;
                case "$exit":
                    loop = 1;
                    break;
                case "$calc_prog":
                    double result;
                    Scanner firstNum = new Scanner(System.in);
                    Scanner secondNum = new Scanner(System.in);
                    Scanner actionCalc = new Scanner(System.in);
                    System.out.println("Добро пожаловать в Калькулятор! При каждом выводе результата, автоматически выполняется выход из программы.");
                    System.out.println("Введите первое число:");
                    double number1 = firstNum.nextDouble();
                    System.out.println("Введите второе число: ");
                    double number2 = secondNum.nextDouble();
                    System.out.println("Введите требуемое действие: ");
                    String actCalc = actionCalc.nextLine();
                    switch (actCalc) {
                        case "+":
                            result = number1 + number2;
                            System.out.println("Результат:\n" + result + "\nПрограмма завершена!\n");
                            break;
                        case "-":
                            result = number1 - number2;
                            System.out.println("Результат:\n" + result + "\nПрограмма завершена!\n");
                            break;
                        case "*":
                            result = number1 * number2;
                            System.out.println("Результат:\n" + result + "\nПрограмма завершена!\n");
                            break;
                        case "/":
                            if (number2 != 0) {
                                result = number1 / number2;
                                System.out.println("Результат:\n" + result + "\nПрограмма завершена!\n");
                            } else System.out.println("Бесконечность.\nПрограмма завершена!");
                            break;
                        default:
                            System.out.println("Некорректное действие!\nПрограмма завершена!\n");
                    }
                    break;
                case "$kaleidoscope_prog":
                    int kaleidoLoop = 10000;
                    Scanner kaleidoscopeScan = new Scanner(System.in);
                    System.out.println("Введите любую строку:");
                    String kaleidoscopeEnter = kaleidoscopeScan.nextLine();
                    while (kaleidoLoop != 0) {
                        System.out.print(kaleidoscopeEnter);
                        kaleidoLoop--;
                        TimeUnit.MICROSECONDS.sleep(75);
                    }
                    kaleidoLoop = 10000;
                    break;
                case "$updatelogs":
                    System.out.println("MapSB beta v0.1 - 13.10.2023 - Рождение на свет песочницы \"MapCHiK's SandBox\"! Были добавлены следующие команды: $help, $credits, $exit, $calc_prog, $kaleidoscope_prog, $updatelogs.");
                    System.out.println("MapSB beta v0.2 - ??.??.???? - ??????????.");
                    break;
                default:
                    System.out.println("Неизвестная команда. Введите \"$help\" для просмотра списка команд.");
            }
        }
    }
}