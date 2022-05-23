public class MathApp {
  public static void main(String[] args) {
    MathApp.maxFinder(50, 49);
    MathApp.minFinder(49, 50);
    MathApp.circleArea(7.25);
    MathApp.squareRoot();
    MathApp.distanceFinder();
    MathApp.absoluteValue();
    MathApp.random0To1();
  }

  private static void maxFinder(double job1Salary, double job2Salary) {
    System.out.println(Math.max(job1Salary, job2Salary));
  }

  private static void minFinder(double carPrice, double truckPrice) {
    System.out.println(Math.min(carPrice, truckPrice));
  }
  
  private static void circleArea(double radius) {
    double area = radius * radius * Math.PI;
    System.out.println(area);
  }

  private static void squareRoot() {

  }
  
  private static void distanceFinder() {

  }
  
  private static void absoluteValue() {

  }
  
  private static void random0To1() {

  }
  

}
