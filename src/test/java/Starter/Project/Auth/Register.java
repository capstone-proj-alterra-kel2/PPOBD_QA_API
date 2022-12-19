package Starter.Project.Auth;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class Register {
    private String url;
    public void setUrlToRegister() {
        url = "http://108.136.220.111/v1/auth/register";
    }
    public JSONObject dataRegister() {
        JSONObject body = new JSONObject();
        body.put("name", "maulana sigit nurrohman ");
        body.put("phone_number", "088803707421");
        body.put("email", "maulanasigitnurrohman@gmail.com");
        body.put("password", "maulanasigit");
        return body;
    }
    public void validregister() {
        given().header("accept","application/json")
                .header("Content-Type","application/json")
                .body(dataRegister().toJSONString());
        when().post(url);
    }
    public JSONObject datanophone() {
        JSONObject body = new JSONObject();
        body.put("name", "Maulana");
        body.put("email", "Maulana7@gmail.com");
        body.put("password", "Maulana");
        return body;
    }
    public void invaliddatanophone() {
        given().header("accept","application/json")
                .header("Content-Type","application/json")
                .body(datanophone().toJSONString());
        when().post(url);
    }

    public JSONObject datanoemail() {
        JSONObject body = new JSONObject();
        body.put("name", "Maulana");
        body.put("phone_number", "085756123456");
        body.put("password", "Maulana");
        return body;
    }

    public void invaliddatanoemail() {
        given().header("accept","application/json")
                .header("Content-Type", "application/json")
                .body(datanoemail().toJSONString());
        when().post(url);
    }

    public JSONObject datanopassword() {
        JSONObject body = new JSONObject();
        body.put("name", "Maulana");
        body.put("phone_number", "085756123456");
        body.put("email", "Maulana7@gmail.com");
        return body;
    }

    public void invalidnopassword() {
        given().header("accept","application/json")
                .header("Content-Type","application/json")
                .body(datanopassword().toJSONString());
        when().post(url);
    }

    public JSONObject nodata() {
        JSONObject body = new JSONObject();
        body.put("", "");
        return body;
    }

    public void invaliddata() {
        given().header("accept","application/json")
                .header("Content-Type","application/json")
                .body(nodata().toJSONString());
        when().post(url);

    }
    public JSONObject datanoname() {
        JSONObject body = new JSONObject();
        body.put("phone_number", "081274985748");
        body.put("email", "gaming@gmail.com");
        body.put("password", "inipassword");
        return body;
    }

    public void invalidname() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(datanoname().toJSONString());
        when().post(url);
    }

    public JSONObject registeraccount() {
        JSONObject body = new JSONObject();
        body.put("name", "maulana");
        body.put("phone_number", "081234985748");
        body.put("email", "gaming@gmail.com");
        body.put("password", "inipassword");
        return body;
    }

    public void invalidregisteraccount() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(registeraccount().toJSONString());
        when().post(url);
    }
    public void statusCode201() {
        then().statusCode(201);
    }

    public void validateErorMessage400() {
        then().statusCode(400);
    }
}


