package br.com.caelum.tdd.exercise6;

import java.util.List;

public class MinimumIndicator{
	
	public double calculate(int position, List<Candle> serie){
		return serie.get(position).getMinimum();
	}
}
