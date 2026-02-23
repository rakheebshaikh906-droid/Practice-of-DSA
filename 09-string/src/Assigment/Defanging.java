package Assigment;
//https://leetcode.com/problems/defanging-an-ip-address/
//1108. Defanging an IP Address
public class Defanging {
    static void main(String[] args) {
        String  address = "1.1.1.1";
        System.out.println(defangingIp(address));
    }
    static String defangingIp(String address){
        address=address.replace(".","[.]");
        return address;
    }
}
