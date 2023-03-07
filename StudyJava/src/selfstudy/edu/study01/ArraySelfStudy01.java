package selfstudy.edu.study01;

public class ArraySelfStudy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[2][3]; // 다차원 배열의 경우 [] (대괄호) 두개 입력
		// 선언 시 배열원소를 모두 초기화하거나, int[몇행][몇열] 형태로 선언.
		
		// 모양은 밑의 형태
				//* * *
				//* * * ( * = 배열원소 );
		
		int n = 1;
		for(int i=0; i<=1; i++) { // 행의 값 시작
			for(int j=0; j<=2; j++) { // 열의 값 시작
				score[i][j] = n*2; // 배열 인덱스 별로 2의 배수 값 입력
				n++;
				System.out.print(score[i][j] + " "); // i행 j열의 배열원소 출력
			}
			System.out.println();
		}
		
		System.out.println(score[1][2]); // 1행 2열의 배열원소 출력
		
		
		int[][] score2 = new int[2][]; // 2행에 ?열을 가진 배열 선언
		score2[0] = new int[2]; // 인덱스 0, 첫번째 행에는 2개 열의 배열 선언
		score2[1] = new int[3]; // 인덱스 1, 두번째 행에는 3개 열의 배열 선언
		
		// 모양은 밑의 형태
		//* *
		//* * * ( * = 배열원소 );
		
		int[][] num = {{1,2},{3,4},{5,6}}; // == int[][] num = new int[3][2];
		// 직접 배열원소 초기화해서 선언.
		System.out.println(num[2][1]);
		// => Ex. num[0][1] 값은 2;
		// 다차원배열원소 갯수 = 행의 갯수, 다차원배열원소 내 원소갯수 = 열의 갯수
		// => 예제 기준으로는 {1,2}{3,4}{5,6} 다차원배열원소가 3개이므로 3행
		// => {1,2} 다차원배열원소 내 원소갯수는 2개이므로 2열이된다.
	}
}
