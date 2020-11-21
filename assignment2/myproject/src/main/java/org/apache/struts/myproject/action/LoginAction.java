package org.apache.struts.myproject.action;

import org.apache.struts.myproject.model.Person;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Acts as a controller to handle actions
*/

public class LoginAction extends ActionSupport {

    private Person person = new Person();

    public String index() {        
        return SUCCESS;
    }

    public String login() throws Exception {
        // do something to authenticate with database
        return SUCCESS;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
