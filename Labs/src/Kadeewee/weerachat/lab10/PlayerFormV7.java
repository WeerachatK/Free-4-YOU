package kadeewee.weerachat.lab10;

/**
 * This program is PlayerFormV7
 * Show a window, titled "Player Form V7"
 * This program displays results similar to PlayerFormV6.
 * Class PlayerFormV7 which inherited from PlayerFormV6.
 * More on the part of the action when choosing a games.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 5, 2021
 **/

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class PlayerFormV7 extends PlayerFormV6 implements ListSelectionListener {
    public PlayerFormV7(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    protected void addComponents() {
        super.addComponents();
        gamesList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //สามารถเลือกได้มากกว่า1
    } //เพิ่มส่วนประกอบต่างๆ
    public static void createAndShowGUI() {
        PlayerFormV7 msw = new PlayerFormV7("Player Form V7");//กำหนดชื่อให้ PlayerFormV4 และส่งค่า title ไปยังเมธอด PlayerFormV4
        msw.addComponents();//เรียกใช้เมธอด addComponents
        msw.addListeners();
        msw.setJMenuBar(msw.menuBar);//เรียกใช้ menu bar
        msw.setFrameFeatures();//เรียกใช้เมธอด setFrameFeatures() ที่ extends มาจาก superClass
    }
    public void addListeners() {
        super.addListeners();
        gamesList.addListSelectionListener(this);
    } //เพิ่มส่วนของตัวดำเนินการ
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }//ใช้สำหรับ Run โปรแกรม
    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting();
        StringBuffer message = new StringBuffer();
        if (!isAdjusting) {
            List<String> selectedGame = gamesList.getSelectedValuesList();
            int numSelected = selectedGame.size();
            for (int i = 0; i < numSelected; i++) {
                if (i == 0) {
                    message.append(selectedGame.get(i));
                } else {
                    message.append(", " + selectedGame.get(i));
                }
            }
            JOptionPane.showMessageDialog(this, message.toString());
        }
    }//การดำเนินการของตัวดำเนินการเมื่อเลือกเกม
}
