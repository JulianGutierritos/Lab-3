package edu.eci.cvds.tdd.aerodescuentos;
import static org.junit.Assert.fail;
import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
    private long v; 
    private CalculadorDescuentos cd  = new CalculadorDescuentos();

    @Test
    public void validateEdadIgual17DiasIgualA21() {

        v = (long) cd.calculoTarifa(100, 21, 17);
        Assert.assertEquals(80, v);
    }
	
	//Esta prueba no sirvió porque no registra descuento alguno de edad cuando los días de anticipación son 20
	@Test
    public void validateEdadIgual17DiasIgualA20() {
		
        v = (long) cd.calculoTarifa(100, 20, 17);
        Assert.assertEquals(95, v);
    }
	@Test
    public void validateEdadIgual18DiasIgualrA21() {

        v = (long) cd.calculoTarifa(100, 21, 18);
        Assert.assertEquals(85, v);
    }
	
	@Test
    public void validateEdadIgual18DiasIgualA20() {
		
        v = (long) cd.calculoTarifa(100, 20, 18);
        Assert.assertEquals(100, v);
    }
	
	@Test
    public void validateEdadIgual66DiasIgualA21() {
        v = (long) cd.calculoTarifa(100, 21, 66);
        Assert.assertEquals(77, v);
    }
	
	//Esta prueba no sirvió porque no registra descuento alguno de edad cuando los días de anticipación son 20
	@Test
    public void validateEdadIgual66DiasIgualA20() {
        v = (long) cd.calculoTarifa(100, 20, 66);
        Assert.assertEquals(92, v);
    }
	
	@Test
    public void validateEdadIgual65DiasIgualA21() {
        v = (long) cd.calculoTarifa(100, 21, 65);
        Assert.assertEquals(85, v);
    }
	
	@Test
    public void validateEdadIgual65DiasIgualA20() {
        v = (long) cd.calculoTarifa(100, 20, 65);
        Assert.assertEquals(100, v);
    }
	
	//Esta prueba no sirvió porque la clase de excepciones no se encuentra implementada
	@Test
    public void validateEdadIgualMenos1() {
		try{
        v = (long) cd.calculoTarifa(100, 20, -1);
		fail();
        Assert.assertEquals(100, v);
		}catch (Exception e){
		}	
    }	
	
	@Test
    public void validateEdadIgual0() {
        v = (long) cd.calculoTarifa(100, 20, 0);
        Assert.assertEquals(100, v);
    }	
	
	//Esta prueba no sirvió porque la clase de excepciones no se encuentra implementada
	@Test
    public void validateDiasIgualMenos1() {
		try{
        v = (long) cd.calculoTarifa(100, -1, 21);
		fail();
        Assert.assertEquals(100, v);
		}catch (Exception e){
		}	
    }	
	
	@Test
    public void validateDiasIgual0() {
        v = (long) cd.calculoTarifa(100, 0, 21);
        Assert.assertEquals(100, v);
    }	
	
	//Esta prueba no sirvió porque la clase de excepciones no se encuentra implementada
	@Test
    public void validateTarifaIgualMenos1() {
		try{
        v = (long) cd.calculoTarifa(-1, 20, 21);
		fail();
        Assert.assertEquals(100, v);
		}catch (Exception e){
		}	
    }
	
	@Test
    public void validateTarifaIgual0() {
        v = (long) cd.calculoTarifa(0, 21, 22);
		Assert.assertEquals(0, v);
	}
}