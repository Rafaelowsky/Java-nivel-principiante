public class Operaciones{
   public static void main(String args[]){
    
    int numero_uno = 4;
    int numero_dos = 4;
    int resultado = 0;
    
    //Aqui podemos apreciar la prioridad de operadores con este codigo el resultado sera 6
    resultado = numero_uno + numero_dos / 2;
    System.out.println("El resultado es: " + resultado);
    
    //Aqui se muestra lo correcto que deberíamos hacer para la operaciones que es poner la primera parte en paréntesis
    resultado = (numero_uno + numero_dos) / 2;
    System.out.println("El resultado es: " + resultado);
 }
}
