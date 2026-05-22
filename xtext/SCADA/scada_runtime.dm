import "scada.teamprofile"
import "scada_authorization.sadd"
import "scada_authentication.sadd"
import "scada.sadd"

Runtime using SCADADecisionMaking {  
	SCADA.CategoryAuthorizationActiveComponent {
		SADDAuthorization {
			SADDAuthorization.RBAC
			{
				Bob selected 3 rationale "Not sufficient"
				Alice selected 5 rationale "Best solution"
				Carlos selected 3 rationale "..."
				David selected 5 rationale "Needed in our project to strengthen authorization process of our users"
			}
			
		}
	}
}