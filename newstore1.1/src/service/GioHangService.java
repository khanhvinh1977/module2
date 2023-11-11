package service;

import entity.GioHang;
import entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static service.ProductService.docProductListTuFile;

public class GioHangService {
    ProductService productService= new ProductService();
    Scanner scanner = new Scanner(System.in);
    static List<GioHang> danhsachGioHang = new ArrayList<>();
    public void addToGioHang() {
        productService.displayProductList();
        System.out.println("nhap id san pham muon mua");
        int nhapIdSanPhamMuonMua = scanner.nextInt();
        System.out.println("nhap so luong");
        int nhapSoLuong = scanner.nextInt();
        List<Product> products = docProductListTuFile();
        for (Product product: products) {
            if (product.getId() == nhapIdSanPhamMuonMua) {
                GioHang gioHang = new GioHang(product,nhapSoLuong*product.getPrice(),nhapSoLuong);
                danhsachGioHang.add(gioHang);
            }
        }
        int totalPrice = totalPrice();
        System.out.println("Tong tien: " + totalPrice);
    }
    public void displaySanPhamTrongGioHang() {
        for (GioHang gioHang: danhsachGioHang) {
            System.out.println(gioHang);
        }
    }
    public static int totalPrice() {
        int sum = 0;
        for (GioHang gioHang: danhsachGioHang) {
            sum += gioHang.getSubToTal();
        }
        return sum;
    }
}
