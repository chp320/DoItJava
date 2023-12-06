package doitjava.chap16;

class Apple {}
class Goods1 {
  private Apple apple = new Apple();

  public Apple getApple() {
    return apple;
  }

  public void setApple(Apple apple) {
    this.apple = apple;
  }
}

class Pencil {}
class Goods2 {
  private Pencil pencil = new Pencil();

  public Pencil getPencil() {
    return pencil;
  }

  public void setPencil(Pencil pencil) {
    this.pencil = pencil;
  }
}

public class ProblemsBeforeGeneric {
  public static void main(String[] args) {
    // Goods1을 통해서만 Apple 객체 추가/가져오기
    Goods1 goods1 = new Goods1();
    goods1.setApple(new Apple());
    Apple apple = goods1.getApple();

    // Goods2를 통해서만 Pencil 객체 추가/가져오기
    Goods2 goods2 = new Goods2();
    goods2.setPencil(new Pencil());
    Pencil pencil = goods2.getPencil();

  }
}

/**
 * 아니. 이렇게 새로운 타입이 생성되면 그 타입을 활용(get/set)하기 위한 또다른 클래스가 생성되어야 하나?
 * 하나의 클래스로 모든 타입을 컨트롤할 수 없을까?? -> 모든 자바 클래스의 최상위 클래스인 Object 타입을 사용하면 어떨까??
 */