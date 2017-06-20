package Handson.MovieFlix_EntityController;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
@NamedQueries({
	@NamedQuery(name = "Media.findAll", query = "SELECT m from Media m "),
	@NamedQuery(name="Media.findOne",query="select m from Media m where m.title=:ptitle")
})
public class Media {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mediaId;
	@Column(unique=true)
	private String title;
	private String rated;	
	private String runtime;
	private String released;
	private String genre;
	private int year;
	private String director;
	private String writer;
	private String actors;
	private String plot;
	private String language;
	private String country;
	private String awards;
	private String poster;
	private int metaScore;
	private double imdbRating;
	private int imdbVotesint ;
	private int imdbId;
	private double avgRating;

	public int getMediaId() {
		return mediaId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getMetaScore() {
		return metaScore;
	}
	public void setMetaScore(int metaScore) {
		this.metaScore = metaScore;
	}
	public double getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}
	public int getImdbVotesint() {
		return imdbVotesint;
	}
	public void setImdbVotesint(int imdbVotesint) {
		this.imdbVotesint = imdbVotesint;
	}
	public int getImdbId() {
		return imdbId;
	}
	public void setImdbId(int imdbId) {
		this.imdbId = imdbId;
	}
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	@Override
	public String toString() {
		return "MediaController [mediaId=" + mediaId + ", title=" + title + ", rated=" + rated + ", runtime=" + runtime
				+ ", released=" + released + ", genre=" + genre + ", year=" + year + ", director=" + director
				+ ", writer=" + writer + ", actors=" + actors + ", plot=" + plot + ", language=" + language
				+ ", country=" + country + ", awards=" + awards + ", poster=" + poster + ", metaScore=" + metaScore
				+ ", imdbRating=" + imdbRating + ", imdbVotesint=" + imdbVotesint + ", imdbId=" + imdbId
				+ ", avgRating=" + avgRating + "]";
	}
	
	
	
	
}
