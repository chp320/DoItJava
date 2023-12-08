package doitjava.chap18.sec01;

interface A {
  void abc();     // public abstract void abc(); 의미
}
class B implements A {

  @Override
  public void abc() {
    System.out.println("메서드 내용1");
  }
}

public class OOPvsFP {
  public static void main(String[] args) {
    
    // 1. 객체지향(OOP) 프로그래밍 문법1
    A a1 = new B();
    a1.abc();

    // 2. 객체지향(OOP) 프로그래밍 문법2 (익명 이너클래스 사용)
    A a2 = new A() {

      @Override
      public void abc() {
        System.out.println("메서드 내용2");
      }

    };
    a2.abc();

    // 3. 함수형 프로그래밍 문법(람다식)
    A a3 = () -> {
      System.out.println("메서드 내용3");
    } ;
    a3.abc();
  }
}
