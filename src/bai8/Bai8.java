/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author P51
 */
/*
Cửa hàng bán sản phẩm điện máy, công cụ cơ khí mô tả thông tin mỗi sản phẩm gồm các thông tin:

Mã sản phẩm
Tên sản phẩm
Giá bán (USD)
Thời hạn bảo hành (tính theo tháng).
Thông tin về khách hàng gồm:

Mã khách hàng (tự động tăng, tính từ KH01)
Họ tên khách hàng
Địa chỉ
Mã sản phẩm
Số lượng mua
Ngày mua (định dạng dd/mm/yyyy)
Hãy tính ngày hết hạn bảo hành và in kết quả danh sách ra màn hình.

Input – file MUAHANG.in

Dòng đầu ghi số sản phẩm.

Mỗi sản phẩm ghi trên 4 dòng lần lượt là mã, tên, giá bán, thời hạn.

Tiếp theo là một dòng ghi số khách hàng.

Mỗi khách hàng ghi trên 5 dòng lần lượt là: họ tên khách hàng, địa chỉ, mã sản phẩm, số lượng mua, ngày mua.

Output

Ghi ra danh sách mua hàng đã xác định ngày hết hạn bảo hành. Thông tin cần được sắp xếp theo ngày hết hạn bảo hành tăng dần (tức là sản phẩm nào hết hạn trước thì liệt kê trước). Nếu bằng nhau thì sắp xếp theo mã khách hàng (thứ tự từ điển).

Các thông tin cần liệt kê:

Mã khách hàng
Tên khách hàng
Địa chỉ
Mã sản phẩm
Tống số tiền cần thanh toán
Ngày hết hạn bảo hành (định dạng dd/mm/yyyy)
Ví dụ

Input – file MUAHANG.in



2

KC740

May khoan KC1

39

18

KC742

May cat KC2

46

12

2

Le Ngoc Long

Hoang Mai

KC740

11

21/05/2009

Nguyen Sao Mai

Hoan Kiem

KC742

17

06/02/2009
Output
KH02 Nguyen Sao Mai Hoan Kiem KC742 782 06/02/2010

KH01 Le Ngoc Long Hoang Mai KC740 429 21/11/2010

 
*/
import java.util.*;
import java.io.*;
public class Bai8 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_handling/bai8/MUAHANG.in"));
        Scanner input = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            products.add(new Product(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));
        }
        int m = Integer.parseInt(input.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        int cntCustomers = 0;
        for (int i = 0; i < m; i++) {
            String id = String.format("KH%02d", ++cntCustomers);
            String name = input.nextLine();
            String address = input.nextLine();
            String productId = input.nextLine();
            int numBuys = Integer.parseInt(input.nextLine());
            String buyDateString = input.nextLine();
            for (Product x : products) {
                if (x.getProductId().equals(productId)) {
                    customers.add(new Customer(id, name, address, x, numBuys, buyDateString));
                    break;
                }
            }
        }
        Collections.sort(customers);
        for (Customer x  : customers) {
            System.out.println(x);
        }
    }   
    
}
