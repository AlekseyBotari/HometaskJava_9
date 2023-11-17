public class Converter implements Convert {
    //Напишіть клас Converter для конвертації з градусів за Цельсієм в Кельвіни ,
    // Фаренгейти тощо. У класу має бути метод convert , який робить конвертацію.
    public static void main(String[] args) {
        Converter convert = new Converter();

        System.out.println("Фаренгейт " + convert.convert(56));
        System.out.println("Кельвин " + convert.kelvin(56));

    }
}

