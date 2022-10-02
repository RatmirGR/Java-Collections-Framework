# Java-Collections-Framework

=================================== класс ArrayList ===================================
<table>
  <tr>
    <td>позиция:</td>
    <td>начало</td>
    <td>середина</td>
    <td>конец</td>
  </tr>
  <tr>
    <td>добавление:</td>
    <td>O(n)</td>
    <td>O(n/2)</td>
    <td>O(1)</td>
  </tr>
  <tr>
    <td>поиск:</td>
    <td>O(1)</td>
    <td>O(1)</td>
    <td>O(1)</td>
  </tr>
  <tr>
    <td>удаление:</td>
    <td>O(n)</td>
    <td>O(n/2)</td>
    <td>O(1)</td>
  </tr>
</table>

<h2>Описание:</h2>
- реализован в виде динамического массива
- иерархия: Iterable -> Collection -> List -> AbstractList -> ArrayList
- расширяет AbstractList <E>
- реализует List <E>, RandomAccess , Cloneable , Serializable
- потоко-небезопасен
- для работы в многопоточном режиме стоит использовать обертку:
    List list = Collections.synchronizedList(new ArrayList(...));
- Операции size , isEmpty , get , set , iterator и listIterator выполняются за постоянное время
- выдает исключение ConcurrentModificationException, если происходит попытка изменения структуры
  через итератор после создания списка
<p> - <a href="">ArrayList</a></p>
