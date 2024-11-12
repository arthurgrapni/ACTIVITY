class Main {

    public static void main(String[] args) {
        // 2D array for temperatures (7 days x 5 cities)
        int[][] temperatures = {
            {25, 30, 32, 28, 24},  // Monday
            {26, 29, 30, 31, 23},  // Tuesday
            {27, 31, 33, 29, 22},  // Wednesday
            {28, 32, 30, 34, 25},  // Thursday
            {29, 30, 28, 32, 24},  // Friday
            {31, 28, 27, 33, 26},  // Saturday
            {32, 29, 30, 34, 25}   // Sunday
        };

        // Display the temperatures
        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(temperatures[i][j] + "°C ");
            }
            System.out.println();
        }

        
        for (int j = 0; j < 5; j++) {
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += temperatures[i][j];
            }
            System.out.println("City " + (j + 1) + " average: " + (sum / 7) + "°C");
        }

        
        int hottest = temperatures[0][0], coldest = temperatures[0][0];
        int hottestDay = 0, coldestDay = 0;
        int hottestCity = 0, coldestCity = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (temperatures[i][j] > hottest) {
                    hottest = temperatures[i][j];
                    hottestDay = i;
                    hottestCity = j;
                }
                if (temperatures[i][j] < coldest) {
                    coldest = temperatures[i][j];
                    coldestDay = i;
                    coldestCity = j;
                }
            }
        }

        System.out.println("Hottest day: Day " + (hottestDay + 1) + ", City " + (hottestCity + 1) + " with " + hottest + "°C");
        System.out.println("Coldest day: Day " + (coldestDay + 1) + ", City " + (coldestCity + 1) + " with " + coldest + "°C");
    }
}