/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lasthit;

import java.util.Scanner;
public class LastHit {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int speed_vasya=in.nextInt();
		int speed_tower=in.nextInt();
		int damage_vasya=in.nextInt();
		int damage_tower=in.nextInt();
		int creep_hp=in.nextInt();
		int T=0;
		int T_v=T+speed_vasya;
		int T_t=T+speed_tower;
		int num=creep_hp/(damage_tower+damage_vasya);
		if(num==0){
			num=-1;}
		System.out.println(num);
		while(creep_hp>0){
			creep_hp=creep_hp-damage_tower;
			//System.out.print("after tower "+creep_hp+" ");
			if(creep_hp!=0){
				creep_hp=creep_hp-damage_vasya;
				//System.out.print("after vasya "+creep_hp+" ");
				System.out.print(T+" ");
				if(creep_hp!=0){
					T++;
					//System.out.print("increased T "+T+" ");
				}
				if(T_v==T && creep_hp!=0){
					int temp=creep_hp;
					creep_hp=creep_hp-damage_vasya;
					//System.out.print("try to damage "+creep_hp+" ");
					if(creep_hp<=damage_tower){
						creep_hp=temp;
						//System.out.print("return "+creep_hp+" ");
					}
					//T++;
					//System.out.print("increased T "+T+" ");
				}
				if(T_t==T && creep_hp!=0){
					creep_hp=creep_hp-damage_tower;
				//T++;
				}	
			}
			if(creep_hp!=0){
			T++;
			//System.out.print("Время"+T+" ");
			}
		}
		
	}

}
