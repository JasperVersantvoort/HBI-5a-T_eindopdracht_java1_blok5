import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Cpat_gui {
    private JPanel panel1;
    private JTextField geefBestandTextField;
    private JButton blader1Button;
    private JTextField geefBestandTextField1;
    private JButton blader2Button;
    private JButton analyseerHetConsensusProteoomButton;
    private JTextArea textArea1;
    private JPanel tekenpanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cpat_gui");
        frame.setContentPane(new Cpat_gui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(700, 600));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public Cpat_gui() {
        tekenpanel = new JPanel();
        tekenpanel.setPreferredSize(new Dimension(600, 100));
        tekenpanel.setBackground(Color.white);
        panel1.add(tekenpanel);
        tekenpanel.setVisible(true);
        blader1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File selectedFile;
                JFileChooser fileChooser = new JFileChooser();
                int reply = fileChooser.showOpenDialog(null);
                if (reply == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    geefBestandTextField.setText(selectedFile.getAbsolutePath());
                }

            }
        });
        blader2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File selectedFile;
                JFileChooser fileChooser = new JFileChooser();
                int reply = fileChooser.showOpenDialog(null);
                if (reply == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    geefBestandTextField1.setText(selectedFile.getAbsolutePath());
                }

            }
        });
    }
}
