/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salescomission;

/**
 *
 * @author Sameen Zahra
 */
public class Monthlysalescomission {
    static public String Comission(final int l,final int s,final int b){
    if ((l < 1 || s < 1 || b < 1) || (l > 70 || s > 80 || b > 90)){
	                return("invalid");//for rhobust BVA 
               }
               else{
                  int sum=(l*45)+(s*30)+(b*25);//for BVA
                  int com=0;
                  int rem=0;
                  if(sum>1800){
                      rem=sum-1800;
                      rem=(int) (rem*0.2);
                      com=100+120+rem;
                  }
                  else
                     com=100+120; 
            String str=Integer.toString(com);
                  return str;
    }
}
}
