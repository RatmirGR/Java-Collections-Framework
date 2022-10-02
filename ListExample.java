package Collections;

import java.util.*;

/* пример использования класса ArrayList*/
class ExArrayList1{

    void method(){
        System.out.println("Использование класса ArrayList*/");
        /* создание списочного массива*/
        ArrayList<String> list = new ArrayList<>();

        System.out.println("- начальный размер списочного массива: "+list.size());

        /* введение элементов в списочный массив*/
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(1, "A2");

        System.out.println("- размер списочного массива list после ввода элементов: "+ list.size());

        /* вывод списочного массива*/
        System.out.println("- содержимое списочного массива list: "+ list);

        /* удаление элементов из списочного массива*/
        list.remove("C");
        list.remove(1);

        System.out.println("- размер списочного массива list после удаления элементов: "+ list.size());

        /* вывод содержимого массива list*/
        System.out.println("- содержимое списочного массива: " + list);
    }
}

/*---------------------------------------------------------------------*/

/* пример преобразования списочного массива типа ArrayList в обычной массив*/
class ExArrayList2{

    void method(){
        System.out.println("Преобразование списочного массива типа ArrayList в обычной массив");

        /* создание списочного массива*/
        ArrayList<Integer> list = new ArrayList<>();

        /* введение элементов в списочный массив*/
        list.add(1);
        list.add(2);
        list.add(3);

        /* вывод содержимого списочного массива*/
        System.out.println("содержимое списочного массива: "+list);

        /* получение обычного массива*/
        Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);

        /* вывод содержимого получившегося массива*/
        System.out.print("содержимое массива: ");

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

/*---------------------------------------------------------------------*/

/* пример использования класса LinkedList*/
class ExLinkedList3{

    void method(){
        System.out.println("Использование класса LinkedList");

        /* создание связного списка*/
        LinkedList<String> linkLIst = new LinkedList<>();

        /* введение элементов в связный список*/
        linkLIst.add("B");
        linkLIst.add("C");
        linkLIst.add("D");
        linkLIst.add("E");
        linkLIst.addFirst("A");
        linkLIst.addLast("F");
        linkLIst.add(1, "A2");

        /* вывод содержимого связного списка*/
        System.out.println("- содержимое связного списка linkLIst: "+ linkLIst);

        /* удаление элементов из связного списка*/
        linkLIst.remove("C");
        linkLIst.remove(2);
        linkLIst.removeFirst();
        linkLIst.removeLast();

        /* вывод содержимого связного списка*/
        System.out.println("- содержимое связного списка linkLIst: "+ linkLIst);

        /* получение и присвоение значения*/
        String val = linkLIst.get(2);
        linkLIst.set(2, val+ " изменено");

        /* вывод содержимого связного списка*/
        System.out.println("- содержимое связного списка linkLIst: "+ linkLIst);
    }
}

/*---------------------------------------------------------------------*/

/* пример использования интерфейсов Iterator и ListIterator*/
class ExListIterator{

    void method(){
        System.out.println("Использование интерфейсов Iterator и ListIterator");

        /* создание списочного массива*/
        ArrayList<String> arrayList = new ArrayList<>();

        /* введение элементов в списочный массив*/
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        /* использование итератора для вывода содержимого списочного массива*/
        System.out.print("- исходное содержимое списочного массива arrayList: ");

        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) System.out.print(itr.next()+" ");
        System.out.println();

        /* видоизменение перебираемого объекта*/
        ListIterator<String> lItr = arrayList.listIterator();
        while (lItr.hasNext()) lItr.set(lItr.next()+"+");

        /* вывод измененного содержимого списочного массива*/
        System.out.print("- измененное содержимое списочного массива arrayList: ");
        itr = arrayList.iterator();
        while (itr.hasNext()) System.out.print(itr.next()+" ");
        System.out.println();

        /* отображение списка в обратном порядке*/
        System.out.print("- измененный в обратном порядке список arrayList: ");
        while (lItr.hasPrevious()) System.out.print(lItr.previous()+" ");
        System.out.println();
    }
}

/*---------------------------------------------------------------------*/

/* пример использования цикла for в стиле for each для перебора элементов коллекции*/
class ExArrayListForEach{

    void method(){
        System.out.println("Использование цикла for в стиле for each для перебора элементов коллекции");

        /* создание списочного массива*/
        ArrayList<Integer> arrayList = new ArrayList<>();

        /* введение элементов в списочный массив*/
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        /* организация цикла для вывода числовых значений*/
        System.out.print("- исходное содержимое списочного массива arrayList: ");
        for(int v : arrayList) System.out.print(v+" ");

        System.out.println();

        /* суммирование числовых значений в цикле for*/
        int sum = 1;
        for(int v : arrayList) sum *= v;

        System.out.println("- сумма числовых значений: "+sum);
    }
}

/*---------------------------------------------------------------------*/

/* пример использования интерфейса Spliterator*/
class ExSpliterator{

    void method(){
        System.out.println("Использование интерфейса Spliterator");

        /* создание списочного массива числовых значений типа double*/
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);

        /* вызов метода tryAdvance() для вывода содержимого списочного массива arrayList*/
        System.out.print("- вызов метода tryAdvance() для вывода содержимого списочного массива arrayList: ");
        Spliterator<Double> splitr = arrayList.spliterator();
        while (splitr.tryAdvance((n) -> System.out.print(n+" ")));

        System.out.println();

        /* создание нового списочного массива, содержащего квадратные корни числовых значений
         * из списочного массива arrayList*/
        splitr = arrayList.spliterator();
        ArrayList<Double> arrayList1 = new ArrayList<>();
        while (splitr.tryAdvance((n)->arrayList1.add(Math.sqrt(n))));

        /* вызов метода forEachRemaining() для вывода содержимого списочных массивов arrayList и arrayList1*/
        System.out.print("- вызов метод forEachRemaining() для вывода содержимого списочного массива arrayList: ");
        splitr = arrayList.spliterator();
        splitr.forEachRemaining((n)->System.out.print(n+" "));

        System.out.println();

        System.out.print("- вызов метода forEachRemaining() для вывода содержимого списочного массива arrayList1: ");
        splitr = arrayList1.spliterator();
        splitr.forEachRemaining((n)->System.out.print(n+" "));
        System.out.println();
    }
}

/*---------------------------------------------------------------------*/

/* создание класса, для использования его экземпляра в связном списке*/
class ExClass{
    private final String name;
    private final int age;
    private final char gend;
    ExClass(String n, int a, char g){
        name = n; age = a; gend = g;
    }

    public String toString(){
        return name+" - "+age+" - "+gend;
    }
}

class ExLinkedList{

    void method(){
        System.out.println("Создание класса, для использования его экземпляра в связном списке");

        /* создание связного списка*/
        LinkedList<ExClass> linkLIst = new LinkedList<>();

        /* введение элементов в связный список*/
        linkLIst.add(new ExClass("name1", 31, 'm'));
        linkLIst.add(new ExClass("name2", 32, 'w'));
        linkLIst.add(new ExClass("name3", 34, 'w'));
        linkLIst.add(new ExClass("name4", 35, 'm'));

        /* вывод содержимого связного списка*/
        for(ExClass mc : linkLIst) System.out.println("- "+mc);
    }
}

/*---------------------------------------------------------------------*/

/* пример использования некоторых алгоритмов коллекций*/
class SomeCollectionAlgorithms{

    void method(){
        System.out.println("Использование некоторых алгоритмов коллекций");

        /* создание неинициализированного связного списка*/
        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(-8);
        linkList.add(20);
        linkList.add(-20);
        linkList.add(8);

        System.out.print("- вывод списка в исходном порядке: ");
        for (int i : linkList) System.out.print(i+" ");

        System.out.println();

        /* создание компаратора с обратным упорядочением*/
        Comparator<Integer> comp = Collections.reverseOrder();

        /* отсортировка списка с помощью компаратора*/
        Collections.sort(linkList, comp);
        System.out.print("- список отсортирован в обратном порядке: ");
        for(int i : linkList) System.out.print(i + " ");

        System.out.println();

        /* перетасовка списка*/
        Collections.shuffle(linkList);
        System.out.print("- список перетасован: ");
        for(int i : linkList) System.out.print(i + " ");

        System.out.println();

        /* вывод минимального и максимального значения*/
        System.out.println("- вывод минимального и максимального значения:");
        System.out.println("- минимум: "+Collections.min(linkList));
        System.out.println("- максимум: "+Collections.max(linkList));
    }
}

/*---------------------------------------------------------------------*/

public class ListExample {
    public static void main(String[] args) {
        new ExArrayList1().method(); System.out.println("---------------------");
        new ExArrayList2().method(); System.out.println("---------------------");
        new ExLinkedList3().method(); System.out.println("---------------------");
        new ExListIterator().method(); System.out.println("---------------------");
        new ExArrayListForEach().method(); System.out.println("---------------------");
        new ExSpliterator().method(); System.out.println("---------------------");
        new ExLinkedList().method(); System.out.println("---------------------");
        new SomeCollectionAlgorithms().method(); System.out.println("---------------------");
    }
}
