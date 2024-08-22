public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();
        ducati.SetSpeed(5);

        System.out.println(ducati.getSpeed());
        ducati.System();
    }
}
