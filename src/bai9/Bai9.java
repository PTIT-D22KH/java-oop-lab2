/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai9;

/**
 *
 * @author P51
 */
/*
Bài toán quản lý các team dự thi ICPC Quốc gia khá đơn giản.

Mỗi trường đại học sẽ có tên viết tắt và tên đầy đủ (Tiếng Anh).

Từng trường sẽ lập danh sách các team tham gia kỳ thi ICPC Quốc gia.

Hãy giúp ban tổ chức sắp xếp các đội thi theo thứ tự tên trường, sau đó đến tên đội và tạo ID của team lần lượt theo thứ tự.

Input

File INSTITUTION.in ghi danh sách các trường:

Dòng đầu ghi số lượng trường
Mỗi trường ghi trên 1 dòng gồm tên viết tắt (dãy ký tự in hoa) sau đó đến 1 khoảng trống rồi đến tên trường.
File REGISTER.in ghi danh sách các đội đăng ký

Dòng đầu ghi số trường đăng ký
Với mỗi trường:
Dòng đầu ghi tên viết tắt của trường, một khoảng trống sau đó đến số N là số đội thi
Tiếp theo là N dòng ghi tên đội thi (tên đội có thể có khoảng trống)
Dữ liệu đảm bảo có không quá 80 đội tham gia.

Output

Ghi ra màn hình danh sách team đã sắp xếp theo tên trường (thứ tự từ điển), sau đó đến tên team (thứ tự từ điển).

Thông tin mỗi team sẽ viết trên 1 dòng gồm: IDTeam, Tên team, tên trường. Mỗi thông tin cách nhau 1 khoảng trống.

ID của team sẽ được gán là team+thứ tự trong danh sách đã sắp xếp theo quy tắc trên, tính từ 01.

Ví dụ

INSTITUTION.in

2

PSA People's Security Academy

NEU National Economics University

REGISTER.in

2

PSA 2

PSA_G63

PSA_HTK

NEU 2

NEU_ONE

NEU_TWO

Output

team01 NEU_ONE National Economics University

team02 NEU_TWO National Economics University

team03 PSA_G63 People's Security Academy

team04 PSA_HTK People's Security Academy
*/
import java.util.*;
import java.io.*;
public class Bai9 {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_handling/bai9/INSTITUTION.in"));
//        Scanner input2 = new Scanner(new File("src/file_handling/bai9/REGISTER.in"));
        Scanner input1 = new Scanner(new File("INSTITUTION.in"));
        Scanner input2 = new Scanner(new File("REGISTER.in"));
        
        int n = Integer.parseInt(input1.nextLine());
        ArrayList<Institution> institutions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            institutions.add(new Institution(input1.nextLine()));
        }
        int m = Integer.parseInt(input2.nextLine());
        int countTeams = 0;
        ArrayList<Team> teams = new ArrayList<>();
        for (int i = 0; i < m; i++)  {
            String s = input2.nextLine().trim();
            String a[] = s.split("\\s+");
            String instituteId = a[0];
            for (Institution x : institutions) {
                if (x.getId().equals(instituteId)) {
                    int p = Integer.parseInt(a[1]);
                    for (int j = 0; j < p; j++) {
                        String teamName = input2.nextLine();
                        
                        teams.add(new Team(teamName, x));
                        
                    }
                    break;
                }
            }
            
        }
        Collections.sort(teams);
        for (Team x : teams) {
            String teamId = String.format("team%02d", ++countTeams);
            System.out.println(teamId + " " + x);
        }
            
        
    }
}
