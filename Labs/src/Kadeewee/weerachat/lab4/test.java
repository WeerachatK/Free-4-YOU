package kadeewee.weerachat.lab4;
import java.util.Scanner;
public class test   {
    static int correctNum;
    static int minNum = 1;
    static int maxNum = 10;
    static int maxTries = 3;
    static int[] guesses;
    static int numGuesses = 0;

    public static void main(String[] args) {
        configGame();
        genAnswer();
        playGames();
    }
    public static void configGame() {
        Scanner inputValues = new Scanner(System.in);
        System.out.print("Enter the min and the max values:");
        int theFirst = inputValues.nextInt();
        int theSecond = inputValues.nextInt();
        if (theFirst > theSecond) {
            maxNum = theFirst;
            minNum = theSecond;
        } else if (theFirst < theSecond) {
            maxNum = theSecond;
            minNum = theFirst;
        } else if (theFirst == theSecond) {
            maxNum = theFirst;
            minNum = maxNum;
        }
        Scanner inputTries = new Scanner(System.in);
        System.out.print("Enter the number of tries:");
        maxTries = inputTries.nextInt();
    }
    public static void genAnswer() {
        correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
    }
    public static void playGames() {
        guesses = new int[maxTries];

        for(int i = maxTries-1; i>=0; i--) {
            Scanner enterGuess = new Scanner(System.in);
            System.out.print("Pleas enter a guess (" + minNum + "-" + maxNum + "):");
            int oneGuess = enterGuess.nextInt();

            while (oneGuess < minNum || oneGuess > maxNum) {
                System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
                Scanner guessInput = new Scanner(System.in);
                oneGuess = guessInput.nextInt();
            }
            guesses[numGuesses] = oneGuess;
            numGuesses++;

            if (oneGuess == correctNum) {
                System.out.println("Congratulation! That's correct");
                myMain();
            } else if (oneGuess >= correctNum) {
                System.out.println("Please type a lower number ! Number of remaining tries:" + i);
            } else if (oneGuess <= correctNum) {
                System.out.println("Please type a higher number ! Number of remaining tries:" + i);
            }
            if (i == 0) {
                myMain();
            }
        }
    }
    public static void showGuesses() {
        for (int index : guesses) {
            System.out.print(index + " ");
        }
        System.out.println("");
    }
    public static void showSpecific() {
        Scanner inputGuess = new Scanner(System.in);
        int enterGuess = 0;
        while (true) {
            System.out.println("Enter which guess in the range " + "(1" + "-" + numGuesses + ")");
            enterGuess = inputGuess.nextInt();
            if (enterGuess < numGuesses && enterGuess > 0){
                break;
            }
        }
        System.out.println("Guess number" + enterGuess + " is " + guesses[enterGuess - 1] );
    }
    public static void showSpecific2() {
        System.out.println("Enter which guess in the range (1-"+ numGuesses +")");



    }
    public static void myMain() {
        Scanner yesOrNo = new Scanner(System.in);
        System.out.println("If want to play again? type 'y' to continue or 'q' to quit:");
        System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
        String enterYseOrNo = yesOrNo.next();
        if (enterYseOrNo.equals("y")) {
            genAnswer();
            playGames();
        } else if (enterYseOrNo.equals("q")){
            System.exit(1);
        } else if (enterYseOrNo.equals("a")){
            showGuesses();
            myMain();
        } else {
            System.exit(1);
        }
    }
} /*{
        public static void main(String[] args) {
                // call method.
                configGame();
                genAnswers();
                playGames();
        }
            // create method.
        public static void configGame() {
                Scanner showNum = new Scanner(System.in);
                System.out.print("Enter the min and the max values:");
                minNum = showNum.nextInt();
                maxNum = showNum.nextInt();
                if (minNum > maxNum) {
                    int maxNum1 = maxNum;
                    maxNum = minNum;
                    minNum = maxNum1;
                }
                System.out.print("Enter the number of tries:");
                maxTries = showNum.nextInt();
                guesses = new int[maxTries];
        }
        public static void genAnswers() {
                // random
                correctNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        }
        public static void showGuesses() {
                for (int i = 0; i < maxTries; i++) {
                    System.out.print(guesses[i] + " ");
                }
                System.out.println();
        }
        public static void showSpecific() {
                Scanner showNum = new Scanner(System.in);
                int guessShow = 0;
                while (true) {
                    System.out.println("Enter which guess in the range " + "(1" + "-" + numGuesses + ")");
                    guessShow = showNum.nextInt();
                    if (guessShow < numGuesses){
                        break;
                    }
                }
                System.out.println("Guess number " + guessShow + " is " + guesses[guessShow - 1]);
        }
        public static void playGame() {
                Scanner showNum = new Scanner(System.in);
                numGuesses = 0;
                int numberRound = maxTries;
                int numGuess;
                for (int i = 0; i < numberRound; i++) {
                    while (true) {
                        System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
                        numGuess = showNum.nextInt();
                        numGuesses += 1;
                        if (numGuess > maxNum || numGuess < minNum) {
                            System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                        }
                        else {
                            break;
                        }
                    }
                    guesses[i] = numGuess;
                    maxTries--;
                    if (numGuess == correctNum) {
                        System.out.println("Congratulations!  That’s correct");
                        break;
                    }
                    else if (numGuess > correctNum) {
                        System.out.println("Please type a lower number! Number of remaining tries:" + maxTries);
                    }
                    else {
                        System.out.println("Please type a higher number! Number of remaining tries:" + maxTries);
                    }
                }
                maxTries = numberRound;
        }
        public static void playGames() {
                Scanner showNum = new Scanner(System.in);
                playGame();
                while (true) {
                    System.out.println("If want to play again? Type 'y' to continue of 'q' to quit:");
                    System.out.println("Type 'a' to see all your guesses or 'g' to see a guess on a specific play.");
                    String again = showNum.next();
                    if (again.equals("q")) {
                        System.exit(0);
                    }
                    else if (again.equals("y")) {
                        genAnswers();
                        playGame();
                    }
                    else if (again.equals("a")) {
                        showGuesses();
                    }
                    else if (again.equals("g")) {
                        showSpecific();
                    }
                    else {
                        System.exit(1);
                    }
                }
        }
    }
}
    /*double[] grade = {4, 4, 2.5, 3.5, 3.5, 2.5, 3.5, 1.5};
        double[] credit = {3, 1, 3, 3, 3, 3, 1, 3};
        double gpa = 0;
        double totalCredit = 0;
        double totalGrade = 0;
        for (int i = 0; i < grade.length; i++){
            totalGrade = totalGrade +  grade[i] * credit[i];
            totalCredit = totalCredit + credit[i];
        }
        System.out.println ("totalGrade = " + totalGrade);
        System.out.println ("totalGrade = " + totalCredit);
        gpa =  totalGrade / totalCredit;
        System.out.println (String.format("GPA = %.2f",(gpa)));

    for (int i = 0; i < 4; i++) {
            if ((i % 2) == 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("  nub even ");
                }
            } else {
                for (int j = (3 - 1); j >= 0; j--) {
                    System.out.print("  nub ood  ");
                }
            }
        }


    int i = 0;
        int j = 5;
        int n = 1;
        int[][] getNum = new int[2][2];
        for (i = 0; i<2; i++){
            for (j = 0; j<2; j++) {
                getNum[i][j] = n;
                n++;
            }
        }
        for (int h = 0; h<getNum.length; h++) {
            for (j = 0; j<2; j++) {
                System.out.print(getNum[h][j] + " ");
            }
            System.out.println("");
        }



    public static void test(String[] args) {
        int i = 0;
        int j = 5;
        int[] getNum = new int[j];
        for (i = 0; i<5; i++){
            System.out.print("input : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            getNum [i] = num;
        }
        for (int h = 0; h<getNum.length; h++) {
            System.out.print(getNum[h] + " ");
        }
    }
    public static void guessMax() {
        int max = 0;
        for (int i = 0; i < guesses.length; i++) {
            int num = guesses[i];
            for (int j = 0; j < guesses.length; j++) {
                if (num >= guesses[j]){
                    if (num >= max) {
                        max = num;
                    }
                }
            }
        }
        System.out.println("Max = " + max );
    }*/