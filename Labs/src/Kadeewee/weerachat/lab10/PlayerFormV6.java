package kadeewee.weerachat.lab10;

/**
 * This program is PlayerFormV6
 * Show a window, titled "Player Form V6"
 * This program displays results similar to PlayerFormV5.
 * Class PlayerFormV6 which inherited from PlayerFormV5.
 * More on the part of the action when choosing a gender.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 5, 2021
 **/

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PlayerFormV6 extends PlayerFormV5 implements ItemListener{
    public PlayerFormV6(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    public static void createAndShowGUI() {
        PlayerFormV6 msw = new PlayerFormV6("Player Form V6");//กำหนดชื่อให้ PlayerFormV4 และส่งค่า title ไปยังเมธอด PlayerFormV4
        msw.addComponents();//เรียกใช้เมธอด addComponents
        msw.addListeners();
        msw.setJMenuBar(msw.menuBar);//เรียกใช้ menu bar
        msw.setFrameFeatures();//เรียกใช้เมธอด setFrameFeatures() ที่ extends มาจาก superClass
    }
    public void addListeners() {
        super.addListeners();
        maleRB.addItemListener(this);
        femaleRB.addItemListener(this);
    } //เพิ่มส่วนของตัวดำเนินการ
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }//ใช้สำหรับ Run โปรแกรม
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (maleRB.isSelected()) {
            JOptionPane.showMessageDialog(this, "Gender is updated to Male");
        }
        if (femaleRB.isSelected()) {
            JOptionPane.showMessageDialog(this, "Gender is updated to Female");
        }
    } //การดำเนินการของตัวดำเนินการเมื่อเลือกเพศ
}
