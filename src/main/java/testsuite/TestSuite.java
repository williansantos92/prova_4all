package testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.Desafio1;
import tests.Desafio2;

@RunWith(Suite.class)
@SuiteClasses({
	Desafio1.class,
	Desafio2.class
})
public class TestSuite {
	

}
