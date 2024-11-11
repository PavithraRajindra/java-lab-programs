class Stock{
    private int stock = 0;
    private boolean available = false;

    public synchronized void addStock(int quantity){
        while(available){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        stock+=quantity;
        System.out.println("\nProducer added: "+quantity+" stock\nTotal stock: "+stock);
        available=true;
        notify();
    }

    public synchronized void getStock(int quantity){
        while(!available){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        if(stock>=quantity){
            stock-=quantity;
            System.out.println("\nConsumer consumed: "+quantity+" stock\nRemaining stock: "+stock);
        }else{
            System.out.println("\nNot enough stock. Consumer requested: "+quantity+" stock\nAvailable: "+stock+" stock");
        }
        available=false;
        notify();
    }
}

class Producer extends Thread{
    private Stock stock;

    public Producer(Stock stock){
        this.stock=stock;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            stock.addStock((int)(Math.random()*50+1));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread{
    private Stock stock;

    public Consumer(Stock stock){
        this.stock=stock;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            stock.getStock((int)(Math.random()*50+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class lab12b{
    public static void main(String[] args){
        Stock stock = new Stock();

        Producer producer = new Producer(stock);
        Consumer consumer = new Consumer(stock);

        producer.start();
        consumer.start();
    }
}