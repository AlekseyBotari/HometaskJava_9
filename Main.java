public class Main {


    public static class Book implements Printable {
        String name;
        public Book(String name){
            this.name = name;
        }
        @Override
        public void print() {
        }

        public static void printBooks(Printable[] printable){
            for (int i = 0; i < printable.length; i++) {
                if (printable[i] instanceof Book){
                    System.out.println(((Book) printable[i]).name);
                }
            }
        }
    }

    public static class Magazine implements Printable {
        String name;
        public Magazine(String name){
            this.name = name;
        }
        @Override
        public void print() {
        }

       public static void printMagazines(Printable[] printable){
           for (int i = 0; i < printable.length; i++) {
               if (printable[i] instanceof Magazine){
                   System.out.println(((Magazine) printable[i]).name);
               }
           }
       }

    }
    public static void main(String[] args) {
//        Визначити інтерфейс Printable, який містить метод void print(). Визначити клас Book, який реалізує
//        інтерфейс Printable. Визначити клас Magazine, який реалізує інтерфейс Printable. Створити масив типу
//        Printable, який міститиме книги та журнали. У циклі пройти масивом і викликати метод print() кожного
//        об'єкта. Створити статичний метод printMagazines(Printable[] pri ntable) у класі Magazine, який
//        виводить на консоль назви лише журналів.
//        Створити статичний метод printBooks(Printable[] printable) у класі Book, який виводить на консоль
//        назви лише книг. Використовуємо оператор instanceof.


        Printable[] books = new Printable[7];

        books[0] = new Book("1");
        books[1] = new Book("2");
        books[2] = new Book("3");
        books[3] = new Magazine("4");
        books[5] = new Magazine("5");
        books[6] = new Magazine("6");

        Magazine.printMagazines(books);
        Book.printBooks(books);

    }
}
