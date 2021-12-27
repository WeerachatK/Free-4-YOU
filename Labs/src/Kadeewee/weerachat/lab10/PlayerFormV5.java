package kadeewee.weerachat.lab10;

/**
 * This program is PlayerFormV5
 * Show a window, titled "Player Form V5"
 * This program displays results similar to PlayerFormV4.
 * Additional functions of the reset button and the submit button.
 * There is a window showing updates when the user changes the information.
 * Class PlayerFormV5 which inherited from PlayerFormV4.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: April 5, 2021
 **/

import kadeewee.weerachat.lab8.PlayerFormV4;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerFormV5 extends PlayerFormV4 implements ActionListener{
    protected StringBuffer resultBuffer;
    protected String genderSelected;
    //ประกาศตัวแปร
    protected void getGender() {
        if (maleRB.isSelected()) {
            genderSelected = "Male";
        }
        if (femaleRB.isSelected()) {
            genderSelected = "Female";
        }
    }//เพิ่มข้อมูลของ genderSelected ตามเงื่อนไข
    public PlayerFormV5(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    protected void addComponents() {
        super.addComponents();
        nameTxt.setText("Weerachat");
        nationalityTxt.setText("Thai");
        birthTxt.setText("28-04-2001");
    } //เพิ่มส่วนประกอบต่างๆ
    public static void createAndShowGUI() {
        PlayerFormV5 msw = new PlayerFormV5("Player Form V5");//กำหนดชื่อให้ PlayerFormV4 และส่งค่า title ไปยังเมธอด PlayerFormV4
        msw.addComponents();//เรียกใช้เมธอด addComponents
        msw.addListeners();
        msw.setJMenuBar(msw.menuBar);//เรียกใช้ menu bar
        msw.setFrameFeatures();//เรียกใช้เมธอด setFrameFeatures() ที่ extends มาจาก superClass
    }
    public void addListeners() {
        submitBT.addActionListener(this);
        resetBT.addActionListener(this);
        nameTxt.addActionListener(this);
        nationalityTxt.addActionListener(this);
        birthTxt.addActionListener(this);
        playerBox.addActionListener(this);
    }//เพิ่มส่วนของตัวดำเนินการ
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }//ใช้สำหรับ Run โปรแกรม
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        resultBuffer = new StringBuffer();
        if (src == submitBT) { //เมื่อกดปุ่ม submit
            handleSubmitButton(); //เรียกใช้เมธอด
        } else if (src == resetBT) { //เมื่อกดปุ่ม reset
            handleResetButton(); //เรียกใช้เมธอด
        } else if (src instanceof JTextField) { //เมื่อมีการดำเนินการของ JTextField
            JTextField tf = (JTextField) src;
            handleTextField(tf); //เรียกใช้เมธอด
        } else if (src == playerBox) { //เมื่อมีการดำเนินการของ playerBox
            handleComboBox(); //เรียกใช้เมธอด
        }
    } //การดำเนินการของตัวดำเนินการ
    public boolean handleSubmitButton() { //การดำเนินการของปุ่ม Submit
        getGender();
        String name = nameTxt.getText();
        String nationality = nationalityTxt.getText();
        String birth = birthTxt.getText();
        String playerType = (String) playerBox.getSelectedItem();
        resultBuffer.append(name + " ");
        resultBuffer.append("has nationality as " + nationality + ", ");
        resultBuffer.append("birthdate as " + birth + ", ");
        resultBuffer.append("gender as " + genderSelected + ", ");
        resultBuffer.append("player type as " + playerType);
        JOptionPane.showMessageDialog(null, resultBuffer.toString());
        return false;
    }
    public void handleResetButton() { //การดำเนินการของปุ่ม Reset
        nameTxt.setText("");
        nationalityTxt.setText("");
        birthTxt.setText("");
    }
    public void handleTextField(JTextField tf) { //การดำเนินการของ JTextField
        nameTxt.setName("Name is updated to ");
        nationalityTxt.setName("Nationality is updated to ");
        birthTxt.setName("Birthdate is update to ");
        JOptionPane.showMessageDialog(null, tf.getName() + tf.getText());
    }
    public void handleComboBox() { //การดำเนินการของ JComboBox
        JOptionPane.showMessageDialog(null, "Player type is updated to " + playerBox.getSelectedItem());
    }
}
