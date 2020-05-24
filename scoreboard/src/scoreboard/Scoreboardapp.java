/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreboard;


import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.round;


/**
 *
 * @author kichc
 */
public class Scoreboardapp {
static String comandinput,comand; 
 String teams[] = {"NORTH ADELAIDE", "SOUTH ADELAIDE", "WEST ADELAIDE", "GLENELG", "NORWOOD", "STURT", "CENTRAL DISTRICT", "WOODCILLE-WEST TORRENS"};
  int wins[] = {3, 3, 2, 1, 1, 1, 1, 0};
   int[] played = new int[8];
   double[] percentage  = new double[8];
   int[] points = {6, 6, 4, 2, 2, 2, 2, 0};
   
  int losses[] = {0, 0, 1, 2, 2, 2, 2, 3};
  int drawn[] = {0, 0, 0, 0, 0, 0, 0, 0};
  int scoreFor[] = {149, 127, 105, 90, 85, 60, 50, 81};
  int scoreAgainst[] = {50, 59, 65, 104, 118, 107, 150, 94};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	
 		
    // object inzialization
           Scoreboardapp g1=new Scoreboardapp();
   int comand;    // to hold day value

      Scanner console = new Scanner(System.in);
      System.out.print("Enter Command : ");
      comand = console.nextInt();
           
 		switch(comand){
                 case 1 :
         System.out.println("Display Available Comandas");
            g1.showcomand();
         break;

      case 2 :
         System.out.println("Display Current table");
           g1.displaycurrenttbl();
            g1.comands();
         break;

      case 3 :
         System.out.println("Display selected statistics");
           g1.displaystatistics();
         break;

      case 4 :
         System.out.println("Display Entries for the teams with the same point");
          g1.addentries_samepoint();
         break;

      case 5 :
         System.out.println("Add a New Resualt");
         g1.add_Resualt();
         break;

      case 6 :
         System.out.println("Exit");

         break;

      

      default :
         System.out.println("Invalid input");
        g1.comands();

      }
            
        }

    private void comands() {
         int comand;    // to hold day value

      Scanner console = new Scanner(System.in);
      System.out.print("Enter Command : ");
      comand = console.nextInt();
           
 		switch(comand){
                 case 1 :
         System.out.println("Display Available Comandas");

         break;

      case 2 :
         System.out.println("Display Current table");
        displaycurrenttbl();
         break;

      case 3 :
         System.out.println("Display selected statistics");

         break;

      case 4 :
         System.out.println("Display Entries for the teams with tyhe same point");

         break;

      case 5 :
         System.out.println("Add a New Resualt");

         break;

      case 6 :
         System.out.println("Exit");

         break;

      

      default :
         System.out.println("Invalid input");
       
      }
                
                }    

    private void displaycurrenttbl() {
        int i=0;
        for(i=0;i<8;i++){
          played[i]=wins[i]+losses[i]+drawn[i];
          double calpercentage=scoreFor[i]+scoreAgainst[i];
          percentage[i]=scoreFor[i]/calpercentage;// calculate percentage
                  System.out.println(" ");
                      System.out.print(teams[i]+"       ");
                       System.out.print(played[i]+" ");
                       System.out.print(wins[i]+" ");
                       System.out.print(losses[i]+" ");
                       System.out.print(drawn[i]+" ");
                       System.out.print(scoreFor[i]+" ");
                       System.out.print(scoreAgainst[i]+" ");
                       System.out.print(points[i]+"  ");
                       System.out.print(round(percentage[i], 2)+ "% ");
        
        }
        System.out.println(" ");
                 
                       
    }

    private void showcomand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displaystatistics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addentries_samepoint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add_Resualt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    }
    
    

    
    


















 