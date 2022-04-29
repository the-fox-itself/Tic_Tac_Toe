import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainGame extends AllObjects {
    void mainGame() {
        listOfButtons.add(place1);
        listOfButtons.add(place2);
        listOfButtons.add(place3);
        listOfButtons.add(place4);
        listOfButtons.add(place5);
        listOfButtons.add(place6);
        listOfButtons.add(place7);
        listOfButtons.add(place8);
        listOfButtons.add(place9);
        listOfStrings.add("O");
        listOfStrings.add("X");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        mainFrame.setResizable(false);
        mainFrame.setSize(300,380);
        mainFrame.setLocationRelativeTo(null);
        for (JButton button : listOfButtons) {
            button.setFont(fontOfPlaces);
        }
        amountOfWins.setFont(fontOfPlaces);
        place1.addActionListener(new CrossOrNull1());
        place2.addActionListener(new CrossOrNull2());
        place3.addActionListener(new CrossOrNull3());
        place4.addActionListener(new CrossOrNull4());
        place5.addActionListener(new CrossOrNull5());
        place6.addActionListener(new CrossOrNull6());
        place7.addActionListener(new CrossOrNull7());
        place8.addActionListener(new CrossOrNull8());
        place9.addActionListener(new CrossOrNull9());
        for (JButton button : listOfButtons) {
            mainFrame.add(button);
        }
        mainFrame.add(amountOfWins);
        amountOfWins.setBounds(115, 280, 500, 100);
        place1.setBounds(0,0,100,100);
        place2.setBounds(100,0,100,100);
        place3.setBounds(200,0,100,100);
        place4.setBounds(0,100,100,100);
        place5.setBounds(100,100,100,100);
        place6.setBounds(200,100,100,100);
        place7.setBounds(0,200,100,100);
        place8.setBounds(100,200,100,100);
        place9.setBounds(200,200,100,100);
        playerChoose();
    }


    private void playerChoose() {
        amountOfWins.setText(amountOfPlayerWins + ":" + amountOfComputerWins);
        typePlayer = (int) (Math.random() * 2);
        if (typePlayer == 1) {
            System.out.println("Вы играете за Крестиков.");
            typeComputer = 0;
            mainFrame.setVisible(true);
        }
        if (typePlayer == 0) {
            System.out.println("Вы играете за Ноликов.");
            typeComputer = 1;
            mainFrame.setVisible(true);
        }
    }

    private void computerRunning() {
        while (true) {
            int randomButton = (int) (Math.random() * 10);
            if (randomButton != 0) {
                if (!listOfButtons.get(randomButton-1).getText().equals("O") && !listOfButtons.get(randomButton-1).getText().equals("X")) {
                    if (typeComputer == 1) {
                        listOfButtons.get(randomButton-1).setText("X");
                        break;
                    } else {
                        listOfButtons.get(randomButton-1).setText("O");
                        break;
                    }
                }
                if (!place1.getText().equals("") && !place2.getText().equals("") && !place3.getText().equals("") && !place4.getText().equals("") && !place5.getText().equals("")
                        && !place6.getText().equals("") && !place7.getText().equals("") && !place8.getText().equals("") && !place9.getText().equals("")) {
                    System.out.println("Ничья!");
                    for ( JButton jButton : listOfButtons) {
                        jButton.setText("");
                    }
                    playerChoose();
                }
            }
        }
        if (!place1.getText().equals("") && !place2.getText().equals("") && !place3.getText().equals("") && !place4.getText().equals("") && !place5.getText().equals("")
                && !place6.getText().equals("") && !place7.getText().equals("") && !place8.getText().equals("") && !place9.getText().equals("")) {
            System.out.println("Ничья!");
            for ( JButton jButton : listOfButtons) {
                jButton.setText("");
            }
            playerChoose();
        }
    }

    private boolean helpMethod1() {
        if (typePlayer == 1) {
            System.out.println("Вы выиграли!");
            amountOfPlayerWins++;
            System.out.println(amountOfWins.getText());
            return true;
        } else {
            System.out.println("Вы проиграли.");
            amountOfComputerWins++;
            System.out.println(amountOfWins.getText());
            return true;
        }
    }

    private boolean helpMethod2() {
        if (typePlayer == 0) {
            System.out.println("Вы выиграли!");
            amountOfPlayerWins++;
            System.out.println(amountOfWins.getText());
            return true;
        } else {
            System.out.println("Вы проиграли.");
            amountOfComputerWins++;
            System.out.println(amountOfWins.getText());
            return true;
        }
    }

    private void ifWin() {
        boolean ifThree = false;
        if (place1.getText().equals("X") && place2.getText().equals("X") && place3.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place1.getText().equals("O") && place2.getText().equals("O") && place3.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (place4.getText().equals("X") && place5.getText().equals("X") && place6.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place4.getText().equals("O") && place5.getText().equals("O") && place6.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (place7.getText().equals("X") && place8.getText().equals("X") && place9.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place7.getText().equals("O") && place8.getText().equals("O") && place9.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (place1.getText().equals("X") && place4.getText().equals("X") && place7.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place1.getText().equals("O") && place4.getText().equals("O") && place7.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (place2.getText().equals("X") && place5.getText().equals("X") && place8.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place2.getText().equals("O") && place5.getText().equals("O") && place8.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (place3.getText().equals("X") && place6.getText().equals("X") && place9.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place3.getText().equals("O") && place6.getText().equals("O") && place9.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (place1.getText().equals("X") && place5.getText().equals("X") && place9.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place1.getText().equals("O") && place5.getText().equals("O") && place9.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (place3.getText().equals("X") && place5.getText().equals("X") && place7.getText().equals("X")) {
            ifThree = helpMethod1();
        }
        if (place3.getText().equals("O") && place5.getText().equals("O") && place7.getText().equals("O")) {
            ifThree = helpMethod2();
        }
        if (ifThree) {
            for ( JButton jButton : listOfButtons) {
                jButton.setText("");
            }
            playerChoose();
        }
    }

    private void CrossOrNull(int numberOfPlace) {
        if (!listOfButtons.get(numberOfPlace-1).getText().equals("X") && !listOfButtons.get(numberOfPlace-1).getText().equals("O")) {
            if (typePlayer == 1) {
                listOfButtons.get(numberOfPlace - 1).setText("X");
            } else {
                listOfButtons.get(numberOfPlace - 1).setText("O");
            }
            ifWin();
            computerRunning();
            ifWin();
        }
    }

    //События кнопок.

    class CrossOrNull1 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(1); }
    }
    class CrossOrNull2 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(2); }
    }
    class CrossOrNull3 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(3); }
    }
    class CrossOrNull4 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(4); }
    }
    class CrossOrNull5 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(5); }
    }
    class CrossOrNull6 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(6); }
    }
    class CrossOrNull7 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(7); }
    }
    class CrossOrNull8 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(8); }
    }
    class CrossOrNull9 implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) { CrossOrNull(9); }
    }
}