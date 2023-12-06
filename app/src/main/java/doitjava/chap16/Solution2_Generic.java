package doitjava.chap16;

class Apple3{}
class Pencil3{}
// 제너릭 클래스 정의
class Goods<T> {
  private T t;
  public T get() {
    return t;
  }
  public void set(T t) {
    this.t = t;
  }
}

public class Solution2_Generic {
  public static void main(String[] args) {
    // Goods 이용해서 Apple 객체 추가/가져오기
    Goods<Apple3> goods1 = new Goods<>();
    goods1.set(new Apple3());
    Apple3 apple3 = goods1.get();
    System.out.println(apple3);

    // Goods 이용해서 Pencil 객체 추가/가져오기
    Goods<Pencil3> goods2 = new Goods<>();
    goods2.set(new Pencil3());
    Pencil3 pencil3 = goods2.get();
    System.out.println(pencil3);

    // // 잘못된 타입 선언
    // Goods<Apple3> goods3 = new Goods<>();
    // goods3.set(new Pencil3()) ; // <-- build 오류 발생
  }
}
