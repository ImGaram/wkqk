package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while
		int num=1;
		int sum=0;
		
		while(num<=10) {	//num���� 10���� �۰ų� ���� ����(���ǽ��� ���� ���� �ݺ� ����)
			sum+=num;	//�հ踦 ���ϴ� sum�� num�� ���ϰ�
			num++;	//num���� 1�� ���� ����
		}
		System.out.println("1���� 10������ ����"+sum+"�Դϴ�");
	}

}