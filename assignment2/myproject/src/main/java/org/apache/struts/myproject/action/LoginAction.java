package org.apache.struts.myproject.action;

import org.apache.struts.myproject.model.Person;

import com.opensymphony.xwork2.ActionSupport;

// package for connecting to database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Acts as a controller to handle actions
*/
public class LoginAction extends ActionSupport {

    private Person person = new Person();
    private String password;

    public String index() {        
        return SUCCESS;
    }

    public String login() throws Exception {
        // do something to authenticate with database
        String ret = ERROR;
        Connection conn = null;

        try {
            // set up DB connection
            String URL = "jdbc:mysql://localhost:3306/cz3002?useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "password");

            // execute query
            String sql = String.format("SELECT password FROM cz3002.person WHERE name = '%s'", this.person.getName());
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // check if password is correct
            rs.next();
            this.password = rs.getString(1);
            if (this.password.equals(this.person.getPassword())) {
                ret = SUCCESS;
            } 

        } catch (Exception e) {
            System.out.println(e);
            ret = ERROR;
            
        } finally {
            if (conn != null) {
               try {
                  conn.close();
               } catch (Exception e) {
               }
            }
        }

        return ret;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
