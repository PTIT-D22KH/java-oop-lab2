/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author P51
 */
/*
Cho danh sách N số nguyên dương, mỗi số không quá 500 chữ số.

Hãy thực hiện các phép toán sau:

Tim số nhỏ nhất và in ra màn hình
Tìm số lớn nhất và in ra màn hình
Tính tổng tất cả các số và in kết quả ra màn hình
Input – file văn bản DAYSO.in

Dòng đầu ghi số N (không quá 100).

N dòng tiếp theo, mỗi dòng ghi 1 số. Các số đều nguyên dương và không quá 500 chữ số.

Output – ghi ra màn hình

Dòng đầu ghi ra số nhỏ nhất.

Dòng thứ hai ghi ra số lớn nhất

Dòng thứ ba ghi ra tổng tất cả các số trong dãy

Ví dụ

Input



5

213

2435

653224

34326

6467
Output
213

653224

696665
*/
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Bai6 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_handling/bai6/DAYSO.in"));
        Scanner input = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<BigInteger> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++)  {
            a.add(new BigInteger(input.nextLine()));
        }
        BigInteger res = new BigInteger("0");
        for (BigInteger x : a) {
            BigInteger temp = res;
            res = temp.add(x);
        }
        System.out.println(Collections.min(a));
        System.out.println(Collections.max(a));
        System.out.println(res);
//        System.out.println(a.get(0).add(a.get(1)));
                
    }
}
