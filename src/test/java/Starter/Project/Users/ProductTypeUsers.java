package Starter.Project.Users;

import static net.serenitybdd.rest.SerenityRest.*;

public class ProductTypeUsers {
    public String url,url1, token;

    public void setUrlToProductType() {
        url = "https://foodnih.com/v1/users/product-types";
        url1="https://foodnih.com/v1/users/product-types/6";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjYwLCJleHAiOjE2NzE1MjUzNTEsImhhc19yb2xlIjoidXNlciJ9.G_W5lsh94hA7sc3_H_Sd0bTv1jfjwiPPGOZga0iIWJM";
    }

    public void ProductType() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url);
    }
    public void ProductTypebyid() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void statusSucces() {
        then().statusCode(200);
    }
}
