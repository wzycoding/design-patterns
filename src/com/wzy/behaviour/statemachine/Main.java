package com.wzy.behaviour.statemachine;

import java.util.Scanner;

/**
 * @author wzy
 * @date 2020-08-18 0:20
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPlayer player = new VideoPlayer();
        int i = -1;
        while ((i = sc.nextInt()) != -1) {
            player.request(i);
        }
    }
}
