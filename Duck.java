public class Duck implements CanFly {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();

//        Напишемо інтерфейси «літати», «пересуватися» та «їсти».
//        Додайте їх класам собаки, качки, автомобіля та літака. Керуючись фантазією та здоровим глуздом.
//                Іноді останній програмісту знадобиться.

    }
    @Override
    public void fly() {
        System.out.println("Лети, Утка, Лети!");
    }
}
