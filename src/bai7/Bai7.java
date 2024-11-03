/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai7;

/**
 *
 * @author P51
 */
/*
Khoá D21 quyết định may đồng phục cho tất cả các thành viên. Ban tổ chức đã có sẵn danh sách sinh viên trong file văn bản SINHVIEN.in trong đó:

Dòng đầu ghi số sinh viên
Mỗi sinh viên sẽ ghi trên 6 dòng lần lượt là:
Mã sinh viên: dạng xâu ký tự, độ dài không quá 10
Họ tên: dạng xâu ký tự, độ dài không quá 50
Lớp: xâu ký tự, độ dài không quá 30
Email: độ dài không quá 50
Số điện thoại: độ dài không quá 10
Giới tính: xâu ký tự với chỉ một trong hai giá trị: “Nam” hoặc “Nu”
Ban tổ chức thu thập đăng ký của các thành viên vào file văn bản DANGKY.in, mỗi người chỉ cần nhập 2 thông tin ghi trên một dòng:

Mã sinh viên
Size áo: một trong các lựa chọn: S, M, L, XL và XXL
Sau khi đủ thông tin của tất cả thành viên, ban tổ chức lọc thông tin dưới dạng các truy vấn trong file văn bản TRUYVAN.in trong đó:

Dòng đầu tiên ghi số truy vấn
Mỗi truy vấn ghi trên một dòng gồm 2 thông tin: Giới tính và size áo, cách nhau một khoảng trống.
Yêu cầu: với mỗi truy vấn, hãy in ra màn hình danh sách các sinh viên có giới tính và size áo tương ứng, sắp xếp theo thứ tự từ điển của mã sinh viên. Danh sách gồm:

Dòng tiêu đề theo mẫu:

DANH SACH SINH VIEN {gioi tinh} DANG KY SIZE {size}

Sau đó là các thông tin được viết trên một dòng, mỗi thông tin cách nhau một khoảng trống.

Mã sinh viên
Họ tên
Lớp
Email
Số điện thoại
 

Test ví dụ

SINHVIEN.in

2

B21DCCN111

Hoang Van An

D21CQCN01-B

hoangvanan@gmail.com

0912999888

Nam

B21DCAT999

Tran Van Binh

D21CQAT01-B

chinh31503@gmail.com

838831503

Nam

DANGKY.in

B21DCCN111 L

B21DCAT999 XL

TRUYVAN.in

1

Nam L

Output

DANH SACH SINH VIEN NAM DANG KY SIZE L

B21DCCN111 Hoang Van An D21CQCN01-B hoangvanan@gmail.com 0912999888

 
*/
import java.util.*;
import java.io.*;
public class Bai7 {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_handling/bai7/SINHVIEN.in"));
//        Scanner input2 = new Scanner(new File("src/file_handling/bai7/DANGKY.in"));
//        Scanner input3 = new Scanner(new File("src/file_handling/bai7/TRUYVAN.in"));
        Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("DANGKY.in"));
        Scanner input3 = new Scanner(new File("TRUYVAN.in"));
        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }
        
        ArrayList<Registration> registrations = new ArrayList<>();
        while(input2.hasNextLine()) {
            String s = input2.nextLine();
            String a[] = s.trim().split("\\s+");
            String id = a[0];
            String size = a[1];
            for (Student x : students) {
                if (x.getId().equals(id)) {
                    registrations.add(new Registration(x, size));
                    break;
                }
            }
        }
        Collections.sort(registrations);
        int m = Integer.parseInt(input3.nextLine());
        while(m-- > 0) {
            String s = input3.nextLine().trim();
            String a[] = s.split("\\s+");
            String gender = a[0], size = a[1];
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", gender.toUpperCase(), size);
            for (Registration x : registrations) {
                if (x.getStudent().getGender().equals(gender) && x.getSize().equals(size)) {
                    System.out.println(x);
                }
            }
        }
    }
}
