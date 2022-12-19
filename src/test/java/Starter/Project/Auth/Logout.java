package Starter.Project.Auth;

import static net.serenitybdd.rest.SerenityRest.*;
public class Logout {

    private String url,token,token1;
    public void SetUrlLogout(){
        url = "http://108.136.220.111/v1/auth/logout";
        token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjI0LCJleHAiOjE2NzE0NzE2MTEsImhhc19yb2xlIjoidXNlciJ9.MVjdhL7C3DcIhzWesrATC19xOTtAtyOPtxc4erbyfn8";
        token1 ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZXhwIjoxNjcxMTE0NDQ2LCJoYXNfcm9sZSI6InN1cGVyYWRtaW4ifQ.WBd8yTtaCeeeHiuILPncZOCNlx_ybLwfDTFxl_1sJpA";
    }
    public void setToken(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
       when().post(url);
    }

    public void InvalidToken(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer "+ token1);
        when().post(url);

    }
    public void noToken() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + "");
        when().post(url);
    }

    public void statusSucces() {
        then().statusCode(200);
    }
    public void invalidtoken() {
        then().statusCode(401);
    }
    public void notoken(){
        then().statusCode(400);
    }
}
