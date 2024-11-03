/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author P51
 */
/*
Trong lập trình cơ bản, một từ được hiểu là một dãy ký tự liên tiếp không chứa khoảng trống, dấu tab hoặc dấu xuống dòng.

Xây dựng lớp WordSet để quản lý tập hợp các từ khác nhau trong một xâu ký tự, sau khi đã chuyển hết về dạng chữ thường. Khi liệt kê thì tập từ thì sẽ luôn theo thứ tự từ điển tăng dần.

Viết chương trình nhập hai dòng ký tự từ file VANBAN.in và hiển thị hợp và giao của hai tập từ tương ứng.

Input - file VANBAN.in

Chỉ có 2 dòng, mỗi dòng có độ dài không quá 1000 ký tự.

Output

Dòng 1 ghi hợp của 2 tập từ theo thứ tự từ điển

Dòng 2 ghi giao của 2 tập từ theo thứ tự từ điển.

Ví dụ

VANBAN.in



Lap trinh huong doi tuong

Ngon ngu lap trinh C++
Output
c++ doi huong lap ngon ngu trinh tuong

lap trinh

 Chú ý: Viết code thoả mãn hàm main có sẵn

Giới hạn thời gian: 1s

Giới hạn bộ nhớ: 200000 Kb

Bài tập này yêu cầu sử dụng hàm main cho sẵn như sau:

Java
public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
*/
import java.util.*;
import java.io.*;
public class Bai2 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(new File("src/file_handling/bai2/VANBAN.in"));
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
