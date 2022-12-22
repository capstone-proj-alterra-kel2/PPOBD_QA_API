package Starter.Project.Admin;

import static net.serenitybdd.rest.SerenityRest.*;

public class ProductAdmin {
    public String url, url1, token;

    public void setUrlToProductAdmin() {
        url = "https://foodnih.com/v1/admin/products?size=10&page=0&sort=id";
        url1 = "https://foodnih.com/v1/admin/products/2";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZXhwIjoxNjcxODEyMjUzLCJoYXNfcm9sZSI6InN1cGVyYWRtaW4ifQ.894JNT34t6DUjOIQjuaN3QHCtAqo6qiMsHClroIJWhk";
    }
    public void productAdmin() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url);
    }
    public void productAdminById() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void productAdminnotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public void productAdminByIdnotoken() {
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
