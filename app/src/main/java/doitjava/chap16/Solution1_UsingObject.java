package doitjava.chap16;

/**
 * 최상위 클래스인 Object 클래스를 사용해서 다양한 객체를 저장함.
 * 단점) 객체를 get 할 때는 Object 타입으로 가져올 것이기 때문에 반드시 "다운 캐스팅"이 필요한데, 형변환을 잘못하는 경우 런타임 오류 발생할 것임! (오류 가능성 존재)
 * -> 와!!! 컴파일 시 오류 뱉네!!
 */

class Apple1 {}
class Pencil1 {}

class Goods {
  private Object object = new Object();
  public Object getObject() {
    return object;
  }
  public void setObject(Object object) {
    this.object = object;
  }
}

public class Solution1_UsingObject {

  public static void main(String[] args) {
    Goods goods1 = new Goods();
    Goods goods2 = new Goods();

    goods1.setObject(new Apple1());
    goods2.setObject(new Pencil1());

    Apple1 apple = (Apple1) goods1.getObject();
    Pencil1 pencil = (Pencil1) goods2.getObject();

    System.out.println(apple);
    System.out.println(pencil);

    // // 잘못된 캐스팅
    // Goods goods3 = new Goods();
    // goods3.setObject(new Apple());
    // Pencil pencil2 = (Pencil) goods3.getObject();
  }
}
