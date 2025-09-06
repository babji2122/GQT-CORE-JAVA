package com.gqt.corejava.projects;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class QuizMasterGUI {

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

    private JFrame frame;
    private JLabel questionLabel, prizeLabel;
    private JButton[] optionButtons = new JButton[4];
    private JButton lifelineAudienceBtn, lifelineFiftyBtn, quitBtn;
    private ArrayList<Question> questions = new ArrayList<>();
    private int currentQuestionIndex = 0;
    private int currentPrize = 0;
    private boolean audienceUsed = false;
    private boolean fiftyFiftyUsed = false;
    private final int[] prizeMoney = {5000, 10000, 20000, 40000, 50000, 100000, 250000, 500000, 1000000, 2000000};

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizMasterGUI().createAndShowGUI());
    }

    private void createAndShowGUI() {
        loadQuestions();

        frame = new JFrame("Quiz Master");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Top Panel for question
        JPanel topPanel = new JPanel(new BorderLayout());
        questionLabel = new JLabel("Question", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        topPanel.add(questionLabel, BorderLayout.CENTER);

        prizeLabel = new JLabel("Prize: ₹0", SwingConstants.RIGHT);
        prizeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        topPanel.add(prizeLabel, BorderLayout.SOUTH);
        frame.add(topPanel, BorderLayout.NORTH);

        // Center panel for options
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        for (int i = 0; i < 4; i++) {
            char option = (char) ('A' + i);
            optionButtons[i] = new JButton(option + ". ");
            int finalI = i;
            optionButtons[i].addActionListener(e -> checkAnswer(finalI));
            centerPanel.add(optionButtons[i]);
        }
        frame.add(centerPanel, BorderLayout.CENTER);

        // Bottom panel for lifelines and quit
        JPanel bottomPanel = new JPanel();
        lifelineAudienceBtn = new JButton("Audience");
        lifelineFiftyBtn = new JButton("50-50");
        quitBtn = new JButton("Quit");

        lifelineAudienceBtn.addActionListener(e -> useAudienceLifeline());
        lifelineFiftyBtn.addActionListener(e -> useFiftyFiftyLifeline());
        quitBtn.addActionListener(e -> quitGame());

        bottomPanel.add(lifelineAudienceBtn);
        bottomPanel.add(lifelineFiftyBtn);
        bottomPanel.add(quitBtn);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        showQuestion();
        frame.setVisible(true);
    }

    private void showQuestion() {
        if (currentQuestionIndex >= questions.size()) {
            JOptionPane.showMessageDialog(frame, "🎉 You completed the quiz!\nTotal Prize: ₹" + currentPrize);
            System.exit(0);
        }

        Question q = questions.get(currentQuestionIndex);
        questionLabel.setText("<html>Q" + (currentQuestionIndex + 1) + ": " + q.question + "</html>");
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setEnabled(true);
            optionButtons[i].setText((char) ('A' + i) + ". " + q.options[i]);
        }

        prizeLabel.setText("Prize: ₹" + currentPrize);
    }

    private void checkAnswer(int selectedIndex) {
        Question q = questions.get(currentQuestionIndex);
        if (selectedIndex == q.correctIndex) {
            currentPrize = prizeMoney[currentQuestionIndex];
            JOptionPane.showMessageDialog(frame, "✅ Correct! You won ₹" + currentPrize);
            currentQuestionIndex++;
            showQuestion();
        } else {
            int fallbackPrize = (currentQuestionIndex < 4) ? 0 : (currentQuestionIndex < 7) ? prizeMoney[4] : prizeMoney[6];
            JOptionPane.showMessageDialog(frame, "❌ Wrong Answer!\nYou take home ₹" + fallbackPrize);
            System.exit(0);
        }
    }

    private void useAudienceLifeline() {
        if (audienceUsed) {
            JOptionPane.showMessageDialog(frame, "Audience lifeline already used.");
            return;
        }

        audienceUsed = true;
        Question q = questions.get(currentQuestionIndex);
        int chance = new Random().nextInt(100);
        int suggestIndex = (chance < 80) ? q.correctIndex : new Random().nextInt(4);

        JOptionPane.showMessageDialog(frame, "📞 Audience suggests: " + (char) ('A' + suggestIndex));
        lifelineAudienceBtn.setEnabled(false);
    }

    private void useFiftyFiftyLifeline() {
        if (fiftyFiftyUsed) {
            JOptionPane.showMessageDialog(frame, "50-50 lifeline already used.");
            return;
        }

        fiftyFiftyUsed = true;
        Question q = questions.get(currentQuestionIndex);
        ArrayList<Integer> incorrectOptions = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (i != q.correctIndex) incorrectOptions.add(i);
        }
        Collections.shuffle(incorrectOptions);
        int toKeep = incorrectOptions.get(0);

        for (int i = 0; i < 4; i++) {
            if (i != q.correctIndex && i != toKeep) {
                optionButtons[i].setEnabled(false);
            }
        }
        lifelineFiftyBtn.setEnabled(false);
    }

    private void quitGame() {
        int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want to quit?", "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(frame, "🎉 You chose to quit!\nTotal Prize: ₹" + currentPrize);
            System.exit(0);
        }
    }

    private void loadQuestions() {
        questions.add(new Question("Where was Mahatma Gandhi born?", new String[]{"Porbandar", "Allahabad", "Cuttack", "Dhudike"}, 0));
        questions.add(new Question("What is the capital of India?", new String[]{"Bengaluru", "Kolkata", "Mumbai", "New Delhi"}, 3));
        questions.add(new Question("What was the old name of Karnataka?", new String[]{"Madras", "Mysore", "Madhurai", "Meerut"}, 1));
        questions.add(new Question("What is the national fruit of India?", new String[]{"Apple", "Mango", "Banana", "Orange"}, 1));
        questions.add(new Question("The green planet in the solar system is?", new String[]{"Mars", "Uranus", "Venus", "Earth"}, 1));
        questions.add(new Question("Father of Indian Missile Technology is?", new String[]{"Dr.Homi Bhabha", "Dr.Chidambaram", "Dr.APJ Abdul Kalam", "Dr.U R Rao"}, 2));
        questions.add(new Question("In which year was the first international modern Olympic held?", new String[]{"1896", "1900", "1912", "1924"}, 0));
        questions.add(new Question("How many bones are in the body of an adult human?", new String[]{"330", "206", "250", "210"}, 1));
        questions.add(new Question("Which of the following is the largest living bird?", new String[]{"Eagle", "Kiwi", "Peacock", "Ostrich"}, 3));
        questions.add(new Question("In which part of our body is food absorbed?", new String[]{"Small Intestine", "Large Intestine", "Stomach", "Liver"}, 0));
    }
}


