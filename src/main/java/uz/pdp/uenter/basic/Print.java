package uz.pdp.uenter.basic;

public class Print <T>{
    T things;

    public Print(T things) {
        this.things = things;
    }
    public void printWithSemicolon(){
        System.out.println(things+";");
    }
}
