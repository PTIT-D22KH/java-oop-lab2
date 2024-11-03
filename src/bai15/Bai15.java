/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai15;

/**
 *
 * @author P51
 */
/*
Cho một đoạn code với ngôn ngữ C++ được lưu trong file CODE.cpp.

Chúng ta đều đã biết kích thước tương ứng với kiểu dữ liệu int là 4 byte. Hãy tính xem có nhiêu byte đã được sử dụng trong các khai báo biến int của đoạn code đã cho.

Chú ý:

Cần tính cả các khai báo mảng hoặc ma trận nếu có.
Khai báo biến ở bất cứ đâu cũng cần được tính.
Đoạn code đảm bảo không sử dụng kiểu con trỏ hoặc các kiểu dữ liệu không cơ bản và cũng không sử dụng khai báo động.
Input – file CODE.cpp

Một file mã nguồn trong ngôn ngữ C++ (file văn bản)

Output

Số byte đã sử dụng

Ví dụ

Input – CODE.cpp

Output

#include <bits/stdc++.h>

using namespace std;

int main() {

  int n;

  cin >> n;

  int a = 10000000, b = 10000000;

  for (int i = 0; i < n; i++) {

        int x, y;

        cin >> x >> y;

        a = min(a, x);

        b = min(b, y);

  }

  cout << a * b << endl;

  return 0;

}

24

Giải thích: có 6 biến int là n, a, b, i, x, y

 
*/
import java.util.*;
import java.io.*;
public class Bai15 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("src/file_handling/bai15/CODE.cpp"));
//        Scanner input = new Scanner(new File("CODE.cpp"));
//        String s;
        long count = 0;
        while(input.hasNextLine()) {
            String s = input.nextLine().trim();
            String a[] = s.split("\\s+");
            boolean hasInt = false;
            int countEquals = 0;
            int countNormal = 0;
            ArrayList<Integer> temp = new ArrayList<>();
            for (String x : a) {
//                System.out.println(x);
                
                String tempString = "";
                boolean hasMatrix = false;
                for (int i = 0; i < x.length(); i++) {
                    if (x.charAt(i) == '[') {
                        tempString += String.valueOf(x.charAt(i + 1));
                        hasMatrix = true;
                    } else if (x.charAt(i) == ']') {
                        hasMatrix = false;
                        temp.add(Integer.parseInt(tempString));
                        tempString = "";
                    }
                    
                }
                if (x.equals("int")) {
                    hasInt = true;
                } else if (x.equals("=")) {
                    countEquals ++;
                } else {
                    countNormal++;
                }
            }
            if (hasInt) {
                if (countEquals == 0) {
                   count += countNormal;
                } else {
                    count += countEquals;
                }
            }
            if (temp.size() > 1) {
                long m = 1;
                for (int x  :  temp ) {
                    m *= x;
                }
                count += m * 4;
            } else if (temp.size() > 0){
                count += temp.get(0) * 4;
            }
//            System.out.println(count);
        }
        count--;
        
        System.out.println((count - 1) * 4);
        
    }
    
}
