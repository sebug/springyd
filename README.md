# SpringyD
Small sample of using OpenID connect in Spring connecting to my Azure AD.

For it to work we'll need an app in Azure AD.

    az ad app create --display-name "SpringyD"

Jot down the app id. We want to store this not in source control, so let's use an environment variable:

    export SPRINGYD_APP_ID={the_guid_of_your_app}

And then we'll reference it in application.properties.

Now we'll need an app secret

    az ad app credential reset --id $SPRINGYD_APP_ID

Save the password and tenant in environment variables as well

    export SPRINGYD_TENANT={tenant_id}
    export SPRINGYD_APP_SECRET={password}

Now that you have the tenant id, we can already quickly verify the basic information for our Spring Boot OAuth config - go to
https://login.microsoftonline.com/{tenant_id}/v2.0/.well-known/openid-configuration . There you'll see the different paths
that we can enter in the application.properties afterwards.
