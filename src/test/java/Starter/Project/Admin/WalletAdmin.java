package Starter.Project.Admin;

import static net.serenitybdd.rest.SerenityRest.*;

public class WalletAdmin {
    public String url, url1, token;

    public void setUrlToWalletAdmin() {
        url = "https://foodnih.com/v1/admin/wallets";
        url1 = "https://foodnih.com/v1/admin/wallets/6334205768205642";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZXhwIjoxNjcxODEyMjUzLCJoYXNfcm9sZSI6InN1cGVyYWRtaW4ifQ.894JNT34t6DUjOIQjuaN3QHCtAqo6qiMsHClroIJWhk";
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
    public void WalletAdminnotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public void WalletAdminByIdnotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url1);
    }
    public void statusSucces() {
        then().statusCode(200);
    }
    public void statusfailed() {
        then().statusCode(400);
    }
    public void statusfailed404() {
        then().statusCode(404);
    }
}

