package doitjava.chap17.sec04;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {
  public static void main(String[] args) {
    
    TreeMap<Integer, String> treeMap = new TreeMap<>();
    // 데이터 추가
    for(int i=20; i>0; i-=2) {
      treeMap.put(i, i+" 번째 데이터");
    }
    System.out.println(treeMap.toString());   // key 값의 오름차순으로 출력

    // 데이터 검색
    System.out.println(treeMap.firstKey());
    System.out.println(treeMap.firstEntry());
    System.out.println(treeMap.lastKey());
    System.out.println(treeMap.lastEntry());
    System.out.println(treeMap.lowerKey(11));
    System.out.println(treeMap.lowerKey(10));
    System.out.println(treeMap.higherKey(11));
    System.out.println(treeMap.higherKey(10));

    // 데이터 추출
    System.out.println(treeMap.pollFirstEntry());   // Map에서 해당하는 엔트리를 꺼내서 '제거'!
    System.out.println(treeMap.toString());
    System.out.println(treeMap.pollLastEntry());
    System.out.println(treeMap.toString());

    // 데이터 부분집합 생성
    SortedMap<Integer, String> sortedMap = treeMap.headMap(8);  // 매개변수로 전달된 key 값 미만인 엔트리를 추출하여 부분집합 생성
    System.out.println(sortedMap.toString());
    NavigableMap<Integer, String> navigableMap = treeMap.headMap(8, true);   // inclusive가 true이면 "이하", false 이면 "미만"
    System.out.println(navigableMap.toString());
    sortedMap = treeMap.tailMap(14);
    System.out.println(sortedMap.toString());
    navigableMap = treeMap.tailMap(14, false);      // 매개변수로 전달된 key 값 초과/이상인 엔트리를 추출하여 부분집합 생성. inclusive가 true 이면 "이상", false 이면 "초과"
    System.out.println(navigableMap.toString());
    sortedMap = treeMap.subMap(6, 10);
    System.out.println(sortedMap.toString());
    navigableMap = treeMap.subMap(6, false, 10, true);

    // 정렬
    NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();  // descending은 내림차순 정렬하는 것이 아니라 현재 key 값의 "역순"으로 정렬 시킨다는 의미임.
    System.out.println(navigableSet.toString());                      // [18, 16, 14, 12, 10, 8, 6, 4]
    System.out.println(navigableSet.descendingSet());
    navigableMap = treeMap.descendingMap();
    System.out.println(navigableMap.toString());
    System.out.println(navigableMap.descendingMap());

  }
}
