package task5;

public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Day: " + day.name() + " , Is Weekend? " + day.isWeekend());
        }
    }
}
