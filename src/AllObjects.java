import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class AllObjects {
    int amountOfComputerWins = 0;
    int amountOfPlayerWins = 0;
    ArrayList<JButton> listOfButtons = new ArrayList<>();
    ArrayList<String> listOfStrings = new ArrayList<>();

    JFrame mainFrame = new JFrame("Крестики-Нолики");

    JButton place1 = new JButton("");
    JButton place2 = new JButton("");
    JButton place3 = new JButton("");
    JButton place4 = new JButton("");
    JButton place5 = new JButton("");
    JButton place6 = new JButton("");
    JButton place7 = new JButton("");
    JButton place8 = new JButton("");
    JButton place9 = new JButton("");

    JLabel amountOfWins = new JLabel(amountOfPlayerWins + ":" + amountOfComputerWins);

    Font fontOfPlaces = new Font("", Font.BOLD, 40);

    int typePlayer;
    int typeComputer;
}