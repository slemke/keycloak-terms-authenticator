package io.github.slemke.terms;

import java.util.List;

import org.keycloak.Config.Scope;
import org.keycloak.authentication.AuthenticatorFactory;
import org.keycloak.models.AuthenticationExecutionModel.Requirement;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.provider.ProviderConfigProperty;

public class TermsRequiredAuthenticatorFactory implements AuthenticatorFactory {

    public static final String ID = "set-terms-authenticator";

    @Override
    public void close() { }

    @Override
    public TermsRequiredAuthenticator create(KeycloakSession session) {
        return new TermsRequiredAuthenticator();
    }

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public void init(Scope scope) { }

    @Override
    public void postInit(KeycloakSessionFactory sessionFactory) { }

    @Override
    public String getDisplayType() {
        return "Set Terms and Conditions";
    }

    @Override
    public String getReferenceCategory() {
        return null;
    }

    @Override
    public boolean isConfigurable() {
        return false;
    }

    @Override
    public Requirement[] getRequirementChoices() {
        return REQUIREMENT_CHOICES;
    }

    @Override
    public boolean isUserSetupAllowed() {
        return false;
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return null;
    }

    @Override
    public String getHelpText() {
        return "Require a Terms and Conditions interaction on every authentication";
    }    
}
