package com.paymentez.examplestore.utils;

/**
 * Created by mmucito on 02/06/16.
 */
public class Constants {
    //This is the identifier of the user you use inside your application.
    public static String USER_ID = "uid12345";

    //Email of the user initiating the purchase.
    public static String USER_EMAIL = "dev@paymentez.com";

    //Is Paymentez SDK DEV environment?
    public static boolean PAYMENTEZ_IS_TEST_MODE = true;

    //Ask the Paymentez team for it
    //public static String PAYMENTEZ_CLIENT_APP_CODE = "NUVEITEST-EC-SERVER";
    public static String PAYMENTEZ_CLIENT_APP_CODE = "NUVEITEST-EC-CLIENT";

    //Ask the Paymentez team for it.
    //public static String PAYMENTEZ_CLIENT_APP_KEY = "aiwWdCUZgFpmQTlDDlSHI13NlznjQX";
    public static String PAYMENTEZ_CLIENT_APP_KEY = "n9MXGkf8uR8PkDlsNgd3SNXO5MnvQe";

    //Backend Deployed from https://github.com/paymentez/example-java-backend
    public static String BACKEND_URL = "https://ccapi-stg.paymentez.com";


}
