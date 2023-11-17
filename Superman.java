public class Superman implements CanRun, CanFly, CanSwim{
    public static void main(String[] args) {
//        Здорово бути Суперменом! Він літає стрімко, як блискавка, бігає швидше за вітер, пливе, як Плотва.
//        Напишіть заготівлю для супергероя, який літатиме, плаватиме і бігтиме.
//        Робити це необхідно за допомогою реалізації інтерфейсів CanFly, CanRun, CanSwim.
//        Імплементуйте ці інтерфейси у класі СуперМен

        Superman superman = new Superman();
        superman.swim();

    }
    @Override
    public void run() {
        System.out.println("Беги, Супермен, беги!");
    }
    @Override
    public void fly() {
        System.out.println("Лети, Супермен, Лети!");
    }

    @Override
    public void swim() {
        System.out.println("Плыви, Супермен, Плыви!");
    }

}

