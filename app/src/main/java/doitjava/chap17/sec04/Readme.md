# Map<K,V> 컬렉션 인터페이스
- Map<K,V> 는 List<E>, Set<E> 와 다르게 Collection<E> 를 상속한 것이 아니라 별도 인터페이스로 존재함.


## Map<K, V> 컬렉션 특징
### Key와 Value 한 쌍으로 데이터 저장
- key,value 한 쌍의 데이터를 '엔트리(entry)' 라 지칭

### Key 는 중복 저장 불가, Value 는 중복 가능
- List<E> 는 인덱스로 값을 가져오지만 인덱스는 '고정'되어 있는 반면, Map<K, V> 의 key 는 '고정'되어 있지 않음.

## Map<K, V> 인터페이스의 주요 메서드
* 메서드
  - 데이터 추가 : put()
  - 데이터 변경 : replace()
  - 데이터 정보 추출 : get(), containsKey(), containsValue()
  - 데이터 삭제 : remove()
* 사용법
  - Map<K, V> 는 인터페이스이기 때문에 객체 생성을 위해서는 하위 클래스에서 상기 메서드를 모두 '구현해야'함
* 대표적인 구현 클래스
  - HashMap<K, V>
  - LinkedHashMap<K, V>
  - Hashtable<K, V>
  - TreeMap<K, V>


## HashMap<K, V>
- Map<K, V> 인터페이스의 대표적인 구현 클래스
- Key 중복 허용 X
  - 두 Key 의 HashCode() 값이 같고, equals() 메서드가 true 리턴하면 동일 객체로 판단 -> 중복 처리

### HashMap<K, V> 주요 메서드
- Map<K, V> 인터페이스의 메서드 그대로 활용 가능


<hr>


## Hashtable<K, V>
- HashMap<K,V> 구현 클래스가 '단일 스레드'에 적합하다면, Hashtable<K,V> 구현 클래스는 '멀티 스레드'에 안정성을 가짐
- 내부적으로 주요 메서드가 동기화(synchronized) 메서드로 구현되어 있어 멀티 스레드 환경에서도 안전
- ArrayList<E> 가 단일 스레드에 적합하지만 Vector<E> 가 멀티 스레드에 안전한 것과 유사

### Hashtable<K, V> 주요 메서드
- HashMap<K, V> 와 완전히 동일!

## LinkedHashMap<K, V>
- HashMap<K, V>의 기본적인 특성 + 입력 데이터의 순서 정보를 가지는 특성 -> 저장 데이터 출력 시, 입력된 순서대로 출력됨

### HashMap<K,V> 와 LinkedHashMap<K,V> 관계
- HashSet<E> 와 LinkedHashSet<E> 의 관계와 동일한 개념
  - HashMap<K,V> 에서는 Key를 HashSet<E> 로 관리... LinkedHashMap<K,V> 은 Key를 LinkedHashSet<E> 로 관리...

### LinkedHashMap<K,V> 주요 메서드
- HashMap<K,V> 와 완전히 동일 (출력이 입력 순으로 나오는 것만 상이)


## TreeMap<K, V>
- Map<K,V> 의 기본 기능에 '정렬 및 검색' 기능이 추가된 컬렉션
- 입력 순서와 무관하게 데이터를 "Key 값의 크기 순으로 저장"함. 즉, Key 값의 오름차순으로 저장됨
  -> Key 객체는 크기 비교 기준이 있음 (TreeSet<E> 내용 참고)
- TreeMap<K, V> 는 SortedMap<K, V> 와 NavigableMap<K, V> 인터페이스의 자식 클래스임
  - Map <- SortedMap <- NavigableMap <- TreeMap
- TreeMap<K,V> 의 주요 기능인 "정렬" 과 "검색 기능"은 SortedMap, NavigableMap 인터페이스에 정의된 것이기 때문에 Map 타입으로 선언 시, 해당 기능 사용 불가!
``` java
// Map<K, V> 로 객체 타입 선언 -> 정렬/검색 기능 사용 불가
Map<Integer, String> treeMap = new TreeMap<Integer, String>();
treeMap.xxxxxx ; // Map<K,V> 메서드만 사용 가능
// TreeMap<K, V> 로 객체 타입 선언 -> 정렬/검색 기능 사용 가능
TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
treeMap.xxxxxx ; // Map<K,V> 메서드와 추가된 정렬/검색 기능 사용 가능
```

### TreeMap<K,V> 의 주요 메서드
- Map<K,V> 의 다른 구현 클래스와 동일
- 추가로 사용 가능한 "정렬/검색" 관련 메서드 확인해보자
  - 데이터 검색 : firstKey(), firstEntry(), lastKey(), lastEntry() /* TreeMap은 Key 값의 크기 순으로 저장하기 때문에 [ first: 작은, last: 큰 ] 이라고 보면 됨 */
                  lowerKey(), lowerEntry(), higherKey(), higherEntry() /* 매개변수로 전달된 값을 기준으로 [ lower: 작은 key 값 중에서 큰, higher: 큰 key 값 중에서 작은 ] 이라고 보면 됨 */
  - 꺼내기(추출) : pollfirstEntry(), pollLastEntry()
  - 데이터 부분 집합 생성 : headMap(), tailMap(), subSet()
  - 정렬 : descendingKeySet(), descendingMap()
