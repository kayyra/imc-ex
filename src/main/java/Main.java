import java.util.Scanner;

public class Main{

   public static void main(String[] args){
      double weight, height, IMC;

      Scanner in = new Scanner(System.in);
      
      System.out.println("Write your weight (kg): " );
      weight = in.nextDouble();

      System.out.println("Write your height (m): " );
      height = in.nextDouble();

      IMC = weight / (height * height);

      System.out.println("Your IMC is: " + " " + IMC);

      if(IMC < 16){
         System.out.println("Severe thinness");
      } else if (IMC >= 16 && IMC < 17){
         System.out.println("Moderate thinness");         
      }else if(IMC >= 17 && IMC < 18){
         System.out.println("Slight thinness");         
      }else if(IMC >= 18.5 && IMC < 25){
         System.out.println("Normal Weight");
      }else if(IMC >= 25 && IMC < 30 ){
         System.out.println("Overweight");
      }else if(IMC >= 30 && IMC < 35){
         System.out.println("Mild Obesity");
      }else if(IMC >=35 && IMC < 40){
         System.out.println("Moderate Obesity");
      }else{
         System.out.println("Morbid Obesity");
      }
      in.close();
   } 
   
}