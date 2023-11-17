public class Human implements CanRun, CanSwim {
    //Створюємо людину. Нагородимо її інтерфейсами “бігти” та “плавати”.
    // Реалізуємо ці інтерфейси (напишемо реалізацію їх методів) у цьому класі.


    public static void main(String[] args) {

        Human human = new Human();
        human.run();

    }

    @Override
    public void run() {

    }
    @Override
    public void swim() {

    }
}
