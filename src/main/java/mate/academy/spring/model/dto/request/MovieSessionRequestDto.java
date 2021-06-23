package mate.academy.spring.model.dto.request;

public class MovieSessionRequestDto {
    private Long movieId;
    private String showTime;
    private Long cinemaHallId;

    public Long getMovieId() {
        return movieId;
    }

    public String getShowTime() {
        return showTime;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public void setCinemaHallId(Long cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }
}
