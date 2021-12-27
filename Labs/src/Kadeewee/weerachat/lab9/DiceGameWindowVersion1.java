package kadeewee.weerachat.lab9;

/**
 * This program is DiceGameWindowVersion1
 * Show a window, titled "DiceGameWindow Version 1"
 * The program will display "High", "Low" and "Roll" buttons
 * The program will display a dice showing the points the user would like to display.
 * Class DiceGameWindowVersion1 which inherited from DiceGameWindow.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 26, 2021
 **/

import javax.swing.*;

public class DiceGameWindowVersion1 extends DiceGameWindow {
    public DiceGameWindowVersion1(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        super.initComponents();
        diceImageCanvas = new DiceImageCanvas(6); //กำหนดแต้มของลูกเต๋าที่จะแสดง
    }//กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    public void addComponents() {
        super.addComponents();
    }//เพิ่มส่วนประกอบต่างๆ
    public void setFrameFeatures() {
        super.setFrameFeatures();
    }//กำหนดคุณสมบัติ(Features)ของหน้าต่าง
    public static void createAndShowGUI() {
        DiceGameWindowVersion1 dgw = new DiceGameWindowVersion1("DiceGameWindow Version 1"); // //กำหนดชื่อให้ DiceGameWindowVersion1 และส่งค่า title ไปยังเมธอด DiceGameWindowVersion1(String title)
        dgw.addComponents(); //เรียกใช้เมธอด
        dgw.setFrameFeatures(); //เรียกใช้เมธอด
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }//ใช้สำหรับ Run โปรแกรม
}
