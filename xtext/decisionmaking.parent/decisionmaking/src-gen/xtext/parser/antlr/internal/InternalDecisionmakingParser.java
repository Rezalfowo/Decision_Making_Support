package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.DecisionmakingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDecisionmakingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Library'", "'Strategy'", "'withPreferenceIndication'", "'{'", "'then'", "'}'", "'decisionrule'", "'for'", "'algorithm'", "'('", "')'", "'considersTP'", "'DesignTime'", "'DecisionSupport'", "'decidesFor'", "'Runtime'", "'using'", "'selected'", "'rationale'", "'.'", "'Ranking'", "'Rating'", "'YesNo'", "'no'", "'yes'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDecisionmakingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDecisionmakingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDecisionmakingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDecisionmaking.g"; }



     	private DecisionmakingGrammarAccess grammarAccess;

        public InternalDecisionmakingParser(TokenStream input, DecisionmakingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GroupDecisionSession";
       	}

       	@Override
       	protected DecisionmakingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGroupDecisionSession"
    // InternalDecisionmaking.g:65:1: entryRuleGroupDecisionSession returns [EObject current=null] : iv_ruleGroupDecisionSession= ruleGroupDecisionSession EOF ;
    public final EObject entryRuleGroupDecisionSession() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupDecisionSession = null;


        try {
            // InternalDecisionmaking.g:65:61: (iv_ruleGroupDecisionSession= ruleGroupDecisionSession EOF )
            // InternalDecisionmaking.g:66:2: iv_ruleGroupDecisionSession= ruleGroupDecisionSession EOF
            {
             newCompositeNode(grammarAccess.getGroupDecisionSessionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupDecisionSession=ruleGroupDecisionSession();

            state._fsp--;

             current =iv_ruleGroupDecisionSession; 
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
    // $ANTLR end "entryRuleGroupDecisionSession"


    // $ANTLR start "ruleGroupDecisionSession"
    // InternalDecisionmaking.g:72:1: ruleGroupDecisionSession returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_decisionSupport_1_0= ruleLibDesRun ) ) ) ;
    public final EObject ruleGroupDecisionSession() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_decisionSupport_1_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_decisionSupport_1_0= ruleLibDesRun ) ) ) )
            // InternalDecisionmaking.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_decisionSupport_1_0= ruleLibDesRun ) ) )
            {
            // InternalDecisionmaking.g:79:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_decisionSupport_1_0= ruleLibDesRun ) ) )
            // InternalDecisionmaking.g:80:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_decisionSupport_1_0= ruleLibDesRun ) )
            {
            // InternalDecisionmaking.g:80:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDecisionmaking.g:81:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalDecisionmaking.g:81:4: (lv_imports_0_0= ruleImport )
            	    // InternalDecisionmaking.g:82:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getGroupDecisionSessionAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGroupDecisionSessionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"xtext.Decisionmaking.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDecisionmaking.g:99:3: ( (lv_decisionSupport_1_0= ruleLibDesRun ) )
            // InternalDecisionmaking.g:100:4: (lv_decisionSupport_1_0= ruleLibDesRun )
            {
            // InternalDecisionmaking.g:100:4: (lv_decisionSupport_1_0= ruleLibDesRun )
            // InternalDecisionmaking.g:101:5: lv_decisionSupport_1_0= ruleLibDesRun
            {

            					newCompositeNode(grammarAccess.getGroupDecisionSessionAccess().getDecisionSupportLibDesRunParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_decisionSupport_1_0=ruleLibDesRun();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupDecisionSessionRule());
            					}
            					set(
            						current,
            						"decisionSupport",
            						lv_decisionSupport_1_0,
            						"xtext.Decisionmaking.LibDesRun");
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
    // $ANTLR end "ruleGroupDecisionSession"


    // $ANTLR start "entryRuleLibDesRun"
    // InternalDecisionmaking.g:122:1: entryRuleLibDesRun returns [EObject current=null] : iv_ruleLibDesRun= ruleLibDesRun EOF ;
    public final EObject entryRuleLibDesRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibDesRun = null;


        try {
            // InternalDecisionmaking.g:122:50: (iv_ruleLibDesRun= ruleLibDesRun EOF )
            // InternalDecisionmaking.g:123:2: iv_ruleLibDesRun= ruleLibDesRun EOF
            {
             newCompositeNode(grammarAccess.getLibDesRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibDesRun=ruleLibDesRun();

            state._fsp--;

             current =iv_ruleLibDesRun; 
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
    // $ANTLR end "entryRuleLibDesRun"


    // $ANTLR start "ruleLibDesRun"
    // InternalDecisionmaking.g:129:1: ruleLibDesRun returns [EObject current=null] : ( ( (lv_library_0_0= ruleLibrary ) ) | ( (lv_designtime_1_0= ruleDesignTime ) ) | ( (lv_runtime_2_0= ruleRunTime ) ) ) ;
    public final EObject ruleLibDesRun() throws RecognitionException {
        EObject current = null;

        EObject lv_library_0_0 = null;

        EObject lv_designtime_1_0 = null;

        EObject lv_runtime_2_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:135:2: ( ( ( (lv_library_0_0= ruleLibrary ) ) | ( (lv_designtime_1_0= ruleDesignTime ) ) | ( (lv_runtime_2_0= ruleRunTime ) ) ) )
            // InternalDecisionmaking.g:136:2: ( ( (lv_library_0_0= ruleLibrary ) ) | ( (lv_designtime_1_0= ruleDesignTime ) ) | ( (lv_runtime_2_0= ruleRunTime ) ) )
            {
            // InternalDecisionmaking.g:136:2: ( ( (lv_library_0_0= ruleLibrary ) ) | ( (lv_designtime_1_0= ruleDesignTime ) ) | ( (lv_runtime_2_0= ruleRunTime ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 20:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDecisionmaking.g:137:3: ( (lv_library_0_0= ruleLibrary ) )
                    {
                    // InternalDecisionmaking.g:137:3: ( (lv_library_0_0= ruleLibrary ) )
                    // InternalDecisionmaking.g:138:4: (lv_library_0_0= ruleLibrary )
                    {
                    // InternalDecisionmaking.g:138:4: (lv_library_0_0= ruleLibrary )
                    // InternalDecisionmaking.g:139:5: lv_library_0_0= ruleLibrary
                    {

                    					newCompositeNode(grammarAccess.getLibDesRunAccess().getLibraryLibraryParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_library_0_0=ruleLibrary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLibDesRunRule());
                    					}
                    					set(
                    						current,
                    						"library",
                    						lv_library_0_0,
                    						"xtext.Decisionmaking.Library");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDecisionmaking.g:157:3: ( (lv_designtime_1_0= ruleDesignTime ) )
                    {
                    // InternalDecisionmaking.g:157:3: ( (lv_designtime_1_0= ruleDesignTime ) )
                    // InternalDecisionmaking.g:158:4: (lv_designtime_1_0= ruleDesignTime )
                    {
                    // InternalDecisionmaking.g:158:4: (lv_designtime_1_0= ruleDesignTime )
                    // InternalDecisionmaking.g:159:5: lv_designtime_1_0= ruleDesignTime
                    {

                    					newCompositeNode(grammarAccess.getLibDesRunAccess().getDesigntimeDesignTimeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_designtime_1_0=ruleDesignTime();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLibDesRunRule());
                    					}
                    					set(
                    						current,
                    						"designtime",
                    						lv_designtime_1_0,
                    						"xtext.Decisionmaking.DesignTime");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDecisionmaking.g:177:3: ( (lv_runtime_2_0= ruleRunTime ) )
                    {
                    // InternalDecisionmaking.g:177:3: ( (lv_runtime_2_0= ruleRunTime ) )
                    // InternalDecisionmaking.g:178:4: (lv_runtime_2_0= ruleRunTime )
                    {
                    // InternalDecisionmaking.g:178:4: (lv_runtime_2_0= ruleRunTime )
                    // InternalDecisionmaking.g:179:5: lv_runtime_2_0= ruleRunTime
                    {

                    					newCompositeNode(grammarAccess.getLibDesRunAccess().getRuntimeRunTimeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_runtime_2_0=ruleRunTime();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLibDesRunRule());
                    					}
                    					set(
                    						current,
                    						"runtime",
                    						lv_runtime_2_0,
                    						"xtext.Decisionmaking.RunTime");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleLibDesRun"


    // $ANTLR start "entryRuleImport"
    // InternalDecisionmaking.g:200:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDecisionmaking.g:200:47: (iv_ruleImport= ruleImport EOF )
            // InternalDecisionmaking.g:201:2: iv_ruleImport= ruleImport EOF
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
    // InternalDecisionmaking.g:207:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:213:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalDecisionmaking.g:214:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalDecisionmaking.g:214:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalDecisionmaking.g:215:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDecisionmaking.g:219:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalDecisionmaking.g:220:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalDecisionmaking.g:220:4: (lv_importURI_1_0= RULE_STRING )
            // InternalDecisionmaking.g:221:5: lv_importURI_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleLibrary"
    // InternalDecisionmaking.g:241:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalDecisionmaking.g:241:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalDecisionmaking.g:242:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalDecisionmaking.g:248:1: ruleLibrary returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_decisionrules_3_0 = null;

        EObject lv_algorithms_4_0 = null;

        EObject lv_strategies_5_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:254:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalDecisionmaking.g:255:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalDecisionmaking.g:255:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?) ) )
            // InternalDecisionmaking.g:256:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?) )
            {
            // InternalDecisionmaking.g:256:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?) )
            // InternalDecisionmaking.g:257:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getLibraryAccess().getUnorderedGroup());
            			
            // InternalDecisionmaking.g:260:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?)
            // InternalDecisionmaking.g:261:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+ {...}?
            {
            // InternalDecisionmaking.g:261:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=4;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 2) ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDecisionmaking.g:262:3: ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) )
            	    {
            	    // InternalDecisionmaking.g:262:3: ({...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) ) )
            	    // InternalDecisionmaking.g:263:4: {...}? => ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLibrary", "getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDecisionmaking.g:263:101: ( ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) ) )
            	    // InternalDecisionmaking.g:264:5: ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLibraryAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDecisionmaking.g:267:8: ({...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* ) )
            	    // InternalDecisionmaking.g:267:9: {...}? => (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLibrary", "true");
            	    }
            	    // InternalDecisionmaking.g:267:18: (otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )* )
            	    // InternalDecisionmaking.g:267:19: otherlv_1= 'Library' ( (lv_name_2_0= RULE_ID ) ) ( (lv_decisionrules_3_0= ruleDecisionRule ) )*
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_1, grammarAccess.getLibraryAccess().getLibraryKeyword_0_0());
            	    							
            	    // InternalDecisionmaking.g:271:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalDecisionmaking.g:272:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalDecisionmaking.g:272:9: (lv_name_2_0= RULE_ID )
            	    // InternalDecisionmaking.g:273:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getLibraryRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    // InternalDecisionmaking.g:289:8: ( (lv_decisionrules_3_0= ruleDecisionRule ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==18) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalDecisionmaking.g:290:9: (lv_decisionrules_3_0= ruleDecisionRule )
            	    	    {
            	    	    // InternalDecisionmaking.g:290:9: (lv_decisionrules_3_0= ruleDecisionRule )
            	    	    // InternalDecisionmaking.g:291:10: lv_decisionrules_3_0= ruleDecisionRule
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getLibraryAccess().getDecisionrulesDecisionRuleParserRuleCall_0_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_decisionrules_3_0=ruleDecisionRule();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"decisionrules",
            	    	    											lv_decisionrules_3_0,
            	    	    											"xtext.Decisionmaking.DecisionRule");
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLibraryAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDecisionmaking.g:314:3: ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) )
            	    {
            	    // InternalDecisionmaking.g:314:3: ({...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ ) )
            	    // InternalDecisionmaking.g:315:4: {...}? => ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLibrary", "getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDecisionmaking.g:315:101: ( ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+ )
            	    // InternalDecisionmaking.g:316:5: ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLibraryAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDecisionmaking.g:319:8: ({...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==20) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalDecisionmaking.g:319:9: {...}? => ( (lv_algorithms_4_0= ruleAlgorithm ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLibrary", "true");
            	    	    }
            	    	    // InternalDecisionmaking.g:319:18: ( (lv_algorithms_4_0= ruleAlgorithm ) )
            	    	    // InternalDecisionmaking.g:319:19: (lv_algorithms_4_0= ruleAlgorithm )
            	    	    {
            	    	    // InternalDecisionmaking.g:319:19: (lv_algorithms_4_0= ruleAlgorithm )
            	    	    // InternalDecisionmaking.g:320:9: lv_algorithms_4_0= ruleAlgorithm
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getLibraryAccess().getAlgorithmsAlgorithmParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_algorithms_4_0=ruleAlgorithm();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"algorithms",
            	    	    										lv_algorithms_4_0,
            	    	    										"xtext.Decisionmaking.Algorithm");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLibraryAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDecisionmaking.g:342:3: ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) )
            	    {
            	    // InternalDecisionmaking.g:342:3: ({...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ ) )
            	    // InternalDecisionmaking.g:343:4: {...}? => ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLibrary", "getUnorderedGroupHelper().canSelect(grammarAccess.getLibraryAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDecisionmaking.g:343:101: ( ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+ )
            	    // InternalDecisionmaking.g:344:5: ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getLibraryAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDecisionmaking.g:347:8: ({...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==13) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalDecisionmaking.g:347:9: {...}? => ( (lv_strategies_5_0= ruleStrategyPredefined ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLibrary", "true");
            	    	    }
            	    	    // InternalDecisionmaking.g:347:18: ( (lv_strategies_5_0= ruleStrategyPredefined ) )
            	    	    // InternalDecisionmaking.g:347:19: (lv_strategies_5_0= ruleStrategyPredefined )
            	    	    {
            	    	    // InternalDecisionmaking.g:347:19: (lv_strategies_5_0= ruleStrategyPredefined )
            	    	    // InternalDecisionmaking.g:348:9: lv_strategies_5_0= ruleStrategyPredefined
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getLibraryAccess().getStrategiesStrategyPredefinedParserRuleCall_2_0());
            	    	    								
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_strategies_5_0=ruleStrategyPredefined();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"strategies",
            	    	    										lv_strategies_5_0,
            	    	    										"xtext.Decisionmaking.StrategyPredefined");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLibraryAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getLibraryAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleLibrary", "getUnorderedGroupHelper().canLeave(grammarAccess.getLibraryAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getLibraryAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleStrategy"
    // InternalDecisionmaking.g:381:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalDecisionmaking.g:381:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalDecisionmaking.g:382:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
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
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalDecisionmaking.g:388:1: ruleStrategy returns [EObject current=null] : (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'withPreferenceIndication' ( (lv_preferenceIndication_3_0= rulePreferenceIndicationKind ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) )* (otherlv_6= 'then' ( (lv_rules_7_0= ruleRule ) )* )* otherlv_8= '}' ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_preferenceIndication_3_0 = null;

        EObject lv_rules_5_0 = null;

        EObject lv_rules_7_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:394:2: ( (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'withPreferenceIndication' ( (lv_preferenceIndication_3_0= rulePreferenceIndicationKind ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) )* (otherlv_6= 'then' ( (lv_rules_7_0= ruleRule ) )* )* otherlv_8= '}' ) )
            // InternalDecisionmaking.g:395:2: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'withPreferenceIndication' ( (lv_preferenceIndication_3_0= rulePreferenceIndicationKind ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) )* (otherlv_6= 'then' ( (lv_rules_7_0= ruleRule ) )* )* otherlv_8= '}' )
            {
            // InternalDecisionmaking.g:395:2: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'withPreferenceIndication' ( (lv_preferenceIndication_3_0= rulePreferenceIndicationKind ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) )* (otherlv_6= 'then' ( (lv_rules_7_0= ruleRule ) )* )* otherlv_8= '}' )
            // InternalDecisionmaking.g:396:3: otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'withPreferenceIndication' ( (lv_preferenceIndication_3_0= rulePreferenceIndicationKind ) ) otherlv_4= '{' ( (lv_rules_5_0= ruleRule ) )* (otherlv_6= 'then' ( (lv_rules_7_0= ruleRule ) )* )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getStrategyKeyword_0());
            		
            // InternalDecisionmaking.g:400:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionmaking.g:401:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionmaking.g:401:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionmaking.g:402:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStrategyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getWithPreferenceIndicationKeyword_2());
            		
            // InternalDecisionmaking.g:422:3: ( (lv_preferenceIndication_3_0= rulePreferenceIndicationKind ) )
            // InternalDecisionmaking.g:423:4: (lv_preferenceIndication_3_0= rulePreferenceIndicationKind )
            {
            // InternalDecisionmaking.g:423:4: (lv_preferenceIndication_3_0= rulePreferenceIndicationKind )
            // InternalDecisionmaking.g:424:5: lv_preferenceIndication_3_0= rulePreferenceIndicationKind
            {

            					newCompositeNode(grammarAccess.getStrategyAccess().getPreferenceIndicationPreferenceIndicationKindEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_preferenceIndication_3_0=rulePreferenceIndicationKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStrategyRule());
            					}
            					set(
            						current,
            						"preferenceIndication",
            						lv_preferenceIndication_3_0,
            						"xtext.Decisionmaking.PreferenceIndicationKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDecisionmaking.g:445:3: ( (lv_rules_5_0= ruleRule ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDecisionmaking.g:446:4: (lv_rules_5_0= ruleRule )
            	    {
            	    // InternalDecisionmaking.g:446:4: (lv_rules_5_0= ruleRule )
            	    // InternalDecisionmaking.g:447:5: lv_rules_5_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getStrategyAccess().getRulesRuleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_rules_5_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStrategyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_5_0,
            	    						"xtext.Decisionmaking.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDecisionmaking.g:464:3: (otherlv_6= 'then' ( (lv_rules_7_0= ruleRule ) )* )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDecisionmaking.g:465:4: otherlv_6= 'then' ( (lv_rules_7_0= ruleRule ) )*
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStrategyAccess().getThenKeyword_6_0());
            	    			
            	    // InternalDecisionmaking.g:469:4: ( (lv_rules_7_0= ruleRule ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==18||LA8_0==20) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalDecisionmaking.g:470:5: (lv_rules_7_0= ruleRule )
            	    	    {
            	    	    // InternalDecisionmaking.g:470:5: (lv_rules_7_0= ruleRule )
            	    	    // InternalDecisionmaking.g:471:6: lv_rules_7_0= ruleRule
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getStrategyAccess().getRulesRuleParserRuleCall_6_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_rules_7_0=ruleRule();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getStrategyRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"rules",
            	    	    							lv_rules_7_0,
            	    	    							"xtext.Decisionmaking.Rule");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleStrategyPredefined"
    // InternalDecisionmaking.g:497:1: entryRuleStrategyPredefined returns [EObject current=null] : iv_ruleStrategyPredefined= ruleStrategyPredefined EOF ;
    public final EObject entryRuleStrategyPredefined() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyPredefined = null;


        try {
            // InternalDecisionmaking.g:497:59: (iv_ruleStrategyPredefined= ruleStrategyPredefined EOF )
            // InternalDecisionmaking.g:498:2: iv_ruleStrategyPredefined= ruleStrategyPredefined EOF
            {
             newCompositeNode(grammarAccess.getStrategyPredefinedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategyPredefined=ruleStrategyPredefined();

            state._fsp--;

             current =iv_ruleStrategyPredefined; 
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
    // $ANTLR end "entryRuleStrategyPredefined"


    // $ANTLR start "ruleStrategyPredefined"
    // InternalDecisionmaking.g:504:1: ruleStrategyPredefined returns [EObject current=null] : (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= rulePredefinedRule ) )* (otherlv_4= 'then' ( (lv_rules_5_0= rulePredefinedRule ) )* )* otherlv_6= '}' ) ;
    public final EObject ruleStrategyPredefined() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_rules_3_0 = null;

        EObject lv_rules_5_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:510:2: ( (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= rulePredefinedRule ) )* (otherlv_4= 'then' ( (lv_rules_5_0= rulePredefinedRule ) )* )* otherlv_6= '}' ) )
            // InternalDecisionmaking.g:511:2: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= rulePredefinedRule ) )* (otherlv_4= 'then' ( (lv_rules_5_0= rulePredefinedRule ) )* )* otherlv_6= '}' )
            {
            // InternalDecisionmaking.g:511:2: (otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= rulePredefinedRule ) )* (otherlv_4= 'then' ( (lv_rules_5_0= rulePredefinedRule ) )* )* otherlv_6= '}' )
            // InternalDecisionmaking.g:512:3: otherlv_0= 'Strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= rulePredefinedRule ) )* (otherlv_4= 'then' ( (lv_rules_5_0= rulePredefinedRule ) )* )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStrategyPredefinedAccess().getStrategyKeyword_0());
            		
            // InternalDecisionmaking.g:516:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionmaking.g:517:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionmaking.g:517:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionmaking.g:518:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStrategyPredefinedAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStrategyPredefinedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStrategyPredefinedAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDecisionmaking.g:538:3: ( (lv_rules_3_0= rulePredefinedRule ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18||LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDecisionmaking.g:539:4: (lv_rules_3_0= rulePredefinedRule )
            	    {
            	    // InternalDecisionmaking.g:539:4: (lv_rules_3_0= rulePredefinedRule )
            	    // InternalDecisionmaking.g:540:5: lv_rules_3_0= rulePredefinedRule
            	    {

            	    					newCompositeNode(grammarAccess.getStrategyPredefinedAccess().getRulesPredefinedRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_rules_3_0=rulePredefinedRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStrategyPredefinedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"xtext.Decisionmaking.PredefinedRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalDecisionmaking.g:557:3: (otherlv_4= 'then' ( (lv_rules_5_0= rulePredefinedRule ) )* )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDecisionmaking.g:558:4: otherlv_4= 'then' ( (lv_rules_5_0= rulePredefinedRule ) )*
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStrategyPredefinedAccess().getThenKeyword_4_0());
            	    			
            	    // InternalDecisionmaking.g:562:4: ( (lv_rules_5_0= rulePredefinedRule ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==18||LA11_0==20) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalDecisionmaking.g:563:5: (lv_rules_5_0= rulePredefinedRule )
            	    	    {
            	    	    // InternalDecisionmaking.g:563:5: (lv_rules_5_0= rulePredefinedRule )
            	    	    // InternalDecisionmaking.g:564:6: lv_rules_5_0= rulePredefinedRule
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getStrategyPredefinedAccess().getRulesPredefinedRuleParserRuleCall_4_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_rules_5_0=rulePredefinedRule();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getStrategyPredefinedRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"rules",
            	    	    							lv_rules_5_0,
            	    	    							"xtext.Decisionmaking.PredefinedRule");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStrategyPredefinedAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStrategyPredefined"


    // $ANTLR start "entryRuleRule"
    // InternalDecisionmaking.g:590:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalDecisionmaking.g:590:45: (iv_ruleRule= ruleRule EOF )
            // InternalDecisionmaking.g:591:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalDecisionmaking.g:597:1: ruleRule returns [EObject current=null] : (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_StrategyDecisionRule_1= ruleStrategyDecisionRule ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_StrategyAlgorithm_0 = null;

        EObject this_StrategyDecisionRule_1 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:603:2: ( (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_StrategyDecisionRule_1= ruleStrategyDecisionRule ) )
            // InternalDecisionmaking.g:604:2: (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_StrategyDecisionRule_1= ruleStrategyDecisionRule )
            {
            // InternalDecisionmaking.g:604:2: (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_StrategyDecisionRule_1= ruleStrategyDecisionRule )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==18) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDecisionmaking.g:605:3: this_StrategyAlgorithm_0= ruleStrategyAlgorithm
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getStrategyAlgorithmParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrategyAlgorithm_0=ruleStrategyAlgorithm();

                    state._fsp--;


                    			current = this_StrategyAlgorithm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDecisionmaking.g:614:3: this_StrategyDecisionRule_1= ruleStrategyDecisionRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getStrategyDecisionRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrategyDecisionRule_1=ruleStrategyDecisionRule();

                    state._fsp--;


                    			current = this_StrategyDecisionRule_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredefinedRule"
    // InternalDecisionmaking.g:626:1: entryRulePredefinedRule returns [EObject current=null] : iv_rulePredefinedRule= rulePredefinedRule EOF ;
    public final EObject entryRulePredefinedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedRule = null;


        try {
            // InternalDecisionmaking.g:626:55: (iv_rulePredefinedRule= rulePredefinedRule EOF )
            // InternalDecisionmaking.g:627:2: iv_rulePredefinedRule= rulePredefinedRule EOF
            {
             newCompositeNode(grammarAccess.getPredefinedRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredefinedRule=rulePredefinedRule();

            state._fsp--;

             current =iv_rulePredefinedRule; 
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
    // $ANTLR end "entryRulePredefinedRule"


    // $ANTLR start "rulePredefinedRule"
    // InternalDecisionmaking.g:633:1: rulePredefinedRule returns [EObject current=null] : (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_PredefinedDecisionRule_1= rulePredefinedDecisionRule ) ;
    public final EObject rulePredefinedRule() throws RecognitionException {
        EObject current = null;

        EObject this_StrategyAlgorithm_0 = null;

        EObject this_PredefinedDecisionRule_1 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:639:2: ( (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_PredefinedDecisionRule_1= rulePredefinedDecisionRule ) )
            // InternalDecisionmaking.g:640:2: (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_PredefinedDecisionRule_1= rulePredefinedDecisionRule )
            {
            // InternalDecisionmaking.g:640:2: (this_StrategyAlgorithm_0= ruleStrategyAlgorithm | this_PredefinedDecisionRule_1= rulePredefinedDecisionRule )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==18) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDecisionmaking.g:641:3: this_StrategyAlgorithm_0= ruleStrategyAlgorithm
                    {

                    			newCompositeNode(grammarAccess.getPredefinedRuleAccess().getStrategyAlgorithmParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StrategyAlgorithm_0=ruleStrategyAlgorithm();

                    state._fsp--;


                    			current = this_StrategyAlgorithm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDecisionmaking.g:650:3: this_PredefinedDecisionRule_1= rulePredefinedDecisionRule
                    {

                    			newCompositeNode(grammarAccess.getPredefinedRuleAccess().getPredefinedDecisionRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredefinedDecisionRule_1=rulePredefinedDecisionRule();

                    state._fsp--;


                    			current = this_PredefinedDecisionRule_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePredefinedRule"


    // $ANTLR start "entryRuleStrategyDecisionRule"
    // InternalDecisionmaking.g:662:1: entryRuleStrategyDecisionRule returns [EObject current=null] : iv_ruleStrategyDecisionRule= ruleStrategyDecisionRule EOF ;
    public final EObject entryRuleStrategyDecisionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyDecisionRule = null;


        try {
            // InternalDecisionmaking.g:662:61: (iv_ruleStrategyDecisionRule= ruleStrategyDecisionRule EOF )
            // InternalDecisionmaking.g:663:2: iv_ruleStrategyDecisionRule= ruleStrategyDecisionRule EOF
            {
             newCompositeNode(grammarAccess.getStrategyDecisionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategyDecisionRule=ruleStrategyDecisionRule();

            state._fsp--;

             current =iv_ruleStrategyDecisionRule; 
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
    // $ANTLR end "entryRuleStrategyDecisionRule"


    // $ANTLR start "ruleStrategyDecisionRule"
    // InternalDecisionmaking.g:669:1: ruleStrategyDecisionRule returns [EObject current=null] : (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) )+ ) ;
    public final EObject ruleStrategyDecisionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:675:2: ( (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) )+ ) )
            // InternalDecisionmaking.g:676:2: (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) )+ )
            {
            // InternalDecisionmaking.g:676:2: (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) )+ )
            // InternalDecisionmaking.g:677:3: otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) otherlv_2= 'for' ( ( ruleQualifiedName ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStrategyDecisionRuleAccess().getDecisionruleKeyword_0());
            		
            // InternalDecisionmaking.g:681:3: ( ( ruleQualifiedName ) )
            // InternalDecisionmaking.g:682:4: ( ruleQualifiedName )
            {
            // InternalDecisionmaking.g:682:4: ( ruleQualifiedName )
            // InternalDecisionmaking.g:683:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStrategyDecisionRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStrategyDecisionRuleAccess().getDecisionruleDecisionRuleCrossReference_1_0());
            				
            pushFollow(FOLLOW_12);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStrategyDecisionRuleAccess().getForKeyword_2());
            		
            // InternalDecisionmaking.g:701:3: ( ( ruleQualifiedName ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDecisionmaking.g:702:4: ( ruleQualifiedName )
            	    {
            	    // InternalDecisionmaking.g:702:4: ( ruleQualifiedName )
            	    // InternalDecisionmaking.g:703:5: ruleQualifiedName
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStrategyDecisionRuleRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getStrategyDecisionRuleAccess().getTeamprofilesProfileCrossReference_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // $ANTLR end "ruleStrategyDecisionRule"


    // $ANTLR start "entryRulePredefinedDecisionRule"
    // InternalDecisionmaking.g:721:1: entryRulePredefinedDecisionRule returns [EObject current=null] : iv_rulePredefinedDecisionRule= rulePredefinedDecisionRule EOF ;
    public final EObject entryRulePredefinedDecisionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefinedDecisionRule = null;


        try {
            // InternalDecisionmaking.g:721:63: (iv_rulePredefinedDecisionRule= rulePredefinedDecisionRule EOF )
            // InternalDecisionmaking.g:722:2: iv_rulePredefinedDecisionRule= rulePredefinedDecisionRule EOF
            {
             newCompositeNode(grammarAccess.getPredefinedDecisionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredefinedDecisionRule=rulePredefinedDecisionRule();

            state._fsp--;

             current =iv_rulePredefinedDecisionRule; 
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
    // $ANTLR end "entryRulePredefinedDecisionRule"


    // $ANTLR start "rulePredefinedDecisionRule"
    // InternalDecisionmaking.g:728:1: rulePredefinedDecisionRule returns [EObject current=null] : (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) ) ;
    public final EObject rulePredefinedDecisionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:734:2: ( (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) ) )
            // InternalDecisionmaking.g:735:2: (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) )
            {
            // InternalDecisionmaking.g:735:2: (otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) ) )
            // InternalDecisionmaking.g:736:3: otherlv_0= 'decisionrule' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPredefinedDecisionRuleAccess().getDecisionruleKeyword_0());
            		
            // InternalDecisionmaking.g:740:3: ( ( ruleQualifiedName ) )
            // InternalDecisionmaking.g:741:4: ( ruleQualifiedName )
            {
            // InternalDecisionmaking.g:741:4: ( ruleQualifiedName )
            // InternalDecisionmaking.g:742:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredefinedDecisionRuleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPredefinedDecisionRuleAccess().getDecisionruleDecisionRuleCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "rulePredefinedDecisionRule"


    // $ANTLR start "entryRuleStrategyAlgorithm"
    // InternalDecisionmaking.g:760:1: entryRuleStrategyAlgorithm returns [EObject current=null] : iv_ruleStrategyAlgorithm= ruleStrategyAlgorithm EOF ;
    public final EObject entryRuleStrategyAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyAlgorithm = null;


        try {
            // InternalDecisionmaking.g:760:58: (iv_ruleStrategyAlgorithm= ruleStrategyAlgorithm EOF )
            // InternalDecisionmaking.g:761:2: iv_ruleStrategyAlgorithm= ruleStrategyAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getStrategyAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategyAlgorithm=ruleStrategyAlgorithm();

            state._fsp--;

             current =iv_ruleStrategyAlgorithm; 
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
    // $ANTLR end "entryRuleStrategyAlgorithm"


    // $ANTLR start "ruleStrategyAlgorithm"
    // InternalDecisionmaking.g:767:1: ruleStrategyAlgorithm returns [EObject current=null] : (otherlv_0= 'algorithm' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleStrategyAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:773:2: ( (otherlv_0= 'algorithm' ( ( ruleQualifiedName ) ) ) )
            // InternalDecisionmaking.g:774:2: (otherlv_0= 'algorithm' ( ( ruleQualifiedName ) ) )
            {
            // InternalDecisionmaking.g:774:2: (otherlv_0= 'algorithm' ( ( ruleQualifiedName ) ) )
            // InternalDecisionmaking.g:775:3: otherlv_0= 'algorithm' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getStrategyAlgorithmAccess().getAlgorithmKeyword_0());
            		
            // InternalDecisionmaking.g:779:3: ( ( ruleQualifiedName ) )
            // InternalDecisionmaking.g:780:4: ( ruleQualifiedName )
            {
            // InternalDecisionmaking.g:780:4: ( ruleQualifiedName )
            // InternalDecisionmaking.g:781:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStrategyAlgorithmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStrategyAlgorithmAccess().getAlgorithmAlgorithmCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleStrategyAlgorithm"


    // $ANTLR start "entryRuleDecisionRule"
    // InternalDecisionmaking.g:799:1: entryRuleDecisionRule returns [EObject current=null] : iv_ruleDecisionRule= ruleDecisionRule EOF ;
    public final EObject entryRuleDecisionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionRule = null;


        try {
            // InternalDecisionmaking.g:799:53: (iv_ruleDecisionRule= ruleDecisionRule EOF )
            // InternalDecisionmaking.g:800:2: iv_ruleDecisionRule= ruleDecisionRule EOF
            {
             newCompositeNode(grammarAccess.getDecisionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionRule=ruleDecisionRule();

            state._fsp--;

             current =iv_ruleDecisionRule; 
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
    // $ANTLR end "entryRuleDecisionRule"


    // $ANTLR start "ruleDecisionRule"
    // InternalDecisionmaking.g:806:1: ruleDecisionRule returns [EObject current=null] : (otherlv_0= 'decisionrule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' ( (lv_description_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleDecisionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Enumerator lv_prefIndAccepted_3_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:812:2: ( (otherlv_0= 'decisionrule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' ( (lv_description_5_0= RULE_STRING ) ) ) )
            // InternalDecisionmaking.g:813:2: (otherlv_0= 'decisionrule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' ( (lv_description_5_0= RULE_STRING ) ) )
            {
            // InternalDecisionmaking.g:813:2: (otherlv_0= 'decisionrule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' ( (lv_description_5_0= RULE_STRING ) ) )
            // InternalDecisionmaking.g:814:3: otherlv_0= 'decisionrule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' ( (lv_description_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDecisionRuleAccess().getDecisionruleKeyword_0());
            		
            // InternalDecisionmaking.g:818:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionmaking.g:819:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionmaking.g:819:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionmaking.g:820:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDecisionRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecisionRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDecisionRuleAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDecisionmaking.g:840:3: ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=34)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDecisionmaking.g:841:4: (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind )
            	    {
            	    // InternalDecisionmaking.g:841:4: (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind )
            	    // InternalDecisionmaking.g:842:5: lv_prefIndAccepted_3_0= rulePreferenceIndicationKind
            	    {

            	    					newCompositeNode(grammarAccess.getDecisionRuleAccess().getPrefIndAcceptedPreferenceIndicationKindEnumRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_prefIndAccepted_3_0=rulePreferenceIndicationKind();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDecisionRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"prefIndAccepted",
            	    						lv_prefIndAccepted_3_0,
            	    						"xtext.Decisionmaking.PreferenceIndicationKind");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDecisionRuleAccess().getRightParenthesisKeyword_4());
            		
            // InternalDecisionmaking.g:863:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalDecisionmaking.g:864:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalDecisionmaking.g:864:4: (lv_description_5_0= RULE_STRING )
            // InternalDecisionmaking.g:865:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_5_0, grammarAccess.getDecisionRuleAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecisionRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
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
    // $ANTLR end "ruleDecisionRule"


    // $ANTLR start "entryRuleAlgorithm"
    // InternalDecisionmaking.g:885:1: entryRuleAlgorithm returns [EObject current=null] : iv_ruleAlgorithm= ruleAlgorithm EOF ;
    public final EObject entryRuleAlgorithm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithm = null;


        try {
            // InternalDecisionmaking.g:885:50: (iv_ruleAlgorithm= ruleAlgorithm EOF )
            // InternalDecisionmaking.g:886:2: iv_ruleAlgorithm= ruleAlgorithm EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithm=ruleAlgorithm();

            state._fsp--;

             current =iv_ruleAlgorithm; 
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
    // $ANTLR end "entryRuleAlgorithm"


    // $ANTLR start "ruleAlgorithm"
    // InternalDecisionmaking.g:892:1: ruleAlgorithm returns [EObject current=null] : (otherlv_0= 'algorithm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' otherlv_5= 'considersTP' ( (lv_considersTP_6_0= ruleBOOLEAN ) ) ( (lv_description_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleAlgorithm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_7_0=null;
        Enumerator lv_prefIndAccepted_3_0 = null;

        Enumerator lv_considersTP_6_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:898:2: ( (otherlv_0= 'algorithm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' otherlv_5= 'considersTP' ( (lv_considersTP_6_0= ruleBOOLEAN ) ) ( (lv_description_7_0= RULE_STRING ) ) ) )
            // InternalDecisionmaking.g:899:2: (otherlv_0= 'algorithm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' otherlv_5= 'considersTP' ( (lv_considersTP_6_0= ruleBOOLEAN ) ) ( (lv_description_7_0= RULE_STRING ) ) )
            {
            // InternalDecisionmaking.g:899:2: (otherlv_0= 'algorithm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' otherlv_5= 'considersTP' ( (lv_considersTP_6_0= ruleBOOLEAN ) ) ( (lv_description_7_0= RULE_STRING ) ) )
            // InternalDecisionmaking.g:900:3: otherlv_0= 'algorithm' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )* otherlv_4= ')' otherlv_5= 'considersTP' ( (lv_considersTP_6_0= ruleBOOLEAN ) ) ( (lv_description_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmAccess().getAlgorithmKeyword_0());
            		
            // InternalDecisionmaking.g:904:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionmaking.g:905:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionmaking.g:905:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionmaking.g:906:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlgorithmAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDecisionmaking.g:926:3: ( (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDecisionmaking.g:927:4: (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind )
            	    {
            	    // InternalDecisionmaking.g:927:4: (lv_prefIndAccepted_3_0= rulePreferenceIndicationKind )
            	    // InternalDecisionmaking.g:928:5: lv_prefIndAccepted_3_0= rulePreferenceIndicationKind
            	    {

            	    					newCompositeNode(grammarAccess.getAlgorithmAccess().getPrefIndAcceptedPreferenceIndicationKindEnumRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_prefIndAccepted_3_0=rulePreferenceIndicationKind();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            	    					}
            	    					add(
            	    						current,
            	    						"prefIndAccepted",
            	    						lv_prefIndAccepted_3_0,
            	    						"xtext.Decisionmaking.PreferenceIndicationKind");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAlgorithmAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getAlgorithmAccess().getConsidersTPKeyword_5());
            		
            // InternalDecisionmaking.g:953:3: ( (lv_considersTP_6_0= ruleBOOLEAN ) )
            // InternalDecisionmaking.g:954:4: (lv_considersTP_6_0= ruleBOOLEAN )
            {
            // InternalDecisionmaking.g:954:4: (lv_considersTP_6_0= ruleBOOLEAN )
            // InternalDecisionmaking.g:955:5: lv_considersTP_6_0= ruleBOOLEAN
            {

            					newCompositeNode(grammarAccess.getAlgorithmAccess().getConsidersTPBOOLEANEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_considersTP_6_0=ruleBOOLEAN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmRule());
            					}
            					set(
            						current,
            						"considersTP",
            						lv_considersTP_6_0,
            						"xtext.Decisionmaking.BOOLEAN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDecisionmaking.g:972:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalDecisionmaking.g:973:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalDecisionmaking.g:973:4: (lv_description_7_0= RULE_STRING )
            // InternalDecisionmaking.g:974:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_7_0, grammarAccess.getAlgorithmAccess().getDescriptionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
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
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "entryRuleDesignTime"
    // InternalDecisionmaking.g:994:1: entryRuleDesignTime returns [EObject current=null] : iv_ruleDesignTime= ruleDesignTime EOF ;
    public final EObject entryRuleDesignTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesignTime = null;


        try {
            // InternalDecisionmaking.g:994:51: (iv_ruleDesignTime= ruleDesignTime EOF )
            // InternalDecisionmaking.g:995:2: iv_ruleDesignTime= ruleDesignTime EOF
            {
             newCompositeNode(grammarAccess.getDesignTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesignTime=ruleDesignTime();

            state._fsp--;

             current =iv_ruleDesignTime; 
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
    // $ANTLR end "entryRuleDesignTime"


    // $ANTLR start "ruleDesignTime"
    // InternalDecisionmaking.g:1001:1: ruleDesignTime returns [EObject current=null] : (otherlv_0= 'DesignTime' otherlv_1= '{' ( (lv_decisionsupport_2_0= ruleDecisionSupport ) ) otherlv_3= '}' ) ;
    public final EObject ruleDesignTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decisionsupport_2_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:1007:2: ( (otherlv_0= 'DesignTime' otherlv_1= '{' ( (lv_decisionsupport_2_0= ruleDecisionSupport ) ) otherlv_3= '}' ) )
            // InternalDecisionmaking.g:1008:2: (otherlv_0= 'DesignTime' otherlv_1= '{' ( (lv_decisionsupport_2_0= ruleDecisionSupport ) ) otherlv_3= '}' )
            {
            // InternalDecisionmaking.g:1008:2: (otherlv_0= 'DesignTime' otherlv_1= '{' ( (lv_decisionsupport_2_0= ruleDecisionSupport ) ) otherlv_3= '}' )
            // InternalDecisionmaking.g:1009:3: otherlv_0= 'DesignTime' otherlv_1= '{' ( (lv_decisionsupport_2_0= ruleDecisionSupport ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDesignTimeAccess().getDesignTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getDesignTimeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDecisionmaking.g:1017:3: ( (lv_decisionsupport_2_0= ruleDecisionSupport ) )
            // InternalDecisionmaking.g:1018:4: (lv_decisionsupport_2_0= ruleDecisionSupport )
            {
            // InternalDecisionmaking.g:1018:4: (lv_decisionsupport_2_0= ruleDecisionSupport )
            // InternalDecisionmaking.g:1019:5: lv_decisionsupport_2_0= ruleDecisionSupport
            {

            					newCompositeNode(grammarAccess.getDesignTimeAccess().getDecisionsupportDecisionSupportParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_decisionsupport_2_0=ruleDecisionSupport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesignTimeRule());
            					}
            					set(
            						current,
            						"decisionsupport",
            						lv_decisionsupport_2_0,
            						"xtext.Decisionmaking.DecisionSupport");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDesignTimeAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleDesignTime"


    // $ANTLR start "entryRuleDecisionSupport"
    // InternalDecisionmaking.g:1044:1: entryRuleDecisionSupport returns [EObject current=null] : iv_ruleDecisionSupport= ruleDecisionSupport EOF ;
    public final EObject entryRuleDecisionSupport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecisionSupport = null;


        try {
            // InternalDecisionmaking.g:1044:56: (iv_ruleDecisionSupport= ruleDecisionSupport EOF )
            // InternalDecisionmaking.g:1045:2: iv_ruleDecisionSupport= ruleDecisionSupport EOF
            {
             newCompositeNode(grammarAccess.getDecisionSupportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecisionSupport=ruleDecisionSupport();

            state._fsp--;

             current =iv_ruleDecisionSupport; 
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
    // $ANTLR end "entryRuleDecisionSupport"


    // $ANTLR start "ruleDecisionSupport"
    // InternalDecisionmaking.g:1051:1: ruleDecisionSupport returns [EObject current=null] : (otherlv_0= 'DecisionSupport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'decidesFor' ( ( ruleQualifiedName ) )+ otherlv_4= '{' ( (lv_strat_5_0= ruleStrat ) )* otherlv_6= '}' ) ;
    public final EObject ruleDecisionSupport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_strat_5_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:1057:2: ( (otherlv_0= 'DecisionSupport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'decidesFor' ( ( ruleQualifiedName ) )+ otherlv_4= '{' ( (lv_strat_5_0= ruleStrat ) )* otherlv_6= '}' ) )
            // InternalDecisionmaking.g:1058:2: (otherlv_0= 'DecisionSupport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'decidesFor' ( ( ruleQualifiedName ) )+ otherlv_4= '{' ( (lv_strat_5_0= ruleStrat ) )* otherlv_6= '}' )
            {
            // InternalDecisionmaking.g:1058:2: (otherlv_0= 'DecisionSupport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'decidesFor' ( ( ruleQualifiedName ) )+ otherlv_4= '{' ( (lv_strat_5_0= ruleStrat ) )* otherlv_6= '}' )
            // InternalDecisionmaking.g:1059:3: otherlv_0= 'DecisionSupport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'decidesFor' ( ( ruleQualifiedName ) )+ otherlv_4= '{' ( (lv_strat_5_0= ruleStrat ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDecisionSupportAccess().getDecisionSupportKeyword_0());
            		
            // InternalDecisionmaking.g:1063:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDecisionmaking.g:1064:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDecisionmaking.g:1064:4: (lv_name_1_0= RULE_ID )
            // InternalDecisionmaking.g:1065:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDecisionSupportAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDecisionSupportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDecisionSupportAccess().getDecidesForKeyword_2());
            		
            // InternalDecisionmaking.g:1085:3: ( ( ruleQualifiedName ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDecisionmaking.g:1086:4: ( ruleQualifiedName )
            	    {
            	    // InternalDecisionmaking.g:1086:4: ( ruleQualifiedName )
            	    // InternalDecisionmaking.g:1087:5: ruleQualifiedName
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getDecisionSupportRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getDecisionSupportAccess().getMakedecisionforCategoryCrossReference_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getDecisionSupportAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDecisionmaking.g:1105:3: ( (lv_strat_5_0= ruleStrat ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDecisionmaking.g:1106:4: (lv_strat_5_0= ruleStrat )
            	    {
            	    // InternalDecisionmaking.g:1106:4: (lv_strat_5_0= ruleStrat )
            	    // InternalDecisionmaking.g:1107:5: lv_strat_5_0= ruleStrat
            	    {

            	    					newCompositeNode(grammarAccess.getDecisionSupportAccess().getStratStratParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_strat_5_0=ruleStrat();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDecisionSupportRule());
            	    					}
            	    					add(
            	    						current,
            	    						"strat",
            	    						lv_strat_5_0,
            	    						"xtext.Decisionmaking.Strat");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDecisionSupportAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleDecisionSupport"


    // $ANTLR start "entryRuleStrat"
    // InternalDecisionmaking.g:1132:1: entryRuleStrat returns [EObject current=null] : iv_ruleStrat= ruleStrat EOF ;
    public final EObject entryRuleStrat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrat = null;


        try {
            // InternalDecisionmaking.g:1132:46: (iv_ruleStrat= ruleStrat EOF )
            // InternalDecisionmaking.g:1133:2: iv_ruleStrat= ruleStrat EOF
            {
             newCompositeNode(grammarAccess.getStratRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrat=ruleStrat();

            state._fsp--;

             current =iv_ruleStrat; 
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
    // $ANTLR end "entryRuleStrat"


    // $ANTLR start "ruleStrat"
    // InternalDecisionmaking.g:1139:1: ruleStrat returns [EObject current=null] : (this_Strategy_0= ruleStrategy | (otherlv_1= 'Strategy' ( ( ruleQualifiedName ) ) otherlv_3= 'withPreferenceIndication' ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) ) (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )? ) ) ;
    public final EObject ruleStrat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_Strategy_0 = null;

        Enumerator lv_solutionSelectedChosen_4_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:1145:2: ( (this_Strategy_0= ruleStrategy | (otherlv_1= 'Strategy' ( ( ruleQualifiedName ) ) otherlv_3= 'withPreferenceIndication' ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) ) (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )? ) ) )
            // InternalDecisionmaking.g:1146:2: (this_Strategy_0= ruleStrategy | (otherlv_1= 'Strategy' ( ( ruleQualifiedName ) ) otherlv_3= 'withPreferenceIndication' ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) ) (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )? ) )
            {
            // InternalDecisionmaking.g:1146:2: (this_Strategy_0= ruleStrategy | (otherlv_1= 'Strategy' ( ( ruleQualifiedName ) ) otherlv_3= 'withPreferenceIndication' ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) ) (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==14) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            int LA22_5 = input.LA(5);

                            if ( (LA22_5==15) ) {
                                alt22=1;
                            }
                            else if ( (LA22_5==EOF||LA22_5==13||LA22_5==17||LA22_5==19) ) {
                                alt22=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 5, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 33:
                            {
                            int LA22_6 = input.LA(5);

                            if ( (LA22_6==15) ) {
                                alt22=1;
                            }
                            else if ( (LA22_6==EOF||LA22_6==13||LA22_6==17||LA22_6==19) ) {
                                alt22=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 34:
                            {
                            int LA22_7 = input.LA(5);

                            if ( (LA22_7==EOF||LA22_7==13||LA22_7==17||LA22_7==19) ) {
                                alt22=2;
                            }
                            else if ( (LA22_7==15) ) {
                                alt22=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 7, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 3, input);

                            throw nvae;
                        }

                    }
                    else if ( (LA22_2==31) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDecisionmaking.g:1147:3: this_Strategy_0= ruleStrategy
                    {

                    			newCompositeNode(grammarAccess.getStratAccess().getStrategyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Strategy_0=ruleStrategy();

                    state._fsp--;


                    			current = this_Strategy_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDecisionmaking.g:1156:3: (otherlv_1= 'Strategy' ( ( ruleQualifiedName ) ) otherlv_3= 'withPreferenceIndication' ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) ) (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )? )
                    {
                    // InternalDecisionmaking.g:1156:3: (otherlv_1= 'Strategy' ( ( ruleQualifiedName ) ) otherlv_3= 'withPreferenceIndication' ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) ) (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )? )
                    // InternalDecisionmaking.g:1157:4: otherlv_1= 'Strategy' ( ( ruleQualifiedName ) ) otherlv_3= 'withPreferenceIndication' ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) ) (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )?
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getStratAccess().getStrategyKeyword_1_0());
                    			
                    // InternalDecisionmaking.g:1161:4: ( ( ruleQualifiedName ) )
                    // InternalDecisionmaking.g:1162:5: ( ruleQualifiedName )
                    {
                    // InternalDecisionmaking.g:1162:5: ( ruleQualifiedName )
                    // InternalDecisionmaking.g:1163:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStratRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getStratAccess().getStratStrategyPredefinedCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getStratAccess().getWithPreferenceIndicationKeyword_1_2());
                    			
                    // InternalDecisionmaking.g:1181:4: ( (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind ) )
                    // InternalDecisionmaking.g:1182:5: (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind )
                    {
                    // InternalDecisionmaking.g:1182:5: (lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind )
                    // InternalDecisionmaking.g:1183:6: lv_solutionSelectedChosen_4_0= rulePreferenceIndicationKind
                    {

                    						newCompositeNode(grammarAccess.getStratAccess().getSolutionSelectedChosenPreferenceIndicationKindEnumRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_solutionSelectedChosen_4_0=rulePreferenceIndicationKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStratRule());
                    						}
                    						set(
                    							current,
                    							"solutionSelectedChosen",
                    							lv_solutionSelectedChosen_4_0,
                    							"xtext.Decisionmaking.PreferenceIndicationKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDecisionmaking.g:1200:4: (otherlv_5= 'for' ( ( ruleQualifiedName ) )+ )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==19) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalDecisionmaking.g:1201:5: otherlv_5= 'for' ( ( ruleQualifiedName ) )+
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_5); 

                            					newLeafNode(otherlv_5, grammarAccess.getStratAccess().getForKeyword_1_4_0());
                            				
                            // InternalDecisionmaking.g:1205:5: ( ( ruleQualifiedName ) )+
                            int cnt20=0;
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_ID) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // InternalDecisionmaking.g:1206:6: ( ruleQualifiedName )
                            	    {
                            	    // InternalDecisionmaking.g:1206:6: ( ruleQualifiedName )
                            	    // InternalDecisionmaking.g:1207:7: ruleQualifiedName
                            	    {

                            	    							if (current==null) {
                            	    								current = createModelElement(grammarAccess.getStratRule());
                            	    							}
                            	    						

                            	    							newCompositeNode(grammarAccess.getStratAccess().getTeamprofilesProfileCrossReference_1_4_1_0());
                            	    						
                            	    pushFollow(FOLLOW_13);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt20 >= 1 ) break loop20;
                                        EarlyExitException eee =
                                            new EarlyExitException(20, input);
                                        throw eee;
                                }
                                cnt20++;
                            } while (true);


                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleStrat"


    // $ANTLR start "entryRuleRunTime"
    // InternalDecisionmaking.g:1227:1: entryRuleRunTime returns [EObject current=null] : iv_ruleRunTime= ruleRunTime EOF ;
    public final EObject entryRuleRunTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunTime = null;


        try {
            // InternalDecisionmaking.g:1227:48: (iv_ruleRunTime= ruleRunTime EOF )
            // InternalDecisionmaking.g:1228:2: iv_ruleRunTime= ruleRunTime EOF
            {
             newCompositeNode(grammarAccess.getRunTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunTime=ruleRunTime();

            state._fsp--;

             current =iv_ruleRunTime; 
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
    // $ANTLR end "entryRuleRunTime"


    // $ANTLR start "ruleRunTime"
    // InternalDecisionmaking.g:1234:1: ruleRunTime returns [EObject current=null] : (otherlv_0= 'Runtime' otherlv_1= 'using' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_saddresult_6_0= ruleSADDResult ) )+ otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleRunTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_saddresult_6_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:1240:2: ( (otherlv_0= 'Runtime' otherlv_1= 'using' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_saddresult_6_0= ruleSADDResult ) )+ otherlv_7= '}' otherlv_8= '}' ) )
            // InternalDecisionmaking.g:1241:2: (otherlv_0= 'Runtime' otherlv_1= 'using' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_saddresult_6_0= ruleSADDResult ) )+ otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalDecisionmaking.g:1241:2: (otherlv_0= 'Runtime' otherlv_1= 'using' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_saddresult_6_0= ruleSADDResult ) )+ otherlv_7= '}' otherlv_8= '}' )
            // InternalDecisionmaking.g:1242:3: otherlv_0= 'Runtime' otherlv_1= 'using' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_saddresult_6_0= ruleSADDResult ) )+ otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getRunTimeAccess().getRuntimeKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRunTimeAccess().getUsingKeyword_1());
            		
            // InternalDecisionmaking.g:1250:3: ( ( ruleQualifiedName ) )
            // InternalDecisionmaking.g:1251:4: ( ruleQualifiedName )
            {
            // InternalDecisionmaking.g:1251:4: ( ruleQualifiedName )
            // InternalDecisionmaking.g:1252:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunTimeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRunTimeAccess().getDecisionsupportDecisionSupportCrossReference_2_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRunTimeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDecisionmaking.g:1270:3: ( ( ruleQualifiedName ) )
            // InternalDecisionmaking.g:1271:4: ( ruleQualifiedName )
            {
            // InternalDecisionmaking.g:1271:4: ( ruleQualifiedName )
            // InternalDecisionmaking.g:1272:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunTimeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRunTimeAccess().getCategoryCategoryCrossReference_4_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getRunTimeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDecisionmaking.g:1290:3: ( (lv_saddresult_6_0= ruleSADDResult ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDecisionmaking.g:1291:4: (lv_saddresult_6_0= ruleSADDResult )
            	    {
            	    // InternalDecisionmaking.g:1291:4: (lv_saddresult_6_0= ruleSADDResult )
            	    // InternalDecisionmaking.g:1292:5: lv_saddresult_6_0= ruleSADDResult
            	    {

            	    					newCompositeNode(grammarAccess.getRunTimeAccess().getSaddresultSADDResultParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_saddresult_6_0=ruleSADDResult();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunTimeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"saddresult",
            	    						lv_saddresult_6_0,
            	    						"xtext.Decisionmaking.SADDResult");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getRunTimeAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRunTimeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRunTime"


    // $ANTLR start "entryRuleSADDResult"
    // InternalDecisionmaking.g:1321:1: entryRuleSADDResult returns [EObject current=null] : iv_ruleSADDResult= ruleSADDResult EOF ;
    public final EObject entryRuleSADDResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSADDResult = null;


        try {
            // InternalDecisionmaking.g:1321:51: (iv_ruleSADDResult= ruleSADDResult EOF )
            // InternalDecisionmaking.g:1322:2: iv_ruleSADDResult= ruleSADDResult EOF
            {
             newCompositeNode(grammarAccess.getSADDResultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSADDResult=ruleSADDResult();

            state._fsp--;

             current =iv_ruleSADDResult; 
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
    // $ANTLR end "entryRuleSADDResult"


    // $ANTLR start "ruleSADDResult"
    // InternalDecisionmaking.g:1328:1: ruleSADDResult returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_altpreferences_2_0= ruleAlternativePreference ) )+ otherlv_3= '}' ) ;
    public final EObject ruleSADDResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_altpreferences_2_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:1334:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_altpreferences_2_0= ruleAlternativePreference ) )+ otherlv_3= '}' ) )
            // InternalDecisionmaking.g:1335:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_altpreferences_2_0= ruleAlternativePreference ) )+ otherlv_3= '}' )
            {
            // InternalDecisionmaking.g:1335:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_altpreferences_2_0= ruleAlternativePreference ) )+ otherlv_3= '}' )
            // InternalDecisionmaking.g:1336:3: ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_altpreferences_2_0= ruleAlternativePreference ) )+ otherlv_3= '}'
            {
            // InternalDecisionmaking.g:1336:3: ( ( ruleQualifiedName ) )
            // InternalDecisionmaking.g:1337:4: ( ruleQualifiedName )
            {
            // InternalDecisionmaking.g:1337:4: ( ruleQualifiedName )
            // InternalDecisionmaking.g:1338:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSADDResultRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSADDResultAccess().getSaddSecurityADDCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSADDResultAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDecisionmaking.g:1356:3: ( (lv_altpreferences_2_0= ruleAlternativePreference ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDecisionmaking.g:1357:4: (lv_altpreferences_2_0= ruleAlternativePreference )
            	    {
            	    // InternalDecisionmaking.g:1357:4: (lv_altpreferences_2_0= ruleAlternativePreference )
            	    // InternalDecisionmaking.g:1358:5: lv_altpreferences_2_0= ruleAlternativePreference
            	    {

            	    					newCompositeNode(grammarAccess.getSADDResultAccess().getAltpreferencesAlternativePreferenceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_altpreferences_2_0=ruleAlternativePreference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSADDResultRule());
            	    					}
            	    					add(
            	    						current,
            	    						"altpreferences",
            	    						lv_altpreferences_2_0,
            	    						"xtext.Decisionmaking.AlternativePreference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSADDResultAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSADDResult"


    // $ANTLR start "entryRuleAlternativePreference"
    // InternalDecisionmaking.g:1383:1: entryRuleAlternativePreference returns [EObject current=null] : iv_ruleAlternativePreference= ruleAlternativePreference EOF ;
    public final EObject entryRuleAlternativePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativePreference = null;


        try {
            // InternalDecisionmaking.g:1383:62: (iv_ruleAlternativePreference= ruleAlternativePreference EOF )
            // InternalDecisionmaking.g:1384:2: iv_ruleAlternativePreference= ruleAlternativePreference EOF
            {
             newCompositeNode(grammarAccess.getAlternativePreferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternativePreference=ruleAlternativePreference();

            state._fsp--;

             current =iv_ruleAlternativePreference; 
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
    // $ANTLR end "entryRuleAlternativePreference"


    // $ANTLR start "ruleAlternativePreference"
    // InternalDecisionmaking.g:1390:1: ruleAlternativePreference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_preferences_2_0= rulePreference ) )+ otherlv_3= '}' ) ;
    public final EObject ruleAlternativePreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_preferences_2_0 = null;



        	enterRule();

        try {
            // InternalDecisionmaking.g:1396:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_preferences_2_0= rulePreference ) )+ otherlv_3= '}' ) )
            // InternalDecisionmaking.g:1397:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_preferences_2_0= rulePreference ) )+ otherlv_3= '}' )
            {
            // InternalDecisionmaking.g:1397:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_preferences_2_0= rulePreference ) )+ otherlv_3= '}' )
            // InternalDecisionmaking.g:1398:3: ( ( ruleQualifiedName ) ) otherlv_1= '{' ( (lv_preferences_2_0= rulePreference ) )+ otherlv_3= '}'
            {
            // InternalDecisionmaking.g:1398:3: ( ( ruleQualifiedName ) )
            // InternalDecisionmaking.g:1399:4: ( ruleQualifiedName )
            {
            // InternalDecisionmaking.g:1399:4: ( ruleQualifiedName )
            // InternalDecisionmaking.g:1400:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlternativePreferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAlternativePreferenceAccess().getAlternativeAlternativeCrossReference_0_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAlternativePreferenceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDecisionmaking.g:1418:3: ( (lv_preferences_2_0= rulePreference ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDecisionmaking.g:1419:4: (lv_preferences_2_0= rulePreference )
            	    {
            	    // InternalDecisionmaking.g:1419:4: (lv_preferences_2_0= rulePreference )
            	    // InternalDecisionmaking.g:1420:5: lv_preferences_2_0= rulePreference
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativePreferenceAccess().getPreferencesPreferenceParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_preferences_2_0=rulePreference();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativePreferenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"preferences",
            	    						lv_preferences_2_0,
            	    						"xtext.Decisionmaking.Preference");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAlternativePreferenceAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAlternativePreference"


    // $ANTLR start "entryRulePreference"
    // InternalDecisionmaking.g:1445:1: entryRulePreference returns [EObject current=null] : iv_rulePreference= rulePreference EOF ;
    public final EObject entryRulePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreference = null;


        try {
            // InternalDecisionmaking.g:1445:51: (iv_rulePreference= rulePreference EOF )
            // InternalDecisionmaking.g:1446:2: iv_rulePreference= rulePreference EOF
            {
             newCompositeNode(grammarAccess.getPreferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreference=rulePreference();

            state._fsp--;

             current =iv_rulePreference; 
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
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // InternalDecisionmaking.g:1452:1: rulePreference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'selected' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= 'rationale' ( (lv_rationale_4_0= RULE_STRING ) ) ) ;
    public final EObject rulePreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_rationale_4_0=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:1458:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'selected' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= 'rationale' ( (lv_rationale_4_0= RULE_STRING ) ) ) )
            // InternalDecisionmaking.g:1459:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'selected' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= 'rationale' ( (lv_rationale_4_0= RULE_STRING ) ) )
            {
            // InternalDecisionmaking.g:1459:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'selected' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= 'rationale' ( (lv_rationale_4_0= RULE_STRING ) ) )
            // InternalDecisionmaking.g:1460:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'selected' ( (lv_value_2_0= RULE_INT ) ) otherlv_3= 'rationale' ( (lv_rationale_4_0= RULE_STRING ) )
            {
            // InternalDecisionmaking.g:1460:3: ( (otherlv_0= RULE_ID ) )
            // InternalDecisionmaking.g:1461:4: (otherlv_0= RULE_ID )
            {
            // InternalDecisionmaking.g:1461:4: (otherlv_0= RULE_ID )
            // InternalDecisionmaking.g:1462:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getPreferenceAccess().getActorActorCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPreferenceAccess().getSelectedKeyword_1());
            		
            // InternalDecisionmaking.g:1477:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDecisionmaking.g:1478:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDecisionmaking.g:1478:4: (lv_value_2_0= RULE_INT )
            // InternalDecisionmaking.g:1479:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_value_2_0, grammarAccess.getPreferenceAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPreferenceAccess().getRationaleKeyword_3());
            		
            // InternalDecisionmaking.g:1499:3: ( (lv_rationale_4_0= RULE_STRING ) )
            // InternalDecisionmaking.g:1500:4: (lv_rationale_4_0= RULE_STRING )
            {
            // InternalDecisionmaking.g:1500:4: (lv_rationale_4_0= RULE_STRING )
            // InternalDecisionmaking.g:1501:5: lv_rationale_4_0= RULE_STRING
            {
            lv_rationale_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_rationale_4_0, grammarAccess.getPreferenceAccess().getRationaleSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"rationale",
            						lv_rationale_4_0,
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
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDecisionmaking.g:1521:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDecisionmaking.g:1521:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDecisionmaking.g:1522:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDecisionmaking.g:1528:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:1534:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDecisionmaking.g:1535:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDecisionmaking.g:1535:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDecisionmaking.g:1536:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDecisionmaking.g:1543:3: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDecisionmaking.g:1544:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rulePreferenceIndicationKind"
    // InternalDecisionmaking.g:1561:1: rulePreferenceIndicationKind returns [Enumerator current=null] : ( (enumLiteral_0= 'Ranking' ) | (enumLiteral_1= 'Rating' ) | (enumLiteral_2= 'YesNo' ) ) ;
    public final Enumerator rulePreferenceIndicationKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:1567:2: ( ( (enumLiteral_0= 'Ranking' ) | (enumLiteral_1= 'Rating' ) | (enumLiteral_2= 'YesNo' ) ) )
            // InternalDecisionmaking.g:1568:2: ( (enumLiteral_0= 'Ranking' ) | (enumLiteral_1= 'Rating' ) | (enumLiteral_2= 'YesNo' ) )
            {
            // InternalDecisionmaking.g:1568:2: ( (enumLiteral_0= 'Ranking' ) | (enumLiteral_1= 'Rating' ) | (enumLiteral_2= 'YesNo' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt27=1;
                }
                break;
            case 33:
                {
                alt27=2;
                }
                break;
            case 34:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalDecisionmaking.g:1569:3: (enumLiteral_0= 'Ranking' )
                    {
                    // InternalDecisionmaking.g:1569:3: (enumLiteral_0= 'Ranking' )
                    // InternalDecisionmaking.g:1570:4: enumLiteral_0= 'Ranking'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getPreferenceIndicationKindAccess().getRankingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPreferenceIndicationKindAccess().getRankingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDecisionmaking.g:1577:3: (enumLiteral_1= 'Rating' )
                    {
                    // InternalDecisionmaking.g:1577:3: (enumLiteral_1= 'Rating' )
                    // InternalDecisionmaking.g:1578:4: enumLiteral_1= 'Rating'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getPreferenceIndicationKindAccess().getRatingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPreferenceIndicationKindAccess().getRatingEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDecisionmaking.g:1585:3: (enumLiteral_2= 'YesNo' )
                    {
                    // InternalDecisionmaking.g:1585:3: (enumLiteral_2= 'YesNo' )
                    // InternalDecisionmaking.g:1586:4: enumLiteral_2= 'YesNo'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPreferenceIndicationKindAccess().getYesnoEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPreferenceIndicationKindAccess().getYesnoEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "rulePreferenceIndicationKind"


    // $ANTLR start "ruleBOOLEAN"
    // InternalDecisionmaking.g:1596:1: ruleBOOLEAN returns [Enumerator current=null] : ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDecisionmaking.g:1602:2: ( ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) ) )
            // InternalDecisionmaking.g:1603:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) )
            {
            // InternalDecisionmaking.g:1603:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= 'yes' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            else if ( (LA28_0==36) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDecisionmaking.g:1604:3: (enumLiteral_0= 'no' )
                    {
                    // InternalDecisionmaking.g:1604:3: (enumLiteral_0= 'no' )
                    // InternalDecisionmaking.g:1605:4: enumLiteral_0= 'no'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBOOLEANAccess().getNoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDecisionmaking.g:1612:3: (enumLiteral_1= 'yes' )
                    {
                    // InternalDecisionmaking.g:1612:3: (enumLiteral_1= 'yes' )
                    // InternalDecisionmaking.g:1613:4: enumLiteral_1= 'yes'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getBOOLEANAccess().getYesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBOOLEANAccess().getYesEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000009103800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000143002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000103002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000170000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000700400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000002L});

}
