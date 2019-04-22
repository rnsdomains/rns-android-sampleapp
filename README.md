# RNS Android App example

So this is an example of how to use the [Android SDK](https://github.com/rootstock/RNS-SDK-android) of RNS in your android app. The example is basically a list that adds users to it with the + button.

## Installing

You should clone this repository, and the [Android SDK](https://github.com/rootstock/RNS-SDK-android) ( check out the readme there to see how to import it as a module in this project ). After that you should be able to just run the app.

## An Example

When you open the app you should see a Dummy user that it is hardcoded in the code of the app. You should add a user using the `+` button.

![Home activity](/images/home_init.png =540x960)

That takes you to the `AddAddressActivity` so you can query the address of a known domain registered in mainnet.

![Add user activity](/images/add_user_activity.png)

If you do not have one, you can use this one to test it `ilan.max.rsk`, tipe it and touch `Add`.

![Type a domain](/images/type_a_domain.png)

That will resolve in the address and add it to the list.

![Home with new user](/images/home_with_new_user.png)
