import "scada.teamprofile"
import "scada_authorization.secadd"
import "scada_authentication.secadd"

Runtime { 
	Bob selected (
		3 for SADDAuthorization.RBAC rationale "Not sufficient" 
		4 for SADDAuthorization.ABAC rationale "Would be more relevant for our purpose than RBAC"
		5 for SADDAuthorization.RBAC_ABAC rationale "Combination might be what we need"
	)
	Alice selected (
		5 for SADDAuthorization.RBAC rationale "Best solution" 
		2 for SADDAuthorization.ABAC rationale "Not relevant"
		1 for SADDAuthorization.RBAC_ABAC rationale "Too much of a burden"
	)
	Carlos selected (
		3 for SADDAuthorization.RBAC rationale "..." 
		2 for SADDAuthorization.ABAC rationale "..."
		2 for SADDAuthorization.RBAC_ABAC rationale "..."
	)
	David selected (
		5 for SADDAuthorization.RBAC rationale "Needed in our project to strenghten authorization process of our users" 
		2 for SADDAuthorization.ABAC rationale "Never used this solution"
		3 for SADDAuthorization.RBAC_ABAC rationale "Too complex to combine them as I don't know anything about their combination"
	)
}