package lsy.observer.v1;

public class Mom implements Observer {
    public void feed(){
        System.out.println("mom feed to baby");
    }
    @Override
    public void action(Baby baby) {
        feed();
        baby.cry=false;
    }
}
