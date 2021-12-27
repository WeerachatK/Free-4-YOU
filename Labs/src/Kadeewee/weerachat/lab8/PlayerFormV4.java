package kadeewee.weerachat.lab8;

/**
 * This program is PlayerFormV4
 * Show a window, titled "Player Form V4"
 * This program displays results similar to PlayerFormV3.
 * More in the menuBar section.
 * Class PlayerFormV4 which inherited from PlayerFormV3.
 * Author: Weerachat Kadeewee
 * ID: 633040179-2
 * Sec: 2
 * Date: March 19, 2021
 **/

import javax.swing.*;

public class PlayerFormV4 extends PlayerFormV3 {
    protected JMenuBar menuBar;
    protected JMenu menuFile, menuConfig ;
    protected JMenuItem fileMenuOpen, fileMenuNew, fileMenuSave, fileMenuExit;
    protected JMenuItem configMenuColor, configMenuSize, subMenuColor, subMenuSize;
    protected JMenuItem redFont, greenFont, blueFont, fontSize16, fontSize20, fontSize24;
    //ประกาศตัวแปร
    public PlayerFormV4(String title) {
        super(title);
    }//กำหนดชื่อของหน้าต่าง(Title)
    protected void initComponents() {
        super.initComponents();//เรียกใช้เมธอด initComponents() จากคลาส super หรือก็คือคลาส PlayerFormV3
        subMenuColor = new JMenuItem();
        subMenuSize = new JMenuItem();
        menuFile = new JMenu("File");
        menuConfig = new JMenu("Config");
        menuBar = new JMenuBar();
        fileMenuNew = new JMenuItem("New", new ImageIcon("Labs/src/icon/iconNew.png"));
        fileMenuOpen = new JMenuItem("Open", new ImageIcon("Labs/src/icon/iconOpen.png"));
        fileMenuSave = new JMenuItem("Save", new ImageIcon("Labs/src/icon/iconSave.png"));//ข้อความและรูปภาพใน menu item
        fileMenuExit = new JMenuItem("Exit");
        configMenuColor = new JMenu("Color");
        configMenuSize = new JMenu("Size");
        redFont = new JMenuItem("Red");
        greenFont = new JMenuItem("Green");
        blueFont = new JMenuItem("Blue");
        fontSize16 = new JMenuItem("16");
        fontSize20 = new JMenuItem("20");
        fontSize24 = new JMenuItem("24");
    }//กำหนดส่วนเริ่มของตัวแปรแต่ละตัว
    protected void addMenus() {
        menuFile.add(fileMenuNew);
        menuFile.add(fileMenuOpen);
        menuFile.add(fileMenuSave);
        menuFile.addSeparator();
        menuFile.add(fileMenuExit);
        menuConfig.add(configMenuColor);
        menuConfig.add(configMenuSize);
        configMenuColor.add(redFont);
        configMenuColor.add(greenFont);
        configMenuColor.add(blueFont);
        configMenuSize.add(fontSize16);
        configMenuSize.add(fontSize20);
        configMenuSize.add(fontSize24);
    } //เพิ่มส่วนประกอบในแถบเมนู
    protected void addComponents() {
        super.addComponents();
        menuBar.add(menuFile);
        menuBar.add(menuConfig);
        addMenus(); //  เรียกใช้เมธอด
    } //เพิ่มส่วนประกอบต่างๆ
    public static void createAndShowGUI() {
        PlayerFormV4 msw = new PlayerFormV4("Player Form V4");//กำหนดชื่อให้ PlayerFormV4 และส่งค่า title ไปยังเมธอด PlayerFormV4
        msw.addComponents();//เรียกใช้เมธอด addComponents
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
}
