public class Car implements Walk{
    public static void main(String[] args) {
        //Напишемо інтерфейси «літати», «пересуватися» та «їсти». Додайте їх класам собаки, качки,
        // автомобіля та літака. Керуючись фантазією та здоровим глуздом. Іноді останній програмісту
        // знадобиться.
        Car car = new Car();
        car.canWalk();

    }

    @Override
    public void canWalk() {
        System.out.println("Едь, машина!");
    }
}
