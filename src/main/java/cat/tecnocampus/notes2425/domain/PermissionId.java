package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
@Table(name = "permissions")
public class PermissionId implements Serializable {
    private UserLab owner;
    private Note note;

    public PermissionId() {}

    public PermissionId(UserLab owner, Note note) {
        this.owner = owner;
        this.note = note;
    }

    public UserLab owner() {
        return owner;
    }

    public Note note() {
        return note;
    }

    public void setOwner(UserLab owner) {
        this.owner = owner;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
