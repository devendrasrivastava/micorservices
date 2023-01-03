package in.stackroute.userprofile.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserCredentials {

    private Logger logger=LoggerFactory.getLogger(UserCredentials.class);
    private String email;
    private String password;

    public UserCredentials() {
    }

    public UserCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        logger.info("getEmail function called....devendra");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        logger.info("setEmail function called....devendra");
    }

    public String getPassword() {
        logger.info("getPassword function called....devendra");
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        logger.info("setPassword function called....devendra");
    }
}
