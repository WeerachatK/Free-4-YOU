package kadeewee.weerachat.lab10;

/**
 * This program is GuessNumberGameWindowV3
 * Show a window, titled "GuessNumberGameWindow  Version 3"
 * This program displays results similar to "GuessNumberGameWindow".
 * Class GuessNumberGameWindowV3 which inherited from GuessNumberGameWindowV2.
 * Additional sections for determining the number of guesses.
 * More in the play section again.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 5, 2021
 **/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberGameWindowV4 extends GuessNumberGameWindowV3 implements ActionListener {
    protected JButton playAgain;
    protected JLabel numOfTries;
    protected JTextField numOfTriesTxt;
    protected JPanel gamePanel, numOfTriesPanel, playAgainPanel;
    //ประกาศตัวแปร
    public GuessNumberGameWindowV4(String title) {
        super(title);
    } //กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        super.initComponents();
        gamePanel = new JPanel();
        numOfTriesPanel = new JPanel();
        playAgainPanel = new JPanel();
        playAgain = new JButton("Play Again");
        numOfTries = new JLabel("Number of tries : ");
        numOfTriesTxt = new JTextField(3);
    } //กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    protected void addComponents() {
        super.addComponents();
        numOfTriesTxt.setText("3");
        numOfTriesTxt.setHorizontalAlignment(SwingConstants.CENTER);
        numOfTriesTxt.setFont(new Font("Serif", Font.BOLD, 16));
        gamePanel.setLayout(new BorderLayout());
        gamePanel.add(labelNorthPanel, BorderLayout.NORTH);
        gamePanel.add(buttonsPanel, BorderLayout.CENTER);
        gamePanel.add(labelSouthPanel, BorderLayout.SOUTH);
        numOfTriesPanel.add(numOfTries);
        numOfTriesPanel.add(numOfTriesTxt);
        playAgainPanel.add(playAgain);
        mainPanel.add(numOfTriesPanel, BorderLayout.NORTH);
        mainPanel.add(gamePanel, BorderLayout.CENTER);
        mainPanel.add( playAgainPanel, BorderLayout.SOUTH);
    }//เพิ่มส่วนประกอบต่างๆ
    public static void createAndShowGUI() {
        GuessNumberGameWindowV4 ggw = new GuessNumberGameWindowV4("GuessNumberGameWindow  Version 4 (Bonus)"); //กำหนดชื่อให้ GuessNumberGameWindow และส่งค่า title ไปยังเมธอด GuessNumberGameWindow
        ggw.addComponents(); //เรียกใช้เมธอด
        ggw.addListeners();
        ggw.setFrameFeatures(); //เรียกใช้เมธอด
    }
    public void addListeners() {
        super.addListeners();
        playAgain.addActionListener(this);
        numOfTriesTxt.addActionListener(this);
    }//เพิ่มส่วนของตัวดำเนินการ
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } //ใช้สำหรับ Run โปรแกรม
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object srcObj = e.getSource();
        if (srcObj == playAgain) {
            correctNum = 1 + (int)(Math.random()*((10-1)+ 1 ));
            southTextField.setDisabledTextColor(Color.GRAY);
            southTextField.setBackground(Color.WHITE);
            southTextField.setText("Play again");
            maxTries = Integer.parseInt(numOfTriesTxt.getText());
            enabledButton();
        }
        if (srcObj instanceof JTextField) {
            maxTries = Integer.parseInt(numOfTriesTxt.getText());
            JOptionPane.showMessageDialog(null, "Number of tries is updated to " + numOfTriesTxt.getText());
            southTextField.setDisabledTextColor(Color.GRAY);
            southTextField.setBackground(Color.WHITE);
            southTextField.setText("Play again");
        }
        if (answerNum ==correctNum) {
            southTextField.setDisabledTextColor(Color.BLACK);
            southTextField.setBackground(Color.YELLOW);
        }
        if (maxTries == 0) {
            southTextField.setDisabledTextColor(Color.BLACK);
            southTextField.setBackground(Color.PINK);
        }
    }//การดำเนินการของตัวดำเนินการ
    public void enabledButton() {
        oneBT.setEnabled(true);
        twoBT.setEnabled(true);
        threeBT.setEnabled(true);
        fourBT.setEnabled(true);
        fiveBT.setEnabled(true);
        sixBT.setEnabled(true);
        sevenBT.setEnabled(true);
        eightBT.setEnabled(true);
        nineBT.setEnabled(true);
        tenBT.setEnabled(true);
    } //เปิดใช้งานปุ่ม
}
