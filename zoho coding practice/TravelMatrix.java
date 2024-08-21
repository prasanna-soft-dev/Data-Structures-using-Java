/*16.Assume there exists infinite grid, you’re given initial position x, y. Inputs will be movements either L or R or U or D. After n inputs, you need to give the current position.
•	Input:
•	4 5 //initial position x, y
•	9 //number of movements
•	U L R R D D U L R //7 movements
•	Output:
5 5
 */
public class TravelMatrix{
    public static void main(String[] args) {
        int row = 4;
        int col = 5;

        char dir[] = {'U','L','R','R','D','D','U','L','R'};
        
        for(char d : dir){
            if(d == 'U'){
                row--;
            }
            else if(d == 'D'){
                row++;
            }
            else if(d == 'L'){
                col--;
            }
            else{
                col++;
            }
        }
        System.out.println(row+" "+col);
    }
}
