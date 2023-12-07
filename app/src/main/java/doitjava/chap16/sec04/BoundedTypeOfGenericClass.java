package doitjava.chap16.sec04;

class A4 {}
class B4 extends A4 {}
class C4 extends B4 {}
class D4 <T extends B4> {
  // 제너릭 클래스 제너릭 타입 제한 -> 최상위 클래스를 B4 로 제한함
  private T t;
  public T get() {
    return t;
  }
  public void set(T t) {
    this.t = t;
  }
}

public class BoundedTypeOfGenericClass {
  public static void main(String[] args) {
    // D4<A4> d1 = new D4<>();   // 최상위 클래스를 B4 로 제한했기 때문에 B4 의 상위 클래스인 A4 는 "불가";
    D4<B4> d2 = new D4<>();
    D4<C4> d3 = new D4<>();
    D4 d4 = new D4();             // 제너릭 타입을 생략하면 대입 가능한 모든 타입의 '최상위 클래스'가 입력된 것으로 간주하며, 
                                  // D4 는 최상위 클래스를 B4 로 제한했기 때문에 D4<B4> d4 = new D4<>(); 와 동일한 의미이다.

    d2.set(new B4());
    d2.set(new C4());

    // d3.set(new B4());             // d3은 최상위를 C4 로 제한했기 때문에 그 부모 클래스인 B4 는 "불가"
    d3.set(new C4());

    d4.set(new B4());
    d4.set(new C4());

  }
}
