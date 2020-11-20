package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

    public Person person = new Person("Adrian", "P@sSw0Rd");

    public String index() {        
        return SUCCESS;
    }

    public String login() {
        // do something to authenticate with database
        return SUCCESS;
    }

    public String loginSuccess() {
        return SUCCESS;
    }
}
