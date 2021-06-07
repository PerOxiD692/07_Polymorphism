public class App {
    public static void main(String[] args) {

       HoneyBee honeyBee = new HoneyBee(); 
       HoneyBee queen = new Queen();
       HoneyBee worker = new Worker();
       HoneyBee drone = new Drone();
    //    Queen queen = new Queen();
    //    Worker worker = new Worker();
    //    Drone drone = new Drone();

        ausgabe(honeyBee.doYourJob());
        ausgabe(queen.doYourJob());
        ausgabe(worker.doYourJob());
        ausgabe(drone.doYourJob());
        ausgabe("----------------------------");

        ausgabe(queen.fly());
        ausgabe(worker.fly());
        ausgabe(drone.fly());


    } //end main

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    } //end ausgabe()




} //end Class
