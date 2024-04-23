package io.github.slemke.terms;

import org.keycloak.authentication.AuthenticationFlowContext;
import org.keycloak.authentication.Authenticator;
import org.keycloak.authentication.requiredactions.TermsAndConditions;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class TermsRequiredAuthenticator implements Authenticator {

    @Override
    public void close() { }

    @Override
    public void authenticate(AuthenticationFlowContext context) {
        final UserModel user = context.getUser();
        if (context.getExecution().isRequired()) {
            user.addRequiredAction(TermsAndConditions.PROVIDER_ID);
        }
        context.success();
    }

    @Override
    public void action(AuthenticationFlowContext context) {

    }

    @Override
    public boolean requiresUser() {
        return true;
    }

    @Override
    public boolean configuredFor(KeycloakSession session, RealmModel realm, UserModel user) {
        return true;
    }

    @Override
    public void setRequiredActions(KeycloakSession session, RealmModel realm, UserModel user) { }
}
