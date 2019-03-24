import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainForm extends JFrame {

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 560;
    private static final int WINDOW_POS_X = 650;
    private static final int WINDOW_POS_Y = 250;

    private MainForm mainForm;
    private GameSettingsForm gameSettingsForm;

    MainForm() {

        setTitle("Крестики-нолики");


        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);


        setResizable(false);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MainGameField gameField = MainGameField.getInstance();

        JPanel buttonPanel = new JPanel(new GridLayout());

        add(gameField, BorderLayout.CENTER);

        add(buttonPanel, BorderLayout.SOUTH);

        JButton btnStart = new JButton("Новая игра");
        JButton btnEnd = new JButton("Выход");

        buttonPanel.add(btnStart);
        buttonPanel.add(btnEnd);

        setBackground(Color.blue);


        setVisible(true);


        gameSettingsForm = new GameSettingsForm(this);


        btnEnd.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnStart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Новая игра");
                gameSettingsForm.setVisible(true);
            }
        });
    }
}