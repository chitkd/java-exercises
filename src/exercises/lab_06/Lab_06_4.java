package exercises.lab_06;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_06_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a valid url! ");
        String url = scanner.nextLine();

        System.out.println("The protocol is: " + getProtocol(url));
        System.out.println("The domain is: " + getDomain(url));
    }

    private static String getProtocol(String url){
        String protocol = "";
        int endProtocol = url.indexOf("://");
        protocol = url.substring(0, endProtocol);
        return protocol;
    }

    private static String getDomain(String url){
        String domain = "";
        int startDomain = url.indexOf(".");
        domain = url.substring(startDomain);

        if (domain.contains("/")){
            int endDomain = domain.indexOf("/");
            domain = domain.substring(0, endDomain);
        }
        return domain;
    }
}
