package com.jjanggu.section02.mapper_interface;

import com.jjanggu.dto.MenuDto;

import java.util.Scanner;

public class Application1_Insert {
    public static void main(String[] args) {

        // 등록 메뉴 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("메뉴명 입력: ");
        String name = sc.nextLine();
        System.out.println("가격: ");
        String price = sc.nextLine();
        System.out.println("주문가능여부: ");
        String orderable = sc.nextLine().toUpperCase();

        // 데이터 가공 및 DTO에 담기, 비즈니스로직호출 (controller)
        MenuDto menu = new MenuDto();
        menu.setMenuName(name);
        menu.setMenuPrice( Integer.parseInt(price) );
        menu.setOrderableStatus(orderable);

        int result = new MenuService().insertMenu(menu);
        if(result > 0){
            System.out.println("등록 성공");
        }else {
            System.out.println("등록 실패");
        }


    }
}
