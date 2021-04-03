import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите название задачи и время на ее выполнение:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int startPos = input.indexOf("начинается в");
        String startTimeString = input.substring(startPos + 13, startPos + 15);
        String endTimeString = input.substring(startPos + 34, startPos + 36);
        int startTime = Integer.parseInt(startTimeString);
        int endTime = Integer.parseInt(endTimeString);

        if (startTime < endTime) {
            System.out.println("На задачу потребуется: " + (endTime - startTime) + " ч.");
        } else {
            System.out.println("Формат введенных данных неверный");
        }
    }
}
