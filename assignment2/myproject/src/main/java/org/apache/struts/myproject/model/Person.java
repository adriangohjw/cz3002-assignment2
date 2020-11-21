package org.apache.struts.myproject.model;

public class Person {
    
    private String name;
    private String password;
    
    public Person() {
    }
    
    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Name: " + this.getName() + " Password:  " + this.getPassword();
    }

}
