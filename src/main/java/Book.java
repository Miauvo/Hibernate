import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "USER_DETAILS")
public class Book {

    @Id
 //   @Column(name = "ID")
    private int id;
    @Column
    private String name;

    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}

