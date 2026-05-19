import "scada_authentication.sadd"
import "scada.sadd"
import "library.dm"
import "scada.teamprofile"
DesignTime {
	DecisionSupport SCADADecisionMaking decidesFor SCADA.CategoryAuthorizationActiveComponent
		{ 
			Strategy rules.Consensus withPreferenceIndication Rating for Beginner_Authorization Advanced_Authorization Expert_Authorization 
			Strategy AuthenticationActiveComponent withPreferenceIndication Rating { 
				decisionrule rules.Unanimity for Expert_Authentication Advanced_Authentication 
				then decisionrule rules.SuperMajority for Expert_Authentication Advanced_Authentication
				then algorithm rules.Confidence
			} 
			Strategy rules.AHP withPreferenceIndication Ranking
		}
}
