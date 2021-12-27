package kadeewee.weerachat.lab8;

/**
 * This program is MySimpleWindow
 * Show a window, titled "My Simple Window"
 * This window will display the "Reset" and "Submit" buttons
 * Class MySimpleWindow which inherited from JFrame.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 19, 2021
 **/

import javax.swing.*;

public class MySimpleWindow extends JFrame{
    protected JPanel buttonsPanel, mainPanel;
    protected JButton resetBT, submitBT;
    //ประกาศตัวแปร
    public MySimpleWindow(String title) {
        super(title);
    } //กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        resetBT = new JButton("Reset");
        submitBT = new JButton("Submit"); //ใส่ข้อความในปุ่ม
        buttonsPanel = new JPanel();
    } //กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    protected void addComponents() {
        initComponents(); //เรียกใช้เมธอด initComponents()
        mainPanel = (JPanel) this.getContentPane();
        buttonsPanel.add(resetBT);
        buttonsPanel.add(submitBT);
        //เพิ่มปุ่มเข้าไปใน buttonsPanel
        mainPanel.add(buttonsPanel);
        //เพิ่ม buttonsPanel เข้าไปใน mainPanel
    } //เพิ่มส่วนประกอบต่างๆ

    protected void setFrameFeatures() {
        this.pack(); //ทำให้หน้าต่างของโปรแกรมพอดีกับองค์ประกอบ
        this.setLocationRelativeTo(null); //แสดงหน้าต่างโปรแกรมตรงกลางหน้าจอ
        this.setVisible(true); //แสดงหน้าต่างโปรแกรม
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ทำการปิดโปรแกรมเมื่อออกจากหน้ต่างโปรแกรม
    } //กำหนดคุณสมบัติ(Features)ของหน้าต่าง
    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window"); //กำหนดชื่อให้ MySimpleWindow และส่งค่า title ไปยังเมธอด MySimpleWindow
        msw.addComponents(); //เรียกใช้เมธอด
        msw.setFrameFeatures(); //เรียกใช้เมธอด
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } //ใช้สำหรับ Run โปรแกรม
}

