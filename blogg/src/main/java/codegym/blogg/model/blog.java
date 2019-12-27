package codegym.blogg.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name = "blog")
public class blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    private Date createDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public blog() {
    }

    public blog(String title, String content, Date createDate, Category category) {
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public static void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
