package belajar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThoriQ
 */
class katedilebokne{
    private int nilai;
    
    public katedilebokne(int a){
        nilai=a;
    }
    public void tes(){
        System.out.println(nilai);
        tes2();
    }
    private void tes2(){
        System.out.println("iki ngetes " + nilai);
    }
//    nilaine knek dinggo kabeh method
}

public class belajar1 {
    public static void main(String[] args) {
        int value=100;
        katedilebokne ss=new katedilebokne(value);
        ss.tes();
    }
}
