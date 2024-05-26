/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.SinhVien;

public class main {
    private static ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    public static void main(String[] args) {
//        SinhVien std1 = new SinhVien("He187512", "Truong Tran Cuong", "male", "SE");
//        SinhVien std2 = new SinhVien("He182978", "Nguyen Anh Trung", "male", "AI");
//        SinhVien std3 = new SinhVien("He197563","Truong Thi Linh", "female", "MKT");
//        SinhVien std4 = new SinhVien("He173241", "Nguyen Minh Huyen", "female", "KT");
//        ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();
//        listSinhVien.add(std1);
//        listSinhVien.add(std2);
//        listSinhVien.add(std3);
//        listSinhVien.add(std4);
//        for (int i = 0; i < listSinhVien.size(); i++) {
//            System.out.println(listSinhVien.get(i).toString());
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("================");
//        System.out.print("Nhap vao so thu cua hoc sinh muon xoa: ");
//        int n =sc.nextInt();
//        sc.nextLine();
//        listSinhVien.remove(n-1);
//        for (int i = 0; i < listSinhVien.size(); i++) {
//            System.out.println(listSinhVien.get(i).toString());
//        }
  
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap so sinh vien: ");
//        int n= sc.nextInt();    
//        sc.nextLine();
//        SinhVien[] std;
//        std = new SinhVien[n];
//        for (int i = 0; i < n; i++) {
//            std[i] = new SinhVien();
//            System.out.print("Nhap id: ");
//            std[i].setId(sc.nextLine());
//            System.out.print("Nhap ten: ");
//            std[i].setName(sc.nextLine());
//            System.out.print("Nhap gioi tinh:");
//            std[i].setGender(sc.nextLine());
//            System.out.print("Nhap ten nganh: ");
//            std[i].setMajor(sc.nextLine());
//            System.out.println("===========");
//        }
//        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            listSinhVien.add(std[i]);
//        }
//        for (int i = 0; i < listSinhVien.size(); i++) {
//            System.out.println(listSinhVien.get(i).toString());
//        }
//        System.out.println("================");
//        System.out.print("Nhap vao so thu cua hoc sinh muon xoa: ");
//        int m = sc.nextInt();
//        sc.nextLine();
//        listSinhVien.remove(m-1);
//        for (int i = 0; i < listSinhVien.size(); i++) {
//            System.out.println(listSinhVien.get(i).toString());
//        }
//        SinhVien myStd = new SinhVien();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        SinhVien[] std= new SinhVien[n];
//        nhapSinhVien(std, n);
//        for (int i = 0; i < n; i++) {
//            listSinhVien.add(std[i]);
//        }
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            menu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("nhập số lượng sinh viên muốn nhập: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    SinhVien[] std= new SinhVien[n];
                    nhapSinhVien(std, n);
                    for (int i = 0; i < n; i++) {
                        listSinhVien.add(std[i]);
                    }
                    System.out.println("=================================");
                    break;
                case 2:
                    Scanner sn = new Scanner(System.in);
                    System.out.print("nhập số thứ tự của sinh viên muốn xóa: ");
                    int m =sn.nextInt();
                    xoaSinhVien(m);
                    System.out.println("==================================");
                    break;
                case 3:
                    System.out.println("Thông tin của các sinh viên:");
                    inThongTinSinhVien();
                    System.out.println("==================================");
                    break;
                case 4:
                    System.out.print("Nhập mã số sinh viên cần sửa: ");
                    String id_Tim_kiem = scanner.nextLine();
                    suaThongTin(id_Tim_kiem);
                    System.out.println("==================================");
                    break;
                case 5:
                    System.out.println("In ra thông tin nam: ");
                    inRaSinhVienNam();
                    System.out.println("==================================");
                    break;
                case 6:
                    System.out.println("In ra thong tin nữ: ");
                    inRaSinhVienNu();
                    System.out.println("==================================");
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");                
            }
            
        }while (choice != 0);

    }
    public static void menu(){
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Xóa sinh viên");
        System.out.println("3. In thông tin sinh viên");
        System.out.println("4. Sửa thông tin sinh viên theo mã số sinh viên");
        System.out.println("5. In ra thông tin toàn bộ sinh viên nam");
        System.out.println("6. In ra thông tin toàn bộ sinh viên nữ");
        System.out.println("0. Thoát");
        System.out.print("Lựa chọn của bạn: ");
    }
    public static void nhapSinhVien(SinhVien[] std,int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            std[i] = new SinhVien();
            System.out.print("Nhap id: ");
            std[i].setId(sc.nextLine());
            System.out.print("Nhap ten: ");
            std[i].setName(sc.nextLine());
            System.out.print("Nhap gioi tinh:");
            std[i].setGender(sc.nextLine());
            System.out.print("Nhap ten nganh: ");
            std[i].setMajor(sc.nextLine());
            System.out.println("===========");
        }        
    }
    public static void xoaSinhVien(int m){
        int n=m-1;
        listSinhVien.remove(n);
       
    }
    public static void inThongTinSinhVien(){
        int n=listSinhVien.size();
        for (int i=0; i<n; i++) {
            System.out.println(listSinhVien.get(i).toString());
        }
    }
    public static void suaThongTin(String id_Tim_kiem){
        int n = listSinhVien.size();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            if (listSinhVien.get(i).getId().equals(id_Tim_kiem)) {
                System.out.print("Nhập tên mới: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giới tính mới: ");
                String gender = scanner.nextLine();
                System.out.print("Nhập chuyên ngành mới: ");
                String major = scanner.nextLine();
                listSinhVien.get(i).setName(name);
                listSinhVien.get(i).setGender(gender);
                listSinhVien.get(i).setMajor(major);
                System.out.println("Sửa thông tin sinh viên thành công!");
                break;
            }
        }
        
    }
    public static void inRaSinhVienNam(){
        int n = listSinhVien.size();
        for (int i = 0; i < n; i++) {
            if (listSinhVien.get(i).getGender().equals("nam")) {
                System.out.println(listSinhVien.get(i)); 
            }   
        }
    }
    public static void inRaSinhVienNu(){
        int n = listSinhVien.size();
        for (int i = 0; i < n; i++) {
            if (listSinhVien.get(i).getGender().equals("nu")) {
                System.out.println(listSinhVien.get(i)); 
            }   
        }
    }
    
}
