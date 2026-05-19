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
import xtext.services.TeamprofileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTeamprofileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'Actor'", "':'", "'characterizedBy'", "'{'", "'}'", "'gathers'", "'='"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(TeamprofileGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProfiling"
    // InternalTeamprofile.g:53:1: entryRuleProfiling : ruleProfiling EOF ;
    public final void entryRuleProfiling() throws RecognitionException {
        try {
            // InternalTeamprofile.g:54:1: ( ruleProfiling EOF )
            // InternalTeamprofile.g:55:1: ruleProfiling EOF
            {
             before(grammarAccess.getProfilingRule()); 
            pushFollow(FOLLOW_1);
            ruleProfiling();

            state._fsp--;

             after(grammarAccess.getProfilingRule()); 
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
    // $ANTLR end "entryRuleProfiling"


    // $ANTLR start "ruleProfiling"
    // InternalTeamprofile.g:62:1: ruleProfiling : ( ( rule__Profiling__Group__0 ) ) ;
    public final void ruleProfiling() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:66:2: ( ( ( rule__Profiling__Group__0 ) ) )
            // InternalTeamprofile.g:67:2: ( ( rule__Profiling__Group__0 ) )
            {
            // InternalTeamprofile.g:67:2: ( ( rule__Profiling__Group__0 ) )
            // InternalTeamprofile.g:68:3: ( rule__Profiling__Group__0 )
            {
             before(grammarAccess.getProfilingAccess().getGroup()); 
            // InternalTeamprofile.g:69:3: ( rule__Profiling__Group__0 )
            // InternalTeamprofile.g:69:4: rule__Profiling__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Profiling__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfilingAccess().getGroup()); 

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
    // $ANTLR end "ruleProfiling"


    // $ANTLR start "entryRuleImport"
    // InternalTeamprofile.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalTeamprofile.g:79:1: ( ruleImport EOF )
            // InternalTeamprofile.g:80:1: ruleImport EOF
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
    // InternalTeamprofile.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalTeamprofile.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalTeamprofile.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalTeamprofile.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalTeamprofile.g:94:3: ( rule__Import__Group__0 )
            // InternalTeamprofile.g:94:4: rule__Import__Group__0
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


    // $ANTLR start "entryRuleActor"
    // InternalTeamprofile.g:103:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalTeamprofile.g:104:1: ( ruleActor EOF )
            // InternalTeamprofile.g:105:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalTeamprofile.g:112:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:116:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalTeamprofile.g:117:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalTeamprofile.g:117:2: ( ( rule__Actor__Group__0 ) )
            // InternalTeamprofile.g:118:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalTeamprofile.g:119:3: ( rule__Actor__Group__0 )
            // InternalTeamprofile.g:119:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleProfile"
    // InternalTeamprofile.g:128:1: entryRuleProfile : ruleProfile EOF ;
    public final void entryRuleProfile() throws RecognitionException {
        try {
            // InternalTeamprofile.g:129:1: ( ruleProfile EOF )
            // InternalTeamprofile.g:130:1: ruleProfile EOF
            {
             before(grammarAccess.getProfileRule()); 
            pushFollow(FOLLOW_1);
            ruleProfile();

            state._fsp--;

             after(grammarAccess.getProfileRule()); 
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
    // $ANTLR end "entryRuleProfile"


    // $ANTLR start "ruleProfile"
    // InternalTeamprofile.g:137:1: ruleProfile : ( ( rule__Profile__Group__0 ) ) ;
    public final void ruleProfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:141:2: ( ( ( rule__Profile__Group__0 ) ) )
            // InternalTeamprofile.g:142:2: ( ( rule__Profile__Group__0 ) )
            {
            // InternalTeamprofile.g:142:2: ( ( rule__Profile__Group__0 ) )
            // InternalTeamprofile.g:143:3: ( rule__Profile__Group__0 )
            {
             before(grammarAccess.getProfileAccess().getGroup()); 
            // InternalTeamprofile.g:144:3: ( rule__Profile__Group__0 )
            // InternalTeamprofile.g:144:4: rule__Profile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getGroup()); 

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
    // $ANTLR end "ruleProfile"


    // $ANTLR start "entryRuleAttribute"
    // InternalTeamprofile.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalTeamprofile.g:154:1: ( ruleAttribute EOF )
            // InternalTeamprofile.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalTeamprofile.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalTeamprofile.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalTeamprofile.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalTeamprofile.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalTeamprofile.g:169:3: ( rule__Attribute__Group__0 )
            // InternalTeamprofile.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValueKind"
    // InternalTeamprofile.g:178:1: entryRuleValueKind : ruleValueKind EOF ;
    public final void entryRuleValueKind() throws RecognitionException {
        try {
            // InternalTeamprofile.g:179:1: ( ruleValueKind EOF )
            // InternalTeamprofile.g:180:1: ruleValueKind EOF
            {
             before(grammarAccess.getValueKindRule()); 
            pushFollow(FOLLOW_1);
            ruleValueKind();

            state._fsp--;

             after(grammarAccess.getValueKindRule()); 
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
    // $ANTLR end "entryRuleValueKind"


    // $ANTLR start "ruleValueKind"
    // InternalTeamprofile.g:187:1: ruleValueKind : ( ( rule__ValueKind__Alternatives ) ) ;
    public final void ruleValueKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:191:2: ( ( ( rule__ValueKind__Alternatives ) ) )
            // InternalTeamprofile.g:192:2: ( ( rule__ValueKind__Alternatives ) )
            {
            // InternalTeamprofile.g:192:2: ( ( rule__ValueKind__Alternatives ) )
            // InternalTeamprofile.g:193:3: ( rule__ValueKind__Alternatives )
            {
             before(grammarAccess.getValueKindAccess().getAlternatives()); 
            // InternalTeamprofile.g:194:3: ( rule__ValueKind__Alternatives )
            // InternalTeamprofile.g:194:4: rule__ValueKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValueKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueKindAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValueKind"


    // $ANTLR start "rule__ValueKind__Alternatives"
    // InternalTeamprofile.g:202:1: rule__ValueKind__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__ValueKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:206:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTeamprofile.g:207:2: ( RULE_INT )
                    {
                    // InternalTeamprofile.g:207:2: ( RULE_INT )
                    // InternalTeamprofile.g:208:3: RULE_INT
                    {
                     before(grammarAccess.getValueKindAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueKindAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTeamprofile.g:213:2: ( RULE_STRING )
                    {
                    // InternalTeamprofile.g:213:2: ( RULE_STRING )
                    // InternalTeamprofile.g:214:3: RULE_STRING
                    {
                     before(grammarAccess.getValueKindAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueKindAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ValueKind__Alternatives"


    // $ANTLR start "rule__Profiling__Group__0"
    // InternalTeamprofile.g:223:1: rule__Profiling__Group__0 : rule__Profiling__Group__0__Impl rule__Profiling__Group__1 ;
    public final void rule__Profiling__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:227:1: ( rule__Profiling__Group__0__Impl rule__Profiling__Group__1 )
            // InternalTeamprofile.g:228:2: rule__Profiling__Group__0__Impl rule__Profiling__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Profiling__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profiling__Group__1();

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
    // $ANTLR end "rule__Profiling__Group__0"


    // $ANTLR start "rule__Profiling__Group__0__Impl"
    // InternalTeamprofile.g:235:1: rule__Profiling__Group__0__Impl : ( ( rule__Profiling__ImportsAssignment_0 )* ) ;
    public final void rule__Profiling__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:239:1: ( ( ( rule__Profiling__ImportsAssignment_0 )* ) )
            // InternalTeamprofile.g:240:1: ( ( rule__Profiling__ImportsAssignment_0 )* )
            {
            // InternalTeamprofile.g:240:1: ( ( rule__Profiling__ImportsAssignment_0 )* )
            // InternalTeamprofile.g:241:2: ( rule__Profiling__ImportsAssignment_0 )*
            {
             before(grammarAccess.getProfilingAccess().getImportsAssignment_0()); 
            // InternalTeamprofile.g:242:2: ( rule__Profiling__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTeamprofile.g:242:3: rule__Profiling__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Profiling__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProfilingAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Profiling__Group__0__Impl"


    // $ANTLR start "rule__Profiling__Group__1"
    // InternalTeamprofile.g:250:1: rule__Profiling__Group__1 : rule__Profiling__Group__1__Impl rule__Profiling__Group__2 ;
    public final void rule__Profiling__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:254:1: ( rule__Profiling__Group__1__Impl rule__Profiling__Group__2 )
            // InternalTeamprofile.g:255:2: rule__Profiling__Group__1__Impl rule__Profiling__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Profiling__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profiling__Group__2();

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
    // $ANTLR end "rule__Profiling__Group__1"


    // $ANTLR start "rule__Profiling__Group__1__Impl"
    // InternalTeamprofile.g:262:1: rule__Profiling__Group__1__Impl : ( ( rule__Profiling__ActorsAssignment_1 )* ) ;
    public final void rule__Profiling__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:266:1: ( ( ( rule__Profiling__ActorsAssignment_1 )* ) )
            // InternalTeamprofile.g:267:1: ( ( rule__Profiling__ActorsAssignment_1 )* )
            {
            // InternalTeamprofile.g:267:1: ( ( rule__Profiling__ActorsAssignment_1 )* )
            // InternalTeamprofile.g:268:2: ( rule__Profiling__ActorsAssignment_1 )*
            {
             before(grammarAccess.getProfilingAccess().getActorsAssignment_1()); 
            // InternalTeamprofile.g:269:2: ( rule__Profiling__ActorsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTeamprofile.g:269:3: rule__Profiling__ActorsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Profiling__ActorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProfilingAccess().getActorsAssignment_1()); 

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
    // $ANTLR end "rule__Profiling__Group__1__Impl"


    // $ANTLR start "rule__Profiling__Group__2"
    // InternalTeamprofile.g:277:1: rule__Profiling__Group__2 : rule__Profiling__Group__2__Impl ;
    public final void rule__Profiling__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:281:1: ( rule__Profiling__Group__2__Impl )
            // InternalTeamprofile.g:282:2: rule__Profiling__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profiling__Group__2__Impl();

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
    // $ANTLR end "rule__Profiling__Group__2"


    // $ANTLR start "rule__Profiling__Group__2__Impl"
    // InternalTeamprofile.g:288:1: rule__Profiling__Group__2__Impl : ( ( rule__Profiling__ProfilesAssignment_2 )* ) ;
    public final void rule__Profiling__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:292:1: ( ( ( rule__Profiling__ProfilesAssignment_2 )* ) )
            // InternalTeamprofile.g:293:1: ( ( rule__Profiling__ProfilesAssignment_2 )* )
            {
            // InternalTeamprofile.g:293:1: ( ( rule__Profiling__ProfilesAssignment_2 )* )
            // InternalTeamprofile.g:294:2: ( rule__Profiling__ProfilesAssignment_2 )*
            {
             before(grammarAccess.getProfilingAccess().getProfilesAssignment_2()); 
            // InternalTeamprofile.g:295:2: ( rule__Profiling__ProfilesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTeamprofile.g:295:3: rule__Profiling__ProfilesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Profiling__ProfilesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProfilingAccess().getProfilesAssignment_2()); 

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
    // $ANTLR end "rule__Profiling__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalTeamprofile.g:304:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:308:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTeamprofile.g:309:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalTeamprofile.g:316:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:320:1: ( ( 'import' ) )
            // InternalTeamprofile.g:321:1: ( 'import' )
            {
            // InternalTeamprofile.g:321:1: ( 'import' )
            // InternalTeamprofile.g:322:2: 'import'
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
    // InternalTeamprofile.g:331:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:335:1: ( rule__Import__Group__1__Impl )
            // InternalTeamprofile.g:336:2: rule__Import__Group__1__Impl
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
    // InternalTeamprofile.g:342:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:346:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalTeamprofile.g:347:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalTeamprofile.g:347:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalTeamprofile.g:348:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalTeamprofile.g:349:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalTeamprofile.g:349:3: rule__Import__ImportURIAssignment_1
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


    // $ANTLR start "rule__Actor__Group__0"
    // InternalTeamprofile.g:358:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:362:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalTeamprofile.g:363:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalTeamprofile.g:370:1: rule__Actor__Group__0__Impl : ( 'Actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:374:1: ( ( 'Actor' ) )
            // InternalTeamprofile.g:375:1: ( 'Actor' )
            {
            // InternalTeamprofile.g:375:1: ( 'Actor' )
            // InternalTeamprofile.g:376:2: 'Actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

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
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalTeamprofile.g:385:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:389:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalTeamprofile.g:390:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalTeamprofile.g:397:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:401:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalTeamprofile.g:402:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalTeamprofile.g:402:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalTeamprofile.g:403:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalTeamprofile.g:404:2: ( rule__Actor__NameAssignment_1 )
            // InternalTeamprofile.g:404:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalTeamprofile.g:412:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:416:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalTeamprofile.g:417:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

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
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalTeamprofile.g:424:1: rule__Actor__Group__2__Impl : ( ':' ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:428:1: ( ( ':' ) )
            // InternalTeamprofile.g:429:1: ( ':' )
            {
            // InternalTeamprofile.g:429:1: ( ':' )
            // InternalTeamprofile.g:430:2: ':'
            {
             before(grammarAccess.getActorAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalTeamprofile.g:439:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:443:1: ( rule__Actor__Group__3__Impl )
            // InternalTeamprofile.g:444:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__3__Impl();

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
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalTeamprofile.g:450:1: rule__Actor__Group__3__Impl : ( ( ( rule__Actor__AttributesAssignment_3 ) ) ( ( rule__Actor__AttributesAssignment_3 )* ) ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:454:1: ( ( ( ( rule__Actor__AttributesAssignment_3 ) ) ( ( rule__Actor__AttributesAssignment_3 )* ) ) )
            // InternalTeamprofile.g:455:1: ( ( ( rule__Actor__AttributesAssignment_3 ) ) ( ( rule__Actor__AttributesAssignment_3 )* ) )
            {
            // InternalTeamprofile.g:455:1: ( ( ( rule__Actor__AttributesAssignment_3 ) ) ( ( rule__Actor__AttributesAssignment_3 )* ) )
            // InternalTeamprofile.g:456:2: ( ( rule__Actor__AttributesAssignment_3 ) ) ( ( rule__Actor__AttributesAssignment_3 )* )
            {
            // InternalTeamprofile.g:456:2: ( ( rule__Actor__AttributesAssignment_3 ) )
            // InternalTeamprofile.g:457:3: ( rule__Actor__AttributesAssignment_3 )
            {
             before(grammarAccess.getActorAccess().getAttributesAssignment_3()); 
            // InternalTeamprofile.g:458:3: ( rule__Actor__AttributesAssignment_3 )
            // InternalTeamprofile.g:458:4: rule__Actor__AttributesAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Actor__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAttributesAssignment_3()); 

            }

            // InternalTeamprofile.g:461:2: ( ( rule__Actor__AttributesAssignment_3 )* )
            // InternalTeamprofile.g:462:3: ( rule__Actor__AttributesAssignment_3 )*
            {
             before(grammarAccess.getActorAccess().getAttributesAssignment_3()); 
            // InternalTeamprofile.g:463:3: ( rule__Actor__AttributesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTeamprofile.g:463:4: rule__Actor__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Actor__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Profile__Group__0"
    // InternalTeamprofile.g:473:1: rule__Profile__Group__0 : rule__Profile__Group__0__Impl rule__Profile__Group__1 ;
    public final void rule__Profile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:477:1: ( rule__Profile__Group__0__Impl rule__Profile__Group__1 )
            // InternalTeamprofile.g:478:2: rule__Profile__Group__0__Impl rule__Profile__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Profile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__1();

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
    // $ANTLR end "rule__Profile__Group__0"


    // $ANTLR start "rule__Profile__Group__0__Impl"
    // InternalTeamprofile.g:485:1: rule__Profile__Group__0__Impl : ( ( rule__Profile__NameAssignment_0 ) ) ;
    public final void rule__Profile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:489:1: ( ( ( rule__Profile__NameAssignment_0 ) ) )
            // InternalTeamprofile.g:490:1: ( ( rule__Profile__NameAssignment_0 ) )
            {
            // InternalTeamprofile.g:490:1: ( ( rule__Profile__NameAssignment_0 ) )
            // InternalTeamprofile.g:491:2: ( rule__Profile__NameAssignment_0 )
            {
             before(grammarAccess.getProfileAccess().getNameAssignment_0()); 
            // InternalTeamprofile.g:492:2: ( rule__Profile__NameAssignment_0 )
            // InternalTeamprofile.g:492:3: rule__Profile__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Profile__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Profile__Group__0__Impl"


    // $ANTLR start "rule__Profile__Group__1"
    // InternalTeamprofile.g:500:1: rule__Profile__Group__1 : rule__Profile__Group__1__Impl rule__Profile__Group__2 ;
    public final void rule__Profile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:504:1: ( rule__Profile__Group__1__Impl rule__Profile__Group__2 )
            // InternalTeamprofile.g:505:2: rule__Profile__Group__1__Impl rule__Profile__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Profile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__2();

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
    // $ANTLR end "rule__Profile__Group__1"


    // $ANTLR start "rule__Profile__Group__1__Impl"
    // InternalTeamprofile.g:512:1: rule__Profile__Group__1__Impl : ( ( rule__Profile__Group_1__0 )* ) ;
    public final void rule__Profile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:516:1: ( ( ( rule__Profile__Group_1__0 )* ) )
            // InternalTeamprofile.g:517:1: ( ( rule__Profile__Group_1__0 )* )
            {
            // InternalTeamprofile.g:517:1: ( ( rule__Profile__Group_1__0 )* )
            // InternalTeamprofile.g:518:2: ( rule__Profile__Group_1__0 )*
            {
             before(grammarAccess.getProfileAccess().getGroup_1()); 
            // InternalTeamprofile.g:519:2: ( rule__Profile__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTeamprofile.g:519:3: rule__Profile__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Profile__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Profile__Group__1__Impl"


    // $ANTLR start "rule__Profile__Group__2"
    // InternalTeamprofile.g:527:1: rule__Profile__Group__2 : rule__Profile__Group__2__Impl rule__Profile__Group__3 ;
    public final void rule__Profile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:531:1: ( rule__Profile__Group__2__Impl rule__Profile__Group__3 )
            // InternalTeamprofile.g:532:2: rule__Profile__Group__2__Impl rule__Profile__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Profile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__3();

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
    // $ANTLR end "rule__Profile__Group__2"


    // $ANTLR start "rule__Profile__Group__2__Impl"
    // InternalTeamprofile.g:539:1: rule__Profile__Group__2__Impl : ( 'characterizedBy' ) ;
    public final void rule__Profile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:543:1: ( ( 'characterizedBy' ) )
            // InternalTeamprofile.g:544:1: ( 'characterizedBy' )
            {
            // InternalTeamprofile.g:544:1: ( 'characterizedBy' )
            // InternalTeamprofile.g:545:2: 'characterizedBy'
            {
             before(grammarAccess.getProfileAccess().getCharacterizedByKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getCharacterizedByKeyword_2()); 

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
    // $ANTLR end "rule__Profile__Group__2__Impl"


    // $ANTLR start "rule__Profile__Group__3"
    // InternalTeamprofile.g:554:1: rule__Profile__Group__3 : rule__Profile__Group__3__Impl rule__Profile__Group__4 ;
    public final void rule__Profile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:558:1: ( rule__Profile__Group__3__Impl rule__Profile__Group__4 )
            // InternalTeamprofile.g:559:2: rule__Profile__Group__3__Impl rule__Profile__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Profile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__4();

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
    // $ANTLR end "rule__Profile__Group__3"


    // $ANTLR start "rule__Profile__Group__3__Impl"
    // InternalTeamprofile.g:566:1: rule__Profile__Group__3__Impl : ( '{' ) ;
    public final void rule__Profile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:570:1: ( ( '{' ) )
            // InternalTeamprofile.g:571:1: ( '{' )
            {
            // InternalTeamprofile.g:571:1: ( '{' )
            // InternalTeamprofile.g:572:2: '{'
            {
             before(grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Profile__Group__3__Impl"


    // $ANTLR start "rule__Profile__Group__4"
    // InternalTeamprofile.g:581:1: rule__Profile__Group__4 : rule__Profile__Group__4__Impl rule__Profile__Group__5 ;
    public final void rule__Profile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:585:1: ( rule__Profile__Group__4__Impl rule__Profile__Group__5 )
            // InternalTeamprofile.g:586:2: rule__Profile__Group__4__Impl rule__Profile__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Profile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group__5();

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
    // $ANTLR end "rule__Profile__Group__4"


    // $ANTLR start "rule__Profile__Group__4__Impl"
    // InternalTeamprofile.g:593:1: rule__Profile__Group__4__Impl : ( ( ( rule__Profile__AttributesAssignment_4 ) ) ( ( rule__Profile__AttributesAssignment_4 )* ) ) ;
    public final void rule__Profile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:597:1: ( ( ( ( rule__Profile__AttributesAssignment_4 ) ) ( ( rule__Profile__AttributesAssignment_4 )* ) ) )
            // InternalTeamprofile.g:598:1: ( ( ( rule__Profile__AttributesAssignment_4 ) ) ( ( rule__Profile__AttributesAssignment_4 )* ) )
            {
            // InternalTeamprofile.g:598:1: ( ( ( rule__Profile__AttributesAssignment_4 ) ) ( ( rule__Profile__AttributesAssignment_4 )* ) )
            // InternalTeamprofile.g:599:2: ( ( rule__Profile__AttributesAssignment_4 ) ) ( ( rule__Profile__AttributesAssignment_4 )* )
            {
            // InternalTeamprofile.g:599:2: ( ( rule__Profile__AttributesAssignment_4 ) )
            // InternalTeamprofile.g:600:3: ( rule__Profile__AttributesAssignment_4 )
            {
             before(grammarAccess.getProfileAccess().getAttributesAssignment_4()); 
            // InternalTeamprofile.g:601:3: ( rule__Profile__AttributesAssignment_4 )
            // InternalTeamprofile.g:601:4: rule__Profile__AttributesAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__Profile__AttributesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProfileAccess().getAttributesAssignment_4()); 

            }

            // InternalTeamprofile.g:604:2: ( ( rule__Profile__AttributesAssignment_4 )* )
            // InternalTeamprofile.g:605:3: ( rule__Profile__AttributesAssignment_4 )*
            {
             before(grammarAccess.getProfileAccess().getAttributesAssignment_4()); 
            // InternalTeamprofile.g:606:3: ( rule__Profile__AttributesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTeamprofile.g:606:4: rule__Profile__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Profile__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getAttributesAssignment_4()); 

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
    // $ANTLR end "rule__Profile__Group__4__Impl"


    // $ANTLR start "rule__Profile__Group__5"
    // InternalTeamprofile.g:615:1: rule__Profile__Group__5 : rule__Profile__Group__5__Impl ;
    public final void rule__Profile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:619:1: ( rule__Profile__Group__5__Impl )
            // InternalTeamprofile.g:620:2: rule__Profile__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group__5__Impl();

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
    // $ANTLR end "rule__Profile__Group__5"


    // $ANTLR start "rule__Profile__Group__5__Impl"
    // InternalTeamprofile.g:626:1: rule__Profile__Group__5__Impl : ( '}' ) ;
    public final void rule__Profile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:630:1: ( ( '}' ) )
            // InternalTeamprofile.g:631:1: ( '}' )
            {
            // InternalTeamprofile.g:631:1: ( '}' )
            // InternalTeamprofile.g:632:2: '}'
            {
             before(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Profile__Group__5__Impl"


    // $ANTLR start "rule__Profile__Group_1__0"
    // InternalTeamprofile.g:642:1: rule__Profile__Group_1__0 : rule__Profile__Group_1__0__Impl rule__Profile__Group_1__1 ;
    public final void rule__Profile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:646:1: ( rule__Profile__Group_1__0__Impl rule__Profile__Group_1__1 )
            // InternalTeamprofile.g:647:2: rule__Profile__Group_1__0__Impl rule__Profile__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Profile__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group_1__1();

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
    // $ANTLR end "rule__Profile__Group_1__0"


    // $ANTLR start "rule__Profile__Group_1__0__Impl"
    // InternalTeamprofile.g:654:1: rule__Profile__Group_1__0__Impl : ( 'gathers' ) ;
    public final void rule__Profile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:658:1: ( ( 'gathers' ) )
            // InternalTeamprofile.g:659:1: ( 'gathers' )
            {
            // InternalTeamprofile.g:659:1: ( 'gathers' )
            // InternalTeamprofile.g:660:2: 'gathers'
            {
             before(grammarAccess.getProfileAccess().getGathersKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getGathersKeyword_1_0()); 

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
    // $ANTLR end "rule__Profile__Group_1__0__Impl"


    // $ANTLR start "rule__Profile__Group_1__1"
    // InternalTeamprofile.g:669:1: rule__Profile__Group_1__1 : rule__Profile__Group_1__1__Impl rule__Profile__Group_1__2 ;
    public final void rule__Profile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:673:1: ( rule__Profile__Group_1__1__Impl rule__Profile__Group_1__2 )
            // InternalTeamprofile.g:674:2: rule__Profile__Group_1__1__Impl rule__Profile__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Profile__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group_1__2();

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
    // $ANTLR end "rule__Profile__Group_1__1"


    // $ANTLR start "rule__Profile__Group_1__1__Impl"
    // InternalTeamprofile.g:681:1: rule__Profile__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Profile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:685:1: ( ( '{' ) )
            // InternalTeamprofile.g:686:1: ( '{' )
            {
            // InternalTeamprofile.g:686:1: ( '{' )
            // InternalTeamprofile.g:687:2: '{'
            {
             before(grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Profile__Group_1__1__Impl"


    // $ANTLR start "rule__Profile__Group_1__2"
    // InternalTeamprofile.g:696:1: rule__Profile__Group_1__2 : rule__Profile__Group_1__2__Impl rule__Profile__Group_1__3 ;
    public final void rule__Profile__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:700:1: ( rule__Profile__Group_1__2__Impl rule__Profile__Group_1__3 )
            // InternalTeamprofile.g:701:2: rule__Profile__Group_1__2__Impl rule__Profile__Group_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Profile__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Profile__Group_1__3();

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
    // $ANTLR end "rule__Profile__Group_1__2"


    // $ANTLR start "rule__Profile__Group_1__2__Impl"
    // InternalTeamprofile.g:708:1: rule__Profile__Group_1__2__Impl : ( ( rule__Profile__ActorsAssignment_1_2 )* ) ;
    public final void rule__Profile__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:712:1: ( ( ( rule__Profile__ActorsAssignment_1_2 )* ) )
            // InternalTeamprofile.g:713:1: ( ( rule__Profile__ActorsAssignment_1_2 )* )
            {
            // InternalTeamprofile.g:713:1: ( ( rule__Profile__ActorsAssignment_1_2 )* )
            // InternalTeamprofile.g:714:2: ( rule__Profile__ActorsAssignment_1_2 )*
            {
             before(grammarAccess.getProfileAccess().getActorsAssignment_1_2()); 
            // InternalTeamprofile.g:715:2: ( rule__Profile__ActorsAssignment_1_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTeamprofile.g:715:3: rule__Profile__ActorsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Profile__ActorsAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProfileAccess().getActorsAssignment_1_2()); 

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
    // $ANTLR end "rule__Profile__Group_1__2__Impl"


    // $ANTLR start "rule__Profile__Group_1__3"
    // InternalTeamprofile.g:723:1: rule__Profile__Group_1__3 : rule__Profile__Group_1__3__Impl ;
    public final void rule__Profile__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:727:1: ( rule__Profile__Group_1__3__Impl )
            // InternalTeamprofile.g:728:2: rule__Profile__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Profile__Group_1__3__Impl();

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
    // $ANTLR end "rule__Profile__Group_1__3"


    // $ANTLR start "rule__Profile__Group_1__3__Impl"
    // InternalTeamprofile.g:734:1: rule__Profile__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Profile__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:738:1: ( ( '}' ) )
            // InternalTeamprofile.g:739:1: ( '}' )
            {
            // InternalTeamprofile.g:739:1: ( '}' )
            // InternalTeamprofile.g:740:2: '}'
            {
             before(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Profile__Group_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalTeamprofile.g:750:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:754:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalTeamprofile.g:755:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalTeamprofile.g:762:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__HfpropertyAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:766:1: ( ( ( rule__Attribute__HfpropertyAssignment_0 ) ) )
            // InternalTeamprofile.g:767:1: ( ( rule__Attribute__HfpropertyAssignment_0 ) )
            {
            // InternalTeamprofile.g:767:1: ( ( rule__Attribute__HfpropertyAssignment_0 ) )
            // InternalTeamprofile.g:768:2: ( rule__Attribute__HfpropertyAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getHfpropertyAssignment_0()); 
            // InternalTeamprofile.g:769:2: ( rule__Attribute__HfpropertyAssignment_0 )
            // InternalTeamprofile.g:769:3: rule__Attribute__HfpropertyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__HfpropertyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getHfpropertyAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalTeamprofile.g:777:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:781:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalTeamprofile.g:782:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalTeamprofile.g:789:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:793:1: ( ( '=' ) )
            // InternalTeamprofile.g:794:1: ( '=' )
            {
            // InternalTeamprofile.g:794:1: ( '=' )
            // InternalTeamprofile.g:795:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalTeamprofile.g:804:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:808:1: ( rule__Attribute__Group__2__Impl )
            // InternalTeamprofile.g:809:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalTeamprofile.g:815:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__HfmeasurementvalueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:819:1: ( ( ( rule__Attribute__HfmeasurementvalueAssignment_2 ) ) )
            // InternalTeamprofile.g:820:1: ( ( rule__Attribute__HfmeasurementvalueAssignment_2 ) )
            {
            // InternalTeamprofile.g:820:1: ( ( rule__Attribute__HfmeasurementvalueAssignment_2 ) )
            // InternalTeamprofile.g:821:2: ( rule__Attribute__HfmeasurementvalueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getHfmeasurementvalueAssignment_2()); 
            // InternalTeamprofile.g:822:2: ( rule__Attribute__HfmeasurementvalueAssignment_2 )
            // InternalTeamprofile.g:822:3: rule__Attribute__HfmeasurementvalueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__HfmeasurementvalueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getHfmeasurementvalueAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Profiling__ImportsAssignment_0"
    // InternalTeamprofile.g:831:1: rule__Profiling__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Profiling__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:835:1: ( ( ruleImport ) )
            // InternalTeamprofile.g:836:2: ( ruleImport )
            {
            // InternalTeamprofile.g:836:2: ( ruleImport )
            // InternalTeamprofile.g:837:3: ruleImport
            {
             before(grammarAccess.getProfilingAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getProfilingAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Profiling__ImportsAssignment_0"


    // $ANTLR start "rule__Profiling__ActorsAssignment_1"
    // InternalTeamprofile.g:846:1: rule__Profiling__ActorsAssignment_1 : ( ruleActor ) ;
    public final void rule__Profiling__ActorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:850:1: ( ( ruleActor ) )
            // InternalTeamprofile.g:851:2: ( ruleActor )
            {
            // InternalTeamprofile.g:851:2: ( ruleActor )
            // InternalTeamprofile.g:852:3: ruleActor
            {
             before(grammarAccess.getProfilingAccess().getActorsActorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getProfilingAccess().getActorsActorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Profiling__ActorsAssignment_1"


    // $ANTLR start "rule__Profiling__ProfilesAssignment_2"
    // InternalTeamprofile.g:861:1: rule__Profiling__ProfilesAssignment_2 : ( ruleProfile ) ;
    public final void rule__Profiling__ProfilesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:865:1: ( ( ruleProfile ) )
            // InternalTeamprofile.g:866:2: ( ruleProfile )
            {
            // InternalTeamprofile.g:866:2: ( ruleProfile )
            // InternalTeamprofile.g:867:3: ruleProfile
            {
             before(grammarAccess.getProfilingAccess().getProfilesProfileParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProfile();

            state._fsp--;

             after(grammarAccess.getProfilingAccess().getProfilesProfileParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Profiling__ProfilesAssignment_2"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalTeamprofile.g:876:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:880:1: ( ( RULE_STRING ) )
            // InternalTeamprofile.g:881:2: ( RULE_STRING )
            {
            // InternalTeamprofile.g:881:2: ( RULE_STRING )
            // InternalTeamprofile.g:882:3: RULE_STRING
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


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalTeamprofile.g:891:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:895:1: ( ( RULE_ID ) )
            // InternalTeamprofile.g:896:2: ( RULE_ID )
            {
            // InternalTeamprofile.g:896:2: ( RULE_ID )
            // InternalTeamprofile.g:897:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__AttributesAssignment_3"
    // InternalTeamprofile.g:906:1: rule__Actor__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Actor__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:910:1: ( ( ruleAttribute ) )
            // InternalTeamprofile.g:911:2: ( ruleAttribute )
            {
            // InternalTeamprofile.g:911:2: ( ruleAttribute )
            // InternalTeamprofile.g:912:3: ruleAttribute
            {
             before(grammarAccess.getActorAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getActorAccess().getAttributesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Actor__AttributesAssignment_3"


    // $ANTLR start "rule__Profile__NameAssignment_0"
    // InternalTeamprofile.g:921:1: rule__Profile__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Profile__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:925:1: ( ( RULE_ID ) )
            // InternalTeamprofile.g:926:2: ( RULE_ID )
            {
            // InternalTeamprofile.g:926:2: ( RULE_ID )
            // InternalTeamprofile.g:927:3: RULE_ID
            {
             before(grammarAccess.getProfileAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Profile__NameAssignment_0"


    // $ANTLR start "rule__Profile__ActorsAssignment_1_2"
    // InternalTeamprofile.g:936:1: rule__Profile__ActorsAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Profile__ActorsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:940:1: ( ( ( RULE_ID ) ) )
            // InternalTeamprofile.g:941:2: ( ( RULE_ID ) )
            {
            // InternalTeamprofile.g:941:2: ( ( RULE_ID ) )
            // InternalTeamprofile.g:942:3: ( RULE_ID )
            {
             before(grammarAccess.getProfileAccess().getActorsActorCrossReference_1_2_0()); 
            // InternalTeamprofile.g:943:3: ( RULE_ID )
            // InternalTeamprofile.g:944:4: RULE_ID
            {
             before(grammarAccess.getProfileAccess().getActorsActorIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProfileAccess().getActorsActorIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getProfileAccess().getActorsActorCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__Profile__ActorsAssignment_1_2"


    // $ANTLR start "rule__Profile__AttributesAssignment_4"
    // InternalTeamprofile.g:955:1: rule__Profile__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__Profile__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:959:1: ( ( ruleAttribute ) )
            // InternalTeamprofile.g:960:2: ( ruleAttribute )
            {
            // InternalTeamprofile.g:960:2: ( ruleAttribute )
            // InternalTeamprofile.g:961:3: ruleAttribute
            {
             before(grammarAccess.getProfileAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getProfileAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Profile__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__HfpropertyAssignment_0"
    // InternalTeamprofile.g:970:1: rule__Attribute__HfpropertyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Attribute__HfpropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:974:1: ( ( RULE_STRING ) )
            // InternalTeamprofile.g:975:2: ( RULE_STRING )
            {
            // InternalTeamprofile.g:975:2: ( RULE_STRING )
            // InternalTeamprofile.g:976:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getHfpropertySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getHfpropertySTRINGTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attribute__HfpropertyAssignment_0"


    // $ANTLR start "rule__Attribute__HfmeasurementvalueAssignment_2"
    // InternalTeamprofile.g:985:1: rule__Attribute__HfmeasurementvalueAssignment_2 : ( ruleValueKind ) ;
    public final void rule__Attribute__HfmeasurementvalueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTeamprofile.g:989:1: ( ( ruleValueKind ) )
            // InternalTeamprofile.g:990:2: ( ruleValueKind )
            {
            // InternalTeamprofile.g:990:2: ( ruleValueKind )
            // InternalTeamprofile.g:991:3: ruleValueKind
            {
             before(grammarAccess.getAttributeAccess().getHfmeasurementvalueValueKindParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValueKind();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getHfmeasurementvalueValueKindParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__HfmeasurementvalueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});

}