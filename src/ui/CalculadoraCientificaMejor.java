import java.util.Scanner;
import java.lang.Math;
public class CalculadoraCientificaMejor{
    static String []last10Values= new String [10];
    static String []last10Types= new String [10];
    static int position = -1;
    public static void saveLastValue(String value, String type){
        if(position == 9){
            for (int i=0;i<9;i++){
                last10Values[i]= last10Values[i+1];
                last10Types[i]= last10Types[i+1];
            }
        }else {
            position++;
        }
        last10Values[position]= value;
        last10Types[position]= type;
    }

     /** 
     * this method allows you to add number1 to number2.
     <b>pre:</b> the number1 that the user enter, must be !=null and decimal. <br>
     @param number1, this parameter must be a decimal.(number1 is double type)
     @param numbver2 this parameter must be a decimal.(number2 is double type)
     <b>post:</b>number1 and number 2 have been added.
     @return this method returns the sum of two decimal numbers.
     */
    public static double sum(double number1, double number2){
        
        double result = number1+number2;
        return result;



            
     }
     /** 
      * this method allows you to substract number1 to number2.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param number1, this parameter must be a decimal.
      @param numbe2, this parameter must be a decimal.
      <b>post:/b>number1 and number2 have been substracted.
      @return this method returns the substration of two decimal numbers.
      */
     public static double subtration(double number1, double number2){
        return number1-number2;
     }
     /**
      *  this method allows you to divide number1 to number2.
     <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
     @param number1, this parameter must be a decimal.
     @param number2, this parameter must be a decimal.
     <b>post:</b> number1 and number2 have been divided.
     @return this method returns the division of two decimal numbers.
      */
     public static double division(double number1,double number2){
        return number1/number2;
     }
     /**
      *  this method allows you to multiply number1 to number2.
     <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
     @param number1, this parameter must be a decimal.
     @param number2, this parameter must be a decimal.
     <b>post:</b> number1 and number2 have been divided.
     @return this method returns the division of two decimal numbers.
      */
     public static double multiplication(double number1, double number2){
        return number1*number2;
     }
     /** 
      * this method allows you to get the module of number1 and number2.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param nunber1, this parameter must be a decimal.
      @param number2, this parameter must be a decimal.
      <b>post:</b> number1 and number2 have been multiplicated
      @return this methos returns the module of the two decimal numbers.
     */
     public static double module(double number1, double number2){
        return number1%number2;
     }
     /** 
      * this method allows you to get the squareRoot of number1.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param number1, this parameter must be a decimal.
      

      */
     public static double squareRoot(double number1){
        number1=0;
        float a=0;
        float x1,x2;
        x2=(float) number1;

        while( (a*a) <= number1 )
        a+=0.1;
        x1=a;
        for(double j=0;j<10;j++)
        {
        x2=(float)number1;
        x2/=x1;
        x2+=x1;
        x2/=2;
        x1=x2;
        }
        return x2;
     }
     /** 
      * this method allows you to get the empowerment of one number by enter the base and the exponent. 
     <b>pre:</b> the numbers that the user enter, must be a decimal && != null. <b>
     @param number1, this parameter must be a decimal.
     @param number2, this parameter must be a decimal.

      * 
      */
     public static double empowerment(double number1, double number2) {
        double result = 1;
        for (int i = 1; i <= number2; i++) {
        result = result * number1;
        }
        return result;
     }
     /** 
      * this method allows you to get the factorial of a number.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param number1, this parameter must be a decimal.
      
      */
     public static double factorial( double number1){
            if(number1 == 0) return 1;
            double result = 1;
            do{
                result*=number1;
            }while(number1-- > 1);
            return result;
     } 
     /** 
      * this method allows you to get the conversion between a binary to a decimal number.
      <b>pre:</b> the number that the user enter, must be a string && != null. <b>
      @param number1, this parameter must be a string.

      */
     public static double binaryToDecimal(String b){
        int l = b.length();
        double result = 0;
        int power = l - 1;
        for(int i = 0;i < l;i++){
         if("1".equals(b.charAt(i))){
          result += Math.pow(2,power);
        }
         power --;
        }
        return result;
     }
     /** 
      * this method allows you to get the log10 of a number
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param number1, this parameter must be a decimal.
      */
      
     public static double log10(double number1){
        double result;
        result= Math.log10(number1);
        return result;
     }
     /**
      * this method allows you yo get the root of a number by enter the number and exponent of the root you would like to calculate.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param number1, this parameter must be a decimal.
      @param number2, this parameter must be a decimal.
      */
     public static double root(double number1, double number2) {
     if (number1 < 0) {
        return -Math.pow(Math.abs(number1), (1 /number2));
     }
     return Math.pow(number1, 1.0 /number2);
     }
     /**
      * this method allows you to get the sinus of a number.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param number1, this parameter must be a decimal.
      */
     
     public static double sin(double number1){
         return Math.sin(number1);
     }
     /**
      * this method allows you to get the cosine of a number.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
      @param number1, this parameter must be a decimal.
      */
     public static double cos(double number1){
         return Math.cos(number1);
     }
     /**
      * this methos allows you to get the tanget of a numeber.
      <b>pre:</b> the number that the user enter, must be a decimal && != null. <b>
       @param number1, this 
      */
     public static double tan(double number1){
         return Math.tan(number1);
     }

     public static void main( String [] Args){
      Scanner reader = new Scanner (System.in);
      for(int x=0;x<=9;x++){
         last10Values[x] = "";
      }
      double result = 0;
      double number1 =0;
      double number2 =0;
      boolean firtsTime =true;
      int basicoperation;
      int operationConvertion;
      String binarynumber;
      int decimal;
      int position = 0;
      String b;
      
      
      
      

      
        do{
         System.out.println ("what operation you would like to use; if you would like to finish enter number -1\n"+ 
         "1. sum \n" +
		  "2. subtration\n" +
		 "3. division\n" +
		 "4. multiplication\n" +
		 "5. module\n" +
         "6. empowerment\n" +
         "7. root\n" +
         "8. log10\n" + 
         "9. squareRoot\n" +
         "10. factorial\n" +
         "11. convertion of binary, decimal, hexadecimal\n" +
         "12. sin\n" +
         "13. cos\n" +
         "14. tan\n" +
         "15. historyResults\n");

    
         basicoperation = reader.nextInt();
         if(basicoperation != 11 && firtsTime) {
             System.out.println (" please enter the number 1 that you would like to use, in case you choose empowerment enter the base;");
             number1= reader.nextDouble(); 
             firtsTime = false;
         }
         if (basicoperation<8 && basicoperation != -1){
         System.out.println ("please enter the number 2 that you would like to use; in case you choose empowerment enter the exponen");
         number2= reader.nextDouble();
         }
         switch (basicoperation) {
            case 1:
                result =sum(number1,number2);                
            break;

            case 2:
                result =subtration(number1,number2); 
                
            break; 
            
            case 3:
            result =division(number1,number2);
            break;

            case 4:
            result= multiplication(number1,number2);
            break;

            case 5:
            result= module(number1,number2);
            break;

            case 6:
            result= empowerment(number1, number2);
            break;

            case 7:
            result=root(number1, number2);
            break;
        
            case 8:
            result= log10(number1);
            break;

            case 9:
            result= squareRoot(number1);
            break;

            case 10:
            result= factorial(number1);
            break;

            case 11:
            System.out.println ("please select what option of convert you would like to use:\n 1.binaryToDecimal\n 2.binaryToHexadecimal\n 3.decimalToBinary\n 4.decimalToHexadecimal\n 5.hexadecimalToBinary\n 5.hexadecimalToDecimal");
            operationConvertion = reader.nextInt();
            switch (operationConvertion){

                case 1:
                System.out.println ("please enter the binary number");
                reader.nextLine();
                binarynumber = reader.nextLine();
                result = binaryToDecimal(binarynumber);
                System.out.println ("the number in decimal is " + result);
                break;

                

            }

            case 12:
            result= sin(number1);
            break;

            case 13:
            result= cos(number1);
            break;

            case 14:
            result= tan(number1);
            break;
            case 15:
            System.out.println("Por favor selecione el numero del historial ");
            System.out.println("historial 1 " + last10Values[0]+"\n");
            System.out.println("historial 2 " + last10Values[1]+"\n");
            System.out.println("historial 3 " + last10Values[2]+"\n");
            System.out.println("historial 4 " + last10Values[3]+"\n");
            System.out.println("historial 5 " + last10Values[4]+"\n");
            System.out.println("historial 6 " + last10Values[5]+"\n");
            System.out.println("historial 7 " + last10Values[6]+"\n");
            System.out.println("historial 8 " + last10Values[7]+"\n");
            System.out.println("historial 9 " + last10Values[8]+"\n");
            System.out.println("historial 10 " + last10Values[9]+"\n");
            int opcion = reader.nextInt();
            if(opcion>1 && opcion <=10){
               switch(last10Types[opcion-1]){
                  case "double":
                  result = Double.parseDouble(last10Values[opcion-1]);
                  break;
                  case "string":
                  binarynumber = last10Values[opcion-1];
                  break;
               }
            }

            break;

            default:
                break;
        }
        saveLastValue(Double.toString(result),"double");
         System.out.println(result);
         number1= result;
        }

     while (basicoperation != -1);
}
}



