package IHM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaFenetre extends JFrame {
    public MaFenetre(){
        super("Biblio.exe");
        setSize(1500,750);
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        FileDialog fDial= new FileDialog(this, "Ouvrir", FileDialog.LOAD);
        JMenuItem fichier = new JMenuItem("Fichier");
        fileMenu.add(fichier);
        fichier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fDial.setVisible(true);
            }
        });
        JMenu editMenu = new JMenu();
        editMenu.setText("Edit");
        menuBar.add(editMenu);

        JMenu aboutMenu = new JMenu("About");
        menuBar.add(aboutMenu);



        JButton buttonPlus = new JButton("Add");
        panel.add(buttonPlus);
        JButton buttonSup = new JButton("Sup");
        panel.add(buttonSup);

        JButton buttonValider = new JButton("Valider");


        JLabel label1 = new JLabel("Titre");
        JLabel label2 = new JLabel("Auteur");
        JLabel label3 = new JLabel("Parution");
        JLabel label4 = new JLabel("Colonne");
        JLabel label5 = new JLabel("Rangée");
        JLabel label6 = new JLabel("Résumé");

        JTextField textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(100,25));
        JTextField textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(100,25));
        JTextField textField3 = new JTextField();
        textField3.setPreferredSize(new Dimension(100,25));
        JTextField textField4 = new JTextField();
        textField4.setPreferredSize(new Dimension(100,25));
        JTextField textField5 = new JTextField();
        textField5.setPreferredSize(new Dimension(100,25));
        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(100,150));


        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(label4);
        panel.add(textField4);
        panel.add(label5);
        panel.add(textField5);
        panel.add(label6);
        panel.add(textArea);

        panel.add(buttonValider);


    }
}
