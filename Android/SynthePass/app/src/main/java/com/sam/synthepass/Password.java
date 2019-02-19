package com.sam.synthepass;

public class Password {

    private String app;
    private String password;

    public Password(){
        app = null;
        password = null;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
