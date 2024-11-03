/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author P51
 */
/*
Cổng lập trình trực tuyến của Học viện Công nghệ Bưu chính Viễn thông sẽ xếp hạng các sinh viên luyện tập lập trình để có cơ sở đánh giá kết quả môn học .

Mỗi sinh viên có họ tên, số bài làm đúng, tổng số lượt submit.

Hãy sắp xếp danh sách sinh viên theo tiêu chí sau:

Sinh viên có số bài làm đúng nhiều hơn được xếp trước, nếu có cùng số bài làm đúng thì ưu tiên sinh viên có số lượt submit ít hơn.
Sinh viên có cùng hạng, sắp xếp họ tên theo thứ tự từ điển.
Input - file văn bản LUYENTAP.in

Dòng đầu tiên trong file ghi số sinh viên (không quá 100).

Thông tin về mỗi sinh viên được ghi trong 2 dòng:

Dòng thứ nhất là họ tên của sinh viên đã được chuẩn hóa (độ dài không quá 100)
Dòng thứ hai ghi 2 số nguyên dương là số bài làm đúng và tổng số lượt submit (các số không quá 109)
Output

In ra danh sách sinh viên đã được sắp xếp, mỗi sinh viên ghi trên một dòng gồm 3 thông tin: họ tên, số bài làm đúng, tổng số lượt submit. 

Ví dụ

Input - file văn bản LUYENTAP.in



2
Nguyen Van Nam
168 600
Tran Thi Ngoc
168 600
Output:
Nguyen Van Nam 168 600
Tran Thi Ngoc 168 600
*/
import java.util.*;
import java.io.*;
public class Bai4 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_handling/bai4/LUYENTAP.in"));
        Scanner input = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(input.nextLine(), input.nextLine()));
        }
        Collections.sort(students);
        for(Student x : students) {
            System.out.println(x);
        }
    }
}
