package doitjava.chap16;

class KeyValue<K, V> {
  private K key;
  private V value;
  public K getKey() {
    return key;
  }
  public V getValue() {
    return value;
  }
  public void setKey(K key) {
    this.key = key;
  }

  public void setValue(V value) {
    this.value = value;
  }
}

public class TwoGenericArguments {
  public static void main(String[] args) {
    KeyValue<String, Integer> kv1 = new KeyValue<>();
    kv1.setKey("사과");
    kv1.setValue(1000);
    String key1 = kv1.getKey();
    int value1 = kv1.getValue();
    System.out.println("key: " + key1 + ", value: " + value1);

    KeyValue<Integer, String> kv2 = new KeyValue<>();
    kv2.setKey(404);
    kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
    int key2 = kv2.getKey();
    String value2 = kv2.getValue();
    System.out.println("key: " + key2 + ", value: " + value2);

    KeyValue<String, Void> kv3 = new KeyValue<>();  // 두 번째 필드는 사용하지 않겠다(void)는 의미
    kv3.setKey("키 값만 사용");
    String key3 = kv3.getKey();
    System.out.println("key: " + key3);
  }
}