# Java-Collections-Framework

Java Collections Framework - это набор связанных классов и интерфейсов, реализующих часто используемых коллекций структур данных
_________________________________________________________________

<img src="https://github.com/RatmirGR/Java-Collections-Framework/blob/main/java-collections.png" width="600" height="300"/>

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
     
======================== класс HashMap ========================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>put()</td>
    <td>get()</td>
    <td>remove()</td>
    <td>ContainsKey()</td>
  </tr>
  <tr>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
  </tr>
</table>
<p>Примечание: В версии 7 и ниже, временная сложность в худшем случае состовляет O(n), но начиная с версии 8 временная сложность будет составлять O(log N)</p>
<p>Примечание: Экземпляр HashMap имеет два параметра, влияющих на его производительность:
начальную емкость и коэффициент загрузки.</br>
Емкость — это количество сегментов в хэш-таблице, а начальная емкость — это просто емкость на момент создания хэш-таблицы.</br>
Коэффициент загрузки (по умолчанию 0,75) — это мера того, насколько полной может быть заполнена хеш-таблица, прежде чем ее емкость будет автоматически увеличена.</br>
Когда количество записей в хеш-таблице превышает произведение коэффициента загрузки и текущей емкости, хеш-таблица повторно хешируется (то есть внутренние структуры данных перестраиваются), так что хеш-таблица имеет примерно удвоенное количество сегментов.</p>
  
<h2>Описание:</h2>
<ul>
  <li>реализован в виде хеш-таблицы, в ячейках которого хранится только связанный список (версия 7 и ниже)</li>
  <li>для версии 8 в ячейках хранится связанный список, который преобразуется в красно-черное дерево, если количество элементов в связанном списке становится равна 8, а общее количество корзин превышает 64</li>
  <li>иерархия: Map -> AbstractMap -> HashMap</li>
  <li>расширяет AbstractMap<K,V></li>
  <li>реализует Map<K,V>, Cloneable , Serializable</li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку: Map map = Collections.synchronizedMap(new HashMap(...));</li>
  <li>выдает исключение ConcurrentModificationException, если, после создания iterator, происходит попытка изменения структуры любым способом, кроме как с помощью собственного метода remove.</li>
  <li>может содаржать только уникальные ключи</li>
  <li>может содержать только один null-ключ и несколько null-значений</li>
  <li>не гарантирует порядок</li>
</ul>

======================== класс LinkedHashMap ========================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>put()</td>
    <td>get()</td>
    <td>remove()</td>
    <td>ContainsKey()</td>
  </tr>
  <tr>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
  </tr>
</table>
<p>Примечание: В версии 7 и ниже, временная сложность в худшем случае состовляет O(n), но начиная с версии 8 временная сложность будет составлять O(log N)</p>
<p>Примечание: итерация по LinkedHashMap требует времени, пропорционального размеру карты, независимо от ее емкости.
<p>Примечание: Экземпляр LinkedHashMap имеет два параметра, влияющих на ее производительность:
  начальную емкость и коэффициент загрузки. Они определены точно так же, как и для HashMap</p>
 

<h2>Описание:</h2>
<ul>
  <li>реализован в виде хеш-таблицы и двусвязанного списка с предсказуемым порядком итераций</li>
  <li>для версии 8 в ячейках хранится связанный список, который преобразуется в красно-черное дерево,
  если количество элементов в связанном списке становится равна 8, а общее количество корзин превышает 64</li>
  <li>иерархия: Map -> AbstractMap -> HashMap -> LinkedHashMap</li>
  <li>расширяет HashMap<K,V></li>
  <li>реализует Map<K,V></li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку:
      Map map = Collections.synchronizedMap(new LinkedHashMap(...));</li>
  <li>выдает исключение ConcurrentModificationException, если, после создания iterator, происходит попытка
  изменения структуры любым способом, кроме как с помощью собственного метода remove.</li>
  <li>может содаржать только уникальные ключи</li>
  <li>может содержать только один null-ключ и несколько null-значений</li>
  <li>сохраняет порядок вставки</li>
  <li>порядок вставки не изменяется, если ключ повторно вставляется в карту</li>
</ul>

======================== класс TreeMap ========================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>put()</td>
    <td>get()</td>
    <td>remove()</td>
    <td>ContainsKey()</td>
  </tr>
  <tr>
    <td align="center">O(log n)</td>
    <td align="center">O(log n)</td>
    <td align="center">O(log n)</td>
    <td align="center">O(log n)</td>
  </tr>
</table>
<h2>Описание:</h2>
<ul>
  <li>реализован в виде красно-черного дерева</li>
  <li>иерархия: Map -> AbstractMap -> NavigableMap -> TreeMap</li>
  <li>расширяет AbstractMap<K,V></li>
  <li>реализует NavigableMap<K,V>, Cloneable, Serializable</li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку: SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));</li>
  <li>выдает исключение ConcurrentModificationException, если, после создания iterator, происходит попытка изменения структуры любым способом, кроме как с помощью собственного метода remove.</li>
  <li>может содержать только уникальные ключи</li>
  <li>может содержать только один null-ключ (если используется компаратор, разрешающий null) и несколько null-значений</li>
  <li>сортирует элементы в естественном порядке или исходя из заданного компаратора</li>
  <li></li>
</ul>
<h2>Правила построения красно-черного дерева:</h2>
<ul>
  <li>Корень должен быть окрашен в черный цвет.</li>
  <li>Листья дерева должны быть черного цвета.</li>
  <li>Красный узел должен иметь два черных, дочерних узла.</li>
  <li>Черный узел может иметь любые дочерние узлы.</li>
  <li>Путь от узла к его листьям должен содержать одинаковое количество черных узлов.</li>
  <li>Новые узлы добавляются на места листьев.</li>
</ul>

======================== класс HashSet ========================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>add()</td>
    <td>remove()</td>
    <td>contains()</td>
    <td>size</td>
  </tr>
  <tr>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
  </tr>
</table>
<p>Примечание: Итерация по этому набору требует времени, пропорционального сумме размера экземпляра HashSet (количество элементов) плюс «емкость» резервного экземпляра HashMap(количество сегментов)</p>
<h2>Описание:</h2>
<ul>
  <li>реализован в виде хеш-таблицы (фактически экземпляром HashMap)</li>
  <li>иерархия: Iterable -> Collection -> Set -> AbstractSet -> HashSet</li>
  <li>расширяет AbstractSet<E></li>
  <li>реализует Set<E>, Cloneable , Serializable</li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку: Set set = Collections.synchronizedSet(new HashSet(...));</li>
  <li>выдает исключение ConcurrentModificationException, если, после создания iterator, происходит попытка изменения структуры любым способом, кроме как с помощью собственного метода remove</li>
  <li>может хранить один null-элемент</li>
  <li>не гарантирует порядок</li>
</ul>
   
======================== класс LinkedHashSet ========================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>add()</td>
    <td>remove()</td>
    <td>contains()</td>
    <td>size</td>
  </tr>
  <tr>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
    <td align="center">O(1)</td>
  </tr>
</table>
<p>Примечание: Итерация по LinkedHashSet требует времени, пропорционального размеру набора, независимо от его емкости</p>
<p>Примечание: LinkedHashSet имеет два параметра, влияющих на его производительность: начальную емкость и коэффициент загрузки. Они определены точно так же, как и для HashSet</p>
<h2>Описание:</h2>
<ul>
  <li>реализован в виде хеш-таблицы и двусвязанного списка (фактически экземпляром HashMap)</li>
  <li>двусвязанный список проходит через все его записи</li>
  <li>иерархия: Iterable -> Collection -> Set -> AbstractSet -> HashSet -> LinkedHashSet</li>
  <li>расширяет HashSet<E></li>
  <li>реализует Set<E>, Cloneable , Serializable</li>
  <li>потоко-небезопасен</li>
  <li>для работы в многопоточном режиме стоит использовать обертку: Set set = Collections.synchronizedSet(new LinkedHashSet(...));</li>
  <li>выдает исключение ConcurrentModificationException, если, после создания iterator, происходит попытка изменения структуры любым способом, кроме как с помощью собственного метода remove</li>
  <li>может хранить один null-элемент</li>
  <li>сохраняет порядок вставки</li>
  <li>порядок вставки не изменяется, если элемент повторно вставляется в набор</li>
</ul>
   
======================== класс TreeSet ========================
<h2>Временная сложность (Big-O):</h2>
<table>
   <tr>
    <td>add()</td>
    <td>remove()</td>
    <td>contains()</td>
    <td>size</td>
  </tr>
  <tr>
    <td align="center">log(n)</td>
    <td align="center">log(n)</td>
    <td align="center">log(n)</td>
    <td align="center">O(1)</td>
  </tr>
</table>
<p>Примечание: Порядок, поддерживаемый Set (независимо от того, предоставлен явный компаратор или нет), должен быть согласован с equals(), который реализуется классом TreeSet. Это связанно с тем, что класс TreeSet выполняет все сравнения элементов, используя свой метод compareTo() или compare()</p>
<h2>Описание:</h2>
<ul>
   <li>реализован в виде красно-черного дерева (на базе TreeMap)</li>
   <li>иерархия: Iterable -> Collection -> Set -> AbstractSet -> HashSet -> LinkedHashSet</li>
   <li>расширяет AbstractSet<E></li>
   <li>реализует NavigableSet<E>, Cloneable , Serializable</li>
   <li>потоко-небезопасен</li>
   <li>для работы в многопоточном режиме стоит использовать обертку: SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));</li>
   <li>выдает исключение ConcurrentModificationException, если, после создания iterator, происходит попытка изменения структуры любым способом, кроме как с помощью собственного метода remove.</li>
   <li>может содержать только один null-элемент (если используется компаратор, разрешающий null)</li>
   <li>сортирует элементы в естественном порядке или исходя из заданного компаратора</li>
</ul>
