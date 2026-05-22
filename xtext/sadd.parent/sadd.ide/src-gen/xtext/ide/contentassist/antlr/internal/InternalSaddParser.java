package xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import xtext.services.SaddGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSaddParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Category'", "'{'", "'}'", "'Project'", "'hasTP'", "'SecurityADD'", "'alternatives'", "'selectedAlternatives'", "'-'", "'('", "')'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

    	public void setGrammarAccess(SaddGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSadd.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSadd.g:54:1: ( ruleModel EOF )
            // InternalSadd.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSadd.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSadd.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSadd.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSadd.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSadd.g:69:3: ( rule__Model__Group__0 )
            // InternalSadd.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalSadd.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalSadd.g:79:1: ( ruleImport EOF )
            // InternalSadd.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSadd.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalSadd.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalSadd.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalSadd.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalSadd.g:94:3: ( rule__Import__Group__0 )
            // InternalSadd.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleProjCatSADD"
    // InternalSadd.g:103:1: entryRuleProjCatSADD : ruleProjCatSADD EOF ;
    public final void entryRuleProjCatSADD() throws RecognitionException {
        try {
            // InternalSadd.g:104:1: ( ruleProjCatSADD EOF )
            // InternalSadd.g:105:1: ruleProjCatSADD EOF
            {
             before(grammarAccess.getProjCatSADDRule()); 
            pushFollow(FOLLOW_1);
            ruleProjCatSADD();

            state._fsp--;

             after(grammarAccess.getProjCatSADDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProjCatSADD"


    // $ANTLR start "ruleProjCatSADD"
    // InternalSadd.g:112:1: ruleProjCatSADD : ( ( rule__ProjCatSADD__Alternatives ) ) ;
    public final void ruleProjCatSADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:116:2: ( ( ( rule__ProjCatSADD__Alternatives ) ) )
            // InternalSadd.g:117:2: ( ( rule__ProjCatSADD__Alternatives ) )
            {
            // InternalSadd.g:117:2: ( ( rule__ProjCatSADD__Alternatives ) )
            // InternalSadd.g:118:3: ( rule__ProjCatSADD__Alternatives )
            {
             before(grammarAccess.getProjCatSADDAccess().getAlternatives()); 
            // InternalSadd.g:119:3: ( rule__ProjCatSADD__Alternatives )
            // InternalSadd.g:119:4: rule__ProjCatSADD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProjCatSADD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProjCatSADDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjCatSADD"


    // $ANTLR start "entryRuleCategory"
    // InternalSadd.g:128:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalSadd.g:129:1: ( ruleCategory EOF )
            // InternalSadd.g:130:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalSadd.g:137:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:141:2: ( ( ( rule__Category__Group__0 ) ) )
            // InternalSadd.g:142:2: ( ( rule__Category__Group__0 ) )
            {
            // InternalSadd.g:142:2: ( ( rule__Category__Group__0 ) )
            // InternalSadd.g:143:3: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // InternalSadd.g:144:3: ( rule__Category__Group__0 )
            // InternalSadd.g:144:4: rule__Category__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleProject"
    // InternalSadd.g:153:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalSadd.g:154:1: ( ruleProject EOF )
            // InternalSadd.g:155:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalSadd.g:162:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:166:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalSadd.g:167:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalSadd.g:167:2: ( ( rule__Project__Group__0 ) )
            // InternalSadd.g:168:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalSadd.g:169:3: ( rule__Project__Group__0 )
            // InternalSadd.g:169:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSecurityADD"
    // InternalSadd.g:178:1: entryRuleSecurityADD : ruleSecurityADD EOF ;
    public final void entryRuleSecurityADD() throws RecognitionException {
        try {
            // InternalSadd.g:179:1: ( ruleSecurityADD EOF )
            // InternalSadd.g:180:1: ruleSecurityADD EOF
            {
             before(grammarAccess.getSecurityADDRule()); 
            pushFollow(FOLLOW_1);
            ruleSecurityADD();

            state._fsp--;

             after(grammarAccess.getSecurityADDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityADD"


    // $ANTLR start "ruleSecurityADD"
    // InternalSadd.g:187:1: ruleSecurityADD : ( ( rule__SecurityADD__Group__0 ) ) ;
    public final void ruleSecurityADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:191:2: ( ( ( rule__SecurityADD__Group__0 ) ) )
            // InternalSadd.g:192:2: ( ( rule__SecurityADD__Group__0 ) )
            {
            // InternalSadd.g:192:2: ( ( rule__SecurityADD__Group__0 ) )
            // InternalSadd.g:193:3: ( rule__SecurityADD__Group__0 )
            {
             before(grammarAccess.getSecurityADDAccess().getGroup()); 
            // InternalSadd.g:194:3: ( rule__SecurityADD__Group__0 )
            // InternalSadd.g:194:4: rule__SecurityADD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecurityADD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityADDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityADD"


    // $ANTLR start "entryRuleAlternatives"
    // InternalSadd.g:203:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // InternalSadd.g:204:1: ( ruleAlternatives EOF )
            // InternalSadd.g:205:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // InternalSadd.g:212:1: ruleAlternatives : ( ( rule__Alternatives__Alternatives ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:216:2: ( ( ( rule__Alternatives__Alternatives ) ) )
            // InternalSadd.g:217:2: ( ( rule__Alternatives__Alternatives ) )
            {
            // InternalSadd.g:217:2: ( ( rule__Alternatives__Alternatives ) )
            // InternalSadd.g:218:3: ( rule__Alternatives__Alternatives )
            {
             before(grammarAccess.getAlternativesAccess().getAlternatives()); 
            // InternalSadd.g:219:3: ( rule__Alternatives__Alternatives )
            // InternalSadd.g:219:4: rule__Alternatives__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleAlternative"
    // InternalSadd.g:228:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalSadd.g:229:1: ( ruleAlternative EOF )
            // InternalSadd.g:230:1: ruleAlternative EOF
            {
             before(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalSadd.g:237:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:241:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalSadd.g:242:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalSadd.g:242:2: ( ( rule__Alternative__Group__0 ) )
            // InternalSadd.g:243:3: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // InternalSadd.g:244:3: ( rule__Alternative__Group__0 )
            // InternalSadd.g:244:4: rule__Alternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSadd.g:253:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalSadd.g:254:1: ( ruleQualifiedName EOF )
            // InternalSadd.g:255:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSadd.g:262:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:266:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalSadd.g:267:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalSadd.g:267:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalSadd.g:268:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalSadd.g:269:3: ( rule__QualifiedName__Group__0 )
            // InternalSadd.g:269:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__ProjCatSADD__Alternatives"
    // InternalSadd.g:277:1: rule__ProjCatSADD__Alternatives : ( ( ruleProject ) | ( ruleCategory ) | ( ruleSecurityADD ) );
    public final void rule__ProjCatSADD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:281:1: ( ( ruleProject ) | ( ruleCategory ) | ( ruleSecurityADD ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSadd.g:282:2: ( ruleProject )
                    {
                    // InternalSadd.g:282:2: ( ruleProject )
                    // InternalSadd.g:283:3: ruleProject
                    {
                     before(grammarAccess.getProjCatSADDAccess().getProjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleProject();

                    state._fsp--;

                     after(grammarAccess.getProjCatSADDAccess().getProjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSadd.g:288:2: ( ruleCategory )
                    {
                    // InternalSadd.g:288:2: ( ruleCategory )
                    // InternalSadd.g:289:3: ruleCategory
                    {
                     before(grammarAccess.getProjCatSADDAccess().getCategoryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCategory();

                    state._fsp--;

                     after(grammarAccess.getProjCatSADDAccess().getCategoryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSadd.g:294:2: ( ruleSecurityADD )
                    {
                    // InternalSadd.g:294:2: ( ruleSecurityADD )
                    // InternalSadd.g:295:3: ruleSecurityADD
                    {
                     before(grammarAccess.getProjCatSADDAccess().getSecurityADDParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSecurityADD();

                    state._fsp--;

                     after(grammarAccess.getProjCatSADDAccess().getSecurityADDParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjCatSADD__Alternatives"


    // $ANTLR start "rule__Alternatives__Alternatives"
    // InternalSadd.g:304:1: rule__Alternatives__Alternatives : ( ( ( rule__Alternatives__Group_0__0 ) ) | ( ( rule__Alternatives__Group_1__0 ) ) );
    public final void rule__Alternatives__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:308:1: ( ( ( rule__Alternatives__Group_0__0 ) ) | ( ( rule__Alternatives__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSadd.g:309:2: ( ( rule__Alternatives__Group_0__0 ) )
                    {
                    // InternalSadd.g:309:2: ( ( rule__Alternatives__Group_0__0 ) )
                    // InternalSadd.g:310:3: ( rule__Alternatives__Group_0__0 )
                    {
                     before(grammarAccess.getAlternativesAccess().getGroup_0()); 
                    // InternalSadd.g:311:3: ( rule__Alternatives__Group_0__0 )
                    // InternalSadd.g:311:4: rule__Alternatives__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alternatives__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlternativesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSadd.g:315:2: ( ( rule__Alternatives__Group_1__0 ) )
                    {
                    // InternalSadd.g:315:2: ( ( rule__Alternatives__Group_1__0 ) )
                    // InternalSadd.g:316:3: ( rule__Alternatives__Group_1__0 )
                    {
                     before(grammarAccess.getAlternativesAccess().getGroup_1()); 
                    // InternalSadd.g:317:3: ( rule__Alternatives__Group_1__0 )
                    // InternalSadd.g:317:4: rule__Alternatives__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alternatives__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlternativesAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSadd.g:325:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:329:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSadd.g:330:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSadd.g:337:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:341:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalSadd.g:342:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalSadd.g:342:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalSadd.g:343:2: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalSadd.g:344:2: ( rule__Model__ImportsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSadd.g:344:3: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSadd.g:352:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:356:1: ( rule__Model__Group__1__Impl )
            // InternalSadd.g:357:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSadd.g:363:1: rule__Model__Group__1__Impl : ( ( rule__Model__ProjcatsaddAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:367:1: ( ( ( rule__Model__ProjcatsaddAssignment_1 ) ) )
            // InternalSadd.g:368:1: ( ( rule__Model__ProjcatsaddAssignment_1 ) )
            {
            // InternalSadd.g:368:1: ( ( rule__Model__ProjcatsaddAssignment_1 ) )
            // InternalSadd.g:369:2: ( rule__Model__ProjcatsaddAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getProjcatsaddAssignment_1()); 
            // InternalSadd.g:370:2: ( rule__Model__ProjcatsaddAssignment_1 )
            // InternalSadd.g:370:3: rule__Model__ProjcatsaddAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ProjcatsaddAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getProjcatsaddAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalSadd.g:379:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:383:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalSadd.g:384:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalSadd.g:391:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:395:1: ( ( 'import' ) )
            // InternalSadd.g:396:1: ( 'import' )
            {
            // InternalSadd.g:396:1: ( 'import' )
            // InternalSadd.g:397:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalSadd.g:406:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:410:1: ( rule__Import__Group__1__Impl )
            // InternalSadd.g:411:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalSadd.g:417:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:421:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalSadd.g:422:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalSadd.g:422:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalSadd.g:423:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalSadd.g:424:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalSadd.g:424:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // InternalSadd.g:433:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:437:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // InternalSadd.g:438:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // InternalSadd.g:445:1: rule__Category__Group__0__Impl : ( 'Category' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:449:1: ( ( 'Category' ) )
            // InternalSadd.g:450:1: ( 'Category' )
            {
            // InternalSadd.g:450:1: ( 'Category' )
            // InternalSadd.g:451:2: 'Category'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // InternalSadd.g:460:1: rule__Category__Group__1 : rule__Category__Group__1__Impl rule__Category__Group__2 ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:464:1: ( rule__Category__Group__1__Impl rule__Category__Group__2 )
            // InternalSadd.g:465:2: rule__Category__Group__1__Impl rule__Category__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Category__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // InternalSadd.g:472:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:476:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // InternalSadd.g:477:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // InternalSadd.g:477:1: ( ( rule__Category__NameAssignment_1 ) )
            // InternalSadd.g:478:2: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // InternalSadd.g:479:2: ( rule__Category__NameAssignment_1 )
            // InternalSadd.g:479:3: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__2"
    // InternalSadd.g:487:1: rule__Category__Group__2 : rule__Category__Group__2__Impl rule__Category__Group__3 ;
    public final void rule__Category__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:491:1: ( rule__Category__Group__2__Impl rule__Category__Group__3 )
            // InternalSadd.g:492:2: rule__Category__Group__2__Impl rule__Category__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__2"


    // $ANTLR start "rule__Category__Group__2__Impl"
    // InternalSadd.g:499:1: rule__Category__Group__2__Impl : ( '{' ) ;
    public final void rule__Category__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:503:1: ( ( '{' ) )
            // InternalSadd.g:504:1: ( '{' )
            {
            // InternalSadd.g:504:1: ( '{' )
            // InternalSadd.g:505:2: '{'
            {
             before(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__2__Impl"


    // $ANTLR start "rule__Category__Group__3"
    // InternalSadd.g:514:1: rule__Category__Group__3 : rule__Category__Group__3__Impl rule__Category__Group__4 ;
    public final void rule__Category__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:518:1: ( rule__Category__Group__3__Impl rule__Category__Group__4 )
            // InternalSadd.g:519:2: rule__Category__Group__3__Impl rule__Category__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Category__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__3"


    // $ANTLR start "rule__Category__Group__3__Impl"
    // InternalSadd.g:526:1: rule__Category__Group__3__Impl : ( ( rule__Category__SecaddAssignment_3 )* ) ;
    public final void rule__Category__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:530:1: ( ( ( rule__Category__SecaddAssignment_3 )* ) )
            // InternalSadd.g:531:1: ( ( rule__Category__SecaddAssignment_3 )* )
            {
            // InternalSadd.g:531:1: ( ( rule__Category__SecaddAssignment_3 )* )
            // InternalSadd.g:532:2: ( rule__Category__SecaddAssignment_3 )*
            {
             before(grammarAccess.getCategoryAccess().getSecaddAssignment_3()); 
            // InternalSadd.g:533:2: ( rule__Category__SecaddAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSadd.g:533:3: rule__Category__SecaddAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Category__SecaddAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCategoryAccess().getSecaddAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__3__Impl"


    // $ANTLR start "rule__Category__Group__4"
    // InternalSadd.g:541:1: rule__Category__Group__4 : rule__Category__Group__4__Impl ;
    public final void rule__Category__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:545:1: ( rule__Category__Group__4__Impl )
            // InternalSadd.g:546:2: rule__Category__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__4"


    // $ANTLR start "rule__Category__Group__4__Impl"
    // InternalSadd.g:552:1: rule__Category__Group__4__Impl : ( '}' ) ;
    public final void rule__Category__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:556:1: ( ( '}' ) )
            // InternalSadd.g:557:1: ( '}' )
            {
            // InternalSadd.g:557:1: ( '}' )
            // InternalSadd.g:558:2: '}'
            {
             before(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalSadd.g:568:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:572:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalSadd.g:573:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalSadd.g:580:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:584:1: ( ( 'Project' ) )
            // InternalSadd.g:585:1: ( 'Project' )
            {
            // InternalSadd.g:585:1: ( 'Project' )
            // InternalSadd.g:586:2: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalSadd.g:595:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:599:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalSadd.g:600:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalSadd.g:607:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:611:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalSadd.g:612:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalSadd.g:612:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalSadd.g:613:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalSadd.g:614:2: ( rule__Project__NameAssignment_1 )
            // InternalSadd.g:614:3: rule__Project__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalSadd.g:622:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:626:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalSadd.g:627:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalSadd.g:634:1: rule__Project__Group__2__Impl : ( 'hasTP' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:638:1: ( ( 'hasTP' ) )
            // InternalSadd.g:639:1: ( 'hasTP' )
            {
            // InternalSadd.g:639:1: ( 'hasTP' )
            // InternalSadd.g:640:2: 'hasTP'
            {
             before(grammarAccess.getProjectAccess().getHasTPKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getHasTPKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalSadd.g:649:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:653:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalSadd.g:654:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalSadd.g:661:1: rule__Project__Group__3__Impl : ( ( ( rule__Project__TeamprofilesAssignment_3 ) ) ( ( rule__Project__TeamprofilesAssignment_3 )* ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:665:1: ( ( ( ( rule__Project__TeamprofilesAssignment_3 ) ) ( ( rule__Project__TeamprofilesAssignment_3 )* ) ) )
            // InternalSadd.g:666:1: ( ( ( rule__Project__TeamprofilesAssignment_3 ) ) ( ( rule__Project__TeamprofilesAssignment_3 )* ) )
            {
            // InternalSadd.g:666:1: ( ( ( rule__Project__TeamprofilesAssignment_3 ) ) ( ( rule__Project__TeamprofilesAssignment_3 )* ) )
            // InternalSadd.g:667:2: ( ( rule__Project__TeamprofilesAssignment_3 ) ) ( ( rule__Project__TeamprofilesAssignment_3 )* )
            {
            // InternalSadd.g:667:2: ( ( rule__Project__TeamprofilesAssignment_3 ) )
            // InternalSadd.g:668:3: ( rule__Project__TeamprofilesAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getTeamprofilesAssignment_3()); 
            // InternalSadd.g:669:3: ( rule__Project__TeamprofilesAssignment_3 )
            // InternalSadd.g:669:4: rule__Project__TeamprofilesAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Project__TeamprofilesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getTeamprofilesAssignment_3()); 

            }

            // InternalSadd.g:672:2: ( ( rule__Project__TeamprofilesAssignment_3 )* )
            // InternalSadd.g:673:3: ( rule__Project__TeamprofilesAssignment_3 )*
            {
             before(grammarAccess.getProjectAccess().getTeamprofilesAssignment_3()); 
            // InternalSadd.g:674:3: ( rule__Project__TeamprofilesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSadd.g:674:4: rule__Project__TeamprofilesAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Project__TeamprofilesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getTeamprofilesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalSadd.g:683:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:687:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalSadd.g:688:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalSadd.g:695:1: rule__Project__Group__4__Impl : ( '{' ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:699:1: ( ( '{' ) )
            // InternalSadd.g:700:1: ( '{' )
            {
            // InternalSadd.g:700:1: ( '{' )
            // InternalSadd.g:701:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalSadd.g:710:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:714:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalSadd.g:715:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalSadd.g:722:1: rule__Project__Group__5__Impl : ( ( rule__Project__SecaddAssignment_5 )* ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:726:1: ( ( ( rule__Project__SecaddAssignment_5 )* ) )
            // InternalSadd.g:727:1: ( ( rule__Project__SecaddAssignment_5 )* )
            {
            // InternalSadd.g:727:1: ( ( rule__Project__SecaddAssignment_5 )* )
            // InternalSadd.g:728:2: ( rule__Project__SecaddAssignment_5 )*
            {
             before(grammarAccess.getProjectAccess().getSecaddAssignment_5()); 
            // InternalSadd.g:729:2: ( rule__Project__SecaddAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSadd.g:729:3: rule__Project__SecaddAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Project__SecaddAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getSecaddAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalSadd.g:737:1: rule__Project__Group__6 : rule__Project__Group__6__Impl rule__Project__Group__7 ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:741:1: ( rule__Project__Group__6__Impl rule__Project__Group__7 )
            // InternalSadd.g:742:2: rule__Project__Group__6__Impl rule__Project__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Project__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalSadd.g:749:1: rule__Project__Group__6__Impl : ( ( rule__Project__CategoryAssignment_6 )* ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:753:1: ( ( ( rule__Project__CategoryAssignment_6 )* ) )
            // InternalSadd.g:754:1: ( ( rule__Project__CategoryAssignment_6 )* )
            {
            // InternalSadd.g:754:1: ( ( rule__Project__CategoryAssignment_6 )* )
            // InternalSadd.g:755:2: ( rule__Project__CategoryAssignment_6 )*
            {
             before(grammarAccess.getProjectAccess().getCategoryAssignment_6()); 
            // InternalSadd.g:756:2: ( rule__Project__CategoryAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSadd.g:756:3: rule__Project__CategoryAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Project__CategoryAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getCategoryAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Project__Group__7"
    // InternalSadd.g:764:1: rule__Project__Group__7 : rule__Project__Group__7__Impl ;
    public final void rule__Project__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:768:1: ( rule__Project__Group__7__Impl )
            // InternalSadd.g:769:2: rule__Project__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7"


    // $ANTLR start "rule__Project__Group__7__Impl"
    // InternalSadd.g:775:1: rule__Project__Group__7__Impl : ( '}' ) ;
    public final void rule__Project__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:779:1: ( ( '}' ) )
            // InternalSadd.g:780:1: ( '}' )
            {
            // InternalSadd.g:780:1: ( '}' )
            // InternalSadd.g:781:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__7__Impl"


    // $ANTLR start "rule__SecurityADD__Group__0"
    // InternalSadd.g:791:1: rule__SecurityADD__Group__0 : rule__SecurityADD__Group__0__Impl rule__SecurityADD__Group__1 ;
    public final void rule__SecurityADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:795:1: ( rule__SecurityADD__Group__0__Impl rule__SecurityADD__Group__1 )
            // InternalSadd.g:796:2: rule__SecurityADD__Group__0__Impl rule__SecurityADD__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SecurityADD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityADD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__Group__0"


    // $ANTLR start "rule__SecurityADD__Group__0__Impl"
    // InternalSadd.g:803:1: rule__SecurityADD__Group__0__Impl : ( 'SecurityADD' ) ;
    public final void rule__SecurityADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:807:1: ( ( 'SecurityADD' ) )
            // InternalSadd.g:808:1: ( 'SecurityADD' )
            {
            // InternalSadd.g:808:1: ( 'SecurityADD' )
            // InternalSadd.g:809:2: 'SecurityADD'
            {
             before(grammarAccess.getSecurityADDAccess().getSecurityADDKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecurityADDAccess().getSecurityADDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__Group__0__Impl"


    // $ANTLR start "rule__SecurityADD__Group__1"
    // InternalSadd.g:818:1: rule__SecurityADD__Group__1 : rule__SecurityADD__Group__1__Impl rule__SecurityADD__Group__2 ;
    public final void rule__SecurityADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:822:1: ( rule__SecurityADD__Group__1__Impl rule__SecurityADD__Group__2 )
            // InternalSadd.g:823:2: rule__SecurityADD__Group__1__Impl rule__SecurityADD__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SecurityADD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityADD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__Group__1"


    // $ANTLR start "rule__SecurityADD__Group__1__Impl"
    // InternalSadd.g:830:1: rule__SecurityADD__Group__1__Impl : ( ( rule__SecurityADD__NameAssignment_1 ) ) ;
    public final void rule__SecurityADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:834:1: ( ( ( rule__SecurityADD__NameAssignment_1 ) ) )
            // InternalSadd.g:835:1: ( ( rule__SecurityADD__NameAssignment_1 ) )
            {
            // InternalSadd.g:835:1: ( ( rule__SecurityADD__NameAssignment_1 ) )
            // InternalSadd.g:836:2: ( rule__SecurityADD__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityADDAccess().getNameAssignment_1()); 
            // InternalSadd.g:837:2: ( rule__SecurityADD__NameAssignment_1 )
            // InternalSadd.g:837:3: rule__SecurityADD__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecurityADD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecurityADDAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__Group__1__Impl"


    // $ANTLR start "rule__SecurityADD__Group__2"
    // InternalSadd.g:845:1: rule__SecurityADD__Group__2 : rule__SecurityADD__Group__2__Impl ;
    public final void rule__SecurityADD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:849:1: ( rule__SecurityADD__Group__2__Impl )
            // InternalSadd.g:850:2: rule__SecurityADD__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityADD__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__Group__2"


    // $ANTLR start "rule__SecurityADD__Group__2__Impl"
    // InternalSadd.g:856:1: rule__SecurityADD__Group__2__Impl : ( ( rule__SecurityADD__AltsAssignment_2 ) ) ;
    public final void rule__SecurityADD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:860:1: ( ( ( rule__SecurityADD__AltsAssignment_2 ) ) )
            // InternalSadd.g:861:1: ( ( rule__SecurityADD__AltsAssignment_2 ) )
            {
            // InternalSadd.g:861:1: ( ( rule__SecurityADD__AltsAssignment_2 ) )
            // InternalSadd.g:862:2: ( rule__SecurityADD__AltsAssignment_2 )
            {
             before(grammarAccess.getSecurityADDAccess().getAltsAssignment_2()); 
            // InternalSadd.g:863:2: ( rule__SecurityADD__AltsAssignment_2 )
            // InternalSadd.g:863:3: rule__SecurityADD__AltsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SecurityADD__AltsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSecurityADDAccess().getAltsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__Group__2__Impl"


    // $ANTLR start "rule__Alternatives__Group_0__0"
    // InternalSadd.g:872:1: rule__Alternatives__Group_0__0 : rule__Alternatives__Group_0__0__Impl rule__Alternatives__Group_0__1 ;
    public final void rule__Alternatives__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:876:1: ( rule__Alternatives__Group_0__0__Impl rule__Alternatives__Group_0__1 )
            // InternalSadd.g:877:2: rule__Alternatives__Group_0__0__Impl rule__Alternatives__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Alternatives__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__0"


    // $ANTLR start "rule__Alternatives__Group_0__0__Impl"
    // InternalSadd.g:884:1: rule__Alternatives__Group_0__0__Impl : ( 'alternatives' ) ;
    public final void rule__Alternatives__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:888:1: ( ( 'alternatives' ) )
            // InternalSadd.g:889:1: ( 'alternatives' )
            {
            // InternalSadd.g:889:1: ( 'alternatives' )
            // InternalSadd.g:890:2: 'alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__0__Impl"


    // $ANTLR start "rule__Alternatives__Group_0__1"
    // InternalSadd.g:899:1: rule__Alternatives__Group_0__1 : rule__Alternatives__Group_0__1__Impl rule__Alternatives__Group_0__2 ;
    public final void rule__Alternatives__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:903:1: ( rule__Alternatives__Group_0__1__Impl rule__Alternatives__Group_0__2 )
            // InternalSadd.g:904:2: rule__Alternatives__Group_0__1__Impl rule__Alternatives__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Alternatives__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__1"


    // $ANTLR start "rule__Alternatives__Group_0__1__Impl"
    // InternalSadd.g:911:1: rule__Alternatives__Group_0__1__Impl : ( '{' ) ;
    public final void rule__Alternatives__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:915:1: ( ( '{' ) )
            // InternalSadd.g:916:1: ( '{' )
            {
            // InternalSadd.g:916:1: ( '{' )
            // InternalSadd.g:917:2: '{'
            {
             before(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__1__Impl"


    // $ANTLR start "rule__Alternatives__Group_0__2"
    // InternalSadd.g:926:1: rule__Alternatives__Group_0__2 : rule__Alternatives__Group_0__2__Impl rule__Alternatives__Group_0__3 ;
    public final void rule__Alternatives__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:930:1: ( rule__Alternatives__Group_0__2__Impl rule__Alternatives__Group_0__3 )
            // InternalSadd.g:931:2: rule__Alternatives__Group_0__2__Impl rule__Alternatives__Group_0__3
            {
            pushFollow(FOLLOW_16);
            rule__Alternatives__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__2"


    // $ANTLR start "rule__Alternatives__Group_0__2__Impl"
    // InternalSadd.g:938:1: rule__Alternatives__Group_0__2__Impl : ( ( ( rule__Alternatives__AlternativesAssignment_0_2 ) ) ( ( rule__Alternatives__AlternativesAssignment_0_2 )* ) ) ;
    public final void rule__Alternatives__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:942:1: ( ( ( ( rule__Alternatives__AlternativesAssignment_0_2 ) ) ( ( rule__Alternatives__AlternativesAssignment_0_2 )* ) ) )
            // InternalSadd.g:943:1: ( ( ( rule__Alternatives__AlternativesAssignment_0_2 ) ) ( ( rule__Alternatives__AlternativesAssignment_0_2 )* ) )
            {
            // InternalSadd.g:943:1: ( ( ( rule__Alternatives__AlternativesAssignment_0_2 ) ) ( ( rule__Alternatives__AlternativesAssignment_0_2 )* ) )
            // InternalSadd.g:944:2: ( ( rule__Alternatives__AlternativesAssignment_0_2 ) ) ( ( rule__Alternatives__AlternativesAssignment_0_2 )* )
            {
            // InternalSadd.g:944:2: ( ( rule__Alternatives__AlternativesAssignment_0_2 ) )
            // InternalSadd.g:945:3: ( rule__Alternatives__AlternativesAssignment_0_2 )
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesAssignment_0_2()); 
            // InternalSadd.g:946:3: ( rule__Alternatives__AlternativesAssignment_0_2 )
            // InternalSadd.g:946:4: rule__Alternatives__AlternativesAssignment_0_2
            {
            pushFollow(FOLLOW_17);
            rule__Alternatives__AlternativesAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getAlternativesAssignment_0_2()); 

            }

            // InternalSadd.g:949:2: ( ( rule__Alternatives__AlternativesAssignment_0_2 )* )
            // InternalSadd.g:950:3: ( rule__Alternatives__AlternativesAssignment_0_2 )*
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesAssignment_0_2()); 
            // InternalSadd.g:951:3: ( rule__Alternatives__AlternativesAssignment_0_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSadd.g:951:4: rule__Alternatives__AlternativesAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Alternatives__AlternativesAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getAlternativesAssignment_0_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__2__Impl"


    // $ANTLR start "rule__Alternatives__Group_0__3"
    // InternalSadd.g:960:1: rule__Alternatives__Group_0__3 : rule__Alternatives__Group_0__3__Impl ;
    public final void rule__Alternatives__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:964:1: ( rule__Alternatives__Group_0__3__Impl )
            // InternalSadd.g:965:2: rule__Alternatives__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__3"


    // $ANTLR start "rule__Alternatives__Group_0__3__Impl"
    // InternalSadd.g:971:1: rule__Alternatives__Group_0__3__Impl : ( '}' ) ;
    public final void rule__Alternatives__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:975:1: ( ( '}' ) )
            // InternalSadd.g:976:1: ( '}' )
            {
            // InternalSadd.g:976:1: ( '}' )
            // InternalSadd.g:977:2: '}'
            {
             before(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_0__3__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__0"
    // InternalSadd.g:987:1: rule__Alternatives__Group_1__0 : rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1 ;
    public final void rule__Alternatives__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:991:1: ( rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1 )
            // InternalSadd.g:992:2: rule__Alternatives__Group_1__0__Impl rule__Alternatives__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Alternatives__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__0"


    // $ANTLR start "rule__Alternatives__Group_1__0__Impl"
    // InternalSadd.g:999:1: rule__Alternatives__Group_1__0__Impl : ( 'selectedAlternatives' ) ;
    public final void rule__Alternatives__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1003:1: ( ( 'selectedAlternatives' ) )
            // InternalSadd.g:1004:1: ( 'selectedAlternatives' )
            {
            // InternalSadd.g:1004:1: ( 'selectedAlternatives' )
            // InternalSadd.g:1005:2: 'selectedAlternatives'
            {
             before(grammarAccess.getAlternativesAccess().getSelectedAlternativesKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getSelectedAlternativesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__0__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__1"
    // InternalSadd.g:1014:1: rule__Alternatives__Group_1__1 : rule__Alternatives__Group_1__1__Impl rule__Alternatives__Group_1__2 ;
    public final void rule__Alternatives__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1018:1: ( rule__Alternatives__Group_1__1__Impl rule__Alternatives__Group_1__2 )
            // InternalSadd.g:1019:2: rule__Alternatives__Group_1__1__Impl rule__Alternatives__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Alternatives__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__1"


    // $ANTLR start "rule__Alternatives__Group_1__1__Impl"
    // InternalSadd.g:1026:1: rule__Alternatives__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Alternatives__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1030:1: ( ( '{' ) )
            // InternalSadd.g:1031:1: ( '{' )
            {
            // InternalSadd.g:1031:1: ( '{' )
            // InternalSadd.g:1032:2: '{'
            {
             before(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__1__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__2"
    // InternalSadd.g:1041:1: rule__Alternatives__Group_1__2 : rule__Alternatives__Group_1__2__Impl rule__Alternatives__Group_1__3 ;
    public final void rule__Alternatives__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1045:1: ( rule__Alternatives__Group_1__2__Impl rule__Alternatives__Group_1__3 )
            // InternalSadd.g:1046:2: rule__Alternatives__Group_1__2__Impl rule__Alternatives__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Alternatives__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__2"


    // $ANTLR start "rule__Alternatives__Group_1__2__Impl"
    // InternalSadd.g:1053:1: rule__Alternatives__Group_1__2__Impl : ( ( ( rule__Alternatives__Group_1_2__0 ) ) ( ( rule__Alternatives__Group_1_2__0 )* ) ) ;
    public final void rule__Alternatives__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1057:1: ( ( ( ( rule__Alternatives__Group_1_2__0 ) ) ( ( rule__Alternatives__Group_1_2__0 )* ) ) )
            // InternalSadd.g:1058:1: ( ( ( rule__Alternatives__Group_1_2__0 ) ) ( ( rule__Alternatives__Group_1_2__0 )* ) )
            {
            // InternalSadd.g:1058:1: ( ( ( rule__Alternatives__Group_1_2__0 ) ) ( ( rule__Alternatives__Group_1_2__0 )* ) )
            // InternalSadd.g:1059:2: ( ( rule__Alternatives__Group_1_2__0 ) ) ( ( rule__Alternatives__Group_1_2__0 )* )
            {
            // InternalSadd.g:1059:2: ( ( rule__Alternatives__Group_1_2__0 ) )
            // InternalSadd.g:1060:3: ( rule__Alternatives__Group_1_2__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1_2()); 
            // InternalSadd.g:1061:3: ( rule__Alternatives__Group_1_2__0 )
            // InternalSadd.g:1061:4: rule__Alternatives__Group_1_2__0
            {
            pushFollow(FOLLOW_17);
            rule__Alternatives__Group_1_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup_1_2()); 

            }

            // InternalSadd.g:1064:2: ( ( rule__Alternatives__Group_1_2__0 )* )
            // InternalSadd.g:1065:3: ( rule__Alternatives__Group_1_2__0 )*
            {
             before(grammarAccess.getAlternativesAccess().getGroup_1_2()); 
            // InternalSadd.g:1066:3: ( rule__Alternatives__Group_1_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSadd.g:1066:4: rule__Alternatives__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Alternatives__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getGroup_1_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__2__Impl"


    // $ANTLR start "rule__Alternatives__Group_1__3"
    // InternalSadd.g:1075:1: rule__Alternatives__Group_1__3 : rule__Alternatives__Group_1__3__Impl ;
    public final void rule__Alternatives__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1079:1: ( rule__Alternatives__Group_1__3__Impl )
            // InternalSadd.g:1080:2: rule__Alternatives__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__3"


    // $ANTLR start "rule__Alternatives__Group_1__3__Impl"
    // InternalSadd.g:1086:1: rule__Alternatives__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Alternatives__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1090:1: ( ( '}' ) )
            // InternalSadd.g:1091:1: ( '}' )
            {
            // InternalSadd.g:1091:1: ( '}' )
            // InternalSadd.g:1092:2: '}'
            {
             before(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1__3__Impl"


    // $ANTLR start "rule__Alternatives__Group_1_2__0"
    // InternalSadd.g:1102:1: rule__Alternatives__Group_1_2__0 : rule__Alternatives__Group_1_2__0__Impl rule__Alternatives__Group_1_2__1 ;
    public final void rule__Alternatives__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1106:1: ( rule__Alternatives__Group_1_2__0__Impl rule__Alternatives__Group_1_2__1 )
            // InternalSadd.g:1107:2: rule__Alternatives__Group_1_2__0__Impl rule__Alternatives__Group_1_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Alternatives__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_2__0"


    // $ANTLR start "rule__Alternatives__Group_1_2__0__Impl"
    // InternalSadd.g:1114:1: rule__Alternatives__Group_1_2__0__Impl : ( '-' ) ;
    public final void rule__Alternatives__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1118:1: ( ( '-' ) )
            // InternalSadd.g:1119:1: ( '-' )
            {
            // InternalSadd.g:1119:1: ( '-' )
            // InternalSadd.g:1120:2: '-'
            {
             before(grammarAccess.getAlternativesAccess().getHyphenMinusKeyword_1_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAlternativesAccess().getHyphenMinusKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_2__0__Impl"


    // $ANTLR start "rule__Alternatives__Group_1_2__1"
    // InternalSadd.g:1129:1: rule__Alternatives__Group_1_2__1 : rule__Alternatives__Group_1_2__1__Impl ;
    public final void rule__Alternatives__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1133:1: ( rule__Alternatives__Group_1_2__1__Impl )
            // InternalSadd.g:1134:2: rule__Alternatives__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_2__1"


    // $ANTLR start "rule__Alternatives__Group_1_2__1__Impl"
    // InternalSadd.g:1140:1: rule__Alternatives__Group_1_2__1__Impl : ( ( rule__Alternatives__SelectedalternativesAssignment_1_2_1 ) ) ;
    public final void rule__Alternatives__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1144:1: ( ( ( rule__Alternatives__SelectedalternativesAssignment_1_2_1 ) ) )
            // InternalSadd.g:1145:1: ( ( rule__Alternatives__SelectedalternativesAssignment_1_2_1 ) )
            {
            // InternalSadd.g:1145:1: ( ( rule__Alternatives__SelectedalternativesAssignment_1_2_1 ) )
            // InternalSadd.g:1146:2: ( rule__Alternatives__SelectedalternativesAssignment_1_2_1 )
            {
             before(grammarAccess.getAlternativesAccess().getSelectedalternativesAssignment_1_2_1()); 
            // InternalSadd.g:1147:2: ( rule__Alternatives__SelectedalternativesAssignment_1_2_1 )
            // InternalSadd.g:1147:3: rule__Alternatives__SelectedalternativesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternatives__SelectedalternativesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getSelectedalternativesAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group_1_2__1__Impl"


    // $ANTLR start "rule__Alternative__Group__0"
    // InternalSadd.g:1156:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1160:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalSadd.g:1161:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__0"


    // $ANTLR start "rule__Alternative__Group__0__Impl"
    // InternalSadd.g:1168:1: rule__Alternative__Group__0__Impl : ( '-' ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1172:1: ( ( '-' ) )
            // InternalSadd.g:1173:1: ( '-' )
            {
            // InternalSadd.g:1173:1: ( '-' )
            // InternalSadd.g:1174:2: '-'
            {
             before(grammarAccess.getAlternativeAccess().getHyphenMinusKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__0__Impl"


    // $ANTLR start "rule__Alternative__Group__1"
    // InternalSadd.g:1183:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1187:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalSadd.g:1188:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Alternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__1"


    // $ANTLR start "rule__Alternative__Group__1__Impl"
    // InternalSadd.g:1195:1: rule__Alternative__Group__1__Impl : ( ( rule__Alternative__NameAssignment_1 ) ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1199:1: ( ( ( rule__Alternative__NameAssignment_1 ) ) )
            // InternalSadd.g:1200:1: ( ( rule__Alternative__NameAssignment_1 ) )
            {
            // InternalSadd.g:1200:1: ( ( rule__Alternative__NameAssignment_1 ) )
            // InternalSadd.g:1201:2: ( rule__Alternative__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativeAccess().getNameAssignment_1()); 
            // InternalSadd.g:1202:2: ( rule__Alternative__NameAssignment_1 )
            // InternalSadd.g:1202:3: rule__Alternative__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__1__Impl"


    // $ANTLR start "rule__Alternative__Group__2"
    // InternalSadd.g:1210:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1214:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalSadd.g:1215:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Alternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__2"


    // $ANTLR start "rule__Alternative__Group__2__Impl"
    // InternalSadd.g:1222:1: rule__Alternative__Group__2__Impl : ( '(' ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1226:1: ( ( '(' ) )
            // InternalSadd.g:1227:1: ( '(' )
            {
            // InternalSadd.g:1227:1: ( '(' )
            // InternalSadd.g:1228:2: '('
            {
             before(grammarAccess.getAlternativeAccess().getLeftParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__2__Impl"


    // $ANTLR start "rule__Alternative__Group__3"
    // InternalSadd.g:1237:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl rule__Alternative__Group__4 ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1241:1: ( rule__Alternative__Group__3__Impl rule__Alternative__Group__4 )
            // InternalSadd.g:1242:2: rule__Alternative__Group__3__Impl rule__Alternative__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Alternative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__3"


    // $ANTLR start "rule__Alternative__Group__3__Impl"
    // InternalSadd.g:1249:1: rule__Alternative__Group__3__Impl : ( ( ( rule__Alternative__SolutionsAssignment_3 ) ) ( ( rule__Alternative__SolutionsAssignment_3 )* ) ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1253:1: ( ( ( ( rule__Alternative__SolutionsAssignment_3 ) ) ( ( rule__Alternative__SolutionsAssignment_3 )* ) ) )
            // InternalSadd.g:1254:1: ( ( ( rule__Alternative__SolutionsAssignment_3 ) ) ( ( rule__Alternative__SolutionsAssignment_3 )* ) )
            {
            // InternalSadd.g:1254:1: ( ( ( rule__Alternative__SolutionsAssignment_3 ) ) ( ( rule__Alternative__SolutionsAssignment_3 )* ) )
            // InternalSadd.g:1255:2: ( ( rule__Alternative__SolutionsAssignment_3 ) ) ( ( rule__Alternative__SolutionsAssignment_3 )* )
            {
            // InternalSadd.g:1255:2: ( ( rule__Alternative__SolutionsAssignment_3 ) )
            // InternalSadd.g:1256:3: ( rule__Alternative__SolutionsAssignment_3 )
            {
             before(grammarAccess.getAlternativeAccess().getSolutionsAssignment_3()); 
            // InternalSadd.g:1257:3: ( rule__Alternative__SolutionsAssignment_3 )
            // InternalSadd.g:1257:4: rule__Alternative__SolutionsAssignment_3
            {
            pushFollow(FOLLOW_20);
            rule__Alternative__SolutionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getSolutionsAssignment_3()); 

            }

            // InternalSadd.g:1260:2: ( ( rule__Alternative__SolutionsAssignment_3 )* )
            // InternalSadd.g:1261:3: ( rule__Alternative__SolutionsAssignment_3 )*
            {
             before(grammarAccess.getAlternativeAccess().getSolutionsAssignment_3()); 
            // InternalSadd.g:1262:3: ( rule__Alternative__SolutionsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSadd.g:1262:4: rule__Alternative__SolutionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Alternative__SolutionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAlternativeAccess().getSolutionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__3__Impl"


    // $ANTLR start "rule__Alternative__Group__4"
    // InternalSadd.g:1271:1: rule__Alternative__Group__4 : rule__Alternative__Group__4__Impl ;
    public final void rule__Alternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1275:1: ( rule__Alternative__Group__4__Impl )
            // InternalSadd.g:1276:2: rule__Alternative__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__4"


    // $ANTLR start "rule__Alternative__Group__4__Impl"
    // InternalSadd.g:1282:1: rule__Alternative__Group__4__Impl : ( ')' ) ;
    public final void rule__Alternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1286:1: ( ( ')' ) )
            // InternalSadd.g:1287:1: ( ')' )
            {
            // InternalSadd.g:1287:1: ( ')' )
            // InternalSadd.g:1288:2: ')'
            {
             before(grammarAccess.getAlternativeAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalSadd.g:1298:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1302:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalSadd.g:1303:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalSadd.g:1310:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1314:1: ( ( RULE_ID ) )
            // InternalSadd.g:1315:1: ( RULE_ID )
            {
            // InternalSadd.g:1315:1: ( RULE_ID )
            // InternalSadd.g:1316:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalSadd.g:1325:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1329:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalSadd.g:1330:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalSadd.g:1336:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1340:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalSadd.g:1341:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalSadd.g:1341:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalSadd.g:1342:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalSadd.g:1343:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSadd.g:1343:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalSadd.g:1352:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1356:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalSadd.g:1357:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalSadd.g:1364:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1368:1: ( ( '.' ) )
            // InternalSadd.g:1369:1: ( '.' )
            {
            // InternalSadd.g:1369:1: ( '.' )
            // InternalSadd.g:1370:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalSadd.g:1379:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1383:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalSadd.g:1384:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalSadd.g:1390:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1394:1: ( ( RULE_ID ) )
            // InternalSadd.g:1395:1: ( RULE_ID )
            {
            // InternalSadd.g:1395:1: ( RULE_ID )
            // InternalSadd.g:1396:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalSadd.g:1406:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1410:1: ( ( ruleImport ) )
            // InternalSadd.g:1411:2: ( ruleImport )
            {
            // InternalSadd.g:1411:2: ( ruleImport )
            // InternalSadd.g:1412:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__ProjcatsaddAssignment_1"
    // InternalSadd.g:1421:1: rule__Model__ProjcatsaddAssignment_1 : ( ruleProjCatSADD ) ;
    public final void rule__Model__ProjcatsaddAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1425:1: ( ( ruleProjCatSADD ) )
            // InternalSadd.g:1426:2: ( ruleProjCatSADD )
            {
            // InternalSadd.g:1426:2: ( ruleProjCatSADD )
            // InternalSadd.g:1427:3: ruleProjCatSADD
            {
             before(grammarAccess.getModelAccess().getProjcatsaddProjCatSADDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProjCatSADD();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProjcatsaddProjCatSADDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProjcatsaddAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalSadd.g:1436:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1440:1: ( ( RULE_STRING ) )
            // InternalSadd.g:1441:2: ( RULE_STRING )
            {
            // InternalSadd.g:1441:2: ( RULE_STRING )
            // InternalSadd.g:1442:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Category__NameAssignment_1"
    // InternalSadd.g:1451:1: rule__Category__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1455:1: ( ( RULE_ID ) )
            // InternalSadd.g:1456:2: ( RULE_ID )
            {
            // InternalSadd.g:1456:2: ( RULE_ID )
            // InternalSadd.g:1457:3: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_1"


    // $ANTLR start "rule__Category__SecaddAssignment_3"
    // InternalSadd.g:1466:1: rule__Category__SecaddAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Category__SecaddAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1470:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSadd.g:1471:2: ( ( ruleQualifiedName ) )
            {
            // InternalSadd.g:1471:2: ( ( ruleQualifiedName ) )
            // InternalSadd.g:1472:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCategoryAccess().getSecaddSecurityADDCrossReference_3_0()); 
            // InternalSadd.g:1473:3: ( ruleQualifiedName )
            // InternalSadd.g:1474:4: ruleQualifiedName
            {
             before(grammarAccess.getCategoryAccess().getSecaddSecurityADDQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCategoryAccess().getSecaddSecurityADDQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCategoryAccess().getSecaddSecurityADDCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__SecaddAssignment_3"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // InternalSadd.g:1485:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1489:1: ( ( RULE_ID ) )
            // InternalSadd.g:1490:2: ( RULE_ID )
            {
            // InternalSadd.g:1490:2: ( RULE_ID )
            // InternalSadd.g:1491:3: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_1"


    // $ANTLR start "rule__Project__TeamprofilesAssignment_3"
    // InternalSadd.g:1500:1: rule__Project__TeamprofilesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Project__TeamprofilesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1504:1: ( ( ( RULE_ID ) ) )
            // InternalSadd.g:1505:2: ( ( RULE_ID ) )
            {
            // InternalSadd.g:1505:2: ( ( RULE_ID ) )
            // InternalSadd.g:1506:3: ( RULE_ID )
            {
             before(grammarAccess.getProjectAccess().getTeamprofilesProfileCrossReference_3_0()); 
            // InternalSadd.g:1507:3: ( RULE_ID )
            // InternalSadd.g:1508:4: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getTeamprofilesProfileIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTeamprofilesProfileIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getProjectAccess().getTeamprofilesProfileCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TeamprofilesAssignment_3"


    // $ANTLR start "rule__Project__SecaddAssignment_5"
    // InternalSadd.g:1519:1: rule__Project__SecaddAssignment_5 : ( ruleSecurityADD ) ;
    public final void rule__Project__SecaddAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1523:1: ( ( ruleSecurityADD ) )
            // InternalSadd.g:1524:2: ( ruleSecurityADD )
            {
            // InternalSadd.g:1524:2: ( ruleSecurityADD )
            // InternalSadd.g:1525:3: ruleSecurityADD
            {
             before(grammarAccess.getProjectAccess().getSecaddSecurityADDParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityADD();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getSecaddSecurityADDParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__SecaddAssignment_5"


    // $ANTLR start "rule__Project__CategoryAssignment_6"
    // InternalSadd.g:1534:1: rule__Project__CategoryAssignment_6 : ( ruleCategory ) ;
    public final void rule__Project__CategoryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1538:1: ( ( ruleCategory ) )
            // InternalSadd.g:1539:2: ( ruleCategory )
            {
            // InternalSadd.g:1539:2: ( ruleCategory )
            // InternalSadd.g:1540:3: ruleCategory
            {
             before(grammarAccess.getProjectAccess().getCategoryCategoryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getCategoryCategoryParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__CategoryAssignment_6"


    // $ANTLR start "rule__SecurityADD__NameAssignment_1"
    // InternalSadd.g:1549:1: rule__SecurityADD__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SecurityADD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1553:1: ( ( RULE_ID ) )
            // InternalSadd.g:1554:2: ( RULE_ID )
            {
            // InternalSadd.g:1554:2: ( RULE_ID )
            // InternalSadd.g:1555:3: RULE_ID
            {
             before(grammarAccess.getSecurityADDAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSecurityADDAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__NameAssignment_1"


    // $ANTLR start "rule__SecurityADD__AltsAssignment_2"
    // InternalSadd.g:1564:1: rule__SecurityADD__AltsAssignment_2 : ( ruleAlternatives ) ;
    public final void rule__SecurityADD__AltsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1568:1: ( ( ruleAlternatives ) )
            // InternalSadd.g:1569:2: ( ruleAlternatives )
            {
            // InternalSadd.g:1569:2: ( ruleAlternatives )
            // InternalSadd.g:1570:3: ruleAlternatives
            {
             before(grammarAccess.getSecurityADDAccess().getAltsAlternativesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getSecurityADDAccess().getAltsAlternativesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityADD__AltsAssignment_2"


    // $ANTLR start "rule__Alternatives__AlternativesAssignment_0_2"
    // InternalSadd.g:1579:1: rule__Alternatives__AlternativesAssignment_0_2 : ( ruleAlternative ) ;
    public final void rule__Alternatives__AlternativesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1583:1: ( ( ruleAlternative ) )
            // InternalSadd.g:1584:2: ( ruleAlternative )
            {
            // InternalSadd.g:1584:2: ( ruleAlternative )
            // InternalSadd.g:1585:3: ruleAlternative
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesAlternativeParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getAlternativesAlternativeParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__AlternativesAssignment_0_2"


    // $ANTLR start "rule__Alternatives__SelectedalternativesAssignment_1_2_1"
    // InternalSadd.g:1594:1: rule__Alternatives__SelectedalternativesAssignment_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Alternatives__SelectedalternativesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1598:1: ( ( ( ruleQualifiedName ) ) )
            // InternalSadd.g:1599:2: ( ( ruleQualifiedName ) )
            {
            // InternalSadd.g:1599:2: ( ( ruleQualifiedName ) )
            // InternalSadd.g:1600:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAlternativesAccess().getSelectedalternativesAlternativeCrossReference_1_2_1_0()); 
            // InternalSadd.g:1601:3: ( ruleQualifiedName )
            // InternalSadd.g:1602:4: ruleQualifiedName
            {
             before(grammarAccess.getAlternativesAccess().getSelectedalternativesAlternativeQualifiedNameParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getSelectedalternativesAlternativeQualifiedNameParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getAlternativesAccess().getSelectedalternativesAlternativeCrossReference_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__SelectedalternativesAssignment_1_2_1"


    // $ANTLR start "rule__Alternative__NameAssignment_1"
    // InternalSadd.g:1613:1: rule__Alternative__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternative__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1617:1: ( ( RULE_ID ) )
            // InternalSadd.g:1618:2: ( RULE_ID )
            {
            // InternalSadd.g:1618:2: ( RULE_ID )
            // InternalSadd.g:1619:3: RULE_ID
            {
             before(grammarAccess.getAlternativeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__NameAssignment_1"


    // $ANTLR start "rule__Alternative__SolutionsAssignment_3"
    // InternalSadd.g:1628:1: rule__Alternative__SolutionsAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Alternative__SolutionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSadd.g:1632:1: ( ( RULE_STRING ) )
            // InternalSadd.g:1633:2: ( RULE_STRING )
            {
            // InternalSadd.g:1633:2: ( RULE_STRING )
            // InternalSadd.g:1634:3: RULE_STRING
            {
             before(grammarAccess.getAlternativeAccess().getSolutionsSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getSolutionsSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__SolutionsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000029000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000002D000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000029002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});

}