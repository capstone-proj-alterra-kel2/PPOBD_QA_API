package Starter.Project.Auth;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class Login {
    private String url;
    public void setUrlToLogin() {
        url = "http://108.136.220.111/v1/auth/login";
    }

    public JSONObject bodyLogin(){
        JSONObject body = new JSONObject();
        body.put("email", "maulanasn7@gmail.com");
        body.put("password", "maulanasigit");
        return body;
    }
        public void validlogin(){
            given().header("accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(bodyLogin().toJSONString());
            when().post(url);
    }

    public JSONObject bodynopassword(){
        JSONObject body = new JSONObject();
        body.put("email","admin@gmail.com");
        return body;

    }
   public void nopassword(){
       given().header("accept", "application/json")
               .header("Content-Type", "application/json")
               .body(bodynopassword().toJSONString());
       when().post(url);
   }
    public JSONObject bodynoemail(){
        JSONObject body = new JSONObject();
        body.put("password","admin ");
        return body;

    }
    public void noemail(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(bodynoemail().toJSONString());
        when().post(url);
    }
    public JSONObject bodynodata(){
        JSONObject body = new JSONObject();
        body.put("email","");
        body.put("password"," ");
        return body;

    }
    public void nodata(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(bodynodata().toJSONString());
        when().post(url);
    }
    public JSONObject bodyemailandpasswordinvalid(){
        JSONObject body = new JSONObject();
        body.put("email","maulanadela@gmail.com");
        body.put("password","maulana");
        return body;

    }
    public void emailandpasswordinvalid(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(bodyemailandpasswordinvalid().toJSONString());
        when().post(url);
    }
    public JSONObject bodyInputEmailInvalidAndPasswordValid(){
        JSONObject body = new JSONObject();
        body.put("email","admin@gmail.com");
        body.put("password","maulana");
        return body;

    }
    public void EmailValidAndPasswordInvalid(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(bodyInputEmailInvalidAndPasswordValid().toJSONString());
        when().post(url);
    }
    public JSONObject bodyEmailInvalidAndPasswordValid(){
        JSONObject body = new JSONObject();
        body.put("email","dela@gmail.com");
        body.put("password","admin");
        return body;

    }
    public void EmailInvalidAndPasswordValid(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(bodyEmailInvalidAndPasswordValid().toJSONString());
        when().post(url);
    }
    public void statusCode200() {
        then().equals(200);
    }

    public void validateErorMessage400() {
        then().statusCode(400);
    }
        public void validateErorMessage401() {
            then().statusCode(401);
        }
    }

