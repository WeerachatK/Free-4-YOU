package kadeewee.weerachat.lab9;

/**
 * This program is DiceGameWindow
 * This program is adapted from the template of the class attached to the problem.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 26, 2021
 **/

import kadeewee.weerachat.lab6.*;
import javax.swing.*;
import java.awt.*;

public class DiceGameWindow extends JFrame {
    protected DiceImageCanvas diceImageCanvas;
    protected DiceGame diceGame;
    protected int diceRoll, width = 400, height = 300;
    protected JPanel buttonsPanel, mainPanel;
    protected JButton rollButton, highButton, lowButton;
    //ประกาศตัวแปร

    public DiceGameWindow(String title) {
        super(title);
    } //กำหนดชื่อของหน้าต่าง(Title)

    public DiceGameWindow(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void setFrameFeatures() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//กำหนดคุณสมบัติ(Features)ของหน้าต่าง
    protected void initComponents() {
        mainPanel = (JPanel) this.getContentPane();
        diceGame = new DiceGame();
        diceRoll = diceGame.getDiceRoll();
        //diceImageCanvas = new DiceImageCanvas(diceRoll); //สุ่มเลขลูกเต๋า
        buttonsPanel = new JPanel(new FlowLayout());
        rollButton = new JButton("Roll");
        highButton = new JButton("High");
        lowButton = new JButton("Low");
        //ใส่ข้อความปุ่ม
    }//กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    public void addComponents() {
        initComponents(); //เรียกใช้เมธอด
        buttonsPanel.add(highButton);
        buttonsPanel.add(lowButton);
        buttonsPanel.add(rollButton);
        //เพิ่มปุ่มเข้าไปใน buttonsPanel
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(buttonsPanel, BorderLayout.NORTH);
        mainPanel.add(diceImageCanvas, BorderLayout.CENTER);
        //เพิ่มองค์ประกอบใน mainPanel
    }//เพิ่มส่วนประกอบต่างๆ
}
