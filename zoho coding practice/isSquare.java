/*Given 4 integers as input. Find whether they would form a rectangle, square or none. */
import java.util.*;
public class isSquare{
    public static String shape(int sides[]){
        if(sides[0] == sides[1] && sides[1] == sides[2] &&sides[2] == sides[3]){
            return "square";
        }
        else if(sides[0] == sides[1] && sides[2] == sides[3]){
            return "rectangle";
        }
        

        return "none";
    }

    public static int distanceSquared(int p1[],int p2[]){
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    public static String identifyshape(int p1[],int p2[],int p3[],int p4[]){
        List<Integer> distance = new ArrayList<>();

        distance.add(distanceSquared(p1,p2));
        distance.add(distanceSquared(p1,p3));
        distance.add(distanceSquared(p1,p4));
        distance.add(distanceSquared(p2,p3));
        distance.add(distanceSquared(p2,p4));
        distance.add(distanceSquared(p3,p4));

        Collections.sort(distance);

        if(distance.get(0).equals(distance.get(1)) &&
        distance.get(1).equals(distance.get(2)) &&
        distance.get(2).equals(distance.get(3)) &&
        distance.get(4).equals(distance.get(5)) &&
        distance.get(0) !=0){
            return "square";
        }
        else if(distance.get(0).equals(distance.get(1)) &&
        distance.get(2).equals(distance.get(3)) &&
        distance.get(4).equals(distance.get(5)) &&
        distance.get(0).equals(distance.get(2)) &&
        distance.get(0) != 0){
            return "rectangle";
        }

        return "none";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        //put this values in arr
        int sides[] = {a,b,c,d};

        //determine where it square or rectangle in a single dimention
        String ans = shape(sides);

        System.out.println(ans);
        //to determine the shape in the 2d surface
        int[] p1 = {sc.nextInt(), sc.nextInt()};
        int[] p2 = {sc.nextInt(), sc.nextInt()};
        int[] p3 = {sc.nextInt(), sc.nextInt()};
        int[] p4 = {sc.nextInt(), sc.nextInt()};

        String ans2 = identifyshape(p1, p2, p3, p4);
        System.out.println(ans2);
    }
}
