/*
Problem: Create an interface Playable with a method play().
Implement this interface in two classes Guitar and Piano, and
write a test program to demonstrate interface implementation.
 */
interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements Playable{
    public void play(){
        System.out.println("Playing piano");
    }
}
class Oops8{
    public static void main(String[] args) {
        Playable p1=new Guitar();
        p1.play();
        Playable p2=new Piano();
        p2.play();
    }
}