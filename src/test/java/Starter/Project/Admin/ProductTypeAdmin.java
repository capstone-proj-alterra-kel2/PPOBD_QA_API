package Starter.Project.Admin;

import static net.serenitybdd.rest.SerenityRest.*;

public class ProductTypeAdmin {
    public String url, url1, token;
    public void setUrlToProductAdmin() {
        url = "https://foodnih.com/v1/admin/product-types";
        url1 = "https://foodnih.com/v1/admin/product-types/7";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZXhwIjoxNjcxODEyMjUzLCJoYXNfcm9sZSI6InN1cGVyYWRtaW4ifQ.894JNT34t6DUjOIQjuaN3QHCtAqo6qiMsHClroIJWhk";
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

    public void productTypeAdminnotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public void productTypeAdminByIdnotoken() {
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
}

