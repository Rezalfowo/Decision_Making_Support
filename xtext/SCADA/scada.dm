//import "library.dm"
import "scada.secadd"
import "scada_authentication.secadd"
import "scada_authorization.secadd"
import "scada.teamprofile"
PriorityConfiguration { SecurityADD > Group > Project } for SCADA


Strategy ResolutionAuthentication decidesFor  SADDAuthentication {
	decisionrule Unanimity for Architects Designers Developers then decisionrule SuperMajority for Architects Designers
}

Strategy ResolutionGroupAuthentication decidesFor GroupAuthenticationActiveComponent {
	decisionrule Majority for Architects Designers then decisionrule Majority for Architects
}

Strategy ResolutionAuthorization decidesFor SADDAuthorization {
	decisionrule Unanimity for Architects Designers Developers then decisionrule SuperMajority for Architects Designers
}

Strategy ResolutionGroupAuthorization decidesFor GroupAuthorizationActiveComponent {
	decisionrule Majority for Architects Designers then decisionrule Majority for Architects
}

Strategy ResolutionProject decidesFor SCADA { 
	algorithm Confidence
}
/**
 * Concept of library to import these rules without having to define them here ?
 */
decisionrule Unanimity "Selects the choices gathering all the votes."
decisionrule SuperMajority "Selects the choices having more than a specific threshold above 50%."
decisionrule Majority "Selects the choices having more than 50% of the votes." 
decisionrule RelativeMajority "Selects the choices with the most votes."
algorithm Confidence "Set weights on the different team profiles to select the choice with the most weight."

