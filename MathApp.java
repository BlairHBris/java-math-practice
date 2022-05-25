public class MathApp {
  public static void main(String[] args) {
    MathApp.maxFinder( 50, 49 );
    MathApp.minFinder( 49, 50 );
    MathApp.circleArea( 7.25 );
    MathApp.squareRoot( 9 );
    MathApp.distanceFinder( 5, 10, 85, 50 );
    MathApp.absoluteValue( -3.8 );
    MathApp.random0To1();
  }

  private static void maxFinder(double job1Salary, double job2Salary) {
    System.out.println( Math.max(job1Salary, job2Salary));
  }

  private static void minFinder(double carPrice, double truckPrice) {
    System.out.println( Math.min(carPrice, truckPrice));
  }

  private static void circleArea(double radius) {
    System.out.println(radius * radius * Math.PI);
  }

  private static void squareRoot(double num1) {
    System.out.println( Math.sqrt(num1));
  }

  private static void distanceFinder(double x1, double y1, double x2, double y2) {
    System.out.println( Math.hypot(x1 - x2, y1 - y2));
  }

  private static void absoluteValue(double num2) {
    System.out.println( Math.abs(num2));
  }

  private static void random0To1() {
    System.out.println( Math.random());
  }

}
