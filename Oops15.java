/*
Design a class Movie that has attributes name, director, and rating.
Add methods to set and get these attributes and display movie details.
 */
class Movie{
    private String name;
    private String director;
    private double rating;
    public Movie(String name,String director,double rating){
            this.director=director;
            this.name=name;
            setRating(rating);
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public void setRating(double rating){
        if(rating>0 && rating<=10){
            this.rating=rating;
        }
        else{
            System.out.println("Give correct rating");
        }
    }
    public String getName(){
        return this.name;
    }
    public String getDirector(){
        return this.director;
    }
    public double getRating(){
        return this.rating;
    }
    public void displayDetails(){
        System.out.println("Movie Name : "+this.name+"\nDirector : "+this.director+"\nRating : "+this.rating+"/10\n");
    }
}
class Oops15{
    public static void main(String[] args) {
        Movie m1=new Movie("puspha","Sukumar",8.7);
        m1.displayDetails();
        Movie m2=new Movie("salaar","prasanth neel",9.0);
        m2.displayDetails();
    }
}