# Java-Collections-Framework

Java Collections Framework - это набор связанных классов и интерфейсов, реализующих часто используемых коллекций структур данных
_________________________________________________________________

List -
Map -
Set -

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
     
=================== класс HashMap ===================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>put()</td>
    <td>get()</td>
    <td>remove()</td>
    <td>containsKey()</td>
  </tr>
  <tr>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
  </tr>
</table>
<p>Примечание: В версии 7 и ниже, временная сложность в худшем случае состовляет O(n), но начиная с версии 7+ временная сложность будет составлять O(log N)</p>
<p>Примечание: Экземпляр HashMap имеет два параметра, влияющих на его производительность:</p>
<p>начальную емкость и коэффициент загрузки. Емкость — это количество сегментов в хэш-таблице, а начальная емкость — это просто емкость на момент создания хэш-таблицы.</p>
<p>Коэффициент загрузки (по умолчанию 0,75) — это мера того, насколько полной может быть заполнена хеш-таблица, прежде чем ее емкость будет автоматически увеличена.</p>
  <li>Когда количество записей в хеш-таблице превышает произведение коэффициента загрузки и текущей емкости, хеш-таблица повторно хешируется (то есть внутренние структуры данных перестраиваются), так что хеш-таблица имеет примерно удвоенное количество сегментов.</li>
  <li></li>
</ul>
  
<h2>Описание:</h2>
<ul>
  <li>реализован в виде хеш-таблицы, в ячейках которого хранится только связанный список (версия 7 и ниже)</li>
  <li>для версии 7+ в ячейках хранится связанный список, который преобразуется в красно-черное дерево, если количество элементов в связанном списке становится >= 8</li>
  <li>иерархия: Map -> AbstractMap -> HashMap</li>
  <li>расширяет AbstractMap<K,V></li>
  <li>реализует Map<K,V>, Cloneable , Serializable</li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку: Map map = Collections.synchronizedMap(new HashMap(...));</li>
  <li>выдает исключение ConcurrentModificationException, если, после создания iterator, происходит попытка изменения структуры любым способом, кроме как с помощью собственного метода remove.</li>
  <li>может содержать только один null-ключ, но несколько null-значений</li>
  <li>не гарантирует порядок</li>
</ul>
