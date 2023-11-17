public class Airplane implements CanFly{
    public static void main(String[] args) {
        //Напишемо інтерфейси «літати», «пересуватися» та «їсти». Додайте їх класам собаки, качки,
        // автомобіля та літака. Керуючись фантазією та здоровим глуздом. Іноді останній програмісту
        // знадобиться.
        Airplane airplane = new Airplane();
        airplane.fly();

    }
    @Override
    public void fly() {
        System.out.println("Літаки літають");
    }
}
