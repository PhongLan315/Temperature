package temperature;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{    
    JMenuBar menuBar;
    JMenu accountMenu, undoMenu, redoMenu, refreshMenu, fileMenu, editMenu, optionMenu, helpMenu;
    JMenuItem saveItem, loadItem, loginItem, logoutItem, exitItem;   
    ImageIcon saveIcon, loadIcon, loginIcon, logoutIcon, exitIcon;
    MyFrame(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,500);
            this.setTitle("Menu");
            this.setLayout(new FlowLayout());
            //Tạo Frame ở giữa màn hình
            Toolkit toolKit = getToolkit();
            Dimension size = toolKit.getScreenSize();
            setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);

            menuBar = new JMenuBar();
            accountMenu = new JMenu("Account");
            undoMenu = new JMenu("Undo");
            redoMenu = new JMenu("Redo");
            refreshMenu = new JMenu("Refresh"); 
            fileMenu = new JMenu("File");
            editMenu = new JMenu("Edit");
            optionMenu = new JMenu("Option"); 
            helpMenu = new JMenu("Help");

            saveItem = new JMenuItem("Save");
            loadItem = new JMenuItem("Load");
            loginItem = new JMenuItem("Log In");
            logoutItem = new JMenuItem("Log Out");
            exitItem = new JMenuItem("Exit");
            
            saveIcon = new ImageIcon("Save.png");
            loadIcon = new ImageIcon("Load.png");
            loginIcon = new ImageIcon("login.png");
            logoutIcon = new ImageIcon("logout.png");
            exitIcon = new ImageIcon("TurnOff.png");
            
            accountMenu.setMnemonic(KeyEvent.VK_A); // Alt + a for acount
            undoMenu.setMnemonic(KeyEvent.VK_Z); // Alt + z for undo
            redoMenu.setMnemonic(KeyEvent.VK_Y); // Alt + y for redo
            refreshMenu.setMnemonic(KeyEvent.VK_R); // Alt + r for refresh
            fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
            editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
            helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
            
            saveItem.setMnemonic(KeyEvent.VK_S); // s for save
            loadItem.setMnemonic(KeyEvent.VK_L); // l for load
            exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
            
            saveItem.setIcon(saveIcon);
            loadItem.setIcon(loadIcon);
            loginItem.setIcon(loginIcon);
            logoutItem.setIcon(logoutIcon);
            exitItem.setIcon(exitIcon);
            
            menuBar.add(accountMenu);
            menuBar.add(undoMenu); 
            menuBar.add(redoMenu);
            menuBar.add(refreshMenu);
            menuBar.add(fileMenu);
            menuBar.add(editMenu);
            menuBar.add(optionMenu);
            menuBar.add(helpMenu);

            fileMenu.add(saveItem);
            fileMenu.add(loadItem);
            fileMenu.add(loginItem);
            fileMenu.add(logoutItem);
            fileMenu.add(exitItem);
            
            accountMenu.addActionListener(this);
            undoMenu.addActionListener(this);
            redoMenu.addActionListener(this);
            refreshMenu.addActionListener(this);
            fileMenu.addActionListener(this);
            editMenu.addActionListener(this);
            helpMenu.addActionListener(this);
            
            saveItem.addActionListener(this);
            loadItem.addActionListener(this);
            loginItem.addActionListener(this);
            logoutItem.addActionListener(this);
            exitItem.addActionListener(this);
            
            this.setJMenuBar(menuBar);
            this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == undoMenu) {
            
        }
        if(e.getSource() == redoMenu) {
            
        }
        if(e.getSource() == refreshMenu) {
            
        }
        
        if(e.getSource() == saveItem) System.out.println("You saved a file");
        if(e.getSource() == loadItem) System.out.println("You loaded a file");
        if(e.getSource() == exitItem) System.exit(0);
    }
}

