package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.TeamprofileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTeamprofileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Actor'", "':'", "'gathers'", "'{'", "'}'", "'characterizedBy'", "'='"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalTeamprofileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTeamprofileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTeamprofileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTeamprofile.g"; }



     	private TeamprofileGrammarAccess grammarAccess;

        public InternalTeamprofileParser(TokenStream input, TeamprofileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Profiling";
       	}

       	@Override
       	protected TeamprofileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProfiling"
    // InternalTeamprofile.g:64:1: entryRuleProfiling returns [EObject current=null] : iv_ruleProfiling= ruleProfiling EOF ;
    public final EObject entryRuleProfiling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfiling = null;


        try {
            // InternalTeamprofile.g:64:50: (iv_ruleProfiling= ruleProfiling EOF )
            // InternalTeamprofile.g:65:2: iv_ruleProfiling= ruleProfiling EOF
            {
             newCompositeNode(grammarAccess.getProfilingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfiling=ruleProfiling();

            state._fsp--;

             current =iv_ruleProfiling; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfiling"


    // $ANTLR start "ruleProfiling"
    // InternalTeamprofile.g:71:1: ruleProfiling returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_profiles_2_0= ruleProfile ) )* ) ;
    public final EObject ruleProfiling() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_actors_1_0 = null;

        EObject lv_profiles_2_0 = null;



        	enterRule();

        try {
            // InternalTeamprofile.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_profiles_2_0= ruleProfile ) )* ) )
            // InternalTeamprofile.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_profiles_2_0= ruleProfile ) )* )
            {
            // InternalTeamprofile.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_profiles_2_0= ruleProfile ) )* )
            // InternalTeamprofile.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_profiles_2_0= ruleProfile ) )*
            {
            // InternalTeamprofile.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTeamprofile.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalTeamprofile.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalTeamprofile.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getProfilingAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfilingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"xtext.Teamprofile.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTeamprofile.g:98:3: ( (lv_actors_1_0= ruleActor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTeamprofile.g:99:4: (lv_actors_1_0= ruleActor )
            	    {
            	    // InternalTeamprofile.g:99:4: (lv_actors_1_0= ruleActor )
            	    // InternalTeamprofile.g:100:5: lv_actors_1_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getProfilingAccess().getActorsActorParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_actors_1_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfilingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_1_0,
            	    						"xtext.Teamprofile.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTeamprofile.g:117:3: ( (lv_profiles_2_0= ruleProfile ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTeamprofile.g:118:4: (lv_profiles_2_0= ruleProfile )
            	    {
            	    // InternalTeamprofile.g:118:4: (lv_profiles_2_0= ruleProfile )
            	    // InternalTeamprofile.g:119:5: lv_profiles_2_0= ruleProfile
            	    {

            	    					newCompositeNode(grammarAccess.getProfilingAccess().getProfilesProfileParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_profiles_2_0=ruleProfile();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfilingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"profiles",
            	    						lv_profiles_2_0,
            	    						"xtext.Teamprofile.Profile");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfiling"


    // $ANTLR start "entryRuleImport"
    // InternalTeamprofile.g:140:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTeamprofile.g:140:47: (iv_ruleImport= ruleImport EOF )
            // InternalTeamprofile.g:141:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTeamprofile.g:147:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalTeamprofile.g:153:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalTeamprofile.g:154:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalTeamprofile.g:154:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalTeamprofile.g:155:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTeamprofile.g:159:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalTeamprofile.g:160:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalTeamprofile.g:160:4: (lv_importURI_1_0= RULE_STRING )
            // InternalTeamprofile.g:161:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleActor"
    // InternalTeamprofile.g:181:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalTeamprofile.g:181:46: (iv_ruleActor= ruleActor EOF )
            // InternalTeamprofile.g:182:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalTeamprofile.g:188:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attributes_3_0= ruleAttribute ) )+ ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalTeamprofile.g:194:2: ( (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attributes_3_0= ruleAttribute ) )+ ) )
            // InternalTeamprofile.g:195:2: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attributes_3_0= ruleAttribute ) )+ )
            {
            // InternalTeamprofile.g:195:2: (otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attributes_3_0= ruleAttribute ) )+ )
            // InternalTeamprofile.g:196:3: otherlv_0= 'Actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attributes_3_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalTeamprofile.g:200:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTeamprofile.g:201:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTeamprofile.g:201:4: (lv_name_1_0= RULE_ID )
            // InternalTeamprofile.g:202:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getColonKeyword_2());
            		
            // InternalTeamprofile.g:222:3: ( (lv_attributes_3_0= ruleAttribute ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTeamprofile.g:223:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalTeamprofile.g:223:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalTeamprofile.g:224:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getActorAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getActorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"xtext.Teamprofile.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleProfile"
    // InternalTeamprofile.g:245:1: entryRuleProfile returns [EObject current=null] : iv_ruleProfile= ruleProfile EOF ;
    public final EObject entryRuleProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProfile = null;


        try {
            // InternalTeamprofile.g:245:48: (iv_ruleProfile= ruleProfile EOF )
            // InternalTeamprofile.g:246:2: iv_ruleProfile= ruleProfile EOF
            {
             newCompositeNode(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProfile=ruleProfile();

            state._fsp--;

             current =iv_ruleProfile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalTeamprofile.g:252:1: ruleProfile returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'gathers' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )* otherlv_5= 'characterizedBy' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' ) ;
    public final EObject ruleProfile() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalTeamprofile.g:258:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'gathers' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )* otherlv_5= 'characterizedBy' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' ) )
            // InternalTeamprofile.g:259:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'gathers' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )* otherlv_5= 'characterizedBy' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' )
            {
            // InternalTeamprofile.g:259:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'gathers' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )* otherlv_5= 'characterizedBy' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}' )
            // InternalTeamprofile.g:260:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'gathers' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )* otherlv_5= 'characterizedBy' otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) )+ otherlv_8= '}'
            {
            // InternalTeamprofile.g:260:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTeamprofile.g:261:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTeamprofile.g:261:4: (lv_name_0_0= RULE_ID )
            // InternalTeamprofile.g:262:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getProfileAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProfileRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTeamprofile.g:278:3: (otherlv_1= 'gathers' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTeamprofile.g:279:4: otherlv_1= 'gathers' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )* otherlv_4= '}'
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getProfileAccess().getGathersKeyword_1_0());
            	    			
            	    otherlv_2=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_1_1());
            	    			
            	    // InternalTeamprofile.g:287:4: ( (otherlv_3= RULE_ID ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_ID) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalTeamprofile.g:288:5: (otherlv_3= RULE_ID )
            	    	    {
            	    	    // InternalTeamprofile.g:288:5: (otherlv_3= RULE_ID )
            	    	    // InternalTeamprofile.g:289:6: otherlv_3= RULE_ID
            	    	    {

            	    	    						if (current==null) {
            	    	    							current = createModelElement(grammarAccess.getProfileRule());
            	    	    						}
            	    	    					
            	    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    	    						newLeafNode(otherlv_3, grammarAccess.getProfileAccess().getActorsActorCrossReference_1_2_0());
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_4=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_1_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getProfileAccess().getCharacterizedByKeyword_2());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalTeamprofile.g:313:3: ( (lv_attributes_7_0= ruleAttribute ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTeamprofile.g:314:4: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalTeamprofile.g:314:4: (lv_attributes_7_0= ruleAttribute )
            	    // InternalTeamprofile.g:315:5: lv_attributes_7_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getProfileAccess().getAttributesAttributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProfileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_7_0,
            	    						"xtext.Teamprofile.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleAttribute"
    // InternalTeamprofile.g:340:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalTeamprofile.g:340:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalTeamprofile.g:341:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTeamprofile.g:347:1: ruleAttribute returns [EObject current=null] : ( ( (lv_hfproperty_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_hfmeasurementvalue_2_0= ruleValueKind ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_hfproperty_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_hfmeasurementvalue_2_0 = null;



        	enterRule();

        try {
            // InternalTeamprofile.g:353:2: ( ( ( (lv_hfproperty_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_hfmeasurementvalue_2_0= ruleValueKind ) ) ) )
            // InternalTeamprofile.g:354:2: ( ( (lv_hfproperty_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_hfmeasurementvalue_2_0= ruleValueKind ) ) )
            {
            // InternalTeamprofile.g:354:2: ( ( (lv_hfproperty_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_hfmeasurementvalue_2_0= ruleValueKind ) ) )
            // InternalTeamprofile.g:355:3: ( (lv_hfproperty_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_hfmeasurementvalue_2_0= ruleValueKind ) )
            {
            // InternalTeamprofile.g:355:3: ( (lv_hfproperty_0_0= RULE_STRING ) )
            // InternalTeamprofile.g:356:4: (lv_hfproperty_0_0= RULE_STRING )
            {
            // InternalTeamprofile.g:356:4: (lv_hfproperty_0_0= RULE_STRING )
            // InternalTeamprofile.g:357:5: lv_hfproperty_0_0= RULE_STRING
            {
            lv_hfproperty_0_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_hfproperty_0_0, grammarAccess.getAttributeAccess().getHfpropertySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"hfproperty",
            						lv_hfproperty_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalTeamprofile.g:377:3: ( (lv_hfmeasurementvalue_2_0= ruleValueKind ) )
            // InternalTeamprofile.g:378:4: (lv_hfmeasurementvalue_2_0= ruleValueKind )
            {
            // InternalTeamprofile.g:378:4: (lv_hfmeasurementvalue_2_0= ruleValueKind )
            // InternalTeamprofile.g:379:5: lv_hfmeasurementvalue_2_0= ruleValueKind
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getHfmeasurementvalueValueKindParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_hfmeasurementvalue_2_0=ruleValueKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"hfmeasurementvalue",
            						lv_hfmeasurementvalue_2_0,
            						"xtext.Teamprofile.ValueKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValueKind"
    // InternalTeamprofile.g:400:1: entryRuleValueKind returns [String current=null] : iv_ruleValueKind= ruleValueKind EOF ;
    public final String entryRuleValueKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueKind = null;


        try {
            // InternalTeamprofile.g:400:49: (iv_ruleValueKind= ruleValueKind EOF )
            // InternalTeamprofile.g:401:2: iv_ruleValueKind= ruleValueKind EOF
            {
             newCompositeNode(grammarAccess.getValueKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueKind=ruleValueKind();

            state._fsp--;

             current =iv_ruleValueKind.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueKind"


    // $ANTLR start "ruleValueKind"
    // InternalTeamprofile.g:407:1: ruleValueKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValueKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalTeamprofile.g:413:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalTeamprofile.g:414:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalTeamprofile.g:414:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTeamprofile.g:415:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueKindAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTeamprofile.g:423:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueKindAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000050L});

}