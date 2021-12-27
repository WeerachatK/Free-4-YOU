package kadeewee.weerachat.lab8;

/**
 * This program is PlayerFormV3
 * Show a window, titled "Player Form V3"
 * This program displays results similar to PlayerFormV2.
 * This program provides a panel for storing games.
 * Class PlayerFormV3 which inherited from PlayerFormV2.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 19, 2021
 **/

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2 {
    protected String[] gamesTxt;
    protected JPanel gamesPanel;
    protected JList gamesList;
    protected JLabel gamesLabel;
    //ประกาศตัวแปร
    public PlayerFormV3(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        super.initComponents();//เรียกใช้เมธอด initComponents() จากคลาส super หรือก็คือคลาส PlayerFormV2
        gamesTxt = new String[]{"Guess Number Game", "High-Low Game", "Monopoly Game"};
        //เพิ่มค่าในอาเรย์ gamesTxt เพื่อเป็นตัวเลือกใน gamesList
        gamesPanel = new JPanel(); //ประกาศส่วนเริ่มของ Panel
        gamesList = new JList(gamesTxt); //เพิ่ม gamesTxt เข้าไปใน gamesList เพื่อเป็นตัวเลือกใน List
        gamesLabel = new JLabel("Games:"); //กำหนดข้อความ(Label)
    }//กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    protected void addComponents() {
        super.addComponents(); //เรียกใช้เมธอด addComponents() จากคลาส super หรือก็คือคลาส PlayerFormV2
        gamesPanel.setLayout(layout);
        gamesPanel.add(gamesLabel);
        gamesPanel.add(gamesList);
        //เพิ่มองค์ประกอบใน gamesPanel
        contentsPanel2.add(genderPanel, BorderLayout.NORTH);
        contentsPanel2.add(playerPanel, BorderLayout.CENTER);
        contentsPanel2.add(gamesPanel, BorderLayout.SOUTH);
        //เพิ่มองค์ประกอบใน contentPanel2
        contentsPanel3.setLayout(new BorderLayout());
        contentsPanel3.add(noteLabel, BorderLayout.NORTH);
        contentsPanel3.add(scrollPane, BorderLayout.CENTER);
        contentsPanel3.add(buttonsPanel, BorderLayout.SOUTH);
        //เพิ่มองค์ประกอบใน contentPanel3
        mainPanel.add(contentsPanel, BorderLayout.NORTH);
        mainPanel.add(contentsPanel2, BorderLayout.CENTER);
        mainPanel.add(contentsPanel3, BorderLayout.SOUTH);
        //เพิ่มองค์ประกอบใน mainPanel
    }//เพิ่มส่วนประกอบต่างๆ
    public static void createAndShowGUI() {
        PlayerFormV3 msw = new PlayerFormV3("Player Form V3");//กำหนดชื่อให้ PlayerFormV3 และส่งค่า title ไปยังเมธอด PlayerFormV3
        msw.addComponents();//เรียกใช้เมธอด addComponents
        msw.setFrameFeatures();//เรียกใช้เมธอด setFrameFeatures() ที่ extends มาจาก superClass
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }//ใช้สำหรับ Run โปรแกรม
}
