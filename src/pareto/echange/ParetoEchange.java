/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pareto.echange;

/**
 *
 * @author Poste
 */
public class ParetoEchange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(java.lang.Math.pow(10, 0.5));
        int p1[] = {10, 0};
        int p2[] = {0, 10};
        Individus ind1 = new Individus(p1);
        Individus ind2 = new Individus(p2);
        /*
         double u1 = ind1.utilite(p1);
         System.out.println("Individus 1 ="+ u1);
         double u2 = ind2.utilite(p2);
         System.out.println("Individus 2 = " + u2);
         */
        System.out.println("Individus1 " + ind1);
        System.out.println("Individus2 " + ind2);
        ind1.consommation[0] = 5;
        ind1.consommation[1] = 5;
        System.out.println("Ind1 final = " +ind1);
    }
    
}
