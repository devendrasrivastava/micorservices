package in.stackroute.userprofile.model;


import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Entity
@Table(name = "REGD_USERS")
public class User {

//    private Logger logger=LoggerFactory.getLogger(User.class);
    //pojo class logger me problem
    //what is trace logger
    //how to add logging in interface

    
    @Id //primary key
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment value
    private int userId;
    @Column(name="user_name")
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(int userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
