package br.com.caelum.tdd.exercise6;

import java.util.List;

public class WeightedMovingAverage{
	
	public double calculate(int position, List<Candle> series, String type){
		double sum = 0.0;
		int weight = 1;
		
		for(int i = position -2; i <= position; i++){
			Candle c = series.get(i);
			sum += (type.equals("opening")? c.getOpening() : c.getClosing())*weight;
			weight++;
		}
		return sum/6;
	}
}
