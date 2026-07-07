package az.ingress.cache;

public final class Storage<T> {
  private T data;

  public static <T> Storage<T> of(T data) {
    final var storage = new Storage<T>();
    storage.data = data;
    return storage;
  }

  public T getData() {
    return data;
  }

  public void clear() {
    this.data = null;
  }
}
