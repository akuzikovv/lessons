package Module1.Task1;

public class Rating {

    private int rating;

    public Rating(int rating){

        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }





    @Override
    public String toString() {
        return "Rating{" +
                "rating=" + rating +
                '}';
    }
}
