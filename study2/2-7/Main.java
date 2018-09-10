class Main {
  public static void main(String[] args) {
    int number = 13;

    // default‚ğ—p‚¢‚ÄA‚Ç‚Ìcase‚É‚à‡’v‚µ‚È‚¢ê‡‚Ìˆ—‚ğ‹Lq‚µ‚Ä‚­‚¾‚³‚¢
    switch (number % 5) {
      case 0:
        System.out.println("‘å‹g‚Å‚·");
        break;
      case 1:
        System.out.println("’†‹g‚Å‚·");
        break;
      case 4:
        System.out.println("‹¥‚Å‚·");
        break;
      default:
        System.out.println("‹g‚Å‚·");
    }
  }
}
