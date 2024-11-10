class Human{
    void talk(){
        System.out.println("I am a human being.");
    }
}

class Female extends Human{
    @Override
    void talk(){
        System.out.println("I am a female.");
    }
}

class Male extends Human{
    @Override
    void talk(){
        System.out.println("I am a male.");
    }
}

public class lab4b{
    public static void main(String[] args) {
        Human human = new Human();
        Female female = new Female();
        Male male = new Male();

        human.talk();
        female.talk();
        male.talk();
    }
}