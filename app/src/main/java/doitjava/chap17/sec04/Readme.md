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