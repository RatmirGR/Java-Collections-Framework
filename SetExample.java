package Collections;

import java.util.*;

/* пример использования класса HashSet*/
class ExHashSet{

    void method(){
        System.out.println("Использование класса HashSet");

        /* создание хеш-множества*/
        HashSet<String> hashSet = new HashSet<>();

        /* введение элементов в хеш-множество*/
        hashSet.add("Art");
        hashSet.add("Big");
        hashSet.add("Cat");
        hashSet.add("Dog");
        hashSet.add("Big"); // попытка повторного введение элемента

        /* вывод содержимого хеш-множества*/
        System.out.println("- содержимое хеш-множества hashSet: "+ hashSet);
    }
}

/*---------------------------------------------------------------------*/

/* пример использования класса LinkedHashSet*/
class ExLinkedHashSet{

    void method(){
        System.out.println("Использование класса LinkedHashSet");

        /* создание отсортированного хеш-множества*/
        LinkedHashSet<String> linkHashSet = new LinkedHashSet<>();

        /* введение элементов в хеш-множество*/
        linkHashSet.add("A");
        linkHashSet.add("B");
        linkHashSet.add("D");
        linkHashSet.add("C");
        linkHashSet.add("B"); // попытка повторного введение элемента

        /* вывод содержимого отсортированного хеш-множества*/
        System.out.println("- содержимое хеш-множества linkHashSet: "+ linkHashSet);
    }
}

/*---------------------------------------------------------------------*/

/*пример использования класса TreeSet*/
class ExTreeSet{

    void method(){
        System.out.println("Использование класса TreeSet");

        /* создание древовидного множества*/
        TreeSet<String> treeSet = new TreeSet<>();

        /* введение элементов в древовидное множество*/
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("B"); // попытка повторного введение элемента

        /* вывод содержимого древовидного множества*/
        System.out.println("- содержимое древовидного множества treeSet: "+ treeSet);

        /* получение диапазона значений с помощью метода subSet(), определенного в интерфейсе*/
        System.out.println(treeSet.subSet("B", "E"));
    }
}

/*---------------------------------------------------------------------*/

/* пример использования специального компаратора*/
/* компаратор для сравнения символьных строк в обратном порядке*/
class ExComparator1 implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        /* выполнить сравнение в естественном порядке*/
        // return o1.compareTo(o2);
        /* выполнить сравнение в обратном порядке*/
        return o2.compareTo(o1);
        /* переопределять метод equals не требуется*/
    }
}

class ExComparator{

    void method(){
        System.out.println("Использование специального компаратора");

        /* создание древовидного множества типа TreeSet*/
        TreeSet<String> treeSet = new TreeSet<>(new ExComparator1());

        /* введение элементов в древовидное множество*/
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("E");

        /* выведение элементов из древовидного множества*/
        for(String el : treeSet) System.out.print(el + " ");
        System.out.println();
    }
}

/*---------------------------------------------------------------------*/

/* переделанный вариант 2*/
/* пример использования лямбда-выражения для реализации компаратора типа Comparator<String>*/
class ExComparatorV2{

    void method(){

        System.out.println("Использование лямбда-выражения для реализации компаратора типа Comparator<String>");

        /* создание компаратора*/
        Comparator<String> comp = (a, b) -> a.compareTo(b);
        /* аналогичный вариант создание компаратора*/
        //Comparator<String> comp = String::compareTo;

        /* создание древовидного множества типа TreeSet*/
        /* передача компаратора с обратным упорядочением конструктору класса TreeSet через лямбда-выражение*/
        TreeSet<String> treeSet = new TreeSet<>(comp);

        /* введение элементов в древовидное множество*/
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("E");

        /* выведение элементов из древовидного множества*/
        System.out.println("- ");
        for(String el : treeSet) System.out.print(el + " ");
        System.out.println();
    }
}

/*---------------------------------------------------------------------*/

/* переделанный вариант 3*/
/* пример использования лямбда-выражения для создания компаратора с обратным упорядочением*/
class ExComparatorV3{

    void method(){
        System.out.println("Использование лямбда-выражения для создания компаратора с обратным упорядочением");

        /* создание древовидного множества типа TreeSet*/
        /* передача компаратора с обратным упорядочением древовидному множеству типа TreeSet*/
        TreeSet<String> treeSet = new TreeSet<>((a, b) -> b.compareTo(a));

        /* введение элементов в древовидное множество*/
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("E");

        /* выведение элементов из древовидного множества*/
        System.out.println("- ");
        for(String el : treeSet) System.out.print(el + " ");
        System.out.println();
    }
}

/*---------------------------------------------------------------------*/

/* сравнение HashSet, LinkedHashSet и TreeSet*/
class BlockHashAndLinkedAndTreeSet{
    void method(){
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        System.out.println("-------HashSet--------");
        testSet(hashSet);
        System.out.println("-----LinkedHashSet----");
        testSet(linkedHashSet);
        System.out.println("--------TreeSet-------");
        testSet(treeSet);

        System.out.println();
        testSet2(new HashSet<>(), new HashSet<>());
    }

    private void testSet(Set<String> set){
        set.add("Bob");
        set.add("Tim");
        set.add("Tom");
        set.add("Sam");
        set.add("Jack");
        set.add("Bob");

        System.out.println(set);

        for (String name : set){
            System.out.print(name);
            System.out.print(' ');
        }
        System.out.println();

        System.out.println("contains: " + set.contains("Tom"));
        System.out.println("contains: " + set.contains("Tem"));

        System.out.println("isEmpty: " + set.isEmpty());
    }

    private void testSet2(Set<Integer> set1, Set<Integer> set2){

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        Set<Integer> union = new HashSet<>(set1);

        System.out.println("объединение множеств");
        union.addAll(set2);
        System.out.println("union: " + union);

        System.out.println("пересечение множеств");
        Set<Integer> intersect = new HashSet<>(set1);

        intersect.retainAll(set2);
        System.out.println("intersect: " + intersect);

        System.out.println("разность множеств");
        Set<Integer> subtract = new HashSet<>(set1);

        subtract.removeAll(set2);
        System.out.println("subtract: " + subtract);
    }
}

/*---------------------------------------------------------------------*/

class Person{
    private final int id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /* метод equals() работает медленее и поэтому вызывается в случае когда два хеш-кода одинаковые,
     * для точного определения на равенство двух объектов*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    /* метод hashCode() преобразует данные произвольной длины в целое число фиксированной длины {object} => {int}*/
    /* хеш-функция или функция свертки*/
    /* работает быстро и поэтому вызывается, для проверки объекты, первым*/
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    /* правила -> контракт hashcode() equals()
     * - 1) у двух проверяемых объектов вызывается метод hashcode()
     *    - если хеш-коды разные, то и объекты точно разные
     * - 2) если хеш-коды одинаковые, то вызывается метод equals()
     * */
}

class HashCodeAndEquals{
    void method(){
        Person person1 = new Person(1, "Tom");
        Person person2 = new Person(1, "Tom");

        Map<Person, String> map = new HashMap<>();
        map.put(person1, "123");
        map.put(person2, "456");

        System.out.println(map);

        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);

        System.out.println(set);
    }
}


public class SetExample {
    public static void main(String[] args) {
        new ExHashSet().method(); System.out.println("---------------------");
        new ExLinkedHashSet().method(); System.out.println("---------------------");
        new ExTreeSet().method(); System.out.println("---------------------");
        new ExComparator().method(); System.out.println("---------------------");
        new ExComparatorV2().method(); System.out.println("---------------------");
        new ExComparatorV3().method(); System.out.println("---------------------");
        new BlockHashAndLinkedAndTreeSet().method(); System.out.println("---------------------");
        new HashCodeAndEquals().method(); System.out.println("---------------------");
    }
}
