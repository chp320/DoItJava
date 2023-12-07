package doitjava.chap17.sec04;

import java.util.TreeMap;

class MyClass {
  int data1;
  int data2;
  public MyClass(int data1, int data2) {
    this.data1 = data1;
    this.data2 = data2;
  }
  @Override
  public String toString() {
    return "data1 = " + data1 + "을 갖고 있는 클래스";
  }
}

class MyComparableClass implements Comparable<MyComparableClass> {
  int data1;
  int data2;
  
  public MyComparableClass(int data1, int data2) {
    this.data1 = data1;
    this.data2 = data2;
  }

  @Override
  public int compareTo(MyComparableClass o) {
    if(this.data1 < o.data1) {
      return -1;
    } else if(this.data1 == o.data1) {
      return 0;
    } else {
      return 1;
    }
  }

  @Override
  public String toString() {
    return "data1 = " + data1 + "을 갖고 있는 클래스";
  }
  
}

public class TreeMapMethod_2 {
  public static void main(String[] args) {
    // 1. Integer 크기 비교
    TreeMap<Integer, String> treeMap1 = new TreeMap<>();
    // Integer intVal1 = new Integer(20);
    Integer intVal1 = Integer.valueOf(20);    // Integer(int value) 는 java9 부터 deprecated 되었기 때문에 valueOf(int value) 를 사용하자!
    Integer intVal2 = Integer.valueOf(10);
    treeMap1.put(intVal1, "가나다");
    treeMap1.put(intVal2, "나라다");
    System.out.println(treeMap1.toString());

    // 2. String 크기 비교
    TreeMap<String, Integer> treeMap2 = new TreeMap<>();
    String str1 = "가나";
    String str2 = "다라";
    treeMap2.put(str1, 10);
    treeMap2.put(str2, 20);
    System.out.println(treeMap2.toString());

    // 하기 코드 오류 발생
    /*
     * Exception in thread "main" java.lang.ClassCastException: class doitjava.chap17.sec04.MyClass cannot be cast to class java.lang.Comparable (doitjava.chap17.sec04.MyClass is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
        at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
        at java.base/java.util.TreeMap.put(TreeMap.java:785)
        at java.base/java.util.TreeMap.put(TreeMap.java:534)
        at doitjava.chap17.sec04.TreeMapMethod_2.main(TreeMapMethod_2.java:68)
     */
    /*
    // 3. MyClass 객체 크기 비교
    TreeMap<MyClass, String> treeMap3 = new TreeMap<MyClass, String>();
    MyClass myClass1 = new MyClass(2, 5);
    MyClass myClass2 = new MyClass(3, 3);
    treeMap3.put(myClass1, "가나다");
    treeMap3.put(myClass2, "나라다");
    System.out.println(treeMap3.toString());
    */

    // 4. MyComparableClass 객체 크기 비교 방법1
    TreeMap<MyComparableClass, String> treeMap4 = new TreeMap<MyComparableClass, String>();
    MyComparableClass myComparableClass1 = new MyComparableClass(2, 5);
    MyComparableClass myComparableClass2 = new MyComparableClass(3, 3);
    treeMap4.put(myComparableClass1, "가나다");
    treeMap4.put(myComparableClass2, "나라다");
    System.out.println(treeMap4);


  }
}
