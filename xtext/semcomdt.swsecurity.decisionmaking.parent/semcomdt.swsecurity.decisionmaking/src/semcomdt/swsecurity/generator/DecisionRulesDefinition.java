package semcomdt.swsecurity.generator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import semcomdt.swsecurity.decisionmaking.Preference;

public class DecisionRulesDefinition {
	int majority_percentage = 50;
	int super_majority_percentage = 75;
	int unanimity = 100;

	public static boolean isMajority(List<Preference> preferences) {
		Map<Object, Long> results = preferences.stream()
				.collect(Collectors.groupingBy(e -> e.getValue(), Collectors.counting()));
		results.forEach((t, u) -> System.out.println(t.toString() + "value=" + u));
		// Retrieve only the profiles we want

		return true;
	}

}
