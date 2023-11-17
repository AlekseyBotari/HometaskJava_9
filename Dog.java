public class Dog implements Eat{
    public static void main(String[] args) {
//        Напишемо інтерфейси «літати», «пересуватися» та «їсти».
//        Додайте їх класам собаки, качки, автомобіля та літака. Керуючись фантазією та здоровим глуздом.
//        Іноді останній програмісту знадобиться.
        Dog dog = new Dog();
        dog.canEat();

    }

    @Override
    public void canEat() {
        System.out.println("Ешь, собака, Ешь!");
    }
}
