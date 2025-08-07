import java.util.Scanner;

public class quiz {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    static Scanner sc = new Scanner(System.in);
    static int score = 0, qno = 0;
    static boolean lifeLineAvailable = true;
    static int half5050 = 0, audiencePol = 0;
    static boolean quit = false;
    public static void main(String[] args) {
        printWelcome();
        
        String start = sc.next();
        if (!start.equalsIgnoreCase("yes")) return;

        System.out.println(RED + "Here Is The Questions" + RESET);
        System.out.println("---------------------------------------------------------------------------");

        // question arrays
        String[][] questions = {
            {"Which of the following is not a primitive data type in Java?", "int", "boolean", "String", "double"},
            {"What is the default value of a boolean variable in Java?", "true", "false", "0", "null"},
            {"Which method is the entry point for a Java program?", "start()", "main()", "run()", "init()"},
            {"Which keyword is used to inherit a class in Java?", "this", "super", "extends", "implements"},
            {"Which of the following is not a Java access modifier?", "public", "private", "protected", "internal"},
            {"What is the size of an int variable in Java?", "8 bits", "16 bits", "32 bits", "64 bits"},
            {"What is the parent class of all classes in Java?", "Object", "Class", "Main", "System"},
            {"Which of these is not a loop in Java?", "for", "while", "repeat", "do-while"},
            {"Which exception is thrown when a null object is accessed in Java?", "IOException", "NullPointerException", "ArithmeticException", "ClassNotFoundException"},
            {"What is the keyword used to define an interface in Java?", "interface", "implements", "abstract", "class"}
        };
//answers
        String[] correctAnswers = {"C", "B", "B", "C", "D", "C", "A", "C", "B", "A"};

        String[][] reducedOptions = {
            {"", "", "String", "double"},
            {"true", "false", "", ""},
            {"start()", "main()", "", ""},
            {"", "", "extends", "implements"},
            {"", "", "", "internal"},
            {"", "", "32 bits", "64 bits"},
            {"Object", "", "", "System"},
            {"", "", "repeat", "do-while"},
            {"IOException", "NullPointerException", "", ""},
            {"interface", "", "", "class"}
        };

        int[][] audiencePoll = {
            {20, 15, 50, 15},
            {30, 40, 20, 10},
            {25, 55, 15, 5},
            {10, 20, 40, 30},
            {20, 30, 25, 25},
            {25, 20, 35, 20},
            {45, 25, 10, 20},
            {10, 30, 35, 25},
            {40, 35, 15, 10},
            {55, 15, 10, 20}
        };

        runQuiz(questions, correctAnswers, reducedOptions, audiencePoll);
        showFinalScore();
        sc.close();
    }
//welcome
    static void printWelcome() {
        System.out.println(RED + "-- Welcome to GQT Quiz!-- " + RESET);
        System.out.println(RED + "   Quick, Smart & Fun" + RESET);
        System.out.print(BLUE + "Enter Your Name:" + RESET);
        String name = sc.nextLine();
        System.out.println(GREEN + "HI " + name.toUpperCase() + " WELCOME TO QUIZ " + RESET);

        System.out.println(RED + "Rules:" + RESET);
        System.out.println(PURPLE +
                "-> Each question carries $10000\n" +
                "-> If You Enter one Wrong Answer game will Over\n" +
                "-> If You Enter Wrong Answer Before 5th Question Your Score is $0\n" +
                "-> If You Enter Wrong Answer Before 7th Question Your Score is $50000\n" +
                "-> If You Enter Wrong Answer Before 10th Question Your Score is $70000\n" +
                "-> You Have Two Life-Lines (50-50 & AudiencePoll) Each Can Be Used Only Once \n" +
                "-> Think Twice Before Answering " + RESET);
        System.out.println(YELLOW + "ALL THE BEST" + RESET);
        System.out.print(BLUE + "ENTER YES TO START:");
    }
//question print
    static void runQuiz(String[][] questions, String[] correctAnswers, String[][] reducedOptions, int[][] audiencePoll) {
        boolean answered = true;
        String ans;

        for (int i = 0; i < questions.length; i++) {
            if (!answered) break;

            printQuestion(i, questions[i]);
            ans = sc.next();
            
            if (ans.equalsIgnoreCase("E")) {
                answered = useLifeline(i, questions[i], correctAnswers[i], reducedOptions[i], audiencePoll[i]);
            } else if (ans.equalsIgnoreCase("F")) {
            	 System.out.println(PURPLE + "You quit the Quiz." + RESET);
                 System.out.println(PURPLE + "Your final score: $" + score + RESET);
                 quit=true;
                break;
            } else if (ans.equalsIgnoreCase(correctAnswers[i])) {
                correctResponse();
            } else {
                wrongResponse(correctAnswers[i]);
                answered = false;
            }
        }
    }

    static void printQuestion(int index, String[] q) {
        System.out.println(BLUE + "\nQ" + (index + 1) + ": " + q[0] + RESET);
        for (int j = 1; j <= 4; j++) {
            System.out.println(YELLOW + (char) ('A' + j - 1) + ") " + q[j] + RESET);
        }
        System.out.println(YELLOW + "E)life lines \nF) Quit:" + RESET);
        System.out.print(" Enter Your answer (A/B/C/D/F/E): ");
    }
//lifeline check
    static boolean useLifeline(int i, String[] q, String correct, String[] reduced, int[] poll) {
        if (!lifeLineAvailable) {
            System.out.println(RED + "life-lines not  available.\n"+RESET+"Enter your answer (A/B/C/D/F):" );
            return handleAnswer(sc.next(), correct);
        }

        System.out.println(YELLOW + "Enter 1 for 50:50 \nEnter 2 for audience pool " + RESET);
        int choice = sc.nextInt();

        if (choice == 1 && half5050 < 1) {
            return use5050(i, correct, reduced);
        } else if (choice == 2 && audiencePol < 1) {
            return useAudiencePoll(i, q, correct, poll);
        } else {
            System.out.println(RED + "Lifeline already used. Try the other." + RESET);
            return useLifeline(i, q, correct, reduced, poll);
        }
    }

    static boolean use5050(int i, String correct, String[] reduced) {
        half5050++;
        if (half5050 + audiencePol == 2) lifeLineAvailable = false;

        for (int j = 0; j < 4; j++) {
            if (!reduced[j].isEmpty()) {
                System.out.println(YELLOW + (char) ('A' + j) + ") " + reduced[j] + RESET);
            }
        }

        System.out.print("Enter Your answer (A/B/C/D/F): ");
        return handleAnswer(sc.next(), correct);
    }

    static boolean useAudiencePoll(int i, String[] q, String correct, int[] poll) {
        audiencePol++;
        if (half5050 + audiencePol == 2) lifeLineAvailable = false;

        for (int j = 1; j <= 4; j++) {
            System.out.println(YELLOW + (char) ('A' + j - 1) + ") " + q[j] + RESET + GREEN + " [" + poll[j - 1] + "%]" + RESET);
        }

        System.out.print(" Enter Your answer (A/B/C/D/F): ");
        return handleAnswer(sc.next(), correct);
    }
//answercheck
    static boolean handleAnswer(String ans, String correct) {
        if (ans.equalsIgnoreCase("F")) return false;
        if (ans.equalsIgnoreCase(correct)) {
            correctResponse();
            return true;
        } else {
            wrongResponse(correct);
            return false;
        }
    }

    static void correctResponse() {
        System.out.println(GREEN + "Correct Answer !" + RESET);
        score += 10000;
        qno++;
    }

    static void wrongResponse(String correct) {
        System.out.println(RED + "X Wrong! Correct answer is " + correct + RESET);
    }
//score print
    static void showFinalScore() {
        System.out.println("---------------------------------------------------");
       if(quit) {
    	   
       }
        
        else if (qno < 5) {
            score = 0;
            System.out.println(RED + "You Lost the Quiz!" + RESET);
            System.out.println(GREEN + "Your final score: $" + score + RESET);

        } else if (qno < 7) {
            score = 50000;
            System.out.println(PURPLE + "Better Luck Next Time" + RESET);
            System.out.println(GREEN + "Your final score: $" + score + RESET);

        } else if (qno < 10) {
            score = 70000;
            System.out.println(PURPLE + "Well Try!" + RESET);
            System.out.println(GREEN + "Your final score: $" + score + RESET);

        } else {
            System.out.println(GREEN + "You Won the Quiz!" + RESET);
            System.out.println(GREEN + "Your final score: $" + score + RESET);
        }
    }

}
