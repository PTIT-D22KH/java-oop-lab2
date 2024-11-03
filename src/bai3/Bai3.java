/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author P51
 */
/*
Cho đồ thị vô hướng G=<V, E> được biểu diễn dưới dạng ma trận kề. Hãy viết chương trình thực hiện chuyển đổi biểu diễn đồ thị dưới dạng danh sách cạnh.

Yêu cầu: Khai báo và sử dụng lớp Pair kiểu Generic để ghép cặp hai số Integer (mô tả một cạnh). Nếu không có lớp Pair thì không được tính điểm.  

Input:

Dòng đầu tiên ghi số N là số đỉnh của đồ thị (không quá 1000)
N dòng tiếp theo đưa vào các phần tử của ma trận kề.
Output:

Đưa ra danh sách cạnh tương ứng theo khuôn dạng trong ví dụ dưới đây.
Ví dụ:

Input



6

0 1 1 0 1 0

1 0 1 0 1 0

1 1 0 1 0 0

0 0 1 0 1 1

1 1 0 1 0 1

0 0 0 1 1 0
Output
(1,2)

(1,3)

(1,5)

(2,3)

(2,5)

(3,4)

(4,5)

(4,6)

(5,6)
*/
import java.util.*;
import java.io.*;
public class Bai3 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }
        ArrayList<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i][j] == 1) {
                    pairs.add(new Pair(i + 1, j + 1));
                }
            }
        }
        for (Pair x: pairs) {
            System.out.println(x);
        }
    }
}
