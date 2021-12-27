package kadeewee.weerachat.lab11;

/**
 * This program is PlayerFormV10
 * Show a window, titled "Player Form V10"
 * This program displays results similar to PlayerFormV9.
 * Class PlayerFormV810 which inherited from PlayerFormV9.
 * Added functionality for open and save files.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 20, 2021
 **/

import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PlayerFormV10 extends PlayerFormV9 {
    protected List<String> readLines;
    protected FileWriter fWriter;
    protected PrintWriter pWriter;
    protected int[] gameIndices = new int[3];
    protected int size;
    //ประกาศตัวแปร
    public PlayerFormV10(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    public static void createAndShowGUI() {
        PlayerFormV10 msw = new PlayerFormV10("Player Form V10");//กำหนดชื่อให้ PlayerFormV4 และส่งค่า title ไปยังเมธอด PlayerFormV4
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
    public void saveFile() {
        super.saveFile();
        try {
            fWriter = new FileWriter(file + ".txt"); //บึกทึกไฟล์เป็นไฟล์.txt
            pWriter = new PrintWriter(fWriter);
            pWriter.println(nameTxt.getText());
            pWriter.println(nationalityTxt.getText());
            pWriter.println(birthTxt.getText());
            if (maleRB.isSelected()) {
                pWriter.println("Male");
            }
            if (femaleRB.isSelected()) {
                pWriter.println("Female");
            }
            pWriter.println((String)playerBox.getSelectedItem());
            List<String> selectedGame = gamesList.getSelectedValuesList();
            int numSelected = selectedGame.size();
            for (int i = 0; i < numSelected; i++) {
                pWriter.println(selectedGame.get(i));
            }
            //อ่านค่าจากโปรแกรมแล้วเขียนไฟล์
            fWriter.close();
            pWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } //ก่ารทำงานเมื่อบันทึกไฟล์
    public void openFile() {
        super.openFile();
        try {
            readLines = Files.readAllLines(Paths.get(String.valueOf(file))) ; //อ่านไฟล์ที่เลือกแล้วเก็บค่าแต่ละบรรทัดไว้ในList
            size = readLines.size(); //หาขนาดของList เพื่อให้ทราบว่าไฟล์นั้นมีกี่บรรทัด
            nameTxt.setText(readLines.get(0));
            nationalityTxt.setText(readLines.get(1));
            birthTxt.setText(readLines.get(2));
            if (readLines.get(3).equalsIgnoreCase("male")) {
                maleRB.setSelected(true);
            } else {
                femaleRB.setSelected(true);
            }
            if (readLines.get(4).equalsIgnoreCase("amateur")) {
                playerBox.setSelectedItem("Amateur");
            } else if (readLines.get(4).equalsIgnoreCase("beginner")) {
                playerBox.setSelectedItem("Beginner");
            } else {
                playerBox.setSelectedItem("Professional");
            }
            if (size == 6) { //ถ้ามี 6 บรรทัด
                game1();
            } else if (size == 7) { //ถ้ามี 7 บรรทัด
                game2();
            } else if (size == 8) { //ถ้ามี 8 บรรทัด
                game3();
            }
            gamesList.setSelectedIndices(gameIndices);
            //แสดงผลตามไฟล์ที่อ่าน
        } catch (IOException e) {
            e.printStackTrace();
        }
    } //การทำเงินเมื่อเปิดไฟล์
    public void game1() {
        if (readLines.get(5).equalsIgnoreCase("Guess Number Game")) {
            gameIndices[0] = 0;
        } else {
            gameIndices[0] = -1;
        }
        if (readLines.get(5).equalsIgnoreCase("High-Low Game")) {
            gameIndices[1] = 1;
        } else {
            gameIndices[1] = -1;
        }
        if (readLines.get(5).equalsIgnoreCase("Monopoly Game")) {
            gameIndices[2] = 2;
        } else {
            gameIndices[2] = -1;
        }
    } //เลือก 1 เกม
    public void game2() {
        game1();
        if (readLines.get(6).equalsIgnoreCase("Guess Number Game")) {
            gameIndices[0] = 0;
        } else if (readLines.get(6).equalsIgnoreCase("High-Low Game")) {
            gameIndices[1] = 1;
        } else if (readLines.get(6).equalsIgnoreCase("Monopoly Game")) {
            gameIndices[2] = 2;
        }
    } //เลือก 2 เกม
    public void game3() {
        game1();
        game2();
        if (readLines.get(7).equalsIgnoreCase("Guess Number Game")) {
            gameIndices[0] = 0;
        } else if (readLines.get(7).equalsIgnoreCase("High-Low Game")) {
            gameIndices[1] = 1;
        } else if (readLines.get(7).equalsIgnoreCase("Monopoly Game")) {
            gameIndices[2] = 2;
        }
    } //เลือก 3 เกม

}
