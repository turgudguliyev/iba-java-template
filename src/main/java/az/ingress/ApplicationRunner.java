package az.ingress;

import az.ingress.cache.Storage;
import az.ingress.logging.Logger;

public class ApplicationRunner {

  public static void main(String[] args) {
    runCache();
    runLog();
  }

  private static void runLog() {
    Logger.log("USER_LOGIN", "username=hey", "password=1234");
    Logger.log("C2C", "source=1234", "target=4321");
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
