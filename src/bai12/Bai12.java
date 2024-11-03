/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author P51
 */
/*
Học viện Hoàng gia tổ chức thi thời kỳ giãn cách theo các hình thức thi linh hoạt, phù hợp với từng môn học.

Thông tin về mỗi môn học gồm:

Mã môn: xâu ký tự không có khoảng trống, không quá 15 ký tự
Tên môn: xâu ký tự không có thể có  khoảng trống, không quá 100 ký tự
Hình thức thi: xâu ký tự không có thể có  khoảng trống, không quá 100 ký tự
Mỗi ca thi gồm các thông tin:

Mã ca thi: tự động tăng, tính từ C001
Ngày thi: đúng định dạng dd/mm/yyyy
Giờ thi: theo đúng định dạng hh:mm
Phòng thi: một dãy chữ số đại diện cho ID phòng online, không quá 12 chữ số
Lịch thi được xây dựng dựa trên mã môn và mã ca thi và mã nhóm lớp. Theo quy định, nhóm lớp đơn giản là các giá trị chữ số, bắt đầu từ 01 và không quá 99. Mỗi nhóm sẽ có số sinh viên tham gia ca thi đó.

Hãy nhập lịch thi và sắp xếp lại theo thứ tự thời gian. Nếu cùng giờ thì sắp theo mã ca thi (thứ tự từ điển).

Input – gồm 3 file văn bản.

MONTHI.in

Dòng đầu ghi số môn học. Mỗi môn ghi trên 3 dòng lần lượt là mã môn, tên môn, hình thức thi.

CATHI.in

Dòng đầu ghi số ca thi. Mỗi ca thi ghi trên 3 dòng gồm Ngày, Giờ và ID phòng thi.

LICHTHI.in

Dòng đầu ghi số lượng các dòng trong lịch thi.

Mỗi dòng tiếp theo ghi 4 thông tin: mã ca thi, mã môn, mã nhóm, số sinh viên. Mỗi thông tin cách nhau một khoảng trống.

Output

Ghi ra danh sách lịch thi đã sắp xếp theo yêu cầu, các thông tin cần liệt kê gồm:

Ngày thi
Giờ thi
ID Phòng thi
Tên môn
Nhóm
Số sinh viên
Các thông tin liệt kê cách nhau đúng một khoảng trống

Ví dụ

Input



MONTHI.in

2

MUL1320

Nhap mon da phuong tien

Bai tap lon + Van dap truc tuyen

BAS1203

Giai tich 1

Thi viet + Van dap truc tuyen


 

CATHI.in

2

09/01/2022
15:30
70172

09/01/2022
10:00
70279

LICHTHI.in

2

C001 MUL1320 01 46

C002 BAS1203 04 72
Output
 09/01/2022 10:00 70279 Giai tich 1 04 72

09/01/2022 15:30 70172 Nhap mon da phuong tien 01 46

*/
import java.util.*;
import java.io.*;
public class Bai12 {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_handling/bai12/MONTHI.in"));
//        Scanner input2 = new Scanner(new File("src/file_handling/bai12/CATHI.in"));
//        Scanner input3 = new Scanner(new File("src/file_handling/bai12/LICHTHI.in"));
        Scanner input1 = new Scanner(new File("MONTHI.in"));
        Scanner input2 = new Scanner(new File("CATHI.in"));
        Scanner input3 = new Scanner(new File("LICHTHI.in"));
        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            courses.add(new Course(input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Section> sections = new ArrayList<>();
        int countSections = 0;
        for (int i = 0; i < m; i++) {
            String id = String.format("C%03d", ++countSections);
            sections.add(new Section(id, input2.nextLine(), input2.nextLine(), input2.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        ArrayList<Schedule> schedules = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            String s = input3.nextLine().trim();
            String a[] = s.split("\\s+");
            String sectionId = a[0], courseId = a[1], groupId = a[2];
            int numStudents = Integer.parseInt(a[3]);
            Course course = null;
            Section section = null;
            for (Course x : courses) {
                if (x.getCourseId().equals(courseId)) {
                    course = x;
                    break;
                }
            }
            for (Section x : sections) {
                if (x.getId().equals(sectionId)) {
                    section = x;
                    break;
                }
            }
            schedules.add(new Schedule(section, course, groupId, numStudents));
            
        }
        Collections.sort(schedules);
        for (Schedule x : schedules) {
            System.out.println(x);
        }
        
    }
    
}
