package kadeewee.weerachat.lab11;

/**
 * This program is PlayerFormV9
 * Show a window, titled "Player Form V9"
 * This program displays results similar to PlayerFormV8.
 * Class PlayerFormV9 which inherited from PlayerFormV8.
 * Add the check for null values.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 20, 2021
 **/

import kadeewee.weerachat.lab10.PlayerFormV8;
import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PlayerFormV9 extends PlayerFormV8 {
    public PlayerFormV9(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    public static void createAndShowGUI() {
        PlayerFormV9 msw = new PlayerFormV9("Player Form V9");//กำหนดชื่อให้ PlayerFormV4 และส่งค่า title ไปยังเมธอด PlayerFormV4
        msw.addComponents();//เรียกใช้เมธอด addComponents
        msw.addListeners();
        msw.setJMenuBar(msw.menuBar);//เรียกใช้ menu bar
        msw.setFrameFeatures();//เรียกใช้เมธอด setFrameFeatures() ที่ extends มาจาก superClass
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }//ใช้สำหรับ Run โปรแกรม
    public boolean handleSubmitButton() {
        if ((nameTxt.getText().isEmpty()) || (nationalityTxt.getText().isEmpty()) || (birthTxt.getText().isEmpty())) { //ตรวจสอบว่ามีค่าว่างไหม
            if (nameTxt.getText().isEmpty()) {
                resultBuffer.append("Name is empty\n");
            }
            if (nationalityTxt.getText().isEmpty()) {
                resultBuffer.append("Nationality is empty\n");
            }
            if (birthTxt.getText().isEmpty()) {
                resultBuffer.append("Birthdate is empty\n");
            }
            JOptionPane.showMessageDialog(this, resultBuffer.toString());
        } else {
            String date = birthTxt.getText(); //รับค่าวันที่
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //รูปแบบของวันที่
            try {
                LocalDate.parse(date, dateFormat); //ทำการตรวจสอบค่าวันที่ที่รับมากับรูปแบบของวันที่
            } catch (DateTimeParseException e) { //วันที่ผิดรูปแบบ
                JOptionPane.showMessageDialog(this, "Please enter date in the format dd-MM-yyyy such as 31-02-2021");
                return false;
            }
            if (gamesList.isSelectionEmpty()) { //ตรวจสอบว่าเลือกเกมหรือยัง
                JOptionPane.showMessageDialog(this, "You have not selected any game");
            } else {
                super.handleSubmitButton(); //เรียกใช้เมธอด handleSubmitButton()
            }
        }
        return false;
    } //เพิ่มเติมในส้วนของการกดปุ่ม Submit
}
