import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ex0(getList());
        ex1(getList());
    }

    public static List getList() {
        List<Integer> list = new ArrayList<>(39);
        Random random = new Random();
        for (int i = 0; i < 39; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static void ex0(List list1) {
        List<Integer> list = list1;
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    public static void ex1(List list1) {
//        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
        List<Integer> list = list1;
        System.out.println(list);
        System.out.println("Мксимальное число в списке = " + Collections.max(list));
        System.out.println("Минимальное число в списке = " + Collections.min(list));
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double sqrt = sum / list.size();
        System.out.println("Среднее арифметическое = " + sqrt);
    }
}