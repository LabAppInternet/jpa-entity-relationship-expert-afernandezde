package cat.tecnocampus.notes2425.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Note{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String title;
        private String content;
        private LocalDateTime creationDate = LocalDateTime.now();
        @ManyToOne
        @JoinColumn(name = "owner_id")
        private UserLab owner;
        @ManyToMany(cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
        })
        @JoinTable(name = "note_tag",
                joinColumns = @JoinColumn(name = "note_id"),
                inverseJoinColumns = @JoinColumn(name = "tag_id")
        )
        Set<Tag> tags = new HashSet<>();

        public Note() {}

        public Note(long id, String title, String content, LocalDateTime creationDate, Set<Tag> tags, UserLab owner){
                this.id = id;
                this.title = title;
                this.content = content;
                this.creationDate = creationDate;
                this.tags = tags;
                this.owner = owner;
        }

        public Long id() {
                return id;
        }

        public String title() {
                return title;
        }

        public String content() {
                return content;
        }

        public LocalDateTime creationDate() {
                return creationDate;
        }

        public Set<Tag> tags() {
                return tags;
        }

        public UserLab owner() {
                return owner;
        }

        public void setOwner(UserLab owner) {
                this.owner = owner;
        }

        public void setTags(Set<Tag> tags) {
                this.tags = tags;
        }

        public void setCreationDate(LocalDateTime creationDate) {
                this.creationDate = creationDate;
        }

        public void setContent(String content) {
                this.content = content;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public void setId(Long id) {
                this.id = id;
        }
}
