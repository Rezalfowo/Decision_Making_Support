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
import xtext.services.SaddGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSaddParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Category'", "'{'", "'}'", "'Project'", "'hasTP'", "'SecurityADD'", "'alternatives'", "'selectedAlternatives'", "'-'", "'('", "')'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSaddParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSaddParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSaddParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSadd.g"; }



     	private SaddGrammarAccess grammarAccess;

        public InternalSaddParser(TokenStream input, SaddGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SaddGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSadd.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSadd.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSadd.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSadd.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_projcatsadd_1_0= ruleProjCatSADD ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_projcatsadd_1_0 = null;



        	enterRule();

        try {
            // InternalSadd.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_projcatsadd_1_0= ruleProjCatSADD ) ) ) )
            // InternalSadd.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_projcatsadd_1_0= ruleProjCatSADD ) ) )
            {
            // InternalSadd.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_projcatsadd_1_0= ruleProjCatSADD ) ) )
            // InternalSadd.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_projcatsadd_1_0= ruleProjCatSADD ) )
            {
            // InternalSadd.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSadd.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalSadd.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalSadd.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"xtext.Sadd.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSadd.g:98:3: ( (lv_projcatsadd_1_0= ruleProjCatSADD ) )
            // InternalSadd.g:99:4: (lv_projcatsadd_1_0= ruleProjCatSADD )
            {
            // InternalSadd.g:99:4: (lv_projcatsadd_1_0= ruleProjCatSADD )
            // InternalSadd.g:100:5: lv_projcatsadd_1_0= ruleProjCatSADD
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProjcatsaddProjCatSADDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_projcatsadd_1_0=ruleProjCatSADD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"projcatsadd",
            						lv_projcatsadd_1_0,
            						"xtext.Sadd.ProjCatSADD");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalSadd.g:121:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSadd.g:121:47: (iv_ruleImport= ruleImport EOF )
            // InternalSadd.g:122:2: iv_ruleImport= ruleImport EOF
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
    // InternalSadd.g:128:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;


        	enterRule();

        try {
            // InternalSadd.g:134:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // InternalSadd.g:135:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // InternalSadd.g:135:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // InternalSadd.g:136:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSadd.g:140:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalSadd.g:141:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalSadd.g:141:4: (lv_importURI_1_0= RULE_STRING )
            // InternalSadd.g:142:5: lv_importURI_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleProjCatSADD"
    // InternalSadd.g:162:1: entryRuleProjCatSADD returns [EObject current=null] : iv_ruleProjCatSADD= ruleProjCatSADD EOF ;
    public final EObject entryRuleProjCatSADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjCatSADD = null;


        try {
            // InternalSadd.g:162:52: (iv_ruleProjCatSADD= ruleProjCatSADD EOF )
            // InternalSadd.g:163:2: iv_ruleProjCatSADD= ruleProjCatSADD EOF
            {
             newCompositeNode(grammarAccess.getProjCatSADDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjCatSADD=ruleProjCatSADD();

            state._fsp--;

             current =iv_ruleProjCatSADD; 
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
    // $ANTLR end "entryRuleProjCatSADD"


    // $ANTLR start "ruleProjCatSADD"
    // InternalSadd.g:169:1: ruleProjCatSADD returns [EObject current=null] : (this_Project_0= ruleProject | this_Category_1= ruleCategory | this_SecurityADD_2= ruleSecurityADD ) ;
    public final EObject ruleProjCatSADD() throws RecognitionException {
        EObject current = null;

        EObject this_Project_0 = null;

        EObject this_Category_1 = null;

        EObject this_SecurityADD_2 = null;



        	enterRule();

        try {
            // InternalSadd.g:175:2: ( (this_Project_0= ruleProject | this_Category_1= ruleCategory | this_SecurityADD_2= ruleSecurityADD ) )
            // InternalSadd.g:176:2: (this_Project_0= ruleProject | this_Category_1= ruleCategory | this_SecurityADD_2= ruleSecurityADD )
            {
            // InternalSadd.g:176:2: (this_Project_0= ruleProject | this_Category_1= ruleCategory | this_SecurityADD_2= ruleSecurityADD )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // InternalSadd.g:177:3: this_Project_0= ruleProject
                    {

                    			newCompositeNode(grammarAccess.getProjCatSADDAccess().getProjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Project_0=ruleProject();

                    state._fsp--;


                    			current = this_Project_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSadd.g:186:3: this_Category_1= ruleCategory
                    {

                    			newCompositeNode(grammarAccess.getProjCatSADDAccess().getCategoryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Category_1=ruleCategory();

                    state._fsp--;


                    			current = this_Category_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSadd.g:195:3: this_SecurityADD_2= ruleSecurityADD
                    {

                    			newCompositeNode(grammarAccess.getProjCatSADDAccess().getSecurityADDParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SecurityADD_2=ruleSecurityADD();

                    state._fsp--;


                    			current = this_SecurityADD_2;
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
    // $ANTLR end "ruleProjCatSADD"


    // $ANTLR start "entryRuleCategory"
    // InternalSadd.g:207:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalSadd.g:207:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalSadd.g:208:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
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
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalSadd.g:214:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'Category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ruleQualifiedName ) )* otherlv_4= '}' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSadd.g:220:2: ( (otherlv_0= 'Category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ruleQualifiedName ) )* otherlv_4= '}' ) )
            // InternalSadd.g:221:2: (otherlv_0= 'Category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ruleQualifiedName ) )* otherlv_4= '}' )
            {
            // InternalSadd.g:221:2: (otherlv_0= 'Category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ruleQualifiedName ) )* otherlv_4= '}' )
            // InternalSadd.g:222:3: otherlv_0= 'Category' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ruleQualifiedName ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
            		
            // InternalSadd.g:226:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSadd.g:227:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSadd.g:227:4: (lv_name_1_0= RULE_ID )
            // InternalSadd.g:228:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSadd.g:248:3: ( ( ruleQualifiedName ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSadd.g:249:4: ( ruleQualifiedName )
            	    {
            	    // InternalSadd.g:249:4: ( ruleQualifiedName )
            	    // InternalSadd.g:250:5: ruleQualifiedName
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCategoryRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getCategoryAccess().getSecaddSecurityADDCrossReference_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleProject"
    // InternalSadd.g:272:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalSadd.g:272:48: (iv_ruleProject= ruleProject EOF )
            // InternalSadd.g:273:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalSadd.g:279:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hasTP' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_secadd_5_0= ruleSecurityADD ) )* ( (lv_category_6_0= ruleCategory ) )* otherlv_7= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_secadd_5_0 = null;

        EObject lv_category_6_0 = null;



        	enterRule();

        try {
            // InternalSadd.g:285:2: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hasTP' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_secadd_5_0= ruleSecurityADD ) )* ( (lv_category_6_0= ruleCategory ) )* otherlv_7= '}' ) )
            // InternalSadd.g:286:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hasTP' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_secadd_5_0= ruleSecurityADD ) )* ( (lv_category_6_0= ruleCategory ) )* otherlv_7= '}' )
            {
            // InternalSadd.g:286:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hasTP' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_secadd_5_0= ruleSecurityADD ) )* ( (lv_category_6_0= ruleCategory ) )* otherlv_7= '}' )
            // InternalSadd.g:287:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'hasTP' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '{' ( (lv_secadd_5_0= ruleSecurityADD ) )* ( (lv_category_6_0= ruleCategory ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalSadd.g:291:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSadd.g:292:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSadd.g:292:4: (lv_name_1_0= RULE_ID )
            // InternalSadd.g:293:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getHasTPKeyword_2());
            		
            // InternalSadd.g:313:3: ( (otherlv_3= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSadd.g:314:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalSadd.g:314:4: (otherlv_3= RULE_ID )
            	    // InternalSadd.g:315:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getProjectRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    					newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getTeamprofilesProfileCrossReference_3_0());
            	    				

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

            otherlv_4=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSadd.g:330:3: ( (lv_secadd_5_0= ruleSecurityADD ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSadd.g:331:4: (lv_secadd_5_0= ruleSecurityADD )
            	    {
            	    // InternalSadd.g:331:4: (lv_secadd_5_0= ruleSecurityADD )
            	    // InternalSadd.g:332:5: lv_secadd_5_0= ruleSecurityADD
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getSecaddSecurityADDParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_secadd_5_0=ruleSecurityADD();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"secadd",
            	    						lv_secadd_5_0,
            	    						"xtext.Sadd.SecurityADD");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalSadd.g:349:3: ( (lv_category_6_0= ruleCategory ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSadd.g:350:4: (lv_category_6_0= ruleCategory )
            	    {
            	    // InternalSadd.g:350:4: (lv_category_6_0= ruleCategory )
            	    // InternalSadd.g:351:5: lv_category_6_0= ruleCategory
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getCategoryCategoryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_category_6_0=ruleCategory();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"category",
            	    						lv_category_6_0,
            	    						"xtext.Sadd.Category");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSecurityADD"
    // InternalSadd.g:376:1: entryRuleSecurityADD returns [EObject current=null] : iv_ruleSecurityADD= ruleSecurityADD EOF ;
    public final EObject entryRuleSecurityADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityADD = null;


        try {
            // InternalSadd.g:376:52: (iv_ruleSecurityADD= ruleSecurityADD EOF )
            // InternalSadd.g:377:2: iv_ruleSecurityADD= ruleSecurityADD EOF
            {
             newCompositeNode(grammarAccess.getSecurityADDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurityADD=ruleSecurityADD();

            state._fsp--;

             current =iv_ruleSecurityADD; 
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
    // $ANTLR end "entryRuleSecurityADD"


    // $ANTLR start "ruleSecurityADD"
    // InternalSadd.g:383:1: ruleSecurityADD returns [EObject current=null] : (otherlv_0= 'SecurityADD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alts_2_0= ruleAlternatives ) ) ) ;
    public final EObject ruleSecurityADD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_alts_2_0 = null;



        	enterRule();

        try {
            // InternalSadd.g:389:2: ( (otherlv_0= 'SecurityADD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alts_2_0= ruleAlternatives ) ) ) )
            // InternalSadd.g:390:2: (otherlv_0= 'SecurityADD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alts_2_0= ruleAlternatives ) ) )
            {
            // InternalSadd.g:390:2: (otherlv_0= 'SecurityADD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alts_2_0= ruleAlternatives ) ) )
            // InternalSadd.g:391:3: otherlv_0= 'SecurityADD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_alts_2_0= ruleAlternatives ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSecurityADDAccess().getSecurityADDKeyword_0());
            		
            // InternalSadd.g:395:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSadd.g:396:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSadd.g:396:4: (lv_name_1_0= RULE_ID )
            // InternalSadd.g:397:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSecurityADDAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecurityADDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSadd.g:413:3: ( (lv_alts_2_0= ruleAlternatives ) )
            // InternalSadd.g:414:4: (lv_alts_2_0= ruleAlternatives )
            {
            // InternalSadd.g:414:4: (lv_alts_2_0= ruleAlternatives )
            // InternalSadd.g:415:5: lv_alts_2_0= ruleAlternatives
            {

            					newCompositeNode(grammarAccess.getSecurityADDAccess().getAltsAlternativesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_alts_2_0=ruleAlternatives();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecurityADDRule());
            					}
            					set(
            						current,
            						"alts",
            						lv_alts_2_0,
            						"xtext.Sadd.Alternatives");
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
    // $ANTLR end "ruleSecurityADD"


    // $ANTLR start "entryRuleAlternatives"
    // InternalSadd.g:436:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // InternalSadd.g:436:53: (iv_ruleAlternatives= ruleAlternatives EOF )
            // InternalSadd.g:437:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalSadd.g:443:1: ruleAlternatives returns [EObject current=null] : ( (otherlv_0= 'alternatives' otherlv_1= '{' ( (lv_alternatives_2_0= ruleAlternative ) )+ otherlv_3= '}' ) | (otherlv_4= 'selectedAlternatives' otherlv_5= '{' (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+ otherlv_8= '}' ) ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_alternatives_2_0 = null;



        	enterRule();

        try {
            // InternalSadd.g:449:2: ( ( (otherlv_0= 'alternatives' otherlv_1= '{' ( (lv_alternatives_2_0= ruleAlternative ) )+ otherlv_3= '}' ) | (otherlv_4= 'selectedAlternatives' otherlv_5= '{' (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+ otherlv_8= '}' ) ) )
            // InternalSadd.g:450:2: ( (otherlv_0= 'alternatives' otherlv_1= '{' ( (lv_alternatives_2_0= ruleAlternative ) )+ otherlv_3= '}' ) | (otherlv_4= 'selectedAlternatives' otherlv_5= '{' (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+ otherlv_8= '}' ) )
            {
            // InternalSadd.g:450:2: ( (otherlv_0= 'alternatives' otherlv_1= '{' ( (lv_alternatives_2_0= ruleAlternative ) )+ otherlv_3= '}' ) | (otherlv_4= 'selectedAlternatives' otherlv_5= '{' (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+ otherlv_8= '}' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSadd.g:451:3: (otherlv_0= 'alternatives' otherlv_1= '{' ( (lv_alternatives_2_0= ruleAlternative ) )+ otherlv_3= '}' )
                    {
                    // InternalSadd.g:451:3: (otherlv_0= 'alternatives' otherlv_1= '{' ( (lv_alternatives_2_0= ruleAlternative ) )+ otherlv_3= '}' )
                    // InternalSadd.g:452:4: otherlv_0= 'alternatives' otherlv_1= '{' ( (lv_alternatives_2_0= ruleAlternative ) )+ otherlv_3= '}'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalSadd.g:460:4: ( (lv_alternatives_2_0= ruleAlternative ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSadd.g:461:5: (lv_alternatives_2_0= ruleAlternative )
                    	    {
                    	    // InternalSadd.g:461:5: (lv_alternatives_2_0= ruleAlternative )
                    	    // InternalSadd.g:462:6: lv_alternatives_2_0= ruleAlternative
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlternativesAccess().getAlternativesAlternativeParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_alternatives_2_0=ruleAlternative();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlternativesRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"alternatives",
                    	    							lv_alternatives_2_0,
                    	    							"xtext.Sadd.Alternative");
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

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSadd.g:485:3: (otherlv_4= 'selectedAlternatives' otherlv_5= '{' (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+ otherlv_8= '}' )
                    {
                    // InternalSadd.g:485:3: (otherlv_4= 'selectedAlternatives' otherlv_5= '{' (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+ otherlv_8= '}' )
                    // InternalSadd.g:486:4: otherlv_4= 'selectedAlternatives' otherlv_5= '{' (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+ otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlternativesAccess().getSelectedAlternativesKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalSadd.g:494:4: (otherlv_6= '-' ( ( ruleQualifiedName ) ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSadd.g:495:5: otherlv_6= '-' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAlternativesAccess().getHyphenMinusKeyword_1_2_0());
                    	    				
                    	    // InternalSadd.g:499:5: ( ( ruleQualifiedName ) )
                    	    // InternalSadd.g:500:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalSadd.g:500:6: ( ruleQualifiedName )
                    	    // InternalSadd.g:501:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlternativesRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAlternativesAccess().getSelectedalternativesAlternativeCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleAlternative"
    // InternalSadd.g:525:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalSadd.g:525:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalSadd.g:526:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalSadd.g:532:1: ruleAlternative returns [EObject current=null] : (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_solutions_3_0= RULE_STRING ) )+ otherlv_4= ')' ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_solutions_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSadd.g:538:2: ( (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_solutions_3_0= RULE_STRING ) )+ otherlv_4= ')' ) )
            // InternalSadd.g:539:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_solutions_3_0= RULE_STRING ) )+ otherlv_4= ')' )
            {
            // InternalSadd.g:539:2: (otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_solutions_3_0= RULE_STRING ) )+ otherlv_4= ')' )
            // InternalSadd.g:540:3: otherlv_0= '-' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_solutions_3_0= RULE_STRING ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getHyphenMinusKeyword_0());
            		
            // InternalSadd.g:544:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSadd.g:545:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSadd.g:545:4: (lv_name_1_0= RULE_ID )
            // InternalSadd.g:546:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlternativeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlternativeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSadd.g:566:3: ( (lv_solutions_3_0= RULE_STRING ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSadd.g:567:4: (lv_solutions_3_0= RULE_STRING )
            	    {
            	    // InternalSadd.g:567:4: (lv_solutions_3_0= RULE_STRING )
            	    // InternalSadd.g:568:5: lv_solutions_3_0= RULE_STRING
            	    {
            	    lv_solutions_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    					newLeafNode(lv_solutions_3_0, grammarAccess.getAlternativeAccess().getSolutionsSTRINGTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAlternativeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"solutions",
            	    						lv_solutions_3_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSadd.g:592:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSadd.g:592:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSadd.g:593:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalSadd.g:599:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSadd.g:605:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSadd.g:606:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSadd.g:606:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSadd.g:607:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSadd.g:614:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSadd.g:615:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000029800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000002D000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});

}