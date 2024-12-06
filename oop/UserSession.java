package oop;

import java.util.Date;

public class UserSession {
    private User user;
    private Date start;
    private Date end;
    private String host;


    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        // Log out first before switching to a different user
        if (end != null)
            this.user = user;
    }


    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }


    public Date getEnd() {
        return end;
    }
    public void setEnd(Date end) {
        this.end = end;
    }

    
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }

    // GETTERS & SETTERS
    

}
