package kadeewee.weerachat.lab9;

/**
 * This program is GuessNumberGameWindow
 * Show a window, titled "GuessNumberGameWindow  Version 1"
 * The program will display
 *  - The text "Please guess by clicking at the number" has a blue "Serif" size 24.
 *  - 10 buttons with picture numbers
 *  - The text says "Result" with an uneditable Text Field and the words "Congratulations!"
 * Class GuessNumberGameWindow which inherited from JFrame.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 26, 2021
 **/

import javax.swing.*;
import java.awt.*;

public class GuessNumberGameWindow extends JFrame {
    protected JPanel buttonsPanel, mainPanel, labelNorthPanel, labelSouthPanel;
    protected JLabel labelNorth, labelSouth;
    protected JButton oneBT, twoBT, threeBT, fourBT, fiveBT, sixBT, sevenBT, eightBT, nineBT, tenBT;
    protected JTextField southTextField;
    //ประกาศตัวแปร
    public GuessNumberGameWindow(String title) {
        super(title);
    } //กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        oneBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number1.png" )));
        twoBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number2.png" )));
        threeBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number3.png" )));
        fourBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number4.png" )));
        fiveBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number5.png" )));
        sixBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number6.png" )));
        sevenBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number7.png" )));
        eightBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number8.png" )));
        nineBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number9.png" )));
        tenBT = new JButton( ( new ImageIcon("Labs/src/icon/images/number10.png" ))); //ใส่รูปภาพในปุ่ม
        buttonsPanel = new JPanel();
        labelSouth = new JLabel("Result");
        labelNorth = new JLabel("Please guess by clicking at the number:");
        labelNorthPanel = new JPanel();
        labelSouthPanel = new JPanel();
        southTextField = new JTextField("Congratulations!",15); //ใส่ข้อความในช่องข้อความและระบุขนาดของช่องข้อความ
    } //กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    protected void addComponents() {
        initComponents(); //เรียกใช้เมธอด initComponents()
        southTextField.setEnabled(false); //ไม่สามารถแก้ไขช่องข้อความได้
        southTextField.setDisabledTextColor(Color.GRAY); //กำหนดสำให้ข้อความในช่องข้อความ
        mainPanel = (JPanel) this.getContentPane();
        labelNorthPanel.add(labelNorth);
        labelNorth.setFont(new Font("Serif", Font.BOLD, 24)); //กำหนด แบบอักษร และ ขนาด
        labelNorth.setForeground ( Color.BLUE ); //กำหนดสีข้อความ
        labelSouthPanel.add(labelSouth);
        labelSouthPanel.add(southTextField);
        labelSouth.setFont(new Font("Serif", Font.BOLD, 24)); //กำหนด แบบอักษร และ ขนาด
        labelSouth.setForeground ( Color.BLUE ); //กำหนดสีข้อความ
        southTextField.setFont(new Font("Serif", Font.BOLD, 24)); //กำหนด แบบอักษร และ ขนาด
        buttonsPanel.setLayout(new GridLayout(2, 5));
        buttonsPanel.add(oneBT);
        buttonsPanel.add(twoBT);
        buttonsPanel.add(threeBT);
        buttonsPanel.add(fourBT);
        buttonsPanel.add(fiveBT);
        buttonsPanel.add(sixBT);
        buttonsPanel.add(sevenBT);
        buttonsPanel.add(eightBT);
        buttonsPanel.add(nineBT);
        buttonsPanel.add(tenBT);
        //เพิ่มปุ่มเข้าไปใน buttonsPanel
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(labelNorthPanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);
        mainPanel.add(labelSouthPanel, BorderLayout.SOUTH);
        //เพิ่มองค์ประกอบใน mainPane
    } //เพิ่มส่วนประกอบต่างๆ
    protected void setFrameFeatures() {
        this.pack(); //ทำให้หน้าต่างของโปรแกรมพอดีกับองค์ประกอบ
        this.setLocationRelativeTo(null); //แสดงหน้าต่างโปรแกรมตรงกลางหน้าจอ
        this.setVisible(true); //แสดงหน้าต่างโปรแกรม
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ทำการปิดโปรแกรมเมื่อออกจากหน้ต่างโปรแกรม
    } //กำหนดคุณสมบัติ(Features)ของหน้าต่าง
    public static void createAndShowGUI() {
        GuessNumberGameWindow ggw = new GuessNumberGameWindow("GuessNumberGameWindow  Version 1"); //กำหนดชื่อให้ GuessNumberGameWindow และส่งค่า title ไปยังเมธอด GuessNumberGameWindow
        ggw.addComponents(); //เรียกใช้เมธอด
        ggw.setFrameFeatures(); //เรียกใช้เมธอด
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } //ใช้สำหรับ Run โปรแกรม
}
