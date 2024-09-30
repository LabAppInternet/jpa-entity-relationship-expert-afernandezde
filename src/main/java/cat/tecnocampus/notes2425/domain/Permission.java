package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {
    @EmbeddedId
    private PermissionId permissionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "note_id")
    private UserLab owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "note_id")
    private Note note;

    private boolean canRead;
    private boolean canEdit;
    public Permission () {}

    public Permission (UserLab owner, Note note, boolean canRead, boolean canEdit){
        this.owner = owner;
        this.note = note;
        this.canRead = canRead;
        this.canEdit = canEdit;
    }

    public PermissionId permissionID() {
        return permissionId;
    }

    public UserLab owner() {
        return owner;
    }

    public Note note() {
        return note;
    }

    public boolean canRead() {
        return canRead;
    }

    public boolean canEdit() {
        return canEdit;
    }

    public void setPermissionID(PermissionId permissionID) {
        this.permissionId = permissionID;
    }

    public void setOwner(UserLab owner) {
        this.owner = owner;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public void setCanRead(boolean canRead) {
        this.canRead = canRead;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
