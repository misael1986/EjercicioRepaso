/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.ejerciciorepaso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    static float BASE, ALTURA, PERIMETRO, AREA;//Atributos

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hallar el área de un cuadrilatero regular
        area= base * altura
        
        Hallar el Perimetro de un cuadrilatero regular
        perimetro = base*2 + altura*2
             
         */

        /*float area;//crearlas
        float base;
        float altura;
        float perimetro;
        //Variables Tipadas -> DEcirle de manera Explicita de que tipo son
        
        //inicializar
        Scanner datos = new Scanner(System.in);//el objeto se llama datos y es de 
        //clase Scanner
        System.out.println("Digite la base del cuadrilatero: ");
        BASE = datos.nextFloat();
        System.out.println("Digite la altura del cuadrilatero: ");
        ALTURA = datos.nextFloat();
        
        AREA = BASE * ALTURA;
        System.out.println("La area es: " + AREA);
        PERIMETRO = 2 * (BASE + ALTURA);
        //(2*base)+(2*altura)
        //2*base + 2*altura
        System.out.println("El perimetro es: " + PERIMETRO);
        
        Area();
        Perimetro();
         */
        //pedirDatos();
        //Area2(BASE, ALTURA);
        //System.out.println("El area es: " + Area3(BASE, ALTURA));
        //pedirDatos();
        //Area2(BASE, ALTURA);
        //System.out.println("El area es: " + Area3(BASE, ALTURA));

        CuadrilateroRegular cuadrado= new CuadrilateroRegular();
        CuadrilateroRegular rectangulo = new CuadrilateroRegular();
        cuadrado.pedirDatos();
        rectangulo.pedirDatos();
        
        System.out.println(cuadrado.BASE+" - "+cuadrado.ALTURA);
        System.out.println(rectangulo.BASE+" - "+rectangulo.ALTURA);
        cuadrado.AREA=cuadrado.Area(cuadrado.BASE, cuadrado.ALTURA);
        rectangulo.AutoArea();
        System.out.println(rectangulo.Area(rectangulo.BASE, rectangulo.ALTURA));
        System.out.println(rectangulo.AutoArea());
       
        
        
    }

    public static void Area() {
        float base, altura, area;
        Scanner datos = new Scanner(System.in);
        System.out.println("Digite la base del cuadrilatero: ");
        base = datos.nextFloat();
        System.out.println("Digite la altura del cuadrilatero: ");
        altura = datos.nextFloat();
        area = base * altura;
        System.out.println("La area es: " + area);
    }

    public static void Perimetro() {
        float base, altura, perimetro;
        Scanner datos = new Scanner(System.in);//clase Scanner
        System.out.println("Digite la base del cuadrilatero: ");
        base = datos.nextFloat();
        System.out.println("Digite la altura del cuadrilatero: ");
        altura = datos.nextFloat();

        perimetro = 2 * (base + altura);
        //(2*base)+(2*altura)
        //2*base + 2*altura
        System.out.println("El perimetro es: " + perimetro);

    }

    public static void Area2(float a, float b) {//Parametros de entrada
        float area = a * b;
        System.out.println("La area es: " + area);
    }

    public static float Area3(float a, float b) {//Parametros de entrada y retorno
        float area = a * b;
        return area;
    }

    public static void pedirDatos() {
        Scanner datos = new Scanner(System.in);//el objeto se llama datos y es de 
        //clase Scanner
        System.out.println("Digite la base del cuadrilatero: ");
        BASE = datos.nextFloat();
        System.out.println("Digite la altura del cuadrilatero: ");
        ALTURA = datos.nextFloat();
    }

}
