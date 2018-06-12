/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BlackJack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hnori
 */
public class Dealer extends Human {
    ArrayList<Integer> cards = new ArrayList<>();
    
        Dealer() {
      
            for (int n = 1; n <= 4; n++){  //for文の中にfor文を書くことによって13枚のカードをcardsにaddする処理を４回繰り返すことができる
                for(int i = 1; i <= 13; i++ ){  //13枚のトランプをプリントしてcardsに入れる処理
                    
                    if(i >= 11){
                        cards.add(10);
                    }else{
                       cards.add(i);
                    }

                }
            }
        }
   public ArrayList<Integer> deal() {
    ArrayList<Integer> data1 = new ArrayList<>();//ArrayListにdata1のカード情報を入れる
                Random rand = new Random();
                Integer index = rand.nextInt(cards.size());//cardsを使いたい場合はcardsをメソッドの外に書く
                data1.add(cards.get(index));//ランダムの要素を二つ追加するための処理
                
                Integer index1 = rand.nextInt(cards.size());
                data1.add(cards.get(index1));
                        return data1;
                     
}
    public ArrayList<Integer> hit() {
        ArrayList<Integer> data2 = new ArrayList<>();
               Random rand = new Random();
               Integer index = rand.nextInt(cards.size());//cardsの全要素をランダムにしている
               
                    data2.add(cards.get(index));//cardsを入れないと要素番号が表示される。
                    return data2; 
}
//Humanで作ったメソッドを付け足す(Userのメソッドと似た感じ)
  public void setCard(ArrayList<Integer> a){//
                for(int i =0 ;  i < a.size(); i++)
                       myCards.add(a.get(i));
            }

            public int open(){
               int sum = 0;
                for(int i = 0;i< myCards.size(); i++){
                    sum+=myCards.get(i);
                }
                return sum;

            }
            //Userと別にするとBlarkJackの表示にて違う結果になる
            public boolean checkSum(){
                int sum = 0;
                for(int i = 0;i< myCards.size(); i++){
                    sum+=myCards.get(i);
                }
                    if (sum <= 12 ){//合計してから処理する
                        return true;
                    }
                    else{
                        return false;
                    }
            }
}
