package JUnit.Junit09_Geometria.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import JUnit.Junit09_Geometria.dto.*;




class GeometriaTest {
	
	private Geometria Geometria1;
	private Geometria geometria;

	@Test
	public void testareacuadrado(){
	    int resultado =Geometria.areacuadrado(1);
	    int esperado =1;
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testareacirculo(){
	    int resultado =(int) Geometria.areaCirculo(1);
	    int esperado =3;
	    int delta=1; 
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testareatriangulo(){
	    int resultado =Geometria.areatriangulo(2, 2);
	    int esperado =2;
	    //int delta=1; 
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testarearectangulo(){
	    int resultado =Geometria.arearectangulo(2, 2);
	    int esperado =4;
	    //int delta=1; 
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testareapentagono(){
	    int resultado =Geometria.areapentagono(2, 2);
	    int esperado =2;
	    //int delta=1; 
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testarearombo(){
	    int resultado =Geometria.arearombo(2, 2);
	    int esperado =2;
	    //int delta=1; 
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testarearomboide(){
	    int resultado =Geometria.arearomboide(2, 2);
	    int esperado =4;
	    //int delta=1; 
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testareatrapecio(){
	    int resultado =Geometria.areatrapecio(2, 2, 2);
	    int esperado =4;
	    //int delta=1; 
	    assertEquals(esperado,resultado);
	    }
	
	@Test
	public void testGeometria(){
			
			for(int var=1; var<=9;var++) {
			Geometria1= new Geometria(var);
			assertEquals(Geometria1.getId(), var);	
			}
	    }
	
	@Test
	public void testSetId(){
			
			geometria= new Geometria();
			geometria.setId(2);
			int resultado = geometria.getId();
			int esperado = 2;
			assertEquals(esperado, resultado);	
			
	    }
	
	@Test
	public void testSetNom(){
			
			geometria= new Geometria();
			geometria.setNom("a");
			String resultado = geometria.getNom();
			String esperado = "a";
			assertEquals(esperado, resultado);	
			
	    }
	
	@Test
	public void testSetArea(){
			
			geometria= new Geometria();
			geometria.setArea(2);
			double resultado = geometria.getArea();
			double esperado = 2;
			assertEquals(esperado, resultado);	
	    }
	
	@Test
	public void testToString(){
			
			geometria= new Geometria(1);
			
			String resultado = geometria.toString();
			String esperado = "Geometria [id=1, nom=cuadrado, area=0.0]";
			assertEquals(esperado, resultado);	
	    }
	
}
