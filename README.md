<p align="middle">
    <img src="https://www.rifos.org/assets/img/logo.svg" alt="logo" height="100" >
</p>
<h3 align="middle"><code>rns-android-sampleapp</code></h3>
<p align="middle">
    Android sample app using RNS Android SDK
</p>

So this is an example of how to use the [Android SDK](https://github.com/rnsdomains/RNS-SDK-android) of RNS in your android app. The example is basically a list that adds users to it with the + button.

## Installing

You should clone this repository, and the [Android SDK](https://github.com/rnsdomains/RNS-SDK-android) ( check out the readme there to see how to import it as a module in this project ). After that you should be able to just run the app.

## An Example

When you open the app you should see a Dummy user that it is hardcoded in the code of the app. You should add a user using the `+` button.

<img src="https://github.com/rnsdomains/rns-android-sampleapp/blob/master/images/home_init.png" width="240">

That takes you to the `AddAddressActivity` so you can query the address of a known domain registered in mainnet.

<img src="https://github.com/rnsdomains/rns-android-sampleapp/blob/master/images/add_user_activity.png" width="240">

If you do not have one, you can use this one to test it `ilan.max.rsk`, tipe it and touch `Add`.

<img src="https://github.com/rnsdomains/rns-android-sampleapp/blob/master/images/type_a_domain.png" width="240">

That will resolve in the address and add it to the list.

<img src="https://github.com/rnsdomains/rns-android-sampleapp/blob/master/images/home_with_new_user.png" width="240">
