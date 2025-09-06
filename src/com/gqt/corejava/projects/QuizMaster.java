package com.gqt.corejava.projects;
import java.util.*;
public class QuizMaster {

		
		  
		static Scanner scanner = new Scanner(System.in);

		    static class Question {
		        String question;
		        String[] options;
		        int correctIndex;

		        public Question(String question, String[] options, int correctIndex) {
		            this.question = question;
		            this.options = options;
		            this.correctIndex = correctIndex;
		        }
		    }

		    static List<Question> questions = new ArrayList<>();
		    static boolean audienceUsed = false;
		    static boolean fiftyFiftyUsed = false;
		    static int currentPrize = 0;
		    static final int[] prizeMoney = {5000, 10000, 20000, 40000, 50000, 100000, 250000, 500000, 1000000, 2000000};

		    public static void main(String[] args) {
		        loadQuestions();

		        for (int i = 0; i < questions.size(); i++) {
		            Question q = questions.get(i);
		            System.out.println("\nQ" + (i + 1) + ": " + q.question);
		            for (int j = 0; j < q.options.length; j++) {
		                System.out.println((char) ('A' + j) + ". " + q.options[j]);
		            }

		            boolean validInput = false;
		            while (!validInput) {
		                System.out.println("\nChoose an option: A/B/C/D");
		                if (!audienceUsed || !fiftyFiftyUsed) {
		                    System.out.println("Or type 'L' for lifeline or 'Q' to quit");
		                } else {
		                    System.out.println("Or type 'Q' to quit");
		                }

		                String input = scanner.nextLine().toUpperCase();

		                if (input.equals("L")) {
		                    if (audienceUsed && fiftyFiftyUsed) {
		                        System.out.println("No lifelines left. Choose an option.");
		                    } else {
		                        validInput = useLifeline(q);
		                    }
		                } else if (input.equals("Q")) {
		                    printPurple("You chose to quit! 🎉 You won: ₹" + currentPrize);
		                    return;
		                } else if ("ABCD".contains(input)) {
		                    int chosenIndex = input.charAt(0) - 'A';
		                    if (chosenIndex == q.correctIndex) {
		                        currentPrize = prizeMoney[i];
		                        printGreen("Correct! 🎉 You won ₹" + currentPrize);
		                    } else {
		                        System.out.println();
		                        printRed("Wrong Answer! ❌");
		                        if (i < 4) {
		                            currentPrize = 0;
		                        } else if (i >= 4 && i < 7) {
		                            currentPrize = prizeMoney[4];
		                        } else if (i >= 7) {
		                            currentPrize = prizeMoney[6];
		                        }
		                        printRed("Game Over! You take home ₹" + currentPrize);
		                        return;
		                    }
		                    validInput = true;
		                } else {
		                    System.out.println("Invalid input. Try again.");
		                }
		            }
		        }

		        printPurple("Congratulations! 🎊 You completed the game and won ₹" + currentPrize);
		    }

		    static boolean useLifeline(Question q) {
		        System.out.println("Available Lifelines:");
		        if (!audienceUsed) System.out.println("1. Audience Phone");
		        if (!fiftyFiftyUsed) System.out.println("2. 50-50");
		        System.out.println("3. Cancel");

		        String choice = scanner.nextLine();

		        if (choice.equals("1") && !audienceUsed) {
		            audienceUsed = true;
		            int chance = new Random().nextInt(100);
		            int suggestIndex = (chance < 80) ? q.correctIndex : new Random().nextInt(4);
		            System.out.println("Audience suggests: " + (char) ('A' + suggestIndex));
		            return false;
		        } else if (choice.equals("2") && !fiftyFiftyUsed) {
		            fiftyFiftyUsed = true;
		            List<Integer> incorrectOptions = new ArrayList<>();
		            for (int i = 0; i < 4; i++) {
		                if (i != q.correctIndex) incorrectOptions.add(i);
		            }
		            Collections.shuffle(incorrectOptions);
		            int removed1 = incorrectOptions.get(0);
		            int removed2 = incorrectOptions.get(1);

		            System.out.println("50-50 Lifeline used. Remaining options:");
		            for (int i = 0; i < 4; i++) {
		                if (i == q.correctIndex || i == incorrectOptions.get(2)) {
		                    System.out.println((char) ('A' + i) + ". " + q.options[i]);
		                }
		            }
		            return false;
		        } else if (choice.equals("3")) {
		            return false;
		        } else {
		            System.out.println("Invalid lifeline or already used.");
		            return false;
		        }
		    }

		    static void loadQuestions() {
		        questions.add(new Question("where was Mahatma Gandhi born?", new String[]{"Porbandar", "Allahabad", "Cuttack", "Dhudike"}, 0));
		        questions.add(new Question("what is capital of India?", new String[]{"Bengaluru", "Kolkata", "Mumbai", "New Delhi"}, 3));
		        questions.add(new Question("What was the old name of karnataka ?", new String[]{"Madras", "Mysore", "Madhurai", "Meerut"}, 1));
		        questions.add(new Question("what is the national fruit of India?", new String[]{"Apple", "Mango", "Banana", "Orange"}, 1));
		        questions.add(new Question("the green planet in the solar system is ?", new String[]{"Mars", "Uranus", "Venus", "Earth"}, 1));
		        questions.add(new Question("Father of Indian Missile Technology is?", new String[]{"Dr.Homi Bhabha", "Dr.Chidambaram", "Dr.APJ Abdul Kalam", "Dr.U R Rao"}, 2));
		        questions.add(new Question("In which year was the first internatuonal modren olympiad held ?", new String[]{"1896", "1900", "1912", "1924"}, 0));
		        questions.add(new Question("How many bones are in the body of an adult human?", new String[]{"330", "206", "250", "210"}, 1));
		        questions.add(new Question("which of the following is the largest living bird ?", new String[]{"Eagle", "Kiwi", "Peacock", "Ostrich"}, 3));
		        questions.add(new Question("In which part of our body food gets absorbed?", new String[]{"Small Intestine", "Large Intestine", "Stomach", "Liver"}, 0));
		    }

		    static void printGreen(String message) {
		        System.out.println("\u001B[32m" + message + "\u001B[0m");
		    }

		    static void printRed(String message) {
		        System.out.println("\u001B[31m" + message + "\u001B[0m");
		    }

		    static void printPurple(String message) {
		        System.out.println("\u001B[35m" + message + "\u001B[0m");
		    }
	}

