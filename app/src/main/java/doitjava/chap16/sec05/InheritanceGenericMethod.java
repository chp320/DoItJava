package doitjava.chap16.sec05;

/**
 * 제너릭 메서드를 포함한 일반 클래스를 상속받은 자식 클래스에서는 부모 클래스의 '제너릭 메서드'를 호출 가능하다!
 */

class Parent9 {
  // 최상위 클래스를 Number 클래스로 제한한 제너릭 메서드
  <T extends Number> void print(T t) {
    System.out.println(t);
  }
}
class Child9 extends Parent9 {}


public class InheritanceGenericMethod {
  public static void main(String[] args) {
    
    // 부모 클래스에서 제너릭 메서드 사용
    Parent9 p = new Parent9();
    p.print(10);

    // 자식 클래스에서 제너릭 메서드 사용
    Child9 c = new Child9();
    c.print(5.8);
  }
}
