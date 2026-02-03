public class Movie{
    int id;
    String title;
    double duration;
<<<<<<< HEAD
    String releaseDate;
    double price;
    



    public Movie(int id, String title, double duration, String releaseDate){
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }
=======
    String showTime;
    String showDate;
   

    public Movie(int id, String title, double duration, String showTime, String showDate){
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.showTime = showTime;
        this.showDate = showDate;
    }

>>>>>>> c8481b24a95cd1b63063aebcd42e689b8545b924
    
}