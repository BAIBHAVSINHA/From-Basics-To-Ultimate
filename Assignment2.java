import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Road {
    public String city1;
    public String city2;
    public int safetyScore;
 public Road(String city1, String city2, int safetyScore) {
        this.city1 = city1;
        this.city2 = city2;
        this.safetyScore = safetyScore;
    }
}
