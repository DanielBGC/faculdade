/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exstatic;

/**
 *
 * @author EDYA
 */
public class M {
    
    private Integer idade;
    private Double salario;
    private Short x;
    
    
    public static void main(String[] args) {
        int retorno = metodo(4);
        System.out.println(retorno);
        System.out.println("----------------");
        System.out.println("4 % 2:" + 4 % 2);
        System.out.println("3 % 2:" + 3 % 2);
        System.out.println("2 % 2:" + 2 % 2);
        System.out.println("1 % 2:" + 1 % 2);
        System.out.println("0 % 2:" + 0 % 2);
        
    }

    private static int metodo(int n) {
     if (n == 0)    {
      return 1;   
     } else return (1 + (n % 2) + metodo(n-1));
    }
    //it 4:1 + 0 + metodo(3)
    //it 3:1 + 1 + metodo(2)
    //it 2:1 + 0 + metodo(1)
    //it 1:1 + 1 + metodo(0)
    //it 0:1
    
    
}
