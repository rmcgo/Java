package main.rmcgo.hibernate.entity;

import java.sql.Blob;
import java.util.Date;

/**
 * rmcgo 2021/9/5
 */
public class News {
	private Integer id;
	private String title;
	private String author;

	private Date date;

	private String content;

	private Blob image;

	public News() {}

	public News(String title, String author, Date date) {
		this.title = title;
		this.author = author;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "News{" +
				"id=" + id +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", date=" + date +
				'}';
	}
}
