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