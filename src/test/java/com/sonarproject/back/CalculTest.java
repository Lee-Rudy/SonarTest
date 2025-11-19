package com.sonarproject.back;

import com.sonarproject.back.Calcul;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculTest 
{

// liste détails des executions 
//----------------------------
// testAddition()
// Vérifie une addition simple.
//----------------------------

//testAdditionAvecValeursNegatives()
// Teste un cas avec un négatif → très utile pour SonarCloud & JaCoCo.
//----------------------------

//testGetterSetter()
//Vérifie les getters et setters — simple mais nécessaire pour augmenter la couverture.
//----------------------------

// + ================================== +
// | pour executer les tests : mvn test |
// + ================================= +

    @Test
    void testAddition() 
    {
        Calcul calcul = new Calcul(2.0, 3.0);

        double resultat = calcul.Addition(2.0, 3.0);

        assertEquals(5.0, resultat, "L'addition doit retourner 5.0");
    }

    @Test
    void testAdditionAvecValeursNegatives() 
    {
        Calcul calcul = new Calcul(-4.0, 6.0);

        double resultat = calcul.Addition(-4.0, 6.0);

        assertEquals(2.0, resultat, "L'addition avec négatif doit retourner 2.0");
    }

    @Test
    void testGetterSetter() 
    {
        Calcul calcul = new Calcul(0.0, 0.0);

        calcul.setChampA(10.0);
        calcul.setChampB(20.0);

        assertEquals(10.0, calcul.getChampA());
        assertEquals(20.0, calcul.getChampB());
    }
}
