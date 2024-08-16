/*7. Print whether the version is upgraded, downgraded or not changed according to the input given.
example: 
Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, 
Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded
 */
public class isVersionUpgraded{
    public static void main(String[] args) {
        String version1 = "4.10.2";
        String version2 = "4.8.4";

        String[] v1Parts = version1.split("\\.");//this regular expression (\\.)is used to split the string into array whenever it encounters a '.'
        String[] v2Parts = version2.split("\\.");

        int length = Math.max(v1Parts.length, v2Parts.length);

        for (int i = 0; i < length; i++) {
            int v1 = i < v1Parts.length ? Integer.parseInt(v1Parts[i]) : 0;
            int v2 = i < v2Parts.length ? Integer.parseInt(v2Parts[i]) : 0;

            if (v1 > v2) {
                System.out.println("downgraded");
                return;
            } else if (v1 < v2) {
                System.out.println("upgraded");
                return;
            }
        }
        
        System.out.println("not changed");
    }
}
