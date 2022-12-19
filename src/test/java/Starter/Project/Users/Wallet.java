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
        token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjYwLCJleHAiOjE2NzE1MjUzNTEsImhhc19yb2xlIjoidXNlciJ9.G_W5lsh94hA7sc3_H_Sd0bTv1jfjwiPPGOZga0iIWJM";
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
    public void statusSucces() {
        then().statusCode(200);
    }
}
