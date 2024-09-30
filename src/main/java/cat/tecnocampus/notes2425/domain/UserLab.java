package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class UserLab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String email;

    public UserLab() {}

    public UserLab(long id, String username, String email){
        this.id = id;
        this.username = username;
        this.email = email;
    }


    public long id() {
        return id;
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
