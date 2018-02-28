package ElrobodeCatwoman;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
	
@RunWith(Parameterized.class)
public class ElrobodeCatwomanAcierto{


	private int digitos;
	private int num;
	private int digitosacertados;
	
	public ElrobodeCatwomanAcierto (int digitos, int num, int digitosacertados) {
		this.digitos = digitos;
		this.num = num;
		this.digitosacertados = digitosacertados;
	}
	
	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] {
			/*{4395, 4359, 0},
			{3459, 4359, 0},
			{3495, 4359, 0},
			{3549, 4359, 0},
			{3594, 4359, 0},
			{3945, 4359, 0},
			{3954, 4359, 0},
			{4395, 4359, 0},
			{4539, 4359, 0},
			{4593, 4359, 0},
			{4935, 4359, 0},
			{4953, 4359, 0},
			{5349, 4359, 0},
			{5394, 4359, 0},
			{5439, 4359, 0},
			{5493, 4359, 0},
			{5934, 4359, 0},
			{5943, 4359, 0},
			{9345, 4359, 0},
			{9354, 4359, 0},
			{9435, 4359, 0},
			{9453, 4359, 0},
			{9534, 4359, 0},*/
			{4359, 4359, 1}
		});
		
	}
	@Test
	public void testAcertada() {
		ElrobodeCatwoman.acertada(digitos,  num, digitosacertados);
		assertEquals(digitos,  num, digitosacertados);
	}
}