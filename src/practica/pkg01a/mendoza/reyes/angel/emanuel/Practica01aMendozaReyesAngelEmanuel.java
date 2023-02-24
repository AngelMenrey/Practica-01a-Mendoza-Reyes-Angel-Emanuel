package practica.pkg01a.mendoza.reyes.angel.emanuel;

import java.util.Scanner;

public class Practica01aMendozaReyesAngelEmanuel {

    public static void main(String[] args) {
    int opc=0;
    String fecha, hora, lugar;
    int capacidad;
    double costoBoleto;
    
    Scanner leer = new Scanner(System.in);    
    Evento evento = new Evento();
     
        
     do {
     System.out.println("1-REGISTRAR LOS DATOS DEL EVENTO");
     System.out.println("2-MOSTRAR LOS DATOS DEL EVENTO");
     System.out.println("3-SALIR DEL MENU");    
     opc = leer.nextInt();
     
         switch(opc){
         case 1:
             System.out.println("Ingrese la fecha");
             fecha = leer.next();
             System.out.println("Ingrese la hora");
             hora = leer.next();
             System.out.println("ingrese el lugar");
             lugar = leer.next();
             System.out.println("Ingrese la capacidad");
             capacidad = leer.nextInt();
             System.out.println("Ingrese el Costo de boleto");
             costoBoleto = leer.nextInt();
            
             break;
         case 2:
             System.out.println("La fecha es: "+evento.getFecha());
             System.out.println("La hora es: "+evento.getHora());
             System.out.println("El lugar es: "+evento.getLugar());
             System.out.println("La capacidad es: "+evento.getCapacidad());
             System.out.println("El costo del boleto es: "+evento.getCostoBoleto());
             break;
     }
         
     }while(opc!=3);
        System.out.println("USTED A SALIDO DEL MENU");
    } 
}
