package Starter.Project.Admin;

import static net.serenitybdd.rest.SerenityRest.*;

public class ProductTypeAdmin {
    public String url, url1, token;
    public void setUrlToProductAdmin() {
        url = "https://foodnih.com/v1/admin/product-types";
        url1 = "https://foodnih.com/v1/admin/product-types/7";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZXhwIjoxNjcxNTI2NDkzLCJoYXNfcm9sZSI6InN1cGVyYWRtaW4ifQ.5_AkK-lYVNyNJGC2e6mm-KShr9wiGnE7iBmGM29KBig";
    }

    public void productTypeAdmin() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url);
    }
    public void productTypeAdminById() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void statusSucces() {
        then().statusCode(200);
    }
}

