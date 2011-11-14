package br.com.caelum.tdd.exercise1;

public enum Position {
	DEVELOPER(new TenOrTwentyPercentRule()),
	DBA(new FifteenOrTwentyFivePercentRule()),
	TESTER(new FifteenOrTwentyFivePercentRule()),
	PROJECT_MANAGER(new FifteenOrTwentyPercentRule());
	
	private final Rule rule;

	private Position(Rule rule) {
		this.rule = rule;
	}

	public Rule getRule() {
		return rule;
	}
}
