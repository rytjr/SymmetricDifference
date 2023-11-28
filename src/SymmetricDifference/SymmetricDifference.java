package SymmetricDifference;

import java.util.*;
import java.io.*;

/*첫째 줄에 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어진다. 
 * 둘째 줄에는 집합 A의 모든 원소가, 셋째 줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 각각 주어진다. 
 * 각 집합의 원소의 개수는 200,000을 넘지 않으며, 모든 원소의 값은 100,000,000을 넘지 않는다.*/

//해쉬 함수를 이용해 탐색알고리즘을 구현하고 겹치는 숫자를 확인 후 사이즈에서 뺴주었다.
public class SymmetricDifference {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		Set<Integer> hash = new HashSet<>();
		int[] arr = new int[n2];
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n1; i++) {
			hash.add(Integer.parseInt(st.nextToken()));
		}
		int count = 0;
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < n2; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n2; i++) {
			if(hash.contains(arr[i])) {
				count++;
			}
		}
		
		System.out.println(n1 + n2 - count * 2);
		
	}

}
