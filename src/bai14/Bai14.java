/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai14;

/**
 *
 * @author P51
 */
/*
Biểu thức dưới dạng tiền tố là phép biểu diễn biểu thức trong đó phép toán được đặt trước hai toán hạng. Ví dụ + * A B / C D tương ứng với biểu thức trung tố A * B + C / D

Hãy viết chương trình tính toán giá trị của biểu thức tiền tố.

Input:

Dòng đầu tiên là số lượng bộ test T (T ≤ 20).

Mỗi test bắt đầu bởi số nguyên N (N ≤ 1000), là số lượng toán tử và toán hạng.

Dòng tiếp theo là biểu thức tiền tố với N toán tử và toán hạng. Các toán hạng và toán tử cách nhau bởi một dấu cách.

Các toán hạng có thể có nhiều chữ số, có thể là số âm. Phép chia thực hiện trên số nguyên. Input đảm bảo kết quả phép toán có giá trị tuyệt đối không vượt quá 10^18.

Output: 

Với mỗi test, in ra giá trị biểu thức tìm được.

Ví dụ:

Input:

Output

3

7

- + 2 * 3 1 9

7

- + 8 * 7 5 9

3

+ -10 -4

 

-4

34

-14
*/
import java.util.*;
import java.io.*;
public class Bai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            String a[] = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.next();
            }
            Stack<Long> st = new Stack<>();
            for (int i = n - 1; i >= 0; i--) {
                if (isOperator(a[i])) {
                    Long op1 = st.pop();
                    Long op2 = st.pop();
                    Long res;
                    if (a[i].equals("+")) {
                        res = op1 + op2;
                        
                    } else if (a[i].equals("-")) {
                        res = op1 - op2;
                    } else if (a[i].equals("*")) {
                        res = op1 * op2;
                    } else {
                        res = op1 / op2;
                    }
                    st.push(res);
                } else {
                    st.push(Long.parseLong(a[i]));
                }
            }
            System.out.println(st.peek());
            
            
        }
        
        
    }
    private static boolean  isOperator(String x) {
        return (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/"));
    }
}
