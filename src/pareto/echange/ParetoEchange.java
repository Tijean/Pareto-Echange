/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pareto;

/**
 *
 * @author Poste
 */
public class ParetoEchange {

    /**
     * vidu
     *
     * @param args the command line arguments
     */
    public static void bruteforce(Individus individu1, Individus individu2) {

        int total[] = new int[2];
        total[0] = individu1.production[0] + individu2.production[0];
        total[1] = individu1.production[1] + individu2.production[1];
        double max = 0.0;
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i <= total[0]; i++) {
            for (int j = 0; j <= total[0]; j++) {
                int tab_cons[] = new int[2];
                int tab_cons2[] = new int[2];
                tab_cons[0] = i;
                tab_cons[1] = j;
                tab_cons2[0] = total[0] - i;
                tab_cons2[1] = total[1] - i;
                double temp = individu1.utilite(tab_cons);
                double temp2 = individu2.utilite(tab_cons);
                if (individu1.u_valide(temp) && individu2.u_valide(temp2)) {
                    if (temp + temp2 > max) {
                        max = temp + temp2;
                        maxi = i;
                        maxj = j;
                    }
                }

            }
        }
        System.out.println(maxi);
        System.out.println(maxj);
        System.out.println(max);
    }
    

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
        System.out.println("Ind1 final = " + ind1);
        bruteforce(ind1, ind2);
    }

}
