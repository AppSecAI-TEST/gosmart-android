
package com.atc.gosmartlesmagistra.model.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginRequest implements Serializable
{

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("firebase_token")
    @Expose
    private String firebaseToken;
    private final static long serialVersionUID = -7839439601965759000L;

    /**
     * No args constructor for use in serialization
     *
     */
    public LoginRequest() {
    }

    /**
     *
     * @param firebaseToken
     * @param email
     * @param password
     */
    public LoginRequest(String email, String password, String firebaseToken) {
        super();
        this.email = email;
        this.password = password;
        this.firebaseToken = firebaseToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirebaseToken() {
        return firebaseToken;
    }

    public void setFirebaseToken(String firebaseToken) {
        this.firebaseToken = firebaseToken;
    }

}