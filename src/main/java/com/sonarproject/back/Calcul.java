package com.sonarproject.back;

public class Calcul 
{
    double champA;
    double champB;

    //constructor
    public Calcul (double champA, double champB)
    {
        this.champA = champA;
        this.champB = champB;
    }

    //get set
    public double getChampA() 
    {
        return champA;
    }

    public void setChampA(double champA) 
    {
        this.champA = champA;
    }

    public double getChampB() 
    {
        return champB;
    }

    public void setChampB(double champB) 
    {
        this.champB = champB;
    }


    //fonctions Addition
    public double Addition (double cA , double cB)
    {
        double result = cA + cB;
        return result;
    }
        
    
}
