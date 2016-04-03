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
public class Individus {
    int production [];
    int consommation [];
    final String NOMPRODUCTION[] = {"Carotte", "Patate"};
    final int TAILLE =2;
    double u_init;
    
    //pour chaque boucle, créer une variable
    
    
    public Individus(int production[]){
        this.production = production;
        this.consommation = production;
        this.u_init = utilite(consommation);
    }
    
    public double utilite(int consommer[]){
        double u=0;
        for(int i=0; i<consommer.length;i++){
            double valeur =(double)consommer[i];
            u+= java.lang.Math.pow(valeur,0.5);
        }
        return u;
    }
    public boolean u_valide(double u){
       return u>u_init; 
    }
    @Override
    public String toString(){
        
        String out="";
        for(int i=0;i<TAILLE;i++ ){
            out+=NOMPRODUCTION[i]+" : "+production[i] +System.getProperty("line.separator");
        }
        out+= "Utilité = " + utilite(consommation);
        return out;
    }
    
}

