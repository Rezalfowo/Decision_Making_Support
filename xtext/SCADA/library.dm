Library rules 

decisionrule Unanimity (Rating Ranking YesNo)  "Selects the choices gathering all the votes."
decisionrule SuperMajority (Rating Ranking YesNo)"Selects the choices having more than a specific threshold above 50%."
decisionrule Majority (Rating Ranking YesNo)"Selects the choices having more than 50% of the votes." 
decisionrule RelativeMajority (Rating Ranking YesNo) "Selects the choices with the most votes."
decisionrule AggregationOfPreferences (Rating YesNo) "Aggregates preferences"
decisionrule numberIterations (Rating Ranking YesNo) "Specifies a number of iterations in the decision-making process"
decisionrule pairwiseComparison (YesNo) "comparison of the solutions with multiple iterations of two solutions provided"
decisionrule weightingCriteria (Rating) "actors weight the criteria of the solutions"

algorithm Confidence (Rating Ranking YesNo) considersTP yes "Set weights on the different team profiles to select the choice with the most weight."
algorithm Utility (Rating) considersTP no "function associating a weight to each alternative indicating its expediency according to its consequences"
algorithm Probability (Rating) considersTP no "takes into account criteria established for each solution and provide the best recommended alternative matching with those criteria."
algorithm meanscore (Rating Ranking YesNo) considersTP no "takes into account the scores provided by the actors and compute a mean score"
algorithm medianscore (Rating Ranking YesNo) considersTP no "takes into account the scores provided by the actors and compute a median score"


Strategy Brainstorming { decisionrule Unanimity } 
Strategy Voting {decisionrule Majority } 
Strategy Delphi {decisionrule numberIterations then algorithm meanscore then algorithm medianscore }
Strategy Consensus {decisionrule numberIterations then decisionrule Unanimity then decisionrule SuperMajority then decisionrule Majority}
Strategy AHP {decisionrule pairwiseComparison then decisionrule weightingCriteria}
Strategy NGT {decisionrule Unanimity then decisionrule SuperMajority then decisionrule Majority} 
Strategy DelphiConfidence {decisionrule numberIterations then algorithm meanscore algorithm Confidence then algorithm medianscore algorithm Confidence}
