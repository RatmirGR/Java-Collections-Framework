# Java-Collections-Framework

Java Collections Framework - это набор связанных классов и интерфейсов, реализующих часто используемых коллекций структур данных

======================== класс ArrayList ========================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>add()</td>
    <td>add(index,element)</td>
    <td>get()</td>
    <td>remove()</td>
    <td>indexOf()</td>
    <td>contains()</td>
  </tr>
  <tr>
    <td align="center">O(1)</td>
    <td align="center">O(n)</td>
    <td align="center">O(1)</td>
    <td align="center">O(n)</td>
    <td align="center">O(n)</td>
    <td align="center">O(n)</td>
  </tr>
</table>

<h2>Описание:</h2>
<ul>
  <li>реализован в виде динамического массива</li>
  <li>иерархия: Iterable -> Collection -> List -> AbstractList -> ArrayList</li>
  <li>расширяет AbstractList <E></li>
  <li>реализует List <E>, RandomAccess , Cloneable , Serializable</li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку: List list = Collections.synchronizedList(new ArrayList(...));</li>
  <li>Операции size , isEmpty , get , set , iterator и listIterator выполняются за постоянное время</li>
  <li>выдает исключение ConcurrentModificationException, если происходит попытка изменения структуры через итератор после создания списка</li>
  <li>может содержать null-элементы</li>
</ul> 

======================== класс LinkedList ========================
 <h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>add()</td>
    <td>add(index,element)</td>
    <td>get()</td>
    <td>remove()</td>
    <td>contains()</td>
  </tr>
  <tr>
    <td align="center">O(1)</td>
    <td align="center">O(n)</td>
    <td align="center">O(n)</td>
    <td align="center">O(n)</td>
    <td align="center">O(n)</td>
  </tr>
</table>
<h2>Описание:</h2>
<ul>
  <li>реализован в виде двусвязанного списка</li>
  <li>иерархия: Iterable -> Collection -> List -> AbstractSequentialList -> LinkedList</li>
  <li>расширяет AbstractSequentialList<E></li>
  <li>реализует List<E>, Deque<E>, Cloneable , Serializable</li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку: List list = Collections.synchronizedList(new LinkedList(...));</li>
  <li>выдает исключение ConcurrentModificationException, если происходит попытка изменения структуры через итератор после создания списка</li>
  <li>может содержать null-элементы</li>
</ul> 
