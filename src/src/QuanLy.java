package src;

import java.util.Scanner;
public class QuanLy extends NguoiList{
    Scanner sc = new Scanner(System.in);
    NguoiList Arraynguoi = new NguoiList();
    public void start(){
    Arraynguoi.readflie(); 
    System.out.println("-------------------------------------------------");
    System.out.println("1.Delete Human");
    System.out.println("2.View Human");
    System.out.println("3.View Student");
    System.out.println("4.View Teacher");
    System.out.println("5.Add Human");
    
    int n;
    Scanner sc = new Scanner(System.in);
    NguoiList Arraynguoi = new NguoiList();
    do{
        System.out.println("Choose Number");
        n = sc.nextInt();
    }while(n > 4);
    switch(n){
        case 1: deleted();
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
        case 6:
        break;
        
    }
    }
    public void deleted(){
     System.out.println("Nhap ma can xoa");
        int d = sc.nextInt();
        Arraynguoi.xoanguoi(d); 
}
    public static void main(String[] args){
        QuanLy quanLy = new QuanLy();
        quanLy.run();
}
