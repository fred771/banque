package com.dubois.banque;
import java.io.*;
/**
* class Compte
* @author roland garnier
*@version 0.99
*/

class Compte implements Serializable{
   
	private double solde;
   private String id;
   int numComp;

	/**
	 * constructeur de compte d'une banque donnee
	 * @param id
	 * @param solde
	 * @param banque
	 */
   
   Compte(String id,double solde,Banque banque){
	this.solde = solde;
	this.id = id;
	banque.nb++;
	numComp = banque.nb;
   }

	/**
	 * constructeur de compte general
	 * @param num
	 * @param id
	 * @param solde
	 */
   Compte(int num,String id,double solde){
	this.solde = solde;
	this.id = id;
	numComp = num;
   }	

	/**  
	 * observateur du numero de compte
	 */
   int getNumComp(){
	return numComp;
   }

   /**  
	 * observateur de identifiant du compte
	 * 
	 */
   String getId(){
	return id;
   }

   /**  
	 * observateur du solde du compte
	 */
   double getSolde(){
	return solde;
   }
   
   /**  
	 * surcharge de la methode toString
	 */
   public String toString(){
	return "id :" + id + " numero :" + numComp + " Solde :" + solde;
   }

	/**
	 * affichage d'un compte
	 */
   
   void afficher(){
	System.out.println(this);
   }
   
   
	/** 
	 * les operations sur un compte : credit
	 * @param c
	 */

   void crediter(double c){
	solde += c;
   }
   
   /** 
	 * les operations sur un compte : debit
	 * @param c
	 */

   void debiter(double c){
	solde -= c;
   }

}
