import java.util.Scanner;

public class AchievementLevel {
    public static String getAchievementLevel(int percentage) {
        if (percentage >= 80 && percentage <= 100) {
            return "Level 7: 80 - 100% (Outstanding achievement)";
        } else if (percentage >= 70 && percentage <= 79) {
            return "Level 6: 70 - 79% (Meritorious achievement)";
        } else if (percentage >= 60 && percentage <= 69) {
            return "Level 5: 60 - 69% (Substantial achievement)";
        } else if (percentage >= 50 && percentage <= 59) {
            return "Level 4: 50 - 59% (Moderate achievement)";
        } else if (percentage >= 40 && percentage <= 49) {
            return "Level 3: 40 - 49% (Adequate achievement)";
        } else if (percentage >= 30 && percentage <= 39) {
            return "Level 2: 30 - 39% (Elementary achievement)";
        } else if (percentage >= 0 && percentage <= 29) {
            return "Level 1: 0 - 29% (Not achieved - Fail)";
        } else {
            return "Invalid percentage";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        int percentage = scanner.nextInt();
        System.out.println("Percentage: " + percentage + " -> " + getAchievementLevel(percentage));
        scanner.close();
    }
}