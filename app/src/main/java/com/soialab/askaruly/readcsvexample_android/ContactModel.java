package com.soialab.askaruly.readcsvexample_android;

/**
 * Created by iptea on 5/21/2018.
 */

public class ContactModel {
    private String Name;
    private String Mobile;
    private String Email_TO;
    private String Email_CC;
    private String Email_BCC;
    private String Status;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail_TO() {
        return Email_TO;
    }

    public void setEmail_TO(String email_TO) {
        Email_TO = email_TO;
    }

    public String getEmail_CC() {
        return Email_CC;
    }

    public void setEmail_CC(String email_CC) {
        Email_CC = email_CC;
    }

    public String getEmail_BCC() {
        return Email_BCC;
    }

    public void setEmail_BCC(String email_BCC) {
        Email_BCC = email_BCC;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
