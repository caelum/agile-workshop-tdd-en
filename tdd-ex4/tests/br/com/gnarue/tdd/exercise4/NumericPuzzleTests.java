package br.com.gnarue.tdd.exercise4;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gnarus.tdd.exercise4.NumericPuzzle;


public class NumericPuzzleTests {

	@Test
	public void shouldBuildPathForBegin2AndEnd2() {
		assertEquals("2 ", new NumericPuzzle().buildPath(2,2));
	}
	
	@Test
	public void shouldBuildPathForBegin2AndEnd4() {
		assertEquals("2 4 ", new NumericPuzzle().buildPath(2,4));
	}
	
	@Test
	public void shouldBuildPathForBegin2AndEnd8() {
		assertEquals("2 4 8 ", new NumericPuzzle().buildPath(2,8));
	}
	
	@Test
	public void shouldBuildPathForBegin2AndEnd10() {
		assertEquals("2 4 8 10 ", new NumericPuzzle().buildPath(2,10));
	}

	@Test
	public void shouldBuildPathForBegin3AndEnd10() {
		assertEquals("3 5 10 ", new NumericPuzzle().buildPath(3,10));
	}

	@Test
	public void shouldBuildPathForBegin2AndEnd9() {
		assertEquals("2 4 8 16 18 9 ", new NumericPuzzle().buildPath(2,9));
	}
	
	@Test
	public void shouldBuildPathForBegin9AndEnd2() {
		assertEquals("9 18 20 10 12 6 8 4 2 ", new NumericPuzzle().buildPath(9,2));
	}
	
	@Test
	public void shouldBuildPathForBegin3AndEnd11() {
		assertEquals("3 5 7 9 11 ", new NumericPuzzle().buildPath(3,11));
	}
}
