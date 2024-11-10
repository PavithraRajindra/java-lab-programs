class Human{
    void talk(){
        System.out.println("I am a human being.");
    }

    void talk(String language){
        System.out.println("I am a human being who speaks "+language+".");
    }

    void talk(int age, String language){
        System.out.println("I am a human being who is "+age+" years old and speaks "+language+".");
    }
}

public class lab4c{
    public static void main(String[] args){
        Human h = new Human();
        h.talk();
        h.talk("English");
        h.talk(19, "Malayalam");
    }
}