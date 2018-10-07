public class Runner {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2000; i < 2020; i++) {
            sum+=numberOfDaysInAYear(i);
        }
        System.out.println("từ 2000 đến 2020 có "+sum+" ngày");

    }

    public static int numberOfDaysInAYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return 366;
                }
            } else {
                return 366;
            }
        }
        return 365;

    }
}
