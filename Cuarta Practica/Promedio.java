public class Promedio{
 public static void main(String args[]){
    
    int matematicas=5;
    int biologia=8;
    int quimica=7;
    int promedio = 0;

    promedio = (matematicas + biologia + quimica) / 3;
    
    //Con la estructura if ponemos la condicion que se tiene que cumplir, para que si es cierta se ejecute la primera parte del codigo
    
    if(promedio>=6) {
     System.out.println("El alumno aprobó "+ promedio);
   } 
    // Ya si la condicion que escribimos no se cumple gracias al else se ejecuta el otro resto del codigo
   else {
     System.out.println("El alumno reprobó "+ promedio);
   }
 }
}
