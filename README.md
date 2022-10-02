# Java-Collections-Framework

/* =================================== класс ArrayList =================================== */
/*_______________________________________________
* | позиция:  | добавление: | поиск: | удаление: |
* | начало    |    O(n)     |  O(1)  |   O(n)    |
* | середина  |    O(n/2)   |  O(1)  |   O(n/2)  |
* | конец     |    O(1)     |  O(1)  |   O(1)    |
* _______________________________________________*/
/* Описание:
* - реализован в виде динамического массива
* - иерархия: Iterable -> Collection -> List -> AbstractList -> ArrayList
* - расширяет AbstractList <E>
* - реализует List <E>, RandomAccess , Cloneable , Serializable
* - потоко-небезопасен
* - для работы в многопоточном режиме стоит использовать обертку:
*     List list = Collections.synchronizedList(new ArrayList(...));
* - Операции size , isEmpty , get , set , iterator и listIterator выполняются за постоянное время
* - выдает исключение ConcurrentModificationException, если происходит попытка изменения структуры
*   через итератор после создания списка
* */
<p> - <a href="">ArrayList</a></p>
