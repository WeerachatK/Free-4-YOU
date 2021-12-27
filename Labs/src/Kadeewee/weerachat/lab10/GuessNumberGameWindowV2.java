package kadeewee.weerachat.lab10;

/**
 * This program is GuessNumberGameWindowV2
 * Show a window, titled "GuessNumberGameWindow  Version 2"
 * This program displays results similar to "GuessNumberGameWindow".
 * This program has a working principle similar to "GuessNumberGame" in lab6.
 * Class GuessNumberGameWindowV2 which inherited from GuessNumberGameWindow.
 * More in the gaming section
 *      - Press the number buttons to guess the correct number.
 *      - Disable buttons when answering correctly.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 5, 2021
 **/

import kadeewee.weerachat.lab9.GuessNumberGameWindow;
import javax.swing.*;
import java.awt.event.*;

public class GuessNumberGameWindowV2 extends GuessNumberGameWindow implements ActionListener {
    protected int correctNum;
    protected int answerNum;
    //ประกาศตัวแปร
    public GuessNumberGameWindowV2(String title) {
        super(title);
    } //กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        super.initComponents();
        correctNum = 1 + (int)(Math.random()*((10-1)+ 1 ));
    } //กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    protected void addComponents() {
        super.addComponents();
    } //เพิ่มส่วนประกอบต่างๆ
    public static void createAndShowGUI() {
        GuessNumberGameWindowV2 ggw = new GuessNumberGameWindowV2("GuessNumberGameWindow  Version 2"); //กำหนดชื่อให้ GuessNumberGameWindow และส่งค่า title ไปยังเมธอด GuessNumberGameWindow
        ggw.addComponents(); //เรียกใช้เมธอด
        ggw.addListeners();
        ggw.setFrameFeatures(); //เรียกใช้เมธอด
    }
    public void addListeners() {
       oneBT.addActionListener(this);
       twoBT.addActionListener(this);
       threeBT.addActionListener(this);
       fourBT.addActionListener(this);
       fiveBT.addActionListener(this);
       sixBT.addActionListener(this);
       sevenBT.addActionListener(this);
       eightBT.addActionListener(this);
       nineBT.addActionListener(this);
       tenBT.addActionListener(this);
    } //เพิ่มส่วนของตัวดำเนินการ
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } //ใช้สำหรับ Run โปรแกรม

    @Override
    public void actionPerformed(ActionEvent e) {
        Object srcObj = e.getSource();
        if (srcObj == oneBT) {
            answerNum = 1;
        } else if (srcObj == twoBT) {
            answerNum = 2;
        } else if (srcObj == threeBT) {
            answerNum = 3;
        } else if (srcObj == fourBT) {
            answerNum = 4;
        } else if (srcObj == fiveBT) {
            answerNum = 5;
        } else if (srcObj == sixBT) {
            answerNum = 6;
        } else if (srcObj == sevenBT) {
            answerNum = 7;
        } else if (srcObj == eightBT) {
            answerNum = 8;
        } else if (srcObj == nineBT) {
            answerNum = 9;
        } else {
            answerNum = 10;
        }//รับค่าตัวเลขจากปุ่มตัวเลข
        playGame(); //เรียกใช้เมธอด
    }//การดำเนินการของตัวดำเนินการ
    public void playGame() {
        if (answerNum > correctNum) {
            southTextField.setText("Lower");
        } else if (answerNum < correctNum) {
            southTextField.setText("Higher");
        } else {
            southTextField.setText("Congratulations!");
            disabledButton();
        }
    } //ใช้สำหรับเล่นเกม
    public void disabledButton() {
        oneBT.setEnabled(false);
        twoBT.setEnabled(false);
        threeBT.setEnabled(false);
        fourBT.setEnabled(false);
        fiveBT.setEnabled(false);
        sixBT.setEnabled(false);
        sevenBT.setEnabled(false);
        eightBT.setEnabled(false);
        nineBT.setEnabled(false);
        tenBT.setEnabled(false);
    } //ปิดการใช้งานปุ่มตัวเลข
}
