package cuadernos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadernos {

    public static void main(String[] args) {

        int hojas=0;
        int resto;
        int rojo=0;
        int verde=0;
        int azul=0;
        boolean control = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de hojas que quieres que tenga el cuaderno");
        while (control) {
            try {
             hojas=teclado.nextInt();
               control =false;
             if(hojas<=0){
                 System.out.println("introduce un valor positivo y distinto de 0");
                 control =true;
             }
                     
            } catch (InputMismatchException e) {
                System.out.println("introducce un valor entero"); 
                teclado.next(); //borra la entrada incorrecta
                control = true;
               
            }
        }

        
        resto=hojas%3;
        
    switch (resto) {
                    case 0:
                        rojo=hojas/3;
                        verde=rojo;
                        azul=verde;
                        break;
                    case 1:
                        verde=hojas/3;
                        azul=verde;
                        rojo=azul+1;
                        break;
                    case 2:
                       azul=hojas/3;
                        verde=1+azul;
                        rojo=verde;
                        System.out.println("s");
                        
                        break;
                
                }
    
        System.out.println("el cuaderno tiene "+hojas);
        System.out.println("rojas son: "+rojo); 
        System.out.println("verdes son: "+verde);
        System.out.println("azul son: "+azul); 
    }
}
