package Mod2.Swing;

import javax.swing.*;

public class Mod2Assignment {

    public static void main(String[] args) {
        String[] questions = 
        {
            "How many players played well this season?\nA.4\nB.7\nC.9",
            "How many points did Boswell score this season?\nA.3\nB.40\nC.114",
            "How many penalties did the Steelers have in game 3 of the 2023 season?\nA.1\nB.3\nC.0"
        };

        char[] answers = {'C', 'C', 'B'};
        char ans = ' ';
        int x, correct = 0;
        String entry;
        boolean isGood;

        StringBuilder wrongAnswers = new StringBuilder();

        for (x = 0; x < questions.length; ++x) {
            isGood = false;
            int firstError = 0;
            while (!isGood) 
            {
                isGood = true;
                entry = JOptionPane.showInputDialog(null, questions[x]);
                ans = entry.charAt(0);
                if (ans != 'A' && ans != 'B' && ans != 'C') {
                    isGood = false;
                    if (firstError == 0) {
                        questions[x] = questions[x] +
                                "\nYour answer must be A, B, or C.";
                        firstError = 1;
                    }
                }
            }
            if (ans == answers[x]) 
            {
                ++correct;
                JOptionPane.showMessageDialog(null, "Correct!");
            } else 
            {
                wrongAnswers.append("Question ").append(x + 1).append(": ")
                        .append(questions[x]).append("\nYour answer: ").append(ans)
                        .append("\nThe correct answer is ").append(answers[x]).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(null, "You received " + correct +
                " right and\n" + (questions.length - correct) + " wrong");

        if (wrongAnswers.length() > 0) {
            JOptionPane.showMessageDialog(null, "Here are the questions you got wrong:\n\n" + wrongAnswers);
        }
    }
}
