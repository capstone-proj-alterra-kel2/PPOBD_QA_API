package Starter.Project.Users;

import static net.serenitybdd.rest.SerenityRest.*;

public class CategoryUser {

    public String url,url1, token;

    public void setUrlToCategoryUser() {
        url = "https://foodnih.com/v1/users/category?category=";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjYwLCJleHAiOjE2NzE1MjUzNTEsImhhc19yb2xlIjoidXNlciJ9.G_W5lsh94hA7sc3_H_Sd0bTv1jfjwiPPGOZga0iIWJM";
    }

    public void categoryproduct() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url);
    }

    public void statusSucces() {
        then().statusCode(200);
    }
}

