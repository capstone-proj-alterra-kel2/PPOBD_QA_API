package Starter.Project.Users;

import static net.serenitybdd.rest.SerenityRest.*;

public class CategoryUser {

    public String url,url1, token;

    public void setUrlToCategoryUser() {
        url = "https://foodnih.com/v1/users/category?category=";
        url1="";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjYwLCJleHAiOjE2NzE4MTMwMTQsImhhc19yb2xlIjoidXNlciJ9.fMScXFlR4Ytlx3A9vl5M8KWNhad5FEyfm67aqrznDoc";
    }

    public void categoryproduct() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url);
    }
    public void categoryproductbyid() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void categoryproductnotoken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url);
    }
    public void statusSucces() {
        then().statusCode(200);
    }
    public void statusfailed() {
        then().statusCode(400);
    }

}

