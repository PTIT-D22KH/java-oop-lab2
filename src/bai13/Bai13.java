/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai13;

/**
 *
 * @author P51
 */
/*
Học kỳ 2 năm thứ 3, sinh viên ngành CNTT của Học viện Hoàng gia sẽ có môn thực tập cơ sở. Để tổ chức môn học này, mỗi giảng viên sẽ đăng ký một danh sách các đề tài ứng dụng thực tế, sau đó sinh viên sẽ lựa chọn đề tài trong danh sách này và hoàn thành trong thời gian 2 tháng. Hội đồng báo cáo thực tập sẽ được gán cho từng đề tài, khi báo cáo tất cả giảng viên và sinh viên của cùng một hội đồng sẽ báo cáo chung trong một thời gian xác định trước và có thể cho ý kiến đánh giá lẫn nhau giúp cho báo cáo thực tập của sinh viên hoàn thiện hơn.

Cho danh sách sinh viên, danh sách đề tài và ghép sinh viên, đề tài với thứ tự hội đồng. Hãy lập danh sách từng hội đồng báo cáo thực tập cơ sở sắp xếp theo mã sinh viên.

Input – 3 file văn bản

Thông tin sinh viên cho trong file SINHVIEN.in trong đó:

Dòng đầu ghi số sinh viên.
Mỗi sinh viên ghi trên 4 dòng lần lượt là mã SV, họ tên, số ĐT, email.
(tương tự bài tập trước)

Thông tin đề tài cho trong file DETAI.in trong đó:

Dòng đầu ghi số đề tài (đảm bảo lớn hơn hoặc bằng số sinh viên)
Mỗi đề tài ghi trên 2 dòng:
Tên giảng viên: đã chuẩn hóa, độ dài không quá 50
Tên đề tài: dãy ký tự độ dài không quá 200.
Các đề tài sẽ được gán mã tự động tăng theo thứ tự nhập, tính từ DT001
Thông tin về việc giao nhiệm vụ thực tập cơ sở cho sinh viên được cho trong file HOIDONG.in trong đó:

Dòng đầu ghi số sinh viên (đảm bảo bằng số sinh viên trong SINHVIEN.in)
Mỗi dòng ghi ba giá trị: mã sinh viên, mã đề tài và mã hội đồng cách nhau một khoảng trống (giá trị mã hội đồng chỉ đơn giản là HD1 đến HD8 tương ứng với HOI DONG 1 đến HOI DONG 8).
 

Output

Ghi danh sách từng hội đồng từ 1 đến 8 đã được sắp xếp theo tên mã sinh viên (thứ tự từ điển), mỗi dòng có các thông tin:

Mã sinh viên
Họ tên sinh viên
Tên đề tài
Giảng viên hướng dẫn
Ví dụ

Input – 3 file văn bản

SINHVIEN.in

2

B19DCCN999

Ngo Quang Huy

0976544443

B19DCCN999@stu.ptit.edu.vn

B17DCCN997

Nguyen Manh Cuong

0987654321

B19DCCN997@stu.ptit.edu.vn

 

DETAI.in

3

Nguyen Hoai Nam

Xay dung website tim kiem nha thong minh

Tran Thanh Cong

Xay dung he thong diem danh bang nhan dang van tay

Le Thi My Uyen

Xay dung website cap nhat tin tuc

 

HOIDONG.in

2

B19DCCN997 DT001 HD2

B19DCCN999 DT002 HD1

Output

DANH SACH HOI DONG 1:

B19DCCN999 Ngo Quang Huy Xay dung he thong diem danh bang nhan dang van tay Tran Thanh Cong

DANH SACH HOI DONG 2:

B19DCCN997 Nguyen Manh Cuong Xay dung website tim kiem nha thong minh Nguyen Hoai Nam

 

 
*/
import java.util.*;
import java.io.*;
public class Bai13 {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_handling/bai13/SINHVIEN.in"));
//        Scanner input2 = new Scanner(new File("src/file_handling/bai13/DETAI.in"));
//        Scanner input3 = new Scanner(new File("src/file_handling/bai13/HOIDONG.in"));
        Scanner input1 = new Scanner(new File("SINHVIEN.in"));
        Scanner input2 = new Scanner(new File("DETAI.in"));
        Scanner input3 = new Scanner(new File("HOIDONG.in"));
        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(input1.nextLine(),input1.nextLine(),input1.nextLine(),input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        int countTopics = 0;
        ArrayList<Topic> topics = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            topics.add(new Topic(String.format("DT%03d", ++countTopics), input2.nextLine(),input2.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        int countCommitees = 0;
        ArrayList<String> commiteesIds = new ArrayList<>();
        ArrayList<Commitee> commitees = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            String s = input3.nextLine().trim();
            String a[] = s.split("\\s+");
            String studentId = a[0];
            String topicId = a[1];
            String commiteeId = a[2];
//            System.out.println("studentId:" + studentId);
            Student student = null;
            Topic topic = null;
            for (Student x : students) {
//                System.out.println("x - studentId:" + x.getStudentId());
                if (x.getStudentId().equals(studentId)) {
                    student = x;
                    break;
                }
            }
            for (Topic x : topics) {
                if (x.getTopicId().equals(topicId)) {
                    topic = x;
                    break;
                }
            }
            commiteesIds.add(String.valueOf(commiteeId.charAt(2)));
            commitees.add(new Commitee(student, topic, commiteeId));
        }
//        for (Student x : students) {
//            System.out.println(x);
//        }
//        for (Commitee x : commitees) {
//            System.out.println(x);
//        }
        Collections.sort(commitees);
        TreeSet<String> ts = new TreeSet<>(commiteesIds);
        for (String id : ts) {
            System.out.printf("DANH SACH HOI DONG %s:\n", id);
            for (Commitee x : commitees) {
                String a = String.valueOf(x.getCommiteeId().charAt(2));
                if (a.equals(id)) {
                    System.out.println(x);
                }
            }
        }
        
                
    }
}
