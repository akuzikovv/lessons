package hw5;
import hw4.Main;

public class Task1 {
/*Quick Sort В начале выбирается “опорный” элемент массива.
Это может быть любое число, но от выбора этого элемента сильно зависит эффективность алгоритма.
Если нам известна медиана, то лучше выбирать элемент, который как можно ближе к медиане.
В нашей реализации алгоритма, мы будем брать самый левый элемент, который в результате займет свое место.
Элементы в массиве делятся на две части: слева те кто меньше опорного элемента, справа те кто больше.
Таким образом опорный элемент занимает свое место и больше никуда не двигается.
Для левого и правого массива действия повторяются рекурсивно.*/

    public static void main() {
        System.out.println("//////////////////////////////");
        Main.menu();
    }
}