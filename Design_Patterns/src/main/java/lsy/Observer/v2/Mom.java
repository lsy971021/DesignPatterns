package lsy.Observer.v2;

public class Mom implements Observer {
    public void feed(){
        System.out.println("mom feed to baby");
    }
    @Override
    public void action(EventSource source) {
        feed();
        IsCry.cry=false;
    }
}
