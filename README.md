# SpringyD
Small sample of using OpenID connect in Spring connecting to my Azure AD.

For it to work we'll need an app in Azure AD.

    az ad app create --display-name "SpringyD"

Jot down the app id. We want to store this not in source control, so let's use an environment variable:

    export SPRINGYD_APP_ID={the_guid_of_your_app}

And then we'll reference it in application.properties

    