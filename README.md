# Keycloak Terms and Conditions Authenticator

This small extensions adds an authenticator to Keycloak that allows you to set the Terms and Conditions Required Action on every authentication. This results in the user to accept or deny the Terms and Conditions every time.

# Installation guide

1. Move the `.jar` file to `/opt/keycloak/providers/`
2. Make sure it is loaded correctly by checking the provider info in the admin-console
2. Enable `Terms and Conditions` for your realm
3. Add `Set Terms and Conditions` to your custom authentication flow
4. Set the execution to `Required`

Now a user should be asked to accept or decline the terms and conditions every time they try to login.