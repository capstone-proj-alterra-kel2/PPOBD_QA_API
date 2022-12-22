package Starter.Project.Users;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;
public class Wallet {
    public String url,url1,url2,url3,token;

    public void setUrlToWallet(){
        url = "http://108.136.220.111/v1/user/wallet/topup-balance";
        url1= "http://108.136.220.111/v1/user/wallet";
        url2= "http://108.136.220.111/v1/user/wallet/histories";
        url3= "http://108.136.220.111/v1/user/wallet/cashin-cashout";
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjYwLCJleHAiOjE2NzE4MTMwMTQsImhhc19yb2xlIjoidXNlciJ9.fMScXFlR4Ytlx3A9vl5M8KWNhad5FEyfm67aqrznDoc";
    }
    public JSONObject topupbalance(){
        JSONObject body = new JSONObject();
        body.put("balance",10000000);
        return body;
    }
    public void Validtopupbalance(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(topupbalance().toJSONString());
        when().post(url);
    }

    public void infowallet(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void WalletHistory(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url2);
    }
    public void WalletCashinCashout(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url3);
    }

    public JSONObject topupbalancenotoken(){
        JSONObject body = new JSONObject();
        body.put("balance",10000000);
        return body;
    }
    public void Validtopupbalancenotoken(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(topupbalancenotoken().toJSONString());
        when().post(url);
    }

    public void infowalletnotoken(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url1);
    }
    public void WalletHistorynotoken(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url2);
    }
    public void WalletCashinCashoutnotoken(){
        given().header("accept", "application/json")
                .header("Content-Type", "application/json");
        when().get(url3);
    }
    public void statusSucces() {
        then().statusCode(200);
    }
    public void statusfailed() {
        then().statusCode(400);
    }
}
