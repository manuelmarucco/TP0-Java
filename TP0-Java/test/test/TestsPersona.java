package test;

import org.junit.Test;
import org.junit.Assert;

import classes.Chorizo;
import classes.Comida;
import classes.Persona;
import classes.Tocino;

public class TestsPersona {

	@Test
	public void ColesterolDePersona200Normal() {
		Persona persona = new Persona();
		
		Assert.assertEquals(persona.getColesterol(),200);
		Assert.assertTrue(persona.estaBien());
		
	}
	
	@Test
	public void ComeChorizoYColesterolMal() {
		Persona persona = new Persona();
		Comida chorizo = new Chorizo();
		
		persona.comer(chorizo);
		
		Assert.assertEquals(persona.getColesterol(),220);
		Assert.assertFalse(persona.estaBien());
		
	}
	
	@Test
	public void ComeTocinoYColesterolMal() {
		Persona persona = new Persona();
		Comida tocino = new Tocino();
		
		persona.comer(tocino);
		
		Assert.assertEquals(persona.getColesterol(),250);
		Assert.assertFalse(persona.estaBien());
		
	}
	
	@Test
	public void Come2ComidasYlaCantidadDeComidasEs2(){
		Persona persona = new Persona();
		Comida chorizo = new Chorizo();
		Comida tocino = new Tocino();
		
		persona.comer(chorizo);
		persona.comer(tocino);
		
		Assert.assertEquals(persona.getCantidadDeComidas(), 2);
	}
	
	@Test
	public void ComePastillaYNormalizaColesterol(){
		Persona persona = new Persona();
		Comida tocino = new Tocino();
		
		persona.comer(tocino);
		persona.tomarPastilla();
		
		Assert.assertTrue(persona.estaBien());
	}
	
}
