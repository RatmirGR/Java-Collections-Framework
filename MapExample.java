package Collections;

import java.util.*;

/* пример использования класса HashMap*/
class ExHashMap{

    void method(){
        System.out.println("Использование класса HashMap");

        /* создание хеш-отображения*/
        HashMap<String, Double> hashMap = new HashMap<>();

        /* введение элементов в хеш-отображение*/
        hashMap.put("name1", new Double(34.0));
        hashMap.put("name2", new Double(11.0));
        hashMap.put("name3", new Double(25.0));
        hashMap.put("name4", new Double(-47.0));
        hashMap.put("name5", new Double(52.0));

        /* получение множество записей*/
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        /* вывод множество записей*/
        for(Map.Entry<String, Double> m : set){
            System.out.print("- "+m.getKey()+" : ");
            System.out.println(m.getValue());
        }
        System.out.println();

        /* внесение суммы 100 на счет name1*/
        double balance = hashMap.get("name1");
        hashMap.put("name1", balance + 100);
        System.out.println("- новый остаток на счете name1: "+hashMap.get("name1"));
    }
}

/*---------------------------------------------------------------------*/

class BlockLinkedHashMap{
    void method(){
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map);

        map.put(3, "three 2version");

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(10));

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*---------------------------------------------------------------------*/

/* пример использования класса TreeMap*/
class ExTreeMap{

    void method(){
        System.out.println("Использование класса TreeMap");

        /* создание древовидного отображения*/
        TreeMap<String, Double> treeMap = new TreeMap<>();

        /* введение элементов в древовидное отображение*/
        treeMap.put("name1", new Double(34.0));
        treeMap.put("name2", new Double(11.0));
        treeMap.put("name3", new Double(25.0));
        treeMap.put("name4", new Double(-47.0));
        treeMap.put("name5", new Double(52.0));

        /* получение множество записей*/
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        /* вывод множество записей*/
        for(Map.Entry<String, Double> m : set){
            System.out.print("- "+m.getKey()+" : ");
            System.out.println(m.getValue());
        }
        System.out.println();

        /* внесение суммы 100 на счет name1*/
        double balance = treeMap.get("name1");
        treeMap.put("name1", balance + 100);
        System.out.println("- новый остаток на счете name1: "+treeMap.get("name1"));
    }
}

/*---------------------------------------------------------------------*/

/* сравнение HashMap, LinkedHashMap и TreeMap*/
class BlockHashAndLinkedHashAndTreeMap{
    void method(){
        /* не гарантируется порядок*/
        Map<Integer, String> hashMap = new HashMap<>();
        /* гарантируется порядок добавления*/
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        /* сортирует элементы по ключу (естественный порядок)*/
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("-------HashMap--------");
        testMap(hashMap);
        System.out.println("--------LinkedHashMap-------");
        testMap(linkedHashMap);
        System.out.println("--------TreeMap-------");
        testMap(treeMap);
    }

    private void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Tim");
        map.put(78, "Tom");
        map.put(0, "Sam");
        map.put(1500, "Jack");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*---------------------------------------------------------------------*/

/* пример использования компаратора для сортировки счетов по фамилиям вкладчиков*/
/* сравнение последних слов в обеих символьных строках*/
class ExSortComparator implements Comparator<String> {

    public int compare(String a, String b){

        /* поиск индекса символа, с которого начинается фамилия*/
        int i = a.lastIndexOf(' ');
        int j = b.lastIndexOf(' ');
        int k = a.substring(i).compareTo(b.substring(j));

        /* если фамилии совпадают, то проверить имя и фамилию полностью*/
        if(k == 0) return a.compareTo(b);
        else return k;
    }
    /* переопределять метод equals не требуется*/
}

/* сокращенный вариант*/
class ExSortComparatorV2 implements Comparator<String>{

    public int compare(String a, String b){
        int k = 0;
        if((k = a.substring(a.lastIndexOf(' ')).compareTo(b.substring(b.lastIndexOf(' ')))) == 0)
            return a.compareTo(b);
        else return k;
    }
}

class ExComparator2{

    void method(){
        System.out.println("Использование компаратора для сортировки счетов по фамилиям вкладчиков");

        /* создание древовидного отображения*/
        TreeMap<String, Double> treeMap = new TreeMap<>(new ExSortComparatorV2());

        /* создание древовидного отображения и передача ему лямбда-выражения*/
        /*TreeMap<String, Double> treeMap = new TreeMap<>((a, b) -> {
            int k = 0;
            if((k = a.substring(a.lastIndexOf(' ')).compareTo(b.substring(b.lastIndexOf(' ')))) == 0)
                return a.compareTo(b);
            else return k;
        });*/

        /* введение элементов в древовидное отображение*/
        treeMap.put("name1 lastname1", new Double(34.0));
        treeMap.put("name2 lastname2", new Double(11.0));
        treeMap.put("name3 lastname3", new Double(25.0));
        treeMap.put("name4 lastname4", new Double(-47.0));
        treeMap.put("name5 lastname5", new Double(52.0));

        /* получение множество записей*/
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        /* вывод множества записей*/
        for(Map.Entry<String, Double> m : set){
            System.out.print("- "+m.getKey()+" : ");
            System.out.println(m.getValue());
        }

        System.out.println();

        /* внесение суммы 100 на счет name2 lastname2*/
        double balance = treeMap.get("name2 lastname2");
        treeMap.put("name2 lastname2", balance + 100);
        System.out.println("- новый остаток на счете name2 lastname2: "+treeMap.get("name2 lastname2"));
    }
}

/*---------------------------------------------------------------------*/

/* пример использования метода thenComparing() для сортировки счетов вкладчиков сначала по фамилии, а затем по имени*/
/* компаратор, сравнивающий фамилии вкладчиков – первый компаратор*/
class SortDepositComp1 implements Comparator<String>{
    public int compare(String a, String b){
        /* поиск индекса символа, с которого начинается фамилия*/
        int i = a.lastIndexOf(' ');
        int j = b.lastIndexOf(' ');
        return a.substring(i).compareToIgnoreCase(b.substring(j));
    }
}

/* сортировка счета вкладчиков по Ф.И.О., если фамилии одинаковы – второй компаратор*/
class SortDepositComp2 implements Comparator<String>{
    public int compare(String a, String b){
        return a.compareToIgnoreCase(b);
    }
}

class ExThenComparing{

    void method(){
        System.out.println("Использование метода thenComparing()");
        /* использование метода thenComparing() для создания компаратора, сравнивающего сначала фамилии,
        а затем Ф.И.О. вкладчиков, если фамилии одинаковы*/

        Comparator<String> comp = new SortDepositComp1().thenComparing(new SortDepositComp2());
        /* создание древовидного отображения*/

        TreeMap<String, Double> treeMap = new TreeMap<>(comp);

        /* введение элементов в древовидное отображение*/
        treeMap.put("name1 lastname1", new Double(34.0));
        treeMap.put("name2 lastname2", new Double(11.0));
        treeMap.put("name3 lastname4", new Double(25.0));
        treeMap.put("name3 lastname3", new Double(-47.0));
        treeMap.put("name5 lastname5", new Double(52.0));

        /* получение множество записей*/
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        /* вывод множества записей*/

        for(Map.Entry<String, Double> m : set){
            System.out.print("- "+m.getKey()+" : ");
            System.out.println(m.getValue());
        }

        System.out.println();

        /* внесение суммы 100 на счет name2 lastname2*/
        double balance = treeMap.get("name2 lastname2");
        treeMap.put("name2 lastname2", balance + 100);
        System.out.println("- новый остаток на счете name2 lastname2: "+treeMap.get("name2 lastname2"));
    }
}

/*---------------------------------------------------------------------*/

/* пример использования метода thenComparing() для сортировки счетов вкладчиков сначала по фамилии, а затем по имени,
 * используя лямбда-выражение*/
class ExComparatorLambda{

    void method(){
        System.out.println("Использование метода thenComparing() используя лямбда-выражение");

        Comparator<String> comp1 = (a, b) -> {
            return a.substring(a.lastIndexOf(' ')).compareToIgnoreCase(b.substring(b.lastIndexOf(' ')));
        };

        Comparator<String> comp2 = (a, b) -> {return a.compareToIgnoreCase(b);};
        Comparator<String> comp = comp1.thenComparing(comp2);

        /* создание древовидного отображения*/
        TreeMap<String, Double> treeMap = new TreeMap<>(comp);

        /* введение элементов в древовидное отображение*/
        treeMap.put("name1 lastname1", new Double(34.0));
        treeMap.put("name2 lastname2", new Double(11.0));
        treeMap.put("name3 lastname4", new Double(25.0));
        treeMap.put("name3 lastname3", new Double(-47.0));
        treeMap.put("name5 lastname5", new Double(52.0));

        /* получение множество записей*/
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        /* вывод множества записей*/
        for(Map.Entry<String, Double> m : set){
            System.out.print("- "+m.getKey()+" : ");
            System.out.println(m.getValue());
        }
        System.out.println();

        /* внесение суммы 100 на счет name2 lastname2*/
        double balance = treeMap.get("name2 lastname2");
        treeMap.put("name2 lastname2", balance + 100);
        System.out.println("- новый остаток на счете name2 lastname2: "+treeMap.get("name2 lastname2"));
    }
}

/*---------------------------------------------------------------------*/

/* пример использования класса Hashtable*/
class ExHashtable{

    void method(){
        System.out.println("Использование класса Hashtable");

        /* создание хеш-таблицы*/
        Hashtable<String, Double> hashtab = new Hashtable<>();

        /* введение элементов в хеш-таблицу*/
        hashtab.put("name1 lastname1", 34.0);
        hashtab.put("name2 lastname2", 11.0);
        hashtab.put("name3 lastname3", 25.0);
        hashtab.put("name4 lastname4", -47.0);
        hashtab.put("name5 lastname5", 52.0);

        System.out.println("- использование Enumeration");

        /* получение перечисления ключей из хеш-таблицы*/
        Enumeration<String> names = hashtab.keys();
        while(names.hasMoreElements()){
            String str = names.nextElement();
            System.out.println("- "+str + ": "+hashtab.get(str));
        }

        /* внесение суммы 100 на счет name2 lastname2*/
        double balance = hashtab.get("name2 lastname2");
        hashtab.put("name2 lastname2", balance + 100);
        System.out.println("- новый остаток на счете name2 lastname2: "+hashtab.get("name2 lastname2"));
        System.out.println();

        /* переделанный фрагмент*/
        System.out.println("- использование Iterator");

        /* получение представления всех ключей из хеш-таблицы в виде множества*/
        Set<String> set = hashtab.keySet();

        /* получение итератора*/
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println("- "+str + ": " + hashtab.get(str));
        }

        /* внесение суммы 100 на счет name2 lastname2*/
        balance = hashtab.get("name2 lastname2");
        hashtab.put("name2 lastname2", balance + 100);
        System.out.println("- новый остаток на счете name2 lastname2: "+hashtab.get("name2 lastname2"));
    }
}

/*---------------------------------------------------------------------*/

public class MapExample {
    public static void main(String[] args) {
        new ExHashMap().method(); System.out.println("---------------------");
        new BlockLinkedHashMap().method(); System.out.println("---------------------");
        new ExTreeMap().method(); System.out.println("---------------------");
        new BlockHashAndLinkedHashAndTreeMap().method(); System.out.println("---------------------");
        new ExComparator2().method(); System.out.println("---------------------");
        new ExThenComparing().method(); System.out.println("---------------------");
        new ExComparatorLambda().method(); System.out.println("---------------------");
        new ExHashtable().method(); System.out.println("---------------------");
    }
}
