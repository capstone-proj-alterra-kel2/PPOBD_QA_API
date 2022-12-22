package Starter.Project.Admin;

import static net.serenitybdd.rest.SerenityRest.*;

public class CategoryAdmin {

    public String url,url1,token;

    public void setUrlToCategoryAdmin(){
        url="https://foodnih.com/v1/admin/category";
        url1="https://foodnih.com/v1/admin/category/6";
        token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZXhwIjoxNjcxODEyMjUzLCJoYXNfcm9sZSI6InN1cGVyYWRtaW4ifQ.894JNT34t6DUjOIQjuaN3QHCtAqo6qiMsHClroIJWhk";
    }
    public void categoryAdmin() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url);
    }
    public void CategoryAdminById() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void categoryAdminnotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public void CategoryAdminByIdnotoken() {
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
