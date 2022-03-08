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
public class CuadrilateroRegular {
    
    public float BASE, ALTURA, PERIMETRO, AREA;//Atributos
    
    public float Area(float base, float altura) {//Parametros de entrada y retorno
        float area = base * altura;
        return area;
    }
    
    public float AutoArea() {//Parametros de entrada y retorno
        this.AREA = this.BASE * this.ALTURA;
        return this.AREA;
    }
    
    public float Perimetro(float base, float altura) {//Parametros de entrada y retorno
        float perim = 2*(base + altura);
        return perim;
    }

    public void pedirDatos() {
        Scanner datos = new Scanner(System.in);//el objeto se llama datos y es de 
        //clase Scanner
        System.out.println("Digite la base del cuadrilatero: ");
        this.BASE = datos.nextFloat();
        System.out.println("Digite la altura del cuadrilatero: ");
        this.ALTURA = datos.nextFloat();
    }
    
    
}
