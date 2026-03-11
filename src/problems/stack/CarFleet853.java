package problems.stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class CarFleet853 {
    public int carFleet(int target, int[] position, int[] speed) {
        List<int[]> posSpeed = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            posSpeed.add(new int[]{position[i], speed[i]});
        }

        posSpeed.sort(Comparator.comparingInt(value -> value[0]));

        Stack<Double> fleets = new Stack<>();

        for (int i = position.length - 1; i >= 0; i--) {
            Double currSpeed = 1.0 * (target - posSpeed.get(i)[0]) / posSpeed.get(i)[1];
            if(fleets.empty() || fleets.peek() < currSpeed) {
                fleets.push(currSpeed);
            }
        }

        return fleets.size();
    }
}
