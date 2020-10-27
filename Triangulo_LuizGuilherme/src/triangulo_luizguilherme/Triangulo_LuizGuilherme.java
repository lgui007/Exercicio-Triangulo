
package triangulo_luizguilherme;
import java.util.Scanner;

public class Triangulo_LuizGuilherme 
{

  
    public static void main(String[] args) 
    {
      Scanner entrada = new Scanner(System.in);
    double a,b,c;
    System.out.println("Digite o valor de a: ");
    a = entrada.nextDouble();
    System.out.println("Digite o valor de b: ");
    b = entrada.nextDouble();
    System.out.println("Digite o valor de c: ");
    c= entrada.nextDouble();
    
    if((a+b>c) && (a+c>b) && (b+c>a)){
           System.out.println("Forma um Triângulo");

         if(a==b && a==c && b==c){
            System.out.println("Triângulo Equilátero");
         }
         else if(a!=b && a!=c && b!=c){
            System.out.println("Tiângulo Escaleno");
         }
         else if((a==b && a!=c) || (a==c && a!=b) || (b==c & b!=a)){
            System.out.println("Triângulo Isósceles");
         }
        }
        else{
            System.out.println("Não forma um triângulo");

        } 
    }
}
