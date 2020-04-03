package lsystems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		List<Character> result = new ArrayList<>();

		for (char c : line) {
			LRule rule = findRule(c);

			for (char ch : rule.getBody()) {
				result.add(ch);
			}

		}

		this.line = listToArray(result);
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}

	private LRule findRule(char c) throws LSystemSymbolException {
		for (LRule rule : this.rules) {
			if (rule.getMatch() == c) {
				return rule;
			}
		}
		// Tultiin for-loopin ulkopuolelle, siis minkään rulen match ei ollut c
		throw new LSystemSymbolException();
	}
	
}
