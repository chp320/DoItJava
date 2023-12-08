package doitjava.chap18.sec01;

interface AA {
  void method1();   // 입력 x, 리턴 x
}

interface BB {
  void method2(int a);   // 입력 o, 리턴 x
}

interface CC {
  int method3();      // 입력 x, 리턴 o
}

interface DD {
  double method4(int a, double b);  // 입력 o, 리턴 o
}

public class FunctionToLambdaExpression {
  public static void main(String[] args) {
    
    // 1. 입력 x, 리턴 x
    // 1-1. 익명 이너클래스 방식
    AA aa1 = new AA() {

      @Override
      public void method1() {
        System.out.println("[입력 x, 리턴 x] 함수");
      }

    };
    // 1-2. 람다식 표현
    AA aa2 = () -> {System.out.println("[입력 x, 리턴 x] 함수");};
    AA aa3 = () -> System.out.println("[입력 x, 리턴 x] 함수");     // 중괄호 내 명령줄이 하나인 경우 '중괄호 삭제' 가능

    aa1.method1();
    aa2.method1();
    aa3.method1();

    /****************************************************************/

    // 2. 입력 o, 리턴 x
    // 2-1. 익명 이너클래스 방식
    BB bb1 = new BB() {

      @Override
      public void method2(int a) {
        System.out.println("[입력 o, 리턴 x] 함수");
      }
      
    };
    // 2-2. 람다식 표현
    BB bb2 = (int a) -> { System.out.println("[입력 o, 리턴 x] 함수");};
    BB bb3 = (a) -> { System.out.println("[입력 o, 리턴 x] 함수");};
    BB bb4 = (a) -> System.out.println("[입력 o, 리턴 x] 함수");
    BB bb5 = a -> System.out.println("[입력 o, 리턴 x] 함수");

    bb1.method2(10);
    bb2.method2(10);
    bb3.method2(10);
    bb4.method2(10);
    bb5.method2(10);

    /****************************************************************/

    
  }
}
