public class Drink1 implements Drink6{
    //Перевіряємо чи є наш напій алкогольним. Створимо інтерфейс Drink з єдиним методом
    // isAlcoholic.
    // Реалізуємо його у двох класах Beer та Cola. У методі main для перевірки створимо два
    // об’єкти цього класу і викличемо відповідний метод.

    static class Beer {
        public void getBeer() {
            Drink1 drink1 = new Drink1();
            drink1.isAlcoholic();
        }
    }
    static class Cola {
        public void getCola() {
            Drink1 drink1 = new Drink1();
            drink1.isAlcoholic();
        }
    }

    public static void main(String[] args) {
        Beer beer = new Beer();
        beer.getBeer();
        Cola cola = new Cola();
        cola.getCola();
    }
    @Override
    public void isAlcoholic() {
        System.out.println("Беги, Супермен23333333333333, беги!");
    }
}

