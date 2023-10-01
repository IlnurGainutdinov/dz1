import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        /*Домашнее задание на закрепление:

        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        2)Создать класс Категория, имеющий переменные имя и массив товаров.
         Создать несколько объектов класса Категория.
        3)Создать класс Basket, содержащий массив купленных товаров.
        4)Создать класс User, содержащий логин, пароль и объект класса Basket.
         Создать несколько объектов класса User.
        5)Вывести на консоль каталог продуктов. (все продукты магазина)
        6)Вывести на консоль покупки посетителей магазина. (После покупки у
         пользователя добавляется товар, а из магазина - удаляется)

        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

        Формат сдачи:
        Ссылка на гитхаб проект
        Подписать фамилию и номер группы*/
        Product product1 = new Product("Печенье", 49.5, 4.0);
        Product product2 = new Product("Яйца", 60.0, 4.0);
        Product product3 = new Product("Хлеб", 49.5,4.7);
        Product product4 = new Product("Бананы", 99.99, 4.8);
        Category category1 = new Category("Фрукты", new Product[]{product4});
        Category category2 = new Category("Остальное", new Product[]{product3, product1, product2});
        Basket basket1 = new Basket(new Product[]{product1,product3});
        Basket basket2 = new Basket(new Product[]{product2});
        User user1 = new User("Иван", "a", basket1);
        User user2 = new User("Петр", "б", basket2);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        System.out.println("Все продукты магазина: ");
        for (Product product: products){
            System.out.println(product.getName());

        }

        System.out.println();
        System.out.println("Содержание корзины User1:");

        for(Product product: user1.getBasket().getBoughtProduct()) {
            System.out.println(product.getName());
            products.remove(product);
        }
        System.out.println();
        System.out.println("Содержание корзины User2:");
        for(Product product: user2.getBasket().getBoughtProduct()) {
            System.out.println(product.getName());
            products.remove(product);
        }
        System.out.println();
        System.out.println("Остаток в магазине: ");
        for (Product product: products) {
            System.out.println(product.getName());
        }





    }

}