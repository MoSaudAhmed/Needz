package com.need.needz.services.requests;

import com.google.gson.annotations.SerializedName;

public class LoginRequest {

    @SerializedName("mobile")
    String mobile;

    @SerializedName("password")
    String password;

    @SerializedName("device_id")
    String device_id;

    @SerializedName("device")
    String device;

    public LoginRequest(String mobile, String password, String device_id, String device) {
        this.mobile = mobile;
        this.device = device;
        this.device_id = device_id;
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public String getDevice_id() {
        return device_id;
    }

    public String getDevice() {
        return device;
    }
}
