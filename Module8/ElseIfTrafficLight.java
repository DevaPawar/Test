public class ElseIfTrafficLight {
  public static void main(String[] args) {
  String trafficLightColor = "Red";


  if (trafficLightColor =="Red" ) {
  System.out.println("Stop");
  } else if (trafficLightColor=="Yellow") {
  System.out.println("Slow Down");
  } else if (trafficLightColor=="Green") {
  System.out.println("Go");
  } else {
  System.out.println("Invalid Color");
  }
  }
}