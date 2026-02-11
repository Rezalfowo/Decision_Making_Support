import "scada_authentication.secadd"
import "scada.secadd"
import "library.dm"
import "scada.teamprofile"
DesignTime {
	DecisionSupport SCADADecisionMaking decidesFor CategoryAuthenticationActiveComponent
		{ 
			Strategy rules.Consensus with preference indication Rating
			Strategy AuthenticationActiveComponent with preference indication Rating { 
				decisionrule rules.Unanimity for Expert_Authentication Advanced_Authentication 
				then decisionrule rules.SuperMajority for Expert_Authentication Advanced_Authentication
				then algorithm rules.Confidence
			} 
			Strategy rules.AHP with preference indication Ranking
		}
}
