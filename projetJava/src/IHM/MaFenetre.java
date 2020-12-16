package IHM;

import javax.swing.*;
import java.awt.*;

public class MaFenetre extends JFrame {
    public MaFenetre(){
        super("Biblio.exe");
        setSize(650,350);
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu();
        fileMenu.setText("File");
        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu();
        editMenu.setText("Edit");
        menuBar.add(editMenu);

        JMenu aboutMenu = new JMenu();
        aboutMenu.setText("About");
        menuBar.add(aboutMenu);

        JLabel label1 = new JLabel("Titre");
        JLabel label2 = new JLabel("Auteur");
        JLabel label3 = new JLabel("Parution");
        JLabel label4 = new JLabel("Colonne");
        JLabel label5 = new JLabel("Rangée");
        JLabel label6 = new JLabel("Résumé");

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);


    }
}
