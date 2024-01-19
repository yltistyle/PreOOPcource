package edu.penzgtu.oop.task12;

public class Entropy
{
    public static void main(String[] args) {
        String string = "TEST STRING test string";
        String entropy = calculateEntropy(string.toCharArray());
        System.out.printf("String: %s\nEntropy: %s ", string, entropy);
    }
    static String calculateEntropy(char[] chars) {
        double[][] hash = new double[256][1];
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            hash[chars[i]][0] += 1.D;
        }
        // E = (i=1)sum(i=n)*pi*log2(1/pi)
        double entropy = 0.D;
        for (double []asc : hash) {
            if (asc[0] > 0.000D) {
                double p = asc[0]/(length);
                entropy -= p*Math.log(p)/Math.log(2);
            }
        }
        return String.format("%.2f", entropy);
    }
}
