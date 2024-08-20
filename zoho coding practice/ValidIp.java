/*Given an IP address validate it based on the given conditions.*/

public class ValidIp{
    public static String validIPAddress(String queryIP) {
        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            return isValidIPv4(queryIP) ? "IPv4" : "Neither";
        } else if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
            return isValidIPv6(queryIP) ? "IPv6" : "Neither";
        }
        return "Neither";
    }

    private static boolean isValidIPv4(String ip) {
        String[] parts = ip.split("\\.", -1);
        if (parts.length != 4) {
            return false;
        }
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 3) {
                return false;
            }
            if (part.charAt(0) == '0' && part.length() > 1) {
                return false; // no leading zeros
            }
            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false;
                }
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }

    private static  boolean isValidIPv6(String ip) {
        String[] parts = ip.split(":", -1);
        if (parts.length != 8) {
            return false;
        }
        String hexdigits = "0123456789abcdefABCDEF";
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 4) {
                return false;
            }
            for (char ch : part.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validIPAddress("192.168.1.1")); // IPv4
        System.out.println(validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334")); // IPv6
        System.out.println(validIPAddress("256.256.256.256")); // Neither
        System.out.println(validIPAddress("2001:db8:85a3::8A2E:0370:7334")); // Neither
    }
}

