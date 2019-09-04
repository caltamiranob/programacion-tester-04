package com.jbgroup.cadenas;

public class CadenaPerformanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuffer sbuffer = new StringBuffer();
        long inicio = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            sbuffer.append("abc");
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuffer: " + (fin-inicio));

        
        StringBuilder sbuilder = new StringBuilder();
        inicio = System.currentTimeMillis();
        for (int i=0; i<1000000; i++) {
            sbuilder.append("abc");
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo del StringBuilder: " + (fin-inicio));
        
        String cadena = new String("");
        inicio = System.currentTimeMillis();
        for (int i=0; i<100000; i++) {
            cadena = cadena + "abc";
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo del String: " + (fin-inicio));
        
//        //StringBuilder sbuilder = new StringBuilder();
//        long inicio = System.currentTimeMillis();
//        String cadena = "";
//        for (int i=0; i<1000000; i++) {
//            //sbuilder.append("zim");
//        	cadena = cadena + "zim";
//        }
//        long fin = System.currentTimeMillis();
//        System.out.println("Tiempo del StringBuilder: " + (fin-inicio));
	}

}
