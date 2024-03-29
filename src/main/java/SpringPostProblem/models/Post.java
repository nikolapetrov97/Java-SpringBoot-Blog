package SpringPostProblem.models;

import java.util.Date;

public class Post {

private Long id;
private String title;
private String body;
private Userpost author;
private Date date = new Date();

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getBody() {
    return body;
}

public void setBody(String body) {
    this.body = body;
}

public Userpost getAuthor() {
    return author;
}

public void setAuthor(Userpost author) {
    this.author = author;
}

public Date getDate() {
    return date;
}

public void setDate(Date date) {
    this.date = date;
}

public Post() {}

public Post(Long id, String title, String body, Userpost author) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.author = author;
}

@Override
public String toString() {			
    return "Post{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", body='" + body + '\'' +
            ", author=" + author +
            ", date=" + date +
            '}';
	}
}

