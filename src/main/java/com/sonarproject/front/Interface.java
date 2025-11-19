package com.sonarproject.front;

import com.sonarproject.back.Calcul;

import javax.swing.*;
import java.awt.*;

public class Interface 
{

    // détails : pour executer le code sous maven il y plusieurs méthodes , 3 méthodes
    // méthode 1 :  soit on Run dans le main avec le btn "play"

    // méthode 2 : (celle que j'utilise pour ce projet) -> lancer cette commande :
    // mvn compile exec:java -Dexec.mainClass="com.sonarproject.front.Interface"
    // pour que ça fonctionne , il faut ajouter un plugin dans le <Plugins> de pom.xml
    // pour executer :
    //-> mvn exec:java  (dans le plugin il y a <mainClass> , maven le cherche et trouve le main et lance l'app) --> prend du temps lors de la compilation 
    // -> mvn exec:java -Dexec.mainClass="com.sonarproject.front.Interface"  (si on veut le lancer et le préciser où se trouve main) --> plus rapide à lancer



    //méthode 3 : créer un fichier jar


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
