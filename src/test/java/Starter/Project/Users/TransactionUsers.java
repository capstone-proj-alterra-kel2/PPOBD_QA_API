package Starter.Project.Users;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class TransactionUsers {
    public String url,url1,token;

    public void setUrlToTransaction(){

        url="https://foodnih.com/v1/users/transactions/create";
        url1="https://foodnih.com/v1/users/transactions/history";
        token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjYwLCJleHAiOjE2NzE1MjUzNTEsImhhc19yb2xlIjoidXNlciJ9.G_W5lsh94hA7sc3_H_Sd0bTv1jfjwiPPGOZga0iIWJM";
    }

    public JSONObject Transaction(){
        JSONObject body = new JSONObject();
        body.put("product_id",191);
        body.put("target_phone_number","088803707421");
        return body;
    }

    public void validTransaction() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(Transaction().toJSONString());
        when().post(url);
    }
    public JSONObject emptyTransaction(){
        JSONObject body = new JSONObject();
        body.put("product_id",6);
        body.put("target_phone_number","088803708124");
        return body;
    }
    public void Transactionhistory() {
        given().header("accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token);
        when().get(url1);
    }
    public void statusSucces() {
        then().statusCode(200);
    }

    }


