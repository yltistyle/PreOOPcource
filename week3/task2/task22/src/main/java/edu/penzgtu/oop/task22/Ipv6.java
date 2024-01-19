package edu.penzgtu.oop.task22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ipv6 {
    public static void main( String[] args ) {
        String ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
        System.out.printf("Valid?Z: %s\nBool: %s", ipv6, isValidIpv6(ipv6));
    }
    static boolean isValidIpv6(String ipv6) {
        Pattern pattern = Pattern.compile("^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Matcher match = pattern.matcher(ipv6);
        return match.matches();
    }
}
