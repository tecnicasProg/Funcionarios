package tecnicas.Funcionarios;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FuncionarioTest{
	private int fInput;
	private int fExpected;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }  
		});
	}

	@Test
	public void Funcionar(int input, int expected) {
		this.fInput = input;
		this.fExpected = expected;
		Funcionario Funcionario = new Funcionario();
	}

	@Test
	public void test() {
		assertEquals(fExpected, Funcionario.Calcula(fInput));
	}
}




