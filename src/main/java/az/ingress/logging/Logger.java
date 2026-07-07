package az.ingress.logging;

public final class Logger {

  private Logger() {
  }

  @SafeVarargs
  public static <T> void log(String event, T... data) {
    final var builder = new StringBuilder(event);

    for (final var value : data) {
      builder.append(" | ").append(value);
    }

    System.out.println(builder);
  }
}
