package src;

import java.util.Scanner;
public class QuanLy extends NguoiList{

    public static void main(String[] args){
    int n;
    Scanner sc = new Scanner(System.in);
    NguoiList Arraynguoi = new NguoiList();
    System.out.println("-------------------------------------------------");
    System.out.println("1.Delete Human");
    System.out.println("2.View Human");
    System.out.println("3.View Student");
    System.out.println("4.View Teacher");
    Arraynguoi.readflie(); 
    do{
        System.out.println("Choose Number");
        n = sc.nextInt();
    }while(n > 4);
    switch(n){
        case 1:
        System.out.println("Nhap ma can xoa");
        int d = sc.nextInt();
        Arraynguoi.xoanguoi(d);
        case 2:
        System.out.println(Arraynguoi.viewnguoi());
        break;
        case 3:
        System.out.println(Arraynguoi.viewhocsinh());
        break;
        case 4:
        System.out.println(Arraynguoi.viewgiaovien());
        break;
        case 5:
        break;
        
    }

}
}
