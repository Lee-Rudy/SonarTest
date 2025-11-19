package com.sonarproject.front;

import com.sonarproject.back.Calcul;

import javax.swing.*;
import java.awt.*;

public class Interface 
{

    public static void main(String[] args) 
    {

        // Création de la fenêtre
        JFrame frame = new JFrame("Calculatrice - SonarTest");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Champs de saisie
        JLabel labelA = new JLabel("Champ A :");
        JTextField fieldA = new JTextField();

        JLabel labelB = new JLabel("Champ B :");
        JTextField fieldB = new JTextField();

        JButton btnCalculer = new JButton("Additionner");
        JLabel labelResult = new JLabel("Résultat : ---");

        // Ajout des composants à la fenêtre
        frame.add(labelA);
        frame.add(fieldA);
        frame.add(labelB);
        frame.add(fieldB);
        frame.add(btnCalculer);
        frame.add(labelResult);

        frame.setVisible(true);

        // Événement du bouton
        btnCalculer.addActionListener(e -> {
            try 
            {
                double a = Double.parseDouble(fieldA.getText());
                double b = Double.parseDouble(fieldB.getText());

                // Utilisation de ta classe Calcul
                Calcul calc = new Calcul(a, b);
                double resultat = calc.Addition(a, b);

                labelResult.setText("Résultat : " + resultat);

            } 
            catch (NumberFormatException ex) 
            {
                JOptionPane.showMessageDialog(frame,
                        "Veuillez entrer des nombres valides.",
                        "Erreur de saisie",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
