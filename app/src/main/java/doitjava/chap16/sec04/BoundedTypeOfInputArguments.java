package doitjava.chap16.sec04;

/**
 * 메서드 매개변수로써 제너릭 클래스의 타입 제한 범위 설정
 */

class A5 {}
class B5 extends A5 {}
class C5 extends B5 {}
class D5 extends C5 {}

class Goods5<T> {
  private T t;
  public T get() {
    return t;
  }
  public void set(T t) {
    this.t = t;
  }
}

// 일반 클래스 내 메서드의 매개변수가 제너릭 클래스 타입이고, 범위 제한함
class Test {
  void method1(Goods5<A5> g) {}            // (case1) 제너릭 타입으로 A5 만 지정
  void method2(Goods5<?> g) {}             // (case2) ? 자리에 A5,B5,C5,D5 타입 모두 가능
  void method3(Goods5<? extends B5> g) {}  // (case3) 최상위 클래스를 B5 로 제한하였고, ? 자리에는 B5와 B5의 자식 클래스만 가능함. 즉 B5,C5,D5
  void method4(Goods5<? super B5> g) {}    // (case4) 최하위 클래스를 B5 로 하였고, ? 자리에는 B5와 B5의 부모 클래스만 가능함. 즉 A5,B5
}

public class BoundedTypeOfInputArguments {
  public static void main(String[] args) {
    Test t = new Test();

    // case1 - A5 만 지정
    t.method1(new Goods5<A5>());
    // t.method1(new Goods5<B5>());
    // t.method1(new Goods5<C5>());
    // t.method1(new Goods5<D5>());

    // case2 - 모두 가능
    t.method2(new Goods5<A5>());
    t.method2(new Goods5<B5>());
    t.method2(new Goods5<C5>());
    t.method2(new Goods5<D5>());

    // case3 - B5 이하만 가능
    // t.method3(new Goods5<A5>());
    t.method3(new Goods5<B5>());
    t.method3(new Goods5<C5>());
    t.method3(new Goods5<D5>());

    // case4 - B5 이상만 가능
    t.method4(new Goods5<A5>());
    t.method4(new Goods5<B5>());
    // t.method4(new Goods5<C5>());
    // t.method4(new Goods5<D5>());
  }
}
