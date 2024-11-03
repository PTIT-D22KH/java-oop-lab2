/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author P51
 */
/*
Viết chương trình liệt kê danh sách môn học và hình thức thi. 

Thông tin về mỗi môn học gồm:

Mã môn: xâu ký tự không có khoảng trống, không quá 15 ký tự
Tên môn: xâu ký tự không có thể có  khoảng trống, không quá 100 ký tự
Hình thức thi: xâu ký tự không có thể có  khoảng trống, không quá 100 ký tự
Hãy đọc thông tin môn học trong file văn bản MONHOC.in và in danh sách sắp xếp theo mã môn.

Input – file văn bản MONHOC.in

Mỗi môn ghi trên 3 dòng lần lượt là mã môn, tên môn, hình thức thi.

Không biết trước số môn học nên cần đọc đến hết file. 

Chú ý: mã môn học không được phép trùng nhau, nếu môn học nào đó bị lặp lại thì cần bỏ qua không đưa vào danh sách. 

Output

Ghi ra danh sách đã sắp xếp theo mã môn, thứ tự từ điển.

Ví dụ

Input



MUL1320

Nhap mon da phuong tien

Bai tap lon + Van dap truc tuyen

BAS1203

Giai tich 1

Thi viet + Van dap truc tuyen
Output
BAS1203 Giai tich 1 Thi viet + Van dap truc tuyen

MUL1320 Nhap mon da phuong tien Bai tap lon + Van dap truc tuyen

 
*/
import java.util.*;
import java.io.*;
public class Bai5 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_handling/bai5/MONHOC.in"));
        Scanner input = new Scanner(new File("MONHOC.in"));
        ArrayList<Course> courses = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();
        while (input.hasNextLine()) {
            String id = input.nextLine();
            String name = input.nextLine();
            String testType = input.nextLine();
            if (!mp.containsKey(id)) {
                mp.put(id, 1);
                courses.add(new Course(id, name, testType));
            }
            
        }
        Collections.sort(courses);
        for (Course x : courses) {
            System.out.println(x);
        }
    }
}
