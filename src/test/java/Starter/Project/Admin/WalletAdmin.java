package Starter.Project.Admin;

import static net.serenitybdd.rest.SerenityRest.*;

public class WalletAdmin {
    public String url, url1, token;

    public void setUrlToWalletAdmin() {
        url = "https://foodnih.com/v1/admin/wallets";
        url1 = "https://foodnih.com/v1/admin/wallets/6334205768205642";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZXhwIjoxNjcxNTI2NDkzLCJoYXNfcm9sZSI6InN1cGVyYWRtaW4ifQ.5_AkK-lYVNyNJGC2e6mm-KShr9wiGnE7iBmGM29KBig";
    }
    public void WalletAdmin() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url);
    }
    public void WalletAdminById() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void statusSucces() {
        then().statusCode(200);
    }
}

