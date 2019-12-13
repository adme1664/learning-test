package occ.learning.test;


import static org.assertj.core.api.Assertions.assertThat;

import java.time.Instant;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import occ.learning.Calculator;



public class CalculatorTest {
	
	private Calculator calculatorToRunTest;
	private Instant startedAt;
	
	@BeforeEach
	public void initializeCalculator() {
		System.out.println("Appel avant la cr�ation du calculator");
		calculatorToRunTest=new Calculator();
		startedAt=Instant.now();
	}
	
	@AfterEach
	public void resetCalculator() {
		System.out.println("Appel �pr�s la cr�ation du calculator");
		calculatorToRunTest=null;
	}
	
	
	@ParameterizedTest(name="{0} + {1} est �gal {2}")
	@CsvSource({"1,2,3","3,5,8"})
	public void testAddTwoPositiveNumber(int a, int b, int expectedResult) {
		//Arrange
		
		//Act
		int somme=calculatorToRunTest.add(a,b);
		//Assert
		assertThat(somme).isEqualTo(expectedResult);
		
	}
	
	@Test
	public void testMultiplyTwoPositiveNumbers() {
		//Arrange
		int a=4;
		int b=5;
		//Act
		int result=calculatorToRunTest.multiply(a,b);
		//Assert
		assertThat(result).isEqualTo(20);
	}
	
	@Test
	public void testDigitInNumbers() {
		//Given
		int number=9867;
		//When
		Set<Integer> integers=calculatorToRunTest.digitNumber(number);
		//THen
		assertThat(integers).containsExactlyInAnyOrder(8,9,6,7);	
	}

}