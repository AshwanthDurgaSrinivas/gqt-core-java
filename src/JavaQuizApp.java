import java.util.Scanner;

public class JavaQuizApp {
	 public static final String RESET = "\u001B[0m";
	    public static final String RED = "\u001B[31m";
	    public static final String GREEN = "\u001B[32m";
	    public static final String YELLOW = "\u001B[33m";
	    public static final String BLUE = "\u001B[34m";
	    public static final String PURPLE = "\u001B[35m";
    public static void main(String[] args) {
    	String name;
    	 String start;
        Scanner sc = new Scanner(System.in);
        System.out.println(RED+"-- Welcome to GQT Quiz!-- "+RESET);
        System.out.println(RED+"   Quick, Smart & Fun"+RESET );
        System.out.print(BLUE+"Enter Your Name:"+RESET);
        name=sc.nextLine();
       
        System.out.println(GREEN+"HI "+name.toUpperCase()+" WELCOME TO QUIZ "+RESET);
        System.out.println(RED+"Rules:"+RESET);
        System.out.println(PURPLE+"-> Each question carries $10000\n-> If You Enter one Wrong Answer game will Over\n-> If You Enter Wrong Answer Before 5th Question Your Score is $0\n-> If You Enter Wrong Answer Before 7th Question Your Score is $50000\n-> If You Enter Wrong Answer Before 10th Question Your Score is $70000\n-> You Have Two Life-Lines (50-50 & AudiencePoll) Each Can Be Used Only Once \n-> Think Twice Before Answering "+RESET);
        System.out.println(YELLOW+"ALL THE BEST "+RESET+BLUE+name.toUpperCase()+RESET);
        System.out.print(BLUE+"ENTER YES TO START:");
        start=sc.next();
        if(start.equalsIgnoreCase("yes")) {
        System.out.println(RED+"Here Is The Questions"+RESET);
System.out.println("---------------------------------------------------------------------------");
        String[][] questions = {
            {
                "Which of the following is not a primitive data type in Java?",
                "int", "boolean", "String", "double"
            },
            {
                "What is the default value of a boolean variable in Java?",
                "true", "false", "0", "null"
            },
            {
                "Which method is the entry point for a Java program?",
                "start()", "main()", "run()", "init()"
            },
            {
                "Which keyword is used to inherit a class in Java?",
                "this", "super", "extends", "implements"
            },
            {
                "Which of the following is not a Java access modifier?",
                "public", "private", "protected", "internal"
            },
            {
                "What is the size of an int variable in Java?",
                "8 bits", "16 bits", "32 bits", "64 bits"
            },
            {
                "What is the parent class of all classes in Java?",
                "Object", "Class", "Main", "System"
            },
            {
                "Which of these is not a loop in Java?",
                "for", "while", "repeat", "do-while"
            },
            {
                "Which exception is thrown when a null object is accessed in Java?",
                "IOException", "NullPointerException", "ArithmeticException", "ClassNotFoundException"
            },
            {
                "What is the keyword used to define an interface in Java?",
                "interface", "implements", "abstract", "class"
            }
        };

        // Correct answers (A, B, C, or D)
        String[] correctAnswers = {
            "C", "B", "B", "C", "D", "C", "A", "C", "B", "A"
        };
        String[][] reducedOptions = {
        	    {"", "", "String", "double"},               // Q1 → Correct: C
        	    {"true", "false", "", ""},                  // Q2 → Correct: B
        	    {"start()", "main()", "", ""},              // Q3 → Correct: B
        	    {"", "", "extends", "implements"},          // Q4 → Correct: C
        	    {"", "", "", "internal"},                   // Q5 → Correct: D
        	    {"", "", "32 bits", "64 bits"},             // Q6 → Correct: C
        	    {"Object", "", "", "System"},               // Q7 → Correct: A
        	    {"", "", "repeat", "do-while"},             // Q8 → Correct: C
        	    {"IOException", "NullPointerException", "", ""},  // Q9 → Correct: B
        	    {"interface", "", "", "class"}              // Q10 → Correct: A
        	};
        int[][] audiencePoll = {
        	    {20, 15, 50, 15},   // Q1 → Correct: C (high)
        	    {30, 40, 20, 10},   // Q2 → Correct: B (moderate)
        	    {25, 55, 15, 5},    // Q3 → Correct: B (high)
        	    {10, 20, 40, 30},   // Q4 → Correct: C (moderate)
        	    {20, 30, 25, 25},   // Q5 → Correct: D (even)
        	    {25, 20, 35, 20},   // Q6 → Correct: C (slightly high)
        	    {45, 25, 10, 20},   // Q7 → Correct: A (high)
        	    {10, 30, 35, 25},   // Q8 → Correct: C (close)
        	    {40, 35, 15, 10},   // Q9 → Correct: B (close)
        	    {55, 15, 10, 20}    // Q10 → Correct: A (high)
        	};


        int score = 0;
        boolean answered=true;
        int qno=0;
        boolean lifeLineAvailable=true;
        int lifeLineUsed=0;
//        
        int choice;
//       
        int half5050=0;
        int audiencepol=0;
        int aud = 0;
        int five=0;
        String ans = null;
        
        
        for (int i = 0; i < questions.length; i++) {
        	if(answered) {
        		System.out.println(BLUE+"\nQ" + (i + 1) + ": " + questions[i][0]+RESET);
        		for (int j = 1; j <= 4; j++) {
                System.out.println(YELLOW+(char) ('A' + j - 1) + ") " + questions[i][j]+RESET);
                
        		}
        		System.out.println(YELLOW+"E)life lines \nF) Quit:"+RESET);
        		ans=sc.next();
        		if(ans.equalsIgnoreCase("e")) {
        			if(lifeLineAvailable) {
        				//LIFE-LINE PART
        				System.out.println(YELLOW+"Enter 1 for 50:50 \nEnter 2 for audience pool "+RESET);
        				choice=sc.nextInt();
        				if(choice==1&&half5050<1) {
        					//50:50
        					System.out.println("inside the ");
        					lifeLineUsed++;
        					for (int j = 0; j < 4; j++) {
        						System.out.println(YELLOW+(char) ('A' + j ) + ") " + reducedOptions[i][j]+RESET);
        					}
        					System.out.print("Your answer (A/B/C/D/F): ");
        					String userAnswer = sc.next().toUpperCase();

        					if (userAnswer.equals(correctAnswers[i])) {
        						System.out.println(GREEN+"Correct Answer !"+RESET);
        						score+=10000;
        						qno++;
        					} 
        					else {
        						System.out.println(RED+"X Wrong! Correct answer is " + correctAnswers[i]+RESET);
        						answered=false;
        						break;
        					}
        					half5050++;
        				}
        				else if(half5050==1&&choice!=2){
        					System.out.println(RED+"you already used the 50:50 to use audiencePoll enter 2: "+RESET);
        					aud=sc.nextInt();
        					if(aud==2&&audiencepol<1) {
        						lifeLineUsed++;
            					for (int j = 1; j <= 4; j++) {
            						System.out.println(YELLOW+(char) ('A' + j-1 ) + ") " + questions[i][j]+ RESET+GREEN+	" [" + audiencePoll[i][j-1] + "%]"+RESET);
            					}
            					System.out.print("Your answer (A/B/C/D/F): ");
            					String userAnswer = sc.next().toUpperCase();

            					if (userAnswer.equals(correctAnswers[i])) {
            						System.out.println(GREEN+"Correct Answer !"+RESET);
            						score+=10000;
            						qno++;
            					} else {
            						System.out.println(RED+"X Wrong! Correct answer is " + correctAnswers[i]+RESET);
            						answered=false;
            						break;
            					}
            					audiencepol++;
        					}
        				}
        			
        				else if((choice==2&& audiencepol<1) ) {
        					//AUDIENCE POLL
        					lifeLineUsed++;
        					for (int j = 1; j <= 4; j++) {
        						System.out.println(YELLOW+(char) ('A' + j-1 ) + ") " + questions[i][j]+ RESET+GREEN+	" [" + audiencePoll[i][j-1] + "%]"+RESET);
        					}
        					System.out.print("Your answer (A/B/C/D/F): ");
        					String userAnswer = sc.next().toUpperCase();

        					if (userAnswer.equals(correctAnswers[i])) {
        						System.out.println(GREEN+"Correct Answer !"+RESET);
        						score+=10000;
        						qno++;
        					} else {
        						System.out.println(RED+"X Wrong! Correct answer is " + correctAnswers[i]+RESET);
        						answered=false;
        						break;
        					}
        					audiencepol++;
        				}
        				else if(audiencepol==1){
        					System.out.println(RED+"you already used the audiencePoll to use 50:50 enter 1:  "+RESET);
        					five=sc.nextInt();
        					if(five==1&&half5050<1) {
            					lifeLineUsed++;
            					for (int j = 0; j < 4; j++) {
            						System.out.println(YELLOW+(char) ('A' + j ) + ") " + reducedOptions[i][j]+RESET);
            					}
            					System.out.print("Your answer (A/B/C/D/F): ");
            					String userAnswer = sc.next().toUpperCase();

            					if (userAnswer.equals(correctAnswers[i])) {
            						System.out.println(GREEN+"Correct Answer !"+RESET);
            						score+=10000;
            						qno++;
            					} 
            					else {
            						System.out.println(RED+"x Wrong! Correct answer is " + correctAnswers[i]+RESET);
            						answered=false;
            						break;
            					}
            					half5050++;
            				}
        				}
        				
        				if(lifeLineUsed==2) {
        					lifeLineAvailable=false;
        				}
        			}
        			else {
        				System.out.println(RED+"life-lines not  available you have answer:"+RESET);
        				System.out.print("Your answer (A/B/C/D/F): ");
        				String userAnswer = sc.next().toUpperCase();
        				ans= userAnswer;
        				if(userAnswer.equalsIgnoreCase("F")) {
        	            	answered=false;
        	            	break;
        	            }
        				else if (userAnswer.equals(correctAnswers[i])) {
        					System.out.println(GREEN+"Correct Answer !"+RESET);
        					score+=10000;
        					qno++;
        				} else {
        					System.out.println(RED+"x Wrong! Correct answer is " + correctAnswers[i]+RESET);
        					answered=false;
        					break;
        				}
        			}
            
        		}
            //DIRECT GIVING ANSWER
            else if(ans.equalsIgnoreCase("A")||ans.equalsIgnoreCase("B")||ans.equalsIgnoreCase("C")||ans.equalsIgnoreCase("D")||ans.equalsIgnoreCase("f")) {
//            System.out.print("Your answer (A/B/C/D): ");
//            String userAnswer = sc.next().toUpperCase();
            	
            	if(ans.equalsIgnoreCase("F")) {
	            	answered=false;
	            	break;
	            }
            	else if (ans.equalsIgnoreCase(correctAnswers[i])) {
            		System.out.println(GREEN+" Correct Answer !"+RESET);
            		score+=10000;
            		qno++;
            	} else {
            		System.out.println(RED+"X Wrong! Correct answer is " + correctAnswers[i]+RESET);
            		answered=false;
            		break;
            	}
            }
            else if(ans.equalsIgnoreCase("F")) {
          
            	answered=false;
            	break;
            }
            else {
            	System.out.println(RED+"X Wrong Input! Correct answer is " + correctAnswers[i]+RESET);
            	answered=false;
            	break;
            }
        	}
        }
        //SCORE PRINTING
        if(ans.equalsIgnoreCase("F")) {
        	System.out.println(PURPLE+"You quit the Quiz:"+RESET);
        	System.out.println(PURPLE+"Your final score: " + score+RESET);
        }
        else if(qno<5) {
        	score=0;
        	System.out.println(RED+"You Lossed the Quiz:"+RESET);
        System.out.println(RED+"Your final score: " + score+RESET);
        }
        else if(qno>=5&&qno<7) {
        	score=10000*5;
        	System.out.println(PURPLE+"Better Luck Next Time:"+RESET);
        System.out.println(YELLOW+"\nYour final score: " + score+RESET);
        }
        else if(qno>=7&&qno<10) {
        	score=10000*7;
        	System.out.println(PURPLE+"Well Try:"+RESET);
        System.out.println(GREEN+"\nYour final score: " + score+RESET);
        }
        else {
        	System.out.println(PURPLE+"You Won the Quiz:"+RESET);
        	 System.out.println(GREEN+"\nYour final score: " + score+RESET);
        }
       
        sc.close();
        
    }
    }
}
