package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();
		//System.out.println(person.toString());

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
	
	@Test
    public void shouldBeDead() {
        Person person = new Person("Natalita Duran", 1000492643, 19, Gender.FEMALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
	
	@Test
    public void shouldBeUndarage() {
        Person person = new Person("Alan Brito", 1132492643, 17, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
	
	@Test
    public void shouldBeInvalid() {
        Person person = new Person("Cosme Fulanito", 1132495890, -17, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
	
	@Test
    public void shouldBeValid() {
        Person person = new Person("Julian Gutierritos", 1000476452, 21, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
	
	@Test
    public void shouldBeDuplicated() {
        Person person = new Person("Señora Y", 1521476452, 50, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
		Assert.assertEquals(RegisterResult.VALID, result);
		result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }


    // TODO Complete with more test cases
}