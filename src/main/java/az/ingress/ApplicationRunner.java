package az.ingress;

import az.ingress.cache.Storage;

public class ApplicationRunner {

  public static void main(String[] args) {
    runCache();
  }

  private static void runCache() {
    final var stringCache = Storage.of("hey");
    final var integerCache = Storage.of(1);

    System.out.println(stringCache.getData());
    System.out.println(integerCache.getData());

    stringCache.clear();
    integerCache.clear();

    System.out.println(stringCache.getData());
    System.out.println(integerCache.getData());
  }
}
