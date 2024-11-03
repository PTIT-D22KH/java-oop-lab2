/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai10;

/**
 *
 * @author P51
 */
/*
Để chuẩn bị cho đăng ký đồ án tốt nghiệp, khoa CNTT thu thập thông tin các sinh viên qua google form. Thông tin cần thu thập bao gồm: mã sinh viên, họ tên, lớp, email, số điện thoại. Sau khi xuất file excel thì số điện thoại bị mất số 0 ở đầu.

Hãy bổ sung số 0 vào số điện thoại, sau đó sắp xếp danh sách theo lớp (thứ tự từ điển). Nếu cùng lớp thì sắp xếp theo mã sinh viên (thứ tự từ điển).

Input – file DANHSACH.in

Không có số lượng sinh viên. Nhưng biết mỗi sinh viên ghi trên 5 dòng gồm:

Mã sinh viên
Họ tên
Lớp
Email
Số điện thoại (thiếu chữ số 0 ở đầu).
Output

Ghi ra danh sách đã sắp xếp, mỗi sinh viên ghi trên một dòng với lần lượt các thông tin: mã sinh viên, họ tên, lớp, email, số điện thoại. Mỗi thông tin cách nhau một khoảng trống.

Ví dụ

Input – DANHSACH.in

B21DCCN123

Tran Van Toan

D21CQCN01-B

toantv@gmail.com

987654321

B21DCCN111

Ly Van Binh

D21CQCN01-B

binhlv@gmail.com

978652142

B21DCAT661

Hoang Tam Anh

D21CQAT01-B

anhht@gmail.com

966554321

Output

B21DCAT661 Hoang Tam Anh D21CQAT01-B anhht@gmail.com 0966554321

B21DCCN111 Ly Van Binh D21CQCN01-B binhlv@gmail.com 0978652142

B21DCCN123 Tran Van Toan D21CQCN01-B toantv@gmail.com 0987654321
*/
import java.util.*;
import java.io.*;
public class Bai10 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_handling/bai10/DANHSACH.in"));
        Scanner input = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> students = new ArrayList<>();
        while (input.hasNextLine()) {
            students.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(students);
        for (Student x : students) {
            System.out.println(x);
        }
    }
}
