package br.com.gnarus.tdd.exercise4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumericPuzzle {

	private int begin;
	private int end;
	private List<Number> queue;
	private Set<Integer> visited;
	
	public NumericPuzzle() {
		this.queue = new ArrayList<Number>();
		this.visited = new HashSet<Integer>();
	}

	public String buildPath(int begin, int end) {
		this.begin = begin;
		this.end = end;
		
		return formatOutput(lookForSolution());
	}
	
	private Number lookForSolution() {
		 
		addRootInQueue();
		
		while(thereAreNumbersInTheLine()) {
			Number currentNumber = removeFromQueue();
			
			if(foundAnExit(currentNumber)) return currentNumber;
			addInTheQueue(
				multiplyPer2(currentNumber),
				(isEven(currentNumber)?divideBy2(currentNumber):null),
				plus2(currentNumber)
			);
		}
		
		return null;
	}

	private boolean isEven(Number number) {
		return number.getValue()%2==0;
	}

	private boolean foundAnExit(Number number) {
		return number.getValue() == end;
	}

	private boolean thereAreNumbersInTheLine() {
		return queue.size()!=0;
	}

	private void addRootInQueue() {
		queue.add(new Number(begin, null));
	}
	
	private void addInTheQueue(Number... numbers) {
		for(Number number : numbers) {
			if(number!=null) {
				if(!visited.contains(number.getValue())) {
					queue.add(number);
					visited.add(number.getValue());
				}
			}
		}
	}

	private String formatOutput(Number solution) {
		String reply = "";
			while(solution!=null) {
				reply = solution.getValue() + " " + reply;
				solution = solution.getParent();
			}
		return reply;
	}
	
	private Number multiplyPer2(Number number) {
		return new Number(number.getValue()*2, number);
	}

	private Number divideBy2(Number number) {
		return new Number(number.getValue()/2, number);
	}
	
	private Number plus2(Number number) {
		return new Number(number.getValue()+2, number);
	}

	private Number removeFromQueue() {
		Number head = queue.get(0);
		queue.remove(0);
		return head;
	}
	

}
