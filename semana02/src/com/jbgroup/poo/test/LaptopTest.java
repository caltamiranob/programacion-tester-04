package com.jbgroup.poo.test;

import com.jbgroup.poo.Laptop;

public class LaptopTest {

	public static void main(String[] args) {
		
		Laptop objetoLaptop = new Laptop();
		
		imprimirDatosLaptop(objetoLaptop);
		
		objetoLaptop.setMarca("HP");
		objetoLaptop.setPrecio(50.00);
		
		imprimirDatosLaptop(objetoLaptop);
		
		
		Laptop objetoLaptopDos = new Laptop("DELL");
		imprimirDatosLaptop(objetoLaptopDos);
		
		System.out.println(objetoLaptop.toString());
		System.out.println(objetoLaptopDos.toString());
		
		
	}
	
	public static void imprimirDatosLaptop(Laptop laptop) {
		
		System.out.println("datos del objeto 'objetoLaptop'");
		System.out.println("-------------------------------");
		System.out.println(laptop.getMarca());
		System.out.println(laptop.getModelo());
		System.out.println(laptop.getTamanio());
		System.out.println(laptop.getPrecio());
		
	}

}


















