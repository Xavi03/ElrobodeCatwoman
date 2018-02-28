package ElrobodeCatwoman;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	
@RunWith(Parameterized.class)
public class ElrobodeCatwomanError{


	private int digitos;
	private int num;
	
	public ElrobodeCatwomanError (int digitos, int num) {
		this.digitos = digitos;
		this.num = num;
	}
	
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			{4395, 4359},
			{3459, 4359},
			{3495, 4359},
			{3549, 4359},
			{3594, 4359},
			{3945, 4359},
			{3954, 4359},
			{4395, 4359},
			{4539, 4359},
			{4593, 4359},
			{4935, 4359},
			{4953, 4359},
			{5349, 4359},
			{5394, 4359},
			{5439, 4359},
			{5493, 4359},
			{5934, 4359},
			{5943, 4359},
			{9345, 4359},
			{9354, 4359},
			{9435, 4359},
			{9453, 4359},
			{9534, 4359},
			{9543, 4359}
		});
		
	}
	@Test
	public void testError() {
		ElrobodeCatwoman.error(digitos,  num);
		assertNotSame(digitos,  num);
	}
}