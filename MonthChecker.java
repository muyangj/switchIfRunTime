public class MonthChecker {
    public static void main(String[] args) {
        String firstArg = args[0];

        int month = Integer.parseInt(firstArg);

        long startTime = System.nanoTime(); // This is the starting time of switch statements.

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("ERROR: unknown month" + month);
        }

        long endTimeSwitch = System.nanoTime(); // This is the end time of the switch statements, which is also the starting time of the if statements.

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 13) {
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else {
            System.out.println("Error: unknown month " + month);
        }


        long endTime = System.nanoTime(); // This is the end time of the if statements.

        long totalTimeSwitch = endTimeSwitch - startTime;
        long totalTimeIf = endTime - endTimeSwitch;

        System.out.println("total time Switch " + totalTimeSwitch);
        System.out.println("total time Switch " + totalTimeIf);

        // Question: why the performance is so different?

    }
}