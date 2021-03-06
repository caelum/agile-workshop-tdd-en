package br.com.caelum.tdd.exercise6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;

import org.junit.Test;

import br.com.caelum.tdd.exercise6.Candle;
import br.com.caelum.tdd.exercise6.MinimumIndicator;

public class MinimumIndicatorTests {

	@Test
	public void shouldReturnTheMinimumCandleValue() {
		double amount = new MinimumIndicator().calculate(1, Arrays.asList(
				candleWithMinimum(10.0), candleWithMinimum(12.0),
				candleWithMinimum(11.0)));

		assertEquals(12.0, amount, 0.00001);

	}

	private Candle candleWithMinimum(double minimum) {
		return new Candle(0, 0, minimum, 0, Calendar.getInstance());
	}
}
