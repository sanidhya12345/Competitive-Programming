import java.util.Arrays;

public class Destroying_Asteriods {

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long m = mass;
        Arrays.sort(asteroids);
        for (int ast : asteroids) {
            if (m < ast) {
                return false;
            }
            m += ast;
        }
        return true;
    }
    public static void main(String[] args) {
        int mass=10;
        int [] asteroids={3,9,19,5,21};
        System.out.println(asteroidsDestroyed(mass,asteroids));
    }
}
