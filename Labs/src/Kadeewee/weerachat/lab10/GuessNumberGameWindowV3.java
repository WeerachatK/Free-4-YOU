package kadeewee.weerachat.lab10;

/**
 * This program is GuessNumberGameWindowV3
 * Show a window, titled "GuessNumberGameWindow  Version 3"
 * This program displays results similar to "GuessNumberGameWindow".
 * Class GuessNumberGameWindowV3 which inherited from GuessNumberGameWindowV2.
 * More in the gaming section
 *      - Press the number buttons to guess the correct number.
 *      - There is a maximum of 3 guesses, when the number of guesses runs out, it will display "No more tries".
 *      - Disable buttons when you have answered them correctly or the number of guesses has run out.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 5, 2021
 **/

import javax.swing.*;
import java.awt.event.ActionListener;

public class GuessNumberGameWindowV3 extends GuessNumberGameWindowV2 implements ActionListener {
    protected int maxTries;
    //ประกาศตัวแปร
    public GuessNumberGameWindowV3(String title) {
        super(title);
    } //กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        super.initComponents();
        maxTries = 3; //จำนวนในการเดา
    } //กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    public static void createAndShowGUI() {
        GuessNumberGameWindowV3 ggw = new GuessNumberGameWindowV3("GuessNumberGameWindow  Version 3"); //กำหนดชื่อให้ GuessNumberGameWindow และส่งค่า title ไปยังเมธอด GuessNumberGameWindow
        ggw.addComponents(); //เรียกใช้เมธอด
        ggw.addListeners();
        ggw.setFrameFeatures(); //เรียกใช้เมธอด
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } //ใช้สำหรับ Run โปรแกรม
    @Override
    public void playGame() {
        if (answerNum > correctNum) {
            southTextField.setText("Lower");
            maxTries--; //ลดจำนวนการเดา
        } else if (answerNum < correctNum) {
            southTextField.setText("Higher");
            maxTries--; //ลดจำนวนการเดา
        } else {
            southTextField.setText("Congratulations!");
            disabledButton(); //ปิดการใช้งานปุ่ม
        }
        if (maxTries == 0) { //จำนวนการเดาหมด
            southTextField.setText("No more tries");
            disabledButton(); //ปิดการใช้งานปุ่ม
        }
    }//ใช้สำหรับเล่นเกม
}
