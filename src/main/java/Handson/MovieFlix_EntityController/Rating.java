package Handson.MovieFlix_EntityController;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table
public class Rating {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int ratingId;
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public int getRatingId() {
	return ratingId;
}
private String comments;
private int rating;

@ManyToOne
private User user;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Media getMedia() {
	return media;
}
public void setMedia(Media media) {
	this.media = media;
}
@ManyToOne
private Media media;

public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "Rating [ratingId=" + ratingId + ", comments=" + comments + ", rating=" + rating + "]";
}

}
